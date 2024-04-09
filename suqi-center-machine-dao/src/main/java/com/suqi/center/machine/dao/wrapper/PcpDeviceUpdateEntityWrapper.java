package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 云机id对照表
 * </p>
 * "pcp_device"
 * @author PC001
 */
public class PcpDeviceUpdateEntityWrapper extends UpdateWrapper<PcpDevice> {

    public static PcpDeviceUpdateEntityWrapper wrapper(PcpDevice entity) {
        return new PcpDeviceUpdateEntityWrapper(entity);
    }

    private PcpDevice entity;

    public PcpDeviceUpdateEntityWrapper(PcpDevice entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public PcpDeviceUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 设备唯一码
     */
    public PcpDeviceUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 华为项目id
     */
    public PcpDeviceUpdateEntityWrapper setProjectId(String projectId) {
         set("project_id",projectId);
        return this;
    }
    /**
     * 华为云机id
     */
    public PcpDeviceUpdateEntityWrapper setPhoneId(String phoneId) {
         set("phone_id",phoneId);
        return this;
    }
    /**
     * mac地址
     */
    public PcpDeviceUpdateEntityWrapper setMacAddress(String macAddress) {
         set("macAddress",macAddress);
        return this;
    }
    /**
     * 调用地址
     */
    public PcpDeviceUpdateEntityWrapper setEndpointPhonesUrl(String endpointPhonesUrl) {
         set("endpointPhonesUrl",endpointPhonesUrl);
        return this;
    }
    /**
     * 云服务器id
     */
    public PcpDeviceUpdateEntityWrapper setServerId(String serverId) {
         set("serverId",serverId);
        return this;
    }
    /**
     * 镜像id
     */
    public PcpDeviceUpdateEntityWrapper setImageId(String imageId) {
         set("imageId",imageId);
        return this;
    }
    /**
     * 创建时间
     */
    public PcpDeviceUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public PcpDeviceUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public PcpDeviceUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 手机规格名称，不得超过64byte。
     */
    public PcpDeviceUpdateEntityWrapper setPhoneModelName(String phoneModelName) {
         set("phone_model_name",phoneModelName);
        return this;
    }
    /**
     * 云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)
     */
    public PcpDeviceUpdateEntityWrapper setPhoneName(String phoneName) {
         set("phone_name",phoneName);
        return this;
    }

    protected PcpDevice entity() {
        if(entity==null){
            throw new NullPointerException("PcpDevice is null");
        }
        return entity;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper idEq(){
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
    public PcpDeviceUpdateEntityWrapper idNe(){
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
    public PcpDeviceUpdateEntityWrapper idGt(){
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
    public PcpDeviceUpdateEntityWrapper idGe(){
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
    public PcpDeviceUpdateEntityWrapper idLt(){
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
    public PcpDeviceUpdateEntityWrapper idLe(){
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
    public PcpDeviceUpdateEntityWrapper idBetween(Long idEnd){
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
    public PcpDeviceUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public PcpDeviceUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpDeviceUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public PcpDeviceUpdateEntityWrapper idLike(){
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
    public PcpDeviceUpdateEntityWrapper idNotLike(){
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
    public PcpDeviceUpdateEntityWrapper idLikeLeft(){
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
    public PcpDeviceUpdateEntityWrapper idLikeRight(){
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
    public PcpDeviceUpdateEntityWrapper idEq(Long id){
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
    public PcpDeviceUpdateEntityWrapper idNe(Long id){
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
    public PcpDeviceUpdateEntityWrapper idGt(Long id){
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
    public PcpDeviceUpdateEntityWrapper idGe(Long id){
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
    public PcpDeviceUpdateEntityWrapper idLt(Long id){
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
    public PcpDeviceUpdateEntityWrapper idLe(Long id){
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
    public PcpDeviceUpdateEntityWrapper idLike(Long id){
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
    public PcpDeviceUpdateEntityWrapper idNotLike(Long id){
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
    public PcpDeviceUpdateEntityWrapper idLikeLeft(Long id){
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
    public PcpDeviceUpdateEntityWrapper idLikeRight(Long id){
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
    public PcpDeviceUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper idIn(Collection<Long> value){
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
    public PcpDeviceUpdateEntityWrapper idIn(Long... values){
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
    public PcpDeviceUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public PcpDeviceUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdEq(){
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
    public PcpDeviceUpdateEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",entity().getDeviceId(),deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",entity().getDeviceId(),deviceIdEnd);
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
    public PcpDeviceUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public PcpDeviceUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",entity().getDeviceId());
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",entity().getDeviceId());
        }
        return this;
     }

/**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdEq(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdNe(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdGt(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdGe(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdLt(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdLe(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdLike(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdNotLike(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public PcpDeviceUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public PcpDeviceUpdateEntityWrapper deviceIdIn(String... values){
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
    public PcpDeviceUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public PcpDeviceUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 等于 = entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdEq(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            eq("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 不等于 &lt;&gt; entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdNe(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            ne("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于 &gt; entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdGt(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            gt("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于等于 &gt;= entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdGe(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            ge("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于 &lt; entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLt(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            lt("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于等于 &lt;= entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLe(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            le("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * BETWEEN  entity().getProjectId() AND 值2
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdBetween(String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            between("project_id",entity().getProjectId(),projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT BETWEEN  entity().getProjectId() AND 值2
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdNotBetween(String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            notBetween("project_id",entity().getProjectId(),projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * BETWEEN  entity().getProjectId() AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdBetween(String projectIdStart,String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            between("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT BETWEEN  entity().getProjectId() AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdNotBetween(String projectIdStart,String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            notBetween("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值%' entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLike(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            like("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT LIKE '%值%' entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdNotLike(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            notLike("project_id",entity().getProjectId());
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值' entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLikeLeft(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            likeLeft("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * LIKE '值%' entity().getProjectId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLikeRight(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            likeRight("project_id",entity().getProjectId());
        }
        return this;
     }

/**
     * <p>华为项目id</p>
     * 等于 =
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdEq(String projectId){
        if(projectId!=null){
            eq("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 不等于 &lt;&gt;
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdNe(String projectId){
        if(projectId!=null){
            ne("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 大于 &gt;
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdGt(String projectId){
        if(projectId!=null){
            gt("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 大于等于 &gt;=
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdGe(String projectId){
        if(projectId!=null){
            ge("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 小于 &lt;
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLt(String projectId){
        if(projectId!=null){
            lt("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 小于等于 &lt;=
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLe(String projectId){
        if(projectId!=null){
            le("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * LIKE '%值%'
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLike(String projectId){
        if(projectId!=null){
            like("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * NOT LIKE '%值%'
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdNotLike(String projectId){
        if(projectId!=null){
            notLike("project_id",projectId);
        }
        return this;
    }


    /**
     * <p>华为项目id</p>
     * LIKE '%值'
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLikeLeft(String projectId){
        if(projectId!=null){
            likeLeft("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * LIKE '值%'
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdLikeRight(String projectId){
        if(projectId!=null){
            likeRight("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdIsNull(){
        isNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdIsNotNull(){
        isNotNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("project_id",value);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdIn(String... values){
        if(values!=null && values.length>0){
            in("project_id",values);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("project_id",value);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper projectIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("project_id",values);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 等于 = entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdEq(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 不等于 &lt;&gt; entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdNe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ne("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于 &gt; entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdGt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            gt("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于等于 &gt;= entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdGe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ge("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于 &lt; entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            lt("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于等于 &lt;= entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            le("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",entity().getPhoneId(),phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdNotBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",entity().getPhoneId(),phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值%' entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            like("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT LIKE '%值%' entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdNotLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            notLike("phone_id",entity().getPhoneId());
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值' entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLikeLeft(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeLeft("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * LIKE '值%' entity().getPhoneId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLikeRight(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeRight("phone_id",entity().getPhoneId());
        }
        return this;
     }

/**
     * <p>华为云机id</p>
     * 等于 =
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdEq(String phoneId){
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 不等于 &lt;&gt;
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdNe(String phoneId){
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 大于 &gt;
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdGt(String phoneId){
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 大于等于 &gt;=
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdGe(String phoneId){
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 小于 &lt;
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLt(String phoneId){
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 小于等于 &lt;=
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLe(String phoneId){
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLike(String phoneId){
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * NOT LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdNotLike(String phoneId){
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
    }


    /**
     * <p>华为云机id</p>
     * LIKE '%值'
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLikeLeft(String phoneId){
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * LIKE '值%'
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdLikeRight(String phoneId){
        if(phoneId!=null){
            likeRight("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_id",value);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("phone_id",values);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_id",value);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 等于 = entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressEq(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            eq("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 不等于 &lt;&gt; entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressNe(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            ne("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于 &gt; entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressGt(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            gt("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于等于 &gt;= entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressGe(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            ge("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于 &lt; entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLt(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            lt("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于等于 &lt;= entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLe(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            le("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * BETWEEN  entity().getMacAddress() AND 值2
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressBetween(String macAddressEnd){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null && macAddressEnd!=null){
            between("macAddress",entity().getMacAddress(),macAddressEnd);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT BETWEEN  entity().getMacAddress() AND 值2
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressNotBetween(String macAddressEnd){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null && macAddressEnd!=null){
            notBetween("macAddress",entity().getMacAddress(),macAddressEnd);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * BETWEEN  entity().getMacAddress() AND 值2
     * @param macAddressStart       值1
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressBetween(String macAddressStart,String macAddressEnd){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null && macAddressEnd!=null){
            between("macAddress",macAddressStart,macAddressEnd);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT BETWEEN  entity().getMacAddress() AND 值2
     * @param macAddressStart       值1
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressNotBetween(String macAddressStart,String macAddressEnd){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null && macAddressEnd!=null){
            notBetween("macAddress",macAddressStart,macAddressEnd);
        }
        return this;
     }


    /**
     * <p>mac地址</p>
     * LIKE '%值%' entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLike(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            like("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT LIKE '%值%' entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressNotLike(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            notLike("macAddress",entity().getMacAddress());
        }
        return this;
     }


    /**
     * <p>mac地址</p>
     * LIKE '%值' entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLikeLeft(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            likeLeft("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * LIKE '值%' entity().getMacAddress()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLikeRight(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            likeRight("macAddress",entity().getMacAddress());
        }
        return this;
     }

/**
     * <p>mac地址</p>
     * 等于 =
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressEq(String macAddress){
        if(macAddress!=null){
            eq("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 不等于 &lt;&gt;
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressNe(String macAddress){
        if(macAddress!=null){
            ne("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 大于 &gt;
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressGt(String macAddress){
        if(macAddress!=null){
            gt("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 大于等于 &gt;=
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressGe(String macAddress){
        if(macAddress!=null){
            ge("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 小于 &lt;
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLt(String macAddress){
        if(macAddress!=null){
            lt("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 小于等于 &lt;=
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLe(String macAddress){
        if(macAddress!=null){
            le("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * LIKE '%值%'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLike(String macAddress){
        if(macAddress!=null){
            like("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * NOT LIKE '%值%'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressNotLike(String macAddress){
        if(macAddress!=null){
            notLike("macAddress",macAddress);
        }
        return this;
    }


    /**
     * <p>mac地址</p>
     * LIKE '%值'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLikeLeft(String macAddress){
        if(macAddress!=null){
            likeLeft("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * LIKE '值%'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressLikeRight(String macAddress){
        if(macAddress!=null){
            likeRight("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressIsNull(){
        isNull("macAddress");
        return this;
    }

    /**
     * <p>mac地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressIsNotNull(){
        isNotNull("macAddress");
        return this;
    }

    /**
     * <p>mac地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("macAddress",value);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressIn(String... values){
        if(values!=null && values.length>0){
            in("macAddress",values);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("macAddress",value);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper macAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("macAddress",values);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 等于 = entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlEq(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            eq("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 不等于 &lt;&gt; entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlNe(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            ne("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于 &gt; entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlGt(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            gt("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于等于 &gt;= entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlGe(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            ge("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于 &lt; entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLt(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            lt("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于等于 &lt;= entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLe(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            le("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlBetween(String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            between("endpointPhonesUrl",entity().getEndpointPhonesUrl(),endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpointPhonesUrl",entity().getEndpointPhonesUrl(),endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            between("endpointPhonesUrl",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpointPhonesUrl",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }


    /**
     * <p>调用地址</p>
     * LIKE '%值%' entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLike(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            like("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT LIKE '%值%' entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlNotLike(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            notLike("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }


    /**
     * <p>调用地址</p>
     * LIKE '%值' entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLikeLeft(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            likeLeft("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * LIKE '值%' entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLikeRight(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            likeRight("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

/**
     * <p>调用地址</p>
     * 等于 =
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlEq(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            eq("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 不等于 &lt;&gt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlNe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ne("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 大于 &gt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlGt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            gt("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 大于等于 &gt;=
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlGe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ge("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 小于 &lt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            lt("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 小于等于 &lt;=
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            le("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * LIKE '%值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            like("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * NOT LIKE '%值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlNotLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            notLike("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }


    /**
     * <p>调用地址</p>
     * LIKE '%值'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLikeLeft(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeLeft("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * LIKE '值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlLikeRight(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeRight("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlIsNull(){
        isNull("endpointPhonesUrl");
        return this;
    }

    /**
     * <p>调用地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlIsNotNull(){
        isNotNull("endpointPhonesUrl");
        return this;
    }

    /**
     * <p>调用地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("endpointPhonesUrl",value);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlIn(String... values){
        if(values!=null && values.length>0){
            in("endpointPhonesUrl",values);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("endpointPhonesUrl",value);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper endpointPhonesUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpointPhonesUrl",values);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 等于 = entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdEq(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            eq("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 不等于 &lt;&gt; entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdNe(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            ne("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于 &gt; entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdGt(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            gt("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于等于 &gt;= entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdGe(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            ge("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于 &lt; entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLt(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            lt("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于等于 &lt;= entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLe(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            le("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * BETWEEN  entity().getServerId() AND 值2
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdBetween(String serverIdEnd){
        String serverId =entity().getServerId();
        if(serverId!=null && serverIdEnd!=null){
            between("serverId",entity().getServerId(),serverIdEnd);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT BETWEEN  entity().getServerId() AND 值2
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdNotBetween(String serverIdEnd){
        String serverId =entity().getServerId();
        if(serverId!=null && serverIdEnd!=null){
            notBetween("serverId",entity().getServerId(),serverIdEnd);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * BETWEEN  entity().getServerId() AND 值2
     * @param serverIdStart       值1
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdBetween(String serverIdStart,String serverIdEnd){
        String serverId =entity().getServerId();
        if(serverId!=null && serverIdEnd!=null){
            between("serverId",serverIdStart,serverIdEnd);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT BETWEEN  entity().getServerId() AND 值2
     * @param serverIdStart       值1
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdNotBetween(String serverIdStart,String serverIdEnd){
        String serverId =entity().getServerId();
        if(serverId!=null && serverIdEnd!=null){
            notBetween("serverId",serverIdStart,serverIdEnd);
        }
        return this;
     }


    /**
     * <p>云服务器id</p>
     * LIKE '%值%' entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLike(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            like("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT LIKE '%值%' entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdNotLike(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            notLike("serverId",entity().getServerId());
        }
        return this;
     }


    /**
     * <p>云服务器id</p>
     * LIKE '%值' entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLikeLeft(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            likeLeft("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * LIKE '值%' entity().getServerId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLikeRight(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            likeRight("serverId",entity().getServerId());
        }
        return this;
     }

/**
     * <p>云服务器id</p>
     * 等于 =
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdEq(String serverId){
        if(serverId!=null){
            eq("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 不等于 &lt;&gt;
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdNe(String serverId){
        if(serverId!=null){
            ne("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 大于 &gt;
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdGt(String serverId){
        if(serverId!=null){
            gt("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 大于等于 &gt;=
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdGe(String serverId){
        if(serverId!=null){
            ge("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 小于 &lt;
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLt(String serverId){
        if(serverId!=null){
            lt("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 小于等于 &lt;=
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLe(String serverId){
        if(serverId!=null){
            le("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * LIKE '%值%'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLike(String serverId){
        if(serverId!=null){
            like("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * NOT LIKE '%值%'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdNotLike(String serverId){
        if(serverId!=null){
            notLike("serverId",serverId);
        }
        return this;
    }


    /**
     * <p>云服务器id</p>
     * LIKE '%值'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLikeLeft(String serverId){
        if(serverId!=null){
            likeLeft("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * LIKE '值%'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdLikeRight(String serverId){
        if(serverId!=null){
            likeRight("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdIsNull(){
        isNull("serverId");
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdIsNotNull(){
        isNotNull("serverId");
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("serverId",value);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdIn(String... values){
        if(values!=null && values.length>0){
            in("serverId",values);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("serverId",value);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper serverIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("serverId",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 等于 = entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdEq(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            eq("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt; entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdNe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ne("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt; entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdGt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            gt("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;= entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdGe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ge("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt; entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            lt("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;= entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            le("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN  entity().getImageId() AND 值2
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("imageId",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdNotBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("imageId",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("imageId",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("imageId",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%' entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            like("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%' entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdNotLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            notLike("imageId",entity().getImageId());
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值' entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLikeLeft(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeLeft("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%' entity().getImageId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLikeRight(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeRight("imageId",entity().getImageId());
        }
        return this;
     }

/**
     * <p>镜像id</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt;
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 大于 &gt;
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;=
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 小于 &lt;
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;=
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("imageId",imageId);
        }
        return this;
    }


    /**
     * <p>镜像id</p>
     * LIKE '%值'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * LIKE '值%'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdLikeRight(String imageId){
        if(imageId!=null){
            likeRight("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdIsNull(){
        isNull("imageId");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdIsNotNull(){
        isNotNull("imageId");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("imageId",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdIn(String... values){
        if(values!=null && values.length>0){
            in("imageId",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("imageId",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imageId",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper createTimeEq(){
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
    public PcpDeviceUpdateEntityWrapper createTimeNe(){
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
    public PcpDeviceUpdateEntityWrapper createTimeGt(){
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
    public PcpDeviceUpdateEntityWrapper createTimeGe(){
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
    public PcpDeviceUpdateEntityWrapper createTimeLt(){
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
    public PcpDeviceUpdateEntityWrapper createTimeLe(){
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
    public PcpDeviceUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public PcpDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public PcpDeviceUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpDeviceUpdateEntityWrapper createTimeLike(){
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
    public PcpDeviceUpdateEntityWrapper createTimeNotLike(){
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
    public PcpDeviceUpdateEntityWrapper createTimeLikeLeft(){
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
    public PcpDeviceUpdateEntityWrapper createTimeLikeRight(){
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
    public PcpDeviceUpdateEntityWrapper createTimeEq(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeNe(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeGt(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeGe(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeLt(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeLe(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeLike(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public PcpDeviceUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public PcpDeviceUpdateEntityWrapper createTimeIn(Date... values){
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
    public PcpDeviceUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public PcpDeviceUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeEq(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeNe(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeGt(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeGe(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLt(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLe(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLike(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeNotLike(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLikeLeft(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public PcpDeviceUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",entity().getVersionId(),versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",entity().getVersionId(),versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",entity().getVersionId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",entity().getVersionId());
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public PcpDeviceUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public PcpDeviceUpdateEntityWrapper versionIdIn(Long... values){
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
    public PcpDeviceUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public PcpDeviceUpdateEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 等于 = entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameEq(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            eq("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 不等于 &lt;&gt; entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameNe(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            ne("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于 &gt; entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameGt(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            gt("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于等于 &gt;= entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameGe(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            ge("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于 &lt; entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLt(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            lt("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于等于 &lt;= entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLe(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            le("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * BETWEEN  entity().getPhoneModelName() AND 值2
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameBetween(String phoneModelNameEnd){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null && phoneModelNameEnd!=null){
            between("phone_model_name",entity().getPhoneModelName(),phoneModelNameEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT BETWEEN  entity().getPhoneModelName() AND 值2
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameNotBetween(String phoneModelNameEnd){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null && phoneModelNameEnd!=null){
            notBetween("phone_model_name",entity().getPhoneModelName(),phoneModelNameEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * BETWEEN  entity().getPhoneModelName() AND 值2
     * @param phoneModelNameStart       值1
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameBetween(String phoneModelNameStart,String phoneModelNameEnd){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null && phoneModelNameEnd!=null){
            between("phone_model_name",phoneModelNameStart,phoneModelNameEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT BETWEEN  entity().getPhoneModelName() AND 值2
     * @param phoneModelNameStart       值1
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameNotBetween(String phoneModelNameStart,String phoneModelNameEnd){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null && phoneModelNameEnd!=null){
            notBetween("phone_model_name",phoneModelNameStart,phoneModelNameEnd);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值%' entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLike(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            like("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT LIKE '%值%' entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameNotLike(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            notLike("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值' entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLikeLeft(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            likeLeft("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '值%' entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLikeRight(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            likeRight("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

/**
     * <p>手机规格名称，不得超过64byte。</p>
     * 等于 =
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameEq(String phoneModelName){
        if(phoneModelName!=null){
            eq("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 不等于 &lt;&gt;
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameNe(String phoneModelName){
        if(phoneModelName!=null){
            ne("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于 &gt;
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameGt(String phoneModelName){
        if(phoneModelName!=null){
            gt("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于等于 &gt;=
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameGe(String phoneModelName){
        if(phoneModelName!=null){
            ge("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于 &lt;
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLt(String phoneModelName){
        if(phoneModelName!=null){
            lt("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于等于 &lt;=
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLe(String phoneModelName){
        if(phoneModelName!=null){
            le("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值%'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLike(String phoneModelName){
        if(phoneModelName!=null){
            like("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT LIKE '%值%'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameNotLike(String phoneModelName){
        if(phoneModelName!=null){
            notLike("phone_model_name",phoneModelName);
        }
        return this;
    }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLikeLeft(String phoneModelName){
        if(phoneModelName!=null){
            likeLeft("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '值%'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameLikeRight(String phoneModelName){
        if(phoneModelName!=null){
            likeRight("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameIsNull(){
        isNull("phone_model_name");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameIsNotNull(){
        isNotNull("phone_model_name");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_model_name",value);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameIn(String... values){
        if(values!=null && values.length>0){
            in("phone_model_name",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_model_name",value);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneModelNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_model_name",values);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 等于 = entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameEq(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            eq("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 不等于 &lt;&gt; entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameNe(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            ne("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于 &gt; entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameGt(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            gt("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于等于 &gt;= entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameGe(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            ge("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于 &lt; entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLt(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            lt("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于等于 &lt;= entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLe(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            le("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * BETWEEN  entity().getPhoneName() AND 值2
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameBetween(String phoneNameEnd){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null && phoneNameEnd!=null){
            between("phone_name",entity().getPhoneName(),phoneNameEnd);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT BETWEEN  entity().getPhoneName() AND 值2
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameNotBetween(String phoneNameEnd){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null && phoneNameEnd!=null){
            notBetween("phone_name",entity().getPhoneName(),phoneNameEnd);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * BETWEEN  entity().getPhoneName() AND 值2
     * @param phoneNameStart       值1
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameBetween(String phoneNameStart,String phoneNameEnd){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null && phoneNameEnd!=null){
            between("phone_name",phoneNameStart,phoneNameEnd);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT BETWEEN  entity().getPhoneName() AND 值2
     * @param phoneNameStart       值1
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameNotBetween(String phoneNameStart,String phoneNameEnd){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null && phoneNameEnd!=null){
            notBetween("phone_name",phoneNameStart,phoneNameEnd);
        }
        return this;
     }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值%' entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLike(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            like("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT LIKE '%值%' entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameNotLike(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            notLike("phone_name",entity().getPhoneName());
        }
        return this;
     }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值' entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLikeLeft(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            likeLeft("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '值%' entity().getPhoneName()
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLikeRight(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            likeRight("phone_name",entity().getPhoneName());
        }
        return this;
     }

/**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 等于 =
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameEq(String phoneName){
        if(phoneName!=null){
            eq("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 不等于 &lt;&gt;
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameNe(String phoneName){
        if(phoneName!=null){
            ne("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于 &gt;
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameGt(String phoneName){
        if(phoneName!=null){
            gt("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于等于 &gt;=
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameGe(String phoneName){
        if(phoneName!=null){
            ge("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于 &lt;
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLt(String phoneName){
        if(phoneName!=null){
            lt("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于等于 &lt;=
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLe(String phoneName){
        if(phoneName!=null){
            le("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值%'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLike(String phoneName){
        if(phoneName!=null){
            like("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT LIKE '%值%'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameNotLike(String phoneName){
        if(phoneName!=null){
            notLike("phone_name",phoneName);
        }
        return this;
    }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLikeLeft(String phoneName){
        if(phoneName!=null){
            likeLeft("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '值%'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameLikeRight(String phoneName){
        if(phoneName!=null){
            likeRight("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameIsNull(){
        isNull("phone_name");
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameIsNotNull(){
        isNotNull("phone_name");
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_name",value);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameIn(String... values){
        if(values!=null && values.length>0){
            in("phone_name",values);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_name",value);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateEntityWrapper phoneNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_name",values);
        }
        return this;
    }


}
