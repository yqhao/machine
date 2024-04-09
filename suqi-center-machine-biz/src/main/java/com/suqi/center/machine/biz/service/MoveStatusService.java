package com.suqi.center.machine.biz.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.biz.dto.BatchRestoreRequest;
import com.suqi.center.machine.biz.dto.BatchStorageRequest;
import com.suqi.center.machine.biz.dto.HuaWeiAppResult;
import com.suqi.center.machine.biz.dto.QueryJobResult;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.center.machine.dao.entity.PcpDevice;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface MoveStatusService {
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    McMoveDevice getMcMoveDevice(McMoveDevice mcMoveDevice);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean updateStatus(McMoveDevice mcMoveDevice, MoveStateEnum moveStateEnum);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean updateStatus(McMoveDevice mcMoveDevice, MoveStateEnum moveStateEnum, String jobId);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean updateStatus(McMoveDevice mcMoveDevice, String jobId, MoveStateEnum moveStateEnum);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    void updateJob(McMoveDevice mcMoveDevice, String jobId);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    void stopOldDevice(McMoveDevice mcMoveDevice, PcpConfig pcpConfig);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean checkOldDeviceStopStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean exportOldDeviceData(McMoveDevice mcMoveDevice, PcpDevice pcpDevice, PcpConfig pcpConfig);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean checkOldDeviceBatchStorageStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean importNewDeviceData(McMoveDevice mcMoveDevice, PcpDevice pcpDevice, PcpConfig pcpConfig);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean checkNewDeviceBatchReStoreStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig);

    @DS(DBConstants.SHARDING)
    void saveExportJob(McMoveDevice mcMoveDevice, BatchStorageRequest req, HuaWeiAppResult r);

    @DS(DBConstants.SHARDING)
    void updateExportJobResult(McMoveDevice mcMoveDevice, QueryJobResult jobResult);

    @DS(DBConstants.SHARDING)
    void upateImportJob(McMoveDevice mcMoveDevice, BatchRestoreRequest req, HuaWeiAppResult r);

    @DS(DBConstants.SHARDING)
    void updateImportJobResult(McMoveDevice mcMoveDevice, QueryJobResult jobResult);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    void restartNewDevice(McMoveDevice mcMoveDevice, PcpConfig pcpConfig);


    HuaWeiAppResult restartToDevice(McMoveDevice mcMoveDevice, PcpConfig pcpConfig);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    void restartOldDevice(McMoveDevice mcMoveDevice, PcpConfig pcpConfig);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean checkRestartNewDeviceStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig);

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    boolean checkRestartOldDeviceStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig);
}
