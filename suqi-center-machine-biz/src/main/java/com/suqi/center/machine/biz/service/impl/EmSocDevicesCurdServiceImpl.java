package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.service.IEmSocDevicesService;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * <p>
 * 设备（em_soc_devices） 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-16
 */
@Service
public class EmSocDevicesCurdServiceImpl extends CurdService<EmSocDevices, Long,IEmSocDevicesService> {

    public EmSocDevicesCurdServiceImpl() {
        super((e, id) -> {
            e.setId(id);
            e.setStatus(-50);
            e.setLastUpdateTime(new Date());
        });
    }

    @Override
    protected QueryWrapper<EmSocDevices> queryPageWrapper(EmSocDevices q) {
        return q.queryWrapper()
                    .idEq()//
                    .fkPcpAreaIdEq()//
                    .deviceIdLike()//设备唯一码
                    .imeiLike()//移动终端的唯一标识
                    .imsiLike()//国际移动用户识别码
                    .macAddrLike()//macAddr
                    .internalAddrEq()//internalAddr
                    .externalAddrEq()//externalAddr
                    .provinceCcodeEq()//省份ccode
                    .provinceNameEq()//省份名称
                    .cityCcodeEq()//城市ccode
                    .cityNameEq()//城市名称
                    .areaCcodeEq()//地区ccode
                    .areaNameEq()//地区名称
                    .regionNameEq()//地址地区名称详细（省市区街道名称以逗号分开）
                    .locationLike()//location
                    .processorsEq()//cpu线程数
                    .buildIdLike()//修订版本号
                    .buildRadioLike()//build_radio
                    .buildModelLike()//版本即最终用户可见的名称
                    .buildManufacturerLike()//硬件制造商
                    .buildBootloaderLike()//build_bootloader
                    .buildBoardLike()//主板
                    .buildBrandLike()//系统定制商
                    .buildCpuAbiLike()//build_cpu_abi
                    .buildCpuAbi2Like()//build_cpu_abi2
                    .buildDeviceLike()//设备参数
                    .buildDisplayLike()//显示屏参数
                    .buildFingerprintLike()//唯一识别码
                    .buildHostLike()//build_host
                    .buildProductLike()//整个产品的名称
                    .buildHardwareLike()//硬件名称
                    .buildSerialLike()//硬件序列
                    .buildSupportedAbisLike()//cpu指令集
                    .buildSupported32BitAbisLike()//cpu指令集
                    .buildSupported64BitAbisLike()//cpu指令集
                    .buildVersionIncrementalLike()//build_version_incremental
                    .buildVersionReleaseEq()//系统版本
                    .buildVersionSdkEq()//build_version_sdk
                    .buildVersionSdkintEq()//SDK版本
                    .buildVersionCodenameEq()//build_version_codename
                    .buildTypeEq()//build_type
                    .buildApiLevelEq()//build_api_level
                    .andoridIdLike()//Android系统第一次启动时产生的一个64bit数
                    .osArchLike()//os_arch
                    .phoneTypeLike()//手机的网络制式(GSM,CDMA)
                    .osVersionLike()//os_version
                    .simSerialNumberLike()//SIM卡的序列号
                    .networkOperatorLike()//SIM卡的运营商
                    .networkOperatorNameLike()//SIM卡的运营商名称
                    .uimodeLike()//UI mode
                    .resolutionLike()//resolution
                    .totalMemEq()//totalMem
                    .availMemEq()//availMem
                    .totalStorageEq()//totalStorage
                    .availStorageEq()//availStorage
                    .rootAccessEq()//root_access(true:1；false:0)
                    .lngEq()//经度
                    .latEq()//纬度
                    .bizTypeEq()//业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)
                    .serverTypeEq()//盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）
                    .salesStatusEq()//销售状态(0：未售，1：已售)
                    .runningStatusEq()//运行状态(0：空闲，1：运行中)
                    .statusEq()//设备状态(-50：删除，0：暂停使用，50：正常)
                    .healthStatusEq()//健康状态(1：在线，0:故障)
                    .trusteeshipStatusEq()//托管状态(0：待托管/已解除托管，1:已托管（默认）)
                    .planSwitchTypeEq()//是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）
                    .streamingStatusEq()//streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
                    .maintStatusEq()//维护模式状态（0：非维护模式，1：维护模式）
                    .isResetingEq()//是否重置中（0：未重置，1：重置中，2：重启中）
                    .romVersionEq()//rom系统软件版本
                    .versionIdEq()//版本id
                    .createTimeGe()//
                    .lastUpdateTimeGe()//盒子信息修改时间
                    .isUserSaveEq()//是否在保存app用户数据(0：否，1：是)
                    .loglevelEq()//3: 打开日志，127: 关闭日志
                    .logpkgLike()//
                    .isOtaUpgradeEq()//是升级中（0：未升级，1：升级中）
                    .supplierTypeEq()//供应商类型[1:华为 2:腾讯]
                ;
    }

    @Override
    protected Page<EmSocDevices> pageQuery(PageSet pageSet, QueryWrapper<EmSocDevices> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()),queryWrapper);
    }
}