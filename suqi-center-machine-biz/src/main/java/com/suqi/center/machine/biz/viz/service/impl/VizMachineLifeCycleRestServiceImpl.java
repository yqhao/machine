package com.suqi.center.machine.biz.viz.service.impl;

import com.suqi.center.common.constant.RedisKeyNameConstants;
import com.suqi.center.common.enums.VizMcTaskHandlerStatusEnum;
import com.suqi.center.machine.api.viz.dto.request.VizLifeCycleRebootOnlineParam;
import com.suqi.center.machine.biz.viz.service.VizMachineLifeCycleRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/10/21 15:56
 */
@Slf4j
@Service
public class VizMachineLifeCycleRestServiceImpl implements VizMachineLifeCycleRestService {

    @Resource
    RedisTemplate<String, Object> redisTemplate;

    @Override
    public Boolean rebootOnline(VizLifeCycleRebootOnlineParam param) {
        // 开始处理任务中的重启任务，将该重启任务标记为成功
        redisTemplate.opsForValue().set(RedisKeyNameConstants.THE_CLOUD_MACHINE_TASK_OTA_RESTARTS_THE_CACHE + param.getDeviceId(), VizMcTaskHandlerStatusEnum.SUCCESSFUL.getValue());
        return true;
    }
}
