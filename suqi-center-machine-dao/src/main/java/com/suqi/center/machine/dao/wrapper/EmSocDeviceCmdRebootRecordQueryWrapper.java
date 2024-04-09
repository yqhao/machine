package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.EmSocDeviceCmdRebootRecord;

import java.util.Collection;
import java.util.Date;
import java.util.function.Consumer;


/**
 * <p>
 * 
 * </p>
 * "em_soc_device_cmd_reboot_record"
 * @author Administrator
 */
public class EmSocDeviceCmdRebootRecordQueryWrapper extends QueryWrapper<EmSocDeviceCmdRebootRecord> {


    public static EmSocDeviceCmdRebootRecordQueryWrapper wrapper() {
        return new EmSocDeviceCmdRebootRecordQueryWrapper();
    }

    public EmSocDeviceCmdRebootRecordQueryWrapper() {
        super();
    }

    public EmSocDeviceCmdRebootRecordQueryWrapper(EmSocDeviceCmdRebootRecord entity) {
        super(entity);
    }

    public EmSocDeviceCmdRebootRecordQueryWrapper(EmSocDeviceCmdRebootRecord entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public EmSocDeviceCmdRebootRecordQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public EmSocDeviceCmdRebootRecordQueryWrapper selectColumns(Consumer<EmSocDeviceCmdRebootRecordSelect> consumer) {
        EmSocDeviceCmdRebootRecordSelect select = new EmSocDeviceCmdRebootRecordSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper idEq(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idNe(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idGt(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idGe(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idLt(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idLe(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper idLike(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idNotLike(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idLikeLeft(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idLikeRight(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper idIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idIn(Long... values){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idNotIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * 不等于 &lt;&gt;
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 大于 &gt;
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 大于等于 &gt;=
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 小于 &lt;
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 小于等于 &lt;=
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>云机归属商户</p>
     * LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * NOT LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>云机归属商户</p>
     * LIKE '%值'
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * LIKE '值%'
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdLikeRight(Long fkMemberId){
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 等于 =
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper typeEq(Integer type){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeNe(Integer type){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeGt(Integer type){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeGe(Integer type){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeLt(Integer type){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper typeBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值%'
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper typeLike(Integer type){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeNotLike(Integer type){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeLikeLeft(Integer type){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeLikeRight(Integer type){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper typeIn(Collection<Integer> value){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeIn(Integer... values){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeNotIn(Collection<Integer> value){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 等于 =
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleEq(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleNe(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleGt(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleGe(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleLt(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleLe(Integer optRole){
        if(optRole!=null){
            le("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * BETWEEN 值1 AND 值2
     * @param optRoleStart       值1
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleBetween(Integer optRoleStart,Integer optRoleEnd){
        if(optRoleStart!=null && optRoleEnd!=null){
            between("opt_role",optRoleStart,optRoleEnd);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param optRoleStart       值1
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleNotBetween(Integer optRoleStart,Integer optRoleEnd){
        if(optRoleStart!=null && optRoleEnd!=null){
            notBetween("opt_role",optRoleStart,optRoleEnd);
        }
        return this;
     }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值%'
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleLike(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleNotLike(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleLikeLeft(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleLikeRight(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleIsNull(){
        isNull("opt_role");
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleIsNotNull(){
        isNotNull("opt_role");
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleIn(Collection<Integer> value){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleIn(Integer... values){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleNotIn(Collection<Integer> value){
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
    public EmSocDeviceCmdRebootRecordQueryWrapper optRoleNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("opt_role",values);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后重启时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>最后重启时间</p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


}
