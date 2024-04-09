package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStatus;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 机器状态表
 * </p>
 * "viz_mc_machine_status"
 * @author 18374
 */
public class VizMcMachineStatusQueryEntityWrapper extends QueryWrapper<VizMcMachineStatus> {

    public static VizMcMachineStatusQueryEntityWrapper wrapper(VizMcMachineStatus entity) {
        return new VizMcMachineStatusQueryEntityWrapper(entity);
    }

    private VizMcMachineStatus entity;

    public VizMcMachineStatusQueryEntityWrapper(VizMcMachineStatus entity) {
         this.entity=entity;
    }


    protected VizMcMachineStatus entity() {
        if(entity==null){
            throw new NullPointerException("VizMcMachineStatus is null");
        }
        return entity;
    }

    @Override
    public VizMcMachineStatusQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public VizMcMachineStatusQueryEntityWrapper selectColumns(Consumer<VizMcMachineStatusSelect> consumer) {
        VizMcMachineStatusSelect select = new VizMcMachineStatusSelect();
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
    public VizMcMachineStatusQueryEntityWrapper idEq(){
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
    public VizMcMachineStatusQueryEntityWrapper idNe(){
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
    public VizMcMachineStatusQueryEntityWrapper idGt(){
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
    public VizMcMachineStatusQueryEntityWrapper idGe(){
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
    public VizMcMachineStatusQueryEntityWrapper idLt(){
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
    public VizMcMachineStatusQueryEntityWrapper idLe(){
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
    public VizMcMachineStatusQueryEntityWrapper idBetween(Long idEnd){
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
    public VizMcMachineStatusQueryEntityWrapper idNotBetween(Long idEnd){
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
    public VizMcMachineStatusQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcMachineStatusQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public VizMcMachineStatusQueryEntityWrapper idLike(){
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
    public VizMcMachineStatusQueryEntityWrapper idNotLike(){
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
    public VizMcMachineStatusQueryEntityWrapper idLikeLeft(){
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
    public VizMcMachineStatusQueryEntityWrapper idLikeRight(){
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
    public VizMcMachineStatusQueryEntityWrapper idEq(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idNe(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idGt(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idGe(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idLt(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idLe(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idLike(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idNotLike(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idLikeLeft(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idLikeRight(Long id){
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
    public VizMcMachineStatusQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper idIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryEntityWrapper idIn(Long... values){
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
    public VizMcMachineStatusQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>机器基础信息表记录id</p>
     * 等于 = entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdEq(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdNe(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdGt(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdGe(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLt(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLe(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLike(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdNotLike(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLikeLeft(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLikeRight(){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryEntityWrapper fkMcMachineIdNotIn(Long... values){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdEq(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdNe(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdGt(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdGe(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLt(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLe(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLike(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdNotLike(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLikeLeft(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLikeRight(){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdIn(String... values){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineStatusQueryEntityWrapper deviceIdNotIn(String... values){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdEq(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdNe(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdGt(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdGe(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLt(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLe(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdBetween(String instanceIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdNotBetween(String instanceIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLike(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdNotLike(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLikeLeft(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLikeRight(){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdEq(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdNe(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdGt(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdGe(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLt(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLe(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLike(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdNotLike(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLikeLeft(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper instanceIdIn(Collection<String> value){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdIn(String... values){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcMachineStatusQueryEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 = entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusEq(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt; entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusNe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt; entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusGt(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;= entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusGe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt; entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLt(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;= entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN  entity().getRunningStatus() AND runningStatusEnd
     * @param runningStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusBetween(Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            between("running_status",runningStatus,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusNotBetween(Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatus,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusBetween(Integer runningStatusStart,Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            between("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusNotBetween(Integer runningStatusStart,Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%'  entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLike(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%'  entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusNotLike(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值'  entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLikeLeft(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%'  entity().getRunningStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLikeRight(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            likeRight("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 =
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusEq(Integer runningStatus){
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt;
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusNe(Integer runningStatus){
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt;
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusGt(Integer runningStatus){
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;=
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusGe(Integer runningStatus){
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt;
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLt(Integer runningStatus){
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;=
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLe(Integer runningStatus){
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLike(Integer runningStatus){
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusNotLike(Integer runningStatus){
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值'
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLikeLeft(Integer runningStatus){
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%'
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusLikeRight(Integer runningStatus){
        if(runningStatus!=null){
            likeRight("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusIsNull(){
        isNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusIsNotNull(){
        isNotNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("running_status",value);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("running_status",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("running_status",value);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper runningStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("running_status",values);
        }
        return this;
    }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 等于 = entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusEq(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            eq("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 不等于 &lt;&gt; entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusNe(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            ne("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于 &gt; entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusGt(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            gt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于等于 &gt;= entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusGe(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            ge("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于 &lt; entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLt(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            lt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于等于 &lt;= entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLe(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            le("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * BETWEEN  entity().getHealthStatus() AND healthStatusEnd
     * @param healthStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusBetween(Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            between("health_status",healthStatus,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusNotBetween(Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            notBetween("health_status",healthStatus,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusBetween(Integer healthStatusStart,Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            between("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusNotBetween(Integer healthStatusStart,Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            notBetween("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值%'  entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLike(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            like("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT LIKE '%值%'  entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusNotLike(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            notLike("health_status",healthStatus);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值'  entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLikeLeft(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            likeLeft("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '值%'  entity().getHealthStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLikeRight(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            likeRight("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 等于 =
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusEq(Integer healthStatus){
        if(healthStatus!=null){
            eq("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 不等于 &lt;&gt;
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusNe(Integer healthStatus){
        if(healthStatus!=null){
            ne("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于 &gt;
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusGt(Integer healthStatus){
        if(healthStatus!=null){
            gt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于等于 &gt;=
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusGe(Integer healthStatus){
        if(healthStatus!=null){
            ge("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于 &lt;
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLt(Integer healthStatus){
        if(healthStatus!=null){
            lt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于等于 &lt;=
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLe(Integer healthStatus){
        if(healthStatus!=null){
            le("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值%'
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLike(Integer healthStatus){
        if(healthStatus!=null){
            like("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT LIKE '%值%'
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusNotLike(Integer healthStatus){
        if(healthStatus!=null){
            notLike("health_status",healthStatus);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值'
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLikeLeft(Integer healthStatus){
        if(healthStatus!=null){
            likeLeft("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '值%'
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusLikeRight(Integer healthStatus){
        if(healthStatus!=null){
            likeRight("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusIsNull(){
        isNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusIsNotNull(){
        isNotNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("health_status",value);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("health_status",values);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("health_status",value);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper healthStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("health_status",values);
        }
        return this;
    }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 等于 = entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusEq(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            eq("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 不等于 &lt;&gt; entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusNe(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            ne("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于 &gt; entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusGt(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            gt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于等于 &gt;= entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusGe(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            ge("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于 &lt; entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLt(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            lt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于等于 &lt;= entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLe(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            le("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * BETWEEN  entity().getStreamingStatus() AND streamingStatusEnd
     * @param streamingStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusBetween(Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            between("streaming_status",streamingStatus,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusNotBetween(Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            notBetween("streaming_status",streamingStatus,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            between("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusNotBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            notBetween("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值%'  entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLike(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            like("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT LIKE '%值%'  entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusNotLike(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            notLike("streaming_status",streamingStatus);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值'  entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLikeLeft(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            likeLeft("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '值%'  entity().getStreamingStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLikeRight(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            likeRight("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 等于 =
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusEq(Integer streamingStatus){
        if(streamingStatus!=null){
            eq("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 不等于 &lt;&gt;
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusNe(Integer streamingStatus){
        if(streamingStatus!=null){
            ne("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于 &gt;
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusGt(Integer streamingStatus){
        if(streamingStatus!=null){
            gt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于等于 &gt;=
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusGe(Integer streamingStatus){
        if(streamingStatus!=null){
            ge("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于 &lt;
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLt(Integer streamingStatus){
        if(streamingStatus!=null){
            lt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于等于 &lt;=
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLe(Integer streamingStatus){
        if(streamingStatus!=null){
            le("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值%'
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLike(Integer streamingStatus){
        if(streamingStatus!=null){
            like("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT LIKE '%值%'
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusNotLike(Integer streamingStatus){
        if(streamingStatus!=null){
            notLike("streaming_status",streamingStatus);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值'
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLikeLeft(Integer streamingStatus){
        if(streamingStatus!=null){
            likeLeft("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '值%'
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusLikeRight(Integer streamingStatus){
        if(streamingStatus!=null){
            likeRight("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusIsNull(){
        isNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusIsNotNull(){
        isNotNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("streaming_status",value);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("streaming_status",values);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("streaming_status",value);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper streamingStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("streaming_status",values);
        }
        return this;
    }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 等于 = entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusEq(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            eq("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 不等于 &lt;&gt; entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusNe(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            ne("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于 &gt; entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusGt(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            gt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于等于 &gt;= entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusGe(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            ge("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于 &lt; entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLt(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            lt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于等于 &lt;= entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLe(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            le("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * BETWEEN  entity().getMaintStatus() AND maintStatusEnd
     * @param maintStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusBetween(Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            between("maint_status",maintStatus,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusNotBetween(Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            notBetween("maint_status",maintStatus,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusBetween(Integer maintStatusStart,Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            between("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusNotBetween(Integer maintStatusStart,Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            notBetween("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值%'  entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLike(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            like("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT LIKE '%值%'  entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusNotLike(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            notLike("maint_status",maintStatus);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值'  entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLikeLeft(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            likeLeft("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '值%'  entity().getMaintStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLikeRight(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            likeRight("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 等于 =
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusEq(Integer maintStatus){
        if(maintStatus!=null){
            eq("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 不等于 &lt;&gt;
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusNe(Integer maintStatus){
        if(maintStatus!=null){
            ne("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于 &gt;
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusGt(Integer maintStatus){
        if(maintStatus!=null){
            gt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于等于 &gt;=
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusGe(Integer maintStatus){
        if(maintStatus!=null){
            ge("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于 &lt;
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLt(Integer maintStatus){
        if(maintStatus!=null){
            lt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于等于 &lt;=
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLe(Integer maintStatus){
        if(maintStatus!=null){
            le("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值%'
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLike(Integer maintStatus){
        if(maintStatus!=null){
            like("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT LIKE '%值%'
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusNotLike(Integer maintStatus){
        if(maintStatus!=null){
            notLike("maint_status",maintStatus);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值'
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLikeLeft(Integer maintStatus){
        if(maintStatus!=null){
            likeLeft("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '值%'
     * @param maintStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusLikeRight(Integer maintStatus){
        if(maintStatus!=null){
            likeRight("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusIsNull(){
        isNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusIsNotNull(){
        isNotNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("maint_status",value);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("maint_status",values);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("maint_status",value);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper maintStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("maint_status",values);
        }
        return this;
    }


    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 等于 = entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingEq(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            eq("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 不等于 &lt;&gt; entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingNe(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            ne("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 大于 &gt; entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingGt(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            gt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 大于等于 &gt;= entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingGe(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            ge("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 小于 &lt; entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLt(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            lt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 小于等于 &lt;= entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLe(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            le("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * BETWEEN  entity().getIsReseting() AND isResetingEnd
     * @param isResetingEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingBetween(Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            between("is_reseting",isReseting,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingNotBetween(Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            notBetween("is_reseting",isReseting,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingBetween(Integer isResetingStart,Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            between("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingNotBetween(Integer isResetingStart,Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            notBetween("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * LIKE '%值%'  entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLike(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            like("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT LIKE '%值%'  entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingNotLike(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            notLike("is_reseting",isReseting);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * LIKE '%值'  entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLikeLeft(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            likeLeft("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * LIKE '值%'  entity().getIsReseting()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLikeRight(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            likeRight("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 等于 =
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingEq(Integer isReseting){
        if(isReseting!=null){
            eq("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 不等于 &lt;&gt;
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingNe(Integer isReseting){
        if(isReseting!=null){
            ne("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 大于 &gt;
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingGt(Integer isReseting){
        if(isReseting!=null){
            gt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 大于等于 &gt;=
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingGe(Integer isReseting){
        if(isReseting!=null){
            ge("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 小于 &lt;
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLt(Integer isReseting){
        if(isReseting!=null){
            lt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 小于等于 &lt;=
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLe(Integer isReseting){
        if(isReseting!=null){
            le("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * LIKE '%值%'
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLike(Integer isReseting){
        if(isReseting!=null){
            like("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT LIKE '%值%'
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingNotLike(Integer isReseting){
        if(isReseting!=null){
            notLike("is_reseting",isReseting);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * LIKE '%值'
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLikeLeft(Integer isReseting){
        if(isReseting!=null){
            likeLeft("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * LIKE '值%'
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingLikeRight(Integer isReseting){
        if(isReseting!=null){
            likeRight("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingIsNull(){
        isNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingIsNotNull(){
        isNotNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_reseting",value);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_reseting",values);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_reseting",value);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isResetingNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_reseting",values);
        }
        return this;
    }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 等于 = entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveEq(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            eq("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 不等于 &lt;&gt; entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveNe(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            ne("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于 &gt; entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveGt(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            gt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于等于 &gt;= entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveGe(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            ge("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于 &lt; entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLt(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            lt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于等于 &lt;= entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLe(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            le("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * BETWEEN  entity().getIsUserSave() AND isUserSaveEnd
     * @param isUserSaveEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveBetween(Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            between("is_user_save",isUserSave,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveNotBetween(Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            notBetween("is_user_save",isUserSave,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            between("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveNotBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            notBetween("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值%'  entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLike(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            like("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT LIKE '%值%'  entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveNotLike(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            notLike("is_user_save",isUserSave);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值'  entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLikeLeft(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            likeLeft("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '值%'  entity().getIsUserSave()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLikeRight(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            likeRight("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 等于 =
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveEq(Integer isUserSave){
        if(isUserSave!=null){
            eq("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 不等于 &lt;&gt;
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveNe(Integer isUserSave){
        if(isUserSave!=null){
            ne("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于 &gt;
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveGt(Integer isUserSave){
        if(isUserSave!=null){
            gt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于等于 &gt;=
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveGe(Integer isUserSave){
        if(isUserSave!=null){
            ge("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于 &lt;
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLt(Integer isUserSave){
        if(isUserSave!=null){
            lt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于等于 &lt;=
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLe(Integer isUserSave){
        if(isUserSave!=null){
            le("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值%'
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLike(Integer isUserSave){
        if(isUserSave!=null){
            like("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT LIKE '%值%'
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveNotLike(Integer isUserSave){
        if(isUserSave!=null){
            notLike("is_user_save",isUserSave);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值'
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLikeLeft(Integer isUserSave){
        if(isUserSave!=null){
            likeLeft("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '值%'
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveLikeRight(Integer isUserSave){
        if(isUserSave!=null){
            likeRight("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveIsNull(){
        isNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveIsNotNull(){
        isNotNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_user_save",value);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_user_save",values);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_user_save",value);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isUserSaveNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_user_save",values);
        }
        return this;
    }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 等于 = entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeEq(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            eq("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 不等于 &lt;&gt; entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeNe(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            ne("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于 &gt; entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeGt(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            gt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于等于 &gt;= entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeGe(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            ge("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于 &lt; entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLt(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            lt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于等于 &lt;= entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLe(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            le("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * BETWEEN  entity().getIsOtaUpgrade() AND isOtaUpgradeEnd
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeBetween(Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            between("is_ota_upgrade",isOtaUpgrade,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeNotBetween(Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            notBetween("is_ota_upgrade",isOtaUpgrade,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            between("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeNotBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            notBetween("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值%'  entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLike(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            like("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT LIKE '%值%'  entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeNotLike(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            notLike("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值'  entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLikeLeft(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            likeLeft("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '值%'  entity().getIsOtaUpgrade()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLikeRight(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            likeRight("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 等于 =
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeEq(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            eq("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 不等于 &lt;&gt;
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeNe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            ne("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于 &gt;
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeGt(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            gt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于等于 &gt;=
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeGe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            ge("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于 &lt;
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLt(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            lt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于等于 &lt;=
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            le("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLike(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            like("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT LIKE '%值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeNotLike(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            notLike("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值'
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLikeLeft(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            likeLeft("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeLikeRight(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            likeRight("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeIsNull(){
        isNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeIsNotNull(){
        isNotNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_ota_upgrade",value);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_ota_upgrade",values);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_ota_upgrade",value);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper isOtaUpgradeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_ota_upgrade",values);
        }
        return this;
    }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 等于 = entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusEq(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            eq("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 不等于 &lt;&gt; entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusNe(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            ne("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于 &gt; entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusGt(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            gt("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于等于 &gt;= entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusGe(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            ge("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于 &lt; entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLt(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            lt("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于等于 &lt;= entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLe(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            le("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * BETWEEN  entity().getHangUpStatus() AND hangUpStatusEnd
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusBetween(Integer hangUpStatusEnd){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null && hangUpStatusEnd!=null){
            between("hang_up_status",hangUpStatus,hangUpStatusEnd);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT BETWEEN  entity().getHangUpStatus() AND 值2
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusNotBetween(Integer hangUpStatusEnd){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null && hangUpStatusEnd!=null){
            notBetween("hang_up_status",hangUpStatus,hangUpStatusEnd);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * BETWEEN  entity().getHangUpStatus() AND 值2
     * @param hangUpStatusStart       值1
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null && hangUpStatusEnd!=null){
            between("hang_up_status",hangUpStatusStart,hangUpStatusEnd);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT BETWEEN  entity().getHangUpStatus() AND 值2
     * @param hangUpStatusStart       值1
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusNotBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null && hangUpStatusEnd!=null){
            notBetween("hang_up_status",hangUpStatusStart,hangUpStatusEnd);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值%'  entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLike(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            like("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT LIKE '%值%'  entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusNotLike(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            notLike("hang_up_status",hangUpStatus);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值'  entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLikeLeft(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            likeLeft("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '值%'  entity().getHangUpStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLikeRight(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            likeRight("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 等于 =
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusEq(Integer hangUpStatus){
        if(hangUpStatus!=null){
            eq("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 不等于 &lt;&gt;
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusNe(Integer hangUpStatus){
        if(hangUpStatus!=null){
            ne("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于 &gt;
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusGt(Integer hangUpStatus){
        if(hangUpStatus!=null){
            gt("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于等于 &gt;=
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusGe(Integer hangUpStatus){
        if(hangUpStatus!=null){
            ge("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于 &lt;
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLt(Integer hangUpStatus){
        if(hangUpStatus!=null){
            lt("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于等于 &lt;=
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLe(Integer hangUpStatus){
        if(hangUpStatus!=null){
            le("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值%'
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLike(Integer hangUpStatus){
        if(hangUpStatus!=null){
            like("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT LIKE '%值%'
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusNotLike(Integer hangUpStatus){
        if(hangUpStatus!=null){
            notLike("hang_up_status",hangUpStatus);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值'
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLikeLeft(Integer hangUpStatus){
        if(hangUpStatus!=null){
            likeLeft("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '值%'
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusLikeRight(Integer hangUpStatus){
        if(hangUpStatus!=null){
            likeRight("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusIsNull(){
        isNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusIsNotNull(){
        isNotNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("hang_up_status",value);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("hang_up_status",values);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("hang_up_status",value);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper hangUpStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("hang_up_status",values);
        }
        return this;
    }


    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 等于 = entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusEq(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            eq("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 不等于 &lt;&gt; entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusNe(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            ne("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 大于 &gt; entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusGt(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            gt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 大于等于 &gt;= entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusGe(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            ge("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 小于 &lt; entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLt(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            lt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 小于等于 &lt;= entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLe(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            le("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * BETWEEN  entity().getRestartStatus() AND restartStatusEnd
     * @param restartStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusBetween(Integer restartStatusEnd){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null && restartStatusEnd!=null){
            between("restart_status",restartStatus,restartStatusEnd);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT BETWEEN  entity().getRestartStatus() AND 值2
     * @param restartStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusNotBetween(Integer restartStatusEnd){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null && restartStatusEnd!=null){
            notBetween("restart_status",restartStatus,restartStatusEnd);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * BETWEEN  entity().getRestartStatus() AND 值2
     * @param restartStatusStart       值1
     * @param restartStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusBetween(Integer restartStatusStart,Integer restartStatusEnd){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null && restartStatusEnd!=null){
            between("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT BETWEEN  entity().getRestartStatus() AND 值2
     * @param restartStatusStart       值1
     * @param restartStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusNotBetween(Integer restartStatusStart,Integer restartStatusEnd){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null && restartStatusEnd!=null){
            notBetween("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * LIKE '%值%'  entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLike(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            like("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT LIKE '%值%'  entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusNotLike(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            notLike("restart_status",restartStatus);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * LIKE '%值'  entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLikeLeft(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            likeLeft("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * LIKE '值%'  entity().getRestartStatus()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLikeRight(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            likeRight("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 等于 =
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusEq(Integer restartStatus){
        if(restartStatus!=null){
            eq("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 不等于 &lt;&gt;
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusNe(Integer restartStatus){
        if(restartStatus!=null){
            ne("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 大于 &gt;
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusGt(Integer restartStatus){
        if(restartStatus!=null){
            gt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 大于等于 &gt;=
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusGe(Integer restartStatus){
        if(restartStatus!=null){
            ge("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 小于 &lt;
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLt(Integer restartStatus){
        if(restartStatus!=null){
            lt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 小于等于 &lt;=
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLe(Integer restartStatus){
        if(restartStatus!=null){
            le("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * LIKE '%值%'
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLike(Integer restartStatus){
        if(restartStatus!=null){
            like("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT LIKE '%值%'
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusNotLike(Integer restartStatus){
        if(restartStatus!=null){
            notLike("restart_status",restartStatus);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * LIKE '%值'
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLikeLeft(Integer restartStatus){
        if(restartStatus!=null){
            likeLeft("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * LIKE '值%'
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusLikeRight(Integer restartStatus){
        if(restartStatus!=null){
            likeRight("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusIsNull(){
        isNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusIsNotNull(){
        isNotNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("restart_status",value);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("restart_status",values);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("restart_status",value);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper restartStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("restart_status",values);
        }
        return this;
    }


    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 等于 = entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessEq(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            eq("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 不等于 &lt;&gt; entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessNe(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            ne("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 大于 &gt; entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessGt(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            gt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 大于等于 &gt;= entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessGe(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            ge("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 小于 &lt; entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLt(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            lt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 小于等于 &lt;= entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLe(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            le("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * BETWEEN  entity().getRootAccess() AND rootAccessEnd
     * @param rootAccessEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessBetween(Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            between("root_access",rootAccess,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessNotBetween(Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            notBetween("root_access",rootAccess,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessBetween(Integer rootAccessStart,Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            between("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessNotBetween(Integer rootAccessStart,Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            notBetween("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }


    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * LIKE '%值%'  entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLike(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            like("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT LIKE '%值%'  entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessNotLike(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            notLike("root_access",rootAccess);
        }
        return this;
     }


    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * LIKE '%值'  entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLikeLeft(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            likeLeft("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * LIKE '值%'  entity().getRootAccess()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLikeRight(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            likeRight("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 等于 =
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessEq(Integer rootAccess){
        if(rootAccess!=null){
            eq("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 不等于 &lt;&gt;
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessNe(Integer rootAccess){
        if(rootAccess!=null){
            ne("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 大于 &gt;
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessGt(Integer rootAccess){
        if(rootAccess!=null){
            gt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 大于等于 &gt;=
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessGe(Integer rootAccess){
        if(rootAccess!=null){
            ge("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 小于 &lt;
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLt(Integer rootAccess){
        if(rootAccess!=null){
            lt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 小于等于 &lt;=
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLe(Integer rootAccess){
        if(rootAccess!=null){
            le("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * LIKE '%值%'
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLike(Integer rootAccess){
        if(rootAccess!=null){
            like("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT LIKE '%值%'
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessNotLike(Integer rootAccess){
        if(rootAccess!=null){
            notLike("root_access",rootAccess);
        }
        return this;
     }


    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * LIKE '%值'
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLikeLeft(Integer rootAccess){
        if(rootAccess!=null){
            likeLeft("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * LIKE '值%'
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessLikeRight(Integer rootAccess){
        if(rootAccess!=null){
            likeRight("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessIsNull(){
        isNull("root_access");
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessIsNotNull(){
        isNotNull("root_access");
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("root_access",value);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessIn(Integer... values){
        if(values!=null && values.length>0){
            in("root_access",values);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_access",value);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper rootAccessNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("root_access",values);
        }
        return this;
    }


    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper versionIdEq(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdNe(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdGt(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdGe(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLt(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLe(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLike(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdNotLike(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLikeLeft(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLikeRight(){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdEq(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdNe(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdGt(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdGe(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLt(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLe(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLike(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdIn(Long... values){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryEntityWrapper versionIdNotIn(Long... values){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeEq(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeNe(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeGt(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeGe(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLt(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLe(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLike(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeNotLike(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLikeLeft(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLikeRight(){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeEq(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeNe(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeGt(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeGe(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLt(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLe(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLike(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeIn(Date... values){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStatusQueryEntityWrapper createTimeNotIn(Date... values){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeEq(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeNe(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeGt(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeGe(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLt(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLe(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLike(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeNotLike(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLikeLeft(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStatusQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }



}
