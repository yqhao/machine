package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.TencentDeviceAccessInfo;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 腾讯设备公网映射表
 * </p>
 * "tencent_device_access_info"
 * @author PC001
 */
public class TencentDeviceAccessInfoQueryWrapper extends QueryWrapper<TencentDeviceAccessInfo> {


    public static TencentDeviceAccessInfoQueryWrapper wrapper() {
        return new TencentDeviceAccessInfoQueryWrapper();
    }

    public TencentDeviceAccessInfoQueryWrapper() {
        super();
    }

    public TencentDeviceAccessInfoQueryWrapper(TencentDeviceAccessInfo entity) {
        super(entity);
    }

    public TencentDeviceAccessInfoQueryWrapper(TencentDeviceAccessInfo entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public TencentDeviceAccessInfoQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public TencentDeviceAccessInfoQueryWrapper selectColumns(Consumer<TencentDeviceAccessInfoSelect> consumer) {
        TencentDeviceAccessInfoSelect select = new TencentDeviceAccessInfoSelect();
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
    public TencentDeviceAccessInfoQueryWrapper idEq(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idNe(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idGt(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idGe(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idLt(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idLe(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentDeviceAccessInfoQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentDeviceAccessInfoQueryWrapper idLike(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idNotLike(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idLikeLeft(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idLikeRight(Long id){
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
    public TencentDeviceAccessInfoQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper idIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoQueryWrapper idIn(Long... values){
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
    public TencentDeviceAccessInfoQueryWrapper idNotIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * 等于 =
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdEq(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            eq("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * 不等于 &lt;&gt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdNe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ne("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于 &gt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdGt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            gt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于等于 &gt;=
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdGe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ge("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于 &lt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdLt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            lt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于等于 &lt;=
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdLe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        if(fkTencentDeviceIdStart!=null && fkTencentDeviceIdEnd!=null){
            between("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        if(fkTencentDeviceIdStart!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT LIKE '%值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdNotLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }


    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdLikeLeft(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * LIKE '值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdLikeRight(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeRight("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdIsNull(){
        isNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdIsNotNull(){
        isNotNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_device_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_device_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_device_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper fkTencentDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_device_id",values);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例ID</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例ID</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * 等于 =
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpEq(String serverIp){
        if(serverIp!=null){
            eq("server_ip",serverIp);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * 不等于 &lt;&gt;
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpNe(String serverIp){
        if(serverIp!=null){
            ne("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于 &gt;
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpGt(String serverIp){
        if(serverIp!=null){
            gt("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于等于 &gt;=
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpGe(String serverIp){
        if(serverIp!=null){
            ge("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于 &lt;
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpLt(String serverIp){
        if(serverIp!=null){
            lt("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于等于 &lt;=
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpLe(String serverIp){
        if(serverIp!=null){
            le("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * BETWEEN 值1 AND 值2
     * @param serverIpStart       值1
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpBetween(String serverIpStart,String serverIpEnd){
        if(serverIpStart!=null && serverIpEnd!=null){
            between("server_ip",serverIpStart,serverIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverIpStart       值1
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpNotBetween(String serverIpStart,String serverIpEnd){
        if(serverIpStart!=null && serverIpEnd!=null){
            notBetween("server_ip",serverIpStart,serverIpEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值%'
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpLike(String serverIp){
        if(serverIp!=null){
            like("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT LIKE '%值%'
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpNotLike(String serverIp){
        if(serverIp!=null){
            notLike("server_ip",serverIp);
        }
        return this;
     }


    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值'
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpLikeLeft(String serverIp){
        if(serverIp!=null){
            likeLeft("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * LIKE '值%'
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpLikeRight(String serverIp){
        if(serverIp!=null){
            likeRight("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpIsNull(){
        isNull("server_ip");
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpIsNotNull(){
        isNotNull("server_ip");
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("server_ip",value);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpIn(String... values){
        if(values!=null && values.length>0){
            in("server_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_ip",value);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("server_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * 等于 =
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortEq(Integer serverPort){
        if(serverPort!=null){
            eq("server_port",serverPort);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * 不等于 &lt;&gt;
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortNe(Integer serverPort){
        if(serverPort!=null){
            ne("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于 &gt;
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortGt(Integer serverPort){
        if(serverPort!=null){
            gt("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于等于 &gt;=
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortGe(Integer serverPort){
        if(serverPort!=null){
            ge("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于 &lt;
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortLt(Integer serverPort){
        if(serverPort!=null){
            lt("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于等于 &lt;=
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortLe(Integer serverPort){
        if(serverPort!=null){
            le("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * BETWEEN 值1 AND 值2
     * @param serverPortStart       值1
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortBetween(Integer serverPortStart,Integer serverPortEnd){
        if(serverPortStart!=null && serverPortEnd!=null){
            between("server_port",serverPortStart,serverPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverPortStart       值1
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortNotBetween(Integer serverPortStart,Integer serverPortEnd){
        if(serverPortStart!=null && serverPortEnd!=null){
            notBetween("server_port",serverPortStart,serverPortEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值%'
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortLike(Integer serverPort){
        if(serverPort!=null){
            like("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT LIKE '%值%'
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortNotLike(Integer serverPort){
        if(serverPort!=null){
            notLike("server_port",serverPort);
        }
        return this;
     }


    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值'
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortLikeLeft(Integer serverPort){
        if(serverPort!=null){
            likeLeft("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * LIKE '值%'
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortLikeRight(Integer serverPort){
        if(serverPort!=null){
            likeRight("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortIsNull(){
        isNull("server_port");
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortIsNotNull(){
        isNotNull("server_port");
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("server_port",value);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("server_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_port",value);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper serverPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 等于 =
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpEq(String publicIp){
        if(publicIp!=null){
            eq("public_ip",publicIp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 不等于 &lt;&gt;
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpNe(String publicIp){
        if(publicIp!=null){
            ne("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于 &gt;
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpGt(String publicIp){
        if(publicIp!=null){
            gt("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于等于 &gt;=
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpGe(String publicIp){
        if(publicIp!=null){
            ge("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于 &lt;
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpLt(String publicIp){
        if(publicIp!=null){
            lt("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于等于 &lt;=
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpLe(String publicIp){
        if(publicIp!=null){
            le("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * BETWEEN 值1 AND 值2
     * @param publicIpStart       值1
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpBetween(String publicIpStart,String publicIpEnd){
        if(publicIpStart!=null && publicIpEnd!=null){
            between("public_ip",publicIpStart,publicIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT BETWEEN 值1 AND 值2
     * @param publicIpStart       值1
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpNotBetween(String publicIpStart,String publicIpEnd){
        if(publicIpStart!=null && publicIpEnd!=null){
            notBetween("public_ip",publicIpStart,publicIpEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值%'
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpLike(String publicIp){
        if(publicIp!=null){
            like("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT LIKE '%值%'
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpNotLike(String publicIp){
        if(publicIp!=null){
            notLike("public_ip",publicIp);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值'
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpLikeLeft(String publicIp){
        if(publicIp!=null){
            likeLeft("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '值%'
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpLikeRight(String publicIp){
        if(publicIp!=null){
            likeRight("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpIsNull(){
        isNull("public_ip");
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpIsNotNull(){
        isNotNull("public_ip");
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("public_ip",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpIn(String... values){
        if(values!=null && values.length>0){
            in("public_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("public_ip",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("public_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * 等于 =
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortEq(Integer publicPort){
        if(publicPort!=null){
            eq("public_port",publicPort);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * 不等于 &lt;&gt;
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortNe(Integer publicPort){
        if(publicPort!=null){
            ne("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于 &gt;
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortGt(Integer publicPort){
        if(publicPort!=null){
            gt("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于等于 &gt;=
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortGe(Integer publicPort){
        if(publicPort!=null){
            ge("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于 &lt;
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortLt(Integer publicPort){
        if(publicPort!=null){
            lt("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于等于 &lt;=
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortLe(Integer publicPort){
        if(publicPort!=null){
            le("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * BETWEEN 值1 AND 值2
     * @param publicPortStart       值1
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortBetween(Integer publicPortStart,Integer publicPortEnd){
        if(publicPortStart!=null && publicPortEnd!=null){
            between("public_port",publicPortStart,publicPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT BETWEEN 值1 AND 值2
     * @param publicPortStart       值1
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortNotBetween(Integer publicPortStart,Integer publicPortEnd){
        if(publicPortStart!=null && publicPortEnd!=null){
            notBetween("public_port",publicPortStart,publicPortEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值%'
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortLike(Integer publicPort){
        if(publicPort!=null){
            like("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT LIKE '%值%'
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortNotLike(Integer publicPort){
        if(publicPort!=null){
            notLike("public_port",publicPort);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值'
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortLikeLeft(Integer publicPort){
        if(publicPort!=null){
            likeLeft("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '值%'
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortLikeRight(Integer publicPort){
        if(publicPort!=null){
            likeRight("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortIsNull(){
        isNull("public_port");
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortIsNotNull(){
        isNotNull("public_port");
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("public_port",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("public_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("public_port",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper publicPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("public_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 等于 =
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispEq(String isp){
        if(isp!=null){
            eq("isp",isp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 不等于 &lt;&gt;
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispNe(String isp){
        if(isp!=null){
            ne("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于 &gt;
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispGt(String isp){
        if(isp!=null){
            gt("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于等于 &gt;=
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispGe(String isp){
        if(isp!=null){
            ge("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于 &lt;
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispLt(String isp){
        if(isp!=null){
            lt("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于等于 &lt;=
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispLe(String isp){
        if(isp!=null){
            le("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * BETWEEN 值1 AND 值2
     * @param ispStart       值1
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispBetween(String ispStart,String ispEnd){
        if(ispStart!=null && ispEnd!=null){
            between("isp",ispStart,ispEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param ispStart       值1
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispNotBetween(String ispStart,String ispEnd){
        if(ispStart!=null && ispEnd!=null){
            notBetween("isp",ispStart,ispEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值%'
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispLike(String isp){
        if(isp!=null){
            like("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT LIKE '%值%'
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispNotLike(String isp){
        if(isp!=null){
            notLike("isp",isp);
        }
        return this;
     }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值'
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispLikeLeft(String isp){
        if(isp!=null){
            likeLeft("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '值%'
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispLikeRight(String isp){
        if(isp!=null){
            likeRight("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispIsNull(){
        isNull("isp");
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispIsNotNull(){
        isNotNull("isp");
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("isp",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispIn(String... values){
        if(values!=null && values.length>0){
            in("isp",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("isp",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper ispNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("isp",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper createTimeEq(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeNe(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeGt(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeGe(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeLt(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeLe(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeLike(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeNotLike(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeLikeLeft(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeLikeRight(Date createTime){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper createTimeIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeIn(Date... values){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeIn(Date... values){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
