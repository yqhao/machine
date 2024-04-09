package com.suqi.center.machine.biz.utils.notify;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.suqi.center.common.utils.JsonUtil;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.biz.dto.ExternalAddrByServerIdResult;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.suqi.center.machine.dao.entity.DingDingToken;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.service.IDingDingTokenService;
import com.suqi.center.machine.dao.service.IEmSocDevicesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author zxx
 * @version 1.0
 * @date 2021/12/3 11:24
 */
@Component
@Slf4j
public class NotifyServerUtils {

    @Value("${app.environment:''}")
    String envCN = "";

    @Value("${expire.appName:云游戏平台}")
    String appName = "云游戏平台";

    @Resource
    IDingDingTokenService iDingDingTokenService;

    @Resource
    IEmSocDevicesService iEmSocDevicesService;

    /**
     * SMN 云机空间不足告警
     * @param devRoomPlayer
     */
    @Async
    @DS(DBConstants.SLAVE)
    public void sendSmnLackOfSpaceWarningFeiShuNotify(DevRoomPlayer devRoomPlayer, String deviceId, String currentData, String memberPhone){
        sendSmnLackOfSpaceWarningFeiShuNotifyAsynchronous(devRoomPlayer, deviceId, currentData, memberPhone);
    }

    /**
     * SMN 云机空间不足告警
     * @param devRoomPlayer
     */
    public Boolean sendSmnLackOfSpaceWarningFeiShuNotifyAsynchronous(DevRoomPlayer devRoomPlayer, String deviceId, String currentData, String memberPhone){
        LambdaQueryWrapper<DingDingToken> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(DingDingToken::getBizType, "insufficientCloudMachineSpaceAlarm");
        List<DingDingToken> dingDingTokens = iDingDingTokenService.list(lambdaQueryWrapper);

        LambdaQueryWrapper<EmSocDevices> emSocDevicesLambdaQueryWrapper = new LambdaQueryWrapper<>();
        emSocDevicesLambdaQueryWrapper.eq(EmSocDevices::getDeviceId, deviceId);
        //0设备过期或不存在，1 重启中，2 重启完成 ，3：维护中，4 备份中，5 离线 ，6 在线
        EmSocDevices devicesByBoxId = iEmSocDevicesService.getOne(emSocDevicesLambdaQueryWrapper,false);
        if(devicesByBoxId != null){
            for (DingDingToken dingDingToken : dingDingTokens) {
                // SMN 云机空间不足告警
                StringBuilder t = new StringBuilder("insufficientCloudMachineSpaceAlarm");
                t.append("##告警： " + envCN + appName + "SMN 云机空间不足告警\n");
                t.append("当前商户手机号：").append(memberPhone)
                        .append("\n设备id：").append(deviceId)
                        .append("\n当前公网IP：").append(devicesByBoxId.getExternalAddr())
                        .append("\n当前内网IP：").append(devicesByBoxId.getInternalAddr())
                        .append("\n当前用户id为：").append(devRoomPlayer != null ? devRoomPlayer.getPhoneId() : "")
                        .append("\n当前room_session为：").append(devRoomPlayer != null ? devRoomPlayer.getRoomSession() : "")
                        .append("\n当前云机使用率为：").append(currentData).append("%");
                Map<String, Object> param = new HashMap<>();
                param.put("msg_type", "text");
                Map<String, Object> content = new HashMap<>();
                content.put("text", t.toString());
                param.put("content", content);
                String paramJson = JsonUtil.objectToJson(param);

                log.info("发送SMN 云机空间不足告警通知Url：{}，：{}", dingDingToken.getUrl(),paramJson );
                try {
//                    String response = HttpUtil.post(param);
                    String response = HttpUtil.createPost(dingDingToken.getUrl()).body(paramJson).contentType("application/json").execute().body();
                    log.info("发送SMN 云机空间不足告警通知返回{}", response);
                } catch (Exception e) {
                    e.printStackTrace();
                    log.error(e.getMessage(), e);
                }
            }
        }
        return true;
    }

