package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户设备表（yun_member_device）
 * </p>
 *
 * @author PC001
 * @since 2022-11-16
 */
@TableName("yun_member_device")
@ApiModel(value = "MemberDevice对象", description = "用户设备表（yun_member_device）")
@Data
public class MemberDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户id")
    @TableField("fk_member_id")
    private Long fkMemberId;

    @ApiModelProperty("分组id")
    @TableField("fk_em_member_group_id")
    private Long fkEmMemberGroupId;

    @ApiModelProperty("用户设备编号")
    @TableField("user_device_no")
    private String userDeviceNo;

    @ApiModelProperty("严选下单实例id")
    @TableField("smkp_instance_id")
    private String smkpInstanceId;

    @ApiModelProperty("物理设备id")
    @TableField("fk_em_soc_devices_id")
    private Long fkEmSocDevicesId;

    @ApiModelProperty("虚拟设备id")
    @TableField("fk_soc_vm_devices_id")
    private Long fkSocVmDevicesId;

    @ApiModelProperty("分组名称")
    @TableField("member_group_name")
    private String memberGroupName;

    @ApiModelProperty("云机产品id")
    @TableField("fk_yun_product_id")
    private Long fkYunProductId;

    @ApiModelProperty("云机产品套餐skuid")
    @TableField("fk_yun_product_sku_id")
    private Long fkYunProductSkuId;

    @ApiModelProperty("产品名称")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备名")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("使用有效期开始时间")
    @TableField("valid_start_time")
    private Date validStartTime;

    @ApiModelProperty("使用有效期结束时间")
    @TableField("valid_end_time")
    private Date validEndTime;

    @ApiModelProperty("冻结开始时间")
    @TableField("freeze_start_time")
    private Date freezeStartTime;

    @ApiModelProperty("冻结结束时间（释放设备的时间）")
    @TableField("freeze_end_time")
    private Date freezeEndTime;

    @ApiModelProperty("总天数（单位：天）")
    @TableField("total_available_days")
    private Integer totalAvailableDays;

    @ApiModelProperty("总时长（单位：小时）")
    @TableField("total_available_times")
    private Integer totalAvailableTimes;

    @ApiModelProperty("剩余可用天数")
    @TableField("rest_valid_days")
    private Integer restValidDays;

    @ApiModelProperty("剩余可用时长")
    @TableField("rest_valid_times")
    private Integer restValidTimes;

    @ApiModelProperty("设备类型(1:测试设备，2：商用设备)")
    @TableField("biz_type")
    private Integer bizType;

    @ApiModelProperty("设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）")
    @TableField("source_type")
    private Integer sourceType;

    @ApiModelProperty("过期缓冲时间")
    @TableField("expired_times")
    private Integer expiredTimes;

    @ApiModelProperty("生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)")
    @TableField("lifecycle")
    private String lifecycle;

    @ApiModelProperty("恢复出厂设置次数")
    @TableField("factory_reset_times")
    private Integer factoryResetTimes;

    @ApiModelProperty("是否静音（静音：1，非静音：0）")
    @TableField("is_silent")
    private Integer isSilent;

    @ApiModelProperty("重启设备次数")
    @TableField("reboot_times")
    private Integer rebootTimes;

    @ApiModelProperty("客户申报故障（0：无，1故障）")
    @TableField("failure")
    private Integer failure;

    @ApiModelProperty("应用同步安装(0：未执行，1同步中)")
    @TableField("sync_install")
    private Integer syncInstall;

    @ApiModelProperty("房间session")
    @TableField("room_session")
    private String roomSession;

    @ApiModelProperty("房间最大容纳成员数")
    @TableField("room_people_max_num")
    private Integer roomPeopleMaxNum;

    @ApiModelProperty("房间当前总成员数")
    @TableField("room_people_total_num")
    private Integer roomPeopleTotalNum;

    @ApiModelProperty("用户设备分配状态（未分配：0，已分配：1）")
    @TableField("allot_status")
    private Integer allotStatus;

    @ApiModelProperty("盒子服务类型(10：boxStream服务，20：boxRtc服务）")
    @TableField("server_type")
    private Integer serverType;

    @ApiModelProperty("服务业务类型（0：普通业务类型，1：排队业务类型）")
    @TableField("service_biz_type")
    private Integer serviceBizType;

    @ApiModelProperty("打开当前应用的下行宽带（kb）")
    @TableField("downstream_broadband")
    private Long downstreamBroadband;

    @ApiModelProperty("设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("订购时间")
    @TableField("buy_time")
    private Date buyTime;

    @ApiModelProperty("最近一次续费时间")
    @TableField("last_renew_time")
    private Date lastRenewTime;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty("设备空闲上报时间")
    @TableField("idle_time")
    private Date idleTime;

    @TableField("version_id")
    private Long versionId;

    @TableField("proxy_province")
    private String proxyProvince;

    @TableField("proxy_city")
    private String proxyCity;

    @ApiModelProperty("代理服务器的地址，缺省或null或\"\"时，表示没有使用代理")
    @TableField("proxy_server")
    private String proxyServer;

    @ApiModelProperty("代理是否连上")
    @TableField("connected")
    private Boolean connected;

    @ApiModelProperty("当前代理的网络IP")
    @TableField("proxy_net_ip")
    private String proxyNetIp;

    @ApiModelProperty("IP的地理位置显示")
    @TableField("proxy_net_ip_address")
    private String proxyNetIpAddress;

    @ApiModelProperty("是否种子机（0：否，1：是）")
    @TableField("seed_device")
    private Boolean seedDevice;

    @ApiModelProperty("物理机使用率记录id")
    @TableField("fk_server_host_usage_rate_id")
    private Long fkServerHostUsageRateId;

}
