package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.YunMemberDevice;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 用户设备表（yun_member_device）
 * </p>
 * "yun_member_device"
 * @author PC001
 */
public class YunMemberDeviceUpdateWrapper extends UpdateWrapper<YunMemberDevice> {

    public static YunMemberDeviceUpdateWrapper wrapper() {
        return new YunMemberDeviceUpdateWrapper();
    }

    public YunMemberDeviceUpdateWrapper() {
        super();
    }

    public YunMemberDeviceUpdateWrapper(YunMemberDevice entity) {
        super(entity);
    }

    /**
     * id
     */
    public YunMemberDeviceUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 用户id
     */
    public YunMemberDeviceUpdateWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 分组id
     */
    public YunMemberDeviceUpdateWrapper setFkEmMemberGroupId(Long fkEmMemberGroupId) {
         set("fk_em_member_group_id",fkEmMemberGroupId);
        return this;
    }
    /**
     * 用户设备编号
     */
    public YunMemberDeviceUpdateWrapper setUserDeviceNo(String userDeviceNo) {
         set("user_device_no",userDeviceNo);
        return this;
    }
    /**
     * 严选下单实例id
     */
    public YunMemberDeviceUpdateWrapper setSmkpInstanceId(String smkpInstanceId) {
         set("smkp_instance_id",smkpInstanceId);
        return this;
    }
    /**
     * 物理设备id
     */
    public YunMemberDeviceUpdateWrapper setFkEmSocDevicesId(Long fkEmSocDevicesId) {
         set("fk_em_soc_devices_id",fkEmSocDevicesId);
        return this;
    }
    /**
     * 虚拟设备id
     */
    public YunMemberDeviceUpdateWrapper setFkSocVmDevicesId(Long fkSocVmDevicesId) {
         set("fk_soc_vm_devices_id",fkSocVmDevicesId);
        return this;
    }
    /**
     * 分组名称
     */
    public YunMemberDeviceUpdateWrapper setMemberGroupName(String memberGroupName) {
         set("member_group_name",memberGroupName);
        return this;
    }
    /**
     * 云机产品id
     */
    public YunMemberDeviceUpdateWrapper setFkYunProductId(Long fkYunProductId) {
         set("fk_yun_product_id",fkYunProductId);
        return this;
    }
    /**
     * 云机产品套餐skuid
     */
    public YunMemberDeviceUpdateWrapper setFkYunProductSkuId(Long fkYunProductSkuId) {
         set("fk_yun_product_sku_id",fkYunProductSkuId);
        return this;
    }
    /**
     * 产品名称
     */
    public YunMemberDeviceUpdateWrapper setProductName(String productName) {
         set("product_name",productName);
        return this;
    }
    /**
     * 设备唯一码
     */
    public YunMemberDeviceUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 设备名
     */
    public YunMemberDeviceUpdateWrapper setDeviceName(String deviceName) {
         set("device_name",deviceName);
        return this;
    }
    /**
     * 使用有效期开始时间
     */
    public YunMemberDeviceUpdateWrapper setValidStartTime(Date validStartTime) {
         set("valid_start_time",validStartTime);
        return this;
    }
    /**
     * 使用有效期结束时间
     */
    public YunMemberDeviceUpdateWrapper setValidEndTime(Date validEndTime) {
         set("valid_end_time",validEndTime);
        return this;
    }
    /**
     * 冻结开始时间
     */
    public YunMemberDeviceUpdateWrapper setFreezeStartTime(Date freezeStartTime) {
         set("freeze_start_time",freezeStartTime);
        return this;
    }
    /**
     * 冻结结束时间（释放设备的时间）
     */
    public YunMemberDeviceUpdateWrapper setFreezeEndTime(Date freezeEndTime) {
         set("freeze_end_time",freezeEndTime);
        return this;
    }
    /**
     * 总天数（单位：天）
     */
    public YunMemberDeviceUpdateWrapper setTotalAvailableDays(Integer totalAvailableDays) {
         set("total_available_days",totalAvailableDays);
        return this;
    }
    /**
     * 总时长（单位：小时）
     */
    public YunMemberDeviceUpdateWrapper setTotalAvailableTimes(Integer totalAvailableTimes) {
         set("total_available_times",totalAvailableTimes);
        return this;
    }
    /**
     * 剩余可用天数
     */
    public YunMemberDeviceUpdateWrapper setRestValidDays(Integer restValidDays) {
         set("rest_valid_days",restValidDays);
        return this;
    }
    /**
     * 剩余可用时长
     */
    public YunMemberDeviceUpdateWrapper setRestValidTimes(Integer restValidTimes) {
         set("rest_valid_times",restValidTimes);
        return this;
    }
    /**
     * 设备类型(1:测试设备，2：商用设备)
     */
    public YunMemberDeviceUpdateWrapper setBizType(Integer bizType) {
         set("biz_type",bizType);
        return this;
    }
    /**
     * 设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）
     */
    public YunMemberDeviceUpdateWrapper setSourceType(Integer sourceType) {
         set("source_type",sourceType);
        return this;
    }
    /**
     * 过期缓冲时间
     */
    public YunMemberDeviceUpdateWrapper setExpiredTimes(Integer expiredTimes) {
         set("expired_times",expiredTimes);
        return this;
    }
    /**
     * 生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)
     */
    public YunMemberDeviceUpdateWrapper setLifecycle(String lifecycle) {
         set("lifecycle",lifecycle);
        return this;
    }
    /**
     * 恢复出厂设置次数
     */
    public YunMemberDeviceUpdateWrapper setFactoryResetTimes(Integer factoryResetTimes) {
         set("factory_reset_times",factoryResetTimes);
        return this;
    }
    /**
     * 是否静音（静音：1，非静音：0）
     */
    public YunMemberDeviceUpdateWrapper setIsSilent(Integer isSilent) {
         set("is_silent",isSilent);
        return this;
    }
    /**
     * 重启设备次数
     */
    public YunMemberDeviceUpdateWrapper setRebootTimes(Integer rebootTimes) {
         set("reboot_times",rebootTimes);
        return this;
    }
    /**
     * 客户申报故障（0：无，1故障）
     */
    public YunMemberDeviceUpdateWrapper setFailure(Integer failure) {
         set("failure",failure);
        return this;
    }
    /**
     * 应用同步安装(0：未执行，1同步中)
     */
    public YunMemberDeviceUpdateWrapper setSyncInstall(Integer syncInstall) {
         set("sync_install",syncInstall);
        return this;
    }
    /**
     * 房间session
     */
    public YunMemberDeviceUpdateWrapper setRoomSession(String roomSession) {
         set("room_session",roomSession);
        return this;
    }
    /**
     * 房间最大容纳成员数
     */
    public YunMemberDeviceUpdateWrapper setRoomPeopleMaxNum(Integer roomPeopleMaxNum) {
         set("room_people_max_num",roomPeopleMaxNum);
        return this;
    }
    /**
     * 房间当前总成员数
     */
    public YunMemberDeviceUpdateWrapper setRoomPeopleTotalNum(Integer roomPeopleTotalNum) {
         set("room_people_total_num",roomPeopleTotalNum);
        return this;
    }
    /**
     * 用户设备分配状态（未分配：0，已分配：1）
     */
    public YunMemberDeviceUpdateWrapper setAllotStatus(Integer allotStatus) {
         set("allot_status",allotStatus);
        return this;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public YunMemberDeviceUpdateWrapper setServerType(Integer serverType) {
         set("server_type",serverType);
        return this;
    }
    /**
     * 服务业务类型（0：普通业务类型，1：排队业务类型）
     */
    public YunMemberDeviceUpdateWrapper setServiceBizType(Integer serviceBizType) {
         set("service_biz_type",serviceBizType);
        return this;
    }
    /**
     * 打开当前应用的下行宽带（kb）
     */
    public YunMemberDeviceUpdateWrapper setDownstreamBroadband(Long downstreamBroadband) {
         set("downstream_broadband",downstreamBroadband);
        return this;
    }
    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）
     */
    public YunMemberDeviceUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 订购时间
     */
    public YunMemberDeviceUpdateWrapper setBuyTime(Date buyTime) {
         set("buy_time",buyTime);
        return this;
    }
    /**
     * 最近一次续费时间
     */
    public YunMemberDeviceUpdateWrapper setLastRenewTime(Date lastRenewTime) {
         set("last_renew_time",lastRenewTime);
        return this;
    }
    /**
     * 创建时间
     */
    public YunMemberDeviceUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 设备空闲上报时间
     */
    public YunMemberDeviceUpdateWrapper setIdleTime(Date idleTime) {
         set("idle_time",idleTime);
        return this;
    }
    /**
     * 
     */
    public YunMemberDeviceUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 
     */
    public YunMemberDeviceUpdateWrapper setProxyProvince(String proxyProvince) {
         set("proxy_province",proxyProvince);
        return this;
    }
    /**
     * 
     */
    public YunMemberDeviceUpdateWrapper setProxyCity(String proxyCity) {
         set("proxy_city",proxyCity);
        return this;
    }
    /**
     * 代理服务器的地址，缺省或null或\"\"时，表示没有使用代理
     */
    public YunMemberDeviceUpdateWrapper setProxyServer(String proxyServer) {
         set("proxy_server",proxyServer);
        return this;
    }
    /**
     * 代理是否连上
     */
    public YunMemberDeviceUpdateWrapper setConnected(Boolean connected) {
         set("connected",connected);
        return this;
    }
    /**
     * 当前代理的网络IP
     */
    public YunMemberDeviceUpdateWrapper setProxyNetIp(String proxyNetIp) {
         set("proxy_net_ip",proxyNetIp);
        return this;
    }
    /**
     * IP的地理位置显示
     */
    public YunMemberDeviceUpdateWrapper setProxyNetIpAddress(String proxyNetIpAddress) {
         set("proxy_net_ip_address",proxyNetIpAddress);
        return this;
    }
    /**
     * 是否种子机（0：否，1：是）
     */
    public YunMemberDeviceUpdateWrapper setSeedDevice(Boolean seedDevice) {
         set("seed_device",seedDevice);
        return this;
    }
    /**
     * 物理机使用率记录id
     */
    public YunMemberDeviceUpdateWrapper setFkServerHostUsageRateId(Long fkServerHostUsageRateId) {
         set("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        return this;
    }
    /**
     * 区域id
     */
    public YunMemberDeviceUpdateWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }

    /**
     * <p>id</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 等于 = fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 不等于 &lt;&gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于 &gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于等于 &gt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于 &lt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于等于 &lt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * LIKE '值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdLikeRight(Long fkMemberId){
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 等于 = fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdEq(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            eq("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 不等于 &lt;&gt; fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdNe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            ne("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 大于 &gt; fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdGt(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            gt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 大于等于 &gt;= fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdGe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            ge("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 小于 &lt; fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdLt(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            lt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 小于等于 &lt;= fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdLe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            le("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * BETWEEN 值1 AND 值2
     * @param fkEmMemberGroupIdStart       值1
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdBetween(Long fkEmMemberGroupIdStart,Long fkEmMemberGroupIdEnd){
        if(fkEmMemberGroupIdStart!=null && fkEmMemberGroupIdEnd!=null){
            between("fk_em_member_group_id",fkEmMemberGroupIdStart,fkEmMemberGroupIdEnd);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkEmMemberGroupIdStart       值1
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdNotBetween(Long fkEmMemberGroupIdStart,Long fkEmMemberGroupIdEnd){
        if(fkEmMemberGroupIdStart!=null && fkEmMemberGroupIdEnd!=null){
            notBetween("fk_em_member_group_id",fkEmMemberGroupIdStart,fkEmMemberGroupIdEnd);
        }
        return this;
     }


    /**
     * <p>分组id</p>
     * LIKE '%值%' fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdLike(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            like("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT LIKE '%值%' fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdNotLike(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            notLike("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }


    /**
     * <p>分组id</p>
     * LIKE '%值' fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdLikeLeft(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            likeLeft("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * LIKE '值%' fkEmMemberGroupId
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdLikeRight(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            likeRight("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdIsNull(){
        isNull("fk_em_member_group_id");
        return this;
    }

    /**
     * <p>分组id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdIsNotNull(){
        isNotNull("fk_em_member_group_id");
        return this;
    }

    /**
     * <p>分组id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_em_member_group_id",value);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_em_member_group_id",values);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_em_member_group_id",value);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmMemberGroupIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_member_group_id",values);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 等于 = userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoEq(String userDeviceNo){
        if(userDeviceNo!=null){
            eq("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 不等于 &lt;&gt; userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoNe(String userDeviceNo){
        if(userDeviceNo!=null){
            ne("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 大于 &gt; userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoGt(String userDeviceNo){
        if(userDeviceNo!=null){
            gt("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 大于等于 &gt;= userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoGe(String userDeviceNo){
        if(userDeviceNo!=null){
            ge("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 小于 &lt; userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoLt(String userDeviceNo){
        if(userDeviceNo!=null){
            lt("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 小于等于 &lt;= userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoLe(String userDeviceNo){
        if(userDeviceNo!=null){
            le("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * BETWEEN 值1 AND 值2
     * @param userDeviceNoStart       值1
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoBetween(String userDeviceNoStart,String userDeviceNoEnd){
        if(userDeviceNoStart!=null && userDeviceNoEnd!=null){
            between("user_device_no",userDeviceNoStart,userDeviceNoEnd);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param userDeviceNoStart       值1
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoNotBetween(String userDeviceNoStart,String userDeviceNoEnd){
        if(userDeviceNoStart!=null && userDeviceNoEnd!=null){
            notBetween("user_device_no",userDeviceNoStart,userDeviceNoEnd);
        }
        return this;
     }


    /**
     * <p>用户设备编号</p>
     * LIKE '%值%' userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoLike(String userDeviceNo){
        if(userDeviceNo!=null){
            like("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT LIKE '%值%' userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoNotLike(String userDeviceNo){
        if(userDeviceNo!=null){
            notLike("user_device_no",userDeviceNo);
        }
        return this;
     }


    /**
     * <p>用户设备编号</p>
     * LIKE '%值' userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoLikeLeft(String userDeviceNo){
        if(userDeviceNo!=null){
            likeLeft("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * LIKE '值%' userDeviceNo
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoLikeRight(String userDeviceNo){
        if(userDeviceNo!=null){
            likeRight("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoIsNull(){
        isNull("user_device_no");
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoIsNotNull(){
        isNotNull("user_device_no");
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("user_device_no",value);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoIn(String... values){
        if(values!=null && values.length>0){
            in("user_device_no",values);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("user_device_no",value);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper userDeviceNoNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_device_no",values);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 等于 = smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdEq(String smkpInstanceId){
        if(smkpInstanceId!=null){
            eq("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 不等于 &lt;&gt; smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdNe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            ne("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 大于 &gt; smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdGt(String smkpInstanceId){
        if(smkpInstanceId!=null){
            gt("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 大于等于 &gt;= smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdGe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            ge("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 小于 &lt; smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdLt(String smkpInstanceId){
        if(smkpInstanceId!=null){
            lt("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 小于等于 &lt;= smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdLe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            le("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * BETWEEN 值1 AND 值2
     * @param smkpInstanceIdStart       值1
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdBetween(String smkpInstanceIdStart,String smkpInstanceIdEnd){
        if(smkpInstanceIdStart!=null && smkpInstanceIdEnd!=null){
            between("smkp_instance_id",smkpInstanceIdStart,smkpInstanceIdEnd);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param smkpInstanceIdStart       值1
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdNotBetween(String smkpInstanceIdStart,String smkpInstanceIdEnd){
        if(smkpInstanceIdStart!=null && smkpInstanceIdEnd!=null){
            notBetween("smkp_instance_id",smkpInstanceIdStart,smkpInstanceIdEnd);
        }
        return this;
     }


    /**
     * <p>严选下单实例id</p>
     * LIKE '%值%' smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdLike(String smkpInstanceId){
        if(smkpInstanceId!=null){
            like("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT LIKE '%值%' smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdNotLike(String smkpInstanceId){
        if(smkpInstanceId!=null){
            notLike("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }


    /**
     * <p>严选下单实例id</p>
     * LIKE '%值' smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdLikeLeft(String smkpInstanceId){
        if(smkpInstanceId!=null){
            likeLeft("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * LIKE '值%' smkpInstanceId
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdLikeRight(String smkpInstanceId){
        if(smkpInstanceId!=null){
            likeRight("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdIsNull(){
        isNull("smkp_instance_id");
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdIsNotNull(){
        isNotNull("smkp_instance_id");
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("smkp_instance_id",value);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("smkp_instance_id",values);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("smkp_instance_id",value);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper smkpInstanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("smkp_instance_id",values);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 等于 = fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 不等于 &lt;&gt; fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于 &gt; fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于等于 &gt;= fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于 &lt; fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于等于 &lt;= fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * BETWEEN 值1 AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        if(fkEmSocDevicesIdStart!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        if(fkEmSocDevicesIdStart!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值%' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT LIKE '%值%' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * LIKE '值%' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeRight("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 等于 = fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdEq(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            eq("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 不等于 &lt;&gt; fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdNe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            ne("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 大于 &gt; fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdGt(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            gt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 大于等于 &gt;= fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdGe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            ge("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 小于 &lt; fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdLt(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            lt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 小于等于 &lt;= fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdLe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            le("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * BETWEEN 值1 AND 值2
     * @param fkSocVmDevicesIdStart       值1
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdBetween(Long fkSocVmDevicesIdStart,Long fkSocVmDevicesIdEnd){
        if(fkSocVmDevicesIdStart!=null && fkSocVmDevicesIdEnd!=null){
            between("fk_soc_vm_devices_id",fkSocVmDevicesIdStart,fkSocVmDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkSocVmDevicesIdStart       值1
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdNotBetween(Long fkSocVmDevicesIdStart,Long fkSocVmDevicesIdEnd){
        if(fkSocVmDevicesIdStart!=null && fkSocVmDevicesIdEnd!=null){
            notBetween("fk_soc_vm_devices_id",fkSocVmDevicesIdStart,fkSocVmDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>虚拟设备id</p>
     * LIKE '%值%' fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdLike(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            like("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT LIKE '%值%' fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdNotLike(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            notLike("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }


    /**
     * <p>虚拟设备id</p>
     * LIKE '%值' fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdLikeLeft(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            likeLeft("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * LIKE '值%' fkSocVmDevicesId
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdLikeRight(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            likeRight("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdIsNull(){
        isNull("fk_soc_vm_devices_id");
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdIsNotNull(){
        isNotNull("fk_soc_vm_devices_id");
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_soc_vm_devices_id",value);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_soc_vm_devices_id",values);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_soc_vm_devices_id",value);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkSocVmDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_soc_vm_devices_id",values);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 等于 = memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameEq(String memberGroupName){
        if(memberGroupName!=null){
            eq("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 不等于 &lt;&gt; memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameNe(String memberGroupName){
        if(memberGroupName!=null){
            ne("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 大于 &gt; memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameGt(String memberGroupName){
        if(memberGroupName!=null){
            gt("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 大于等于 &gt;= memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameGe(String memberGroupName){
        if(memberGroupName!=null){
            ge("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 小于 &lt; memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameLt(String memberGroupName){
        if(memberGroupName!=null){
            lt("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 小于等于 &lt;= memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameLe(String memberGroupName){
        if(memberGroupName!=null){
            le("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * BETWEEN 值1 AND 值2
     * @param memberGroupNameStart       值1
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameBetween(String memberGroupNameStart,String memberGroupNameEnd){
        if(memberGroupNameStart!=null && memberGroupNameEnd!=null){
            between("member_group_name",memberGroupNameStart,memberGroupNameEnd);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param memberGroupNameStart       值1
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameNotBetween(String memberGroupNameStart,String memberGroupNameEnd){
        if(memberGroupNameStart!=null && memberGroupNameEnd!=null){
            notBetween("member_group_name",memberGroupNameStart,memberGroupNameEnd);
        }
        return this;
     }


    /**
     * <p>分组名称</p>
     * LIKE '%值%' memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameLike(String memberGroupName){
        if(memberGroupName!=null){
            like("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT LIKE '%值%' memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameNotLike(String memberGroupName){
        if(memberGroupName!=null){
            notLike("member_group_name",memberGroupName);
        }
        return this;
     }


    /**
     * <p>分组名称</p>
     * LIKE '%值' memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameLikeLeft(String memberGroupName){
        if(memberGroupName!=null){
            likeLeft("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * LIKE '值%' memberGroupName
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameLikeRight(String memberGroupName){
        if(memberGroupName!=null){
            likeRight("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameIsNull(){
        isNull("member_group_name");
        return this;
    }

    /**
     * <p>分组名称</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameIsNotNull(){
        isNotNull("member_group_name");
        return this;
    }

    /**
     * <p>分组名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("member_group_name",value);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameIn(String... values){
        if(values!=null && values.length>0){
            in("member_group_name",values);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("member_group_name",value);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper memberGroupNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("member_group_name",values);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 等于 = fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdEq(Long fkYunProductId){
        if(fkYunProductId!=null){
            eq("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 不等于 &lt;&gt; fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdNe(Long fkYunProductId){
        if(fkYunProductId!=null){
            ne("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 大于 &gt; fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdGt(Long fkYunProductId){
        if(fkYunProductId!=null){
            gt("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 大于等于 &gt;= fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdGe(Long fkYunProductId){
        if(fkYunProductId!=null){
            ge("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 小于 &lt; fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdLt(Long fkYunProductId){
        if(fkYunProductId!=null){
            lt("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 小于等于 &lt;= fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdLe(Long fkYunProductId){
        if(fkYunProductId!=null){
            le("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * BETWEEN 值1 AND 值2
     * @param fkYunProductIdStart       值1
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdBetween(Long fkYunProductIdStart,Long fkYunProductIdEnd){
        if(fkYunProductIdStart!=null && fkYunProductIdEnd!=null){
            between("fk_yun_product_id",fkYunProductIdStart,fkYunProductIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkYunProductIdStart       值1
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdNotBetween(Long fkYunProductIdStart,Long fkYunProductIdEnd){
        if(fkYunProductIdStart!=null && fkYunProductIdEnd!=null){
            notBetween("fk_yun_product_id",fkYunProductIdStart,fkYunProductIdEnd);
        }
        return this;
     }


    /**
     * <p>云机产品id</p>
     * LIKE '%值%' fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdLike(Long fkYunProductId){
        if(fkYunProductId!=null){
            like("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT LIKE '%值%' fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdNotLike(Long fkYunProductId){
        if(fkYunProductId!=null){
            notLike("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }


    /**
     * <p>云机产品id</p>
     * LIKE '%值' fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdLikeLeft(Long fkYunProductId){
        if(fkYunProductId!=null){
            likeLeft("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * LIKE '值%' fkYunProductId
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdLikeRight(Long fkYunProductId){
        if(fkYunProductId!=null){
            likeRight("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdIsNull(){
        isNull("fk_yun_product_id");
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdIsNotNull(){
        isNotNull("fk_yun_product_id");
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_yun_product_id",value);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_yun_product_id",values);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_yun_product_id",value);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_product_id",values);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 等于 = fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdEq(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            eq("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 不等于 &lt;&gt; fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdNe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            ne("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于 &gt; fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdGt(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            gt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于等于 &gt;= fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdGe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            ge("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于 &lt; fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdLt(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            lt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于等于 &lt;= fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdLe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            le("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * BETWEEN 值1 AND 值2
     * @param fkYunProductSkuIdStart       值1
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdBetween(Long fkYunProductSkuIdStart,Long fkYunProductSkuIdEnd){
        if(fkYunProductSkuIdStart!=null && fkYunProductSkuIdEnd!=null){
            between("fk_yun_product_sku_id",fkYunProductSkuIdStart,fkYunProductSkuIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkYunProductSkuIdStart       值1
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdNotBetween(Long fkYunProductSkuIdStart,Long fkYunProductSkuIdEnd){
        if(fkYunProductSkuIdStart!=null && fkYunProductSkuIdEnd!=null){
            notBetween("fk_yun_product_sku_id",fkYunProductSkuIdStart,fkYunProductSkuIdEnd);
        }
        return this;
     }


    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值%' fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdLike(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            like("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT LIKE '%值%' fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdNotLike(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            notLike("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }


    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值' fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdLikeLeft(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            likeLeft("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '值%' fkYunProductSkuId
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdLikeRight(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            likeRight("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdIsNull(){
        isNull("fk_yun_product_sku_id");
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdIsNotNull(){
        isNotNull("fk_yun_product_sku_id");
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_yun_product_sku_id",value);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_yun_product_sku_id",values);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_yun_product_sku_id",value);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkYunProductSkuIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_product_sku_id",values);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 等于 = productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameEq(String productName){
        if(productName!=null){
            eq("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 不等于 &lt;&gt; productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameNe(String productName){
        if(productName!=null){
            ne("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 大于 &gt; productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameGt(String productName){
        if(productName!=null){
            gt("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 大于等于 &gt;= productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameGe(String productName){
        if(productName!=null){
            ge("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 小于 &lt; productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameLt(String productName){
        if(productName!=null){
            lt("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 小于等于 &lt;= productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameLe(String productName){
        if(productName!=null){
            le("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * BETWEEN 值1 AND 值2
     * @param productNameStart       值1
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameBetween(String productNameStart,String productNameEnd){
        if(productNameStart!=null && productNameEnd!=null){
            between("product_name",productNameStart,productNameEnd);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param productNameStart       值1
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameNotBetween(String productNameStart,String productNameEnd){
        if(productNameStart!=null && productNameEnd!=null){
            notBetween("product_name",productNameStart,productNameEnd);
        }
        return this;
     }


    /**
     * <p>产品名称</p>
     * LIKE '%值%' productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameLike(String productName){
        if(productName!=null){
            like("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT LIKE '%值%' productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameNotLike(String productName){
        if(productName!=null){
            notLike("product_name",productName);
        }
        return this;
     }


    /**
     * <p>产品名称</p>
     * LIKE '%值' productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameLikeLeft(String productName){
        if(productName!=null){
            likeLeft("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * LIKE '值%' productName
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameLikeRight(String productName){
        if(productName!=null){
            likeRight("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameIsNull(){
        isNull("product_name");
        return this;
    }

    /**
     * <p>产品名称</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameIsNotNull(){
        isNotNull("product_name");
        return this;
    }

    /**
     * <p>产品名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("product_name",value);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameIn(String... values){
        if(values!=null && values.length>0){
            in("product_name",values);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("product_name",value);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper productNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("product_name",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceIdEq(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdNe(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdGt(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdGe(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdLt(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdLe(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberDeviceUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberDeviceUpdateWrapper deviceIdLike(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdNotLike(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdLikeLeft(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public YunMemberDeviceUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceIdIn(Collection<String> value){
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
    public YunMemberDeviceUpdateWrapper deviceIdIn(String... values){
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
    public YunMemberDeviceUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 等于 = deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameEq(String deviceName){
        if(deviceName!=null){
            eq("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 不等于 &lt;&gt; deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameNe(String deviceName){
        if(deviceName!=null){
            ne("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 大于 &gt; deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameGt(String deviceName){
        if(deviceName!=null){
            gt("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 大于等于 &gt;= deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameGe(String deviceName){
        if(deviceName!=null){
            ge("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 小于 &lt; deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameLt(String deviceName){
        if(deviceName!=null){
            lt("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 小于等于 &lt;= deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameLe(String deviceName){
        if(deviceName!=null){
            le("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * BETWEEN 值1 AND 值2
     * @param deviceNameStart       值1
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameBetween(String deviceNameStart,String deviceNameEnd){
        if(deviceNameStart!=null && deviceNameEnd!=null){
            between("device_name",deviceNameStart,deviceNameEnd);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceNameStart       值1
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameNotBetween(String deviceNameStart,String deviceNameEnd){
        if(deviceNameStart!=null && deviceNameEnd!=null){
            notBetween("device_name",deviceNameStart,deviceNameEnd);
        }
        return this;
     }


    /**
     * <p>设备名</p>
     * LIKE '%值%' deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameLike(String deviceName){
        if(deviceName!=null){
            like("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT LIKE '%值%' deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameNotLike(String deviceName){
        if(deviceName!=null){
            notLike("device_name",deviceName);
        }
        return this;
     }


    /**
     * <p>设备名</p>
     * LIKE '%值' deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameLikeLeft(String deviceName){
        if(deviceName!=null){
            likeLeft("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * LIKE '值%' deviceName
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameLikeRight(String deviceName){
        if(deviceName!=null){
            likeRight("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameIsNull(){
        isNull("device_name");
        return this;
    }

    /**
     * <p>设备名</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameIsNotNull(){
        isNotNull("device_name");
        return this;
    }

    /**
     * <p>设备名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_name",value);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameIn(String... values){
        if(values!=null && values.length>0){
            in("device_name",values);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_name",value);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper deviceNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_name",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 等于 = validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeEq(Date validStartTime){
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt; validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeNe(Date validStartTime){
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt; validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeGt(Date validStartTime){
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;= validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeGe(Date validStartTime){
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt; validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeLt(Date validStartTime){
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;= validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeLe(Date validStartTime){
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
        if(validStartTimeStart!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        if(validStartTimeStart!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeLike(Date validStartTime){
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeNotLike(Date validStartTime){
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeLikeLeft(Date validStartTime){
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeLikeRight(Date validStartTime){
        if(validStartTime!=null){
            likeRight("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("valid_start_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("valid_start_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 等于 = validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeEq(Date validEndTime){
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt; validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeNe(Date validEndTime){
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt; validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeGt(Date validEndTime){
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;= validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeGe(Date validEndTime){
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt; validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeLt(Date validEndTime){
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;= validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeLe(Date validEndTime){
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN 值1 AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
        if(validEndTimeStart!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        if(validEndTimeStart!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeLike(Date validEndTime){
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeNotLike(Date validEndTime){
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeLikeLeft(Date validEndTime){
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeLikeRight(Date validEndTime){
        if(validEndTime!=null){
            likeRight("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("valid_end_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("valid_end_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 等于 = freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeEq(Date freezeStartTime){
        if(freezeStartTime!=null){
            eq("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 不等于 &lt;&gt; freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeNe(Date freezeStartTime){
        if(freezeStartTime!=null){
            ne("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 大于 &gt; freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeGt(Date freezeStartTime){
        if(freezeStartTime!=null){
            gt("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 大于等于 &gt;= freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeGe(Date freezeStartTime){
        if(freezeStartTime!=null){
            ge("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 小于 &lt; freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeLt(Date freezeStartTime){
        if(freezeStartTime!=null){
            lt("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 小于等于 &lt;= freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeLe(Date freezeStartTime){
        if(freezeStartTime!=null){
            le("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param freezeStartTimeStart       值1
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeBetween(Date freezeStartTimeStart,Date freezeStartTimeEnd){
        if(freezeStartTimeStart!=null && freezeStartTimeEnd!=null){
            between("freeze_start_time",freezeStartTimeStart,freezeStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param freezeStartTimeStart       值1
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeNotBetween(Date freezeStartTimeStart,Date freezeStartTimeEnd){
        if(freezeStartTimeStart!=null && freezeStartTimeEnd!=null){
            notBetween("freeze_start_time",freezeStartTimeStart,freezeStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>冻结开始时间</p>
     * LIKE '%值%' freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeLike(Date freezeStartTime){
        if(freezeStartTime!=null){
            like("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT LIKE '%值%' freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeNotLike(Date freezeStartTime){
        if(freezeStartTime!=null){
            notLike("freeze_start_time",freezeStartTime);
        }
        return this;
     }


    /**
     * <p>冻结开始时间</p>
     * LIKE '%值' freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeLikeLeft(Date freezeStartTime){
        if(freezeStartTime!=null){
            likeLeft("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * LIKE '值%' freezeStartTime
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeLikeRight(Date freezeStartTime){
        if(freezeStartTime!=null){
            likeRight("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeIsNull(){
        isNull("freeze_start_time");
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeIsNotNull(){
        isNotNull("freeze_start_time");
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("freeze_start_time",value);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("freeze_start_time",values);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("freeze_start_time",value);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("freeze_start_time",values);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 等于 = freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeEq(Date freezeEndTime){
        if(freezeEndTime!=null){
            eq("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 不等于 &lt;&gt; freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeNe(Date freezeEndTime){
        if(freezeEndTime!=null){
            ne("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于 &gt; freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeGt(Date freezeEndTime){
        if(freezeEndTime!=null){
            gt("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于等于 &gt;= freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeGe(Date freezeEndTime){
        if(freezeEndTime!=null){
            ge("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于 &lt; freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeLt(Date freezeEndTime){
        if(freezeEndTime!=null){
            lt("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于等于 &lt;= freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeLe(Date freezeEndTime){
        if(freezeEndTime!=null){
            le("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * BETWEEN 值1 AND 值2
     * @param freezeEndTimeStart       值1
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeBetween(Date freezeEndTimeStart,Date freezeEndTimeEnd){
        if(freezeEndTimeStart!=null && freezeEndTimeEnd!=null){
            between("freeze_end_time",freezeEndTimeStart,freezeEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param freezeEndTimeStart       值1
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeNotBetween(Date freezeEndTimeStart,Date freezeEndTimeEnd){
        if(freezeEndTimeStart!=null && freezeEndTimeEnd!=null){
            notBetween("freeze_end_time",freezeEndTimeStart,freezeEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值%' freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeLike(Date freezeEndTime){
        if(freezeEndTime!=null){
            like("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT LIKE '%值%' freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeNotLike(Date freezeEndTime){
        if(freezeEndTime!=null){
            notLike("freeze_end_time",freezeEndTime);
        }
        return this;
     }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值' freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeLikeLeft(Date freezeEndTime){
        if(freezeEndTime!=null){
            likeLeft("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '值%' freezeEndTime
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeLikeRight(Date freezeEndTime){
        if(freezeEndTime!=null){
            likeRight("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeIsNull(){
        isNull("freeze_end_time");
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeIsNotNull(){
        isNotNull("freeze_end_time");
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("freeze_end_time",value);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("freeze_end_time",values);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("freeze_end_time",value);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper freezeEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("freeze_end_time",values);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 等于 = totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysEq(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            eq("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 不等于 &lt;&gt; totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysNe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            ne("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 大于 &gt; totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysGt(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            gt("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 大于等于 &gt;= totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysGe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            ge("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 小于 &lt; totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysLt(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            lt("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 小于等于 &lt;= totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysLe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            le("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * BETWEEN 值1 AND 值2
     * @param totalAvailableDaysStart       值1
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysBetween(Integer totalAvailableDaysStart,Integer totalAvailableDaysEnd){
        if(totalAvailableDaysStart!=null && totalAvailableDaysEnd!=null){
            between("total_available_days",totalAvailableDaysStart,totalAvailableDaysEnd);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param totalAvailableDaysStart       值1
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysNotBetween(Integer totalAvailableDaysStart,Integer totalAvailableDaysEnd){
        if(totalAvailableDaysStart!=null && totalAvailableDaysEnd!=null){
            notBetween("total_available_days",totalAvailableDaysStart,totalAvailableDaysEnd);
        }
        return this;
     }


    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值%' totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysLike(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            like("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT LIKE '%值%' totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysNotLike(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            notLike("total_available_days",totalAvailableDays);
        }
        return this;
     }


    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值' totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysLikeLeft(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            likeLeft("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * LIKE '值%' totalAvailableDays
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysLikeRight(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            likeRight("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysIsNull(){
        isNull("total_available_days");
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysIsNotNull(){
        isNotNull("total_available_days");
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("total_available_days",value);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysIn(Integer... values){
        if(values!=null && values.length>0){
            in("total_available_days",values);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("total_available_days",value);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableDaysNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("total_available_days",values);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 等于 = totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesEq(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            eq("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 不等于 &lt;&gt; totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesNe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            ne("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于 &gt; totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesGt(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            gt("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于等于 &gt;= totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesGe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            ge("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于 &lt; totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesLt(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            lt("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于等于 &lt;= totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesLe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            le("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * BETWEEN 值1 AND 值2
     * @param totalAvailableTimesStart       值1
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesBetween(Integer totalAvailableTimesStart,Integer totalAvailableTimesEnd){
        if(totalAvailableTimesStart!=null && totalAvailableTimesEnd!=null){
            between("total_available_times",totalAvailableTimesStart,totalAvailableTimesEnd);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param totalAvailableTimesStart       值1
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesNotBetween(Integer totalAvailableTimesStart,Integer totalAvailableTimesEnd){
        if(totalAvailableTimesStart!=null && totalAvailableTimesEnd!=null){
            notBetween("total_available_times",totalAvailableTimesStart,totalAvailableTimesEnd);
        }
        return this;
     }


    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值%' totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesLike(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            like("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT LIKE '%值%' totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesNotLike(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            notLike("total_available_times",totalAvailableTimes);
        }
        return this;
     }


    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值' totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesLikeLeft(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            likeLeft("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '值%' totalAvailableTimes
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesLikeRight(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            likeRight("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesIsNull(){
        isNull("total_available_times");
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesIsNotNull(){
        isNotNull("total_available_times");
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("total_available_times",value);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("total_available_times",values);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("total_available_times",value);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper totalAvailableTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("total_available_times",values);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 等于 = restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysEq(Integer restValidDays){
        if(restValidDays!=null){
            eq("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 不等于 &lt;&gt; restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysNe(Integer restValidDays){
        if(restValidDays!=null){
            ne("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 大于 &gt; restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysGt(Integer restValidDays){
        if(restValidDays!=null){
            gt("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 大于等于 &gt;= restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysGe(Integer restValidDays){
        if(restValidDays!=null){
            ge("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 小于 &lt; restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysLt(Integer restValidDays){
        if(restValidDays!=null){
            lt("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 小于等于 &lt;= restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysLe(Integer restValidDays){
        if(restValidDays!=null){
            le("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * BETWEEN 值1 AND 值2
     * @param restValidDaysStart       值1
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysBetween(Integer restValidDaysStart,Integer restValidDaysEnd){
        if(restValidDaysStart!=null && restValidDaysEnd!=null){
            between("rest_valid_days",restValidDaysStart,restValidDaysEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param restValidDaysStart       值1
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysNotBetween(Integer restValidDaysStart,Integer restValidDaysEnd){
        if(restValidDaysStart!=null && restValidDaysEnd!=null){
            notBetween("rest_valid_days",restValidDaysStart,restValidDaysEnd);
        }
        return this;
     }


    /**
     * <p>剩余可用天数</p>
     * LIKE '%值%' restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysLike(Integer restValidDays){
        if(restValidDays!=null){
            like("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT LIKE '%值%' restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysNotLike(Integer restValidDays){
        if(restValidDays!=null){
            notLike("rest_valid_days",restValidDays);
        }
        return this;
     }


    /**
     * <p>剩余可用天数</p>
     * LIKE '%值' restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysLikeLeft(Integer restValidDays){
        if(restValidDays!=null){
            likeLeft("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * LIKE '值%' restValidDays
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysLikeRight(Integer restValidDays){
        if(restValidDays!=null){
            likeRight("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysIsNull(){
        isNull("rest_valid_days");
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysIsNotNull(){
        isNotNull("rest_valid_days");
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rest_valid_days",value);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysIn(Integer... values){
        if(values!=null && values.length>0){
            in("rest_valid_days",values);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rest_valid_days",value);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidDaysNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rest_valid_days",values);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 等于 = restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesEq(Integer restValidTimes){
        if(restValidTimes!=null){
            eq("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 不等于 &lt;&gt; restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesNe(Integer restValidTimes){
        if(restValidTimes!=null){
            ne("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 大于 &gt; restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesGt(Integer restValidTimes){
        if(restValidTimes!=null){
            gt("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 大于等于 &gt;= restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesGe(Integer restValidTimes){
        if(restValidTimes!=null){
            ge("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 小于 &lt; restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesLt(Integer restValidTimes){
        if(restValidTimes!=null){
            lt("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 小于等于 &lt;= restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesLe(Integer restValidTimes){
        if(restValidTimes!=null){
            le("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * BETWEEN 值1 AND 值2
     * @param restValidTimesStart       值1
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesBetween(Integer restValidTimesStart,Integer restValidTimesEnd){
        if(restValidTimesStart!=null && restValidTimesEnd!=null){
            between("rest_valid_times",restValidTimesStart,restValidTimesEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT BETWEEN 值1 AND 值2
     * @param restValidTimesStart       值1
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesNotBetween(Integer restValidTimesStart,Integer restValidTimesEnd){
        if(restValidTimesStart!=null && restValidTimesEnd!=null){
            notBetween("rest_valid_times",restValidTimesStart,restValidTimesEnd);
        }
        return this;
     }


    /**
     * <p>剩余可用时长</p>
     * LIKE '%值%' restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesLike(Integer restValidTimes){
        if(restValidTimes!=null){
            like("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT LIKE '%值%' restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesNotLike(Integer restValidTimes){
        if(restValidTimes!=null){
            notLike("rest_valid_times",restValidTimes);
        }
        return this;
     }


    /**
     * <p>剩余可用时长</p>
     * LIKE '%值' restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesLikeLeft(Integer restValidTimes){
        if(restValidTimes!=null){
            likeLeft("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * LIKE '值%' restValidTimes
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesLikeRight(Integer restValidTimes){
        if(restValidTimes!=null){
            likeRight("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesIsNull(){
        isNull("rest_valid_times");
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesIsNotNull(){
        isNotNull("rest_valid_times");
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rest_valid_times",value);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("rest_valid_times",values);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rest_valid_times",value);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper restValidTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rest_valid_times",values);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 等于 = bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeEq(Integer bizType){
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 不等于 &lt;&gt; bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeNe(Integer bizType){
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于 &gt; bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeGt(Integer bizType){
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于等于 &gt;= bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeGe(Integer bizType){
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于 &lt; bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeLt(Integer bizType){
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于等于 &lt;= bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeLe(Integer bizType){
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * BETWEEN 值1 AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeBetween(Integer bizTypeStart,Integer bizTypeEnd){
        if(bizTypeStart!=null && bizTypeEnd!=null){
            between("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeNotBetween(Integer bizTypeStart,Integer bizTypeEnd){
        if(bizTypeStart!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值%' bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeLike(Integer bizType){
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT LIKE '%值%' bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeNotLike(Integer bizType){
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
     }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值' bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeLikeLeft(Integer bizType){
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '值%' bizType
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeLikeRight(Integer bizType){
        if(bizType!=null){
            likeRight("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeIsNull(){
        isNull("biz_type");
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeIsNotNull(){
        isNotNull("biz_type");
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("biz_type",value);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("biz_type",values);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("biz_type",value);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper bizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("biz_type",values);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 等于 = sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeEq(Integer sourceType){
        if(sourceType!=null){
            eq("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 不等于 &lt;&gt; sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeNe(Integer sourceType){
        if(sourceType!=null){
            ne("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于 &gt; sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeGt(Integer sourceType){
        if(sourceType!=null){
            gt("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于等于 &gt;= sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeGe(Integer sourceType){
        if(sourceType!=null){
            ge("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于 &lt; sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeLt(Integer sourceType){
        if(sourceType!=null){
            lt("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于等于 &lt;= sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeLe(Integer sourceType){
        if(sourceType!=null){
            le("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * BETWEEN 值1 AND 值2
     * @param sourceTypeStart       值1
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeBetween(Integer sourceTypeStart,Integer sourceTypeEnd){
        if(sourceTypeStart!=null && sourceTypeEnd!=null){
            between("source_type",sourceTypeStart,sourceTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param sourceTypeStart       值1
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeNotBetween(Integer sourceTypeStart,Integer sourceTypeEnd){
        if(sourceTypeStart!=null && sourceTypeEnd!=null){
            notBetween("source_type",sourceTypeStart,sourceTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值%' sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeLike(Integer sourceType){
        if(sourceType!=null){
            like("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT LIKE '%值%' sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeNotLike(Integer sourceType){
        if(sourceType!=null){
            notLike("source_type",sourceType);
        }
        return this;
     }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值' sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeLikeLeft(Integer sourceType){
        if(sourceType!=null){
            likeLeft("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '值%' sourceType
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeLikeRight(Integer sourceType){
        if(sourceType!=null){
            likeRight("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeIsNull(){
        isNull("source_type");
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeIsNotNull(){
        isNotNull("source_type");
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("source_type",value);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("source_type",values);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("source_type",value);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper sourceTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("source_type",values);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 等于 = expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesEq(Integer expiredTimes){
        if(expiredTimes!=null){
            eq("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 不等于 &lt;&gt; expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesNe(Integer expiredTimes){
        if(expiredTimes!=null){
            ne("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 大于 &gt; expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesGt(Integer expiredTimes){
        if(expiredTimes!=null){
            gt("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 大于等于 &gt;= expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesGe(Integer expiredTimes){
        if(expiredTimes!=null){
            ge("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 小于 &lt; expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesLt(Integer expiredTimes){
        if(expiredTimes!=null){
            lt("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 小于等于 &lt;= expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesLe(Integer expiredTimes){
        if(expiredTimes!=null){
            le("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * BETWEEN 值1 AND 值2
     * @param expiredTimesStart       值1
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesBetween(Integer expiredTimesStart,Integer expiredTimesEnd){
        if(expiredTimesStart!=null && expiredTimesEnd!=null){
            between("expired_times",expiredTimesStart,expiredTimesEnd);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param expiredTimesStart       值1
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesNotBetween(Integer expiredTimesStart,Integer expiredTimesEnd){
        if(expiredTimesStart!=null && expiredTimesEnd!=null){
            notBetween("expired_times",expiredTimesStart,expiredTimesEnd);
        }
        return this;
     }


    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值%' expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesLike(Integer expiredTimes){
        if(expiredTimes!=null){
            like("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT LIKE '%值%' expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesNotLike(Integer expiredTimes){
        if(expiredTimes!=null){
            notLike("expired_times",expiredTimes);
        }
        return this;
     }


    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值' expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesLikeLeft(Integer expiredTimes){
        if(expiredTimes!=null){
            likeLeft("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * LIKE '值%' expiredTimes
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesLikeRight(Integer expiredTimes){
        if(expiredTimes!=null){
            likeRight("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesIsNull(){
        isNull("expired_times");
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesIsNotNull(){
        isNotNull("expired_times");
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("expired_times",value);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("expired_times",values);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("expired_times",value);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper expiredTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("expired_times",values);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 等于 = lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleEq(String lifecycle){
        if(lifecycle!=null){
            eq("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 不等于 &lt;&gt; lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleNe(String lifecycle){
        if(lifecycle!=null){
            ne("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于 &gt; lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleGt(String lifecycle){
        if(lifecycle!=null){
            gt("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于等于 &gt;= lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleGe(String lifecycle){
        if(lifecycle!=null){
            ge("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于 &lt; lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleLt(String lifecycle){
        if(lifecycle!=null){
            lt("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于等于 &lt;= lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleLe(String lifecycle){
        if(lifecycle!=null){
            le("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * BETWEEN 值1 AND 值2
     * @param lifecycleStart       值1
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleBetween(String lifecycleStart,String lifecycleEnd){
        if(lifecycleStart!=null && lifecycleEnd!=null){
            between("lifecycle",lifecycleStart,lifecycleEnd);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lifecycleStart       值1
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleNotBetween(String lifecycleStart,String lifecycleEnd){
        if(lifecycleStart!=null && lifecycleEnd!=null){
            notBetween("lifecycle",lifecycleStart,lifecycleEnd);
        }
        return this;
     }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值%' lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleLike(String lifecycle){
        if(lifecycle!=null){
            like("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT LIKE '%值%' lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleNotLike(String lifecycle){
        if(lifecycle!=null){
            notLike("lifecycle",lifecycle);
        }
        return this;
     }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值' lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleLikeLeft(String lifecycle){
        if(lifecycle!=null){
            likeLeft("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '值%' lifecycle
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleLikeRight(String lifecycle){
        if(lifecycle!=null){
            likeRight("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleIsNull(){
        isNull("lifecycle");
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleIsNotNull(){
        isNotNull("lifecycle");
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("lifecycle",value);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleIn(String... values){
        if(values!=null && values.length>0){
            in("lifecycle",values);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("lifecycle",value);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lifecycleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("lifecycle",values);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 等于 = factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesEq(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            eq("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 不等于 &lt;&gt; factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesNe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            ne("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于 &gt; factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesGt(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            gt("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于等于 &gt;= factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesGe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            ge("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于 &lt; factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesLt(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            lt("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于等于 &lt;= factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesLe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            le("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * BETWEEN 值1 AND 值2
     * @param factoryResetTimesStart       值1
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesBetween(Integer factoryResetTimesStart,Integer factoryResetTimesEnd){
        if(factoryResetTimesStart!=null && factoryResetTimesEnd!=null){
            between("factory_reset_times",factoryResetTimesStart,factoryResetTimesEnd);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param factoryResetTimesStart       值1
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesNotBetween(Integer factoryResetTimesStart,Integer factoryResetTimesEnd){
        if(factoryResetTimesStart!=null && factoryResetTimesEnd!=null){
            notBetween("factory_reset_times",factoryResetTimesStart,factoryResetTimesEnd);
        }
        return this;
     }


    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值%' factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesLike(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            like("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT LIKE '%值%' factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesNotLike(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            notLike("factory_reset_times",factoryResetTimes);
        }
        return this;
     }


    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值' factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesLikeLeft(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            likeLeft("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '值%' factoryResetTimes
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesLikeRight(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            likeRight("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesIsNull(){
        isNull("factory_reset_times");
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesIsNotNull(){
        isNotNull("factory_reset_times");
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("factory_reset_times",value);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("factory_reset_times",values);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("factory_reset_times",value);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper factoryResetTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("factory_reset_times",values);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 等于 = isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentEq(Integer isSilent){
        if(isSilent!=null){
            eq("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 不等于 &lt;&gt; isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentNe(Integer isSilent){
        if(isSilent!=null){
            ne("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于 &gt; isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentGt(Integer isSilent){
        if(isSilent!=null){
            gt("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于等于 &gt;= isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentGe(Integer isSilent){
        if(isSilent!=null){
            ge("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于 &lt; isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentLt(Integer isSilent){
        if(isSilent!=null){
            lt("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于等于 &lt;= isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentLe(Integer isSilent){
        if(isSilent!=null){
            le("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * BETWEEN 值1 AND 值2
     * @param isSilentStart       值1
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentBetween(Integer isSilentStart,Integer isSilentEnd){
        if(isSilentStart!=null && isSilentEnd!=null){
            between("is_silent",isSilentStart,isSilentEnd);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param isSilentStart       值1
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentNotBetween(Integer isSilentStart,Integer isSilentEnd){
        if(isSilentStart!=null && isSilentEnd!=null){
            notBetween("is_silent",isSilentStart,isSilentEnd);
        }
        return this;
     }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值%' isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentLike(Integer isSilent){
        if(isSilent!=null){
            like("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT LIKE '%值%' isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentNotLike(Integer isSilent){
        if(isSilent!=null){
            notLike("is_silent",isSilent);
        }
        return this;
     }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值' isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentLikeLeft(Integer isSilent){
        if(isSilent!=null){
            likeLeft("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '值%' isSilent
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentLikeRight(Integer isSilent){
        if(isSilent!=null){
            likeRight("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentIsNull(){
        isNull("is_silent");
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentIsNotNull(){
        isNotNull("is_silent");
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_silent",value);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_silent",values);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_silent",value);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper isSilentNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_silent",values);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 等于 = rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesEq(Integer rebootTimes){
        if(rebootTimes!=null){
            eq("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 不等于 &lt;&gt; rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesNe(Integer rebootTimes){
        if(rebootTimes!=null){
            ne("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 大于 &gt; rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesGt(Integer rebootTimes){
        if(rebootTimes!=null){
            gt("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 大于等于 &gt;= rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesGe(Integer rebootTimes){
        if(rebootTimes!=null){
            ge("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 小于 &lt; rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesLt(Integer rebootTimes){
        if(rebootTimes!=null){
            lt("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 小于等于 &lt;= rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesLe(Integer rebootTimes){
        if(rebootTimes!=null){
            le("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * BETWEEN 值1 AND 值2
     * @param rebootTimesStart       值1
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesBetween(Integer rebootTimesStart,Integer rebootTimesEnd){
        if(rebootTimesStart!=null && rebootTimesEnd!=null){
            between("reboot_times",rebootTimesStart,rebootTimesEnd);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param rebootTimesStart       值1
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesNotBetween(Integer rebootTimesStart,Integer rebootTimesEnd){
        if(rebootTimesStart!=null && rebootTimesEnd!=null){
            notBetween("reboot_times",rebootTimesStart,rebootTimesEnd);
        }
        return this;
     }


    /**
     * <p>重启设备次数</p>
     * LIKE '%值%' rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesLike(Integer rebootTimes){
        if(rebootTimes!=null){
            like("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT LIKE '%值%' rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesNotLike(Integer rebootTimes){
        if(rebootTimes!=null){
            notLike("reboot_times",rebootTimes);
        }
        return this;
     }


    /**
     * <p>重启设备次数</p>
     * LIKE '%值' rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesLikeLeft(Integer rebootTimes){
        if(rebootTimes!=null){
            likeLeft("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * LIKE '值%' rebootTimes
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesLikeRight(Integer rebootTimes){
        if(rebootTimes!=null){
            likeRight("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesIsNull(){
        isNull("reboot_times");
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesIsNotNull(){
        isNotNull("reboot_times");
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("reboot_times",value);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("reboot_times",values);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("reboot_times",value);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper rebootTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("reboot_times",values);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 等于 = failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureEq(Integer failure){
        if(failure!=null){
            eq("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 不等于 &lt;&gt; failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureNe(Integer failure){
        if(failure!=null){
            ne("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于 &gt; failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureGt(Integer failure){
        if(failure!=null){
            gt("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于等于 &gt;= failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureGe(Integer failure){
        if(failure!=null){
            ge("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于 &lt; failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureLt(Integer failure){
        if(failure!=null){
            lt("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于等于 &lt;= failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureLe(Integer failure){
        if(failure!=null){
            le("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * BETWEEN 值1 AND 值2
     * @param failureStart       值1
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureBetween(Integer failureStart,Integer failureEnd){
        if(failureStart!=null && failureEnd!=null){
            between("failure",failureStart,failureEnd);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param failureStart       值1
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureNotBetween(Integer failureStart,Integer failureEnd){
        if(failureStart!=null && failureEnd!=null){
            notBetween("failure",failureStart,failureEnd);
        }
        return this;
     }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值%' failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureLike(Integer failure){
        if(failure!=null){
            like("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT LIKE '%值%' failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureNotLike(Integer failure){
        if(failure!=null){
            notLike("failure",failure);
        }
        return this;
     }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值' failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureLikeLeft(Integer failure){
        if(failure!=null){
            likeLeft("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '值%' failure
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureLikeRight(Integer failure){
        if(failure!=null){
            likeRight("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureIsNull(){
        isNull("failure");
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureIsNotNull(){
        isNotNull("failure");
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("failure",value);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureIn(Integer... values){
        if(values!=null && values.length>0){
            in("failure",values);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("failure",value);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper failureNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("failure",values);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 等于 = syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallEq(Integer syncInstall){
        if(syncInstall!=null){
            eq("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 不等于 &lt;&gt; syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallNe(Integer syncInstall){
        if(syncInstall!=null){
            ne("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于 &gt; syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallGt(Integer syncInstall){
        if(syncInstall!=null){
            gt("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于等于 &gt;= syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallGe(Integer syncInstall){
        if(syncInstall!=null){
            ge("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于 &lt; syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallLt(Integer syncInstall){
        if(syncInstall!=null){
            lt("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于等于 &lt;= syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallLe(Integer syncInstall){
        if(syncInstall!=null){
            le("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * BETWEEN 值1 AND 值2
     * @param syncInstallStart       值1
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallBetween(Integer syncInstallStart,Integer syncInstallEnd){
        if(syncInstallStart!=null && syncInstallEnd!=null){
            between("sync_install",syncInstallStart,syncInstallEnd);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param syncInstallStart       值1
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallNotBetween(Integer syncInstallStart,Integer syncInstallEnd){
        if(syncInstallStart!=null && syncInstallEnd!=null){
            notBetween("sync_install",syncInstallStart,syncInstallEnd);
        }
        return this;
     }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值%' syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallLike(Integer syncInstall){
        if(syncInstall!=null){
            like("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT LIKE '%值%' syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallNotLike(Integer syncInstall){
        if(syncInstall!=null){
            notLike("sync_install",syncInstall);
        }
        return this;
     }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值' syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallLikeLeft(Integer syncInstall){
        if(syncInstall!=null){
            likeLeft("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '值%' syncInstall
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallLikeRight(Integer syncInstall){
        if(syncInstall!=null){
            likeRight("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallIsNull(){
        isNull("sync_install");
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallIsNotNull(){
        isNotNull("sync_install");
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("sync_install",value);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallIn(Integer... values){
        if(values!=null && values.length>0){
            in("sync_install",values);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("sync_install",value);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper syncInstallNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sync_install",values);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 等于 = roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionEq(String roomSession){
        if(roomSession!=null){
            eq("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 不等于 &lt;&gt; roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionNe(String roomSession){
        if(roomSession!=null){
            ne("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 大于 &gt; roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionGt(String roomSession){
        if(roomSession!=null){
            gt("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 大于等于 &gt;= roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionGe(String roomSession){
        if(roomSession!=null){
            ge("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 小于 &lt; roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionLt(String roomSession){
        if(roomSession!=null){
            lt("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 小于等于 &lt;= roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionLe(String roomSession){
        if(roomSession!=null){
            le("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * BETWEEN 值1 AND 值2
     * @param roomSessionStart       值1
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
        if(roomSessionStart!=null && roomSessionEnd!=null){
            between("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomSessionStart       值1
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
        if(roomSessionStart!=null && roomSessionEnd!=null){
            notBetween("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值%' roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionLike(String roomSession){
        if(roomSession!=null){
            like("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT LIKE '%值%' roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionNotLike(String roomSession){
        if(roomSession!=null){
            notLike("room_session",roomSession);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值' roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionLikeLeft(String roomSession){
        if(roomSession!=null){
            likeLeft("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * LIKE '值%' roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionLikeRight(String roomSession){
        if(roomSession!=null){
            likeRight("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("room_session",value);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionIn(String... values){
        if(values!=null && values.length>0){
            in("room_session",values);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_session",value);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_session",values);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 等于 = roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumEq(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            eq("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 不等于 &lt;&gt; roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumNe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            ne("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于 &gt; roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumGt(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            gt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于等于 &gt;= roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumGe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            ge("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于 &lt; roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumLt(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            lt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于等于 &lt;= roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumLe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            le("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * BETWEEN 值1 AND 值2
     * @param roomPeopleMaxNumStart       值1
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumBetween(Integer roomPeopleMaxNumStart,Integer roomPeopleMaxNumEnd){
        if(roomPeopleMaxNumStart!=null && roomPeopleMaxNumEnd!=null){
            between("room_people_max_num",roomPeopleMaxNumStart,roomPeopleMaxNumEnd);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomPeopleMaxNumStart       值1
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumNotBetween(Integer roomPeopleMaxNumStart,Integer roomPeopleMaxNumEnd){
        if(roomPeopleMaxNumStart!=null && roomPeopleMaxNumEnd!=null){
            notBetween("room_people_max_num",roomPeopleMaxNumStart,roomPeopleMaxNumEnd);
        }
        return this;
     }


    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值%' roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumLike(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            like("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT LIKE '%值%' roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumNotLike(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            notLike("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }


    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值' roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumLikeLeft(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            likeLeft("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '值%' roomPeopleMaxNum
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumLikeRight(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            likeRight("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumIsNull(){
        isNull("room_people_max_num");
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumIsNotNull(){
        isNotNull("room_people_max_num");
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("room_people_max_num",value);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumIn(Integer... values){
        if(values!=null && values.length>0){
            in("room_people_max_num",values);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_people_max_num",value);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleMaxNumNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_people_max_num",values);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 等于 = roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumEq(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            eq("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 不等于 &lt;&gt; roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumNe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            ne("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 大于 &gt; roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumGt(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            gt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 大于等于 &gt;= roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumGe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            ge("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 小于 &lt; roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumLt(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            lt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 小于等于 &lt;= roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumLe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            le("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * BETWEEN 值1 AND 值2
     * @param roomPeopleTotalNumStart       值1
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumBetween(Integer roomPeopleTotalNumStart,Integer roomPeopleTotalNumEnd){
        if(roomPeopleTotalNumStart!=null && roomPeopleTotalNumEnd!=null){
            between("room_people_total_num",roomPeopleTotalNumStart,roomPeopleTotalNumEnd);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomPeopleTotalNumStart       值1
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumNotBetween(Integer roomPeopleTotalNumStart,Integer roomPeopleTotalNumEnd){
        if(roomPeopleTotalNumStart!=null && roomPeopleTotalNumEnd!=null){
            notBetween("room_people_total_num",roomPeopleTotalNumStart,roomPeopleTotalNumEnd);
        }
        return this;
     }


    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值%' roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumLike(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            like("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT LIKE '%值%' roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumNotLike(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            notLike("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }


    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值' roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumLikeLeft(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            likeLeft("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * LIKE '值%' roomPeopleTotalNum
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumLikeRight(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            likeRight("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumIsNull(){
        isNull("room_people_total_num");
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumIsNotNull(){
        isNotNull("room_people_total_num");
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("room_people_total_num",value);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumIn(Integer... values){
        if(values!=null && values.length>0){
            in("room_people_total_num",values);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_people_total_num",value);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper roomPeopleTotalNumNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_people_total_num",values);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 等于 = allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusEq(Integer allotStatus){
        if(allotStatus!=null){
            eq("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 不等于 &lt;&gt; allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusNe(Integer allotStatus){
        if(allotStatus!=null){
            ne("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于 &gt; allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusGt(Integer allotStatus){
        if(allotStatus!=null){
            gt("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于等于 &gt;= allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusGe(Integer allotStatus){
        if(allotStatus!=null){
            ge("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于 &lt; allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusLt(Integer allotStatus){
        if(allotStatus!=null){
            lt("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于等于 &lt;= allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusLe(Integer allotStatus){
        if(allotStatus!=null){
            le("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * BETWEEN 值1 AND 值2
     * @param allotStatusStart       值1
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusBetween(Integer allotStatusStart,Integer allotStatusEnd){
        if(allotStatusStart!=null && allotStatusEnd!=null){
            between("allot_status",allotStatusStart,allotStatusEnd);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param allotStatusStart       值1
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusNotBetween(Integer allotStatusStart,Integer allotStatusEnd){
        if(allotStatusStart!=null && allotStatusEnd!=null){
            notBetween("allot_status",allotStatusStart,allotStatusEnd);
        }
        return this;
     }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值%' allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusLike(Integer allotStatus){
        if(allotStatus!=null){
            like("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT LIKE '%值%' allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusNotLike(Integer allotStatus){
        if(allotStatus!=null){
            notLike("allot_status",allotStatus);
        }
        return this;
     }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值' allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusLikeLeft(Integer allotStatus){
        if(allotStatus!=null){
            likeLeft("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '值%' allotStatus
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusLikeRight(Integer allotStatus){
        if(allotStatus!=null){
            likeRight("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusIsNull(){
        isNull("allot_status");
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusIsNotNull(){
        isNotNull("allot_status");
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("allot_status",value);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("allot_status",values);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("allot_status",value);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper allotStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("allot_status",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 等于 = serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeEq(Integer serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 不等于 &lt;&gt; serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeNe(Integer serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于 &gt; serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeGt(Integer serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于等于 &gt;= serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeGe(Integer serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于 &lt; serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeLt(Integer serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于等于 &lt;= serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeLe(Integer serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值%' serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeLike(Integer serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT LIKE '%值%' serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeNotLike(Integer serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值' serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeLikeLeft(Integer serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '值%' serverType
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeLikeRight(Integer serverType){
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("server_type",value);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("server_type",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_type",value);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 等于 = serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeEq(Integer serviceBizType){
        if(serviceBizType!=null){
            eq("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 不等于 &lt;&gt; serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeNe(Integer serviceBizType){
        if(serviceBizType!=null){
            ne("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于 &gt; serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeGt(Integer serviceBizType){
        if(serviceBizType!=null){
            gt("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于等于 &gt;= serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeGe(Integer serviceBizType){
        if(serviceBizType!=null){
            ge("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于 &lt; serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeLt(Integer serviceBizType){
        if(serviceBizType!=null){
            lt("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于等于 &lt;= serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeLe(Integer serviceBizType){
        if(serviceBizType!=null){
            le("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * BETWEEN 值1 AND 值2
     * @param serviceBizTypeStart       值1
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeBetween(Integer serviceBizTypeStart,Integer serviceBizTypeEnd){
        if(serviceBizTypeStart!=null && serviceBizTypeEnd!=null){
            between("service_biz_type",serviceBizTypeStart,serviceBizTypeEnd);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serviceBizTypeStart       值1
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeNotBetween(Integer serviceBizTypeStart,Integer serviceBizTypeEnd){
        if(serviceBizTypeStart!=null && serviceBizTypeEnd!=null){
            notBetween("service_biz_type",serviceBizTypeStart,serviceBizTypeEnd);
        }
        return this;
     }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值%' serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeLike(Integer serviceBizType){
        if(serviceBizType!=null){
            like("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT LIKE '%值%' serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeNotLike(Integer serviceBizType){
        if(serviceBizType!=null){
            notLike("service_biz_type",serviceBizType);
        }
        return this;
     }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值' serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeLikeLeft(Integer serviceBizType){
        if(serviceBizType!=null){
            likeLeft("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '值%' serviceBizType
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeLikeRight(Integer serviceBizType){
        if(serviceBizType!=null){
            likeRight("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeIsNull(){
        isNull("service_biz_type");
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeIsNotNull(){
        isNotNull("service_biz_type");
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("service_biz_type",value);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("service_biz_type",values);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("service_biz_type",value);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper serviceBizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("service_biz_type",values);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 等于 = downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandEq(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            eq("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 不等于 &lt;&gt; downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandNe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            ne("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于 &gt; downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandGt(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            gt("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于等于 &gt;= downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandGe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            ge("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于 &lt; downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandLt(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            lt("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于等于 &lt;= downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandLe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            le("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * BETWEEN 值1 AND 值2
     * @param downstreamBroadbandStart       值1
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandBetween(Long downstreamBroadbandStart,Long downstreamBroadbandEnd){
        if(downstreamBroadbandStart!=null && downstreamBroadbandEnd!=null){
            between("downstream_broadband",downstreamBroadbandStart,downstreamBroadbandEnd);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param downstreamBroadbandStart       值1
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandNotBetween(Long downstreamBroadbandStart,Long downstreamBroadbandEnd){
        if(downstreamBroadbandStart!=null && downstreamBroadbandEnd!=null){
            notBetween("downstream_broadband",downstreamBroadbandStart,downstreamBroadbandEnd);
        }
        return this;
     }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值%' downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandLike(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            like("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT LIKE '%值%' downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandNotLike(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            notLike("downstream_broadband",downstreamBroadband);
        }
        return this;
     }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值' downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandLikeLeft(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            likeLeft("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '值%' downstreamBroadband
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandLikeRight(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            likeRight("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandIsNull(){
        isNull("downstream_broadband");
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandIsNotNull(){
        isNotNull("downstream_broadband");
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("downstream_broadband",value);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandIn(Long... values){
        if(values!=null && values.length>0){
            in("downstream_broadband",values);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("downstream_broadband",value);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper downstreamBroadbandNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("downstream_broadband",values);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 等于 = buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeEq(Date buyTime){
        if(buyTime!=null){
            eq("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 不等于 &lt;&gt; buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeNe(Date buyTime){
        if(buyTime!=null){
            ne("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于 &gt; buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeGt(Date buyTime){
        if(buyTime!=null){
            gt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于等于 &gt;= buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeGe(Date buyTime){
        if(buyTime!=null){
            ge("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于 &lt; buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeLt(Date buyTime){
        if(buyTime!=null){
            lt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于等于 &lt;= buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeLe(Date buyTime){
        if(buyTime!=null){
            le("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * BETWEEN 值1 AND 值2
     * @param buyTimeStart       值1
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeBetween(Date buyTimeStart,Date buyTimeEnd){
        if(buyTimeStart!=null && buyTimeEnd!=null){
            between("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buyTimeStart       值1
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeNotBetween(Date buyTimeStart,Date buyTimeEnd){
        if(buyTimeStart!=null && buyTimeEnd!=null){
            notBetween("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值%' buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeLike(Date buyTime){
        if(buyTime!=null){
            like("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT LIKE '%值%' buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeNotLike(Date buyTime){
        if(buyTime!=null){
            notLike("buy_time",buyTime);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值' buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeLikeLeft(Date buyTime){
        if(buyTime!=null){
            likeLeft("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * LIKE '值%' buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeLikeRight(Date buyTime){
        if(buyTime!=null){
            likeRight("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeIsNull(){
        isNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeIsNotNull(){
        isNotNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("buy_time",value);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("buy_time",values);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("buy_time",value);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper buyTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("buy_time",values);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 等于 = lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeEq(Date lastRenewTime){
        if(lastRenewTime!=null){
            eq("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 不等于 &lt;&gt; lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeNe(Date lastRenewTime){
        if(lastRenewTime!=null){
            ne("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于 &gt; lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeGt(Date lastRenewTime){
        if(lastRenewTime!=null){
            gt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于等于 &gt;= lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeGe(Date lastRenewTime){
        if(lastRenewTime!=null){
            ge("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于 &lt; lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeLt(Date lastRenewTime){
        if(lastRenewTime!=null){
            lt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于等于 &lt;= lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeLe(Date lastRenewTime){
        if(lastRenewTime!=null){
            le("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastRenewTimeStart       值1
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        if(lastRenewTimeStart!=null && lastRenewTimeEnd!=null){
            between("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastRenewTimeStart       值1
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeNotBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        if(lastRenewTimeStart!=null && lastRenewTimeEnd!=null){
            notBetween("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值%' lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeLike(Date lastRenewTime){
        if(lastRenewTime!=null){
            like("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT LIKE '%值%' lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeNotLike(Date lastRenewTime){
        if(lastRenewTime!=null){
            notLike("last_renew_time",lastRenewTime);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值' lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeLikeLeft(Date lastRenewTime){
        if(lastRenewTime!=null){
            likeLeft("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * LIKE '值%' lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeLikeRight(Date lastRenewTime){
        if(lastRenewTime!=null){
            likeRight("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeIsNull(){
        isNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeIsNotNull(){
        isNotNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_renew_time",value);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_renew_time",values);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_renew_time",value);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper lastRenewTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_renew_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper createTimeEq(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeNe(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeGt(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeGe(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeLt(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeLe(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberDeviceUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberDeviceUpdateWrapper createTimeLike(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeNotLike(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberDeviceUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateWrapper createTimeIn(Date... values){
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
    public YunMemberDeviceUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 等于 = idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeEq(Date idleTime){
        if(idleTime!=null){
            eq("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 不等于 &lt;&gt; idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeNe(Date idleTime){
        if(idleTime!=null){
            ne("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于 &gt; idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeGt(Date idleTime){
        if(idleTime!=null){
            gt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于等于 &gt;= idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeGe(Date idleTime){
        if(idleTime!=null){
            ge("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于 &lt; idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeLt(Date idleTime){
        if(idleTime!=null){
            lt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于等于 &lt;= idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeLe(Date idleTime){
        if(idleTime!=null){
            le("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * BETWEEN 值1 AND 值2
     * @param idleTimeStart       值1
     * @param idleTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeBetween(Date idleTimeStart,Date idleTimeEnd){
        if(idleTimeStart!=null && idleTimeEnd!=null){
            between("idle_time",idleTimeStart,idleTimeEnd);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idleTimeStart       值1
     * @param idleTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeNotBetween(Date idleTimeStart,Date idleTimeEnd){
        if(idleTimeStart!=null && idleTimeEnd!=null){
            notBetween("idle_time",idleTimeStart,idleTimeEnd);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值%' idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeLike(Date idleTime){
        if(idleTime!=null){
            like("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT LIKE '%值%' idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeNotLike(Date idleTime){
        if(idleTime!=null){
            notLike("idle_time",idleTime);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值' idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeLikeLeft(Date idleTime){
        if(idleTime!=null){
            likeLeft("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * LIKE '值%' idleTime
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeLikeRight(Date idleTime){
        if(idleTime!=null){
            likeRight("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeIsNull(){
        isNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeIsNotNull(){
        isNotNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("idle_time",value);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("idle_time",values);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("idle_time",value);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper idleTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("idle_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper versionIdEq(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdNe(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdGt(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdGe(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdLt(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdLe(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberDeviceUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberDeviceUpdateWrapper versionIdLike(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdNotLike(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdLikeLeft(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdLikeRight(Long versionId){
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
    public YunMemberDeviceUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper versionIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateWrapper versionIdIn(Long... values){
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
    public YunMemberDeviceUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceEq(String proxyProvince){
        if(proxyProvince!=null){
            eq("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceNe(String proxyProvince){
        if(proxyProvince!=null){
            ne("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceGt(String proxyProvince){
        if(proxyProvince!=null){
            gt("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceGe(String proxyProvince){
        if(proxyProvince!=null){
            ge("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceLt(String proxyProvince){
        if(proxyProvince!=null){
            lt("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceLe(String proxyProvince){
        if(proxyProvince!=null){
            le("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param proxyProvinceStart       值1
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceBetween(String proxyProvinceStart,String proxyProvinceEnd){
        if(proxyProvinceStart!=null && proxyProvinceEnd!=null){
            between("proxy_province",proxyProvinceStart,proxyProvinceEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyProvinceStart       值1
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceNotBetween(String proxyProvinceStart,String proxyProvinceEnd){
        if(proxyProvinceStart!=null && proxyProvinceEnd!=null){
            notBetween("proxy_province",proxyProvinceStart,proxyProvinceEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceLike(String proxyProvince){
        if(proxyProvince!=null){
            like("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceNotLike(String proxyProvince){
        if(proxyProvince!=null){
            notLike("proxy_province",proxyProvince);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceLikeLeft(String proxyProvince){
        if(proxyProvince!=null){
            likeLeft("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' proxyProvince
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceLikeRight(String proxyProvince){
        if(proxyProvince!=null){
            likeRight("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceIsNull(){
        isNull("proxy_province");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceIsNotNull(){
        isNotNull("proxy_province");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_province",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_province",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_province",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyProvinceNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_province",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityEq(String proxyCity){
        if(proxyCity!=null){
            eq("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityNe(String proxyCity){
        if(proxyCity!=null){
            ne("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityGt(String proxyCity){
        if(proxyCity!=null){
            gt("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityGe(String proxyCity){
        if(proxyCity!=null){
            ge("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityLt(String proxyCity){
        if(proxyCity!=null){
            lt("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityLe(String proxyCity){
        if(proxyCity!=null){
            le("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param proxyCityStart       值1
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityBetween(String proxyCityStart,String proxyCityEnd){
        if(proxyCityStart!=null && proxyCityEnd!=null){
            between("proxy_city",proxyCityStart,proxyCityEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyCityStart       值1
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityNotBetween(String proxyCityStart,String proxyCityEnd){
        if(proxyCityStart!=null && proxyCityEnd!=null){
            notBetween("proxy_city",proxyCityStart,proxyCityEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityLike(String proxyCity){
        if(proxyCity!=null){
            like("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityNotLike(String proxyCity){
        if(proxyCity!=null){
            notLike("proxy_city",proxyCity);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityLikeLeft(String proxyCity){
        if(proxyCity!=null){
            likeLeft("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' proxyCity
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityLikeRight(String proxyCity){
        if(proxyCity!=null){
            likeRight("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityIsNull(){
        isNull("proxy_city");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityIsNotNull(){
        isNotNull("proxy_city");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_city",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_city",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_city",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyCityNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_city",values);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 等于 = proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerEq(String proxyServer){
        if(proxyServer!=null){
            eq("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 不等于 &lt;&gt; proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerNe(String proxyServer){
        if(proxyServer!=null){
            ne("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于 &gt; proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerGt(String proxyServer){
        if(proxyServer!=null){
            gt("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于等于 &gt;= proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerGe(String proxyServer){
        if(proxyServer!=null){
            ge("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于 &lt; proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerLt(String proxyServer){
        if(proxyServer!=null){
            lt("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于等于 &lt;= proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerLe(String proxyServer){
        if(proxyServer!=null){
            le("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * BETWEEN 值1 AND 值2
     * @param proxyServerStart       值1
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerBetween(String proxyServerStart,String proxyServerEnd){
        if(proxyServerStart!=null && proxyServerEnd!=null){
            between("proxy_server",proxyServerStart,proxyServerEnd);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyServerStart       值1
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerNotBetween(String proxyServerStart,String proxyServerEnd){
        if(proxyServerStart!=null && proxyServerEnd!=null){
            notBetween("proxy_server",proxyServerStart,proxyServerEnd);
        }
        return this;
     }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值%' proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerLike(String proxyServer){
        if(proxyServer!=null){
            like("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT LIKE '%值%' proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerNotLike(String proxyServer){
        if(proxyServer!=null){
            notLike("proxy_server",proxyServer);
        }
        return this;
     }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值' proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerLikeLeft(String proxyServer){
        if(proxyServer!=null){
            likeLeft("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '值%' proxyServer
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerLikeRight(String proxyServer){
        if(proxyServer!=null){
            likeRight("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerIsNull(){
        isNull("proxy_server");
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerIsNotNull(){
        isNotNull("proxy_server");
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_server",value);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_server",values);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_server",value);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyServerNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_server",values);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 等于 = connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedEq(Boolean connected){
        if(connected!=null){
            eq("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 不等于 &lt;&gt; connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedNe(Boolean connected){
        if(connected!=null){
            ne("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 大于 &gt; connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedGt(Boolean connected){
        if(connected!=null){
            gt("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 大于等于 &gt;= connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedGe(Boolean connected){
        if(connected!=null){
            ge("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 小于 &lt; connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedLt(Boolean connected){
        if(connected!=null){
            lt("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 小于等于 &lt;= connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedLe(Boolean connected){
        if(connected!=null){
            le("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * BETWEEN 值1 AND 值2
     * @param connectedStart       值1
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedBetween(Boolean connectedStart,Boolean connectedEnd){
        if(connectedStart!=null && connectedEnd!=null){
            between("connected",connectedStart,connectedEnd);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT BETWEEN 值1 AND 值2
     * @param connectedStart       值1
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedNotBetween(Boolean connectedStart,Boolean connectedEnd){
        if(connectedStart!=null && connectedEnd!=null){
            notBetween("connected",connectedStart,connectedEnd);
        }
        return this;
     }


    /**
     * <p>代理是否连上</p>
     * LIKE '%值%' connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedLike(Boolean connected){
        if(connected!=null){
            like("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT LIKE '%值%' connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedNotLike(Boolean connected){
        if(connected!=null){
            notLike("connected",connected);
        }
        return this;
     }


    /**
     * <p>代理是否连上</p>
     * LIKE '%值' connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedLikeLeft(Boolean connected){
        if(connected!=null){
            likeLeft("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * LIKE '值%' connected
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedLikeRight(Boolean connected){
        if(connected!=null){
            likeRight("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedIsNull(){
        isNull("connected");
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedIsNotNull(){
        isNotNull("connected");
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("connected",value);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedIn(Boolean... values){
        if(values!=null && values.length>0){
            in("connected",values);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("connected",value);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper connectedNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("connected",values);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 等于 = proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpEq(String proxyNetIp){
        if(proxyNetIp!=null){
            eq("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 不等于 &lt;&gt; proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpNe(String proxyNetIp){
        if(proxyNetIp!=null){
            ne("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 大于 &gt; proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpGt(String proxyNetIp){
        if(proxyNetIp!=null){
            gt("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 大于等于 &gt;= proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpGe(String proxyNetIp){
        if(proxyNetIp!=null){
            ge("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 小于 &lt; proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpLt(String proxyNetIp){
        if(proxyNetIp!=null){
            lt("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 小于等于 &lt;= proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpLe(String proxyNetIp){
        if(proxyNetIp!=null){
            le("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * BETWEEN 值1 AND 值2
     * @param proxyNetIpStart       值1
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpBetween(String proxyNetIpStart,String proxyNetIpEnd){
        if(proxyNetIpStart!=null && proxyNetIpEnd!=null){
            between("proxy_net_ip",proxyNetIpStart,proxyNetIpEnd);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyNetIpStart       值1
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpNotBetween(String proxyNetIpStart,String proxyNetIpEnd){
        if(proxyNetIpStart!=null && proxyNetIpEnd!=null){
            notBetween("proxy_net_ip",proxyNetIpStart,proxyNetIpEnd);
        }
        return this;
     }


    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值%' proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpLike(String proxyNetIp){
        if(proxyNetIp!=null){
            like("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT LIKE '%值%' proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpNotLike(String proxyNetIp){
        if(proxyNetIp!=null){
            notLike("proxy_net_ip",proxyNetIp);
        }
        return this;
     }


    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值' proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpLikeLeft(String proxyNetIp){
        if(proxyNetIp!=null){
            likeLeft("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * LIKE '值%' proxyNetIp
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpLikeRight(String proxyNetIp){
        if(proxyNetIp!=null){
            likeRight("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpIsNull(){
        isNull("proxy_net_ip");
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpIsNotNull(){
        isNotNull("proxy_net_ip");
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_net_ip",value);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_net_ip",values);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_net_ip",value);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_net_ip",values);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 等于 = proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressEq(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            eq("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 不等于 &lt;&gt; proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressNe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            ne("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 大于 &gt; proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressGt(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            gt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 大于等于 &gt;= proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressGe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            ge("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 小于 &lt; proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressLt(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            lt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 小于等于 &lt;= proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressLe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            le("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * BETWEEN 值1 AND 值2
     * @param proxyNetIpAddressStart       值1
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressBetween(String proxyNetIpAddressStart,String proxyNetIpAddressEnd){
        if(proxyNetIpAddressStart!=null && proxyNetIpAddressEnd!=null){
            between("proxy_net_ip_address",proxyNetIpAddressStart,proxyNetIpAddressEnd);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyNetIpAddressStart       值1
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressNotBetween(String proxyNetIpAddressStart,String proxyNetIpAddressEnd){
        if(proxyNetIpAddressStart!=null && proxyNetIpAddressEnd!=null){
            notBetween("proxy_net_ip_address",proxyNetIpAddressStart,proxyNetIpAddressEnd);
        }
        return this;
     }


    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值%' proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressLike(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            like("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT LIKE '%值%' proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressNotLike(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            notLike("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }


    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值' proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressLikeLeft(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            likeLeft("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * LIKE '值%' proxyNetIpAddress
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressLikeRight(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            likeRight("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressIsNull(){
        isNull("proxy_net_ip_address");
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressIsNotNull(){
        isNotNull("proxy_net_ip_address");
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_net_ip_address",value);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_net_ip_address",values);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_net_ip_address",value);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper proxyNetIpAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_net_ip_address",values);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 等于 = seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceEq(Boolean seedDevice){
        if(seedDevice!=null){
            eq("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 不等于 &lt;&gt; seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceNe(Boolean seedDevice){
        if(seedDevice!=null){
            ne("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于 &gt; seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceGt(Boolean seedDevice){
        if(seedDevice!=null){
            gt("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于等于 &gt;= seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceGe(Boolean seedDevice){
        if(seedDevice!=null){
            ge("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于 &lt; seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceLt(Boolean seedDevice){
        if(seedDevice!=null){
            lt("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于等于 &lt;= seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceLe(Boolean seedDevice){
        if(seedDevice!=null){
            le("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * BETWEEN 值1 AND 值2
     * @param seedDeviceStart       值1
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceBetween(Boolean seedDeviceStart,Boolean seedDeviceEnd){
        if(seedDeviceStart!=null && seedDeviceEnd!=null){
            between("seed_device",seedDeviceStart,seedDeviceEnd);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param seedDeviceStart       值1
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceNotBetween(Boolean seedDeviceStart,Boolean seedDeviceEnd){
        if(seedDeviceStart!=null && seedDeviceEnd!=null){
            notBetween("seed_device",seedDeviceStart,seedDeviceEnd);
        }
        return this;
     }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值%' seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceLike(Boolean seedDevice){
        if(seedDevice!=null){
            like("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT LIKE '%值%' seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceNotLike(Boolean seedDevice){
        if(seedDevice!=null){
            notLike("seed_device",seedDevice);
        }
        return this;
     }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值' seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceLikeLeft(Boolean seedDevice){
        if(seedDevice!=null){
            likeLeft("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '值%' seedDevice
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceLikeRight(Boolean seedDevice){
        if(seedDevice!=null){
            likeRight("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceIsNull(){
        isNull("seed_device");
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceIsNotNull(){
        isNotNull("seed_device");
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("seed_device",value);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceIn(Boolean... values){
        if(values!=null && values.length>0){
            in("seed_device",values);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("seed_device",value);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper seedDeviceNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("seed_device",values);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 等于 = fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdEq(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            eq("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 不等于 &lt;&gt; fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdNe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            ne("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 大于 &gt; fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdGt(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            gt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 大于等于 &gt;= fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdGe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            ge("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 小于 &lt; fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdLt(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            lt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 小于等于 &lt;= fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdLe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            le("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * BETWEEN 值1 AND 值2
     * @param fkServerHostUsageRateIdStart       值1
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdBetween(Long fkServerHostUsageRateIdStart,Long fkServerHostUsageRateIdEnd){
        if(fkServerHostUsageRateIdStart!=null && fkServerHostUsageRateIdEnd!=null){
            between("fk_server_host_usage_rate_id",fkServerHostUsageRateIdStart,fkServerHostUsageRateIdEnd);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkServerHostUsageRateIdStart       值1
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdNotBetween(Long fkServerHostUsageRateIdStart,Long fkServerHostUsageRateIdEnd){
        if(fkServerHostUsageRateIdStart!=null && fkServerHostUsageRateIdEnd!=null){
            notBetween("fk_server_host_usage_rate_id",fkServerHostUsageRateIdStart,fkServerHostUsageRateIdEnd);
        }
        return this;
     }


    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值%' fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdLike(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            like("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT LIKE '%值%' fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdNotLike(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            notLike("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }


    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值' fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdLikeLeft(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            likeLeft("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * LIKE '值%' fkServerHostUsageRateId
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdLikeRight(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            likeRight("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdIsNull(){
        isNull("fk_server_host_usage_rate_id");
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdIsNotNull(){
        isNotNull("fk_server_host_usage_rate_id");
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_server_host_usage_rate_id",value);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_server_host_usage_rate_id",values);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_server_host_usage_rate_id",value);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkServerHostUsageRateIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_server_host_usage_rate_id",values);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 等于 = fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 不等于 &lt;&gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于 &gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于等于 &gt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于 &lt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于等于 &lt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * LIKE '值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


}