    /**
     * 发送飞书告警
     *
     * @param devRoomPlayer 房间
     * @param deviceId      设备
     * @param memberPhone   用户手机
     * @param currentData   消息
     * @param info          提示标题
     * @param isRestart
     */
    @SuppressWarnings("DuplicatedCode")
    public void sendSmnFlyBookAlarm(DevRoomPlayer devRoomPlayer, String deviceId, String memberPhone, String title, String currentData, String info, Boolean isRestart) {
        // 构建钉钉 token 查询参数
        LambdaQueryWrapper<DingDingToken> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(DingDingToken::getBizType, info);
        // 查询钉钉 token
        List<DingDingToken> tokens = iDingDingTokenService.list(lambdaQueryWrapper);
        // 构建设备查询参数
        LambdaQueryWrapper<EmSocDevices> emSocDevicesLambdaQueryWrapper = new LambdaQueryWrapper<>();
        emSocDevicesLambdaQueryWrapper.eq(EmSocDevices::getDeviceId, deviceId);
        // 0：设备过期或不存在、1：重启中、2：重启完成 、3：维护中、4：备份中、5：离线 、6：在线
        EmSocDevices devices = iEmSocDevicesService.getOne(emSocDevicesLambdaQueryWrapper,false);
        if(Objects.nonNull(devices)) {
            // 构建模板
            for (DingDingToken token : tokens) {
                // SMN 告警内容构建
                String alarm = info + "##告警： " + envCN + appName + "SMN " + title + "\n" +
                        "当前商户手机号：" + memberPhone +
                        "\n是否重启：" + (isRestart.equals(Boolean.TRUE) ? "重启" : "不重启") +
                        "\n设备id：" + deviceId +
                        "\n当前公网IP：" + devices.getExternalAddr() +
                        "\n当前内网IP：" + devices.getInternalAddr() +
                        "\n当前用户id为：" + (devRoomPlayer != null ? devRoomPlayer.getPhoneId() : "") +
                        "\n当前 room_session 为：" + (devRoomPlayer != null ? devRoomPlayer.getRoomSession() : "") +
                        "\n当前云机 " + title + "使用：" + currentData;
                Map<String, Object> param = new HashMap<>();
                param.put("msg_type", "text");
                Map<String, Object> content = new HashMap<>();
                content.put("text", alarm);
                param.put("content", content);
                String paramJson = JsonUtil.objectToJson(param);
                log.info("发送SMN 告警通知Url：{}，：{}", token.getUrl(),paramJson );
                try {
                    String response = HttpUtil.createPost(token.getUrl()).body(paramJson).contentType("application/json").execute().body();
                    log.info("发送 SMN 告警通知返回{}", response);
                } catch (Exception e) {
                    log.error("发送 SMN 告警发生异常！！！", e);
                }
            }
        }
    }

    /**
     * SMN 云机空间不足告警
     *
     * @param externalAddrByServerIdResult
     */
    @Async
    @DS(DBConstants.SLAVE)
    public void sendGpuUsageStatusWarningFeiShuNotify(ExternalAddrByServerIdResult externalAddrByServerIdResult, String gpuIndex, String currentData){
        sendGpuUsageStatusWarningFeiShuNotifyAsynchronous(externalAddrByServerIdResult, gpuIndex, currentData);
    }

