package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.common.annotation.AsyncPool;
import com.suqi.center.common.lock.annotations.TraceId;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.IMoveDeviceStepState;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * 移机初始化流程入口代理工厂
 *
 * @author PC001
 */
@Component
@Primary
@Slf4j
public class McMoveDeviceFactory implements IMoveDeviceStepState<McMoveDevice>, InitializingBean, ApplicationContextAware {


    @Autowired
    List<IMoveDeviceStepState> iOtaStepStates;

    @Autowired
    MoveStatusServiceImpl moveStatusService;


    Map<MoveStateEnum, IMoveDeviceStepState> iOtaStepStateMap;

    protected ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        iOtaStepStateMap = new ConcurrentHashMap<>(iOtaStepStates.size());
        iOtaStepStates.forEach(s -> {
//            if(s instanceof  AbstractOtaStepState ab){
//                ab.setiOtaStepState(this);
//            }
            iOtaStepStateMap.put(s.state(), s);
        });
    }

    /**
     * 获取状态执行器
     *
     * @param otaStateEnum
     * @return
     */
    public Optional<IMoveDeviceStepState> getStateHandler(MoveStateEnum otaStateEnum) {
        return Optional.ofNullable(iOtaStepStateMap.get(otaStateEnum));
    }

    /**
     * ota初始化流程执行入口
     *
     * @param mcMoveDevice
     */
    @Override
    @TraceId
    @AsyncPool(corePoolSize = 1, maximumPoolSize = 8)
    public void handler(McMoveDevice mcMoveDevice) {
        McMoveDevice t = getMcMoveDevice(mcMoveDevice);
        getStateHandler(MoveStateEnum.valueOf(t.getStatus()))
                .ifPresentOrElse(s -> s.lock(t, (p) -> {
                    MDC.put("traceId",t.getTaskId());
                    s.handler(p);
                }), () -> log.warn("{},当前状态{}，找不到处理器", t, t.getStatus()));
    }


    @Override
    public MoveStateEnum state() {
        return null;
    }

    @Override
    public void lock(McMoveDevice mcMoveDevice, Consumer<McMoveDevice> consumer) {

    }

    public McMoveDevice getMcMoveDevice(McMoveDevice mcMoveDevice) {
        return moveStatusService.getMcMoveDevice(mcMoveDevice);
    }
}
