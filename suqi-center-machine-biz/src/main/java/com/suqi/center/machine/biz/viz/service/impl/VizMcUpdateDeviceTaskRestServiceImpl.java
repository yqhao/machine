package com.suqi.center.machine.biz.viz.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.external.api.query.cloudphone.ICloudDeviceOptApi;
import com.suqi.center.machine.api.viz.dto.mq.SubtaskCompletionNotification;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import com.suqi.center.machine.api.viz.enums.SubtaskCompletionNotificationEnum;
import com.suqi.center.machine.biz.viz.enums.McMachineStatusEnum;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceTaskRecordStatusEnum;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceTaskRecordTypeEnum;
import com.suqi.center.machine.biz.viz.enums.StatusEnum;
import com.suqi.center.machine.biz.viz.service.VizMcUpdateDeviceTaskRestService;
import com.suqi.center.machine.dao.viz.dto.McUpdateDeviceTaskListDto;
import com.suqi.center.machine.dao.viz.dto.TaskRecordPageDto;
import com.suqi.center.machine.dao.viz.entity.*;
import com.suqi.center.machine.dao.viz.service.*;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskListVo;
import com.suqi.center.machine.dao.vo.TaskRecordPageVo;
import com.suqi.core.kafka.KafkaService;
import com.suqi.core.kafka.dto.KafkaResult;
import com.suqi.core.kafka.topic.MqTopicConstant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/11 15:00
 */
@Service
public class VizMcUpdateDeviceTaskRestServiceImpl implements VizMcUpdateDeviceTaskRestService {

    @Resource
    IMcUpdateDeviceTaskService iMcUpdateDeviceTaskService;

    @Resource
    IMcUpdateDeviceSubtaskService iMcUpdateDeviceSubtaskService;

    @Resource
    IMcUpdateDeviceTaskRecordService iMcUpdateDeviceTaskRecordService;

    @Resource
    IMcUpdateDeviceSubtaskRecordService iMcUpdateDeviceSubtaskRecordService;

    @Resource
    IVizMcMachineService iVizMcMachineService;

    @Resource
    IMcServiceSoftwarePackageService iMcServiceSoftwarePackageService;

    @Resource
    ICloudDeviceOptApi iCloudDeviceOptApi;

    @Resource
    KafkaService kafkaService;

    @Override
    public Page<McUpdateDeviceTaskPageResult> page(McUpdateDeviceTaskPageParam param) {
        McUpdateDeviceTaskListDto mcUpdateDeviceTaskListDto = new McUpdateDeviceTaskListDto();
        mcUpdateDeviceTaskListDto.setName(param.getName());
        mcUpdateDeviceTaskListDto.setCurrent(param.getCurrent());
        mcUpdateDeviceTaskListDto.setSize(param.getSize());
        mcUpdateDeviceTaskListDto.setSupplierType(param.getSupplierType());
        Page<McUpdateDeviceTaskListVo> page = iMcUpdateDeviceTaskService.listPage(mcUpdateDeviceTaskListDto);
        Page<McUpdateDeviceTaskPageResult> page1 = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        if(page.getRecords() !=null && !page.getRecords().isEmpty()){
            List<McUpdateDeviceTaskPageResult> results = new ArrayList<>();
            for (McUpdateDeviceTaskListVo mcUpdateDeviceTaskListVo: page.getRecords()){
                results.add(mcUpdateDeviceTaskListVoToResult(mcUpdateDeviceTaskListVo));
            }
            page1.setRecords(results);
        }
        return page1;
    }