    /**
     * SMN 云机空间不足告警
     *
     * @param externalAddrByServerIdResult
     * @param currentData
     */
    public Boolean sendGpuUsageStatusWarningFeiShuNotifyAsynchronous(ExternalAddrByServerIdResult externalAddrByServerIdResult, String gpuIndex, String currentData){
        LambdaQueryWrapper<DingDingToken> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(DingDingToken::getBizType, "huaweiGpuFaultAlarm");
        List<DingDingToken> dingDingTokens = iDingDingTokenService.list(lambdaQueryWrapper);
        String memberMobiles = StrUtil.join(",", externalAddrByServerIdResult.getMemberMobiles());
        for (DingDingToken dingDingToken : dingDingTokens) {
            // SMN 云机空间不足告警
            StringBuilder t = new StringBuilder("huaweiGpuFaultAlarm");
            t.append("##告警： " + envCN + appName + "SMN 华为GPU故障告警\n");
            t.append("当前商户：").append(memberMobiles)
                    .append("\n当前公网IP：").append(externalAddrByServerIdResult.getExternalAddr())
                    .append("\n当前serverid：").append(externalAddrByServerIdResult.getServerId())
                    .append("\n当前gpuIndex：").append(gpuIndex)
                    .append("\n当前值：").append(currentData)
                    .append("\n发生时间：").append(DateUtil.format(SystemClock.date(), DatePattern.NORM_DATETIME_PATTERN));
            Map<String, Object> param = new HashMap<>();
            param.put("msg_type", "text");
            Map<String, Object> content = new HashMap<>();
            content.put("text", t.toString());
            param.put("content", content);
            String paramJson = JsonUtil.objectToJson(param);

            log.info("发送SMN 华为GPU故障告警通知Url：{}，：{}", dingDingToken.getUrl(),paramJson );
            try {
                String response = HttpUtil.createPost(dingDingToken.getUrl()).body(paramJson).contentType("application/json").execute().body();
                log.info("发送SMN 华为GPU故障告警通知返回{}", response);
            } catch (Exception e) {
                e.printStackTrace();
                log.error(e.getMessage(), e);
            }
        }
        return true;
    }


    /**
     * 发送飞书告警
     *
     * @param devRoomPlayer 房间
     * @param deviceId      设备
     * @param memberPhone   用户手机
     * @param currentData   消息
     * @param info          提示标题
     * @param isRestart
     */
    @SuppressWarnings("DuplicatedCode")
    public void sendSmnFlyBookAlarmV2(DevRoomPlayer devRoomPlayer, String deviceId, String memberPhone, String title, String currentData, String info, Boolean isRestart, String restartType
            ,Integer max) {
        // 构建钉钉 token 查询参数
        LambdaQueryWrapper<DingDingToken> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(DingDingToken::getBizType, info);
        // 查询钉钉 token
        List<DingDingToken> tokens = iDingDingTokenService.list(lambdaQueryWrapper);
        // 构建设备查询参数
        LambdaQueryWrapper<EmSocDevices> emSocDevicesLambdaQueryWrapper = new LambdaQueryWrapper<>();
        emSocDevicesLambdaQueryWrapper.eq(EmSocDevices::getDeviceId, deviceId);
        // 0：设备过期或不存在、1：重启中、2：重启完成 、3：维护中、4：备份中、5：离线 、6：在线
        EmSocDevices devices = iEmSocDevicesService.getOne(emSocDevicesLambdaQueryWrapper, false);
        if (Objects.nonNull(devices)) {
            // 构建模板
            for (DingDingToken token : tokens) {
                // SMN 告警内容构建
                String alarm = info + "##告警： " + envCN + appName + "SMN " + title + "\n" +
                        "当前商户手机号：" + memberPhone +
                        "\n重启类型：" + "(" + restartType + ")" +
                        "\n是否重启：" + (isRestart.equals(Boolean.TRUE) ? "重启" : "不重启") +
                        "\n设备id：" + deviceId +
                        "\n当前公网IP：" + devices.getExternalAddr() +
                        "\n当前内网IP：" + devices.getInternalAddr() +
                        "\n当前用户id为：" + (devRoomPlayer != null ? devRoomPlayer.getPhoneId() : "") +
                        "\n当前 room_session 为：" + (devRoomPlayer != null ? devRoomPlayer.getRoomSession() : "") +
                        "\n当前云机 " + title + "使用：" + currentData+
                        "\n告警重启次数超出 " + max + "次：";
                Map<String, Object> param = new HashMap<>();
                param.put("msg_type", "text");
                Map<String, Object> content = new HashMap<>();
                content.put("text", alarm);
                param.put("content", content);
                String paramJson = JsonUtil.objectToJson(param);
                log.info("发送SMN sendSmnFlyBookAlarmV2 告警通知Url：{}，：{}", token.getUrl(), paramJson);
                try {
                    String response = HttpUtil.createPost(token.getUrl()).body(paramJson).contentType("application/json").execute().body();
                    log.info("发送 SMN 告警通知返回{}", response);
                } catch (Exception e) {
                    log.error("发送 SMN 告警发生异常！！！", e);
                }
            }
        }
    }
}
