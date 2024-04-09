package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 机器更新任务记录表
 * </p>
 * "mc_update_device_task_record"
 * @author 18374
 */
public class McUpdateDeviceTaskRecordQueryWrapper extends QueryWrapper<McUpdateDeviceTaskRecord> {


    public static McUpdateDeviceTaskRecordQueryWrapper wrapper() {
        return new McUpdateDeviceTaskRecordQueryWrapper();
    }

    public McUpdateDeviceTaskRecordQueryWrapper() {
        super();
    }

    public McUpdateDeviceTaskRecordQueryWrapper(McUpdateDeviceTaskRecord entity) {
        super(entity);
    }

    public McUpdateDeviceTaskRecordQueryWrapper(McUpdateDeviceTaskRecord entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public McUpdateDeviceTaskRecordQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public McUpdateDeviceTaskRecordQueryWrapper selectColumns(Consumer<McUpdateDeviceTaskRecordSelect> consumer) {
        McUpdateDeviceTaskRecordSelect select = new McUpdateDeviceTaskRecordSelect();
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
    public McUpdateDeviceTaskRecordQueryWrapper idEq(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idNe(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idGt(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idGe(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idLt(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idLe(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper idLike(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idNotLike(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idLikeLeft(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idLikeRight(Long id){
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
    public McUpdateDeviceTaskRecordQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper idIn(Long... values){
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
    public McUpdateDeviceTaskRecordQueryWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 等于 =
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdEq(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            eq("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdNe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ne("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于 &gt;
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdGt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            gt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于等于 &gt;=
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdGe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ge("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于 &lt;
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdLt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            lt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于等于 &lt;=
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdLe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            le("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        if(fkMcServerSoftwarePackageIdStart!=null && fkMcServerSoftwarePackageIdEnd!=null){
            between("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdNotBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        if(fkMcServerSoftwarePackageIdStart!=null && fkMcServerSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            like("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT LIKE '%值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdNotLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            notLike("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdLikeLeft(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            likeLeft("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdLikeRight(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            likeRight("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdIsNull(){
        isNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_server_software_package_id",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_server_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_server_software_package_id",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcServerSoftwarePackageIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_server_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * 等于 =
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdEq(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            eq("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdNe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            ne("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 大于 &gt;
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdGt(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            gt("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 大于等于 &gt;=
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdGe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            ge("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 小于 &lt;
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdLt(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            lt("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 小于等于 &lt;=
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdLe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            le("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskIdStart       值1
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
        if(fkMcUpdateDeviceTaskIdStart!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            between("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskIdStart,fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskIdStart       值1
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdNotBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
        if(fkMcUpdateDeviceTaskIdStart!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            notBetween("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskIdStart,fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值%'
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdLike(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            like("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * NOT LIKE '%值%'
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdNotLike(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            notLike("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }


    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值'
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdLikeLeft(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            likeLeft("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * LIKE '值%'
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdLikeRight(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            likeRight("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdIsNull(){
        isNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdIsNotNull(){
        isNotNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_update_device_task_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_update_device_task_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_update_device_task_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceTaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_task_id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 等于 =
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdEq(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            eq("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdNe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ne("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 大于 &gt;
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdGt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            gt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 大于等于 &gt;=
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdGe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ge("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 小于 &lt;
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdLt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            lt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 小于等于 &lt;=
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdLe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        if(fkMcMachineIdStart!=null && fkMcMachineIdEnd!=null){
            between("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        if(fkMcMachineIdStart!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '%值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT LIKE '%值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '%值'
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeRight("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_machine_id",value);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_machine_id",value);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 等于 =
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdEq(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            eq("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdNe(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            ne("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 大于 &gt;
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdGt(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            gt("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 大于等于 &gt;=
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdGe(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            ge("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 小于 &lt;
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdLt(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            lt("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 小于等于 &lt;=
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdLe(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            le("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceSubtaskRecordIdStart       值1
     * @param fkMcUpdateDeviceSubtaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdBetween(Long fkMcUpdateDeviceSubtaskRecordIdStart,Long fkMcUpdateDeviceSubtaskRecordIdEnd){
        if(fkMcUpdateDeviceSubtaskRecordIdStart!=null && fkMcUpdateDeviceSubtaskRecordIdEnd!=null){
            between("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordIdStart,fkMcUpdateDeviceSubtaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceSubtaskRecordIdStart       值1
     * @param fkMcUpdateDeviceSubtaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdNotBetween(Long fkMcUpdateDeviceSubtaskRecordIdStart,Long fkMcUpdateDeviceSubtaskRecordIdEnd){
        if(fkMcUpdateDeviceSubtaskRecordIdStart!=null && fkMcUpdateDeviceSubtaskRecordIdEnd!=null){
            notBetween("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordIdStart,fkMcUpdateDeviceSubtaskRecordIdEnd);
        }
        return this;
     }


    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '%值%'
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdLike(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            like("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT LIKE '%值%'
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdNotLike(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            notLike("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }


    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '%值'
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdLikeLeft(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            likeLeft("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '值%'
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdLikeRight(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            likeRight("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdIsNull(){
        isNull("fk_mc_update_device_subtask_record_id");
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdIsNotNull(){
        isNotNull("fk_mc_update_device_subtask_record_id");
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_update_device_subtask_record_id",value);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_update_device_subtask_record_id",values);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_update_device_subtask_record_id",value);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper fkMcUpdateDeviceSubtaskRecordIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_subtask_record_id",values);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 等于 =
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 不等于 &lt;&gt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 大于 &gt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 大于等于 &gt;=
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 小于 &lt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 小于等于 &lt;=
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '%值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT LIKE '%值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '%值'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeLikeRight(Integer type){
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("type",value);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeIn(Integer... values){
        if(values!=null && values.length>0){
            in("type",values);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("type",value);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdEq(String deviceId){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdNe(String deviceId){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdGt(String deviceId){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdGe(String deviceId){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdLt(String deviceId){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdLike(String deviceId){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdNotLike(String deviceId){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdLikeLeft(String deviceId){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdLikeRight(String deviceId){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdIn(String... values){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备实例Id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>设备实例Id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 等于 =
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgEq(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgNe(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgGt(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgGe(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgLt(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgLe(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgLike(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgNotLike(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgLikeLeft(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgLikeRight(String executeMsg){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgIn(String... values){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 等于 =
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeEq(Date taskStartTime){
        if(taskStartTime!=null){
            eq("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 不等于 &lt;&gt;
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeNe(Date taskStartTime){
        if(taskStartTime!=null){
            ne("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 大于 &gt;
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeGt(Date taskStartTime){
        if(taskStartTime!=null){
            gt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 大于等于 &gt;=
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeGe(Date taskStartTime){
        if(taskStartTime!=null){
            ge("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 小于 &lt;
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeLt(Date taskStartTime){
        if(taskStartTime!=null){
            lt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 小于等于 &lt;=
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeLe(Date taskStartTime){
        if(taskStartTime!=null){
            le("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * BETWEEN 值1 AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        if(taskStartTimeStart!=null && taskStartTimeEnd!=null){
            between("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeNotBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        if(taskStartTimeStart!=null && taskStartTimeEnd!=null){
            notBetween("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '%值%'
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeLike(Date taskStartTime){
        if(taskStartTime!=null){
            like("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT LIKE '%值%'
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeNotLike(Date taskStartTime){
        if(taskStartTime!=null){
            notLike("task_start_time",taskStartTime);
        }
        return this;
     }


    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '%值'
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeLikeLeft(Date taskStartTime){
        if(taskStartTime!=null){
            likeLeft("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '值%'
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeLikeRight(Date taskStartTime){
        if(taskStartTime!=null){
            likeRight("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeIsNull(){
        isNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeIsNotNull(){
        isNotNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper taskStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 等于 =
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateEq(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            eq("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 不等于 &lt;&gt;
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateNe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ne("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于 &gt;
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateGt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            gt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于等于 &gt;=
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateGe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ge("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于 &lt;
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateLt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            lt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于等于 &lt;=
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateLe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            le("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        if(waitOverStartDateStart!=null && waitOverStartDateEnd!=null){
            between("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateNotBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        if(waitOverStartDateStart!=null && waitOverStartDateEnd!=null){
            notBetween("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            like("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT LIKE '%值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateNotLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            notLike("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值'
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateLikeLeft(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeLeft("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateLikeRight(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeRight("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateIsNull(){
        isNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateIsNotNull(){
        isNotNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("wait_over_start_date",value);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateIn(Date... values){
        if(values!=null && values.length>0){
            in("wait_over_start_date",values);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("wait_over_start_date",value);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper waitOverStartDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("wait_over_start_date",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 等于 =
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeEq(Date startTime){
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 不等于 &lt;&gt;
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeNe(Date startTime){
        if(startTime!=null){
            ne("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 大于 &gt;
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeGt(Date startTime){
        if(startTime!=null){
            gt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 大于等于 &gt;=
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeGe(Date startTime){
        if(startTime!=null){
            ge("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 小于 &lt;
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeLt(Date startTime){
        if(startTime!=null){
            lt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 小于等于 &lt;=
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeLe(Date startTime){
        if(startTime!=null){
            le("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            between("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeNotBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            notBetween("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeLike(Date startTime){
        if(startTime!=null){
            like("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeNotLike(Date startTime){
        if(startTime!=null){
            notLike("start_time",startTime);
        }
        return this;
     }


    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '%值'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeLikeLeft(Date startTime){
        if(startTime!=null){
            likeLeft("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeLikeRight(Date startTime){
        if(startTime!=null){
            likeRight("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeIsNull(){
        isNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeIsNotNull(){
        isNotNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper startTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("start_time",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper statusNotIn(Integer... values){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdEq(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdNe(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdGt(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdGe(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdLt(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdLe(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdLike(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdNotLike(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdLikeLeft(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdLikeRight(Long versionId){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper versionIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdIn(Long... values){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper versionIdNotIn(Long... values){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper createTimeNotIn(Date... values){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