    private McUpdateDeviceTaskPageResult mcUpdateDeviceTaskListVoToResult(McUpdateDeviceTaskListVo mcUpdateDeviceTaskListVo){
        McUpdateDeviceTaskPageResult mcUpdateDeviceTaskListResult = new McUpdateDeviceTaskPageResult();
        mcUpdateDeviceTaskListResult.setId(mcUpdateDeviceTaskListVo.getId());
        mcUpdateDeviceTaskListResult.setFkMcServerSoftwarePackageId(mcUpdateDeviceTaskListVo.getFkMcServerSoftwarePackageId());
        mcUpdateDeviceTaskListResult.setName(mcUpdateDeviceTaskListVo.getName());
        mcUpdateDeviceTaskListResult.setSupplierType(mcUpdateDeviceTaskListVo.getSupplierType());
        mcUpdateDeviceTaskListResult.setServiceSoftwarePackageName(mcUpdateDeviceTaskListVo.getServiceSoftwarePackageName());
        mcUpdateDeviceTaskListResult.setServiceSoftwarePackageTypeName(mcUpdateDeviceTaskListVo.getServiceSoftwarePackageTypeName());
        mcUpdateDeviceTaskListResult.setStartTime(mcUpdateDeviceTaskListVo.getStartTime());
        mcUpdateDeviceTaskListResult.setOvertimeTime(mcUpdateDeviceTaskListVo.getOvertimeTime());
        mcUpdateDeviceTaskListResult.setWaitStartOverTime(mcUpdateDeviceTaskListVo.getWaitStartOverTime());
        mcUpdateDeviceTaskListResult.setCreateTime(mcUpdateDeviceTaskListVo.getCreateTime());
        mcUpdateDeviceTaskListResult.setLastUpdateTime(mcUpdateDeviceTaskListVo.getLastUpdateTime());
        return mcUpdateDeviceTaskListResult;
    }

    @Override
    public McUpdateDeviceTaskInfoResult info(Long id) {
        McUpdateDeviceTask mcUpdateDeviceTask = iMcUpdateDeviceTaskService.selectOne(e -> e.idEq(id).statusEq(50));
        if(mcUpdateDeviceTask == null){
            ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
        }
        return mcUpdateDeviceTaskToResult(mcUpdateDeviceTask);
    }

    private McUpdateDeviceTaskInfoResult mcUpdateDeviceTaskToResult(McUpdateDeviceTask mcUpdateDeviceTask){
        McUpdateDeviceTaskInfoResult mcUpdateDeviceTaskInfoResult = new McUpdateDeviceTaskInfoResult();
        mcUpdateDeviceTaskInfoResult.setId(mcUpdateDeviceTask.getId());
        mcUpdateDeviceTaskInfoResult.setFkMcServerSoftwarePackageId(mcUpdateDeviceTask.getFkMcServerSoftwarePackageId());
        mcUpdateDeviceTaskInfoResult.setName(mcUpdateDeviceTask.getName());
        mcUpdateDeviceTaskInfoResult.setImageId(mcUpdateDeviceTask.getImageId());
        mcUpdateDeviceTaskInfoResult.setProperty(mcUpdateDeviceTask.getProperty());
        mcUpdateDeviceTaskInfoResult.setChmod(mcUpdateDeviceTask.getChmod());
        mcUpdateDeviceTaskInfoResult.setCommand(mcUpdateDeviceTask.getCommand());
        mcUpdateDeviceTaskInfoResult.setStartTime(mcUpdateDeviceTask.getStartTime());
        mcUpdateDeviceTaskInfoResult.setOvertimeTime(mcUpdateDeviceTask.getOvertimeTime());
        mcUpdateDeviceTaskInfoResult.setWaitStartOverTime(mcUpdateDeviceTask.getWaitStartOverTime());
        return mcUpdateDeviceTaskInfoResult;
    }

