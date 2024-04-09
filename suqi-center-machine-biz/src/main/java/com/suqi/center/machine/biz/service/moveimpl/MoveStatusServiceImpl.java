package com.suqi.center.machine.biz.service.moveimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.biz.dto.*;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.HuaweiApiService;
import com.suqi.center.machine.biz.service.MoveStatusService;
import com.suqi.center.machine.biz.service.OverrideCacheService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.entity.McMoveJobs;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.service.IMcMoveDeviceService;
import com.suqi.center.machine.dao.service.IMcMoveJobsService;
import com.suqi.core.redis.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.Date;

@Component
@DS(DBConstants.SHARDING)
public class MoveStatusServiceImpl implements MoveStatusService {

    protected static Logger log = LoggerFactory.getLogger(MoveStatusServiceImpl.class);

    @Autowired
    IMcMoveDeviceService iMcMoveDeviceService;


    @Autowired
    HuaweiApiService huaweiApiService;

    @Autowired
    IMcMoveJobsService iMcMoveJobsService;

    @Autowired
    OverrideCacheService overrideCacheService;


    /**
     * 获取最新迁移记录
     *
     * @param mcMoveDevice
     * @return
     */
    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public McMoveDevice getMcMoveDevice(McMoveDevice mcMoveDevice) {
        return iMcMoveDeviceService.getById(mcMoveDevice.getId());
    }

    /**
     * 更新任务状态
     *
     * @param mcMoveDevice
     * @param moveStateEnum
     */
    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean updateStatus(McMoveDevice mcMoveDevice, MoveStateEnum moveStateEnum) {
        return updateStatus(mcMoveDevice, null, moveStateEnum);
    }

    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean updateStatus(McMoveDevice mcMoveDevice, MoveStateEnum moveStateEnum, String jobId) {
        return updateStatus(mcMoveDevice, jobId, moveStateEnum);
    }

    /**
     * 更新任务状态和jobid
     *
     * @param mcMoveDevice
     * @param jobId
     * @param moveStateEnum
     */
    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean updateStatus(McMoveDevice mcMoveDevice, String jobId, MoveStateEnum moveStateEnum) {
        McMoveDevice up = new McMoveDevice();
        up.setId(mcMoveDevice.getId());
        up.setStatus(moveStateEnum.value());
        up.setLastUpdateTime(new Date());
        if (jobId != null) {
            up.setJobId(jobId);
        }
        iMcMoveDeviceService.updateById(up);
        return true;
    }

    /**
     * 更新jobid
     *
     * @param mcMoveDevice
     * @param jobId
     */
    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public void updateJob(McMoveDevice mcMoveDevice, String jobId) {
        McMoveDevice up = new McMoveDevice();
        up.setId(mcMoveDevice.getId());
        up.setLastUpdateTime(new Date());
        up.setJobId(jobId);
        iMcMoveDeviceService.updateById(up);
    }

