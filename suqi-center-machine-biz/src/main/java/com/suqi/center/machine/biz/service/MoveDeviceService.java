package com.suqi.center.machine.biz.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.core.kafka.dto.KafkaResult;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface MoveDeviceService {

    /**
     * 锁定新设备
     * @param deviceId
     * @param mcMoveDevice
     * @return
     */
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean lockIdleDevice(String deviceId, McMoveDevice mcMoveDevice);

    /**
     * 取消新设备进入维护模式，排队模式，已分配<br>
     * 取消旧设备排队模式,维护模式
     * @param mcMoveDevice
     * @return
     */
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean rollBackMoveDeviceStatus(McMoveDevice mcMoveDevice);

    /**
     * 取消旧设备排队模式,维护模式
     * @param mcMoveDevice
     * @return
     */
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean rollBackMoveOldDeviceStatus(McMoveDevice mcMoveDevice);

    /**
     * 设置就设备进维护和排队
     * @param mcMoveDevice
     * @return
     */
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean updateFromDevicePreState(McMoveDevice mcMoveDevice);

    /**
     * 设备进入维护模式
     * @param deviceId
     * @return
     */
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean setMaint(String deviceId);

    /**
     * 退出维护模式
     * @param deviceId
     * @return
     */
    boolean exitMaint(String deviceId);

    /**
     * 获取设备信息
     * @param deviceId
     * @return
     */
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    EmSocDevices getEmSocDevices(String deviceId);

    /**
     * 退出排队模式
     * @param deviceId
     * @return
     */
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean exitQueueBizMode(String deviceId);

    /**
     * 新设备退出维护和排队模式
     * @param mcMoveDevice
     * @return
     */
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean toDeviceExitMaintQueue(McMoveDevice mcMoveDevice);

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean checkResetOldDeviceStatus(McMoveDevice mcMoveDevice);

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean toDeviceExitMaintStatus(McMoveDevice mcMoveDevice);


    /**
     * 重置云机
     * @param mcMoveDevice
     * @param deviceId 重置设备id
     * @return
     */
    KafkaResult sendResetCommand(McMoveDevice mcMoveDevice,String deviceId);


    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean rollBackMoveResetNewDeviceOldDeviceStatus(McMoveDevice mcMoveDevice);

    boolean checkAndStopStream(McMoveDevice mcMoveDevice);
}