    @Override
    public Boolean saveOrUpdate(McUpdateDeviceTaskSaveOrUpdateParam param) {
        McUpdateDeviceTask mcUpdateDeviceTask = new McUpdateDeviceTask();
        mcUpdateDeviceTask.setId(param.getId());
        mcUpdateDeviceTask.setFkMcServerSoftwarePackageId(param.getFkMcServerSoftwarePackageId());
        mcUpdateDeviceTask.setName(param.getName());
        mcUpdateDeviceTask.setImageId(param.getImageId());
        mcUpdateDeviceTask.setProperty(param.getProperty());
        mcUpdateDeviceTask.setChmod(param.getChmod());
        mcUpdateDeviceTask.setCommand(param.getCommand());
        mcUpdateDeviceTask.setStartTime(param.getStartTime());
        mcUpdateDeviceTask.setOvertimeTime(param.getOvertimeTime());
        mcUpdateDeviceTask.setWaitStartOverTime(param.getWaitStartOverTime());
        mcUpdateDeviceTask.setStatus(param.getStatus());
        if(mcUpdateDeviceTask.getId() == null){
            mcUpdateDeviceTask.setVersionId(0L);
            mcUpdateDeviceTask.setCreateTime(SystemClock.date());
        }
        mcUpdateDeviceTask.setLastUpdateTime(SystemClock.date());
        return iMcUpdateDeviceTaskService.saveOrUpdate(mcUpdateDeviceTask);
    }

    @Override
    public List<McUpdateDeviceSubtaskListResult> subtaskList(Long mcUpdateDeviceTaskId) {
        List<McUpdateDeviceSubtaskListResult> results = new ArrayList<>();
        List<McUpdateDeviceSubtask> mcUpdateDeviceSubtasks = iMcUpdateDeviceSubtaskService.select(e -> e.fkMcUpdateDeviceTaskIdEq(mcUpdateDeviceTaskId).statusEq(50));
        if(mcUpdateDeviceSubtasks == null || mcUpdateDeviceSubtasks.isEmpty()){
            return results;
        }
        mcUpdateDeviceSubtasks.forEach(e->{
            results.add(mcUpdateDeviceSubtaskToListResult(e));
        });
        return results;
    }

    private McUpdateDeviceSubtaskListResult mcUpdateDeviceSubtaskToListResult(McUpdateDeviceSubtask mcUpdateDeviceSubtask){
        McUpdateDeviceSubtaskListResult mcUpdateDeviceSubtaskListResult = new McUpdateDeviceSubtaskListResult();
        mcUpdateDeviceSubtaskListResult.setId(mcUpdateDeviceSubtask.getId());
        mcUpdateDeviceSubtaskListResult.setFkMcUpdateDeviceTaskId(mcUpdateDeviceSubtask.getFkMcUpdateDeviceTaskId());
        mcUpdateDeviceSubtaskListResult.setType(mcUpdateDeviceSubtask.getType());
        mcUpdateDeviceSubtaskListResult.setExecutionFlow(mcUpdateDeviceSubtask.getExecutionFlow());
        mcUpdateDeviceSubtaskListResult.setCreateTime(mcUpdateDeviceSubtask.getCreateTime());
        mcUpdateDeviceSubtaskListResult.setLastUpdateTime(mcUpdateDeviceSubtask.getLastUpdateTime());
        return mcUpdateDeviceSubtaskListResult;
    }

    @Override
    public Boolean subtaskSaveOrUpdate(McUpdateDeviceSubtaskSaveOrUpdateParam param) {
        McUpdateDeviceSubtask mcUpdateDeviceSubtask = new McUpdateDeviceSubtask();
        mcUpdateDeviceSubtask.setId(param.getId());
        mcUpdateDeviceSubtask.setFkMcUpdateDeviceTaskId(param.getFkMcUpdateDeviceTaskId());
        mcUpdateDeviceSubtask.setType(param.getType());
        mcUpdateDeviceSubtask.setExecutionFlow(param.getExecutionFlow());
        mcUpdateDeviceSubtask.setStatus(param.getStatus());
        if(mcUpdateDeviceSubtask.getId() == null){
            mcUpdateDeviceSubtask.setCreateTime(SystemClock.date());
        }
        mcUpdateDeviceSubtask.setLastUpdateTime(SystemClock.date());
        return iMcUpdateDeviceSubtaskService.saveOrUpdate(mcUpdateDeviceSubtask);
    }

