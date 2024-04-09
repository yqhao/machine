package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentDeviceAccessInfo;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 腾讯设备公网映射表
 * </p>
 * "tencent_device_access_info"
 * @author PC001
 */
public class TencentDeviceAccessInfoUpdateWrapper extends UpdateWrapper<TencentDeviceAccessInfo> {

    public static TencentDeviceAccessInfoUpdateWrapper wrapper() {
        return new TencentDeviceAccessInfoUpdateWrapper();
    }

    public TencentDeviceAccessInfoUpdateWrapper() {
        super();
    }

    public TencentDeviceAccessInfoUpdateWrapper(TencentDeviceAccessInfo entity) {
        super(entity);
    }

    /**
     * 
     */
    public TencentDeviceAccessInfoUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 腾讯设备Id
     */
    public TencentDeviceAccessInfoUpdateWrapper setFkTencentDeviceId(Long fkTencentDeviceId) {
         set("fk_tencent_device_id",fkTencentDeviceId);
        return this;
    }
    /**
     * 实例ID
     */
    public TencentDeviceAccessInfoUpdateWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 云手机服务内网IP
     */
    public TencentDeviceAccessInfoUpdateWrapper setServerIp(String serverIp) {
         set("server_ip",serverIp);
        return this;
    }
    /**
     * 云手机服务监听端口
     */
    public TencentDeviceAccessInfoUpdateWrapper setServerPort(Integer serverPort) {
         set("server_port",serverPort);
        return this;
    }
    /**
     * 云手机服务公网映射 IP
     */
    public TencentDeviceAccessInfoUpdateWrapper setPublicIp(String publicIp) {
         set("public_ip",publicIp);
        return this;
    }
    /**
     * 云手机服务公网映射端口
     */
    public TencentDeviceAccessInfoUpdateWrapper setPublicPort(Integer publicPort) {
         set("public_port",publicPort);
        return this;
    }
    /**
     * 云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）
     */
    public TencentDeviceAccessInfoUpdateWrapper setIsp(String isp) {
         set("isp",isp);
        return this;
    }
    /**
     * 创建时间
     */
    public TencentDeviceAccessInfoUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public TencentDeviceAccessInfoUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper idEq(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idNe(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idGt(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idGe(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idLt(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idLe(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper idLike(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idNotLike(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idLikeLeft(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idLikeRight(Long id){
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
    public TencentDeviceAccessInfoUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper idIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoUpdateWrapper idIn(Long... values){
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
    public TencentDeviceAccessInfoUpdateWrapper idNotIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * 等于 = fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdEq(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            eq("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * 不等于 &lt;&gt; fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdNe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ne("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于 &gt; fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdGt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            gt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于等于 &gt;= fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdGe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ge("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于 &lt; fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdLt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            lt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于等于 &lt;= fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdLe(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        if(fkTencentDeviceIdStart!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值%' fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT LIKE '%值%' fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdNotLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }


    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值' fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdLikeLeft(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * LIKE '值%' fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdLikeRight(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdIsNull(){
        isNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdIsNotNull(){
        isNotNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdIn(Long... values){
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
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdNotIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoUpdateWrapper fkTencentDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_device_id",values);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * 等于 = instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * 不等于 &lt;&gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于 &gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于等于 &gt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于 &lt; instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于等于 &lt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdLe(String instanceId){
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
    public TencentDeviceAccessInfoUpdateWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例ID</p>
     * LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例ID</p>
     * LIKE '%值' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * LIKE '值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdLikeRight(String instanceId){
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
    public TencentDeviceAccessInfoUpdateWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper instanceIdIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateWrapper instanceIdIn(String... values){
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
    public TencentDeviceAccessInfoUpdateWrapper instanceIdNotIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * 等于 = serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpEq(String serverIp){
        if(serverIp!=null){
            eq("server_ip",serverIp);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * 不等于 &lt;&gt; serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpNe(String serverIp){
        if(serverIp!=null){
            ne("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于 &gt; serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpGt(String serverIp){
        if(serverIp!=null){
            gt("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于等于 &gt;= serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpGe(String serverIp){
        if(serverIp!=null){
            ge("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于 &lt; serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpLt(String serverIp){
        if(serverIp!=null){
            lt("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于等于 &lt;= serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpLe(String serverIp){
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
    public TencentDeviceAccessInfoUpdateWrapper serverIpBetween(String serverIpStart,String serverIpEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper serverIpNotBetween(String serverIpStart,String serverIpEnd){
        if(serverIpStart!=null && serverIpEnd!=null){
            notBetween("server_ip",serverIpStart,serverIpEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值%' serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpLike(String serverIp){
        if(serverIp!=null){
            like("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT LIKE '%值%' serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpNotLike(String serverIp){
        if(serverIp!=null){
            notLike("server_ip",serverIp);
        }
        return this;
     }


    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值' serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpLikeLeft(String serverIp){
        if(serverIp!=null){
            likeLeft("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * LIKE '值%' serverIp
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpLikeRight(String serverIp){
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
    public TencentDeviceAccessInfoUpdateWrapper serverIpIsNull(){
        isNull("server_ip");
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpIsNotNull(){
        isNotNull("server_ip");
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverIpIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateWrapper serverIpIn(String... values){
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
    public TencentDeviceAccessInfoUpdateWrapper serverIpNotIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateWrapper serverIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("server_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * 等于 = serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortEq(Integer serverPort){
        if(serverPort!=null){
            eq("server_port",serverPort);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * 不等于 &lt;&gt; serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortNe(Integer serverPort){
        if(serverPort!=null){
            ne("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于 &gt; serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortGt(Integer serverPort){
        if(serverPort!=null){
            gt("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于等于 &gt;= serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortGe(Integer serverPort){
        if(serverPort!=null){
            ge("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于 &lt; serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortLt(Integer serverPort){
        if(serverPort!=null){
            lt("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于等于 &lt;= serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortLe(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateWrapper serverPortBetween(Integer serverPortStart,Integer serverPortEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper serverPortNotBetween(Integer serverPortStart,Integer serverPortEnd){
        if(serverPortStart!=null && serverPortEnd!=null){
            notBetween("server_port",serverPortStart,serverPortEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值%' serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortLike(Integer serverPort){
        if(serverPort!=null){
            like("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT LIKE '%值%' serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortNotLike(Integer serverPort){
        if(serverPort!=null){
            notLike("server_port",serverPort);
        }
        return this;
     }


    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值' serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortLikeLeft(Integer serverPort){
        if(serverPort!=null){
            likeLeft("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * LIKE '值%' serverPort
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortLikeRight(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateWrapper serverPortIsNull(){
        isNull("server_port");
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortIsNotNull(){
        isNotNull("server_port");
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper serverPortIn(Collection<Integer> value){
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
    public TencentDeviceAccessInfoUpdateWrapper serverPortIn(Integer... values){
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
    public TencentDeviceAccessInfoUpdateWrapper serverPortNotIn(Collection<Integer> value){
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
    public TencentDeviceAccessInfoUpdateWrapper serverPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 等于 = publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpEq(String publicIp){
        if(publicIp!=null){
            eq("public_ip",publicIp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 不等于 &lt;&gt; publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpNe(String publicIp){
        if(publicIp!=null){
            ne("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于 &gt; publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpGt(String publicIp){
        if(publicIp!=null){
            gt("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于等于 &gt;= publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpGe(String publicIp){
        if(publicIp!=null){
            ge("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于 &lt; publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpLt(String publicIp){
        if(publicIp!=null){
            lt("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于等于 &lt;= publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpLe(String publicIp){
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
    public TencentDeviceAccessInfoUpdateWrapper publicIpBetween(String publicIpStart,String publicIpEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper publicIpNotBetween(String publicIpStart,String publicIpEnd){
        if(publicIpStart!=null && publicIpEnd!=null){
            notBetween("public_ip",publicIpStart,publicIpEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值%' publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpLike(String publicIp){
        if(publicIp!=null){
            like("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT LIKE '%值%' publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpNotLike(String publicIp){
        if(publicIp!=null){
            notLike("public_ip",publicIp);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值' publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpLikeLeft(String publicIp){
        if(publicIp!=null){
            likeLeft("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '值%' publicIp
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpLikeRight(String publicIp){
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
    public TencentDeviceAccessInfoUpdateWrapper publicIpIsNull(){
        isNull("public_ip");
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpIsNotNull(){
        isNotNull("public_ip");
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicIpIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateWrapper publicIpIn(String... values){
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
    public TencentDeviceAccessInfoUpdateWrapper publicIpNotIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateWrapper publicIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("public_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * 等于 = publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortEq(Integer publicPort){
        if(publicPort!=null){
            eq("public_port",publicPort);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * 不等于 &lt;&gt; publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortNe(Integer publicPort){
        if(publicPort!=null){
            ne("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于 &gt; publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortGt(Integer publicPort){
        if(publicPort!=null){
            gt("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于等于 &gt;= publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortGe(Integer publicPort){
        if(publicPort!=null){
            ge("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于 &lt; publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortLt(Integer publicPort){
        if(publicPort!=null){
            lt("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于等于 &lt;= publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortLe(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateWrapper publicPortBetween(Integer publicPortStart,Integer publicPortEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper publicPortNotBetween(Integer publicPortStart,Integer publicPortEnd){
        if(publicPortStart!=null && publicPortEnd!=null){
            notBetween("public_port",publicPortStart,publicPortEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值%' publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortLike(Integer publicPort){
        if(publicPort!=null){
            like("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT LIKE '%值%' publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortNotLike(Integer publicPort){
        if(publicPort!=null){
            notLike("public_port",publicPort);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值' publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortLikeLeft(Integer publicPort){
        if(publicPort!=null){
            likeLeft("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '值%' publicPort
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortLikeRight(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateWrapper publicPortIsNull(){
        isNull("public_port");
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortIsNotNull(){
        isNotNull("public_port");
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper publicPortIn(Collection<Integer> value){
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
    public TencentDeviceAccessInfoUpdateWrapper publicPortIn(Integer... values){
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
    public TencentDeviceAccessInfoUpdateWrapper publicPortNotIn(Collection<Integer> value){
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
    public TencentDeviceAccessInfoUpdateWrapper publicPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("public_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 等于 = isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispEq(String isp){
        if(isp!=null){
            eq("isp",isp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 不等于 &lt;&gt; isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispNe(String isp){
        if(isp!=null){
            ne("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于 &gt; isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispGt(String isp){
        if(isp!=null){
            gt("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于等于 &gt;= isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispGe(String isp){
        if(isp!=null){
            ge("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于 &lt; isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispLt(String isp){
        if(isp!=null){
            lt("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于等于 &lt;= isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispLe(String isp){
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
    public TencentDeviceAccessInfoUpdateWrapper ispBetween(String ispStart,String ispEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper ispNotBetween(String ispStart,String ispEnd){
        if(ispStart!=null && ispEnd!=null){
            notBetween("isp",ispStart,ispEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值%' isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispLike(String isp){
        if(isp!=null){
            like("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT LIKE '%值%' isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispNotLike(String isp){
        if(isp!=null){
            notLike("isp",isp);
        }
        return this;
     }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值' isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispLikeLeft(String isp){
        if(isp!=null){
            likeLeft("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '值%' isp
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispLikeRight(String isp){
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
    public TencentDeviceAccessInfoUpdateWrapper ispIsNull(){
        isNull("isp");
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispIsNotNull(){
        isNotNull("isp");
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper ispIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateWrapper ispIn(String... values){
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
    public TencentDeviceAccessInfoUpdateWrapper ispNotIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateWrapper ispNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("isp",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeLe(Date createTime){
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
    public TencentDeviceAccessInfoUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeLikeRight(Date createTime){
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
    public TencentDeviceAccessInfoUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper createTimeIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoUpdateWrapper createTimeIn(Date... values){
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
    public TencentDeviceAccessInfoUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
