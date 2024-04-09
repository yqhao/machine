package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.SysOtaRecord;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 
 * </p>
 * "sys_ota_record"
 * @author PC001
 */
public class SysOtaRecordUpdateWrapper extends UpdateWrapper<SysOtaRecord> {

    public static SysOtaRecordUpdateWrapper wrapper() {
        return new SysOtaRecordUpdateWrapper();
    }

    public SysOtaRecordUpdateWrapper() {
        super();
    }

    public SysOtaRecordUpdateWrapper(SysOtaRecord entity) {
        super(entity);
    }

    /**
     * 
     */
    public SysOtaRecordUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public SysOtaRecordUpdateWrapper setFkSysOtaId(Long fkSysOtaId) {
         set("fk_sys_ota_id",fkSysOtaId);
        return this;
    }
    /**
     * 
     */
    public SysOtaRecordUpdateWrapper setFkSysOtaObsId(Long fkSysOtaObsId) {
         set("fk_sys_ota_obs_id",fkSysOtaObsId);
        return this;
    }
    /**
     * 
     */
    public SysOtaRecordUpdateWrapper setFkEmSocDevicesId(Long fkEmSocDevicesId) {
         set("fk_em_soc_devices_id",fkEmSocDevicesId);
        return this;
    }
    /**
     * 1：系统调用，2：商户调用
     */
    public SysOtaRecordUpdateWrapper setType(Integer type) {
         set("type",type);
        return this;
    }
    /**
     * 
     */
    public SysOtaRecordUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）
     */
    public SysOtaRecordUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 
     */
    public SysOtaRecordUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 
     */
    public SysOtaRecordUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public SysOtaRecordUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 
     */
    public SysOtaRecordUpdateWrapper setExecuteMsg(String executeMsg) {
         set("execute_msg",executeMsg);
        return this;
    }
    /**
     * 任务开始时间
     */
    public SysOtaRecordUpdateWrapper setTaskStartTime(Date taskStartTime) {
         set("task_start_time",taskStartTime);
        return this;
    }
    /**
     * 最后job_id
     */
    public SysOtaRecordUpdateWrapper setJobId(String jobId) {
         set("job_id",jobId);
        return this;
    }
    /**
     * ota更新预置应用ID
     */
    public SysOtaRecordUpdateWrapper setFkSysOtaPreinstalledAppsId(Long fkSysOtaPreinstalledAppsId) {
         set("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        return this;
    }
    /**
     * 具体设备的开始执行时间
     */
    public SysOtaRecordUpdateWrapper setStartTime(Date startTime) {
         set("start_time",startTime);
        return this;
    }
    /**
     * 等待执行开始时间
     */
    public SysOtaRecordUpdateWrapper setWaitOverStartDate(Date waitOverStartDate) {
         set("wait_over_start_date",waitOverStartDate);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper idLikeRight(Long id){
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
    public SysOtaRecordUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper idIn(Collection<Long> value){
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
    public SysOtaRecordUpdateWrapper idIn(Long... values){
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
    public SysOtaRecordUpdateWrapper idNotIn(Collection<Long> value){
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
    public SysOtaRecordUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdEq(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            eq("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdNe(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            ne("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdGt(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            gt("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdGe(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            ge("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdLt(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            lt("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdLe(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            le("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkSysOtaIdStart       值1
     * @param fkSysOtaIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdBetween(Long fkSysOtaIdStart,Long fkSysOtaIdEnd){
        if(fkSysOtaIdStart!=null && fkSysOtaIdEnd!=null){
            between("fk_sys_ota_id",fkSysOtaIdStart,fkSysOtaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkSysOtaIdStart       值1
     * @param fkSysOtaIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdNotBetween(Long fkSysOtaIdStart,Long fkSysOtaIdEnd){
        if(fkSysOtaIdStart!=null && fkSysOtaIdEnd!=null){
            notBetween("fk_sys_ota_id",fkSysOtaIdStart,fkSysOtaIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdLike(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            like("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdNotLike(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            notLike("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdLikeLeft(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            likeLeft("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' fkSysOtaId
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdLikeRight(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            likeRight("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdIsNull(){
        isNull("fk_sys_ota_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdIsNotNull(){
        isNotNull("fk_sys_ota_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_ota_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_ota_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_ota_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_ota_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdEq(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            eq("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdNe(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            ne("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdGt(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            gt("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdGe(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            ge("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdLt(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            lt("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdLe(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            le("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkSysOtaObsIdStart       值1
     * @param fkSysOtaObsIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdBetween(Long fkSysOtaObsIdStart,Long fkSysOtaObsIdEnd){
        if(fkSysOtaObsIdStart!=null && fkSysOtaObsIdEnd!=null){
            between("fk_sys_ota_obs_id",fkSysOtaObsIdStart,fkSysOtaObsIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkSysOtaObsIdStart       值1
     * @param fkSysOtaObsIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdNotBetween(Long fkSysOtaObsIdStart,Long fkSysOtaObsIdEnd){
        if(fkSysOtaObsIdStart!=null && fkSysOtaObsIdEnd!=null){
            notBetween("fk_sys_ota_obs_id",fkSysOtaObsIdStart,fkSysOtaObsIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdLike(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            like("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdNotLike(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            notLike("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdLikeLeft(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            likeLeft("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' fkSysOtaObsId
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdLikeRight(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            likeRight("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdIsNull(){
        isNull("fk_sys_ota_obs_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdIsNotNull(){
        isNotNull("fk_sys_ota_obs_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_ota_obs_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_ota_obs_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_ota_obs_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaObsIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_ota_obs_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        if(fkEmSocDevicesIdStart!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        if(fkEmSocDevicesIdStart!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeRight("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 等于 = type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 不等于 &lt;&gt; type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 大于 &gt; type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 大于等于 &gt;= type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 小于 &lt; type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 小于等于 &lt;= type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '%值%' type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT LIKE '%值%' type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '%值' type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '值%' type
     * @param type       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeLikeRight(Integer type){
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("type",value);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeIn(Integer... values){
        if(values!=null && values.length>0){
            in("type",values);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("type",value);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' versionId
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgEq(String executeMsg){
        if(executeMsg!=null){
            eq("execute_msg",executeMsg);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgNe(String executeMsg){
        if(executeMsg!=null){
            ne("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgGt(String executeMsg){
        if(executeMsg!=null){
            gt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgGe(String executeMsg){
        if(executeMsg!=null){
            ge("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgLt(String executeMsg){
        if(executeMsg!=null){
            lt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgLe(String executeMsg){
        if(executeMsg!=null){
            le("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
        if(executeMsgStart!=null && executeMsgEnd!=null){
            between("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
        if(executeMsgStart!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgLike(String executeMsg){
        if(executeMsg!=null){
            like("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgNotLike(String executeMsg){
        if(executeMsg!=null){
            notLike("execute_msg",executeMsg);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgLikeLeft(String executeMsg){
        if(executeMsg!=null){
            likeLeft("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' executeMsg
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgLikeRight(String executeMsg){
        if(executeMsg!=null){
            likeRight("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("execute_msg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgIn(String... values){
        if(values!=null && values.length>0){
            in("execute_msg",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("execute_msg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 等于 = taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeEq(Date taskStartTime){
        if(taskStartTime!=null){
            eq("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 不等于 &lt;&gt; taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeNe(Date taskStartTime){
        if(taskStartTime!=null){
            ne("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于 &gt; taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeGt(Date taskStartTime){
        if(taskStartTime!=null){
            gt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于等于 &gt;= taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeGe(Date taskStartTime){
        if(taskStartTime!=null){
            ge("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于 &lt; taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeLt(Date taskStartTime){
        if(taskStartTime!=null){
            lt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于等于 &lt;= taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeLe(Date taskStartTime){
        if(taskStartTime!=null){
            le("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        if(taskStartTimeStart!=null && taskStartTimeEnd!=null){
            between("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeNotBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        if(taskStartTimeStart!=null && taskStartTimeEnd!=null){
            notBetween("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值%' taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeLike(Date taskStartTime){
        if(taskStartTime!=null){
            like("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT LIKE '%值%' taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeNotLike(Date taskStartTime){
        if(taskStartTime!=null){
            notLike("task_start_time",taskStartTime);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值' taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeLikeLeft(Date taskStartTime){
        if(taskStartTime!=null){
            likeLeft("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * LIKE '值%' taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeLikeRight(Date taskStartTime){
        if(taskStartTime!=null){
            likeRight("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeIsNull(){
        isNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeIsNotNull(){
        isNotNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper taskStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * 等于 = jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdEq(String jobId){
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * 不等于 &lt;&gt; jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdNe(String jobId){
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 大于 &gt; jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdGt(String jobId){
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 大于等于 &gt;= jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdGe(String jobId){
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 小于 &lt; jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdLt(String jobId){
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 小于等于 &lt;= jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdLe(String jobId){
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            between("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>最后job_id</p>
     * LIKE '%值%' jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdLike(String jobId){
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * NOT LIKE '%值%' jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdNotLike(String jobId){
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>最后job_id</p>
     * LIKE '%值' jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdLikeLeft(String jobId){
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * LIKE '值%' jobId
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdLikeRight(String jobId){
        if(jobId!=null){
            likeRight("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>最后job_id</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>最后job_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdIn(String... values){
        if(values!=null && values.length>0){
            in("job_id",values);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper jobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("job_id",values);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * 等于 = fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdEq(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            eq("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * 不等于 &lt;&gt; fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdNe(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            ne("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 大于 &gt; fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdGt(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            gt("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 大于等于 &gt;= fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdGe(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            ge("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 小于 &lt; fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdLt(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            lt("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 小于等于 &lt;= fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdLe(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            le("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * BETWEEN 值1 AND 值2
     * @param fkSysOtaPreinstalledAppsIdStart       值1
     * @param fkSysOtaPreinstalledAppsIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdBetween(Long fkSysOtaPreinstalledAppsIdStart,Long fkSysOtaPreinstalledAppsIdEnd){
        if(fkSysOtaPreinstalledAppsIdStart!=null && fkSysOtaPreinstalledAppsIdEnd!=null){
            between("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsIdStart,fkSysOtaPreinstalledAppsIdEnd);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkSysOtaPreinstalledAppsIdStart       值1
     * @param fkSysOtaPreinstalledAppsIdEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdNotBetween(Long fkSysOtaPreinstalledAppsIdStart,Long fkSysOtaPreinstalledAppsIdEnd){
        if(fkSysOtaPreinstalledAppsIdStart!=null && fkSysOtaPreinstalledAppsIdEnd!=null){
            notBetween("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsIdStart,fkSysOtaPreinstalledAppsIdEnd);
        }
        return this;
     }


    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '%值%' fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdLike(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            like("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT LIKE '%值%' fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdNotLike(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            notLike("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }


    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '%值' fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdLikeLeft(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            likeLeft("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '值%' fkSysOtaPreinstalledAppsId
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdLikeRight(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            likeRight("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdIsNull(){
        isNull("fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdIsNotNull(){
        isNotNull("fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_ota_preinstalled_apps_id",value);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_ota_preinstalled_apps_id",values);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_ota_preinstalled_apps_id",value);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper fkSysOtaPreinstalledAppsIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_ota_preinstalled_apps_id",values);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * 等于 = startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeEq(Date startTime){
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * 不等于 &lt;&gt; startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeNe(Date startTime){
        if(startTime!=null){
            ne("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 大于 &gt; startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeGt(Date startTime){
        if(startTime!=null){
            gt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 大于等于 &gt;= startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeGe(Date startTime){
        if(startTime!=null){
            ge("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 小于 &lt; startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeLt(Date startTime){
        if(startTime!=null){
            lt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 小于等于 &lt;= startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeLe(Date startTime){
        if(startTime!=null){
            le("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            between("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeNotBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            notBetween("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }


    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '%值%' startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeLike(Date startTime){
        if(startTime!=null){
            like("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT LIKE '%值%' startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeNotLike(Date startTime){
        if(startTime!=null){
            notLike("start_time",startTime);
        }
        return this;
     }


    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '%值' startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeLikeLeft(Date startTime){
        if(startTime!=null){
            likeLeft("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '值%' startTime
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeLikeRight(Date startTime){
        if(startTime!=null){
            likeRight("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeIsNull(){
        isNull("start_time");
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeIsNotNull(){
        isNotNull("start_time");
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("start_time",value);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("start_time",values);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("start_time",value);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper startTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("start_time",values);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 等于 = waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateEq(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            eq("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 不等于 &lt;&gt; waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateNe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ne("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于 &gt; waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateGt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            gt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于等于 &gt;= waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateGe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ge("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于 &lt; waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateLt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            lt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于等于 &lt;= waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateLe(Date waitOverStartDate){
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
    public SysOtaRecordUpdateWrapper waitOverStartDateBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
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
    public SysOtaRecordUpdateWrapper waitOverStartDateNotBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        if(waitOverStartDateStart!=null && waitOverStartDateEnd!=null){
            notBetween("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值%' waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            like("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT LIKE '%值%' waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateNotLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            notLike("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值' waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateLikeLeft(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeLeft("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '值%' waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateLikeRight(Date waitOverStartDate){
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
    public SysOtaRecordUpdateWrapper waitOverStartDateIsNull(){
        isNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateIsNotNull(){
        isNotNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordUpdateWrapper waitOverStartDateIn(Collection<Date> value){
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
    public SysOtaRecordUpdateWrapper waitOverStartDateIn(Date... values){
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
    public SysOtaRecordUpdateWrapper waitOverStartDateNotIn(Collection<Date> value){
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
    public SysOtaRecordUpdateWrapper waitOverStartDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("wait_over_start_date",values);
        }
        return this;
    }


}