    @Override
    public Page<TaskRecordPageResult> taskRecordPage(TaskRecordPageParam param) {
        TaskRecordPageDto taskRecordPageDto = new TaskRecordPageDto();
        taskRecordPageDto.setFkMcUpdateDeviceTaskId(param.getFkMcUpdateDeviceTaskId());
        taskRecordPageDto.setDeviceId(param.getDeviceId());
        taskRecordPageDto.setExternalAddr(param.getExternalAddr());
        taskRecordPageDto.setInternalAddr(param.getInternalAddr());
        taskRecordPageDto.setStatus(param.getStatus());
        taskRecordPageDto.setCurrent(param.getCurrent());
        taskRecordPageDto.setSize(param.getSize());
        Page<TaskRecordPageVo> page = iMcUpdateDeviceTaskRecordService.taskRecordPage(taskRecordPageDto);
        Page<TaskRecordPageResult> page1 = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        if(page.getRecords() !=null && !page.getRecords().isEmpty()){
            List<TaskRecordPageResult> results = new ArrayList<>();
            for (TaskRecordPageVo taskRecordPageVo: page.getRecords()){
                results.add(taskRecordPageVoToResult(taskRecordPageVo));
            }
            page1.setRecords(results);
        }
        return page1;
    }

    private TaskRecordPageResult taskRecordPageVoToResult(TaskRecordPageVo taskRecordPageVo){
        TaskRecordPageResult taskRecordPageResult = new TaskRecordPageResult();
        taskRecordPageResult.setId(taskRecordPageVo.getId());
        taskRecordPageResult.setMcUpdateDeviceSubtaskType(taskRecordPageVo.getMcUpdateDeviceSubtaskType());
        taskRecordPageResult.setType(taskRecordPageVo.getType());
        taskRecordPageResult.setDeviceId(taskRecordPageVo.getDeviceId());
        taskRecordPageResult.setExternalAddr(taskRecordPageVo.getExternalAddr());
        taskRecordPageResult.setInternalAddr(taskRecordPageVo.getInternalAddr());
        taskRecordPageResult.setInstanceId(taskRecordPageVo.getInstanceId());
        taskRecordPageResult.setExecuteMsg(taskRecordPageVo.getExecuteMsg());
        taskRecordPageResult.setTaskStartTime(taskRecordPageVo.getTaskStartTime());
        taskRecordPageResult.setWaitOverStartDate(taskRecordPageVo.getWaitOverStartDate());
        taskRecordPageResult.setStartTime(taskRecordPageVo.getStartTime());
        taskRecordPageResult.setStatus(taskRecordPageVo.getStatus());
        taskRecordPageResult.setCreateTime(taskRecordPageVo.getCreateTime());
        taskRecordPageResult.setLastUpdateTime(taskRecordPageVo.getLastUpdateTime());
        return taskRecordPageResult;
    }

    @Override
    public List<TaskRecordSubtaskResult> taskRecordSubtask(Long mcUpdateDeviceTaskRecordId) {
        List<TaskRecordSubtaskResult> results = new ArrayList<>();
        List<McUpdateDeviceSubtaskRecord> mcUpdateDeviceSubtaskRecords = iMcUpdateDeviceSubtaskRecordService.select(e -> e.fkMcUpdateDeviceTaskRecordIdEq(mcUpdateDeviceTaskRecordId).statusEq(50));
        if(mcUpdateDeviceSubtaskRecords == null || mcUpdateDeviceSubtaskRecords.isEmpty()){
            return results;
        }
        mcUpdateDeviceSubtaskRecords.forEach(e->{
            results.add(mcUpdateDeviceSubtaskRecordToResult(e));
        });
        return results;
    }

