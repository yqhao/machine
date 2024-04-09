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
public class YunMemberDeviceUpdateEntityWrapper extends UpdateWrapper<YunMemberDevice> {

    public static YunMemberDeviceUpdateEntityWrapper wrapper(YunMemberDevice entity) {
        return new YunMemberDeviceUpdateEntityWrapper(entity);
    }

    private YunMemberDevice entity;

    public YunMemberDeviceUpdateEntityWrapper(YunMemberDevice entity) {
        this.entity=entity;
    }

    /**
     * id
     */
    public YunMemberDeviceUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 用户id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 分组id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkEmMemberGroupId(Long fkEmMemberGroupId) {
         set("fk_em_member_group_id",fkEmMemberGroupId);
        return this;
    }
    /**
     * 用户设备编号
     */
    public YunMemberDeviceUpdateEntityWrapper setUserDeviceNo(String userDeviceNo) {
         set("user_device_no",userDeviceNo);
        return this;
    }
    /**
     * 严选下单实例id
     */
    public YunMemberDeviceUpdateEntityWrapper setSmkpInstanceId(String smkpInstanceId) {
         set("smkp_instance_id",smkpInstanceId);
        return this;
    }
    /**
     * 物理设备id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkEmSocDevicesId(Long fkEmSocDevicesId) {
         set("fk_em_soc_devices_id",fkEmSocDevicesId);
        return this;
    }
    /**
     * 虚拟设备id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkSocVmDevicesId(Long fkSocVmDevicesId) {
         set("fk_soc_vm_devices_id",fkSocVmDevicesId);
        return this;
    }
    /**
     * 分组名称
     */
    public YunMemberDeviceUpdateEntityWrapper setMemberGroupName(String memberGroupName) {
         set("member_group_name",memberGroupName);
        return this;
    }
    /**
     * 云机产品id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkYunProductId(Long fkYunProductId) {
         set("fk_yun_product_id",fkYunProductId);
        return this;
    }
    /**
     * 云机产品套餐skuid
     */
    public YunMemberDeviceUpdateEntityWrapper setFkYunProductSkuId(Long fkYunProductSkuId) {
         set("fk_yun_product_sku_id",fkYunProductSkuId);
        return this;
    }
    /**
     * 产品名称
     */
    public YunMemberDeviceUpdateEntityWrapper setProductName(String productName) {
         set("product_name",productName);
        return this;
    }
    /**
     * 设备唯一码
     */
    public YunMemberDeviceUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 设备名
     */
    public YunMemberDeviceUpdateEntityWrapper setDeviceName(String deviceName) {
         set("device_name",deviceName);
        return this;
    }
    /**
     * 使用有效期开始时间
     */
    public YunMemberDeviceUpdateEntityWrapper setValidStartTime(Date validStartTime) {
         set("valid_start_time",validStartTime);
        return this;
    }
    /**
     * 使用有效期结束时间
     */
    public YunMemberDeviceUpdateEntityWrapper setValidEndTime(Date validEndTime) {
         set("valid_end_time",validEndTime);
        return this;
    }
    /**
     * 冻结开始时间
     */
    public YunMemberDeviceUpdateEntityWrapper setFreezeStartTime(Date freezeStartTime) {
         set("freeze_start_time",freezeStartTime);
        return this;
    }
    /**
     * 冻结结束时间（释放设备的时间）
     */
    public YunMemberDeviceUpdateEntityWrapper setFreezeEndTime(Date freezeEndTime) {
         set("freeze_end_time",freezeEndTime);
        return this;
    }
    /**
     * 总天数（单位：天）
     */
    public YunMemberDeviceUpdateEntityWrapper setTotalAvailableDays(Integer totalAvailableDays) {
         set("total_available_days",totalAvailableDays);
        return this;
    }
    /**
     * 总时长（单位：小时）
     */
    public YunMemberDeviceUpdateEntityWrapper setTotalAvailableTimes(Integer totalAvailableTimes) {
         set("total_available_times",totalAvailableTimes);
        return this;
    }
    /**
     * 剩余可用天数
     */
    public YunMemberDeviceUpdateEntityWrapper setRestValidDays(Integer restValidDays) {
         set("rest_valid_days",restValidDays);
        return this;
    }
    /**
     * 剩余可用时长
     */
    public YunMemberDeviceUpdateEntityWrapper setRestValidTimes(Integer restValidTimes) {
         set("rest_valid_times",restValidTimes);
        return this;
    }
    /**
     * 设备类型(1:测试设备，2：商用设备)
     */
    public YunMemberDeviceUpdateEntityWrapper setBizType(Integer bizType) {
         set("biz_type",bizType);
        return this;
    }
    /**
     * 设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）
     */
    public YunMemberDeviceUpdateEntityWrapper setSourceType(Integer sourceType) {
         set("source_type",sourceType);
        return this;
    }
    /**
     * 过期缓冲时间
     */
    public YunMemberDeviceUpdateEntityWrapper setExpiredTimes(Integer expiredTimes) {
         set("expired_times",expiredTimes);
        return this;
    }
    /**
     * 生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)
     */
    public YunMemberDeviceUpdateEntityWrapper setLifecycle(String lifecycle) {
         set("lifecycle",lifecycle);
        return this;
    }
    /**
     * 恢复出厂设置次数
     */
    public YunMemberDeviceUpdateEntityWrapper setFactoryResetTimes(Integer factoryResetTimes) {
         set("factory_reset_times",factoryResetTimes);
        return this;
    }
    /**
     * 是否静音（静音：1，非静音：0）
     */
    public YunMemberDeviceUpdateEntityWrapper setIsSilent(Integer isSilent) {
         set("is_silent",isSilent);
        return this;
    }
    /**
     * 重启设备次数
     */
    public YunMemberDeviceUpdateEntityWrapper setRebootTimes(Integer rebootTimes) {
         set("reboot_times",rebootTimes);
        return this;
    }
    /**
     * 客户申报故障（0：无，1故障）
     */
    public YunMemberDeviceUpdateEntityWrapper setFailure(Integer failure) {
         set("failure",failure);
        return this;
    }
    /**
     * 应用同步安装(0：未执行，1同步中)
     */
    public YunMemberDeviceUpdateEntityWrapper setSyncInstall(Integer syncInstall) {
         set("sync_install",syncInstall);
        return this;
    }
    /**
     * 房间session
     */
    public YunMemberDeviceUpdateEntityWrapper setRoomSession(String roomSession) {
         set("room_session",roomSession);
        return this;
    }
    /**
     * 房间最大容纳成员数
     */
    public YunMemberDeviceUpdateEntityWrapper setRoomPeopleMaxNum(Integer roomPeopleMaxNum) {
         set("room_people_max_num",roomPeopleMaxNum);
        return this;
    }
    /**
     * 房间当前总成员数
     */
    public YunMemberDeviceUpdateEntityWrapper setRoomPeopleTotalNum(Integer roomPeopleTotalNum) {
         set("room_people_total_num",roomPeopleTotalNum);
        return this;
    }
    /**
     * 用户设备分配状态（未分配：0，已分配：1）
     */
    public YunMemberDeviceUpdateEntityWrapper setAllotStatus(Integer allotStatus) {
         set("allot_status",allotStatus);
        return this;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public YunMemberDeviceUpdateEntityWrapper setServerType(Integer serverType) {
         set("server_type",serverType);
        return this;
    }
    /**
     * 服务业务类型（0：普通业务类型，1：排队业务类型）
     */
    public YunMemberDeviceUpdateEntityWrapper setServiceBizType(Integer serviceBizType) {
         set("service_biz_type",serviceBizType);
        return this;
    }
    /**
     * 打开当前应用的下行宽带（kb）
     */
    public YunMemberDeviceUpdateEntityWrapper setDownstreamBroadband(Long downstreamBroadband) {
         set("downstream_broadband",downstreamBroadband);
        return this;
    }
    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）
     */
    public YunMemberDeviceUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 订购时间
     */
    public YunMemberDeviceUpdateEntityWrapper setBuyTime(Date buyTime) {
         set("buy_time",buyTime);
        return this;
    }
    /**
     * 最近一次续费时间
     */
    public YunMemberDeviceUpdateEntityWrapper setLastRenewTime(Date lastRenewTime) {
         set("last_renew_time",lastRenewTime);
        return this;
    }
    /**
     * 创建时间
     */
    public YunMemberDeviceUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 设备空闲上报时间
     */
    public YunMemberDeviceUpdateEntityWrapper setIdleTime(Date idleTime) {
         set("idle_time",idleTime);
        return this;
    }
    /**
     * 
     */
    public YunMemberDeviceUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyProvince(String proxyProvince) {
         set("proxy_province",proxyProvince);
        return this;
    }
    /**
     * 
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyCity(String proxyCity) {
         set("proxy_city",proxyCity);
        return this;
    }
    /**
     * 代理服务器的地址，缺省或null或\"\"时，表示没有使用代理
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyServer(String proxyServer) {
         set("proxy_server",proxyServer);
        return this;
    }
    /**
     * 代理是否连上
     */
    public YunMemberDeviceUpdateEntityWrapper setConnected(Boolean connected) {
         set("connected",connected);
        return this;
    }
    /**
     * 当前代理的网络IP
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyNetIp(String proxyNetIp) {
         set("proxy_net_ip",proxyNetIp);
        return this;
    }
    /**
     * IP的地理位置显示
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyNetIpAddress(String proxyNetIpAddress) {
         set("proxy_net_ip_address",proxyNetIpAddress);
        return this;
    }
    /**
     * 是否种子机（0：否，1：是）
     */
    public YunMemberDeviceUpdateEntityWrapper setSeedDevice(Boolean seedDevice) {
         set("seed_device",seedDevice);
        return this;
    }
    /**
     * 物理机使用率记录id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkServerHostUsageRateId(Long fkServerHostUsageRateId) {
         set("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        return this;
    }
    /**
     * 区域id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }

    protected YunMemberDevice entity() {
        if(entity==null){
            throw new NullPointerException("YunMemberDevice is null");
        }
        return entity;
    }

    /**
     * id
     */
    public YunMemberDeviceUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 用户id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkMemberId() {
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            set("fk_member_id",fkMemberId);
        }
        return this;
    }
    /**
     * 分组id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkEmMemberGroupId() {
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            set("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }
    /**
     * 用户设备编号
     */
    public YunMemberDeviceUpdateEntityWrapper setUserDeviceNo() {
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            set("user_device_no",userDeviceNo);
        }
        return this;
    }
    /**
     * 严选下单实例id
     */
    public YunMemberDeviceUpdateEntityWrapper setSmkpInstanceId() {
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            set("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }
    /**
     * 物理设备id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkEmSocDevicesId() {
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            set("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }
    /**
     * 虚拟设备id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkSocVmDevicesId() {
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            set("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }
    /**
     * 分组名称
     */
    public YunMemberDeviceUpdateEntityWrapper setMemberGroupName() {
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            set("member_group_name",memberGroupName);
        }
        return this;
    }
    /**
     * 云机产品id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkYunProductId() {
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            set("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }
    /**
     * 云机产品套餐skuid
     */
    public YunMemberDeviceUpdateEntityWrapper setFkYunProductSkuId() {
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            set("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }
    /**
     * 产品名称
     */
    public YunMemberDeviceUpdateEntityWrapper setProductName() {
        String productName =entity().getProductName();
        if(productName!=null){
            set("product_name",productName);
        }
        return this;
    }
    /**
     * 设备唯一码
     */
    public YunMemberDeviceUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 设备名
     */
    public YunMemberDeviceUpdateEntityWrapper setDeviceName() {
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            set("device_name",deviceName);
        }
        return this;
    }
    /**
     * 使用有效期开始时间
     */
    public YunMemberDeviceUpdateEntityWrapper setValidStartTime() {
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            set("valid_start_time",validStartTime);
        }
        return this;
    }
    /**
     * 使用有效期结束时间
     */
    public YunMemberDeviceUpdateEntityWrapper setValidEndTime() {
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            set("valid_end_time",validEndTime);
        }
        return this;
    }
    /**
     * 冻结开始时间
     */
    public YunMemberDeviceUpdateEntityWrapper setFreezeStartTime() {
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            set("freeze_start_time",freezeStartTime);
        }
        return this;
    }
    /**
     * 冻结结束时间（释放设备的时间）
     */
    public YunMemberDeviceUpdateEntityWrapper setFreezeEndTime() {
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            set("freeze_end_time",freezeEndTime);
        }
        return this;
    }
    /**
     * 总天数（单位：天）
     */
    public YunMemberDeviceUpdateEntityWrapper setTotalAvailableDays() {
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            set("total_available_days",totalAvailableDays);
        }
        return this;
    }
    /**
     * 总时长（单位：小时）
     */
    public YunMemberDeviceUpdateEntityWrapper setTotalAvailableTimes() {
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            set("total_available_times",totalAvailableTimes);
        }
        return this;
    }
    /**
     * 剩余可用天数
     */
    public YunMemberDeviceUpdateEntityWrapper setRestValidDays() {
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            set("rest_valid_days",restValidDays);
        }
        return this;
    }
    /**
     * 剩余可用时长
     */
    public YunMemberDeviceUpdateEntityWrapper setRestValidTimes() {
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            set("rest_valid_times",restValidTimes);
        }
        return this;
    }
    /**
     * 设备类型(1:测试设备，2：商用设备)
     */
    public YunMemberDeviceUpdateEntityWrapper setBizType() {
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            set("biz_type",bizType);
        }
        return this;
    }
    /**
     * 设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）
     */
    public YunMemberDeviceUpdateEntityWrapper setSourceType() {
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            set("source_type",sourceType);
        }
        return this;
    }
    /**
     * 过期缓冲时间
     */
    public YunMemberDeviceUpdateEntityWrapper setExpiredTimes() {
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            set("expired_times",expiredTimes);
        }
        return this;
    }
    /**
     * 生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)
     */
    public YunMemberDeviceUpdateEntityWrapper setLifecycle() {
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            set("lifecycle",lifecycle);
        }
        return this;
    }
    /**
     * 恢复出厂设置次数
     */
    public YunMemberDeviceUpdateEntityWrapper setFactoryResetTimes() {
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            set("factory_reset_times",factoryResetTimes);
        }
        return this;
    }
    /**
     * 是否静音（静音：1，非静音：0）
     */
    public YunMemberDeviceUpdateEntityWrapper setIsSilent() {
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            set("is_silent",isSilent);
        }
        return this;
    }
    /**
     * 重启设备次数
     */
    public YunMemberDeviceUpdateEntityWrapper setRebootTimes() {
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            set("reboot_times",rebootTimes);
        }
        return this;
    }
    /**
     * 客户申报故障（0：无，1故障）
     */
    public YunMemberDeviceUpdateEntityWrapper setFailure() {
        Integer failure =entity().getFailure();
        if(failure!=null){
            set("failure",failure);
        }
        return this;
    }
    /**
     * 应用同步安装(0：未执行，1同步中)
     */
    public YunMemberDeviceUpdateEntityWrapper setSyncInstall() {
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            set("sync_install",syncInstall);
        }
        return this;
    }
    /**
     * 房间session
     */
    public YunMemberDeviceUpdateEntityWrapper setRoomSession() {
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            set("room_session",roomSession);
        }
        return this;
    }
    /**
     * 房间最大容纳成员数
     */
    public YunMemberDeviceUpdateEntityWrapper setRoomPeopleMaxNum() {
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            set("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }
    /**
     * 房间当前总成员数
     */
    public YunMemberDeviceUpdateEntityWrapper setRoomPeopleTotalNum() {
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            set("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }
    /**
     * 用户设备分配状态（未分配：0，已分配：1）
     */
    public YunMemberDeviceUpdateEntityWrapper setAllotStatus() {
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            set("allot_status",allotStatus);
        }
        return this;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public YunMemberDeviceUpdateEntityWrapper setServerType() {
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            set("server_type",serverType);
        }
        return this;
    }
    /**
     * 服务业务类型（0：普通业务类型，1：排队业务类型）
     */
    public YunMemberDeviceUpdateEntityWrapper setServiceBizType() {
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            set("service_biz_type",serviceBizType);
        }
        return this;
    }
    /**
     * 打开当前应用的下行宽带（kb）
     */
    public YunMemberDeviceUpdateEntityWrapper setDownstreamBroadband() {
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            set("downstream_broadband",downstreamBroadband);
        }
        return this;
    }
    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）
     */
    public YunMemberDeviceUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 订购时间
     */
    public YunMemberDeviceUpdateEntityWrapper setBuyTime() {
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            set("buy_time",buyTime);
        }
        return this;
    }
    /**
     * 最近一次续费时间
     */
    public YunMemberDeviceUpdateEntityWrapper setLastRenewTime() {
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            set("last_renew_time",lastRenewTime);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public YunMemberDeviceUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 设备空闲上报时间
     */
    public YunMemberDeviceUpdateEntityWrapper setIdleTime() {
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            set("idle_time",idleTime);
        }
        return this;
    }
    /**
     * 
     */
    public YunMemberDeviceUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }
    /**
     * 
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyProvince() {
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            set("proxy_province",proxyProvince);
        }
        return this;
    }
    /**
     * 
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyCity() {
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            set("proxy_city",proxyCity);
        }
        return this;
    }
    /**
     * 代理服务器的地址，缺省或null或\"\"时，表示没有使用代理
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyServer() {
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            set("proxy_server",proxyServer);
        }
        return this;
    }
    /**
     * 代理是否连上
     */
    public YunMemberDeviceUpdateEntityWrapper setConnected() {
        Boolean connected =entity().getConnected();
        if(connected!=null){
            set("connected",connected);
        }
        return this;
    }
    /**
     * 当前代理的网络IP
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyNetIp() {
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            set("proxy_net_ip",proxyNetIp);
        }
        return this;
    }
    /**
     * IP的地理位置显示
     */
    public YunMemberDeviceUpdateEntityWrapper setProxyNetIpAddress() {
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            set("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }
    /**
     * 是否种子机（0：否，1：是）
     */
    public YunMemberDeviceUpdateEntityWrapper setSeedDevice() {
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            set("seed_device",seedDevice);
        }
        return this;
    }
    /**
     * 物理机使用率记录id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkServerHostUsageRateId() {
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            set("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }
    /**
     * 区域id
     */
    public YunMemberDeviceUpdateEntityWrapper setFkPcpAreaId() {
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            set("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    public YunMemberDeviceUpdateEntityWrapper Where() {
        return this;
    }

    /**
     * <p>id</p>
     * 等于 = entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>id</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

/**
     * <p>id</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
    }


    /**
     * <p>id</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idLikeRight(Long id){
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
    public YunMemberDeviceUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper idIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 等于 = entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdEq(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 不等于 &lt;&gt; entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdNe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于 &gt; entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdGt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于等于 &gt;= entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdGe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于 &lt; entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于等于 &lt;= entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值%' entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT LIKE '%值%' entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdNotLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值' entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLikeLeft(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * LIKE '值%' entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLikeRight(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

/**
     * <p>用户id</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 不等于 &lt;&gt;
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 大于 &gt;
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 大于等于 &gt;=
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 小于 &lt;
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 小于等于 &lt;=
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * NOT LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
    }


    /**
     * <p>用户id</p>
     * LIKE '%值'
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * LIKE '值%'
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 等于 = entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdEq(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            eq("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 不等于 &lt;&gt; entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdNe(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            ne("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 大于 &gt; entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdGt(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            gt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 大于等于 &gt;= entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdGe(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            ge("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 小于 &lt; entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLt(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            lt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 小于等于 &lt;= entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLe(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            le("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * BETWEEN  entity().getFkEmMemberGroupId() AND 值2
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdBetween(Long fkEmMemberGroupIdEnd){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null && fkEmMemberGroupIdEnd!=null){
            between("fk_em_member_group_id",fkEmMemberGroupId,fkEmMemberGroupIdEnd);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT BETWEEN  entity().getFkEmMemberGroupId() AND 值2
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdNotBetween(Long fkEmMemberGroupIdEnd){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null && fkEmMemberGroupIdEnd!=null){
            notBetween("fk_em_member_group_id",fkEmMemberGroupId,fkEmMemberGroupIdEnd);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * BETWEEN  entity().getFkEmMemberGroupId() AND 值2
     * @param fkEmMemberGroupIdStart       值1
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdBetween(Long fkEmMemberGroupIdStart,Long fkEmMemberGroupIdEnd){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null && fkEmMemberGroupIdEnd!=null){
            between("fk_em_member_group_id",fkEmMemberGroupIdStart,fkEmMemberGroupIdEnd);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT BETWEEN  entity().getFkEmMemberGroupId() AND 值2
     * @param fkEmMemberGroupIdStart       值1
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdNotBetween(Long fkEmMemberGroupIdStart,Long fkEmMemberGroupIdEnd){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null && fkEmMemberGroupIdEnd!=null){
            notBetween("fk_em_member_group_id",fkEmMemberGroupIdStart,fkEmMemberGroupIdEnd);
        }
        return this;
     }


    /**
     * <p>分组id</p>
     * LIKE '%值%' entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLike(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            like("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT LIKE '%值%' entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdNotLike(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            notLike("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }


    /**
     * <p>分组id</p>
     * LIKE '%值' entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLikeLeft(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            likeLeft("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * LIKE '值%' entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLikeRight(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            likeRight("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

/**
     * <p>分组id</p>
     * 等于 =
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdEq(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            eq("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 不等于 &lt;&gt;
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdNe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            ne("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 大于 &gt;
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdGt(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            gt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 大于等于 &gt;=
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdGe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            ge("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 小于 &lt;
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLt(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            lt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 小于等于 &lt;=
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            le("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * LIKE '%值%'
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLike(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            like("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * NOT LIKE '%值%'
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdNotLike(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            notLike("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }


    /**
     * <p>分组id</p>
     * LIKE '%值'
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLikeLeft(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            likeLeft("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * LIKE '值%'
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdLikeRight(Long fkEmMemberGroupId){
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
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdIsNull(){
        isNull("fk_em_member_group_id");
        return this;
    }

    /**
     * <p>分组id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdIsNotNull(){
        isNotNull("fk_em_member_group_id");
        return this;
    }

    /**
     * <p>分组id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkEmMemberGroupIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_member_group_id",values);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 等于 = entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoEq(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            eq("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 不等于 &lt;&gt; entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoNe(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            ne("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 大于 &gt; entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoGt(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            gt("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 大于等于 &gt;= entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoGe(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            ge("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 小于 &lt; entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLt(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            lt("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 小于等于 &lt;= entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLe(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            le("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * BETWEEN  entity().getUserDeviceNo() AND 值2
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoBetween(String userDeviceNoEnd){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null && userDeviceNoEnd!=null){
            between("user_device_no",userDeviceNo,userDeviceNoEnd);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT BETWEEN  entity().getUserDeviceNo() AND 值2
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoNotBetween(String userDeviceNoEnd){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null && userDeviceNoEnd!=null){
            notBetween("user_device_no",userDeviceNo,userDeviceNoEnd);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * BETWEEN  entity().getUserDeviceNo() AND 值2
     * @param userDeviceNoStart       值1
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoBetween(String userDeviceNoStart,String userDeviceNoEnd){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null && userDeviceNoEnd!=null){
            between("user_device_no",userDeviceNoStart,userDeviceNoEnd);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT BETWEEN  entity().getUserDeviceNo() AND 值2
     * @param userDeviceNoStart       值1
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoNotBetween(String userDeviceNoStart,String userDeviceNoEnd){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null && userDeviceNoEnd!=null){
            notBetween("user_device_no",userDeviceNoStart,userDeviceNoEnd);
        }
        return this;
     }


    /**
     * <p>用户设备编号</p>
     * LIKE '%值%' entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLike(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            like("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT LIKE '%值%' entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoNotLike(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            notLike("user_device_no",userDeviceNo);
        }
        return this;
     }


    /**
     * <p>用户设备编号</p>
     * LIKE '%值' entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLikeLeft(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            likeLeft("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * LIKE '值%' entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLikeRight(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            likeRight("user_device_no",userDeviceNo);
        }
        return this;
     }

/**
     * <p>用户设备编号</p>
     * 等于 =
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoEq(String userDeviceNo){
        if(userDeviceNo!=null){
            eq("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 不等于 &lt;&gt;
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoNe(String userDeviceNo){
        if(userDeviceNo!=null){
            ne("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 大于 &gt;
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoGt(String userDeviceNo){
        if(userDeviceNo!=null){
            gt("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 大于等于 &gt;=
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoGe(String userDeviceNo){
        if(userDeviceNo!=null){
            ge("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 小于 &lt;
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLt(String userDeviceNo){
        if(userDeviceNo!=null){
            lt("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 小于等于 &lt;=
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLe(String userDeviceNo){
        if(userDeviceNo!=null){
            le("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * LIKE '%值%'
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLike(String userDeviceNo){
        if(userDeviceNo!=null){
            like("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * NOT LIKE '%值%'
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoNotLike(String userDeviceNo){
        if(userDeviceNo!=null){
            notLike("user_device_no",userDeviceNo);
        }
        return this;
    }


    /**
     * <p>用户设备编号</p>
     * LIKE '%值'
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLikeLeft(String userDeviceNo){
        if(userDeviceNo!=null){
            likeLeft("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * LIKE '值%'
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoLikeRight(String userDeviceNo){
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
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoIsNull(){
        isNull("user_device_no");
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoIsNotNull(){
        isNotNull("user_device_no");
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper userDeviceNoNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_device_no",values);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 等于 = entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdEq(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            eq("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 不等于 &lt;&gt; entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdNe(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            ne("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 大于 &gt; entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdGt(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            gt("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 大于等于 &gt;= entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdGe(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            ge("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 小于 &lt; entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLt(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            lt("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 小于等于 &lt;= entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLe(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            le("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * BETWEEN  entity().getSmkpInstanceId() AND 值2
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdBetween(String smkpInstanceIdEnd){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null && smkpInstanceIdEnd!=null){
            between("smkp_instance_id",smkpInstanceId,smkpInstanceIdEnd);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT BETWEEN  entity().getSmkpInstanceId() AND 值2
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdNotBetween(String smkpInstanceIdEnd){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null && smkpInstanceIdEnd!=null){
            notBetween("smkp_instance_id",smkpInstanceId,smkpInstanceIdEnd);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * BETWEEN  entity().getSmkpInstanceId() AND 值2
     * @param smkpInstanceIdStart       值1
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdBetween(String smkpInstanceIdStart,String smkpInstanceIdEnd){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null && smkpInstanceIdEnd!=null){
            between("smkp_instance_id",smkpInstanceIdStart,smkpInstanceIdEnd);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT BETWEEN  entity().getSmkpInstanceId() AND 值2
     * @param smkpInstanceIdStart       值1
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdNotBetween(String smkpInstanceIdStart,String smkpInstanceIdEnd){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null && smkpInstanceIdEnd!=null){
            notBetween("smkp_instance_id",smkpInstanceIdStart,smkpInstanceIdEnd);
        }
        return this;
     }


    /**
     * <p>严选下单实例id</p>
     * LIKE '%值%' entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLike(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            like("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT LIKE '%值%' entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdNotLike(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            notLike("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }


    /**
     * <p>严选下单实例id</p>
     * LIKE '%值' entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLikeLeft(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            likeLeft("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * LIKE '值%' entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLikeRight(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            likeRight("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

/**
     * <p>严选下单实例id</p>
     * 等于 =
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdEq(String smkpInstanceId){
        if(smkpInstanceId!=null){
            eq("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 不等于 &lt;&gt;
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdNe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            ne("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 大于 &gt;
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdGt(String smkpInstanceId){
        if(smkpInstanceId!=null){
            gt("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 大于等于 &gt;=
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdGe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            ge("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 小于 &lt;
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLt(String smkpInstanceId){
        if(smkpInstanceId!=null){
            lt("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 小于等于 &lt;=
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            le("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * LIKE '%值%'
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLike(String smkpInstanceId){
        if(smkpInstanceId!=null){
            like("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * NOT LIKE '%值%'
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdNotLike(String smkpInstanceId){
        if(smkpInstanceId!=null){
            notLike("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }


    /**
     * <p>严选下单实例id</p>
     * LIKE '%值'
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLikeLeft(String smkpInstanceId){
        if(smkpInstanceId!=null){
            likeLeft("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * LIKE '值%'
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdLikeRight(String smkpInstanceId){
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
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdIsNull(){
        isNull("smkp_instance_id");
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdIsNotNull(){
        isNotNull("smkp_instance_id");
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper smkpInstanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("smkp_instance_id",values);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 等于 = entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdEq(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 不等于 &lt;&gt; entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdNe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于 &gt; entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdGt(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于等于 &gt;= entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdGe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于 &lt; entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLt(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于等于 &lt;= entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesId,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesId,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值%' entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLike(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT LIKE '%值%' entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdNotLike(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值' entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLikeLeft(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * LIKE '值%' entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLikeRight(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            likeRight("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

/**
     * <p>物理设备id</p>
     * 等于 =
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 不等于 &lt;&gt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 大于 &gt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 大于等于 &gt;=
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 小于 &lt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 小于等于 &lt;=
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * LIKE '%值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * NOT LIKE '%值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }


    /**
     * <p>物理设备id</p>
     * LIKE '%值'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * LIKE '值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
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
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 等于 = entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdEq(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            eq("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 不等于 &lt;&gt; entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdNe(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            ne("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 大于 &gt; entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdGt(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            gt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 大于等于 &gt;= entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdGe(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            ge("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 小于 &lt; entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLt(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            lt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 小于等于 &lt;= entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLe(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            le("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * BETWEEN  entity().getFkSocVmDevicesId() AND 值2
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdBetween(Long fkSocVmDevicesIdEnd){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null && fkSocVmDevicesIdEnd!=null){
            between("fk_soc_vm_devices_id",fkSocVmDevicesId,fkSocVmDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT BETWEEN  entity().getFkSocVmDevicesId() AND 值2
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdNotBetween(Long fkSocVmDevicesIdEnd){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null && fkSocVmDevicesIdEnd!=null){
            notBetween("fk_soc_vm_devices_id",fkSocVmDevicesId,fkSocVmDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * BETWEEN  entity().getFkSocVmDevicesId() AND 值2
     * @param fkSocVmDevicesIdStart       值1
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdBetween(Long fkSocVmDevicesIdStart,Long fkSocVmDevicesIdEnd){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null && fkSocVmDevicesIdEnd!=null){
            between("fk_soc_vm_devices_id",fkSocVmDevicesIdStart,fkSocVmDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT BETWEEN  entity().getFkSocVmDevicesId() AND 值2
     * @param fkSocVmDevicesIdStart       值1
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdNotBetween(Long fkSocVmDevicesIdStart,Long fkSocVmDevicesIdEnd){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null && fkSocVmDevicesIdEnd!=null){
            notBetween("fk_soc_vm_devices_id",fkSocVmDevicesIdStart,fkSocVmDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>虚拟设备id</p>
     * LIKE '%值%' entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLike(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            like("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT LIKE '%值%' entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdNotLike(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            notLike("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }


    /**
     * <p>虚拟设备id</p>
     * LIKE '%值' entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLikeLeft(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            likeLeft("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * LIKE '值%' entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLikeRight(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            likeRight("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

/**
     * <p>虚拟设备id</p>
     * 等于 =
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdEq(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            eq("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 不等于 &lt;&gt;
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdNe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            ne("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 大于 &gt;
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdGt(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            gt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 大于等于 &gt;=
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdGe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            ge("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 小于 &lt;
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLt(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            lt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 小于等于 &lt;=
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            le("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * LIKE '%值%'
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLike(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            like("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * NOT LIKE '%值%'
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdNotLike(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            notLike("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }


    /**
     * <p>虚拟设备id</p>
     * LIKE '%值'
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLikeLeft(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            likeLeft("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * LIKE '值%'
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdLikeRight(Long fkSocVmDevicesId){
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
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdIsNull(){
        isNull("fk_soc_vm_devices_id");
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdIsNotNull(){
        isNotNull("fk_soc_vm_devices_id");
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkSocVmDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_soc_vm_devices_id",values);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 等于 = entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameEq(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            eq("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 不等于 &lt;&gt; entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameNe(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            ne("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 大于 &gt; entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameGt(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            gt("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 大于等于 &gt;= entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameGe(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            ge("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 小于 &lt; entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLt(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            lt("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 小于等于 &lt;= entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLe(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            le("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * BETWEEN  entity().getMemberGroupName() AND 值2
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameBetween(String memberGroupNameEnd){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null && memberGroupNameEnd!=null){
            between("member_group_name",memberGroupName,memberGroupNameEnd);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT BETWEEN  entity().getMemberGroupName() AND 值2
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameNotBetween(String memberGroupNameEnd){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null && memberGroupNameEnd!=null){
            notBetween("member_group_name",memberGroupName,memberGroupNameEnd);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * BETWEEN  entity().getMemberGroupName() AND 值2
     * @param memberGroupNameStart       值1
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameBetween(String memberGroupNameStart,String memberGroupNameEnd){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null && memberGroupNameEnd!=null){
            between("member_group_name",memberGroupNameStart,memberGroupNameEnd);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT BETWEEN  entity().getMemberGroupName() AND 值2
     * @param memberGroupNameStart       值1
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameNotBetween(String memberGroupNameStart,String memberGroupNameEnd){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null && memberGroupNameEnd!=null){
            notBetween("member_group_name",memberGroupNameStart,memberGroupNameEnd);
        }
        return this;
     }


    /**
     * <p>分组名称</p>
     * LIKE '%值%' entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLike(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            like("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT LIKE '%值%' entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameNotLike(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            notLike("member_group_name",memberGroupName);
        }
        return this;
     }


    /**
     * <p>分组名称</p>
     * LIKE '%值' entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLikeLeft(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            likeLeft("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * LIKE '值%' entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLikeRight(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            likeRight("member_group_name",memberGroupName);
        }
        return this;
     }

/**
     * <p>分组名称</p>
     * 等于 =
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameEq(String memberGroupName){
        if(memberGroupName!=null){
            eq("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 不等于 &lt;&gt;
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameNe(String memberGroupName){
        if(memberGroupName!=null){
            ne("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 大于 &gt;
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameGt(String memberGroupName){
        if(memberGroupName!=null){
            gt("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 大于等于 &gt;=
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameGe(String memberGroupName){
        if(memberGroupName!=null){
            ge("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 小于 &lt;
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLt(String memberGroupName){
        if(memberGroupName!=null){
            lt("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 小于等于 &lt;=
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLe(String memberGroupName){
        if(memberGroupName!=null){
            le("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * LIKE '%值%'
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLike(String memberGroupName){
        if(memberGroupName!=null){
            like("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * NOT LIKE '%值%'
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameNotLike(String memberGroupName){
        if(memberGroupName!=null){
            notLike("member_group_name",memberGroupName);
        }
        return this;
    }


    /**
     * <p>分组名称</p>
     * LIKE '%值'
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLikeLeft(String memberGroupName){
        if(memberGroupName!=null){
            likeLeft("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * LIKE '值%'
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameLikeRight(String memberGroupName){
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
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameIsNull(){
        isNull("member_group_name");
        return this;
    }

    /**
     * <p>分组名称</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameIsNotNull(){
        isNotNull("member_group_name");
        return this;
    }

    /**
     * <p>分组名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper memberGroupNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("member_group_name",values);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 等于 = entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdEq(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            eq("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 不等于 &lt;&gt; entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdNe(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            ne("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 大于 &gt; entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdGt(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            gt("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 大于等于 &gt;= entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdGe(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            ge("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 小于 &lt; entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLt(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            lt("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 小于等于 &lt;= entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLe(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            le("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * BETWEEN  entity().getFkYunProductId() AND 值2
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdBetween(Long fkYunProductIdEnd){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null && fkYunProductIdEnd!=null){
            between("fk_yun_product_id",fkYunProductId,fkYunProductIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT BETWEEN  entity().getFkYunProductId() AND 值2
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdNotBetween(Long fkYunProductIdEnd){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null && fkYunProductIdEnd!=null){
            notBetween("fk_yun_product_id",fkYunProductId,fkYunProductIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * BETWEEN  entity().getFkYunProductId() AND 值2
     * @param fkYunProductIdStart       值1
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdBetween(Long fkYunProductIdStart,Long fkYunProductIdEnd){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null && fkYunProductIdEnd!=null){
            between("fk_yun_product_id",fkYunProductIdStart,fkYunProductIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT BETWEEN  entity().getFkYunProductId() AND 值2
     * @param fkYunProductIdStart       值1
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdNotBetween(Long fkYunProductIdStart,Long fkYunProductIdEnd){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null && fkYunProductIdEnd!=null){
            notBetween("fk_yun_product_id",fkYunProductIdStart,fkYunProductIdEnd);
        }
        return this;
     }


    /**
     * <p>云机产品id</p>
     * LIKE '%值%' entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLike(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            like("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT LIKE '%值%' entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdNotLike(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            notLike("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }


    /**
     * <p>云机产品id</p>
     * LIKE '%值' entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLikeLeft(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            likeLeft("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * LIKE '值%' entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLikeRight(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            likeRight("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

/**
     * <p>云机产品id</p>
     * 等于 =
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdEq(Long fkYunProductId){
        if(fkYunProductId!=null){
            eq("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 不等于 &lt;&gt;
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdNe(Long fkYunProductId){
        if(fkYunProductId!=null){
            ne("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 大于 &gt;
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdGt(Long fkYunProductId){
        if(fkYunProductId!=null){
            gt("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 大于等于 &gt;=
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdGe(Long fkYunProductId){
        if(fkYunProductId!=null){
            ge("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 小于 &lt;
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLt(Long fkYunProductId){
        if(fkYunProductId!=null){
            lt("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 小于等于 &lt;=
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLe(Long fkYunProductId){
        if(fkYunProductId!=null){
            le("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * LIKE '%值%'
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLike(Long fkYunProductId){
        if(fkYunProductId!=null){
            like("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * NOT LIKE '%值%'
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdNotLike(Long fkYunProductId){
        if(fkYunProductId!=null){
            notLike("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }


    /**
     * <p>云机产品id</p>
     * LIKE '%值'
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLikeLeft(Long fkYunProductId){
        if(fkYunProductId!=null){
            likeLeft("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * LIKE '值%'
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdLikeRight(Long fkYunProductId){
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
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdIsNull(){
        isNull("fk_yun_product_id");
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdIsNotNull(){
        isNotNull("fk_yun_product_id");
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkYunProductIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_product_id",values);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 等于 = entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdEq(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            eq("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 不等于 &lt;&gt; entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdNe(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            ne("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于 &gt; entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdGt(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            gt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于等于 &gt;= entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdGe(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            ge("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于 &lt; entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLt(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            lt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于等于 &lt;= entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLe(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            le("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * BETWEEN  entity().getFkYunProductSkuId() AND 值2
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdBetween(Long fkYunProductSkuIdEnd){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null && fkYunProductSkuIdEnd!=null){
            between("fk_yun_product_sku_id",fkYunProductSkuId,fkYunProductSkuIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT BETWEEN  entity().getFkYunProductSkuId() AND 值2
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdNotBetween(Long fkYunProductSkuIdEnd){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null && fkYunProductSkuIdEnd!=null){
            notBetween("fk_yun_product_sku_id",fkYunProductSkuId,fkYunProductSkuIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * BETWEEN  entity().getFkYunProductSkuId() AND 值2
     * @param fkYunProductSkuIdStart       值1
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdBetween(Long fkYunProductSkuIdStart,Long fkYunProductSkuIdEnd){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null && fkYunProductSkuIdEnd!=null){
            between("fk_yun_product_sku_id",fkYunProductSkuIdStart,fkYunProductSkuIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT BETWEEN  entity().getFkYunProductSkuId() AND 值2
     * @param fkYunProductSkuIdStart       值1
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdNotBetween(Long fkYunProductSkuIdStart,Long fkYunProductSkuIdEnd){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null && fkYunProductSkuIdEnd!=null){
            notBetween("fk_yun_product_sku_id",fkYunProductSkuIdStart,fkYunProductSkuIdEnd);
        }
        return this;
     }


    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值%' entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLike(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            like("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT LIKE '%值%' entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdNotLike(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            notLike("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }


    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值' entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLikeLeft(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            likeLeft("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '值%' entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLikeRight(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            likeRight("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

/**
     * <p>云机产品套餐skuid</p>
     * 等于 =
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdEq(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            eq("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 不等于 &lt;&gt;
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdNe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            ne("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于 &gt;
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdGt(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            gt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于等于 &gt;=
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdGe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            ge("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于 &lt;
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLt(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            lt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于等于 &lt;=
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            le("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值%'
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLike(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            like("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT LIKE '%值%'
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdNotLike(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            notLike("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }


    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值'
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLikeLeft(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            likeLeft("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '值%'
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdLikeRight(Long fkYunProductSkuId){
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
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdIsNull(){
        isNull("fk_yun_product_sku_id");
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdIsNotNull(){
        isNotNull("fk_yun_product_sku_id");
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkYunProductSkuIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_product_sku_id",values);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 等于 = entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameEq(){
        String productName =entity().getProductName();
        if(productName!=null){
            eq("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 不等于 &lt;&gt; entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameNe(){
        String productName =entity().getProductName();
        if(productName!=null){
            ne("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 大于 &gt; entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameGt(){
        String productName =entity().getProductName();
        if(productName!=null){
            gt("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 大于等于 &gt;= entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameGe(){
        String productName =entity().getProductName();
        if(productName!=null){
            ge("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 小于 &lt; entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLt(){
        String productName =entity().getProductName();
        if(productName!=null){
            lt("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 小于等于 &lt;= entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLe(){
        String productName =entity().getProductName();
        if(productName!=null){
            le("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * BETWEEN  entity().getProductName() AND 值2
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameBetween(String productNameEnd){
        String productName =entity().getProductName();
        if(productName!=null && productNameEnd!=null){
            between("product_name",productName,productNameEnd);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT BETWEEN  entity().getProductName() AND 值2
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameNotBetween(String productNameEnd){
        String productName =entity().getProductName();
        if(productName!=null && productNameEnd!=null){
            notBetween("product_name",productName,productNameEnd);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * BETWEEN  entity().getProductName() AND 值2
     * @param productNameStart       值1
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameBetween(String productNameStart,String productNameEnd){
        String productName =entity().getProductName();
        if(productName!=null && productNameEnd!=null){
            between("product_name",productNameStart,productNameEnd);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT BETWEEN  entity().getProductName() AND 值2
     * @param productNameStart       值1
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameNotBetween(String productNameStart,String productNameEnd){
        String productName =entity().getProductName();
        if(productName!=null && productNameEnd!=null){
            notBetween("product_name",productNameStart,productNameEnd);
        }
        return this;
     }


    /**
     * <p>产品名称</p>
     * LIKE '%值%' entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLike(){
        String productName =entity().getProductName();
        if(productName!=null){
            like("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT LIKE '%值%' entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameNotLike(){
        String productName =entity().getProductName();
        if(productName!=null){
            notLike("product_name",productName);
        }
        return this;
     }


    /**
     * <p>产品名称</p>
     * LIKE '%值' entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLikeLeft(){
        String productName =entity().getProductName();
        if(productName!=null){
            likeLeft("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * LIKE '值%' entity().getProductName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLikeRight(){
        String productName =entity().getProductName();
        if(productName!=null){
            likeRight("product_name",productName);
        }
        return this;
     }

/**
     * <p>产品名称</p>
     * 等于 =
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameEq(String productName){
        if(productName!=null){
            eq("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 不等于 &lt;&gt;
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameNe(String productName){
        if(productName!=null){
            ne("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 大于 &gt;
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameGt(String productName){
        if(productName!=null){
            gt("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 大于等于 &gt;=
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameGe(String productName){
        if(productName!=null){
            ge("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 小于 &lt;
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLt(String productName){
        if(productName!=null){
            lt("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 小于等于 &lt;=
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLe(String productName){
        if(productName!=null){
            le("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * LIKE '%值%'
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLike(String productName){
        if(productName!=null){
            like("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * NOT LIKE '%值%'
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameNotLike(String productName){
        if(productName!=null){
            notLike("product_name",productName);
        }
        return this;
    }


    /**
     * <p>产品名称</p>
     * LIKE '%值'
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLikeLeft(String productName){
        if(productName!=null){
            likeLeft("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * LIKE '值%'
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameLikeRight(String productName){
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
    public YunMemberDeviceUpdateEntityWrapper productNameIsNull(){
        isNull("product_name");
        return this;
    }

    /**
     * <p>产品名称</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameIsNotNull(){
        isNotNull("product_name");
        return this;
    }

    /**
     * <p>产品名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper productNameIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper productNameIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper productNameNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper productNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("product_name",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdEq(){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceId,deviceIdEnd);
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

/**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdEq(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdNe(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdGt(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdGe(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdLt(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdLe(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdLike(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdNotLike(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 等于 = entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameEq(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            eq("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 不等于 &lt;&gt; entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameNe(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            ne("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 大于 &gt; entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameGt(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            gt("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 大于等于 &gt;= entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameGe(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            ge("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 小于 &lt; entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLt(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            lt("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 小于等于 &lt;= entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLe(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            le("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * BETWEEN  entity().getDeviceName() AND 值2
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameBetween(String deviceNameEnd){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null && deviceNameEnd!=null){
            between("device_name",deviceName,deviceNameEnd);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT BETWEEN  entity().getDeviceName() AND 值2
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameNotBetween(String deviceNameEnd){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null && deviceNameEnd!=null){
            notBetween("device_name",deviceName,deviceNameEnd);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * BETWEEN  entity().getDeviceName() AND 值2
     * @param deviceNameStart       值1
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameBetween(String deviceNameStart,String deviceNameEnd){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null && deviceNameEnd!=null){
            between("device_name",deviceNameStart,deviceNameEnd);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT BETWEEN  entity().getDeviceName() AND 值2
     * @param deviceNameStart       值1
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameNotBetween(String deviceNameStart,String deviceNameEnd){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null && deviceNameEnd!=null){
            notBetween("device_name",deviceNameStart,deviceNameEnd);
        }
        return this;
     }


    /**
     * <p>设备名</p>
     * LIKE '%值%' entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLike(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            like("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT LIKE '%值%' entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameNotLike(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            notLike("device_name",deviceName);
        }
        return this;
     }


    /**
     * <p>设备名</p>
     * LIKE '%值' entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLikeLeft(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            likeLeft("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * LIKE '值%' entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLikeRight(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            likeRight("device_name",deviceName);
        }
        return this;
     }

/**
     * <p>设备名</p>
     * 等于 =
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameEq(String deviceName){
        if(deviceName!=null){
            eq("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 不等于 &lt;&gt;
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameNe(String deviceName){
        if(deviceName!=null){
            ne("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 大于 &gt;
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameGt(String deviceName){
        if(deviceName!=null){
            gt("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 大于等于 &gt;=
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameGe(String deviceName){
        if(deviceName!=null){
            ge("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 小于 &lt;
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLt(String deviceName){
        if(deviceName!=null){
            lt("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 小于等于 &lt;=
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLe(String deviceName){
        if(deviceName!=null){
            le("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * LIKE '%值%'
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLike(String deviceName){
        if(deviceName!=null){
            like("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * NOT LIKE '%值%'
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameNotLike(String deviceName){
        if(deviceName!=null){
            notLike("device_name",deviceName);
        }
        return this;
    }


    /**
     * <p>设备名</p>
     * LIKE '%值'
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLikeLeft(String deviceName){
        if(deviceName!=null){
            likeLeft("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * LIKE '值%'
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameLikeRight(String deviceName){
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
    public YunMemberDeviceUpdateEntityWrapper deviceNameIsNull(){
        isNull("device_name");
        return this;
    }

    /**
     * <p>设备名</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameIsNotNull(){
        isNotNull("device_name");
        return this;
    }

    /**
     * <p>设备名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper deviceNameIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper deviceNameIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper deviceNameNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper deviceNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_name",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 等于 = entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeEq(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt; entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeNe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt; entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeGt(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;= entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeGe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt; entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLt(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;= entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeBetween(Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTime,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeNotBetween(Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTime,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%' entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%' entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeNotLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值' entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLikeLeft(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%' entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLikeRight(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            likeRight("valid_start_time",validStartTime);
        }
        return this;
     }

/**
     * <p>使用有效期开始时间</p>
     * 等于 =
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeEq(Date validStartTime){
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt;
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeNe(Date validStartTime){
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt;
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeGt(Date validStartTime){
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;=
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeGe(Date validStartTime){
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt;
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLt(Date validStartTime){
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;=
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLe(Date validStartTime){
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLike(Date validStartTime){
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeNotLike(Date validStartTime){
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
    }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLikeLeft(Date validStartTime){
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeLikeRight(Date validStartTime){
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
    public YunMemberDeviceUpdateEntityWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validStartTimeIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper validStartTimeIn(Date... values){
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
    public YunMemberDeviceUpdateEntityWrapper validStartTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper validStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 等于 = entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeEq(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt; entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeNe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt; entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeGt(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;= entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeGe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt; entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLt(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;= entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeBetween(Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTime,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeNotBetween(Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTime,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%' entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%' entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeNotLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值' entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLikeLeft(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%' entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLikeRight(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            likeRight("valid_end_time",validEndTime);
        }
        return this;
     }

/**
     * <p>使用有效期结束时间</p>
     * 等于 =
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeEq(Date validEndTime){
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt;
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeNe(Date validEndTime){
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt;
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeGt(Date validEndTime){
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;=
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeGe(Date validEndTime){
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt;
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLt(Date validEndTime){
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;=
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLe(Date validEndTime){
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLike(Date validEndTime){
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeNotLike(Date validEndTime){
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
    }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLikeLeft(Date validEndTime){
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeLikeRight(Date validEndTime){
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
    public YunMemberDeviceUpdateEntityWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper validEndTimeIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper validEndTimeIn(Date... values){
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
    public YunMemberDeviceUpdateEntityWrapper validEndTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 等于 = entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeEq(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            eq("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 不等于 &lt;&gt; entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeNe(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            ne("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 大于 &gt; entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeGt(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            gt("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 大于等于 &gt;= entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeGe(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            ge("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 小于 &lt; entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLt(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            lt("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 小于等于 &lt;= entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLe(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            le("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * BETWEEN  entity().getFreezeStartTime() AND 值2
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeBetween(Date freezeStartTimeEnd){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null && freezeStartTimeEnd!=null){
            between("freeze_start_time",freezeStartTime,freezeStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT BETWEEN  entity().getFreezeStartTime() AND 值2
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeNotBetween(Date freezeStartTimeEnd){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null && freezeStartTimeEnd!=null){
            notBetween("freeze_start_time",freezeStartTime,freezeStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * BETWEEN  entity().getFreezeStartTime() AND 值2
     * @param freezeStartTimeStart       值1
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeBetween(Date freezeStartTimeStart,Date freezeStartTimeEnd){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null && freezeStartTimeEnd!=null){
            between("freeze_start_time",freezeStartTimeStart,freezeStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT BETWEEN  entity().getFreezeStartTime() AND 值2
     * @param freezeStartTimeStart       值1
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeNotBetween(Date freezeStartTimeStart,Date freezeStartTimeEnd){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null && freezeStartTimeEnd!=null){
            notBetween("freeze_start_time",freezeStartTimeStart,freezeStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>冻结开始时间</p>
     * LIKE '%值%' entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLike(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            like("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT LIKE '%值%' entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeNotLike(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            notLike("freeze_start_time",freezeStartTime);
        }
        return this;
     }


    /**
     * <p>冻结开始时间</p>
     * LIKE '%值' entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLikeLeft(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            likeLeft("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * LIKE '值%' entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLikeRight(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            likeRight("freeze_start_time",freezeStartTime);
        }
        return this;
     }

/**
     * <p>冻结开始时间</p>
     * 等于 =
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeEq(Date freezeStartTime){
        if(freezeStartTime!=null){
            eq("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 不等于 &lt;&gt;
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeNe(Date freezeStartTime){
        if(freezeStartTime!=null){
            ne("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 大于 &gt;
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeGt(Date freezeStartTime){
        if(freezeStartTime!=null){
            gt("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 大于等于 &gt;=
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeGe(Date freezeStartTime){
        if(freezeStartTime!=null){
            ge("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 小于 &lt;
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLt(Date freezeStartTime){
        if(freezeStartTime!=null){
            lt("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 小于等于 &lt;=
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLe(Date freezeStartTime){
        if(freezeStartTime!=null){
            le("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * LIKE '%值%'
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLike(Date freezeStartTime){
        if(freezeStartTime!=null){
            like("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * NOT LIKE '%值%'
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeNotLike(Date freezeStartTime){
        if(freezeStartTime!=null){
            notLike("freeze_start_time",freezeStartTime);
        }
        return this;
    }


    /**
     * <p>冻结开始时间</p>
     * LIKE '%值'
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLikeLeft(Date freezeStartTime){
        if(freezeStartTime!=null){
            likeLeft("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * LIKE '值%'
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeLikeRight(Date freezeStartTime){
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
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeIsNull(){
        isNull("freeze_start_time");
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeIsNotNull(){
        isNotNull("freeze_start_time");
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeIn(Date... values){
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
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper freezeStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("freeze_start_time",values);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 等于 = entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeEq(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            eq("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 不等于 &lt;&gt; entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeNe(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            ne("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于 &gt; entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeGt(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            gt("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于等于 &gt;= entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeGe(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            ge("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于 &lt; entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLt(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            lt("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于等于 &lt;= entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLe(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            le("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * BETWEEN  entity().getFreezeEndTime() AND 值2
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeBetween(Date freezeEndTimeEnd){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null && freezeEndTimeEnd!=null){
            between("freeze_end_time",freezeEndTime,freezeEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT BETWEEN  entity().getFreezeEndTime() AND 值2
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeNotBetween(Date freezeEndTimeEnd){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null && freezeEndTimeEnd!=null){
            notBetween("freeze_end_time",freezeEndTime,freezeEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * BETWEEN  entity().getFreezeEndTime() AND 值2
     * @param freezeEndTimeStart       值1
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeBetween(Date freezeEndTimeStart,Date freezeEndTimeEnd){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null && freezeEndTimeEnd!=null){
            between("freeze_end_time",freezeEndTimeStart,freezeEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT BETWEEN  entity().getFreezeEndTime() AND 值2
     * @param freezeEndTimeStart       值1
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeNotBetween(Date freezeEndTimeStart,Date freezeEndTimeEnd){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null && freezeEndTimeEnd!=null){
            notBetween("freeze_end_time",freezeEndTimeStart,freezeEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值%' entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLike(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            like("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT LIKE '%值%' entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeNotLike(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            notLike("freeze_end_time",freezeEndTime);
        }
        return this;
     }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值' entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLikeLeft(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            likeLeft("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '值%' entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLikeRight(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            likeRight("freeze_end_time",freezeEndTime);
        }
        return this;
     }

/**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 等于 =
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeEq(Date freezeEndTime){
        if(freezeEndTime!=null){
            eq("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 不等于 &lt;&gt;
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeNe(Date freezeEndTime){
        if(freezeEndTime!=null){
            ne("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于 &gt;
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeGt(Date freezeEndTime){
        if(freezeEndTime!=null){
            gt("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于等于 &gt;=
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeGe(Date freezeEndTime){
        if(freezeEndTime!=null){
            ge("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于 &lt;
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLt(Date freezeEndTime){
        if(freezeEndTime!=null){
            lt("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于等于 &lt;=
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLe(Date freezeEndTime){
        if(freezeEndTime!=null){
            le("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值%'
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLike(Date freezeEndTime){
        if(freezeEndTime!=null){
            like("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT LIKE '%值%'
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeNotLike(Date freezeEndTime){
        if(freezeEndTime!=null){
            notLike("freeze_end_time",freezeEndTime);
        }
        return this;
    }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值'
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLikeLeft(Date freezeEndTime){
        if(freezeEndTime!=null){
            likeLeft("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '值%'
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeLikeRight(Date freezeEndTime){
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
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeIsNull(){
        isNull("freeze_end_time");
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeIsNotNull(){
        isNotNull("freeze_end_time");
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeIn(Date... values){
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
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper freezeEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("freeze_end_time",values);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 等于 = entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysEq(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            eq("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 不等于 &lt;&gt; entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysNe(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            ne("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 大于 &gt; entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysGt(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            gt("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 大于等于 &gt;= entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysGe(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            ge("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 小于 &lt; entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLt(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            lt("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 小于等于 &lt;= entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLe(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            le("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * BETWEEN  entity().getTotalAvailableDays() AND 值2
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysBetween(Integer totalAvailableDaysEnd){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null && totalAvailableDaysEnd!=null){
            between("total_available_days",totalAvailableDays,totalAvailableDaysEnd);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT BETWEEN  entity().getTotalAvailableDays() AND 值2
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysNotBetween(Integer totalAvailableDaysEnd){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null && totalAvailableDaysEnd!=null){
            notBetween("total_available_days",totalAvailableDays,totalAvailableDaysEnd);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * BETWEEN  entity().getTotalAvailableDays() AND 值2
     * @param totalAvailableDaysStart       值1
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysBetween(Integer totalAvailableDaysStart,Integer totalAvailableDaysEnd){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null && totalAvailableDaysEnd!=null){
            between("total_available_days",totalAvailableDaysStart,totalAvailableDaysEnd);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT BETWEEN  entity().getTotalAvailableDays() AND 值2
     * @param totalAvailableDaysStart       值1
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysNotBetween(Integer totalAvailableDaysStart,Integer totalAvailableDaysEnd){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null && totalAvailableDaysEnd!=null){
            notBetween("total_available_days",totalAvailableDaysStart,totalAvailableDaysEnd);
        }
        return this;
     }


    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值%' entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLike(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            like("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT LIKE '%值%' entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysNotLike(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            notLike("total_available_days",totalAvailableDays);
        }
        return this;
     }


    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值' entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLikeLeft(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            likeLeft("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * LIKE '值%' entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLikeRight(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            likeRight("total_available_days",totalAvailableDays);
        }
        return this;
     }

/**
     * <p>总天数（单位：天）</p>
     * 等于 =
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysEq(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            eq("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 不等于 &lt;&gt;
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysNe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            ne("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 大于 &gt;
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysGt(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            gt("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 大于等于 &gt;=
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysGe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            ge("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 小于 &lt;
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLt(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            lt("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 小于等于 &lt;=
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            le("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值%'
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLike(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            like("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * NOT LIKE '%值%'
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysNotLike(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            notLike("total_available_days",totalAvailableDays);
        }
        return this;
    }


    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值'
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLikeLeft(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            likeLeft("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * LIKE '值%'
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysLikeRight(Integer totalAvailableDays){
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
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysIsNull(){
        isNull("total_available_days");
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysIsNotNull(){
        isNotNull("total_available_days");
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper totalAvailableDaysNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("total_available_days",values);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 等于 = entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesEq(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            eq("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 不等于 &lt;&gt; entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesNe(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            ne("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于 &gt; entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesGt(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            gt("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于等于 &gt;= entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesGe(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            ge("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于 &lt; entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLt(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            lt("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于等于 &lt;= entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLe(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            le("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * BETWEEN  entity().getTotalAvailableTimes() AND 值2
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesBetween(Integer totalAvailableTimesEnd){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null && totalAvailableTimesEnd!=null){
            between("total_available_times",totalAvailableTimes,totalAvailableTimesEnd);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT BETWEEN  entity().getTotalAvailableTimes() AND 值2
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesNotBetween(Integer totalAvailableTimesEnd){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null && totalAvailableTimesEnd!=null){
            notBetween("total_available_times",totalAvailableTimes,totalAvailableTimesEnd);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * BETWEEN  entity().getTotalAvailableTimes() AND 值2
     * @param totalAvailableTimesStart       值1
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesBetween(Integer totalAvailableTimesStart,Integer totalAvailableTimesEnd){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null && totalAvailableTimesEnd!=null){
            between("total_available_times",totalAvailableTimesStart,totalAvailableTimesEnd);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT BETWEEN  entity().getTotalAvailableTimes() AND 值2
     * @param totalAvailableTimesStart       值1
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesNotBetween(Integer totalAvailableTimesStart,Integer totalAvailableTimesEnd){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null && totalAvailableTimesEnd!=null){
            notBetween("total_available_times",totalAvailableTimesStart,totalAvailableTimesEnd);
        }
        return this;
     }


    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值%' entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLike(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            like("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT LIKE '%值%' entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesNotLike(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            notLike("total_available_times",totalAvailableTimes);
        }
        return this;
     }


    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值' entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLikeLeft(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            likeLeft("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '值%' entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLikeRight(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            likeRight("total_available_times",totalAvailableTimes);
        }
        return this;
     }

/**
     * <p>总时长（单位：小时）</p>
     * 等于 =
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesEq(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            eq("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 不等于 &lt;&gt;
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesNe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            ne("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于 &gt;
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesGt(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            gt("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于等于 &gt;=
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesGe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            ge("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于 &lt;
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLt(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            lt("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于等于 &lt;=
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            le("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值%'
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLike(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            like("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT LIKE '%值%'
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesNotLike(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            notLike("total_available_times",totalAvailableTimes);
        }
        return this;
    }


    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值'
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLikeLeft(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            likeLeft("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '值%'
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesLikeRight(Integer totalAvailableTimes){
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
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesIsNull(){
        isNull("total_available_times");
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesIsNotNull(){
        isNotNull("total_available_times");
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper totalAvailableTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("total_available_times",values);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 等于 = entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysEq(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            eq("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 不等于 &lt;&gt; entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysNe(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            ne("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 大于 &gt; entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysGt(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            gt("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 大于等于 &gt;= entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysGe(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            ge("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 小于 &lt; entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLt(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            lt("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 小于等于 &lt;= entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLe(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            le("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * BETWEEN  entity().getRestValidDays() AND 值2
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysBetween(Integer restValidDaysEnd){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null && restValidDaysEnd!=null){
            between("rest_valid_days",restValidDays,restValidDaysEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT BETWEEN  entity().getRestValidDays() AND 值2
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysNotBetween(Integer restValidDaysEnd){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null && restValidDaysEnd!=null){
            notBetween("rest_valid_days",restValidDays,restValidDaysEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * BETWEEN  entity().getRestValidDays() AND 值2
     * @param restValidDaysStart       值1
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysBetween(Integer restValidDaysStart,Integer restValidDaysEnd){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null && restValidDaysEnd!=null){
            between("rest_valid_days",restValidDaysStart,restValidDaysEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT BETWEEN  entity().getRestValidDays() AND 值2
     * @param restValidDaysStart       值1
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysNotBetween(Integer restValidDaysStart,Integer restValidDaysEnd){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null && restValidDaysEnd!=null){
            notBetween("rest_valid_days",restValidDaysStart,restValidDaysEnd);
        }
        return this;
     }


    /**
     * <p>剩余可用天数</p>
     * LIKE '%值%' entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLike(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            like("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT LIKE '%值%' entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysNotLike(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            notLike("rest_valid_days",restValidDays);
        }
        return this;
     }


    /**
     * <p>剩余可用天数</p>
     * LIKE '%值' entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLikeLeft(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            likeLeft("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * LIKE '值%' entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLikeRight(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            likeRight("rest_valid_days",restValidDays);
        }
        return this;
     }

/**
     * <p>剩余可用天数</p>
     * 等于 =
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysEq(Integer restValidDays){
        if(restValidDays!=null){
            eq("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 不等于 &lt;&gt;
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysNe(Integer restValidDays){
        if(restValidDays!=null){
            ne("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 大于 &gt;
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysGt(Integer restValidDays){
        if(restValidDays!=null){
            gt("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 大于等于 &gt;=
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysGe(Integer restValidDays){
        if(restValidDays!=null){
            ge("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 小于 &lt;
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLt(Integer restValidDays){
        if(restValidDays!=null){
            lt("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 小于等于 &lt;=
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLe(Integer restValidDays){
        if(restValidDays!=null){
            le("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * LIKE '%值%'
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLike(Integer restValidDays){
        if(restValidDays!=null){
            like("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * NOT LIKE '%值%'
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysNotLike(Integer restValidDays){
        if(restValidDays!=null){
            notLike("rest_valid_days",restValidDays);
        }
        return this;
    }


    /**
     * <p>剩余可用天数</p>
     * LIKE '%值'
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLikeLeft(Integer restValidDays){
        if(restValidDays!=null){
            likeLeft("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * LIKE '值%'
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysLikeRight(Integer restValidDays){
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
    public YunMemberDeviceUpdateEntityWrapper restValidDaysIsNull(){
        isNull("rest_valid_days");
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysIsNotNull(){
        isNotNull("rest_valid_days");
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidDaysIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper restValidDaysIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper restValidDaysNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper restValidDaysNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rest_valid_days",values);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 等于 = entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesEq(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            eq("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 不等于 &lt;&gt; entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesNe(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            ne("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 大于 &gt; entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesGt(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            gt("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 大于等于 &gt;= entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesGe(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            ge("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 小于 &lt; entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLt(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            lt("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 小于等于 &lt;= entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLe(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            le("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * BETWEEN  entity().getRestValidTimes() AND 值2
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesBetween(Integer restValidTimesEnd){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null && restValidTimesEnd!=null){
            between("rest_valid_times",restValidTimes,restValidTimesEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT BETWEEN  entity().getRestValidTimes() AND 值2
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesNotBetween(Integer restValidTimesEnd){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null && restValidTimesEnd!=null){
            notBetween("rest_valid_times",restValidTimes,restValidTimesEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * BETWEEN  entity().getRestValidTimes() AND 值2
     * @param restValidTimesStart       值1
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesBetween(Integer restValidTimesStart,Integer restValidTimesEnd){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null && restValidTimesEnd!=null){
            between("rest_valid_times",restValidTimesStart,restValidTimesEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT BETWEEN  entity().getRestValidTimes() AND 值2
     * @param restValidTimesStart       值1
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesNotBetween(Integer restValidTimesStart,Integer restValidTimesEnd){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null && restValidTimesEnd!=null){
            notBetween("rest_valid_times",restValidTimesStart,restValidTimesEnd);
        }
        return this;
     }


    /**
     * <p>剩余可用时长</p>
     * LIKE '%值%' entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLike(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            like("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT LIKE '%值%' entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesNotLike(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            notLike("rest_valid_times",restValidTimes);
        }
        return this;
     }


    /**
     * <p>剩余可用时长</p>
     * LIKE '%值' entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLikeLeft(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            likeLeft("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * LIKE '值%' entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLikeRight(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            likeRight("rest_valid_times",restValidTimes);
        }
        return this;
     }

/**
     * <p>剩余可用时长</p>
     * 等于 =
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesEq(Integer restValidTimes){
        if(restValidTimes!=null){
            eq("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 不等于 &lt;&gt;
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesNe(Integer restValidTimes){
        if(restValidTimes!=null){
            ne("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 大于 &gt;
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesGt(Integer restValidTimes){
        if(restValidTimes!=null){
            gt("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 大于等于 &gt;=
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesGe(Integer restValidTimes){
        if(restValidTimes!=null){
            ge("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 小于 &lt;
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLt(Integer restValidTimes){
        if(restValidTimes!=null){
            lt("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 小于等于 &lt;=
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLe(Integer restValidTimes){
        if(restValidTimes!=null){
            le("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * LIKE '%值%'
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLike(Integer restValidTimes){
        if(restValidTimes!=null){
            like("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * NOT LIKE '%值%'
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesNotLike(Integer restValidTimes){
        if(restValidTimes!=null){
            notLike("rest_valid_times",restValidTimes);
        }
        return this;
    }


    /**
     * <p>剩余可用时长</p>
     * LIKE '%值'
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLikeLeft(Integer restValidTimes){
        if(restValidTimes!=null){
            likeLeft("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * LIKE '值%'
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesLikeRight(Integer restValidTimes){
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
    public YunMemberDeviceUpdateEntityWrapper restValidTimesIsNull(){
        isNull("rest_valid_times");
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesIsNotNull(){
        isNotNull("rest_valid_times");
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper restValidTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper restValidTimesIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper restValidTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper restValidTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rest_valid_times",values);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 等于 = entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeEq(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 不等于 &lt;&gt; entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeNe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于 &gt; entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeGt(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于等于 &gt;= entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeGe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于 &lt; entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLt(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于等于 &lt;= entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeBetween(Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            between("biz_type",bizType,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeNotBetween(Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizType,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeBetween(Integer bizTypeStart,Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            between("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeNotBetween(Integer bizTypeStart,Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值%' entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLike(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT LIKE '%值%' entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeNotLike(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
     }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值' entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLikeLeft(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '值%' entity().getBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLikeRight(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            likeRight("biz_type",bizType);
        }
        return this;
     }

/**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 等于 =
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeEq(Integer bizType){
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 不等于 &lt;&gt;
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeNe(Integer bizType){
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于 &gt;
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeGt(Integer bizType){
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于等于 &gt;=
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeGe(Integer bizType){
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于 &lt;
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLt(Integer bizType){
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于等于 &lt;=
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLe(Integer bizType){
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLike(Integer bizType){
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeNotLike(Integer bizType){
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
    }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值'
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLikeLeft(Integer bizType){
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '值%'
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeLikeRight(Integer bizType){
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
    public YunMemberDeviceUpdateEntityWrapper bizTypeIsNull(){
        isNull("biz_type");
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeIsNotNull(){
        isNotNull("biz_type");
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper bizTypeIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper bizTypeIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper bizTypeNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper bizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("biz_type",values);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 等于 = entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeEq(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            eq("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 不等于 &lt;&gt; entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeNe(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            ne("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于 &gt; entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeGt(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            gt("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于等于 &gt;= entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeGe(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            ge("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于 &lt; entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLt(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            lt("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于等于 &lt;= entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLe(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            le("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * BETWEEN  entity().getSourceType() AND 值2
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeBetween(Integer sourceTypeEnd){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null && sourceTypeEnd!=null){
            between("source_type",sourceType,sourceTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT BETWEEN  entity().getSourceType() AND 值2
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeNotBetween(Integer sourceTypeEnd){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null && sourceTypeEnd!=null){
            notBetween("source_type",sourceType,sourceTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * BETWEEN  entity().getSourceType() AND 值2
     * @param sourceTypeStart       值1
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeBetween(Integer sourceTypeStart,Integer sourceTypeEnd){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null && sourceTypeEnd!=null){
            between("source_type",sourceTypeStart,sourceTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT BETWEEN  entity().getSourceType() AND 值2
     * @param sourceTypeStart       值1
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeNotBetween(Integer sourceTypeStart,Integer sourceTypeEnd){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null && sourceTypeEnd!=null){
            notBetween("source_type",sourceTypeStart,sourceTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值%' entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLike(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            like("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT LIKE '%值%' entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeNotLike(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            notLike("source_type",sourceType);
        }
        return this;
     }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值' entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLikeLeft(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            likeLeft("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '值%' entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLikeRight(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            likeRight("source_type",sourceType);
        }
        return this;
     }

/**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 等于 =
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeEq(Integer sourceType){
        if(sourceType!=null){
            eq("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 不等于 &lt;&gt;
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeNe(Integer sourceType){
        if(sourceType!=null){
            ne("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于 &gt;
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeGt(Integer sourceType){
        if(sourceType!=null){
            gt("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于等于 &gt;=
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeGe(Integer sourceType){
        if(sourceType!=null){
            ge("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于 &lt;
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLt(Integer sourceType){
        if(sourceType!=null){
            lt("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于等于 &lt;=
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLe(Integer sourceType){
        if(sourceType!=null){
            le("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值%'
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLike(Integer sourceType){
        if(sourceType!=null){
            like("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT LIKE '%值%'
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeNotLike(Integer sourceType){
        if(sourceType!=null){
            notLike("source_type",sourceType);
        }
        return this;
    }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值'
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLikeLeft(Integer sourceType){
        if(sourceType!=null){
            likeLeft("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '值%'
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeLikeRight(Integer sourceType){
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
    public YunMemberDeviceUpdateEntityWrapper sourceTypeIsNull(){
        isNull("source_type");
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeIsNotNull(){
        isNotNull("source_type");
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper sourceTypeIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper sourceTypeIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper sourceTypeNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper sourceTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("source_type",values);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 等于 = entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesEq(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            eq("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 不等于 &lt;&gt; entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesNe(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            ne("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 大于 &gt; entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesGt(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            gt("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 大于等于 &gt;= entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesGe(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            ge("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 小于 &lt; entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLt(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            lt("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 小于等于 &lt;= entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLe(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            le("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * BETWEEN  entity().getExpiredTimes() AND 值2
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesBetween(Integer expiredTimesEnd){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null && expiredTimesEnd!=null){
            between("expired_times",expiredTimes,expiredTimesEnd);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT BETWEEN  entity().getExpiredTimes() AND 值2
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesNotBetween(Integer expiredTimesEnd){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null && expiredTimesEnd!=null){
            notBetween("expired_times",expiredTimes,expiredTimesEnd);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * BETWEEN  entity().getExpiredTimes() AND 值2
     * @param expiredTimesStart       值1
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesBetween(Integer expiredTimesStart,Integer expiredTimesEnd){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null && expiredTimesEnd!=null){
            between("expired_times",expiredTimesStart,expiredTimesEnd);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT BETWEEN  entity().getExpiredTimes() AND 值2
     * @param expiredTimesStart       值1
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesNotBetween(Integer expiredTimesStart,Integer expiredTimesEnd){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null && expiredTimesEnd!=null){
            notBetween("expired_times",expiredTimesStart,expiredTimesEnd);
        }
        return this;
     }


    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值%' entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLike(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            like("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT LIKE '%值%' entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesNotLike(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            notLike("expired_times",expiredTimes);
        }
        return this;
     }


    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值' entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLikeLeft(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            likeLeft("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * LIKE '值%' entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLikeRight(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            likeRight("expired_times",expiredTimes);
        }
        return this;
     }

/**
     * <p>过期缓冲时间</p>
     * 等于 =
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesEq(Integer expiredTimes){
        if(expiredTimes!=null){
            eq("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 不等于 &lt;&gt;
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesNe(Integer expiredTimes){
        if(expiredTimes!=null){
            ne("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 大于 &gt;
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesGt(Integer expiredTimes){
        if(expiredTimes!=null){
            gt("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 大于等于 &gt;=
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesGe(Integer expiredTimes){
        if(expiredTimes!=null){
            ge("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 小于 &lt;
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLt(Integer expiredTimes){
        if(expiredTimes!=null){
            lt("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 小于等于 &lt;=
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLe(Integer expiredTimes){
        if(expiredTimes!=null){
            le("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值%'
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLike(Integer expiredTimes){
        if(expiredTimes!=null){
            like("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * NOT LIKE '%值%'
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesNotLike(Integer expiredTimes){
        if(expiredTimes!=null){
            notLike("expired_times",expiredTimes);
        }
        return this;
    }


    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值'
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLikeLeft(Integer expiredTimes){
        if(expiredTimes!=null){
            likeLeft("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * LIKE '值%'
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesLikeRight(Integer expiredTimes){
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
    public YunMemberDeviceUpdateEntityWrapper expiredTimesIsNull(){
        isNull("expired_times");
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesIsNotNull(){
        isNotNull("expired_times");
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper expiredTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper expiredTimesIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper expiredTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper expiredTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("expired_times",values);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 等于 = entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleEq(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            eq("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 不等于 &lt;&gt; entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleNe(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            ne("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于 &gt; entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleGt(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            gt("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于等于 &gt;= entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleGe(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            ge("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于 &lt; entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLt(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            lt("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于等于 &lt;= entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLe(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            le("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * BETWEEN  entity().getLifecycle() AND 值2
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleBetween(String lifecycleEnd){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null && lifecycleEnd!=null){
            between("lifecycle",lifecycle,lifecycleEnd);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT BETWEEN  entity().getLifecycle() AND 值2
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleNotBetween(String lifecycleEnd){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null && lifecycleEnd!=null){
            notBetween("lifecycle",lifecycle,lifecycleEnd);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * BETWEEN  entity().getLifecycle() AND 值2
     * @param lifecycleStart       值1
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleBetween(String lifecycleStart,String lifecycleEnd){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null && lifecycleEnd!=null){
            between("lifecycle",lifecycleStart,lifecycleEnd);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT BETWEEN  entity().getLifecycle() AND 值2
     * @param lifecycleStart       值1
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleNotBetween(String lifecycleStart,String lifecycleEnd){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null && lifecycleEnd!=null){
            notBetween("lifecycle",lifecycleStart,lifecycleEnd);
        }
        return this;
     }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值%' entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLike(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            like("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT LIKE '%值%' entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleNotLike(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            notLike("lifecycle",lifecycle);
        }
        return this;
     }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值' entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLikeLeft(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            likeLeft("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '值%' entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLikeRight(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            likeRight("lifecycle",lifecycle);
        }
        return this;
     }

/**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 等于 =
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleEq(String lifecycle){
        if(lifecycle!=null){
            eq("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 不等于 &lt;&gt;
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleNe(String lifecycle){
        if(lifecycle!=null){
            ne("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于 &gt;
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleGt(String lifecycle){
        if(lifecycle!=null){
            gt("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于等于 &gt;=
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleGe(String lifecycle){
        if(lifecycle!=null){
            ge("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于 &lt;
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLt(String lifecycle){
        if(lifecycle!=null){
            lt("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于等于 &lt;=
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLe(String lifecycle){
        if(lifecycle!=null){
            le("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值%'
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLike(String lifecycle){
        if(lifecycle!=null){
            like("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT LIKE '%值%'
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleNotLike(String lifecycle){
        if(lifecycle!=null){
            notLike("lifecycle",lifecycle);
        }
        return this;
    }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值'
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLikeLeft(String lifecycle){
        if(lifecycle!=null){
            likeLeft("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '值%'
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleLikeRight(String lifecycle){
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
    public YunMemberDeviceUpdateEntityWrapper lifecycleIsNull(){
        isNull("lifecycle");
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleIsNotNull(){
        isNotNull("lifecycle");
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lifecycleIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper lifecycleIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper lifecycleNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper lifecycleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("lifecycle",values);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 等于 = entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesEq(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            eq("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 不等于 &lt;&gt; entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesNe(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            ne("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于 &gt; entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesGt(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            gt("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于等于 &gt;= entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesGe(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            ge("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于 &lt; entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLt(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            lt("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于等于 &lt;= entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLe(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            le("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * BETWEEN  entity().getFactoryResetTimes() AND 值2
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesBetween(Integer factoryResetTimesEnd){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null && factoryResetTimesEnd!=null){
            between("factory_reset_times",factoryResetTimes,factoryResetTimesEnd);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT BETWEEN  entity().getFactoryResetTimes() AND 值2
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesNotBetween(Integer factoryResetTimesEnd){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null && factoryResetTimesEnd!=null){
            notBetween("factory_reset_times",factoryResetTimes,factoryResetTimesEnd);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * BETWEEN  entity().getFactoryResetTimes() AND 值2
     * @param factoryResetTimesStart       值1
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesBetween(Integer factoryResetTimesStart,Integer factoryResetTimesEnd){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null && factoryResetTimesEnd!=null){
            between("factory_reset_times",factoryResetTimesStart,factoryResetTimesEnd);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT BETWEEN  entity().getFactoryResetTimes() AND 值2
     * @param factoryResetTimesStart       值1
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesNotBetween(Integer factoryResetTimesStart,Integer factoryResetTimesEnd){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null && factoryResetTimesEnd!=null){
            notBetween("factory_reset_times",factoryResetTimesStart,factoryResetTimesEnd);
        }
        return this;
     }


    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值%' entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLike(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            like("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT LIKE '%值%' entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesNotLike(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            notLike("factory_reset_times",factoryResetTimes);
        }
        return this;
     }


    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值' entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLikeLeft(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            likeLeft("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '值%' entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLikeRight(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            likeRight("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

/**
     * <p>恢复出厂设置次数</p>
     * 等于 =
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesEq(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            eq("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 不等于 &lt;&gt;
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesNe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            ne("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于 &gt;
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesGt(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            gt("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于等于 &gt;=
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesGe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            ge("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于 &lt;
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLt(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            lt("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于等于 &lt;=
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            le("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值%'
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLike(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            like("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT LIKE '%值%'
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesNotLike(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            notLike("factory_reset_times",factoryResetTimes);
        }
        return this;
    }


    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值'
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLikeLeft(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            likeLeft("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '值%'
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesLikeRight(Integer factoryResetTimes){
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
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesIsNull(){
        isNull("factory_reset_times");
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesIsNotNull(){
        isNotNull("factory_reset_times");
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper factoryResetTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("factory_reset_times",values);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 等于 = entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentEq(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            eq("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 不等于 &lt;&gt; entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentNe(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            ne("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于 &gt; entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentGt(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            gt("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于等于 &gt;= entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentGe(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            ge("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于 &lt; entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLt(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            lt("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于等于 &lt;= entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLe(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            le("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * BETWEEN  entity().getIsSilent() AND 值2
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentBetween(Integer isSilentEnd){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null && isSilentEnd!=null){
            between("is_silent",isSilent,isSilentEnd);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT BETWEEN  entity().getIsSilent() AND 值2
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentNotBetween(Integer isSilentEnd){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null && isSilentEnd!=null){
            notBetween("is_silent",isSilent,isSilentEnd);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * BETWEEN  entity().getIsSilent() AND 值2
     * @param isSilentStart       值1
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentBetween(Integer isSilentStart,Integer isSilentEnd){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null && isSilentEnd!=null){
            between("is_silent",isSilentStart,isSilentEnd);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT BETWEEN  entity().getIsSilent() AND 值2
     * @param isSilentStart       值1
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentNotBetween(Integer isSilentStart,Integer isSilentEnd){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null && isSilentEnd!=null){
            notBetween("is_silent",isSilentStart,isSilentEnd);
        }
        return this;
     }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值%' entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLike(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            like("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT LIKE '%值%' entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentNotLike(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            notLike("is_silent",isSilent);
        }
        return this;
     }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值' entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLikeLeft(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            likeLeft("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '值%' entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLikeRight(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            likeRight("is_silent",isSilent);
        }
        return this;
     }

/**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 等于 =
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentEq(Integer isSilent){
        if(isSilent!=null){
            eq("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 不等于 &lt;&gt;
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentNe(Integer isSilent){
        if(isSilent!=null){
            ne("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于 &gt;
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentGt(Integer isSilent){
        if(isSilent!=null){
            gt("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于等于 &gt;=
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentGe(Integer isSilent){
        if(isSilent!=null){
            ge("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于 &lt;
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLt(Integer isSilent){
        if(isSilent!=null){
            lt("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于等于 &lt;=
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLe(Integer isSilent){
        if(isSilent!=null){
            le("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值%'
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLike(Integer isSilent){
        if(isSilent!=null){
            like("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT LIKE '%值%'
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentNotLike(Integer isSilent){
        if(isSilent!=null){
            notLike("is_silent",isSilent);
        }
        return this;
    }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值'
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLikeLeft(Integer isSilent){
        if(isSilent!=null){
            likeLeft("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '值%'
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentLikeRight(Integer isSilent){
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
    public YunMemberDeviceUpdateEntityWrapper isSilentIsNull(){
        isNull("is_silent");
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentIsNotNull(){
        isNotNull("is_silent");
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper isSilentIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper isSilentIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper isSilentNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper isSilentNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_silent",values);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 等于 = entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesEq(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            eq("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 不等于 &lt;&gt; entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesNe(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            ne("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 大于 &gt; entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesGt(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            gt("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 大于等于 &gt;= entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesGe(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            ge("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 小于 &lt; entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLt(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            lt("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 小于等于 &lt;= entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLe(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            le("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * BETWEEN  entity().getRebootTimes() AND 值2
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesBetween(Integer rebootTimesEnd){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null && rebootTimesEnd!=null){
            between("reboot_times",rebootTimes,rebootTimesEnd);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT BETWEEN  entity().getRebootTimes() AND 值2
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesNotBetween(Integer rebootTimesEnd){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null && rebootTimesEnd!=null){
            notBetween("reboot_times",rebootTimes,rebootTimesEnd);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * BETWEEN  entity().getRebootTimes() AND 值2
     * @param rebootTimesStart       值1
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesBetween(Integer rebootTimesStart,Integer rebootTimesEnd){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null && rebootTimesEnd!=null){
            between("reboot_times",rebootTimesStart,rebootTimesEnd);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT BETWEEN  entity().getRebootTimes() AND 值2
     * @param rebootTimesStart       值1
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesNotBetween(Integer rebootTimesStart,Integer rebootTimesEnd){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null && rebootTimesEnd!=null){
            notBetween("reboot_times",rebootTimesStart,rebootTimesEnd);
        }
        return this;
     }


    /**
     * <p>重启设备次数</p>
     * LIKE '%值%' entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLike(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            like("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT LIKE '%值%' entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesNotLike(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            notLike("reboot_times",rebootTimes);
        }
        return this;
     }


    /**
     * <p>重启设备次数</p>
     * LIKE '%值' entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLikeLeft(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            likeLeft("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * LIKE '值%' entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLikeRight(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            likeRight("reboot_times",rebootTimes);
        }
        return this;
     }

/**
     * <p>重启设备次数</p>
     * 等于 =
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesEq(Integer rebootTimes){
        if(rebootTimes!=null){
            eq("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 不等于 &lt;&gt;
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesNe(Integer rebootTimes){
        if(rebootTimes!=null){
            ne("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 大于 &gt;
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesGt(Integer rebootTimes){
        if(rebootTimes!=null){
            gt("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 大于等于 &gt;=
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesGe(Integer rebootTimes){
        if(rebootTimes!=null){
            ge("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 小于 &lt;
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLt(Integer rebootTimes){
        if(rebootTimes!=null){
            lt("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 小于等于 &lt;=
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLe(Integer rebootTimes){
        if(rebootTimes!=null){
            le("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * LIKE '%值%'
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLike(Integer rebootTimes){
        if(rebootTimes!=null){
            like("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * NOT LIKE '%值%'
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesNotLike(Integer rebootTimes){
        if(rebootTimes!=null){
            notLike("reboot_times",rebootTimes);
        }
        return this;
    }


    /**
     * <p>重启设备次数</p>
     * LIKE '%值'
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLikeLeft(Integer rebootTimes){
        if(rebootTimes!=null){
            likeLeft("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * LIKE '值%'
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesLikeRight(Integer rebootTimes){
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
    public YunMemberDeviceUpdateEntityWrapper rebootTimesIsNull(){
        isNull("reboot_times");
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesIsNotNull(){
        isNotNull("reboot_times");
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper rebootTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper rebootTimesIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper rebootTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper rebootTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("reboot_times",values);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 等于 = entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureEq(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            eq("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 不等于 &lt;&gt; entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureNe(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            ne("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于 &gt; entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureGt(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            gt("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于等于 &gt;= entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureGe(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            ge("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于 &lt; entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLt(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            lt("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于等于 &lt;= entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLe(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            le("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * BETWEEN  entity().getFailure() AND 值2
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureBetween(Integer failureEnd){
        Integer failure =entity().getFailure();
        if(failure!=null && failureEnd!=null){
            between("failure",failure,failureEnd);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT BETWEEN  entity().getFailure() AND 值2
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureNotBetween(Integer failureEnd){
        Integer failure =entity().getFailure();
        if(failure!=null && failureEnd!=null){
            notBetween("failure",failure,failureEnd);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * BETWEEN  entity().getFailure() AND 值2
     * @param failureStart       值1
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureBetween(Integer failureStart,Integer failureEnd){
        Integer failure =entity().getFailure();
        if(failure!=null && failureEnd!=null){
            between("failure",failureStart,failureEnd);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT BETWEEN  entity().getFailure() AND 值2
     * @param failureStart       值1
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureNotBetween(Integer failureStart,Integer failureEnd){
        Integer failure =entity().getFailure();
        if(failure!=null && failureEnd!=null){
            notBetween("failure",failureStart,failureEnd);
        }
        return this;
     }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值%' entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLike(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            like("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT LIKE '%值%' entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureNotLike(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            notLike("failure",failure);
        }
        return this;
     }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值' entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLikeLeft(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            likeLeft("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '值%' entity().getFailure()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLikeRight(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            likeRight("failure",failure);
        }
        return this;
     }

/**
     * <p>客户申报故障（0：无，1故障）</p>
     * 等于 =
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureEq(Integer failure){
        if(failure!=null){
            eq("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 不等于 &lt;&gt;
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureNe(Integer failure){
        if(failure!=null){
            ne("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于 &gt;
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureGt(Integer failure){
        if(failure!=null){
            gt("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于等于 &gt;=
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureGe(Integer failure){
        if(failure!=null){
            ge("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于 &lt;
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLt(Integer failure){
        if(failure!=null){
            lt("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于等于 &lt;=
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLe(Integer failure){
        if(failure!=null){
            le("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值%'
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLike(Integer failure){
        if(failure!=null){
            like("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT LIKE '%值%'
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureNotLike(Integer failure){
        if(failure!=null){
            notLike("failure",failure);
        }
        return this;
    }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值'
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLikeLeft(Integer failure){
        if(failure!=null){
            likeLeft("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '值%'
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureLikeRight(Integer failure){
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
    public YunMemberDeviceUpdateEntityWrapper failureIsNull(){
        isNull("failure");
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureIsNotNull(){
        isNotNull("failure");
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper failureIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper failureIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper failureNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper failureNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("failure",values);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 等于 = entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallEq(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            eq("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 不等于 &lt;&gt; entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallNe(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            ne("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于 &gt; entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallGt(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            gt("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于等于 &gt;= entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallGe(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            ge("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于 &lt; entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLt(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            lt("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于等于 &lt;= entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLe(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            le("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * BETWEEN  entity().getSyncInstall() AND 值2
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallBetween(Integer syncInstallEnd){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null && syncInstallEnd!=null){
            between("sync_install",syncInstall,syncInstallEnd);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT BETWEEN  entity().getSyncInstall() AND 值2
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallNotBetween(Integer syncInstallEnd){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null && syncInstallEnd!=null){
            notBetween("sync_install",syncInstall,syncInstallEnd);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * BETWEEN  entity().getSyncInstall() AND 值2
     * @param syncInstallStart       值1
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallBetween(Integer syncInstallStart,Integer syncInstallEnd){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null && syncInstallEnd!=null){
            between("sync_install",syncInstallStart,syncInstallEnd);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT BETWEEN  entity().getSyncInstall() AND 值2
     * @param syncInstallStart       值1
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallNotBetween(Integer syncInstallStart,Integer syncInstallEnd){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null && syncInstallEnd!=null){
            notBetween("sync_install",syncInstallStart,syncInstallEnd);
        }
        return this;
     }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值%' entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLike(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            like("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT LIKE '%值%' entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallNotLike(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            notLike("sync_install",syncInstall);
        }
        return this;
     }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值' entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLikeLeft(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            likeLeft("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '值%' entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLikeRight(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            likeRight("sync_install",syncInstall);
        }
        return this;
     }

/**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 等于 =
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallEq(Integer syncInstall){
        if(syncInstall!=null){
            eq("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 不等于 &lt;&gt;
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallNe(Integer syncInstall){
        if(syncInstall!=null){
            ne("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于 &gt;
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallGt(Integer syncInstall){
        if(syncInstall!=null){
            gt("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于等于 &gt;=
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallGe(Integer syncInstall){
        if(syncInstall!=null){
            ge("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于 &lt;
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLt(Integer syncInstall){
        if(syncInstall!=null){
            lt("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于等于 &lt;=
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLe(Integer syncInstall){
        if(syncInstall!=null){
            le("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值%'
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLike(Integer syncInstall){
        if(syncInstall!=null){
            like("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT LIKE '%值%'
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallNotLike(Integer syncInstall){
        if(syncInstall!=null){
            notLike("sync_install",syncInstall);
        }
        return this;
    }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值'
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLikeLeft(Integer syncInstall){
        if(syncInstall!=null){
            likeLeft("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '值%'
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallLikeRight(Integer syncInstall){
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
    public YunMemberDeviceUpdateEntityWrapper syncInstallIsNull(){
        isNull("sync_install");
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallIsNotNull(){
        isNotNull("sync_install");
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper syncInstallIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper syncInstallIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper syncInstallNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper syncInstallNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sync_install",values);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 等于 = entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionEq(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            eq("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 不等于 &lt;&gt; entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionNe(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            ne("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 大于 &gt; entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionGt(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            gt("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 大于等于 &gt;= entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionGe(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            ge("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 小于 &lt; entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLt(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            lt("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 小于等于 &lt;= entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLe(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            le("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * BETWEEN  entity().getRoomSession() AND 值2
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionBetween(String roomSessionEnd){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null && roomSessionEnd!=null){
            between("room_session",roomSession,roomSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT BETWEEN  entity().getRoomSession() AND 值2
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionNotBetween(String roomSessionEnd){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null && roomSessionEnd!=null){
            notBetween("room_session",roomSession,roomSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * BETWEEN  entity().getRoomSession() AND 值2
     * @param roomSessionStart       值1
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null && roomSessionEnd!=null){
            between("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT BETWEEN  entity().getRoomSession() AND 值2
     * @param roomSessionStart       值1
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null && roomSessionEnd!=null){
            notBetween("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值%' entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLike(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            like("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT LIKE '%值%' entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionNotLike(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            notLike("room_session",roomSession);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值' entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLikeLeft(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            likeLeft("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * LIKE '值%' entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLikeRight(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            likeRight("room_session",roomSession);
        }
        return this;
     }

/**
     * <p>房间session</p>
     * 等于 =
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionEq(String roomSession){
        if(roomSession!=null){
            eq("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 不等于 &lt;&gt;
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionNe(String roomSession){
        if(roomSession!=null){
            ne("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 大于 &gt;
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionGt(String roomSession){
        if(roomSession!=null){
            gt("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 大于等于 &gt;=
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionGe(String roomSession){
        if(roomSession!=null){
            ge("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 小于 &lt;
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLt(String roomSession){
        if(roomSession!=null){
            lt("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 小于等于 &lt;=
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLe(String roomSession){
        if(roomSession!=null){
            le("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * LIKE '%值%'
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLike(String roomSession){
        if(roomSession!=null){
            like("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * NOT LIKE '%值%'
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionNotLike(String roomSession){
        if(roomSession!=null){
            notLike("room_session",roomSession);
        }
        return this;
    }


    /**
     * <p>房间session</p>
     * LIKE '%值'
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLikeLeft(String roomSession){
        if(roomSession!=null){
            likeLeft("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * LIKE '值%'
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionLikeRight(String roomSession){
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
    public YunMemberDeviceUpdateEntityWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomSessionIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper roomSessionIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper roomSessionNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper roomSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_session",values);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 等于 = entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumEq(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            eq("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 不等于 &lt;&gt; entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumNe(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            ne("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于 &gt; entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumGt(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            gt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于等于 &gt;= entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumGe(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            ge("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于 &lt; entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLt(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            lt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于等于 &lt;= entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLe(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            le("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * BETWEEN  entity().getRoomPeopleMaxNum() AND 值2
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumBetween(Integer roomPeopleMaxNumEnd){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null && roomPeopleMaxNumEnd!=null){
            between("room_people_max_num",roomPeopleMaxNum,roomPeopleMaxNumEnd);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT BETWEEN  entity().getRoomPeopleMaxNum() AND 值2
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumNotBetween(Integer roomPeopleMaxNumEnd){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null && roomPeopleMaxNumEnd!=null){
            notBetween("room_people_max_num",roomPeopleMaxNum,roomPeopleMaxNumEnd);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * BETWEEN  entity().getRoomPeopleMaxNum() AND 值2
     * @param roomPeopleMaxNumStart       值1
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumBetween(Integer roomPeopleMaxNumStart,Integer roomPeopleMaxNumEnd){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null && roomPeopleMaxNumEnd!=null){
            between("room_people_max_num",roomPeopleMaxNumStart,roomPeopleMaxNumEnd);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT BETWEEN  entity().getRoomPeopleMaxNum() AND 值2
     * @param roomPeopleMaxNumStart       值1
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumNotBetween(Integer roomPeopleMaxNumStart,Integer roomPeopleMaxNumEnd){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null && roomPeopleMaxNumEnd!=null){
            notBetween("room_people_max_num",roomPeopleMaxNumStart,roomPeopleMaxNumEnd);
        }
        return this;
     }


    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值%' entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLike(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            like("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT LIKE '%值%' entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumNotLike(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            notLike("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }


    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值' entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLikeLeft(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            likeLeft("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '值%' entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLikeRight(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            likeRight("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

/**
     * <p>房间最大容纳成员数</p>
     * 等于 =
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumEq(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            eq("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 不等于 &lt;&gt;
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumNe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            ne("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于 &gt;
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumGt(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            gt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于等于 &gt;=
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumGe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            ge("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于 &lt;
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLt(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            lt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于等于 &lt;=
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            le("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值%'
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLike(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            like("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT LIKE '%值%'
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumNotLike(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            notLike("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }


    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值'
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLikeLeft(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            likeLeft("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '值%'
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumLikeRight(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumIsNull(){
        isNull("room_people_max_num");
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumIsNotNull(){
        isNotNull("room_people_max_num");
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper roomPeopleMaxNumNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_people_max_num",values);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 等于 = entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumEq(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            eq("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 不等于 &lt;&gt; entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumNe(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            ne("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 大于 &gt; entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumGt(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            gt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 大于等于 &gt;= entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumGe(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            ge("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 小于 &lt; entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLt(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            lt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 小于等于 &lt;= entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLe(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            le("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * BETWEEN  entity().getRoomPeopleTotalNum() AND 值2
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumBetween(Integer roomPeopleTotalNumEnd){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null && roomPeopleTotalNumEnd!=null){
            between("room_people_total_num",roomPeopleTotalNum,roomPeopleTotalNumEnd);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT BETWEEN  entity().getRoomPeopleTotalNum() AND 值2
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumNotBetween(Integer roomPeopleTotalNumEnd){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null && roomPeopleTotalNumEnd!=null){
            notBetween("room_people_total_num",roomPeopleTotalNum,roomPeopleTotalNumEnd);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * BETWEEN  entity().getRoomPeopleTotalNum() AND 值2
     * @param roomPeopleTotalNumStart       值1
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumBetween(Integer roomPeopleTotalNumStart,Integer roomPeopleTotalNumEnd){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null && roomPeopleTotalNumEnd!=null){
            between("room_people_total_num",roomPeopleTotalNumStart,roomPeopleTotalNumEnd);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT BETWEEN  entity().getRoomPeopleTotalNum() AND 值2
     * @param roomPeopleTotalNumStart       值1
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumNotBetween(Integer roomPeopleTotalNumStart,Integer roomPeopleTotalNumEnd){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null && roomPeopleTotalNumEnd!=null){
            notBetween("room_people_total_num",roomPeopleTotalNumStart,roomPeopleTotalNumEnd);
        }
        return this;
     }


    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值%' entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLike(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            like("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT LIKE '%值%' entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumNotLike(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            notLike("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }


    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值' entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLikeLeft(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            likeLeft("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * LIKE '值%' entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLikeRight(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            likeRight("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

/**
     * <p>房间当前总成员数</p>
     * 等于 =
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumEq(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            eq("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 不等于 &lt;&gt;
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumNe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            ne("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 大于 &gt;
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumGt(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            gt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 大于等于 &gt;=
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumGe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            ge("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 小于 &lt;
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLt(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            lt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 小于等于 &lt;=
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            le("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值%'
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLike(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            like("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * NOT LIKE '%值%'
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumNotLike(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            notLike("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }


    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值'
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLikeLeft(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            likeLeft("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * LIKE '值%'
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumLikeRight(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumIsNull(){
        isNull("room_people_total_num");
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumIsNotNull(){
        isNotNull("room_people_total_num");
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper roomPeopleTotalNumNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_people_total_num",values);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 等于 = entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusEq(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            eq("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 不等于 &lt;&gt; entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusNe(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            ne("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于 &gt; entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusGt(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            gt("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于等于 &gt;= entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusGe(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            ge("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于 &lt; entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLt(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            lt("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于等于 &lt;= entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLe(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            le("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * BETWEEN  entity().getAllotStatus() AND 值2
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusBetween(Integer allotStatusEnd){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null && allotStatusEnd!=null){
            between("allot_status",allotStatus,allotStatusEnd);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT BETWEEN  entity().getAllotStatus() AND 值2
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusNotBetween(Integer allotStatusEnd){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null && allotStatusEnd!=null){
            notBetween("allot_status",allotStatus,allotStatusEnd);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * BETWEEN  entity().getAllotStatus() AND 值2
     * @param allotStatusStart       值1
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusBetween(Integer allotStatusStart,Integer allotStatusEnd){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null && allotStatusEnd!=null){
            between("allot_status",allotStatusStart,allotStatusEnd);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT BETWEEN  entity().getAllotStatus() AND 值2
     * @param allotStatusStart       值1
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusNotBetween(Integer allotStatusStart,Integer allotStatusEnd){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null && allotStatusEnd!=null){
            notBetween("allot_status",allotStatusStart,allotStatusEnd);
        }
        return this;
     }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值%' entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLike(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            like("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT LIKE '%值%' entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusNotLike(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            notLike("allot_status",allotStatus);
        }
        return this;
     }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值' entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLikeLeft(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            likeLeft("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '值%' entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLikeRight(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            likeRight("allot_status",allotStatus);
        }
        return this;
     }

/**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 等于 =
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusEq(Integer allotStatus){
        if(allotStatus!=null){
            eq("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 不等于 &lt;&gt;
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusNe(Integer allotStatus){
        if(allotStatus!=null){
            ne("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于 &gt;
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusGt(Integer allotStatus){
        if(allotStatus!=null){
            gt("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于等于 &gt;=
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusGe(Integer allotStatus){
        if(allotStatus!=null){
            ge("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于 &lt;
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLt(Integer allotStatus){
        if(allotStatus!=null){
            lt("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于等于 &lt;=
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLe(Integer allotStatus){
        if(allotStatus!=null){
            le("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值%'
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLike(Integer allotStatus){
        if(allotStatus!=null){
            like("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT LIKE '%值%'
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusNotLike(Integer allotStatus){
        if(allotStatus!=null){
            notLike("allot_status",allotStatus);
        }
        return this;
    }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值'
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLikeLeft(Integer allotStatus){
        if(allotStatus!=null){
            likeLeft("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '值%'
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusLikeRight(Integer allotStatus){
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
    public YunMemberDeviceUpdateEntityWrapper allotStatusIsNull(){
        isNull("allot_status");
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusIsNotNull(){
        isNotNull("allot_status");
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper allotStatusIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper allotStatusIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper allotStatusNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper allotStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("allot_status",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 等于 = entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeEq(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 不等于 &lt;&gt; entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeNe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于 &gt; entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeGt(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于等于 &gt;= entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeGe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于 &lt; entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLt(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于等于 &lt;= entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeBetween(Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeNotBetween(Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值%' entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLike(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT LIKE '%值%' entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeNotLike(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值' entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLikeLeft(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '值%' entity().getServerType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLikeRight(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

/**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeEq(Integer serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 不等于 &lt;&gt;
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeNe(Integer serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于 &gt;
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeGt(Integer serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于等于 &gt;=
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeGe(Integer serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于 &lt;
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLt(Integer serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于等于 &lt;=
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLe(Integer serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLike(Integer serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeNotLike(Integer serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
    }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值'
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLikeLeft(Integer serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '值%'
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeLikeRight(Integer serverType){
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
    public YunMemberDeviceUpdateEntityWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serverTypeIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper serverTypeIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper serverTypeNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 等于 = entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeEq(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            eq("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 不等于 &lt;&gt; entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeNe(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            ne("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于 &gt; entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeGt(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            gt("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于等于 &gt;= entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeGe(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            ge("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于 &lt; entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLt(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            lt("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于等于 &lt;= entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLe(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            le("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * BETWEEN  entity().getServiceBizType() AND 值2
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeBetween(Integer serviceBizTypeEnd){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null && serviceBizTypeEnd!=null){
            between("service_biz_type",serviceBizType,serviceBizTypeEnd);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT BETWEEN  entity().getServiceBizType() AND 值2
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeNotBetween(Integer serviceBizTypeEnd){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null && serviceBizTypeEnd!=null){
            notBetween("service_biz_type",serviceBizType,serviceBizTypeEnd);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * BETWEEN  entity().getServiceBizType() AND 值2
     * @param serviceBizTypeStart       值1
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeBetween(Integer serviceBizTypeStart,Integer serviceBizTypeEnd){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null && serviceBizTypeEnd!=null){
            between("service_biz_type",serviceBizTypeStart,serviceBizTypeEnd);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT BETWEEN  entity().getServiceBizType() AND 值2
     * @param serviceBizTypeStart       值1
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeNotBetween(Integer serviceBizTypeStart,Integer serviceBizTypeEnd){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null && serviceBizTypeEnd!=null){
            notBetween("service_biz_type",serviceBizTypeStart,serviceBizTypeEnd);
        }
        return this;
     }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值%' entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLike(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            like("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT LIKE '%值%' entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeNotLike(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            notLike("service_biz_type",serviceBizType);
        }
        return this;
     }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值' entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLikeLeft(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            likeLeft("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '值%' entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLikeRight(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            likeRight("service_biz_type",serviceBizType);
        }
        return this;
     }

/**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 等于 =
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeEq(Integer serviceBizType){
        if(serviceBizType!=null){
            eq("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 不等于 &lt;&gt;
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeNe(Integer serviceBizType){
        if(serviceBizType!=null){
            ne("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于 &gt;
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeGt(Integer serviceBizType){
        if(serviceBizType!=null){
            gt("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于等于 &gt;=
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeGe(Integer serviceBizType){
        if(serviceBizType!=null){
            ge("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于 &lt;
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLt(Integer serviceBizType){
        if(serviceBizType!=null){
            lt("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于等于 &lt;=
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLe(Integer serviceBizType){
        if(serviceBizType!=null){
            le("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值%'
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLike(Integer serviceBizType){
        if(serviceBizType!=null){
            like("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT LIKE '%值%'
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeNotLike(Integer serviceBizType){
        if(serviceBizType!=null){
            notLike("service_biz_type",serviceBizType);
        }
        return this;
    }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值'
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLikeLeft(Integer serviceBizType){
        if(serviceBizType!=null){
            likeLeft("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '值%'
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeLikeRight(Integer serviceBizType){
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
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeIsNull(){
        isNull("service_biz_type");
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeIsNotNull(){
        isNotNull("service_biz_type");
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper serviceBizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("service_biz_type",values);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 等于 = entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandEq(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            eq("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 不等于 &lt;&gt; entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandNe(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            ne("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于 &gt; entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandGt(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            gt("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于等于 &gt;= entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandGe(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            ge("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于 &lt; entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLt(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            lt("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于等于 &lt;= entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLe(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            le("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * BETWEEN  entity().getDownstreamBroadband() AND 值2
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandBetween(Long downstreamBroadbandEnd){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null && downstreamBroadbandEnd!=null){
            between("downstream_broadband",downstreamBroadband,downstreamBroadbandEnd);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT BETWEEN  entity().getDownstreamBroadband() AND 值2
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandNotBetween(Long downstreamBroadbandEnd){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null && downstreamBroadbandEnd!=null){
            notBetween("downstream_broadband",downstreamBroadband,downstreamBroadbandEnd);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * BETWEEN  entity().getDownstreamBroadband() AND 值2
     * @param downstreamBroadbandStart       值1
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandBetween(Long downstreamBroadbandStart,Long downstreamBroadbandEnd){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null && downstreamBroadbandEnd!=null){
            between("downstream_broadband",downstreamBroadbandStart,downstreamBroadbandEnd);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT BETWEEN  entity().getDownstreamBroadband() AND 值2
     * @param downstreamBroadbandStart       值1
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandNotBetween(Long downstreamBroadbandStart,Long downstreamBroadbandEnd){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null && downstreamBroadbandEnd!=null){
            notBetween("downstream_broadband",downstreamBroadbandStart,downstreamBroadbandEnd);
        }
        return this;
     }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值%' entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLike(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            like("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT LIKE '%值%' entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandNotLike(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            notLike("downstream_broadband",downstreamBroadband);
        }
        return this;
     }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值' entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLikeLeft(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            likeLeft("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '值%' entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLikeRight(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            likeRight("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

/**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 等于 =
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandEq(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            eq("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 不等于 &lt;&gt;
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandNe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            ne("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于 &gt;
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandGt(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            gt("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于等于 &gt;=
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandGe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            ge("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于 &lt;
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLt(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            lt("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于等于 &lt;=
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            le("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值%'
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLike(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            like("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT LIKE '%值%'
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandNotLike(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            notLike("downstream_broadband",downstreamBroadband);
        }
        return this;
    }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值'
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLikeLeft(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            likeLeft("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '值%'
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandLikeRight(Long downstreamBroadband){
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
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandIsNull(){
        isNull("downstream_broadband");
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandIsNotNull(){
        isNotNull("downstream_broadband");
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper downstreamBroadbandNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("downstream_broadband",values);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

/**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
    }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusLikeRight(Integer status){
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
    public YunMemberDeviceUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper statusIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper statusIn(Integer... values){
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
    public YunMemberDeviceUpdateEntityWrapper statusNotIn(Collection<Integer> value){
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
    public YunMemberDeviceUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 等于 = entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeEq(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            eq("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 不等于 &lt;&gt; entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeNe(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            ne("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于 &gt; entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeGt(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            gt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于等于 &gt;= entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeGe(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            ge("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于 &lt; entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLt(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            lt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于等于 &lt;= entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLe(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            le("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * BETWEEN  entity().getBuyTime() AND 值2
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeBetween(Date buyTimeEnd){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null && buyTimeEnd!=null){
            between("buy_time",buyTime,buyTimeEnd);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT BETWEEN  entity().getBuyTime() AND 值2
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeNotBetween(Date buyTimeEnd){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null && buyTimeEnd!=null){
            notBetween("buy_time",buyTime,buyTimeEnd);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * BETWEEN  entity().getBuyTime() AND 值2
     * @param buyTimeStart       值1
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeBetween(Date buyTimeStart,Date buyTimeEnd){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null && buyTimeEnd!=null){
            between("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT BETWEEN  entity().getBuyTime() AND 值2
     * @param buyTimeStart       值1
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeNotBetween(Date buyTimeStart,Date buyTimeEnd){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null && buyTimeEnd!=null){
            notBetween("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值%' entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLike(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            like("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT LIKE '%值%' entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeNotLike(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            notLike("buy_time",buyTime);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值' entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLikeLeft(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            likeLeft("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * LIKE '值%' entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLikeRight(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            likeRight("buy_time",buyTime);
        }
        return this;
     }

/**
     * <p>订购时间</p>
     * 等于 =
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeEq(Date buyTime){
        if(buyTime!=null){
            eq("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 不等于 &lt;&gt;
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeNe(Date buyTime){
        if(buyTime!=null){
            ne("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 大于 &gt;
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeGt(Date buyTime){
        if(buyTime!=null){
            gt("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 大于等于 &gt;=
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeGe(Date buyTime){
        if(buyTime!=null){
            ge("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 小于 &lt;
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLt(Date buyTime){
        if(buyTime!=null){
            lt("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 小于等于 &lt;=
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLe(Date buyTime){
        if(buyTime!=null){
            le("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * LIKE '%值%'
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLike(Date buyTime){
        if(buyTime!=null){
            like("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * NOT LIKE '%值%'
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeNotLike(Date buyTime){
        if(buyTime!=null){
            notLike("buy_time",buyTime);
        }
        return this;
    }


    /**
     * <p>订购时间</p>
     * LIKE '%值'
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLikeLeft(Date buyTime){
        if(buyTime!=null){
            likeLeft("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * LIKE '值%'
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeLikeRight(Date buyTime){
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
    public YunMemberDeviceUpdateEntityWrapper buyTimeIsNull(){
        isNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeIsNotNull(){
        isNotNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper buyTimeIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper buyTimeIn(Date... values){
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
    public YunMemberDeviceUpdateEntityWrapper buyTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper buyTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("buy_time",values);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 等于 = entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeEq(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            eq("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 不等于 &lt;&gt; entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeNe(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            ne("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于 &gt; entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeGt(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            gt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于等于 &gt;= entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeGe(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            ge("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于 &lt; entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLt(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            lt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于等于 &lt;= entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLe(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            le("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * BETWEEN  entity().getLastRenewTime() AND 值2
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeBetween(Date lastRenewTimeEnd){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null && lastRenewTimeEnd!=null){
            between("last_renew_time",lastRenewTime,lastRenewTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT BETWEEN  entity().getLastRenewTime() AND 值2
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeNotBetween(Date lastRenewTimeEnd){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null && lastRenewTimeEnd!=null){
            notBetween("last_renew_time",lastRenewTime,lastRenewTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * BETWEEN  entity().getLastRenewTime() AND 值2
     * @param lastRenewTimeStart       值1
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null && lastRenewTimeEnd!=null){
            between("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT BETWEEN  entity().getLastRenewTime() AND 值2
     * @param lastRenewTimeStart       值1
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeNotBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null && lastRenewTimeEnd!=null){
            notBetween("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值%' entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLike(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            like("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT LIKE '%值%' entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeNotLike(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            notLike("last_renew_time",lastRenewTime);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值' entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLikeLeft(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            likeLeft("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * LIKE '值%' entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLikeRight(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            likeRight("last_renew_time",lastRenewTime);
        }
        return this;
     }

/**
     * <p>最近一次续费时间</p>
     * 等于 =
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeEq(Date lastRenewTime){
        if(lastRenewTime!=null){
            eq("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 不等于 &lt;&gt;
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeNe(Date lastRenewTime){
        if(lastRenewTime!=null){
            ne("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 大于 &gt;
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeGt(Date lastRenewTime){
        if(lastRenewTime!=null){
            gt("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 大于等于 &gt;=
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeGe(Date lastRenewTime){
        if(lastRenewTime!=null){
            ge("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 小于 &lt;
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLt(Date lastRenewTime){
        if(lastRenewTime!=null){
            lt("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 小于等于 &lt;=
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLe(Date lastRenewTime){
        if(lastRenewTime!=null){
            le("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值%'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLike(Date lastRenewTime){
        if(lastRenewTime!=null){
            like("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * NOT LIKE '%值%'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeNotLike(Date lastRenewTime){
        if(lastRenewTime!=null){
            notLike("last_renew_time",lastRenewTime);
        }
        return this;
    }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLikeLeft(Date lastRenewTime){
        if(lastRenewTime!=null){
            likeLeft("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * LIKE '值%'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeLikeRight(Date lastRenewTime){
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
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeIsNull(){
        isNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeIsNotNull(){
        isNotNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeIn(Date... values){
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
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper lastRenewTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_renew_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeEq(){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
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
    public YunMemberDeviceUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

/**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeEq(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeNe(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeGt(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeGe(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeLt(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeLe(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeLike(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeIn(Date... values){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 等于 = entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeEq(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            eq("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 不等于 &lt;&gt; entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeNe(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            ne("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于 &gt; entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeGt(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            gt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于等于 &gt;= entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeGe(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            ge("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于 &lt; entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLt(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            lt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于等于 &lt;= entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLe(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            le("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * BETWEEN  entity().getIdleTime() AND 值2
     * @param idleTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeBetween(Date idleTimeEnd){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null && idleTimeEnd!=null){
            between("idle_time",idleTime,idleTimeEnd);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT BETWEEN  entity().getIdleTime() AND 值2
     * @param idleTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeNotBetween(Date idleTimeEnd){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null && idleTimeEnd!=null){
            notBetween("idle_time",idleTime,idleTimeEnd);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * BETWEEN  entity().getIdleTime() AND 值2
     * @param idleTimeStart       值1
     * @param idleTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeBetween(Date idleTimeStart,Date idleTimeEnd){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null && idleTimeEnd!=null){
            between("idle_time",idleTimeStart,idleTimeEnd);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT BETWEEN  entity().getIdleTime() AND 值2
     * @param idleTimeStart       值1
     * @param idleTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeNotBetween(Date idleTimeStart,Date idleTimeEnd){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null && idleTimeEnd!=null){
            notBetween("idle_time",idleTimeStart,idleTimeEnd);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值%' entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLike(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            like("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT LIKE '%值%' entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeNotLike(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            notLike("idle_time",idleTime);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值' entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLikeLeft(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            likeLeft("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * LIKE '值%' entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLikeRight(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            likeRight("idle_time",idleTime);
        }
        return this;
     }

/**
     * <p>设备空闲上报时间</p>
     * 等于 =
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeEq(Date idleTime){
        if(idleTime!=null){
            eq("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 不等于 &lt;&gt;
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeNe(Date idleTime){
        if(idleTime!=null){
            ne("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 大于 &gt;
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeGt(Date idleTime){
        if(idleTime!=null){
            gt("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 大于等于 &gt;=
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeGe(Date idleTime){
        if(idleTime!=null){
            ge("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 小于 &lt;
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLt(Date idleTime){
        if(idleTime!=null){
            lt("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 小于等于 &lt;=
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLe(Date idleTime){
        if(idleTime!=null){
            le("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值%'
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLike(Date idleTime){
        if(idleTime!=null){
            like("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * NOT LIKE '%值%'
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeNotLike(Date idleTime){
        if(idleTime!=null){
            notLike("idle_time",idleTime);
        }
        return this;
    }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值'
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLikeLeft(Date idleTime){
        if(idleTime!=null){
            likeLeft("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * LIKE '值%'
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeLikeRight(Date idleTime){
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
    public YunMemberDeviceUpdateEntityWrapper idleTimeIsNull(){
        isNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeIsNotNull(){
        isNotNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper idleTimeIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper idleTimeIn(Date... values){
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
    public YunMemberDeviceUpdateEntityWrapper idleTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceUpdateEntityWrapper idleTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("idle_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdEq(){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
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
    public YunMemberDeviceUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdEq(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdNe(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdGt(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdGe(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdLt(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdLe(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdLike(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceEq(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            eq("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceNe(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            ne("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceGt(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            gt("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceGe(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            ge("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLt(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            lt("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLe(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            le("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getProxyProvince() AND 值2
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceBetween(String proxyProvinceEnd){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null && proxyProvinceEnd!=null){
            between("proxy_province",proxyProvince,proxyProvinceEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getProxyProvince() AND 值2
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceNotBetween(String proxyProvinceEnd){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null && proxyProvinceEnd!=null){
            notBetween("proxy_province",proxyProvince,proxyProvinceEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getProxyProvince() AND 值2
     * @param proxyProvinceStart       值1
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceBetween(String proxyProvinceStart,String proxyProvinceEnd){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null && proxyProvinceEnd!=null){
            between("proxy_province",proxyProvinceStart,proxyProvinceEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getProxyProvince() AND 值2
     * @param proxyProvinceStart       值1
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceNotBetween(String proxyProvinceStart,String proxyProvinceEnd){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null && proxyProvinceEnd!=null){
            notBetween("proxy_province",proxyProvinceStart,proxyProvinceEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLike(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            like("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceNotLike(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            notLike("proxy_province",proxyProvince);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLikeLeft(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            likeLeft("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLikeRight(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            likeRight("proxy_province",proxyProvince);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceEq(String proxyProvince){
        if(proxyProvince!=null){
            eq("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceNe(String proxyProvince){
        if(proxyProvince!=null){
            ne("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceGt(String proxyProvince){
        if(proxyProvince!=null){
            gt("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceGe(String proxyProvince){
        if(proxyProvince!=null){
            ge("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLt(String proxyProvince){
        if(proxyProvince!=null){
            lt("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLe(String proxyProvince){
        if(proxyProvince!=null){
            le("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLike(String proxyProvince){
        if(proxyProvince!=null){
            like("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceNotLike(String proxyProvince){
        if(proxyProvince!=null){
            notLike("proxy_province",proxyProvince);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLikeLeft(String proxyProvince){
        if(proxyProvince!=null){
            likeLeft("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceLikeRight(String proxyProvince){
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
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceIsNull(){
        isNull("proxy_province");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceIsNotNull(){
        isNotNull("proxy_province");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyProvinceNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_province",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityEq(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            eq("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityNe(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            ne("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityGt(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            gt("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityGe(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            ge("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLt(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            lt("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLe(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            le("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getProxyCity() AND 值2
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityBetween(String proxyCityEnd){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null && proxyCityEnd!=null){
            between("proxy_city",proxyCity,proxyCityEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getProxyCity() AND 值2
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityNotBetween(String proxyCityEnd){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null && proxyCityEnd!=null){
            notBetween("proxy_city",proxyCity,proxyCityEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getProxyCity() AND 值2
     * @param proxyCityStart       值1
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityBetween(String proxyCityStart,String proxyCityEnd){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null && proxyCityEnd!=null){
            between("proxy_city",proxyCityStart,proxyCityEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getProxyCity() AND 值2
     * @param proxyCityStart       值1
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityNotBetween(String proxyCityStart,String proxyCityEnd){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null && proxyCityEnd!=null){
            notBetween("proxy_city",proxyCityStart,proxyCityEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLike(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            like("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityNotLike(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            notLike("proxy_city",proxyCity);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLikeLeft(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            likeLeft("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLikeRight(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            likeRight("proxy_city",proxyCity);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityEq(String proxyCity){
        if(proxyCity!=null){
            eq("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityNe(String proxyCity){
        if(proxyCity!=null){
            ne("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityGt(String proxyCity){
        if(proxyCity!=null){
            gt("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityGe(String proxyCity){
        if(proxyCity!=null){
            ge("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLt(String proxyCity){
        if(proxyCity!=null){
            lt("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLe(String proxyCity){
        if(proxyCity!=null){
            le("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLike(String proxyCity){
        if(proxyCity!=null){
            like("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityNotLike(String proxyCity){
        if(proxyCity!=null){
            notLike("proxy_city",proxyCity);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLikeLeft(String proxyCity){
        if(proxyCity!=null){
            likeLeft("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityLikeRight(String proxyCity){
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
    public YunMemberDeviceUpdateEntityWrapper proxyCityIsNull(){
        isNull("proxy_city");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityIsNotNull(){
        isNotNull("proxy_city");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyCityIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyCityIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper proxyCityNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyCityNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_city",values);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 等于 = entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerEq(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            eq("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 不等于 &lt;&gt; entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerNe(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            ne("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于 &gt; entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerGt(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            gt("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于等于 &gt;= entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerGe(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            ge("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于 &lt; entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLt(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            lt("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于等于 &lt;= entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLe(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            le("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * BETWEEN  entity().getProxyServer() AND 值2
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerBetween(String proxyServerEnd){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null && proxyServerEnd!=null){
            between("proxy_server",proxyServer,proxyServerEnd);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT BETWEEN  entity().getProxyServer() AND 值2
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerNotBetween(String proxyServerEnd){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null && proxyServerEnd!=null){
            notBetween("proxy_server",proxyServer,proxyServerEnd);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * BETWEEN  entity().getProxyServer() AND 值2
     * @param proxyServerStart       值1
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerBetween(String proxyServerStart,String proxyServerEnd){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null && proxyServerEnd!=null){
            between("proxy_server",proxyServerStart,proxyServerEnd);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT BETWEEN  entity().getProxyServer() AND 值2
     * @param proxyServerStart       值1
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerNotBetween(String proxyServerStart,String proxyServerEnd){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null && proxyServerEnd!=null){
            notBetween("proxy_server",proxyServerStart,proxyServerEnd);
        }
        return this;
     }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值%' entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLike(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            like("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT LIKE '%值%' entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerNotLike(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            notLike("proxy_server",proxyServer);
        }
        return this;
     }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值' entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLikeLeft(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            likeLeft("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '值%' entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLikeRight(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            likeRight("proxy_server",proxyServer);
        }
        return this;
     }

/**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 等于 =
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerEq(String proxyServer){
        if(proxyServer!=null){
            eq("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 不等于 &lt;&gt;
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerNe(String proxyServer){
        if(proxyServer!=null){
            ne("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于 &gt;
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerGt(String proxyServer){
        if(proxyServer!=null){
            gt("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于等于 &gt;=
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerGe(String proxyServer){
        if(proxyServer!=null){
            ge("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于 &lt;
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLt(String proxyServer){
        if(proxyServer!=null){
            lt("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于等于 &lt;=
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLe(String proxyServer){
        if(proxyServer!=null){
            le("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值%'
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLike(String proxyServer){
        if(proxyServer!=null){
            like("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT LIKE '%值%'
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerNotLike(String proxyServer){
        if(proxyServer!=null){
            notLike("proxy_server",proxyServer);
        }
        return this;
    }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值'
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLikeLeft(String proxyServer){
        if(proxyServer!=null){
            likeLeft("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '值%'
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerLikeRight(String proxyServer){
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
    public YunMemberDeviceUpdateEntityWrapper proxyServerIsNull(){
        isNull("proxy_server");
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerIsNotNull(){
        isNotNull("proxy_server");
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyServerIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyServerIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper proxyServerNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyServerNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_server",values);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 等于 = entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedEq(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            eq("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 不等于 &lt;&gt; entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedNe(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            ne("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 大于 &gt; entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedGt(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            gt("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 大于等于 &gt;= entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedGe(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            ge("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 小于 &lt; entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLt(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            lt("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 小于等于 &lt;= entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLe(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            le("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * BETWEEN  entity().getConnected() AND 值2
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedBetween(Boolean connectedEnd){
        Boolean connected =entity().getConnected();
        if(connected!=null && connectedEnd!=null){
            between("connected",connected,connectedEnd);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT BETWEEN  entity().getConnected() AND 值2
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedNotBetween(Boolean connectedEnd){
        Boolean connected =entity().getConnected();
        if(connected!=null && connectedEnd!=null){
            notBetween("connected",connected,connectedEnd);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * BETWEEN  entity().getConnected() AND 值2
     * @param connectedStart       值1
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedBetween(Boolean connectedStart,Boolean connectedEnd){
        Boolean connected =entity().getConnected();
        if(connected!=null && connectedEnd!=null){
            between("connected",connectedStart,connectedEnd);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT BETWEEN  entity().getConnected() AND 值2
     * @param connectedStart       值1
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedNotBetween(Boolean connectedStart,Boolean connectedEnd){
        Boolean connected =entity().getConnected();
        if(connected!=null && connectedEnd!=null){
            notBetween("connected",connectedStart,connectedEnd);
        }
        return this;
     }


    /**
     * <p>代理是否连上</p>
     * LIKE '%值%' entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLike(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            like("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT LIKE '%值%' entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedNotLike(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            notLike("connected",connected);
        }
        return this;
     }


    /**
     * <p>代理是否连上</p>
     * LIKE '%值' entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLikeLeft(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            likeLeft("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * LIKE '值%' entity().getConnected()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLikeRight(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            likeRight("connected",connected);
        }
        return this;
     }

/**
     * <p>代理是否连上</p>
     * 等于 =
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedEq(Boolean connected){
        if(connected!=null){
            eq("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 不等于 &lt;&gt;
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedNe(Boolean connected){
        if(connected!=null){
            ne("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 大于 &gt;
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedGt(Boolean connected){
        if(connected!=null){
            gt("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 大于等于 &gt;=
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedGe(Boolean connected){
        if(connected!=null){
            ge("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 小于 &lt;
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLt(Boolean connected){
        if(connected!=null){
            lt("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 小于等于 &lt;=
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLe(Boolean connected){
        if(connected!=null){
            le("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * LIKE '%值%'
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLike(Boolean connected){
        if(connected!=null){
            like("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * NOT LIKE '%值%'
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedNotLike(Boolean connected){
        if(connected!=null){
            notLike("connected",connected);
        }
        return this;
    }


    /**
     * <p>代理是否连上</p>
     * LIKE '%值'
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLikeLeft(Boolean connected){
        if(connected!=null){
            likeLeft("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * LIKE '值%'
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedLikeRight(Boolean connected){
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
    public YunMemberDeviceUpdateEntityWrapper connectedIsNull(){
        isNull("connected");
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedIsNotNull(){
        isNotNull("connected");
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper connectedIn(Collection<Boolean> value){
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
    public YunMemberDeviceUpdateEntityWrapper connectedIn(Boolean... values){
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
    public YunMemberDeviceUpdateEntityWrapper connectedNotIn(Collection<Boolean> value){
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
    public YunMemberDeviceUpdateEntityWrapper connectedNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("connected",values);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 等于 = entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpEq(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            eq("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 不等于 &lt;&gt; entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpNe(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            ne("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 大于 &gt; entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpGt(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            gt("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 大于等于 &gt;= entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpGe(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            ge("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 小于 &lt; entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLt(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            lt("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 小于等于 &lt;= entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLe(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            le("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * BETWEEN  entity().getProxyNetIp() AND 值2
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpBetween(String proxyNetIpEnd){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null && proxyNetIpEnd!=null){
            between("proxy_net_ip",proxyNetIp,proxyNetIpEnd);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT BETWEEN  entity().getProxyNetIp() AND 值2
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpNotBetween(String proxyNetIpEnd){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null && proxyNetIpEnd!=null){
            notBetween("proxy_net_ip",proxyNetIp,proxyNetIpEnd);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * BETWEEN  entity().getProxyNetIp() AND 值2
     * @param proxyNetIpStart       值1
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpBetween(String proxyNetIpStart,String proxyNetIpEnd){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null && proxyNetIpEnd!=null){
            between("proxy_net_ip",proxyNetIpStart,proxyNetIpEnd);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT BETWEEN  entity().getProxyNetIp() AND 值2
     * @param proxyNetIpStart       值1
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpNotBetween(String proxyNetIpStart,String proxyNetIpEnd){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null && proxyNetIpEnd!=null){
            notBetween("proxy_net_ip",proxyNetIpStart,proxyNetIpEnd);
        }
        return this;
     }


    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值%' entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLike(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            like("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT LIKE '%值%' entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpNotLike(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            notLike("proxy_net_ip",proxyNetIp);
        }
        return this;
     }


    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值' entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLikeLeft(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            likeLeft("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * LIKE '值%' entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLikeRight(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            likeRight("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

/**
     * <p>当前代理的网络IP</p>
     * 等于 =
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpEq(String proxyNetIp){
        if(proxyNetIp!=null){
            eq("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 不等于 &lt;&gt;
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpNe(String proxyNetIp){
        if(proxyNetIp!=null){
            ne("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 大于 &gt;
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpGt(String proxyNetIp){
        if(proxyNetIp!=null){
            gt("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 大于等于 &gt;=
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpGe(String proxyNetIp){
        if(proxyNetIp!=null){
            ge("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 小于 &lt;
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLt(String proxyNetIp){
        if(proxyNetIp!=null){
            lt("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 小于等于 &lt;=
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLe(String proxyNetIp){
        if(proxyNetIp!=null){
            le("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值%'
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLike(String proxyNetIp){
        if(proxyNetIp!=null){
            like("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * NOT LIKE '%值%'
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpNotLike(String proxyNetIp){
        if(proxyNetIp!=null){
            notLike("proxy_net_ip",proxyNetIp);
        }
        return this;
    }


    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值'
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLikeLeft(String proxyNetIp){
        if(proxyNetIp!=null){
            likeLeft("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * LIKE '值%'
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpLikeRight(String proxyNetIp){
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
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpIsNull(){
        isNull("proxy_net_ip");
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpIsNotNull(){
        isNotNull("proxy_net_ip");
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_net_ip",values);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 等于 = entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressEq(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            eq("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 不等于 &lt;&gt; entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressNe(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            ne("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 大于 &gt; entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressGt(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            gt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 大于等于 &gt;= entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressGe(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            ge("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 小于 &lt; entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLt(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            lt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 小于等于 &lt;= entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLe(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            le("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * BETWEEN  entity().getProxyNetIpAddress() AND 值2
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressBetween(String proxyNetIpAddressEnd){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null && proxyNetIpAddressEnd!=null){
            between("proxy_net_ip_address",proxyNetIpAddress,proxyNetIpAddressEnd);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT BETWEEN  entity().getProxyNetIpAddress() AND 值2
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressNotBetween(String proxyNetIpAddressEnd){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null && proxyNetIpAddressEnd!=null){
            notBetween("proxy_net_ip_address",proxyNetIpAddress,proxyNetIpAddressEnd);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * BETWEEN  entity().getProxyNetIpAddress() AND 值2
     * @param proxyNetIpAddressStart       值1
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressBetween(String proxyNetIpAddressStart,String proxyNetIpAddressEnd){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null && proxyNetIpAddressEnd!=null){
            between("proxy_net_ip_address",proxyNetIpAddressStart,proxyNetIpAddressEnd);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT BETWEEN  entity().getProxyNetIpAddress() AND 值2
     * @param proxyNetIpAddressStart       值1
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressNotBetween(String proxyNetIpAddressStart,String proxyNetIpAddressEnd){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null && proxyNetIpAddressEnd!=null){
            notBetween("proxy_net_ip_address",proxyNetIpAddressStart,proxyNetIpAddressEnd);
        }
        return this;
     }


    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值%' entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLike(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            like("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT LIKE '%值%' entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressNotLike(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            notLike("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }


    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值' entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLikeLeft(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            likeLeft("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * LIKE '值%' entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLikeRight(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            likeRight("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

/**
     * <p>IP的地理位置显示</p>
     * 等于 =
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressEq(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            eq("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 不等于 &lt;&gt;
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressNe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            ne("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 大于 &gt;
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressGt(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            gt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 大于等于 &gt;=
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressGe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            ge("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 小于 &lt;
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLt(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            lt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 小于等于 &lt;=
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            le("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值%'
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLike(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            like("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * NOT LIKE '%值%'
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressNotLike(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            notLike("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }


    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值'
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLikeLeft(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            likeLeft("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * LIKE '值%'
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressLikeRight(String proxyNetIpAddress){
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
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressIsNull(){
        isNull("proxy_net_ip_address");
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressIsNotNull(){
        isNotNull("proxy_net_ip_address");
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressIn(String... values){
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
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressNotIn(Collection<String> value){
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
    public YunMemberDeviceUpdateEntityWrapper proxyNetIpAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_net_ip_address",values);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 等于 = entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceEq(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            eq("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 不等于 &lt;&gt; entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceNe(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            ne("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于 &gt; entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceGt(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            gt("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于等于 &gt;= entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceGe(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            ge("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于 &lt; entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLt(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            lt("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于等于 &lt;= entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLe(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            le("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * BETWEEN  entity().getSeedDevice() AND 值2
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceBetween(Boolean seedDeviceEnd){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null && seedDeviceEnd!=null){
            between("seed_device",seedDevice,seedDeviceEnd);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT BETWEEN  entity().getSeedDevice() AND 值2
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceNotBetween(Boolean seedDeviceEnd){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null && seedDeviceEnd!=null){
            notBetween("seed_device",seedDevice,seedDeviceEnd);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * BETWEEN  entity().getSeedDevice() AND 值2
     * @param seedDeviceStart       值1
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceBetween(Boolean seedDeviceStart,Boolean seedDeviceEnd){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null && seedDeviceEnd!=null){
            between("seed_device",seedDeviceStart,seedDeviceEnd);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT BETWEEN  entity().getSeedDevice() AND 值2
     * @param seedDeviceStart       值1
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceNotBetween(Boolean seedDeviceStart,Boolean seedDeviceEnd){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null && seedDeviceEnd!=null){
            notBetween("seed_device",seedDeviceStart,seedDeviceEnd);
        }
        return this;
     }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值%' entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLike(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            like("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT LIKE '%值%' entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceNotLike(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            notLike("seed_device",seedDevice);
        }
        return this;
     }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值' entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLikeLeft(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            likeLeft("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '值%' entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLikeRight(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            likeRight("seed_device",seedDevice);
        }
        return this;
     }

/**
     * <p>是否种子机（0：否，1：是）</p>
     * 等于 =
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceEq(Boolean seedDevice){
        if(seedDevice!=null){
            eq("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 不等于 &lt;&gt;
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceNe(Boolean seedDevice){
        if(seedDevice!=null){
            ne("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于 &gt;
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceGt(Boolean seedDevice){
        if(seedDevice!=null){
            gt("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于等于 &gt;=
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceGe(Boolean seedDevice){
        if(seedDevice!=null){
            ge("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于 &lt;
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLt(Boolean seedDevice){
        if(seedDevice!=null){
            lt("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于等于 &lt;=
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLe(Boolean seedDevice){
        if(seedDevice!=null){
            le("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值%'
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLike(Boolean seedDevice){
        if(seedDevice!=null){
            like("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT LIKE '%值%'
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceNotLike(Boolean seedDevice){
        if(seedDevice!=null){
            notLike("seed_device",seedDevice);
        }
        return this;
    }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值'
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLikeLeft(Boolean seedDevice){
        if(seedDevice!=null){
            likeLeft("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '值%'
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceLikeRight(Boolean seedDevice){
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
    public YunMemberDeviceUpdateEntityWrapper seedDeviceIsNull(){
        isNull("seed_device");
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceIsNotNull(){
        isNotNull("seed_device");
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper seedDeviceIn(Collection<Boolean> value){
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
    public YunMemberDeviceUpdateEntityWrapper seedDeviceIn(Boolean... values){
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
    public YunMemberDeviceUpdateEntityWrapper seedDeviceNotIn(Collection<Boolean> value){
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
    public YunMemberDeviceUpdateEntityWrapper seedDeviceNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("seed_device",values);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 等于 = entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdEq(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            eq("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 不等于 &lt;&gt; entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdNe(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            ne("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 大于 &gt; entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdGt(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            gt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 大于等于 &gt;= entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdGe(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            ge("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 小于 &lt; entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLt(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            lt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 小于等于 &lt;= entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLe(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            le("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * BETWEEN  entity().getFkServerHostUsageRateId() AND 值2
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdBetween(Long fkServerHostUsageRateIdEnd){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null && fkServerHostUsageRateIdEnd!=null){
            between("fk_server_host_usage_rate_id",fkServerHostUsageRateId,fkServerHostUsageRateIdEnd);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT BETWEEN  entity().getFkServerHostUsageRateId() AND 值2
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdNotBetween(Long fkServerHostUsageRateIdEnd){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null && fkServerHostUsageRateIdEnd!=null){
            notBetween("fk_server_host_usage_rate_id",fkServerHostUsageRateId,fkServerHostUsageRateIdEnd);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * BETWEEN  entity().getFkServerHostUsageRateId() AND 值2
     * @param fkServerHostUsageRateIdStart       值1
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdBetween(Long fkServerHostUsageRateIdStart,Long fkServerHostUsageRateIdEnd){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null && fkServerHostUsageRateIdEnd!=null){
            between("fk_server_host_usage_rate_id",fkServerHostUsageRateIdStart,fkServerHostUsageRateIdEnd);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT BETWEEN  entity().getFkServerHostUsageRateId() AND 值2
     * @param fkServerHostUsageRateIdStart       值1
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdNotBetween(Long fkServerHostUsageRateIdStart,Long fkServerHostUsageRateIdEnd){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null && fkServerHostUsageRateIdEnd!=null){
            notBetween("fk_server_host_usage_rate_id",fkServerHostUsageRateIdStart,fkServerHostUsageRateIdEnd);
        }
        return this;
     }


    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值%' entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLike(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            like("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT LIKE '%值%' entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdNotLike(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            notLike("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }


    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值' entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLikeLeft(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            likeLeft("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * LIKE '值%' entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLikeRight(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            likeRight("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

/**
     * <p>物理机使用率记录id</p>
     * 等于 =
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdEq(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            eq("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 不等于 &lt;&gt;
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdNe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            ne("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 大于 &gt;
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdGt(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            gt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 大于等于 &gt;=
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdGe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            ge("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 小于 &lt;
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLt(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            lt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 小于等于 &lt;=
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            le("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值%'
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLike(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            like("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * NOT LIKE '%值%'
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdNotLike(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            notLike("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }


    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值'
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLikeLeft(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            likeLeft("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * LIKE '值%'
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdLikeRight(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdIsNull(){
        isNull("fk_server_host_usage_rate_id");
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdIsNotNull(){
        isNotNull("fk_server_host_usage_rate_id");
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkServerHostUsageRateIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_server_host_usage_rate_id",values);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 等于 = entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdEq(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 不等于 &lt;&gt; entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdNe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于 &gt; entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdGt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于等于 &gt;= entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdGe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于 &lt; entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于等于 &lt;= entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdNotLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值' entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLikeLeft(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * LIKE '值%' entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLikeRight(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

/**
     * <p>区域id</p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 不等于 &lt;&gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 大于 &gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 大于等于 &gt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 小于 &lt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 小于等于 &lt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * NOT LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }


    /**
     * <p>区域id</p>
     * LIKE '%值'
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * LIKE '值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdIn(Long... values){
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
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceUpdateEntityWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


}
