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
public class PcpDeviceUpdateWrapper extends UpdateWrapper<PcpDevice> {

    public static PcpDeviceUpdateWrapper wrapper() {
        return new PcpDeviceUpdateWrapper();
    }

    public PcpDeviceUpdateWrapper() {
        super();
    }

    public PcpDeviceUpdateWrapper(PcpDevice entity) {
        super(entity);
    }

    /**
     * 
     */
    public PcpDeviceUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 设备唯一码
     */
    public PcpDeviceUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 华为项目id
     */
    public PcpDeviceUpdateWrapper setProjectId(String projectId) {
         set("project_id",projectId);
        return this;
    }
    /**
     * 华为云机id
     */
    public PcpDeviceUpdateWrapper setPhoneId(String phoneId) {
         set("phone_id",phoneId);
        return this;
    }
    /**
     * mac地址
     */
    public PcpDeviceUpdateWrapper setMacAddress(String macAddress) {
         set("macAddress",macAddress);
        return this;
    }
    /**
     * 调用地址
     */
    public PcpDeviceUpdateWrapper setEndpointPhonesUrl(String endpointPhonesUrl) {
         set("endpointPhonesUrl",endpointPhonesUrl);
        return this;
    }
    /**
     * 云服务器id
     */
    public PcpDeviceUpdateWrapper setServerId(String serverId) {
         set("serverId",serverId);
        return this;
    }
    /**
     * 镜像id
     */
    public PcpDeviceUpdateWrapper setImageId(String imageId) {
         set("imageId",imageId);
        return this;
    }
    /**
     * 创建时间
     */
    public PcpDeviceUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public PcpDeviceUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public PcpDeviceUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 手机规格名称，不得超过64byte。
     */
    public PcpDeviceUpdateWrapper setPhoneModelName(String phoneModelName) {
         set("phone_model_name",phoneModelName);
        return this;
    }
    /**
     * 云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)
     */
    public PcpDeviceUpdateWrapper setPhoneName(String phoneName) {
         set("phone_name",phoneName);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public PcpDeviceUpdateWrapper idEq(Long id){
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
    public PcpDeviceUpdateWrapper idNe(Long id){
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
    public PcpDeviceUpdateWrapper idGt(Long id){
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
    public PcpDeviceUpdateWrapper idGe(Long id){
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
    public PcpDeviceUpdateWrapper idLt(Long id){
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
    public PcpDeviceUpdateWrapper idLe(Long id){
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
    public PcpDeviceUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpDeviceUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public PcpDeviceUpdateWrapper idLike(Long id){
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
    public PcpDeviceUpdateWrapper idNotLike(Long id){
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
    public PcpDeviceUpdateWrapper idLikeLeft(Long id){
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
    public PcpDeviceUpdateWrapper idLikeRight(Long id){
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
    public PcpDeviceUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper idIn(Collection<Long> value){
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
    public PcpDeviceUpdateWrapper idIn(Long... values){
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
    public PcpDeviceUpdateWrapper idNotIn(Collection<Long> value){
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
    public PcpDeviceUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdLe(String deviceId){
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
    public PcpDeviceUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public PcpDeviceUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public PcpDeviceUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper deviceIdIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper deviceIdIn(String... values){
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
    public PcpDeviceUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 等于 = projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdEq(String projectId){
        if(projectId!=null){
            eq("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 不等于 &lt;&gt; projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdNe(String projectId){
        if(projectId!=null){
            ne("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于 &gt; projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdGt(String projectId){
        if(projectId!=null){
            gt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于等于 &gt;= projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdGe(String projectId){
        if(projectId!=null){
            ge("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于 &lt; projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdLt(String projectId){
        if(projectId!=null){
            lt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于等于 &lt;= projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdLe(String projectId){
        if(projectId!=null){
            le("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * BETWEEN 值1 AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdBetween(String projectIdStart,String projectIdEnd){
        if(projectIdStart!=null && projectIdEnd!=null){
            between("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdNotBetween(String projectIdStart,String projectIdEnd){
        if(projectIdStart!=null && projectIdEnd!=null){
            notBetween("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值%' projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdLike(String projectId){
        if(projectId!=null){
            like("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT LIKE '%值%' projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdNotLike(String projectId){
        if(projectId!=null){
            notLike("project_id",projectId);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值' projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdLikeLeft(String projectId){
        if(projectId!=null){
            likeLeft("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * LIKE '值%' projectId
     * @param projectId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdLikeRight(String projectId){
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
    public PcpDeviceUpdateWrapper projectIdIsNull(){
        isNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdIsNotNull(){
        isNotNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper projectIdIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper projectIdIn(String... values){
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
    public PcpDeviceUpdateWrapper projectIdNotIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper projectIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("project_id",values);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 等于 = phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdEq(String phoneId){
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 不等于 &lt;&gt; phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdNe(String phoneId){
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于 &gt; phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdGt(String phoneId){
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于等于 &gt;= phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdGe(String phoneId){
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于 &lt; phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdLt(String phoneId){
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于等于 &lt;= phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdLe(String phoneId){
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * BETWEEN 值1 AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            between("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdLike(String phoneId){
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT LIKE '%值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdNotLike(String phoneId){
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值' phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdLikeLeft(String phoneId){
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * LIKE '值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdLikeRight(String phoneId){
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
    public PcpDeviceUpdateWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneIdIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper phoneIdIn(String... values){
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
    public PcpDeviceUpdateWrapper phoneIdNotIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 等于 = macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressEq(String macAddress){
        if(macAddress!=null){
            eq("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 不等于 &lt;&gt; macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressNe(String macAddress){
        if(macAddress!=null){
            ne("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于 &gt; macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressGt(String macAddress){
        if(macAddress!=null){
            gt("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于等于 &gt;= macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressGe(String macAddress){
        if(macAddress!=null){
            ge("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于 &lt; macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressLt(String macAddress){
        if(macAddress!=null){
            lt("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于等于 &lt;= macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressLe(String macAddress){
        if(macAddress!=null){
            le("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * BETWEEN 值1 AND 值2
     * @param macAddressStart       值1
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressBetween(String macAddressStart,String macAddressEnd){
        if(macAddressStart!=null && macAddressEnd!=null){
            between("macAddress",macAddressStart,macAddressEnd);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param macAddressStart       值1
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressNotBetween(String macAddressStart,String macAddressEnd){
        if(macAddressStart!=null && macAddressEnd!=null){
            notBetween("macAddress",macAddressStart,macAddressEnd);
        }
        return this;
     }


    /**
     * <p>mac地址</p>
     * LIKE '%值%' macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressLike(String macAddress){
        if(macAddress!=null){
            like("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT LIKE '%值%' macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressNotLike(String macAddress){
        if(macAddress!=null){
            notLike("macAddress",macAddress);
        }
        return this;
     }


    /**
     * <p>mac地址</p>
     * LIKE '%值' macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressLikeLeft(String macAddress){
        if(macAddress!=null){
            likeLeft("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * LIKE '值%' macAddress
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressLikeRight(String macAddress){
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
    public PcpDeviceUpdateWrapper macAddressIsNull(){
        isNull("macAddress");
        return this;
    }

    /**
     * <p>mac地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressIsNotNull(){
        isNotNull("macAddress");
        return this;
    }

    /**
     * <p>mac地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper macAddressIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper macAddressIn(String... values){
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
    public PcpDeviceUpdateWrapper macAddressNotIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper macAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("macAddress",values);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 等于 = endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlEq(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            eq("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 不等于 &lt;&gt; endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlNe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ne("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于 &gt; endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlGt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            gt("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于等于 &gt;= endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlGe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ge("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于 &lt; endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlLt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            lt("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于等于 &lt;= endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlLe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            le("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * BETWEEN 值1 AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        if(endpointPhonesUrlStart!=null && endpointPhonesUrlEnd!=null){
            between("endpointPhonesUrl",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        if(endpointPhonesUrlStart!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpointPhonesUrl",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }


    /**
     * <p>调用地址</p>
     * LIKE '%值%' endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            like("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT LIKE '%值%' endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlNotLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            notLike("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }


    /**
     * <p>调用地址</p>
     * LIKE '%值' endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlLikeLeft(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeLeft("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * LIKE '值%' endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlLikeRight(String endpointPhonesUrl){
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
    public PcpDeviceUpdateWrapper endpointPhonesUrlIsNull(){
        isNull("endpointPhonesUrl");
        return this;
    }

    /**
     * <p>调用地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlIsNotNull(){
        isNotNull("endpointPhonesUrl");
        return this;
    }

    /**
     * <p>调用地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper endpointPhonesUrlIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper endpointPhonesUrlIn(String... values){
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
    public PcpDeviceUpdateWrapper endpointPhonesUrlNotIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper endpointPhonesUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpointPhonesUrl",values);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 等于 = serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdEq(String serverId){
        if(serverId!=null){
            eq("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 不等于 &lt;&gt; serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdNe(String serverId){
        if(serverId!=null){
            ne("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于 &gt; serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdGt(String serverId){
        if(serverId!=null){
            gt("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于等于 &gt;= serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdGe(String serverId){
        if(serverId!=null){
            ge("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于 &lt; serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdLt(String serverId){
        if(serverId!=null){
            lt("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于等于 &lt;= serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdLe(String serverId){
        if(serverId!=null){
            le("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * BETWEEN 值1 AND 值2
     * @param serverIdStart       值1
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdBetween(String serverIdStart,String serverIdEnd){
        if(serverIdStart!=null && serverIdEnd!=null){
            between("serverId",serverIdStart,serverIdEnd);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverIdStart       值1
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdNotBetween(String serverIdStart,String serverIdEnd){
        if(serverIdStart!=null && serverIdEnd!=null){
            notBetween("serverId",serverIdStart,serverIdEnd);
        }
        return this;
     }


    /**
     * <p>云服务器id</p>
     * LIKE '%值%' serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdLike(String serverId){
        if(serverId!=null){
            like("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT LIKE '%值%' serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdNotLike(String serverId){
        if(serverId!=null){
            notLike("serverId",serverId);
        }
        return this;
     }


    /**
     * <p>云服务器id</p>
     * LIKE '%值' serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdLikeLeft(String serverId){
        if(serverId!=null){
            likeLeft("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * LIKE '值%' serverId
     * @param serverId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdLikeRight(String serverId){
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
    public PcpDeviceUpdateWrapper serverIdIsNull(){
        isNull("serverId");
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdIsNotNull(){
        isNotNull("serverId");
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper serverIdIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper serverIdIn(String... values){
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
    public PcpDeviceUpdateWrapper serverIdNotIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper serverIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("serverId",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 等于 = imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt; imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt; imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;= imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt; imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;= imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            between("imageId",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("imageId",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("imageId",imageId);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值' imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%' imageId
     * @param imageId       值
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdLikeRight(String imageId){
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
    public PcpDeviceUpdateWrapper imageIdIsNull(){
        isNull("imageId");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdIsNotNull(){
        isNotNull("imageId");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper imageIdIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper imageIdIn(String... values){
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
    public PcpDeviceUpdateWrapper imageIdNotIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imageId",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public PcpDeviceUpdateWrapper createTimeEq(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeNe(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeGt(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeGe(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeLt(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeLe(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpDeviceUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpDeviceUpdateWrapper createTimeLike(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeNotLike(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeLikeRight(Date createTime){
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
    public PcpDeviceUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper createTimeIn(Collection<Date> value){
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
    public PcpDeviceUpdateWrapper createTimeIn(Date... values){
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
    public PcpDeviceUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public PcpDeviceUpdateWrapper createTimeNotIn(Date... values){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public PcpDeviceUpdateWrapper lastUpdateTimeNotIn(Date... values){
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
    public PcpDeviceUpdateWrapper versionIdEq(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdNe(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdGt(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdGe(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdLt(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdLe(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public PcpDeviceUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public PcpDeviceUpdateWrapper versionIdLike(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdNotLike(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdLikeLeft(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdLikeRight(Long versionId){
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
    public PcpDeviceUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper versionIdIn(Collection<Long> value){
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
    public PcpDeviceUpdateWrapper versionIdIn(Long... values){
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
    public PcpDeviceUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public PcpDeviceUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 等于 = phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameEq(String phoneModelName){
        if(phoneModelName!=null){
            eq("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 不等于 &lt;&gt; phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameNe(String phoneModelName){
        if(phoneModelName!=null){
            ne("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于 &gt; phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameGt(String phoneModelName){
        if(phoneModelName!=null){
            gt("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于等于 &gt;= phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameGe(String phoneModelName){
        if(phoneModelName!=null){
            ge("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于 &lt; phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameLt(String phoneModelName){
        if(phoneModelName!=null){
            lt("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于等于 &lt;= phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameLe(String phoneModelName){
        if(phoneModelName!=null){
            le("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * BETWEEN 值1 AND 值2
     * @param phoneModelNameStart       值1
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameBetween(String phoneModelNameStart,String phoneModelNameEnd){
        if(phoneModelNameStart!=null && phoneModelNameEnd!=null){
            between("phone_model_name",phoneModelNameStart,phoneModelNameEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneModelNameStart       值1
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameNotBetween(String phoneModelNameStart,String phoneModelNameEnd){
        if(phoneModelNameStart!=null && phoneModelNameEnd!=null){
            notBetween("phone_model_name",phoneModelNameStart,phoneModelNameEnd);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值%' phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameLike(String phoneModelName){
        if(phoneModelName!=null){
            like("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT LIKE '%值%' phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameNotLike(String phoneModelName){
        if(phoneModelName!=null){
            notLike("phone_model_name",phoneModelName);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值' phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameLikeLeft(String phoneModelName){
        if(phoneModelName!=null){
            likeLeft("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '值%' phoneModelName
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameLikeRight(String phoneModelName){
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
    public PcpDeviceUpdateWrapper phoneModelNameIsNull(){
        isNull("phone_model_name");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameIsNotNull(){
        isNotNull("phone_model_name");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneModelNameIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper phoneModelNameIn(String... values){
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
    public PcpDeviceUpdateWrapper phoneModelNameNotIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper phoneModelNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_model_name",values);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 等于 = phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameEq(String phoneName){
        if(phoneName!=null){
            eq("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 不等于 &lt;&gt; phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameNe(String phoneName){
        if(phoneName!=null){
            ne("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于 &gt; phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameGt(String phoneName){
        if(phoneName!=null){
            gt("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于等于 &gt;= phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameGe(String phoneName){
        if(phoneName!=null){
            ge("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于 &lt; phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameLt(String phoneName){
        if(phoneName!=null){
            lt("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于等于 &lt;= phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameLe(String phoneName){
        if(phoneName!=null){
            le("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * BETWEEN 值1 AND 值2
     * @param phoneNameStart       值1
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameBetween(String phoneNameStart,String phoneNameEnd){
        if(phoneNameStart!=null && phoneNameEnd!=null){
            between("phone_name",phoneNameStart,phoneNameEnd);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneNameStart       值1
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameNotBetween(String phoneNameStart,String phoneNameEnd){
        if(phoneNameStart!=null && phoneNameEnd!=null){
            notBetween("phone_name",phoneNameStart,phoneNameEnd);
        }
        return this;
     }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值%' phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameLike(String phoneName){
        if(phoneName!=null){
            like("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT LIKE '%值%' phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameNotLike(String phoneName){
        if(phoneName!=null){
            notLike("phone_name",phoneName);
        }
        return this;
     }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值' phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameLikeLeft(String phoneName){
        if(phoneName!=null){
            likeLeft("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '值%' phoneName
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameLikeRight(String phoneName){
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
    public PcpDeviceUpdateWrapper phoneNameIsNull(){
        isNull("phone_name");
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameIsNotNull(){
        isNotNull("phone_name");
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceUpdateWrapper phoneNameIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper phoneNameIn(String... values){
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
    public PcpDeviceUpdateWrapper phoneNameNotIn(Collection<String> value){
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
    public PcpDeviceUpdateWrapper phoneNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_name",values);
        }
        return this;
    }


}
