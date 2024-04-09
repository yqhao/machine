package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 机器更新子任务记录表
 * </p>
 * "mc_update_device_subtask_record"
 * @author 18374
 */
public class McUpdateDeviceSubtaskRecordQueryWrapper extends QueryWrapper<McUpdateDeviceSubtaskRecord> {


    public static McUpdateDeviceSubtaskRecordQueryWrapper wrapper() {
        return new McUpdateDeviceSubtaskRecordQueryWrapper();
    }

    public McUpdateDeviceSubtaskRecordQueryWrapper() {
        super();
    }

    public McUpdateDeviceSubtaskRecordQueryWrapper(McUpdateDeviceSubtaskRecord entity) {
        super(entity);
    }

    public McUpdateDeviceSubtaskRecordQueryWrapper(McUpdateDeviceSubtaskRecord entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public McUpdateDeviceSubtaskRecordQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public McUpdateDeviceSubtaskRecordQueryWrapper selectColumns(Consumer<McUpdateDeviceSubtaskRecordSelect> consumer) {
        McUpdateDeviceSubtaskRecordSelect select = new McUpdateDeviceSubtaskRecordSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper idEq(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idNe(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idGt(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idGe(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idLt(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idLe(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper idLike(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idNotLike(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idLikeLeft(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idLikeRight(Long id){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 等于 =
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdEq(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            eq("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdNe(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            ne("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 大于 &gt;
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdGt(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            gt("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 大于等于 &gt;=
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdGe(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            ge("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 小于 &lt;
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdLt(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            lt("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 小于等于 &lt;=
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdLe(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            le("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskRecordIdStart       值1
     * @param fkMcUpdateDeviceTaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdBetween(Long fkMcUpdateDeviceTaskRecordIdStart,Long fkMcUpdateDeviceTaskRecordIdEnd){
        if(fkMcUpdateDeviceTaskRecordIdStart!=null && fkMcUpdateDeviceTaskRecordIdEnd!=null){
            between("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordIdStart,fkMcUpdateDeviceTaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskRecordIdStart       值1
     * @param fkMcUpdateDeviceTaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdNotBetween(Long fkMcUpdateDeviceTaskRecordIdStart,Long fkMcUpdateDeviceTaskRecordIdEnd){
        if(fkMcUpdateDeviceTaskRecordIdStart!=null && fkMcUpdateDeviceTaskRecordIdEnd!=null){
            notBetween("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordIdStart,fkMcUpdateDeviceTaskRecordIdEnd);
        }
        return this;
     }


    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '%值%'
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdLike(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            like("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT LIKE '%值%'
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdNotLike(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            notLike("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }


    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '%值'
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdLikeLeft(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            likeLeft("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '值%'
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdLikeRight(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            likeRight("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdIsNull(){
        isNull("fk_mc_update_device_task_record_id");
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdIsNotNull(){
        isNotNull("fk_mc_update_device_task_record_id");
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_update_device_task_record_id",value);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_update_device_task_record_id",values);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_update_device_task_record_id",value);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceTaskRecordIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_task_record_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 等于 =
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdEq(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            eq("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdNe(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            ne("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 大于 &gt;
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdGt(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            gt("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 大于等于 &gt;=
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdGe(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            ge("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 小于 &lt;
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdLt(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            lt("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 小于等于 &lt;=
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdLe(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            le("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceSubtaskIdStart       值1
     * @param fkMcUpdateDeviceSubtaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdBetween(Long fkMcUpdateDeviceSubtaskIdStart,Long fkMcUpdateDeviceSubtaskIdEnd){
        if(fkMcUpdateDeviceSubtaskIdStart!=null && fkMcUpdateDeviceSubtaskIdEnd!=null){
            between("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskIdStart,fkMcUpdateDeviceSubtaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceSubtaskIdStart       值1
     * @param fkMcUpdateDeviceSubtaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdNotBetween(Long fkMcUpdateDeviceSubtaskIdStart,Long fkMcUpdateDeviceSubtaskIdEnd){
        if(fkMcUpdateDeviceSubtaskIdStart!=null && fkMcUpdateDeviceSubtaskIdEnd!=null){
            notBetween("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskIdStart,fkMcUpdateDeviceSubtaskIdEnd);
        }
        return this;
     }


    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '%值%'
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdLike(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            like("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT LIKE '%值%'
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdNotLike(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            notLike("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }


    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '%值'
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdLikeLeft(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            likeLeft("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '值%'
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdLikeRight(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            likeRight("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdIsNull(){
        isNull("fk_mc_update_device_subtask_id");
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdIsNotNull(){
        isNotNull("fk_mc_update_device_subtask_id");
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_update_device_subtask_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_update_device_subtask_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_update_device_subtask_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper fkMcUpdateDeviceSubtaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_subtask_id",values);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 等于 =
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 不等于 &lt;&gt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 大于 &gt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 大于等于 &gt;=
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 小于 &lt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 小于等于 &lt;=
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT LIKE '%值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeLikeRight(Integer type){
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("type",value);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeIn(Integer... values){
        if(values!=null && values.length>0){
            in("type",values);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("type",value);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 等于 =
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdEq(String taskId){
        if(taskId!=null){
            eq("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 不等于 &lt;&gt;
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdNe(String taskId){
        if(taskId!=null){
            ne("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 大于 &gt;
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdGt(String taskId){
        if(taskId!=null){
            gt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 大于等于 &gt;=
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdGe(String taskId){
        if(taskId!=null){
            ge("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 小于 &lt;
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdLt(String taskId){
        if(taskId!=null){
            lt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 小于等于 &lt;=
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdLe(String taskId){
        if(taskId!=null){
            le("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * BETWEEN 值1 AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdBetween(String taskIdStart,String taskIdEnd){
        if(taskIdStart!=null && taskIdEnd!=null){
            between("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdNotBetween(String taskIdStart,String taskIdEnd){
        if(taskIdStart!=null && taskIdEnd!=null){
            notBetween("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }


    /**
     * <p>任务ID</p>
     * LIKE '%值%'
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdLike(String taskId){
        if(taskId!=null){
            like("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * NOT LIKE '%值%'
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdNotLike(String taskId){
        if(taskId!=null){
            notLike("task_id",taskId);
        }
        return this;
     }


    /**
     * <p>任务ID</p>
     * LIKE '%值'
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdLikeLeft(String taskId){
        if(taskId!=null){
            likeLeft("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * LIKE '值%'
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdLikeRight(String taskId){
        if(taskId!=null){
            likeRight("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdIsNull(){
        isNull("task_id");
        return this;
    }

    /**
     * <p>任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdIsNotNull(){
        isNotNull("task_id");
        return this;
    }

    /**
     * <p>任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("task_id",value);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdIn(String... values){
        if(values!=null && values.length>0){
            in("task_id",values);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_id",value);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper taskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("task_id",values);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * 等于 =
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowEq(Integer executionFlow){
        if(executionFlow!=null){
            eq("execution_flow",executionFlow);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * 不等于 &lt;&gt;
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowNe(Integer executionFlow){
        if(executionFlow!=null){
            ne("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 大于 &gt;
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowGt(Integer executionFlow){
        if(executionFlow!=null){
            gt("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 大于等于 &gt;=
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowGe(Integer executionFlow){
        if(executionFlow!=null){
            ge("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 小于 &lt;
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowLt(Integer executionFlow){
        if(executionFlow!=null){
            lt("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 小于等于 &lt;=
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowLe(Integer executionFlow){
        if(executionFlow!=null){
            le("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * BETWEEN 值1 AND 值2
     * @param executionFlowStart       值1
     * @param executionFlowEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowBetween(Integer executionFlowStart,Integer executionFlowEnd){
        if(executionFlowStart!=null && executionFlowEnd!=null){
            between("execution_flow",executionFlowStart,executionFlowEnd);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * NOT BETWEEN 值1 AND 值2
     * @param executionFlowStart       值1
     * @param executionFlowEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowNotBetween(Integer executionFlowStart,Integer executionFlowEnd){
        if(executionFlowStart!=null && executionFlowEnd!=null){
            notBetween("execution_flow",executionFlowStart,executionFlowEnd);
        }
        return this;
     }


    /**
     * <p>执行顺序</p>
     * LIKE '%值%'
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowLike(Integer executionFlow){
        if(executionFlow!=null){
            like("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * NOT LIKE '%值%'
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowNotLike(Integer executionFlow){
        if(executionFlow!=null){
            notLike("execution_flow",executionFlow);
        }
        return this;
     }


    /**
     * <p>执行顺序</p>
     * LIKE '%值'
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowLikeLeft(Integer executionFlow){
        if(executionFlow!=null){
            likeLeft("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * LIKE '值%'
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowLikeRight(Integer executionFlow){
        if(executionFlow!=null){
            likeRight("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowIsNull(){
        isNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowIsNotNull(){
        isNotNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("execution_flow",value);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowIn(Integer... values){
        if(values!=null && values.length>0){
            in("execution_flow",values);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("execution_flow",value);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executionFlowNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("execution_flow",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 等于 =
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgEq(String executeMsg){
        if(executeMsg!=null){
            eq("execute_msg",executeMsg);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 不等于 &lt;&gt;
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgNe(String executeMsg){
        if(executeMsg!=null){
            ne("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于 &gt;
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgGt(String executeMsg){
        if(executeMsg!=null){
            gt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于等于 &gt;=
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgGe(String executeMsg){
        if(executeMsg!=null){
            ge("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于 &lt;
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgLt(String executeMsg){
        if(executeMsg!=null){
            lt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于等于 &lt;=
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgLe(String executeMsg){
        if(executeMsg!=null){
            le("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * BETWEEN 值1 AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
        if(executeMsgStart!=null && executeMsgEnd!=null){
            between("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT BETWEEN 值1 AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
        if(executeMsgStart!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值%'
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgLike(String executeMsg){
        if(executeMsg!=null){
            like("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT LIKE '%值%'
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgNotLike(String executeMsg){
        if(executeMsg!=null){
            notLike("execute_msg",executeMsg);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值'
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgLikeLeft(String executeMsg){
        if(executeMsg!=null){
            likeLeft("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * LIKE '值%'
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgLikeRight(String executeMsg){
        if(executeMsg!=null){
            likeRight("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("execute_msg",value);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgIn(String... values){
        if(values!=null && values.length>0){
            in("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("execute_msg",value);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdEq(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdNe(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdGt(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdGe(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdLt(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdLe(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdLike(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdNotLike(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdLikeLeft(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdLikeRight(Long versionId){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper versionIdNotIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper createTimeNotIn(Date... values){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
