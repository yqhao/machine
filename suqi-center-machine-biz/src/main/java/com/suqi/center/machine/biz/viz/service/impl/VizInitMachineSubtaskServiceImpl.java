package com.suqi.center.machine.biz.viz.service.impl;

import com.suqi.center.common.enums.SupplierTypeEnum;
import com.suqi.center.external.api.dto.request.*;
import com.suqi.center.external.api.dto.response.OtaRecordEoResult;
import com.suqi.center.external.api.dto.response.TaskResult;
import com.suqi.center.external.api.query.cloudphone.ICloudDeviceOptApi;
import com.suqi.center.external.api.query.cloudphone.IOtaRecordEoApi;
import com.suqi.center.external.api.query.objectstore.IOtaPkgEoApi;
import com.suqi.center.machine.biz.viz.dto.SubtaskResult;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceSubtaskTypeEnum;
import com.suqi.center.machine.biz.viz.enums.StatusEnum;
import com.suqi.center.machine.biz.viz.enums.SubtaskStatusEnum;
import com.suqi.center.machine.biz.viz.service.VizUpdateDeviceSubtaskService;
import com.suqi.center.machine.dao.viz.entity.*;
import com.suqi.center.machine.dao.viz.service.IMcServiceSoftwarePackageOssRecordService;
import com.suqi.center.machine.dao.viz.service.IMcServiceSoftwarePackageService;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/9/12 15:50
 */
@Slf4j
@Service
public class VizInitMachineSubtaskServiceImpl implements VizUpdateDeviceSubtaskService {

    @Resource
    private IMcUpdateDeviceTaskService iMcUpdateDeviceTaskService;

    @Resource
    private ICloudDeviceOptApi iCloudDeviceOptApi;

    @Resource
    private IOtaPkgEoApi iOtaPkgEoApi;

    @Resource
    private IOtaRecordEoApi iOtaRecordEoApi;

    @Resource
    private IMcServiceSoftwarePackageService iMcServiceSoftwarePackageService;

    @Resource
    private IMcServiceSoftwarePackageOssRecordService iMcServiceSoftwarePackageOssRecordService;

    @Override
    public Integer getType() {
        return McUpdateDeviceSubtaskTypeEnum.RESET_THE_MACHINE_AND_INSTALL_THE_SERVICE.value;
    }

