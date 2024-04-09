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
public class TencentDeviceAccessInfoUpdateEntityWrapper extends UpdateWrapper<TencentDeviceAccessInfo> {

    public static TencentDeviceAccessInfoUpdateEntityWrapper wrapper(TencentDeviceAccessInfo entity) {
        return new TencentDeviceAccessInfoUpdateEntityWrapper(entity);
    }

    private TencentDeviceAccessInfo entity;

    public TencentDeviceAccessInfoUpdateEntityWrapper(TencentDeviceAccessInfo entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 腾讯设备Id
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setFkTencentDeviceId(Long fkTencentDeviceId) {
         set("fk_tencent_device_id",fkTencentDeviceId);
        return this;
    }
    /**
     * 实例ID
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 云手机服务内网IP
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setServerIp(String serverIp) {
         set("server_ip",serverIp);
        return this;
    }
    /**
     * 云手机服务监听端口
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setServerPort(Integer serverPort) {
         set("server_port",serverPort);
        return this;
    }
    /**
     * 云手机服务公网映射 IP
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setPublicIp(String publicIp) {
         set("public_ip",publicIp);
        return this;
    }
    /**
     * 云手机服务公网映射端口
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setPublicPort(Integer publicPort) {
         set("public_port",publicPort);
        return this;
    }
    /**
     * 云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setIsp(String isp) {
         set("isp",isp);
        return this;
    }
    /**
     * 创建时间
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    protected TencentDeviceAccessInfo entity() {
        if(entity==null){
            throw new NullPointerException("TencentDeviceAccessInfo is null");
        }
        return entity;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idEq(){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",entity().getId(),idEnd);
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",entity().getId());
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idEq(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idNe(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idGt(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idGe(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idLt(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idLe(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idLike(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idNotLike(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idLikeLeft(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idLikeRight(Long id){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper idIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idIn(Long... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * 等于 = entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdEq(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            eq("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * 不等于 &lt;&gt; entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdNe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            ne("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于 &gt; entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdGt(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            gt("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于等于 &gt;= entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdGe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            ge("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于 &lt; entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLt(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            lt("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于等于 &lt;= entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            between("fk_tencent_device_id",entity().getFkTencentDeviceId(),fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",entity().getFkTencentDeviceId(),fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            between("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值%' entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLike(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT LIKE '%值%' entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdNotLike(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }


    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值' entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLikeLeft(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * LIKE '值%' entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLikeRight(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            likeRight("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

/**
     * <p>腾讯设备Id</p>
     * 等于 =
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdEq(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdNe(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdGt(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdGe(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLt(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLike(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdNotLike(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLikeLeft(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdLikeRight(Long fkTencentDeviceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdIsNull(){
        isNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdIsNotNull(){
        isNotNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdIn(Long... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdNotIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper fkTencentDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_device_id",values);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * 等于 = entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdEq(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * 不等于 &lt;&gt; entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdNe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ne("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于 &gt; entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdGt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            gt("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于等于 &gt;= entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdGe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ge("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于 &lt; entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            lt("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于等于 &lt;= entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",entity().getInstanceId(),instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdNotBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",entity().getInstanceId(),instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例ID</p>
     * LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",entity().getInstanceId());
        }
        return this;
     }


    /**
     * <p>实例ID</p>
     * LIKE '%值' entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * LIKE '值%' entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLikeRight(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeRight("instance_id",entity().getInstanceId());
        }
        return this;
     }

/**
     * <p>实例ID</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdEq(String instanceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdNe(String instanceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdGt(String instanceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdGe(String instanceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLt(String instanceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLike(String instanceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdNotLike(String instanceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLikeLeft(String instanceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdLikeRight(String instanceId){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdIn(String... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * 等于 = entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpEq(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            eq("server_ip",serverIp);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * 不等于 &lt;&gt; entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpNe(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            ne("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于 &gt; entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpGt(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            gt("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于等于 &gt;= entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpGe(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            ge("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于 &lt; entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLt(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            lt("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于等于 &lt;= entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLe(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            le("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * BETWEEN  entity().getServerIp() AND 值2
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpBetween(String serverIpEnd){
        String serverIp =entity().getServerIp();
        if(serverIp!=null && serverIpEnd!=null){
            between("server_ip",entity().getServerIp(),serverIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT BETWEEN  entity().getServerIp() AND 值2
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpNotBetween(String serverIpEnd){
        String serverIp =entity().getServerIp();
        if(serverIp!=null && serverIpEnd!=null){
            notBetween("server_ip",entity().getServerIp(),serverIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * BETWEEN  entity().getServerIp() AND 值2
     * @param serverIpStart       值1
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpBetween(String serverIpStart,String serverIpEnd){
        String serverIp =entity().getServerIp();
        if(serverIp!=null && serverIpEnd!=null){
            between("server_ip",serverIpStart,serverIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT BETWEEN  entity().getServerIp() AND 值2
     * @param serverIpStart       值1
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpNotBetween(String serverIpStart,String serverIpEnd){
        String serverIp =entity().getServerIp();
        if(serverIp!=null && serverIpEnd!=null){
            notBetween("server_ip",serverIpStart,serverIpEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值%' entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLike(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            like("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT LIKE '%值%' entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpNotLike(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            notLike("server_ip",entity().getServerIp());
        }
        return this;
     }


    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值' entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLikeLeft(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            likeLeft("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * LIKE '值%' entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLikeRight(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            likeRight("server_ip",entity().getServerIp());
        }
        return this;
     }

/**
     * <p>云手机服务内网IP</p>
     * 等于 =
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpEq(String serverIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpNe(String serverIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpGt(String serverIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpGe(String serverIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLt(String serverIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLe(String serverIp){
        if(serverIp!=null){
            le("server_ip",serverIp);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值%'
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLike(String serverIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpNotLike(String serverIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLikeLeft(String serverIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpLikeRight(String serverIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpIsNull(){
        isNull("server_ip");
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpIsNotNull(){
        isNotNull("server_ip");
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpIn(String... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpNotIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("server_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * 等于 = entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortEq(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            eq("server_port",serverPort);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * 不等于 &lt;&gt; entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortNe(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            ne("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于 &gt; entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortGt(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            gt("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于等于 &gt;= entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortGe(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            ge("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于 &lt; entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLt(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            lt("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于等于 &lt;= entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLe(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            le("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * BETWEEN  entity().getServerPort() AND 值2
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortBetween(Integer serverPortEnd){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null && serverPortEnd!=null){
            between("server_port",entity().getServerPort(),serverPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT BETWEEN  entity().getServerPort() AND 值2
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortNotBetween(Integer serverPortEnd){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null && serverPortEnd!=null){
            notBetween("server_port",entity().getServerPort(),serverPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * BETWEEN  entity().getServerPort() AND 值2
     * @param serverPortStart       值1
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortBetween(Integer serverPortStart,Integer serverPortEnd){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null && serverPortEnd!=null){
            between("server_port",serverPortStart,serverPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT BETWEEN  entity().getServerPort() AND 值2
     * @param serverPortStart       值1
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortNotBetween(Integer serverPortStart,Integer serverPortEnd){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null && serverPortEnd!=null){
            notBetween("server_port",serverPortStart,serverPortEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值%' entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLike(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            like("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT LIKE '%值%' entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortNotLike(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            notLike("server_port",entity().getServerPort());
        }
        return this;
     }


    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值' entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLikeLeft(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            likeLeft("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * LIKE '值%' entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLikeRight(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            likeRight("server_port",entity().getServerPort());
        }
        return this;
     }

/**
     * <p>云手机服务监听端口</p>
     * 等于 =
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortEq(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortNe(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortGt(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortGe(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLt(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLe(Integer serverPort){
        if(serverPort!=null){
            le("server_port",serverPort);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值%'
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLike(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortNotLike(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLikeLeft(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortLikeRight(Integer serverPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortIsNull(){
        isNull("server_port");
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortIsNotNull(){
        isNotNull("server_port");
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortIn(Collection<Integer> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortIn(Integer... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortNotIn(Collection<Integer> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper serverPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 等于 = entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpEq(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            eq("public_ip",publicIp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 不等于 &lt;&gt; entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpNe(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            ne("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于 &gt; entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpGt(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            gt("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于等于 &gt;= entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpGe(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            ge("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于 &lt; entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLt(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            lt("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于等于 &lt;= entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLe(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            le("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * BETWEEN  entity().getPublicIp() AND 值2
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpBetween(String publicIpEnd){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null && publicIpEnd!=null){
            between("public_ip",entity().getPublicIp(),publicIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT BETWEEN  entity().getPublicIp() AND 值2
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpNotBetween(String publicIpEnd){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null && publicIpEnd!=null){
            notBetween("public_ip",entity().getPublicIp(),publicIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * BETWEEN  entity().getPublicIp() AND 值2
     * @param publicIpStart       值1
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpBetween(String publicIpStart,String publicIpEnd){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null && publicIpEnd!=null){
            between("public_ip",publicIpStart,publicIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT BETWEEN  entity().getPublicIp() AND 值2
     * @param publicIpStart       值1
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpNotBetween(String publicIpStart,String publicIpEnd){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null && publicIpEnd!=null){
            notBetween("public_ip",publicIpStart,publicIpEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值%' entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLike(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            like("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT LIKE '%值%' entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpNotLike(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            notLike("public_ip",entity().getPublicIp());
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值' entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLikeLeft(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            likeLeft("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '值%' entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLikeRight(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            likeRight("public_ip",entity().getPublicIp());
        }
        return this;
     }

/**
     * <p>云手机服务公网映射 IP</p>
     * 等于 =
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpEq(String publicIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpNe(String publicIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpGt(String publicIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpGe(String publicIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLt(String publicIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLe(String publicIp){
        if(publicIp!=null){
            le("public_ip",publicIp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值%'
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLike(String publicIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpNotLike(String publicIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLikeLeft(String publicIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpLikeRight(String publicIp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpIsNull(){
        isNull("public_ip");
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpIsNotNull(){
        isNotNull("public_ip");
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpIn(String... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpNotIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("public_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * 等于 = entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortEq(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            eq("public_port",publicPort);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * 不等于 &lt;&gt; entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortNe(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            ne("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于 &gt; entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortGt(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            gt("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于等于 &gt;= entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortGe(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            ge("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于 &lt; entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLt(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            lt("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于等于 &lt;= entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLe(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            le("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * BETWEEN  entity().getPublicPort() AND 值2
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortBetween(Integer publicPortEnd){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null && publicPortEnd!=null){
            between("public_port",entity().getPublicPort(),publicPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT BETWEEN  entity().getPublicPort() AND 值2
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortNotBetween(Integer publicPortEnd){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null && publicPortEnd!=null){
            notBetween("public_port",entity().getPublicPort(),publicPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * BETWEEN  entity().getPublicPort() AND 值2
     * @param publicPortStart       值1
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortBetween(Integer publicPortStart,Integer publicPortEnd){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null && publicPortEnd!=null){
            between("public_port",publicPortStart,publicPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT BETWEEN  entity().getPublicPort() AND 值2
     * @param publicPortStart       值1
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortNotBetween(Integer publicPortStart,Integer publicPortEnd){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null && publicPortEnd!=null){
            notBetween("public_port",publicPortStart,publicPortEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值%' entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLike(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            like("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT LIKE '%值%' entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortNotLike(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            notLike("public_port",entity().getPublicPort());
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值' entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLikeLeft(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            likeLeft("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '值%' entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLikeRight(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            likeRight("public_port",entity().getPublicPort());
        }
        return this;
     }

/**
     * <p>云手机服务公网映射端口</p>
     * 等于 =
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortEq(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortNe(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortGt(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortGe(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLt(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLe(Integer publicPort){
        if(publicPort!=null){
            le("public_port",publicPort);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值%'
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLike(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortNotLike(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLikeLeft(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortLikeRight(Integer publicPort){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortIsNull(){
        isNull("public_port");
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortIsNotNull(){
        isNotNull("public_port");
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortIn(Collection<Integer> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortIn(Integer... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortNotIn(Collection<Integer> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper publicPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("public_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 等于 = entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispEq(){
        String isp =entity().getIsp();
        if(isp!=null){
            eq("isp",isp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 不等于 &lt;&gt; entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispNe(){
        String isp =entity().getIsp();
        if(isp!=null){
            ne("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于 &gt; entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispGt(){
        String isp =entity().getIsp();
        if(isp!=null){
            gt("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于等于 &gt;= entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispGe(){
        String isp =entity().getIsp();
        if(isp!=null){
            ge("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于 &lt; entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLt(){
        String isp =entity().getIsp();
        if(isp!=null){
            lt("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于等于 &lt;= entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLe(){
        String isp =entity().getIsp();
        if(isp!=null){
            le("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * BETWEEN  entity().getIsp() AND 值2
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispBetween(String ispEnd){
        String isp =entity().getIsp();
        if(isp!=null && ispEnd!=null){
            between("isp",entity().getIsp(),ispEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT BETWEEN  entity().getIsp() AND 值2
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispNotBetween(String ispEnd){
        String isp =entity().getIsp();
        if(isp!=null && ispEnd!=null){
            notBetween("isp",entity().getIsp(),ispEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * BETWEEN  entity().getIsp() AND 值2
     * @param ispStart       值1
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispBetween(String ispStart,String ispEnd){
        String isp =entity().getIsp();
        if(isp!=null && ispEnd!=null){
            between("isp",ispStart,ispEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT BETWEEN  entity().getIsp() AND 值2
     * @param ispStart       值1
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispNotBetween(String ispStart,String ispEnd){
        String isp =entity().getIsp();
        if(isp!=null && ispEnd!=null){
            notBetween("isp",ispStart,ispEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值%' entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLike(){
        String isp =entity().getIsp();
        if(isp!=null){
            like("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT LIKE '%值%' entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispNotLike(){
        String isp =entity().getIsp();
        if(isp!=null){
            notLike("isp",entity().getIsp());
        }
        return this;
     }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值' entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLikeLeft(){
        String isp =entity().getIsp();
        if(isp!=null){
            likeLeft("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '值%' entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLikeRight(){
        String isp =entity().getIsp();
        if(isp!=null){
            likeRight("isp",entity().getIsp());
        }
        return this;
     }

/**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 等于 =
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispEq(String isp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispNe(String isp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispGt(String isp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispGe(String isp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLt(String isp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLe(String isp){
        if(isp!=null){
            le("isp",isp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值%'
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLike(String isp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispNotLike(String isp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLikeLeft(String isp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispLikeRight(String isp){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispIsNull(){
        isNull("isp");
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispIsNotNull(){
        isNotNull("isp");
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper ispIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispIn(String... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispNotIn(Collection<String> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper ispNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("isp",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeEq(){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",entity().getCreateTime(),createTimeEnd);
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",entity().getCreateTime());
        }
        return this;
     }

/**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeEq(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeNe(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeGt(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeGe(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLt(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLe(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLike(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeIn(Date... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeEq(){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

/**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentDeviceAccessInfoUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