    /**
     * 关机旧云机
     *
     * @param mcMoveDevice
     * @param pcpConfig
     */
    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public void stopOldDevice(McMoveDevice mcMoveDevice, PcpConfig pcpConfig) {

        BatchStopRequest batchStopRequest = new BatchStopRequest();
        batchStopRequest.setPhone_ids(Arrays.asList(mcMoveDevice.getFromPhoneId()));
        HuaWeiAppResult r = huaweiApiService.batchStop(pcpConfig, batchStopRequest);
        if (r != null && r.ok()) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_5_old_device_shutdown, r.firstJobId());
        } else {
            updateStatus(mcMoveDevice, MoveStateEnum.step_6_old_device_shutdown_fail);
        }
    }

    /**
     * 检测关机任务结果
     *
     * @param mcMoveDevice
     * @param pcpConfig
     * @return
     */

    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean checkOldDeviceStopStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig) {
        QueryJobResult r = huaweiApiService.queryJobResult(pcpConfig, mcMoveDevice.getJobId());
        if (r != null && r.ok()) {
            return updateStatus(mcMoveDevice, MoveStateEnum.step_7_old_device_shutdown_succeed);
        } else if (r != null && r.fail()) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_6_old_device_shutdown_fail);
        }
        return false;
    }


    /**
     * 导出旧云机数据
     *
     * @param mcMoveDevice
     * @param pcpDevice
     * @param pcpConfig
     * @return
     */
    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean exportOldDeviceData(McMoveDevice mcMoveDevice, PcpDevice pcpDevice, PcpConfig pcpConfig) {
        BatchStorageRequest req = new BatchStorageRequest();
        req.setStorage_infos(Arrays.asList(
                BatchStorageRequest.Storage_info.builder()
                        .phone_id(pcpDevice.getPhoneId())
                        .bucket_name(mcMoveDevice.getBucketName())
                        .include_files(ObjectUtils.isEmpty(mcMoveDevice.getIncludeFiles()) ? Arrays.asList("/data/app", "/data/local", "/data/media") : Arrays.asList(mcMoveDevice.getIncludeFiles().split(",|;|\\:")))
                        .exclude_files(ObjectUtils.isEmpty(mcMoveDevice.getExcludeFiles()) ? null : Arrays.asList(mcMoveDevice.getExcludeFiles().split(",|;|\\:")))
                        .object_path(mcMoveDevice.getObjectPath())
                        .build()
        ));
        HuaWeiAppResult r = huaweiApiService.batchStorage(pcpConfig, req);
        if (r != null && r.ok()) {
            saveExportJob(mcMoveDevice, req, r);
            return updateStatus(mcMoveDevice, MoveStateEnum.step_8_old_device_export_data, r.firstJobId());
        } else {
            updateStatus(mcMoveDevice, MoveStateEnum.step_9_old_device_export_data_fail);
        }
        return false;
    }


    /**
     * 检测导出任务结果
     *
     * @param mcMoveDevice
     * @param pcpConfig
     * @return
     */

    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean checkOldDeviceBatchStorageStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig) {
        QueryJobResult r = huaweiApiService.queryJobResult(pcpConfig, mcMoveDevice.getJobId());
        if (r != null && r.ok()) {
            updateExportJobResult(mcMoveDevice, r);
            return updateStatus(mcMoveDevice, MoveStateEnum.step_10_old_device_export_data_succeed);
        } else if (r != null && r.fail()) {
            updateExportJobResult(mcMoveDevice, r);
            updateStatus(mcMoveDevice, MoveStateEnum.step_9_old_device_export_data_fail);
        }
        return false;
    }


    /**
     *
     * @param mcMoveDevice
     * @param pcpDevice
     * @param pcpConfig
     * @return
     */
    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean importNewDeviceData(McMoveDevice mcMoveDevice, PcpDevice pcpDevice, PcpConfig pcpConfig) {
        BatchRestoreRequest req = new BatchRestoreRequest();
        req.setRestore_infos(Arrays.asList(
                BatchRestoreRequest.Restore_info.builder()
                        .phone_id(pcpDevice.getPhoneId())
                        .bucket_name(mcMoveDevice.getBucketName())
                        .object_path(mcMoveDevice.getObjectPath())
                        .build()
        ));
        HuaWeiAppResult r = huaweiApiService.batchRestore(pcpConfig, req);
        if (r != null && r.ok()) {
            upateImportJob(mcMoveDevice, req, r);
            return updateStatus(mcMoveDevice, MoveStateEnum.step_11_new_device_import_data, r.firstJobId());
        } else {
            updateStatus(mcMoveDevice, MoveStateEnum.step_12_new_device_import_data_fail);
        }
        return false;
    }


    /**
     * 检测新云机导入数据结果
     * @param mcMoveDevice
     * @param pcpConfig
     * @return
     */
    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean checkNewDeviceBatchReStoreStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig) {
        QueryJobResult r = huaweiApiService.queryJobResult(pcpConfig, mcMoveDevice.getJobId());
        if (r != null && r.ok()) {
            updateImportJobResult(mcMoveDevice, r);
            return updateStatus(mcMoveDevice, MoveStateEnum.step_13_new_device_import_data_succeed);
        } else if (r != null && r.fail()) {
            updateImportJobResult(mcMoveDevice, r);
            updateStatus(mcMoveDevice, MoveStateEnum.step_12_new_device_import_data_fail);
        }
        return false;
    }


    @Override
    @DS(DBConstants.SHARDING)
    public void saveExportJob(McMoveDevice mcMoveDevice, BatchStorageRequest req, HuaWeiAppResult r) {
        McMoveJobs o = iMcMoveJobsService.selectOne(e -> e.fkMcMoveDeviceIdEq(mcMoveDevice.getId()));
        McMoveJobs j = McMoveJobs.builder()
                .id(o != null ? o.getId() : null)
                .fkMcMoveDeviceId(mcMoveDevice.getId())
                .exportJobId(r.firstJobId())
                .exportRequestParam(JsonUtil.objectToJson(req))
                .exportStartTime(new Date())
                .createTime(new Date())
                .lastUpdateTime(new Date())
                .build();
        iMcMoveJobsService.saveOrUpdate(j);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public void updateExportJobResult(McMoveDevice mcMoveDevice, QueryJobResult jobResult) {
        McMoveJobs o = iMcMoveJobsService.selectOne(e -> e.fkMcMoveDeviceIdEq(mcMoveDevice.getId()));
        if (o != null && jobResult.getJob_id() != null && !jobResult.getJob_id().equals(o.getExportJobId())) {
            log.warn("ExportJobId {} jobId !={} jobId", o, jobResult);
            return;
        }
        McMoveJobs j = McMoveJobs.builder()
                .id(o != null ? o.getId() : null)
                .exportEndTime(new Date())
                .exportJobResult(JsonUtil.objectToJson(jobResult))
                .lastUpdateTime(new Date())
                .build();
        iMcMoveJobsService.saveOrUpdate(j);
    }


    @Override
    @DS(DBConstants.SHARDING)
    public void upateImportJob(McMoveDevice mcMoveDevice, BatchRestoreRequest req, HuaWeiAppResult r) {
        McMoveJobs o = iMcMoveJobsService.selectOne(e -> e.fkMcMoveDeviceIdEq(mcMoveDevice.getId()));
        McMoveJobs j = McMoveJobs.builder()
                .id(o != null ? o.getId() : null)
                .importJobId(r.firstJobId())
                .importRequestParam(JsonUtil.objectToJson(req))
                .importStartTime(new Date())
                .lastUpdateTime(new Date())
                .build();
        iMcMoveJobsService.saveOrUpdate(j);
    }


    @Override
    @DS(DBConstants.SHARDING)
    public void updateImportJobResult(McMoveDevice mcMoveDevice, QueryJobResult jobResult) {
        McMoveJobs o = iMcMoveJobsService.selectOne(e -> e.fkMcMoveDeviceIdEq(mcMoveDevice.getId()));
        if (o != null && jobResult.getJob_id() != null && !jobResult.getJob_id().equals(o.getImportJobId())) {
            log.warn("ImportJobId {} jobId !={} jobId", o, jobResult);
            return;
        }
        McMoveJobs j = McMoveJobs.builder()
                .id(o != null ? o.getId() : null)
                .importEndTime(new Date())
                .lastUpdateTime(new Date())
                .importJobResult(JsonUtil.objectToJson(jobResult))
                .build();
        iMcMoveJobsService.saveOrUpdate(j);
    }

    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public void restartNewDevice(McMoveDevice mcMoveDevice, PcpConfig pcpConfig) {
        HuaWeiAppResult r = restartToDevice(mcMoveDevice, pcpConfig);
        if (r != null && r.ok()) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_16_new_device_reboot, r.firstJobId());
        } else {
            updateStatus(mcMoveDevice, MoveStateEnum.step_17_new_device_reboot_fail);
        }
    }

    public HuaWeiAppResult restartToDevice(McMoveDevice mcMoveDevice, PcpConfig pcpConfig) {
        HuaWeiTaskParam huaWeiTaskParam = new HuaWeiTaskParam(mcMoveDevice.getToPhoneId(), mcMoveDevice.getToDeviceId(), null, null);
        HuaWeiAppResult r = huaweiApiService.batchRestart(pcpConfig, huaWeiTaskParam);
        return r;
    }


    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public void restartOldDevice(McMoveDevice mcMoveDevice, PcpConfig pcpConfig) {
        HuaWeiTaskParam huaWeiTaskParam = new HuaWeiTaskParam(mcMoveDevice.getFromPhoneId(), mcMoveDevice.getFromDeviceId(), null, null);
        HuaWeiAppResult r = huaweiApiService.batchRestart(pcpConfig, huaWeiTaskParam);
        if (r != null && r.ok()) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_19_old_device_reboot, r.firstJobId());
        } else {
            updateStatus(mcMoveDevice, MoveStateEnum.step_20_old_device_reboot_fail);
        }
    }

    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean checkRestartNewDeviceStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig) {
        QueryJobResult r = huaweiApiService.queryJobResult(pcpConfig, mcMoveDevice.getJobId());
        if (r != null && r.ok()) {
            updateExportJobResult(mcMoveDevice, r);
            overrideCacheService.addPhoneId(mcMoveDevice.getUserPhoneId());
            return updateStatus(mcMoveDevice, MoveStateEnum.step_18_new_device_reboot_succeed);
        } else if (r != null && r.fail()) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_17_new_device_reboot_fail);
        }
        return false;
    }

    @Override
    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean checkRestartOldDeviceStatus(McMoveDevice mcMoveDevice, PcpConfig pcpConfig) {
        QueryJobResult r = huaweiApiService.queryJobResult(pcpConfig, mcMoveDevice.getJobId());
        if (r != null && r.ok()) {
            updateExportJobResult(mcMoveDevice, r);
            return updateStatus(mcMoveDevice, MoveStateEnum.step_21_old_device_reboot_succeed);
        } else if (r != null && r.fail()) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_20_old_device_reboot_fail);
        }
        return false;
    }

}
