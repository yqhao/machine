package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.suqi.center.machine.dao.entity.EmSocDeviceCmdRebootLastRecord;

import java.util.Collection;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 * "em_soc_device_cmd_reboot_last_record"
 * @author Administrator
 */
public class EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper extends UpdateWrapper<EmSocDeviceCmdRebootLastRecord> {

    public static EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper wrapper(EmSocDeviceCmdRebootLastRecord entity) {
        return new EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper(entity);
    }

    private EmSocDeviceCmdRebootLastRecord entity;

    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper(EmSocDeviceCmdRebootLastRecord entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 最后下发重启指令的时间(非云机重连上报的时间)
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setLastCmdReboot(Date lastCmdReboot) {
         set("last_cmd_reboot",lastCmdReboot);
        return this;
    }
    /**
     * 
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setType(Integer type) {
         set("type",type);
        return this;
    }
    /**
     * 操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setOptRole(Integer optRole) {
         set("opt_role",optRole);
        return this;
    }

    protected EmSocDeviceCmdRebootLastRecord entity() {
        if(entity==null){
            throw new NullPointerException("EmSocDeviceCmdRebootLastRecord is null");
        }
        return entity;
    }

    /**
     * 
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 最后下发重启指令的时间(非云机重连上报的时间)
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setLastCmdReboot() {
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            set("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }
    /**
     * 
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setType() {
        Integer type =entity().getType();
        if(type!=null){
            set("type",type);
        }
        return this;
    }
    /**
     * 操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper setOptRole() {
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            set("opt_role",optRole);
        }
        return this;
    }
    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idEq(){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idNe(){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idGt(){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idGe(){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLt(){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idBetween(Long idEnd){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLikeRight(){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idEq(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idNe(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idGt(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idGe(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLt(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLe(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLike(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idNotLike(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLikeLeft(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idLikeRight(Long id){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idIn(Long... values){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdEq(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdIn(String... values){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 等于 = entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootEq(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            eq("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 不等于 &lt;&gt; entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootNe(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            ne("last_cmd_reboot",lastCmdReboot);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 大于 &gt; entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootGt(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            gt("last_cmd_reboot",lastCmdReboot);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 大于等于 &gt;= entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootGe(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            ge("last_cmd_reboot",lastCmdReboot);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 小于 &lt; entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLt(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            lt("last_cmd_reboot",lastCmdReboot);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 小于等于 &lt;= entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLe(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            le("last_cmd_reboot",lastCmdReboot);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * BETWEEN  entity().getLastCmdReboot() AND 值2
     * @param lastCmdRebootEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootBetween(Date lastCmdRebootEnd){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null && lastCmdRebootEnd!=null){
            between("last_cmd_reboot",lastCmdReboot,lastCmdRebootEnd);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * NOT BETWEEN  entity().getLastCmdReboot() AND 值2
     * @param lastCmdRebootEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootNotBetween(Date lastCmdRebootEnd){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null && lastCmdRebootEnd!=null){
            notBetween("last_cmd_reboot",lastCmdReboot,lastCmdRebootEnd);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * BETWEEN  entity().getLastCmdReboot() AND 值2
     * @param lastCmdRebootStart       值1
     * @param lastCmdRebootEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootBetween(Date lastCmdRebootStart,Date lastCmdRebootEnd){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null && lastCmdRebootEnd!=null){
            between("last_cmd_reboot",lastCmdRebootStart,lastCmdRebootEnd);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * NOT BETWEEN  entity().getLastCmdReboot() AND 值2
     * @param lastCmdRebootStart       值1
     * @param lastCmdRebootEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootNotBetween(Date lastCmdRebootStart,Date lastCmdRebootEnd){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null && lastCmdRebootEnd!=null){
            notBetween("last_cmd_reboot",lastCmdRebootStart,lastCmdRebootEnd);
        }
        return this;
     }


    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * LIKE '%值%' entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLike(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            like("last_cmd_reboot",lastCmdReboot);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * NOT LIKE '%值%' entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootNotLike(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            notLike("last_cmd_reboot",lastCmdReboot);
        }
        return this;
     }


    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * LIKE '%值' entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLikeLeft(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            likeLeft("last_cmd_reboot",lastCmdReboot);
        }
        return this;
     }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * LIKE '值%' entity().getLastCmdReboot()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLikeRight(){
        Date lastCmdReboot =entity().getLastCmdReboot();
        if(lastCmdReboot!=null){
            likeRight("last_cmd_reboot",lastCmdReboot);
        }
        return this;
     }

/**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 等于 =
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootEq(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            eq("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 不等于 &lt;&gt;
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootNe(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            ne("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 大于 &gt;
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootGt(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            gt("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 大于等于 &gt;=
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootGe(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            ge("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 小于 &lt;
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLt(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            lt("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * 小于等于 &lt;=
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLe(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            le("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * LIKE '%值%'
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLike(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            like("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * NOT LIKE '%值%'
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootNotLike(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            notLike("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }


    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * LIKE '%值'
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLikeLeft(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            likeLeft("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * LIKE '值%'
     * @param lastCmdReboot       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootLikeRight(Date lastCmdReboot){
        if(lastCmdReboot!=null){
            likeRight("last_cmd_reboot",lastCmdReboot);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootIsNull(){
        isNull("last_cmd_reboot");
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootIsNotNull(){
        isNotNull("last_cmd_reboot");
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_cmd_reboot",value);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootIn(Date... values){
        if(values!=null && values.length>0){
            in("last_cmd_reboot",values);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_cmd_reboot",value);
        }
        return this;
    }

    /**
     * <p>最后下发重启指令的时间(非云机重连上报的时间)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper lastCmdRebootNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_cmd_reboot",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeIn(Date... values){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 等于 = entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeEq(){
        Integer type =entity().getType();
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 不等于 &lt;&gt; entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeNe(){
        Integer type =entity().getType();
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 大于 &gt; entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeGt(){
        Integer type =entity().getType();
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 大于等于 &gt;= entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeGe(){
        Integer type =entity().getType();
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 小于 &lt; entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLt(){
        Integer type =entity().getType();
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 小于等于 &lt;= entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLe(){
        Integer type =entity().getType();
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * BETWEEN  entity().getType() AND 值2
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",type,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeNotBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",type,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值%' entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLike(){
        Integer type =entity().getType();
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT LIKE '%值%' entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeNotLike(){
        Integer type =entity().getType();
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值' entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLikeLeft(){
        Integer type =entity().getType();
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '值%' entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLikeRight(){
        Integer type =entity().getType();
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

/**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 等于 =
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 不等于 &lt;&gt;
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 大于 &gt;
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 大于等于 &gt;=
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 小于 &lt;
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 小于等于 &lt;=
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值%'
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT LIKE '%值%'
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
    }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值'
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '值%'
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeLikeRight(Integer type){
        if(type!=null){
            likeRight("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("type",value);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeIn(Integer... values){
        if(values!=null && values.length>0){
            in("type",values);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("type",value);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 等于 = entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleEq(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            eq("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 不等于 &lt;&gt; entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleNe(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            ne("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 大于 &gt; entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleGt(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            gt("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 大于等于 &gt;= entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleGe(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            ge("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 小于 &lt; entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLt(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            lt("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 小于等于 &lt;= entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLe(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            le("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * BETWEEN  entity().getOptRole() AND 值2
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleBetween(Integer optRoleEnd){
        Integer optRole =entity().getOptRole();
        if(optRole!=null && optRoleEnd!=null){
            between("opt_role",optRole,optRoleEnd);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT BETWEEN  entity().getOptRole() AND 值2
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleNotBetween(Integer optRoleEnd){
        Integer optRole =entity().getOptRole();
        if(optRole!=null && optRoleEnd!=null){
            notBetween("opt_role",optRole,optRoleEnd);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * BETWEEN  entity().getOptRole() AND 值2
     * @param optRoleStart       值1
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleBetween(Integer optRoleStart,Integer optRoleEnd){
        Integer optRole =entity().getOptRole();
        if(optRole!=null && optRoleEnd!=null){
            between("opt_role",optRoleStart,optRoleEnd);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT BETWEEN  entity().getOptRole() AND 值2
     * @param optRoleStart       值1
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleNotBetween(Integer optRoleStart,Integer optRoleEnd){
        Integer optRole =entity().getOptRole();
        if(optRole!=null && optRoleEnd!=null){
            notBetween("opt_role",optRoleStart,optRoleEnd);
        }
        return this;
     }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值%' entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLike(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            like("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT LIKE '%值%' entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleNotLike(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            notLike("opt_role",optRole);
        }
        return this;
     }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值' entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLikeLeft(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            likeLeft("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '值%' entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLikeRight(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            likeRight("opt_role",optRole);
        }
        return this;
     }

/**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 等于 =
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleEq(Integer optRole){
        if(optRole!=null){
            eq("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 不等于 &lt;&gt;
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleNe(Integer optRole){
        if(optRole!=null){
            ne("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 大于 &gt;
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleGt(Integer optRole){
        if(optRole!=null){
            gt("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 大于等于 &gt;=
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleGe(Integer optRole){
        if(optRole!=null){
            ge("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 小于 &lt;
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLt(Integer optRole){
        if(optRole!=null){
            lt("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 小于等于 &lt;=
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLe(Integer optRole){
        if(optRole!=null){
            le("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值%'
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLike(Integer optRole){
        if(optRole!=null){
            like("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT LIKE '%值%'
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleNotLike(Integer optRole){
        if(optRole!=null){
            notLike("opt_role",optRole);
        }
        return this;
    }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值'
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLikeLeft(Integer optRole){
        if(optRole!=null){
            likeLeft("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '值%'
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleLikeRight(Integer optRole){
        if(optRole!=null){
            likeRight("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleIsNull(){
        isNull("opt_role");
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleIsNotNull(){
        isNotNull("opt_role");
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("opt_role",value);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleIn(Integer... values){
        if(values!=null && values.length>0){
            in("opt_role",values);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("opt_role",value);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper optRoleNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("opt_role",values);
        }
        return this;
    }


}