    private TaskRecordSubtaskResult mcUpdateDeviceSubtaskRecordToResult(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord){
        TaskRecordSubtaskResult taskRecordSubtaskResult = new TaskRecordSubtaskResult();
        taskRecordSubtaskResult.setId(mcUpdateDeviceSubtaskRecord.getId());
        taskRecordSubtaskResult.setFkMcUpdateDeviceTaskRecordId(mcUpdateDeviceSubtaskRecord.getFkMcUpdateDeviceTaskRecordId());
        taskRecordSubtaskResult.setFkMcUpdateDeviceSubtaskId(mcUpdateDeviceSubtaskRecord.getFkMcUpdateDeviceSubtaskId());
        taskRecordSubtaskResult.setType(mcUpdateDeviceSubtaskRecord.getType());
        taskRecordSubtaskResult.setExecutionFlow(mcUpdateDeviceSubtaskRecord.getExecutionFlow());
        taskRecordSubtaskResult.setStatus(mcUpdateDeviceSubtaskRecord.getStatus());
        taskRecordSubtaskResult.setCreateTime(mcUpdateDeviceSubtaskRecord.getCreateTime());
        taskRecordSubtaskResult.setLastUpdateTime(mcUpdateDeviceSubtaskRecord.getLastUpdateTime());
        return taskRecordSubtaskResult;
    }

    @Override
    public List<McUpdateDeviceTaskListResult> list(McUpdateDeviceTaskListParam param) {
        List<McUpdateDeviceTaskListResult> mcUpdateDeviceTaskListResults = new ArrayList<>();
        List<McUpdateDeviceTask> mcUpdateDeviceTasks = iMcUpdateDeviceTaskService.select(e -> e.nameLike(param.getName()).statusEq(50));
        if(mcUpdateDeviceTasks != null && !mcUpdateDeviceTasks.isEmpty()){
            mcUpdateDeviceTasks.forEach(e->mcUpdateDeviceTaskListResults.add(mcUpdateDeviceTaskToListResult(e)));
        }
        return mcUpdateDeviceTaskListResults;
    }

    @Override
    public List<BatchTaskResult> batchStopTask(BatchStopTaskParam param) {
        McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord = new McUpdateDeviceTaskRecord();
        mcUpdateDeviceTaskRecord.setStatus(McUpdateDeviceTaskRecordStatusEnum.STOP_TASK.getValue());
        List<BatchTaskResult> batchTaskResults = new ArrayList<>();
        for (Long id : param.getIds()) {
            mcUpdateDeviceTaskRecord.setId(id);
            mcUpdateDeviceTaskRecord.setLastUpdateTime(SystemClock.date());
            boolean b = iMcUpdateDeviceTaskRecordService.updateById(mcUpdateDeviceTaskRecord);
            if (!b) {
                McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord1 = iMcUpdateDeviceTaskRecordService.selectOne(f -> f.idEq(id));
                if(mcUpdateDeviceTaskRecord1 != null) {
                    BatchTaskResult batchTaskResult = new BatchTaskResult();
                    batchTaskResult.setDeviceId(mcUpdateDeviceTaskRecord1.getDeviceId());
                    batchTaskResult.setInstanceId(mcUpdateDeviceTaskRecord1.getInstanceId());
                    batchTaskResult.setFailureMessage("修改任务状态失败！");
                    batchTaskResults.add(batchTaskResult);
                }
            }
        }
        return batchTaskResults;
    }

    @Override
    public List<BatchTaskResult> batchStartTask(BatchStartTaskParam param) {
        McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord = new McUpdateDeviceTaskRecord();
        mcUpdateDeviceTaskRecord.setStatus(McUpdateDeviceTaskRecordStatusEnum.PENDING_EXECUTION.getValue());
        List<BatchTaskResult> batchTaskResults = new ArrayList<>();
        param.getIds().forEach(e->{
            mcUpdateDeviceTaskRecord.setId(e);
            mcUpdateDeviceTaskRecord.setLastUpdateTime(SystemClock.date());
            boolean b = iMcUpdateDeviceTaskRecordService.updateById(mcUpdateDeviceTaskRecord);
            if(!b){
                McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord1 = iMcUpdateDeviceTaskRecordService.selectOne(f -> f.idEq(e));
                if(mcUpdateDeviceTaskRecord1 != null) {
                    BatchTaskResult batchTaskResult = new BatchTaskResult();
                    batchTaskResult.setDeviceId(mcUpdateDeviceTaskRecord1.getDeviceId());
                    batchTaskResult.setInstanceId(mcUpdateDeviceTaskRecord1.getInstanceId());
                    batchTaskResult.setFailureMessage("修改任务状态失败！");
                    batchTaskResults.add(batchTaskResult);
                }
            }
        });
        return batchTaskResults;
    }

