package com.suqi.center.machine.biz.service;

import com.suqi.center.machine.biz.enums.MoveStateEnum;

import java.util.function.Consumer;

/**
 * @author PC001
 */
public interface IMoveDeviceStepState<T> {

    MoveStateEnum state();


    void lock(T t, Consumer<T> consumer);

    /**
     * 执行状态入口
     */
    void handler(T t);

}
