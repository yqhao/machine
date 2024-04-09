package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStreams;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 机器streaming端口映射
 * </p>
 * "viz_mc_machine_streams"
 * @author PC001
 */
public class VizMcMachineStreamsQueryEntityWrapper extends QueryWrapper<VizMcMachineStreams> {

    public static VizMcMachineStreamsQueryEntityWrapper wrapper(VizMcMachineStreams entity) {
        return new VizMcMachineStreamsQueryEntityWrapper(entity);
    }

    private VizMcMachineStreams entity;

    public VizMcMachineStreamsQueryEntityWrapper(VizMcMachineStreams entity) {
         this.entity=entity;
    }


    protected VizMcMachineStreams entity() {
        if(entity==null){
            throw new NullPointerException("VizMcMachineStreams is null");
        }
        return entity;
    }

    @Override
    public VizMcMachineStreamsQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public VizMcMachineStreamsQueryEntityWrapper selectColumns(Consumer<VizMcMachineStreamsSelect> consumer) {
        VizMcMachineStreamsSelect select = new VizMcMachineStreamsSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper idNotIn(Long... values){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdEq(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdNe(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdGt(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdGe(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLt(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLe(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdNotLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLikeLeft(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLikeRight(){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcMachineStreamsQueryEntityWrapper fkMcMachineIdNotIn(Long... values){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdEq(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdNe(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdGt(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdGe(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLt(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLe(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdNotLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLikeLeft(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLikeRight(){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdIn(String... values){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryEntityWrapper deviceIdNotIn(String... values){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdEq(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdNe(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdGt(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdGe(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLt(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLe(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdBetween(String instanceIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdNotBetween(String instanceIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdNotLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLikeLeft(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLikeRight(){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdEq(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdNe(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdGt(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdGe(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLt(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLe(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLike(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdNotLike(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLikeLeft(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper instanceIdIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdIn(String... values){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }


    /**
     * <p>状态：idle、busy</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusEq(){
        String status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusNe(){
        String status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusGt(){
        String status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusGe(){
        String status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLt(){
        String status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLe(){
        String status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusBetween(String statusEnd){
        String status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusNotBetween(String statusEnd){
        String status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusBetween(String statusStart,String statusEnd){
        String status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusNotBetween(String statusStart,String statusEnd){
        String status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态：idle、busy</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLike(){
        String status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusNotLike(){
        String status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态：idle、busy</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLikeLeft(){
        String status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLikeRight(){
        String status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusEq(String status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusNe(String status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusGt(String status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusGe(String status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLt(String status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLe(String status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLike(String status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusNotLike(String status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态：idle、busy</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLikeLeft(String status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusLikeRight(String status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusIn(String... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper statusNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p>内网ip</p>
     * 等于 = entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressEq(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            eq("internal_address",internalAddress);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * 不等于 &lt;&gt; entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressNe(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            ne("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 大于 &gt; entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressGt(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            gt("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 大于等于 &gt;= entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressGe(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            ge("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 小于 &lt; entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLt(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            lt("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 小于等于 &lt;= entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLe(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            le("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * BETWEEN  entity().getInternalAddress() AND internalAddressEnd
     * @param internalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressBetween(String internalAddressEnd){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null && internalAddressEnd!=null){
            between("internal_address",internalAddress,internalAddressEnd);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * NOT BETWEEN  entity().getInternalAddress() AND 值2
     * @param internalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressNotBetween(String internalAddressEnd){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null && internalAddressEnd!=null){
            notBetween("internal_address",internalAddress,internalAddressEnd);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * BETWEEN  entity().getInternalAddress() AND 值2
     * @param internalAddressStart       值1
     * @param internalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressBetween(String internalAddressStart,String internalAddressEnd){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null && internalAddressEnd!=null){
            between("internal_address",internalAddressStart,internalAddressEnd);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * NOT BETWEEN  entity().getInternalAddress() AND 值2
     * @param internalAddressStart       值1
     * @param internalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressNotBetween(String internalAddressStart,String internalAddressEnd){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null && internalAddressEnd!=null){
            notBetween("internal_address",internalAddressStart,internalAddressEnd);
        }
        return this;
     }


    /**
     * <p>内网ip</p>
     * LIKE '%值%'  entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLike(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            like("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * NOT LIKE '%值%'  entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressNotLike(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            notLike("internal_address",internalAddress);
        }
        return this;
     }


    /**
     * <p>内网ip</p>
     * LIKE '%值'  entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLikeLeft(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            likeLeft("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * LIKE '值%'  entity().getInternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLikeRight(){
        String internalAddress =entity().getInternalAddress();
        if(internalAddress!=null){
            likeRight("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 等于 =
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressEq(String internalAddress){
        if(internalAddress!=null){
            eq("internal_address",internalAddress);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * 不等于 &lt;&gt;
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressNe(String internalAddress){
        if(internalAddress!=null){
            ne("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 大于 &gt;
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressGt(String internalAddress){
        if(internalAddress!=null){
            gt("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 大于等于 &gt;=
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressGe(String internalAddress){
        if(internalAddress!=null){
            ge("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 小于 &lt;
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLt(String internalAddress){
        if(internalAddress!=null){
            lt("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 小于等于 &lt;=
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLe(String internalAddress){
        if(internalAddress!=null){
            le("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * LIKE '%值%'
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLike(String internalAddress){
        if(internalAddress!=null){
            like("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * NOT LIKE '%值%'
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressNotLike(String internalAddress){
        if(internalAddress!=null){
            notLike("internal_address",internalAddress);
        }
        return this;
     }


    /**
     * <p>内网ip</p>
     * LIKE '%值'
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLikeLeft(String internalAddress){
        if(internalAddress!=null){
            likeLeft("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * LIKE '值%'
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressLikeRight(String internalAddress){
        if(internalAddress!=null){
            likeRight("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressIsNull(){
        isNull("internal_address");
        return this;
    }

    /**
     * <p>内网ip</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressIsNotNull(){
        isNotNull("internal_address");
        return this;
    }

    /**
     * <p>内网ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("internal_address",value);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressIn(String... values){
        if(values!=null && values.length>0){
            in("internal_address",values);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_address",value);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_address",values);
        }
        return this;
    }


    /**
     * <p>内网音频端口</p>
     * 等于 = entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportEq(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            eq("internal_aport",internalAport);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * 不等于 &lt;&gt; entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportNe(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            ne("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 大于 &gt; entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportGt(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            gt("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 大于等于 &gt;= entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportGe(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            ge("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 小于 &lt; entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLt(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            lt("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 小于等于 &lt;= entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLe(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            le("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * BETWEEN  entity().getInternalAport() AND internalAportEnd
     * @param internalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportBetween(Integer internalAportEnd){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null && internalAportEnd!=null){
            between("internal_aport",internalAport,internalAportEnd);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * NOT BETWEEN  entity().getInternalAport() AND 值2
     * @param internalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportNotBetween(Integer internalAportEnd){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null && internalAportEnd!=null){
            notBetween("internal_aport",internalAport,internalAportEnd);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * BETWEEN  entity().getInternalAport() AND 值2
     * @param internalAportStart       值1
     * @param internalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportBetween(Integer internalAportStart,Integer internalAportEnd){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null && internalAportEnd!=null){
            between("internal_aport",internalAportStart,internalAportEnd);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * NOT BETWEEN  entity().getInternalAport() AND 值2
     * @param internalAportStart       值1
     * @param internalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportNotBetween(Integer internalAportStart,Integer internalAportEnd){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null && internalAportEnd!=null){
            notBetween("internal_aport",internalAportStart,internalAportEnd);
        }
        return this;
     }


    /**
     * <p>内网音频端口</p>
     * LIKE '%值%'  entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLike(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            like("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * NOT LIKE '%值%'  entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportNotLike(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            notLike("internal_aport",internalAport);
        }
        return this;
     }


    /**
     * <p>内网音频端口</p>
     * LIKE '%值'  entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLikeLeft(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            likeLeft("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * LIKE '值%'  entity().getInternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLikeRight(){
        Integer internalAport =entity().getInternalAport();
        if(internalAport!=null){
            likeRight("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 等于 =
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportEq(Integer internalAport){
        if(internalAport!=null){
            eq("internal_aport",internalAport);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * 不等于 &lt;&gt;
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportNe(Integer internalAport){
        if(internalAport!=null){
            ne("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 大于 &gt;
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportGt(Integer internalAport){
        if(internalAport!=null){
            gt("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 大于等于 &gt;=
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportGe(Integer internalAport){
        if(internalAport!=null){
            ge("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 小于 &lt;
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLt(Integer internalAport){
        if(internalAport!=null){
            lt("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 小于等于 &lt;=
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLe(Integer internalAport){
        if(internalAport!=null){
            le("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * LIKE '%值%'
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLike(Integer internalAport){
        if(internalAport!=null){
            like("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * NOT LIKE '%值%'
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportNotLike(Integer internalAport){
        if(internalAport!=null){
            notLike("internal_aport",internalAport);
        }
        return this;
     }


    /**
     * <p>内网音频端口</p>
     * LIKE '%值'
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLikeLeft(Integer internalAport){
        if(internalAport!=null){
            likeLeft("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * LIKE '值%'
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportLikeRight(Integer internalAport){
        if(internalAport!=null){
            likeRight("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportIsNull(){
        isNull("internal_aport");
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportIsNotNull(){
        isNotNull("internal_aport");
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("internal_aport",value);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportIn(Integer... values){
        if(values!=null && values.length>0){
            in("internal_aport",values);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_aport",value);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("internal_aport",values);
        }
        return this;
    }


    /**
     * <p>内网音频端口类型</p>
     * 等于 = entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeEq(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            eq("internal_atype",internalAtype);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * 不等于 &lt;&gt; entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeNe(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            ne("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 大于 &gt; entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeGt(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            gt("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 大于等于 &gt;= entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeGe(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            ge("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 小于 &lt; entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLt(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            lt("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 小于等于 &lt;= entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLe(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            le("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * BETWEEN  entity().getInternalAtype() AND internalAtypeEnd
     * @param internalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeBetween(Integer internalAtypeEnd){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null && internalAtypeEnd!=null){
            between("internal_atype",internalAtype,internalAtypeEnd);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * NOT BETWEEN  entity().getInternalAtype() AND 值2
     * @param internalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeNotBetween(Integer internalAtypeEnd){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null && internalAtypeEnd!=null){
            notBetween("internal_atype",internalAtype,internalAtypeEnd);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * BETWEEN  entity().getInternalAtype() AND 值2
     * @param internalAtypeStart       值1
     * @param internalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeBetween(Integer internalAtypeStart,Integer internalAtypeEnd){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null && internalAtypeEnd!=null){
            between("internal_atype",internalAtypeStart,internalAtypeEnd);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * NOT BETWEEN  entity().getInternalAtype() AND 值2
     * @param internalAtypeStart       值1
     * @param internalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeNotBetween(Integer internalAtypeStart,Integer internalAtypeEnd){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null && internalAtypeEnd!=null){
            notBetween("internal_atype",internalAtypeStart,internalAtypeEnd);
        }
        return this;
     }


    /**
     * <p>内网音频端口类型</p>
     * LIKE '%值%'  entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLike(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            like("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * NOT LIKE '%值%'  entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeNotLike(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            notLike("internal_atype",internalAtype);
        }
        return this;
     }


    /**
     * <p>内网音频端口类型</p>
     * LIKE '%值'  entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLikeLeft(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            likeLeft("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * LIKE '值%'  entity().getInternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLikeRight(){
        Integer internalAtype =entity().getInternalAtype();
        if(internalAtype!=null){
            likeRight("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 等于 =
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeEq(Integer internalAtype){
        if(internalAtype!=null){
            eq("internal_atype",internalAtype);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * 不等于 &lt;&gt;
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeNe(Integer internalAtype){
        if(internalAtype!=null){
            ne("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 大于 &gt;
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeGt(Integer internalAtype){
        if(internalAtype!=null){
            gt("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 大于等于 &gt;=
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeGe(Integer internalAtype){
        if(internalAtype!=null){
            ge("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 小于 &lt;
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLt(Integer internalAtype){
        if(internalAtype!=null){
            lt("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 小于等于 &lt;=
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLe(Integer internalAtype){
        if(internalAtype!=null){
            le("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * LIKE '%值%'
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLike(Integer internalAtype){
        if(internalAtype!=null){
            like("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * NOT LIKE '%值%'
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeNotLike(Integer internalAtype){
        if(internalAtype!=null){
            notLike("internal_atype",internalAtype);
        }
        return this;
     }


    /**
     * <p>内网音频端口类型</p>
     * LIKE '%值'
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLikeLeft(Integer internalAtype){
        if(internalAtype!=null){
            likeLeft("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * LIKE '值%'
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeLikeRight(Integer internalAtype){
        if(internalAtype!=null){
            likeRight("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeIsNull(){
        isNull("internal_atype");
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeIsNotNull(){
        isNotNull("internal_atype");
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("internal_atype",value);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("internal_atype",values);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_atype",value);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalAtypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("internal_atype",values);
        }
        return this;
    }


    /**
     * <p>内网视频端口</p>
     * 等于 = entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportEq(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            eq("internal_vport",internalVport);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * 不等于 &lt;&gt; entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportNe(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            ne("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 大于 &gt; entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportGt(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            gt("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 大于等于 &gt;= entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportGe(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            ge("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 小于 &lt; entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLt(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            lt("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 小于等于 &lt;= entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLe(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            le("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * BETWEEN  entity().getInternalVport() AND internalVportEnd
     * @param internalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportBetween(Integer internalVportEnd){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null && internalVportEnd!=null){
            between("internal_vport",internalVport,internalVportEnd);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * NOT BETWEEN  entity().getInternalVport() AND 值2
     * @param internalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportNotBetween(Integer internalVportEnd){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null && internalVportEnd!=null){
            notBetween("internal_vport",internalVport,internalVportEnd);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * BETWEEN  entity().getInternalVport() AND 值2
     * @param internalVportStart       值1
     * @param internalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportBetween(Integer internalVportStart,Integer internalVportEnd){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null && internalVportEnd!=null){
            between("internal_vport",internalVportStart,internalVportEnd);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * NOT BETWEEN  entity().getInternalVport() AND 值2
     * @param internalVportStart       值1
     * @param internalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportNotBetween(Integer internalVportStart,Integer internalVportEnd){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null && internalVportEnd!=null){
            notBetween("internal_vport",internalVportStart,internalVportEnd);
        }
        return this;
     }


    /**
     * <p>内网视频端口</p>
     * LIKE '%值%'  entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLike(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            like("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * NOT LIKE '%值%'  entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportNotLike(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            notLike("internal_vport",internalVport);
        }
        return this;
     }


    /**
     * <p>内网视频端口</p>
     * LIKE '%值'  entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLikeLeft(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            likeLeft("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * LIKE '值%'  entity().getInternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLikeRight(){
        Integer internalVport =entity().getInternalVport();
        if(internalVport!=null){
            likeRight("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 等于 =
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportEq(Integer internalVport){
        if(internalVport!=null){
            eq("internal_vport",internalVport);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * 不等于 &lt;&gt;
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportNe(Integer internalVport){
        if(internalVport!=null){
            ne("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 大于 &gt;
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportGt(Integer internalVport){
        if(internalVport!=null){
            gt("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 大于等于 &gt;=
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportGe(Integer internalVport){
        if(internalVport!=null){
            ge("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 小于 &lt;
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLt(Integer internalVport){
        if(internalVport!=null){
            lt("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 小于等于 &lt;=
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLe(Integer internalVport){
        if(internalVport!=null){
            le("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * LIKE '%值%'
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLike(Integer internalVport){
        if(internalVport!=null){
            like("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * NOT LIKE '%值%'
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportNotLike(Integer internalVport){
        if(internalVport!=null){
            notLike("internal_vport",internalVport);
        }
        return this;
     }


    /**
     * <p>内网视频端口</p>
     * LIKE '%值'
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLikeLeft(Integer internalVport){
        if(internalVport!=null){
            likeLeft("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * LIKE '值%'
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportLikeRight(Integer internalVport){
        if(internalVport!=null){
            likeRight("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportIsNull(){
        isNull("internal_vport");
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportIsNotNull(){
        isNotNull("internal_vport");
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("internal_vport",value);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportIn(Integer... values){
        if(values!=null && values.length>0){
            in("internal_vport",values);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_vport",value);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper internalVportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("internal_vport",values);
        }
        return this;
    }


    /**
     * <p>外网ip</p>
     * 等于 = entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressEq(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            eq("external_address",externalAddress);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * 不等于 &lt;&gt; entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressNe(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            ne("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 大于 &gt; entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressGt(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            gt("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 大于等于 &gt;= entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressGe(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            ge("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 小于 &lt; entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLt(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            lt("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 小于等于 &lt;= entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLe(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            le("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * BETWEEN  entity().getExternalAddress() AND externalAddressEnd
     * @param externalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressBetween(String externalAddressEnd){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null && externalAddressEnd!=null){
            between("external_address",externalAddress,externalAddressEnd);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * NOT BETWEEN  entity().getExternalAddress() AND 值2
     * @param externalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressNotBetween(String externalAddressEnd){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null && externalAddressEnd!=null){
            notBetween("external_address",externalAddress,externalAddressEnd);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * BETWEEN  entity().getExternalAddress() AND 值2
     * @param externalAddressStart       值1
     * @param externalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressBetween(String externalAddressStart,String externalAddressEnd){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null && externalAddressEnd!=null){
            between("external_address",externalAddressStart,externalAddressEnd);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * NOT BETWEEN  entity().getExternalAddress() AND 值2
     * @param externalAddressStart       值1
     * @param externalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressNotBetween(String externalAddressStart,String externalAddressEnd){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null && externalAddressEnd!=null){
            notBetween("external_address",externalAddressStart,externalAddressEnd);
        }
        return this;
     }


    /**
     * <p>外网ip</p>
     * LIKE '%值%'  entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLike(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            like("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * NOT LIKE '%值%'  entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressNotLike(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            notLike("external_address",externalAddress);
        }
        return this;
     }


    /**
     * <p>外网ip</p>
     * LIKE '%值'  entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLikeLeft(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            likeLeft("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * LIKE '值%'  entity().getExternalAddress()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLikeRight(){
        String externalAddress =entity().getExternalAddress();
        if(externalAddress!=null){
            likeRight("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 等于 =
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressEq(String externalAddress){
        if(externalAddress!=null){
            eq("external_address",externalAddress);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * 不等于 &lt;&gt;
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressNe(String externalAddress){
        if(externalAddress!=null){
            ne("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 大于 &gt;
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressGt(String externalAddress){
        if(externalAddress!=null){
            gt("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 大于等于 &gt;=
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressGe(String externalAddress){
        if(externalAddress!=null){
            ge("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 小于 &lt;
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLt(String externalAddress){
        if(externalAddress!=null){
            lt("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 小于等于 &lt;=
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLe(String externalAddress){
        if(externalAddress!=null){
            le("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * LIKE '%值%'
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLike(String externalAddress){
        if(externalAddress!=null){
            like("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * NOT LIKE '%值%'
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressNotLike(String externalAddress){
        if(externalAddress!=null){
            notLike("external_address",externalAddress);
        }
        return this;
     }


    /**
     * <p>外网ip</p>
     * LIKE '%值'
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLikeLeft(String externalAddress){
        if(externalAddress!=null){
            likeLeft("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * LIKE '值%'
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressLikeRight(String externalAddress){
        if(externalAddress!=null){
            likeRight("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressIsNull(){
        isNull("external_address");
        return this;
    }

    /**
     * <p>外网ip</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressIsNotNull(){
        isNotNull("external_address");
        return this;
    }

    /**
     * <p>外网ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("external_address",value);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressIn(String... values){
        if(values!=null && values.length>0){
            in("external_address",values);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_address",value);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_address",values);
        }
        return this;
    }


    /**
     * <p>外网音频端口</p>
     * 等于 = entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportEq(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            eq("external_aport",externalAport);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * 不等于 &lt;&gt; entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportNe(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            ne("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 大于 &gt; entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportGt(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            gt("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 大于等于 &gt;= entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportGe(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            ge("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 小于 &lt; entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLt(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            lt("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 小于等于 &lt;= entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLe(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            le("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * BETWEEN  entity().getExternalAport() AND externalAportEnd
     * @param externalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportBetween(Integer externalAportEnd){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null && externalAportEnd!=null){
            between("external_aport",externalAport,externalAportEnd);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * NOT BETWEEN  entity().getExternalAport() AND 值2
     * @param externalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportNotBetween(Integer externalAportEnd){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null && externalAportEnd!=null){
            notBetween("external_aport",externalAport,externalAportEnd);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * BETWEEN  entity().getExternalAport() AND 值2
     * @param externalAportStart       值1
     * @param externalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportBetween(Integer externalAportStart,Integer externalAportEnd){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null && externalAportEnd!=null){
            between("external_aport",externalAportStart,externalAportEnd);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * NOT BETWEEN  entity().getExternalAport() AND 值2
     * @param externalAportStart       值1
     * @param externalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportNotBetween(Integer externalAportStart,Integer externalAportEnd){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null && externalAportEnd!=null){
            notBetween("external_aport",externalAportStart,externalAportEnd);
        }
        return this;
     }


    /**
     * <p>外网音频端口</p>
     * LIKE '%值%'  entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLike(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            like("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * NOT LIKE '%值%'  entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportNotLike(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            notLike("external_aport",externalAport);
        }
        return this;
     }


    /**
     * <p>外网音频端口</p>
     * LIKE '%值'  entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLikeLeft(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            likeLeft("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * LIKE '值%'  entity().getExternalAport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLikeRight(){
        Integer externalAport =entity().getExternalAport();
        if(externalAport!=null){
            likeRight("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 等于 =
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportEq(Integer externalAport){
        if(externalAport!=null){
            eq("external_aport",externalAport);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * 不等于 &lt;&gt;
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportNe(Integer externalAport){
        if(externalAport!=null){
            ne("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 大于 &gt;
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportGt(Integer externalAport){
        if(externalAport!=null){
            gt("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 大于等于 &gt;=
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportGe(Integer externalAport){
        if(externalAport!=null){
            ge("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 小于 &lt;
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLt(Integer externalAport){
        if(externalAport!=null){
            lt("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 小于等于 &lt;=
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLe(Integer externalAport){
        if(externalAport!=null){
            le("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * LIKE '%值%'
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLike(Integer externalAport){
        if(externalAport!=null){
            like("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * NOT LIKE '%值%'
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportNotLike(Integer externalAport){
        if(externalAport!=null){
            notLike("external_aport",externalAport);
        }
        return this;
     }


    /**
     * <p>外网音频端口</p>
     * LIKE '%值'
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLikeLeft(Integer externalAport){
        if(externalAport!=null){
            likeLeft("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * LIKE '值%'
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportLikeRight(Integer externalAport){
        if(externalAport!=null){
            likeRight("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportIsNull(){
        isNull("external_aport");
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportIsNotNull(){
        isNotNull("external_aport");
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("external_aport",value);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportIn(Integer... values){
        if(values!=null && values.length>0){
            in("external_aport",values);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_aport",value);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("external_aport",values);
        }
        return this;
    }


    /**
     * <p>外网音频端口类型</p>
     * 等于 = entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeEq(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            eq("external_atype",externalAtype);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * 不等于 &lt;&gt; entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeNe(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            ne("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 大于 &gt; entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeGt(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            gt("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 大于等于 &gt;= entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeGe(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            ge("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 小于 &lt; entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLt(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            lt("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 小于等于 &lt;= entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLe(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            le("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * BETWEEN  entity().getExternalAtype() AND externalAtypeEnd
     * @param externalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeBetween(Integer externalAtypeEnd){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null && externalAtypeEnd!=null){
            between("external_atype",externalAtype,externalAtypeEnd);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * NOT BETWEEN  entity().getExternalAtype() AND 值2
     * @param externalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeNotBetween(Integer externalAtypeEnd){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null && externalAtypeEnd!=null){
            notBetween("external_atype",externalAtype,externalAtypeEnd);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * BETWEEN  entity().getExternalAtype() AND 值2
     * @param externalAtypeStart       值1
     * @param externalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeBetween(Integer externalAtypeStart,Integer externalAtypeEnd){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null && externalAtypeEnd!=null){
            between("external_atype",externalAtypeStart,externalAtypeEnd);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * NOT BETWEEN  entity().getExternalAtype() AND 值2
     * @param externalAtypeStart       值1
     * @param externalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeNotBetween(Integer externalAtypeStart,Integer externalAtypeEnd){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null && externalAtypeEnd!=null){
            notBetween("external_atype",externalAtypeStart,externalAtypeEnd);
        }
        return this;
     }


    /**
     * <p>外网音频端口类型</p>
     * LIKE '%值%'  entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLike(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            like("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * NOT LIKE '%值%'  entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeNotLike(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            notLike("external_atype",externalAtype);
        }
        return this;
     }


    /**
     * <p>外网音频端口类型</p>
     * LIKE '%值'  entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLikeLeft(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            likeLeft("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * LIKE '值%'  entity().getExternalAtype()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLikeRight(){
        Integer externalAtype =entity().getExternalAtype();
        if(externalAtype!=null){
            likeRight("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 等于 =
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeEq(Integer externalAtype){
        if(externalAtype!=null){
            eq("external_atype",externalAtype);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * 不等于 &lt;&gt;
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeNe(Integer externalAtype){
        if(externalAtype!=null){
            ne("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 大于 &gt;
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeGt(Integer externalAtype){
        if(externalAtype!=null){
            gt("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 大于等于 &gt;=
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeGe(Integer externalAtype){
        if(externalAtype!=null){
            ge("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 小于 &lt;
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLt(Integer externalAtype){
        if(externalAtype!=null){
            lt("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 小于等于 &lt;=
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLe(Integer externalAtype){
        if(externalAtype!=null){
            le("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * LIKE '%值%'
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLike(Integer externalAtype){
        if(externalAtype!=null){
            like("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * NOT LIKE '%值%'
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeNotLike(Integer externalAtype){
        if(externalAtype!=null){
            notLike("external_atype",externalAtype);
        }
        return this;
     }


    /**
     * <p>外网音频端口类型</p>
     * LIKE '%值'
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLikeLeft(Integer externalAtype){
        if(externalAtype!=null){
            likeLeft("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * LIKE '值%'
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeLikeRight(Integer externalAtype){
        if(externalAtype!=null){
            likeRight("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeIsNull(){
        isNull("external_atype");
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeIsNotNull(){
        isNotNull("external_atype");
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("external_atype",value);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("external_atype",values);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_atype",value);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalAtypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("external_atype",values);
        }
        return this;
    }


    /**
     * <p>外网视频端口</p>
     * 等于 = entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportEq(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            eq("external_vport",externalVport);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * 不等于 &lt;&gt; entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportNe(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            ne("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 大于 &gt; entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportGt(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            gt("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 大于等于 &gt;= entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportGe(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            ge("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 小于 &lt; entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLt(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            lt("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 小于等于 &lt;= entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLe(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            le("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * BETWEEN  entity().getExternalVport() AND externalVportEnd
     * @param externalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportBetween(Integer externalVportEnd){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null && externalVportEnd!=null){
            between("external_vport",externalVport,externalVportEnd);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * NOT BETWEEN  entity().getExternalVport() AND 值2
     * @param externalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportNotBetween(Integer externalVportEnd){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null && externalVportEnd!=null){
            notBetween("external_vport",externalVport,externalVportEnd);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * BETWEEN  entity().getExternalVport() AND 值2
     * @param externalVportStart       值1
     * @param externalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportBetween(Integer externalVportStart,Integer externalVportEnd){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null && externalVportEnd!=null){
            between("external_vport",externalVportStart,externalVportEnd);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * NOT BETWEEN  entity().getExternalVport() AND 值2
     * @param externalVportStart       值1
     * @param externalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportNotBetween(Integer externalVportStart,Integer externalVportEnd){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null && externalVportEnd!=null){
            notBetween("external_vport",externalVportStart,externalVportEnd);
        }
        return this;
     }


    /**
     * <p>外网视频端口</p>
     * LIKE '%值%'  entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLike(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            like("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * NOT LIKE '%值%'  entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportNotLike(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            notLike("external_vport",externalVport);
        }
        return this;
     }


    /**
     * <p>外网视频端口</p>
     * LIKE '%值'  entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLikeLeft(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            likeLeft("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * LIKE '值%'  entity().getExternalVport()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLikeRight(){
        Integer externalVport =entity().getExternalVport();
        if(externalVport!=null){
            likeRight("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 等于 =
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportEq(Integer externalVport){
        if(externalVport!=null){
            eq("external_vport",externalVport);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * 不等于 &lt;&gt;
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportNe(Integer externalVport){
        if(externalVport!=null){
            ne("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 大于 &gt;
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportGt(Integer externalVport){
        if(externalVport!=null){
            gt("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 大于等于 &gt;=
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportGe(Integer externalVport){
        if(externalVport!=null){
            ge("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 小于 &lt;
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLt(Integer externalVport){
        if(externalVport!=null){
            lt("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 小于等于 &lt;=
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLe(Integer externalVport){
        if(externalVport!=null){
            le("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * LIKE '%值%'
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLike(Integer externalVport){
        if(externalVport!=null){
            like("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * NOT LIKE '%值%'
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportNotLike(Integer externalVport){
        if(externalVport!=null){
            notLike("external_vport",externalVport);
        }
        return this;
     }


    /**
     * <p>外网视频端口</p>
     * LIKE '%值'
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLikeLeft(Integer externalVport){
        if(externalVport!=null){
            likeLeft("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * LIKE '值%'
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportLikeRight(Integer externalVport){
        if(externalVport!=null){
            likeRight("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportIsNull(){
        isNull("external_vport");
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportIsNotNull(){
        isNotNull("external_vport");
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("external_vport",value);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportIn(Integer... values){
        if(values!=null && values.length>0){
            in("external_vport",values);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_vport",value);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper externalVportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("external_vport",values);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper createTimeEq(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeNe(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeGt(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeGe(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLt(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLe(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeNotLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLikeLeft(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLikeRight(){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeEq(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeNe(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeGt(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeGe(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLt(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLe(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLike(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeIn(Date... values){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStreamsQueryEntityWrapper createTimeNotIn(Date... values){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeEq(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeNe(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeGt(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeGe(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLt(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLe(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeNotLike(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLikeLeft(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStreamsQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 等于 = entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drEq(){
        Integer dr =entity().getDr();
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 不等于 &lt;&gt; entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drNe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 大于 &gt; entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drGt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 大于等于 &gt;= entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drGe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 小于 &lt; entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 小于等于 &lt;= entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * BETWEEN  entity().getDr() AND drEnd
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drNotBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",drStart,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drNotBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '%值%'  entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT LIKE '%值%'  entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drNotLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '%值'  entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLikeLeft(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '值%'  entity().getDr()
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLikeRight(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 等于 =
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 不等于 &lt;&gt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 大于 &gt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 大于等于 &gt;=
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 小于 &lt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 小于等于 &lt;=
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLe(Integer dr){
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '%值'
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drLikeRight(Integer dr){
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dr",value);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drIn(Integer... values){
        if(values!=null && values.length>0){
            in("dr",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dr",value);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryEntityWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }



}