    @Override
    public List<BatchTaskResult> batchAddTask(BatchAddTaskParam param) {
        McUpdateDeviceTask mcUpdateDeviceTask = iMcUpdateDeviceTaskService.selectOne(e -> e.idEq(param.getMcUpdateDeviceTaskId()).statusEq(StatusEnum.NORMAL.getValue()));
        if(mcUpdateDeviceTask == null){
            throw new BizException("主任务不存在！");
        }
        McServiceSoftwarePackage mcServiceSoftwarePackage = iMcServiceSoftwarePackageService.selectOne(e -> e.idEq(mcUpdateDeviceTask.getFkMcServerSoftwarePackageId()).statusEq(StatusEnum.NORMAL.getValue()));
        if(mcServiceSoftwarePackage == null){
            throw new BizException("云机端软件包不存在！");
        }
        List<BatchTaskResult> batchAddTaskResults = new ArrayList<>();
        Date convertStartTime = mcUpdateDeviceTask.getStartTime();
        if(StrUtil.isNotBlank(param.getStartTime())){
            convertStartTime = DateUtil.parseDateTime(param.getStartTime());
        }
        Date startTime = convertStartTime;
        param.getMcMachineIds().forEach(e->{
            VizMcMachine mcMachine = iVizMcMachineService.selectOne(f -> f.idEq(e).statusEq(McMachineStatusEnum.NORMAL.getValue()));
            BatchTaskResult batchAddTaskResult = new BatchTaskResult();
            batchAddTaskResult.setDeviceId(mcMachine.getDeviceId());
            batchAddTaskResult.setInstanceId(mcMachine.getInstanceId());
            Integer supplierType = iCloudDeviceOptApi.getDeviceSupplierType(mcMachine.getDeviceId()).getData();
            if(!mcServiceSoftwarePackage.getSupplierType().equals(supplierType)){
                batchAddTaskResult.setFailureMessage("当前设备与该任务不是同一供应商！");
                batchAddTaskResults.add(batchAddTaskResult);
                return;
            }
            McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord1 = iMcUpdateDeviceTaskRecordService.selectOne(f -> f.fkMcUpdateDeviceTaskIdEq(mcUpdateDeviceTask.getId()).instanceIdEq(mcMachine.getInstanceId()));
            if(mcUpdateDeviceTaskRecord1 != null){
                batchAddTaskResult.setFailureMessage("当前设备已经存在该任务中！");
                batchAddTaskResults.add(batchAddTaskResult);
                return;
            }
            McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord = new McUpdateDeviceTaskRecord();
            mcUpdateDeviceTaskRecord.setFkMcUpdateDeviceTaskId(mcUpdateDeviceTask.getId());
            mcUpdateDeviceTaskRecord.setFkMcServerSoftwarePackageId(mcUpdateDeviceTask.getFkMcServerSoftwarePackageId());
            mcUpdateDeviceTaskRecord.setType(McUpdateDeviceTaskRecordTypeEnum.SYSTEM_TASK.getValue());
            mcUpdateDeviceTaskRecord.setDeviceId(mcMachine.getDeviceId());
            mcUpdateDeviceTaskRecord.setInstanceId(mcMachine.getInstanceId());
            if(mcUpdateDeviceTask.getWaitStartOverTime() != null && mcUpdateDeviceTask.getWaitStartOverTime() >= 0){
                mcUpdateDeviceTaskRecord.setWaitOverStartDate(DateUtil.offsetHour(SystemClock.date(), mcUpdateDeviceTask.getWaitStartOverTime()));
            }
            mcUpdateDeviceTaskRecord.setStartTime(startTime);
            mcUpdateDeviceTaskRecord.setStatus(McUpdateDeviceTaskRecordStatusEnum.PENDING_EXECUTION.getValue());
            mcUpdateDeviceTaskRecord.setCreateTime(SystemClock.date());
            mcUpdateDeviceTaskRecord.setVersionId(0L);
            boolean save = iMcUpdateDeviceTaskRecordService.save(mcUpdateDeviceTaskRecord);
            if(!save){
                batchAddTaskResult.setFailureMessage("保存失败");
                batchAddTaskResults.add(batchAddTaskResult);
            }
        });
        return batchAddTaskResults;
    }

