package com.suqi.center.machine.service.config;

import com.suqi.core.log.aop.AbstractApiLogAspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(1)
public class LogAspect extends AbstractApiLogAspect {

    @Override
    @Pointcut("within (com.suqi.center.machine.service..*)||within (com.suqi.center.*.api..*)")
    public void apiLogAop() {
    }

}