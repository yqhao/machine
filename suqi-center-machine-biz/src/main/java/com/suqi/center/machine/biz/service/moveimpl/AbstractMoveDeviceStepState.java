package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.common.utils.IfUtils;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.IMoveDeviceStepState;
import com.suqi.center.machine.biz.service.MoveStatusService;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.center.machine.dao.entity.PcpDevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * @author PC001
 */
public abstract class AbstractMoveDeviceStepState implements IMoveDeviceStepState<McMoveDevice>, InitializingBean {

    protected Logger log = LoggerFactory.getLogger(getClass());


    @Autowired
    protected RedisTemplate redisTemplate;


    @Autowired
    MoveStatusService moveStatusService;


    @Autowired
    MoveQueryServiceImpl moveQueryService;

    @Autowired
    @Lazy
    @Qualifier("mcMoveDeviceFactory")
    protected IMoveDeviceStepState<McMoveDevice> iMoveDeviceStepState;


    public boolean lock(String key) {
        Boolean locked = redisTemplate.opsForValue().setIfAbsent(key, true, 120, TimeUnit.SECONDS);
        return locked != null && locked;
    }

    public void unlock(String key) {
        redisTemplate.unlink(key);
    }

    @Override
    public void lock(McMoveDevice mcMoveDevice, Consumer<McMoveDevice> consumer) {
        String lockkey = this.getClass().getName() + ".lock." + (IfUtils.notEmpty(mcMoveDevice.getUserPhoneId()) ? mcMoveDevice.getUserPhoneId() : mcMoveDevice.getId())+"."+mcMoveDevice.getStatus();
        boolean locked = false;
        MoveStateEnum state = state();
        try {
            locked = lock(lockkey);
            if (locked) {
                McMoveDevice last = getMcMoveDevice(mcMoveDevice);
                //防止并发执行后状态不一致
                if (last.getStatus().equals(mcMoveDevice.getStatus()) && mcMoveDevice.getStatus().equals(state.value())) {
                    log.info("state:{} ,{},初始化记录：{},开始执行", state.value(), state.info(), mcMoveDevice);
                    consumer.accept(last);
                } else {
                    log.warn("初始化任务：{},state:{} ,{},待执行记录状态：{},实际状态：{},忽略本状态执行", mcMoveDevice, state.value(), state.info(), mcMoveDevice.getStatus(), last.getStatus());
                }
            }
        } finally {
            if (locked) {
                log.info("state:{} ,{},初始化记录：{},开始执行结束", state.value(), state.info(), mcMoveDevice);
                unlock(lockkey);
            }
        }
    }


    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public PcpDevice getPcpDevice(String deviceId) {
        return moveQueryService.getPcpDevice(deviceId);
    }


//    public PcpConfig getPcpConfig(String projectId,String deviceId) {
//        if(projectId!=null && !"".equals(projectId.trim())){
//            return moveQueryService.getPcpConfigByProjectId(projectId);
//        }
//        return moveQueryService.getPcpConfig(deviceId);
//    }

    public PcpConfig getPcpConfig(String deviceId) {
        return moveQueryService.getPcpConfig(deviceId);
    }
    public McMoveDevice getMcMoveDevice(McMoveDevice mcMoveDevice) {
        return moveStatusService.getMcMoveDevice(mcMoveDevice);
    }

    public void updateStatus(McMoveDevice mcMoveDevice, MoveStateEnum moveStateEnum) {
        moveStatusService.updateStatus(mcMoveDevice, null, moveStateEnum);
    }

    public void updateStatus(McMoveDevice mcMoveDevice, String jobId, MoveStateEnum moveStateEnum) {
        moveStatusService.updateStatus(mcMoveDevice, jobId, moveStateEnum);
    }

    public void updateJob(McMoveDevice mcMoveDevice, String jobId) {
        moveStatusService.updateJob(mcMoveDevice, jobId);
    }


}