    private McUpdateDeviceTaskListResult mcUpdateDeviceTaskToListResult(McUpdateDeviceTask mcUpdateDeviceTask){
        McUpdateDeviceTaskListResult mcUpdateDeviceTaskListResult = new McUpdateDeviceTaskListResult();
        mcUpdateDeviceTaskListResult.setId(mcUpdateDeviceTask.getId());
        mcUpdateDeviceTaskListResult.setFkMcServerSoftwarePackageId(mcUpdateDeviceTask.getFkMcServerSoftwarePackageId());
        mcUpdateDeviceTaskListResult.setName(mcUpdateDeviceTask.getName());
        mcUpdateDeviceTaskListResult.setStartTime(mcUpdateDeviceTask.getStartTime());
        mcUpdateDeviceTaskListResult.setOvertimeTime(mcUpdateDeviceTask.getOvertimeTime());
        mcUpdateDeviceTaskListResult.setWaitStartOverTime(mcUpdateDeviceTask.getWaitStartOverTime());
        mcUpdateDeviceTaskListResult.setCreateTime(mcUpdateDeviceTask.getCreateTime());
        mcUpdateDeviceTaskListResult.setLastUpdateTime(mcUpdateDeviceTask.getLastUpdateTime());
        return mcUpdateDeviceTaskListResult;
    }

    @Override
    public Boolean changeMainTaskExecutionStatus(Long mcUpdateDeviceTaskRecordId, Integer status) {
        McUpdateDeviceTaskRecord up = new McUpdateDeviceTaskRecord();
        up.setId(mcUpdateDeviceTaskRecordId);
        up.setStatus(status);
        up.setLastUpdateTime(SystemClock.date());
        return iMcUpdateDeviceTaskRecordService.updateById(up);
    }

    @Override
    public Boolean notifiesTheServiceTaskExecutionStatus(Long fkMcUpdateDeviceTaskRecordId, SubtaskCompletionNotificationEnum subtaskCompletionNotificationEnum) {
        McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord = new McUpdateDeviceSubtaskRecord();
        mcUpdateDeviceSubtaskRecord.setFkMcUpdateDeviceTaskRecordId(fkMcUpdateDeviceTaskRecordId);
        return notifiesTheServiceTaskExecutionStatus(mcUpdateDeviceSubtaskRecord, subtaskCompletionNotificationEnum);
    }

    @Override
    public Boolean notifiesTheServiceTaskExecutionStatus(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord, SubtaskCompletionNotificationEnum subtaskCompletionNotificationEnum){
        SubtaskCompletionNotification subtaskCompletionNotification = new SubtaskCompletionNotification();
        subtaskCompletionNotification.setFkMcUpdateDeviceSubtaskId(mcUpdateDeviceSubtaskRecord.getFkMcUpdateDeviceSubtaskId());
        subtaskCompletionNotification.setFkMcUpdateDeviceTaskRecordId(mcUpdateDeviceSubtaskRecord.getFkMcUpdateDeviceTaskRecordId());
        subtaskCompletionNotification.setExecutionFlow(mcUpdateDeviceSubtaskRecord.getExecutionFlow());
        subtaskCompletionNotification.setStatus(subtaskCompletionNotificationEnum.getValue());
        // 开始发送kafka消息通知主任务开始执行下一个子任务
        KafkaResult kafkaResult = kafkaService.sendKafkaMessage(MqTopicConstant.BackEndApi.SUBTASK_COMPLETION_NOTIFICATION, subtaskCompletionNotification);
        return kafkaResult.isSuccess();
    }


}
