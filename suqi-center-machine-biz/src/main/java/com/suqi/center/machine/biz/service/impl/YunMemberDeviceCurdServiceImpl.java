package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.entity.YunMemberDevice;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.service.IYunMemberDeviceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户设备表（yun_member_device） 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-28
 */
@Service
public class YunMemberDeviceCurdServiceImpl extends CurdService<YunMemberDevice, Long,IYunMemberDeviceService> {

    public YunMemberDeviceCurdServiceImpl() {
        super((e, id) -> {
            e.setId(id);
            e.setStatus(-50);
        });
    }

    @Override
    protected QueryWrapper<YunMemberDevice> queryPageWrapper(YunMemberDevice q) {
        return q.queryWrapper()
                    .idEq()//id
                    .fkMemberIdEq()//用户id
                    .fkEmMemberGroupIdEq()//分组id
                    .userDeviceNoEq()//用户设备编号
                    .smkpInstanceIdEq()//严选下单实例id
                    .fkEmSocDevicesIdEq()//物理设备id
                    .fkSocVmDevicesIdEq()//虚拟设备id
                    .memberGroupNameLike()//分组名称
                    .fkYunProductIdEq()//云机产品id
                    .fkYunProductSkuIdEq()//云机产品套餐skuid
                    .productNameEq()//产品名称
                    .deviceIdLike()//设备唯一码
                    .deviceNameEq()//设备名
                    .validStartTimeGe()//使用有效期开始时间
                    .validEndTimeGe()//使用有效期结束时间
                    .freezeStartTimeGe()//冻结开始时间
                    .freezeEndTimeGe()//冻结结束时间（释放设备的时间）
                    .totalAvailableDaysEq()//总天数（单位：天）
                    .totalAvailableTimesEq()//总时长（单位：小时）
                    .restValidDaysEq()//剩余可用天数
                    .restValidTimesEq()//剩余可用时长
                    .bizTypeEq()//设备类型(1:测试设备，2：商用设备)
                    .sourceTypeEq()//设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）
                    .expiredTimesEq()//过期缓冲时间
                    .lifecycleEq()//生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)
                    .factoryResetTimesEq()//恢复出厂设置次数
                    .isSilentEq()//是否静音（静音：1，非静音：0）
                    .rebootTimesEq()//重启设备次数
                    .failureEq()//客户申报故障（0：无，1故障）
                    .syncInstallEq()//应用同步安装(0：未执行，1同步中)
                    .roomSessionEq()//房间session
                    .roomPeopleMaxNumEq()//房间最大容纳成员数
                    .roomPeopleTotalNumEq()//房间当前总成员数
                    .allotStatusEq()//用户设备分配状态（未分配：0，已分配：1）
                    .serverTypeEq()//盒子服务类型(10：boxStream服务，20：boxRtc服务）
                    .serviceBizTypeEq()//服务业务类型（0：普通业务类型，1：排队业务类型）
                    .downstreamBroadbandEq()//打开当前应用的下行宽带（kb）
                    .statusEq()//设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）
                    .buyTimeGe()//订购时间
                    .lastRenewTimeGe()//最近一次续费时间
                    .createTimeGe()//创建时间
                    .idleTimeGe()//设备空闲上报时间
                    .versionIdEq()//
                    .proxyProvinceEq()//
                    .proxyCityEq()//
                    .proxyServerEq()//代理服务器的地址，缺省或null或\"\"时，表示没有使用代理
                    .connectedEq()//代理是否连上
                    .proxyNetIpEq()//当前代理的网络IP
                    .proxyNetIpAddressEq()//IP的地理位置显示
                    .seedDeviceEq()//是否种子机（0：否，1：是）
                    .fkServerHostUsageRateIdEq()//物理机使用率记录id
                    .fkPcpAreaIdEq()//区域id
                ;
    }

    @Override
    protected Page<YunMemberDevice> pageQuery(PageSet pageSet, QueryWrapper<YunMemberDevice> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()),queryWrapper);
    }
}