    @Override
    public String subtaskExecution(McUpdateDeviceSubtask mcUpdateDeviceSubtask, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord) {
        String taskId = null;
        McUpdateDeviceTask mcUpdateDeviceTask = iMcUpdateDeviceTaskService.selectOne(e -> e.idEq(mcUpdateDeviceSubtask.getFkMcUpdateDeviceTaskId()));
        if(mcUpdateDeviceTask == null){
            log.error("主任务不存在！ID：{}", mcUpdateDeviceSubtask.getFkMcUpdateDeviceTaskId());
            return taskId;
        }
        McServiceSoftwarePackage mcServiceSoftwarePackage = iMcServiceSoftwarePackageService.selectOne(e -> e.idEq(mcUpdateDeviceTask.getFkMcServerSoftwarePackageId()));
        if(mcServiceSoftwarePackage == null){
            log.error("云机端软件包不存在！ID：{}", mcUpdateDeviceTask.getFkMcServerSoftwarePackageId());
            return taskId;
        }
        if(SupplierTypeEnum.HUAWEI.getValue().equals(mcServiceSoftwarePackage.getSupplierType())) {
            String name = "updateDeviceTask" + mcUpdateDeviceTask.getName();
            // 开始同步OTA配置
            SynchronizeOtaConfigurationParam synchronizeOtaConfigurationParam = new SynchronizeOtaConfigurationParam();
            synchronizeOtaConfigurationParam.setName(name);
            synchronizeOtaConfigurationParam.setImageId(mcUpdateDeviceTask.getImageId());
            synchronizeOtaConfigurationParam.setProperty(mcUpdateDeviceTask.getProperty());
            synchronizeOtaConfigurationParam.setChmod(mcUpdateDeviceTask.getChmod());
            synchronizeOtaConfigurationParam.setCommand(mcUpdateDeviceTask.getCommand());
            List<McServiceSoftwarePackageOssRecord> mcServiceSoftwarePackageOssRecords = iMcServiceSoftwarePackageOssRecordService.select(e -> e.fkMcServiceSoftwarePackageIdEq(mcServiceSoftwarePackage.getId()).statusEq(StatusEnum.NORMAL.getValue()));
            if (mcServiceSoftwarePackageOssRecords != null && !mcServiceSoftwarePackageOssRecords.isEmpty()) {
                List<SynchronizeOtaObsConfigParam> synchronizeOtaObsConfigParams = new ArrayList<>();
                for (McServiceSoftwarePackageOssRecord mcServiceSoftwarePackageOssRecord : mcServiceSoftwarePackageOssRecords) {
                    SynchronizeOtaObsConfigParam synchronizeOtaObsConfigParam = new SynchronizeOtaObsConfigParam();
                    synchronizeOtaObsConfigParam.setFkObsConfigId(mcServiceSoftwarePackageOssRecord.getOssId());
                    synchronizeOtaObsConfigParam.setBucketName(mcServiceSoftwarePackageOssRecord.getBucketName());
                    synchronizeOtaObsConfigParam.setDownloadObsObjectKey(mcServiceSoftwarePackageOssRecord.getObjectPath());
                    synchronizeOtaObsConfigParams.add(synchronizeOtaObsConfigParam);
                }
                synchronizeOtaConfigurationParam.setSynchronizeOtaObsConfigParams(synchronizeOtaObsConfigParams);
            }
            Boolean isOk = iOtaPkgEoApi.synchronizeOtaConfiguration(synchronizeOtaConfigurationParam).getData();
            if(isOk){
                ExecuteOtaTaskParam param = new ExecuteOtaTaskParam();
                param.setDeviceId(mcUpdateDeviceTaskRecord.getDeviceId());
                param.setName(name);
                taskId = iOtaRecordEoApi.executeOtaTask(param).getData();
            }
        }else {
            String data = iCloudDeviceOptApi.resetExtParamType(mcUpdateDeviceTaskRecord.getDeviceId()).getData();
            if (TencentResetExtParam.class.getName().equals(data)){
                TencentResetExtParam tencentResetExtParam = new TencentResetExtParam();
                tencentResetExtParam.setImageId(mcServiceSoftwarePackage.getImageId());
                ResetParam<TencentResetExtParam> resetParam = new ResetParam<>();
                resetParam.setDeviceId(mcUpdateDeviceTaskRecord.getDeviceId());
                resetParam.setResetExtParam(tencentResetExtParam);
                taskId = iCloudDeviceOptApi.reset(resetParam).getData();
            }
        }
        return taskId;
    }

    @Override
    public SubtaskResult getSubtaskResult(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord) {
        SubtaskResult response = null;
        McServiceSoftwarePackage mcServiceSoftwarePackage = iMcServiceSoftwarePackageService.selectOne(e -> e.idEq(mcUpdateDeviceTaskRecord.getFkMcServerSoftwarePackageId()));
        if(mcServiceSoftwarePackage == null){
            log.error("云机端软件包不存在！ID：{}", mcUpdateDeviceTaskRecord.getFkMcServerSoftwarePackageId());
            return null;
        }
        if(SupplierTypeEnum.HUAWEI.getValue().equals(mcServiceSoftwarePackage.getSupplierType())) {
            OtaRecordEoResult data = iOtaRecordEoApi.get(Long.parseLong(mcUpdateDeviceSubtaskRecord.getTaskId())).getData();
            response = new SubtaskResult();
            response.setMessage(data.getExecuteMsg());
            if(data.getStatus() == 50){
                response.setStatus(SubtaskStatusEnum.SUCCESS.getValue());
            }else if(data.getStatus() == -50) {
                response.setStatus(SubtaskStatusEnum.FAILED.getValue());
            }else {
                response.setStatus(SubtaskStatusEnum.PROCESSING.getValue());
            }
        }else {
            TaskParam taskParam = new TaskParam();
            taskParam.setDeviceId(mcUpdateDeviceTaskRecord.getDeviceId());
            taskParam.setTaskId(mcUpdateDeviceSubtaskRecord.getTaskId());
            TaskResult taskResult = iCloudDeviceOptApi.syncTask(taskParam).getData();
            response = new SubtaskResult();
            response.setMessage(taskResult.getMessage());
            response.setErrorMsg(taskResult.getErrorMsg());
            response.setErrorCode(taskResult.getErrorCode());
            response.setStatus(taskResult.getSqStatus());
        }
        return response;
    }
}
