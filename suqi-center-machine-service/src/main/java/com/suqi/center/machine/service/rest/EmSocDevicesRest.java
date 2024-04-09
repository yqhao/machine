package com.suqi.center.machine.service.rest;

import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.api.dto.request.EmSocDevicesParam;
import com.suqi.center.machine.api.dto.response.EmSocDevicesResult;
import com.suqi.center.machine.api.query.IEmSocDevicesApi;
import com.suqi.center.machine.biz.service.impl.EmSocDevicesCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 * 设备（em_soc_devices） 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-16
 */
@Api(tags = {"设备（em_soc_devices）接口"})
@RestController
@Validated
@RequestMapping("/v1/machine/EmSocDevices")
public class EmSocDevicesRest extends BaseRest<EmSocDevicesCurdServiceImpl, EmSocDevices,Long, EmSocDevicesResult, EmSocDevicesParam, IEmSocDevicesApi> implements IEmSocDevicesApi{


    @Override
    protected QueryWrapper<EmSocDevices> queryWrapper(EmSocDevicesParam q) {
        return EmSocDevices.qWrapper()
                    //
                    .idEq(q.getId())
                    //
                    .fkPcpAreaIdEq(q.getFkPcpAreaId())
                    //设备唯一码
                    .deviceIdLike(q.getDeviceId())
                    //移动终端的唯一标识
                    .imeiLike(q.getImei())
                    //国际移动用户识别码
                    .imsiLike(q.getImsi())
                    //macAddr
                    .macAddrLike(q.getMacAddr())
                    //internalAddr
                    .internalAddrEq(q.getInternalAddr())
                    //externalAddr
                    .externalAddrEq(q.getExternalAddr())
                    //省份ccode
                    .provinceCcodeEq(q.getProvinceCcode())
                    //省份名称
                    .provinceNameEq(q.getProvinceName())
                    //城市ccode
                    .cityCcodeEq(q.getCityCcode())
                    //城市名称
                    .cityNameEq(q.getCityName())
                    //地区ccode
                    .areaCcodeEq(q.getAreaCcode())
                    //地区名称
                    .areaNameEq(q.getAreaName())
                    //地址地区名称详细（省市区街道名称以逗号分开）
                    .regionNameEq(q.getRegionName())
                    //location
                    .locationLike(q.getLocation())
                    //cpu线程数
                    .processorsEq(q.getProcessors())
                    //修订版本号
                    .buildIdLike(q.getBuildId())
                    //build_radio
                    .buildRadioLike(q.getBuildRadio())
                    //版本即最终用户可见的名称
                    .buildModelLike(q.getBuildModel())
                    //硬件制造商
                    .buildManufacturerLike(q.getBuildManufacturer())
                    //build_bootloader
                    .buildBootloaderLike(q.getBuildBootloader())
                    //主板
                    .buildBoardLike(q.getBuildBoard())
                    //系统定制商
                    .buildBrandLike(q.getBuildBrand())
                    //build_cpu_abi
                    .buildCpuAbiLike(q.getBuildCpuAbi())
                    //build_cpu_abi2
                    .buildCpuAbi2Like(q.getBuildCpuAbi2())
                    //设备参数
                    .buildDeviceLike(q.getBuildDevice())
                    //显示屏参数
                    .buildDisplayLike(q.getBuildDisplay())
                    //唯一识别码
                    .buildFingerprintLike(q.getBuildFingerprint())
                    //build_host
                    .buildHostLike(q.getBuildHost())
                    //整个产品的名称
                    .buildProductLike(q.getBuildProduct())
                    //硬件名称
                    .buildHardwareLike(q.getBuildHardware())
                    //硬件序列
                    .buildSerialLike(q.getBuildSerial())
                    //cpu指令集
                    .buildSupportedAbisLike(q.getBuildSupportedAbis())
                    //cpu指令集
                    .buildSupported32BitAbisLike(q.getBuildSupported32BitAbis())
                    //cpu指令集
                    .buildSupported64BitAbisLike(q.getBuildSupported64BitAbis())
                    //build_version_incremental
                    .buildVersionIncrementalLike(q.getBuildVersionIncremental())
                    //系统版本
                    .buildVersionReleaseEq(q.getBuildVersionRelease())
                    //build_version_sdk
                    .buildVersionSdkEq(q.getBuildVersionSdk())
                    //SDK版本
                    .buildVersionSdkintEq(q.getBuildVersionSdkint())
                    //build_version_codename
                    .buildVersionCodenameEq(q.getBuildVersionCodename())
                    //build_type
                    .buildTypeEq(q.getBuildType())
                    //build_api_level
                    .buildApiLevelEq(q.getBuildApiLevel())
                    //Android系统第一次启动时产生的一个64bit数
                    .andoridIdLike(q.getAndoridId())
                    //os_arch
                    .osArchLike(q.getOsArch())
                    //手机的网络制式(GSM,CDMA)
                    .phoneTypeLike(q.getPhoneType())
                    //os_version
                    .osVersionLike(q.getOsVersion())
                    //SIM卡的序列号
                    .simSerialNumberLike(q.getSimSerialNumber())
                    //SIM卡的运营商
                    .networkOperatorLike(q.getNetworkOperator())
                    //SIM卡的运营商名称
                    .networkOperatorNameLike(q.getNetworkOperatorName())
                    //UI mode
                    .uimodeLike(q.getUimode())
                    //resolution
                    .resolutionLike(q.getResolution())
                    //totalMem
                    .totalMemEq(q.getTotalMem())
                    //availMem
                    .availMemEq(q.getAvailMem())
                    //totalStorage
                    .totalStorageEq(q.getTotalStorage())
                    //availStorage
                    .availStorageEq(q.getAvailStorage())
                    //root_access(true:1；false:0)
                    .rootAccessEq(q.getRootAccess())
                    //经度
                    .lngEq(q.getLng())
                    //纬度
                    .latEq(q.getLat())
                    //业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)
                    .bizTypeEq(q.getBizType())
                    //盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）
                    .serverTypeEq(q.getServerType())
                    //销售状态(0：未售，1：已售)
                    .salesStatusEq(q.getSalesStatus())
                    //运行状态(0：空闲，1：运行中)
                    .runningStatusEq(q.getRunningStatus())
                    //设备状态(-50：删除，0：暂停使用，50：正常)
                    .statusEq(q.getStatus())
                    //健康状态(1：在线，0:故障)
                    .healthStatusEq(q.getHealthStatus())
                    //托管状态(0：待托管/已解除托管，1:已托管（默认）)
                    .trusteeshipStatusEq(q.getTrusteeshipStatus())
                    //是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）
                    .planSwitchTypeEq(q.getPlanSwitchType())
                    //streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
                    .streamingStatusEq(q.getStreamingStatus())
                    //维护模式状态（0：非维护模式，1：维护模式）
                    .maintStatusEq(q.getMaintStatus())
                    //是否重置中（0：未重置，1：重置中，2：重启中）
                    .isResetingEq(q.getIsReseting())
                    //rom系统软件版本
                    .romVersionEq(q.getRomVersion())
                    //版本id
                    .versionIdEq(q.getVersionId())
                    //
                    .createTimeGe(q.getCreateTime())
                    //结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //盒子信息修改时间
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //盒子信息修改时间结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                    //是否在保存app用户数据(0：否，1：是)
                    .isUserSaveEq(q.getIsUserSave())
                    //3: 打开日志，127: 关闭日志
                    .loglevelEq(q.getLoglevel())
                    //
                    .logpkgLike(q.getLogpkg())
                    //是升级中（0：未升级，1：升级中）
                    .isOtaUpgradeEq(q.getIsOtaUpgrade())
                    //供应商类型[1:华为 2:腾讯]
                    .supplierTypeEq(q.getSupplierType())
                ;
    }
}