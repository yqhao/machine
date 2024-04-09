package com.suqi.center.machine.biz.viz.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.enums.VizMcDeviceTaskStatusEnum;
import com.suqi.center.common.enums.VizMcTaskStatusEnum;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import com.suqi.center.machine.biz.viz.service.VizMcTaskRestService;
import com.suqi.center.machine.dao.viz.dao.IVizMcDeviceTaskDao;
import com.suqi.center.machine.dao.viz.dao.IVizMcTaskDao;
import com.suqi.center.machine.dao.viz.dao.IVizMcTaskTypeDao;
import com.suqi.center.machine.dao.viz.entity.VizMcDeviceTaskEo;
import com.suqi.center.machine.dao.viz.entity.VizMcTaskEo;
import com.suqi.center.machine.dao.viz.entity.VizMcTaskTypeEo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/10/20 16:04
 */
@Slf4j
@Service
public class VizMcTaskRestServiceImpl implements VizMcTaskRestService {

    @Resource
    IVizMcTaskTypeDao iVizMcTaskTypeDao;

    @Resource
    IVizMcTaskDao iVizMcTaskDao;

    @Resource
    IVizMcDeviceTaskDao iVizMcDeviceTaskDao;

    private VizTaskTypeListResult vizMcTaskTypeEoToListResult(VizMcTaskTypeEo vizMcTaskTypeEo){
        VizTaskTypeListResult vizTaskTypeListResult = new VizTaskTypeListResult();
        vizTaskTypeListResult.setId(vizMcTaskTypeEo.getId());
        vizTaskTypeListResult.setName(vizMcTaskTypeEo.getName());
        return vizTaskTypeListResult;
    }

    @Override
    public List<VizTaskTypeListResult> taskTypeList() {
        List<VizMcTaskTypeEo> list = iVizMcTaskTypeDao.list();
        List<VizTaskTypeListResult> vizTaskTypeListResults = new ArrayList<>();
        if(list != null && !list.isEmpty()){
            list.forEach(e->vizTaskTypeListResults.add(vizMcTaskTypeEoToListResult(e)));
        }
        return vizTaskTypeListResults;
    }

    private VizMcTaskPageResult vizMcTaskEoToPageResult(VizMcTaskEo vizMcTaskEo) {
        VizMcTaskPageResult vizMcTaskPageResult = new VizMcTaskPageResult();
        vizMcTaskPageResult.setId(vizMcTaskEo.getId());
        vizMcTaskPageResult.setFkVizMcTaskTypeId(vizMcTaskEo.getFkVizMcTaskTypeId());
        vizMcTaskPageResult.setName(vizMcTaskEo.getName());
        vizMcTaskPageResult.setTaskDescription(vizMcTaskEo.getTaskDescription());
        vizMcTaskPageResult.setCommand(vizMcTaskEo.getCommand());
        vizMcTaskPageResult.setStatus(vizMcTaskEo.getStatus());
        vizMcTaskPageResult.setFkExtendId(vizMcTaskEo.getFkExtendId());
        vizMcTaskPageResult.setOperateSysUserId(vizMcTaskEo.getOperateSysUserId());
        vizMcTaskPageResult.setCreateTime(vizMcTaskEo.getCreateTime());
        vizMcTaskPageResult.setLastUpdateTime(vizMcTaskEo.getLastUpdateTime());
        return vizMcTaskPageResult;
    }

    @Override
    public Page<VizMcTaskPageResult> page(VizMcTaskPageParam param) {
        Page<VizMcTaskEo> page = new Page<>(param.getPageNo(), param.getPageSize());
        page = iVizMcTaskDao.page(page, e -> e.idEq(param.getId()).fkTenantIdEq(param.getFkTenantId()).statusEq(param.getStatus()).fkExtendIdEq(param.getFkExtendId()).fkVizMcTaskTypeIdEq(param.getFkVizMcTaskTypeId()).nameLike(param.getName()));
        Page<VizMcTaskPageResult> page1 = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        if(page.getRecords() !=null && !page.getRecords().isEmpty()){
            List<VizMcTaskPageResult> results = new ArrayList<>();
            for (VizMcTaskEo vizMcTaskEo: page.getRecords()){
                results.add(vizMcTaskEoToPageResult(vizMcTaskEo));
            }
            page1.setRecords(results);
        }
        return page1;
    }

    @Override
    public VizMcTaskSaveResult save(VizMcTaskSaveParam param) {
        VizMcTaskEo vizMcTaskEo = new VizMcTaskEo();
        vizMcTaskEo.setFkTenantId(param.getFkTenantId());
        vizMcTaskEo.setFkVizMcTaskTypeId(param.getFkVizMcTaskTypeId());
        vizMcTaskEo.setName(param.getName());
        vizMcTaskEo.setTaskDescription(param.getTaskDescription());
        vizMcTaskEo.setCommand(param.getCommand());
        vizMcTaskEo.setFkExtendId(param.getFkExtendId());
        vizMcTaskEo.setStatus(0);
        vizMcTaskEo.setOperateSysUserId(param.getOperateSysUserId());
        vizMcTaskEo.setVersionId(0L);
        vizMcTaskEo.setCreateTime(SystemClock.date());
        boolean save = iVizMcTaskDao.save(vizMcTaskEo);
        VizMcTaskSaveResult vizMcTaskSaveResult = new VizMcTaskSaveResult();
        vizMcTaskSaveResult.setId(vizMcTaskEo.getId());
        vizMcTaskSaveResult.setStatus(save);
        return vizMcTaskSaveResult;
    }

    @Override
    public Boolean update(VizMcTaskUpdateParam param) {
        VizMcTaskEo vizMcTaskEo = iVizMcTaskDao.selectOne(e -> e.idEq(param.getTaskId()));
        if(vizMcTaskEo == null){
            ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
        }
        VizMcTaskEo up = new VizMcTaskEo();
        up.setId(vizMcTaskEo.getId());
        up.setName(vizMcTaskEo.getName());
        up.setTaskDescription(vizMcTaskEo.getTaskDescription());
        up.setOperateSysUserId(param.getOperateSysUserId());
        up.setVersionId(vizMcTaskEo.getVersionId()+ 1);
        up.setLastUpdateTime(SystemClock.date());
        return iVizMcTaskDao.updateById(up);
    }

    @Override
    public Boolean saveMachine(VizDeviceTaskSaveParam param) {
        List<VizMcDeviceTaskEo> vizMcDeviceTaskEos = new ArrayList<>();

        param.getDeviceTaskSaveParamList().forEach(e->{
            if(e.getFkMcMachineId() == null
                    || e.getInstanceId() == null
                    || e.getDeviceId() == null ){
                log.error("添加机器任务失败参数错误：{}", e);
                return;
            }
            VizMcDeviceTaskEo vizMcDeviceTaskEo = new VizMcDeviceTaskEo();
            vizMcDeviceTaskEo.setFkVizMcTaskId(param.getFkVizMcTaskId());
            vizMcDeviceTaskEo.setFkMcMachineId(e.getFkMcMachineId());
            vizMcDeviceTaskEo.setInstanceId(e.getInstanceId());
            vizMcDeviceTaskEo.setDeviceId(e.getDeviceId());
            vizMcDeviceTaskEo.setStatus(0);
            vizMcDeviceTaskEo.setOperateSysUserId(param.getOperateSysUserId());
            vizMcDeviceTaskEo.setVersionId(0L);
            vizMcDeviceTaskEo.setCreateTime(SystemClock.date());
            vizMcDeviceTaskEos.add(vizMcDeviceTaskEo);
        });
        boolean b = iVizMcDeviceTaskDao.saveBatch(vizMcDeviceTaskEos);
        if(b){
            VizMcTaskEo vizMcTaskEo = iVizMcTaskDao.selectOne(e -> e.idEq(param.getFkVizMcTaskId()));
            if(VizMcTaskStatusEnum.FAIL.getValue().equals(vizMcTaskEo.getStatus()) || VizMcTaskStatusEnum.SUCCESSFUL.getValue().equals(vizMcTaskEo.getStatus())){
                VizMcTaskEo up = new VizMcTaskEo();
                up.setStatus(0);
                up.setVersionId(vizMcTaskEo.getVersionId()+1);
                up.setLastUpdateTime(SystemClock.date());
                return iVizMcTaskDao.update(up, e->e.idEq(vizMcTaskEo.getId()).versionIdEq(vizMcTaskEo.getVersionId()));
            }
        }
        return b;
    }

    @Override
    public Boolean retryMachine(VizDeviceTaskRetryParam param) {
        List<VizMcDeviceTaskEo> vizMcDeviceTaskEos = iVizMcDeviceTaskDao.select(e -> e.idIn(param.getDeviceTaskIds()).fkVizMcTaskIdEq(param.getFkVizMcTaskId()));
        if(vizMcDeviceTaskEos == null || vizMcDeviceTaskEos.isEmpty()){
            ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
        }
        boolean update = false;
        for (VizMcDeviceTaskEo vizMcDeviceTaskEo : vizMcDeviceTaskEos) {
            if (vizMcDeviceTaskEo.getStatus() == 0) {
                throw new BizException(ExceptionCode.BUSINESS_ERROR.getCode(), "当前任务未执行或在执行中不允许重试！");
            }
            LambdaUpdateWrapper<VizMcDeviceTaskEo> updateWrapper = new LambdaUpdateWrapper<>();
            updateWrapper.eq(VizMcDeviceTaskEo::getId, vizMcDeviceTaskEo.getId())
                    .eq(VizMcDeviceTaskEo::getFkVizMcTaskId, vizMcDeviceTaskEo.getFkVizMcTaskId())
                    .eq(VizMcDeviceTaskEo::getVersionId, vizMcDeviceTaskEo.getVersionId());
            updateWrapper.set(VizMcDeviceTaskEo::getStatus, 0)
                    .set(VizMcDeviceTaskEo::getJobId, "")
                    .set(VizMcDeviceTaskEo::getBeginTime, null)
                    .set(VizMcDeviceTaskEo::getEndTime, null)
                    .set(VizMcDeviceTaskEo::getOperateSysUserId, param.getOperateSysUserId())
                    .set(VizMcDeviceTaskEo::getVersionId, vizMcDeviceTaskEo.getVersionId() + 1)
                    .set(VizMcDeviceTaskEo::getLastUpdateTime, SystemClock.date());
            boolean isOk = iVizMcDeviceTaskDao.update(updateWrapper);
            if(!update){
                update = isOk;
            }
        }
        if(update){
            VizMcTaskEo vizMcTaskEo = iVizMcTaskDao.selectOne(e -> e.idEq(param.getFkVizMcTaskId()));
            if(VizMcTaskStatusEnum.FAIL.getValue().equals(vizMcTaskEo.getStatus()) || VizMcTaskStatusEnum.SUCCESSFUL.getValue().equals(vizMcTaskEo.getStatus())){
                VizMcTaskEo up = new VizMcTaskEo();
                up.setStatus(0);
                up.setVersionId(vizMcTaskEo.getVersionId()+1);
                up.setLastUpdateTime(SystemClock.date());
                return iVizMcTaskDao.update(up, e->e.idEq(vizMcTaskEo.getId()).versionIdEq(vizMcTaskEo.getVersionId()));
            }
        }
        return update;
    }

    private VizMcMachineTaskPageResult vizMcDeviceTaskEoToPageResult(VizMcDeviceTaskEo vizMcDeviceTaskEo){
        VizMcMachineTaskPageResult vizMcMachineTaskPageResult = new VizMcMachineTaskPageResult();
        vizMcMachineTaskPageResult.setId(vizMcDeviceTaskEo.getId());
        vizMcMachineTaskPageResult.setFkVizMcTaskId(vizMcDeviceTaskEo.getFkVizMcTaskId());
        vizMcMachineTaskPageResult.setFkMcMachineId(vizMcDeviceTaskEo.getFkMcMachineId());
        vizMcMachineTaskPageResult.setInstanceId(vizMcDeviceTaskEo.getInstanceId());
        vizMcMachineTaskPageResult.setDeviceId(vizMcDeviceTaskEo.getDeviceId());
        vizMcMachineTaskPageResult.setExecuteMsg(vizMcDeviceTaskEo.getExecuteMsg());
        vizMcMachineTaskPageResult.setJobId(vizMcDeviceTaskEo.getJobId());
        vizMcMachineTaskPageResult.setBeginTime(vizMcDeviceTaskEo.getBeginTime());
        vizMcMachineTaskPageResult.setEndTime(vizMcDeviceTaskEo.getEndTime());
        vizMcMachineTaskPageResult.setStatus(vizMcDeviceTaskEo.getStatus());
        return vizMcMachineTaskPageResult;
    }

    @Override
    public Page<VizMcMachineTaskPageResult> pageMachine(VizMcMachineTaskPageParam param) {
        Page<VizMcDeviceTaskEo> page = new Page<>(param.getPageNo(), param.getPageSize());
        page = iVizMcDeviceTaskDao.page(page, e -> e.fkVizMcTaskIdEq(param.getFkVizMcTaskId()).statusEq(param.getStatus()).instanceIdEq(param.getInstanceId()).deviceIdEq(param.getDeviceId()));
        Page<VizMcMachineTaskPageResult> page1 = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        if(page.getRecords() !=null && !page.getRecords().isEmpty()){
            List<VizMcMachineTaskPageResult> results = new ArrayList<>();
            for (VizMcDeviceTaskEo vizMcDeviceTaskEo: page.getRecords()){
                results.add(vizMcDeviceTaskEoToPageResult(vizMcDeviceTaskEo));
            }
            page1.setRecords(results);
        }
        return page1;
    }

    private VizMcTaskSchedulePageResult vizMcTaskEoToSchedulePageResult(VizMcTaskEo vizMcTaskEo){
        VizMcTaskSchedulePageResult vizMcTaskSchedulePageResult = new VizMcTaskSchedulePageResult();
        vizMcTaskSchedulePageResult.setId(vizMcTaskEo.getId());
        vizMcTaskSchedulePageResult.setFkTenantId(vizMcTaskEo.getFkTenantId());
        vizMcTaskSchedulePageResult.setFkVizMcTaskTypeId(vizMcTaskEo.getFkVizMcTaskTypeId());
        vizMcTaskSchedulePageResult.setName(vizMcTaskEo.getName());
        vizMcTaskSchedulePageResult.setTaskDescription(vizMcTaskEo.getTaskDescription());
        vizMcTaskSchedulePageResult.setCommand(vizMcTaskEo.getCommand());
        vizMcTaskSchedulePageResult.setFkExtendId(vizMcTaskEo.getFkExtendId());
        vizMcTaskSchedulePageResult.setStatus(vizMcTaskEo.getStatus());
        vizMcTaskSchedulePageResult.setOperateSysUserId(vizMcTaskEo.getOperateSysUserId());
        vizMcTaskSchedulePageResult.setVersionId(vizMcTaskEo.getVersionId());
        vizMcTaskSchedulePageResult.setCreateTime(vizMcTaskEo.getCreateTime());
        vizMcTaskSchedulePageResult.setLastUpdateTime(vizMcTaskEo.getLastUpdateTime());
        return vizMcTaskSchedulePageResult;
    }

    @Override
    public Page<VizMcTaskSchedulePageResult> schedulePage(VizMcTaskSchedulePageParam param) {
        Page<VizMcTaskEo> page = new Page<>(param.getPageNo(), param.getPageSize());
        page = iVizMcTaskDao.page(page, e -> e.statusIn(param.getStatus()));
        Page<VizMcTaskSchedulePageResult> page1 = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        if(page.getRecords() !=null && !page.getRecords().isEmpty()){
            List<VizMcTaskSchedulePageResult> results = new ArrayList<>();
            for (VizMcTaskEo vizMcTaskEo: page.getRecords()){
                results.add(vizMcTaskEoToSchedulePageResult(vizMcTaskEo));
            }
            page1.setRecords(results);
        }
        return page1;
    }

    private VizMcTaskSchedulePageMachineResult vizMcDeviceTaskEoToSchedulePageResult(VizMcDeviceTaskEo vizMcDeviceTaskEo){
        VizMcTaskSchedulePageMachineResult vizMcTaskSchedulePageMachineResult = new VizMcTaskSchedulePageMachineResult();
        vizMcTaskSchedulePageMachineResult.setId(vizMcDeviceTaskEo.getId());
        vizMcTaskSchedulePageMachineResult.setFkVizMcTaskId(vizMcDeviceTaskEo.getFkVizMcTaskId());
        vizMcTaskSchedulePageMachineResult.setFkMcMachineId(vizMcDeviceTaskEo.getFkMcMachineId());
        vizMcTaskSchedulePageMachineResult.setInstanceId(vizMcDeviceTaskEo.getInstanceId());
        vizMcTaskSchedulePageMachineResult.setDeviceId(vizMcDeviceTaskEo.getDeviceId());
        vizMcTaskSchedulePageMachineResult.setExecuteMsg(vizMcDeviceTaskEo.getExecuteMsg());
        vizMcTaskSchedulePageMachineResult.setJobId(vizMcDeviceTaskEo.getJobId());
        vizMcTaskSchedulePageMachineResult.setBeginTime(vizMcDeviceTaskEo.getBeginTime());
        vizMcTaskSchedulePageMachineResult.setEndTime(vizMcDeviceTaskEo.getEndTime());
        vizMcTaskSchedulePageMachineResult.setStatus(vizMcDeviceTaskEo.getStatus());
        vizMcTaskSchedulePageMachineResult.setOperateSysUserId(vizMcDeviceTaskEo.getOperateSysUserId());
        vizMcTaskSchedulePageMachineResult.setVersionId(vizMcDeviceTaskEo.getVersionId());
        vizMcTaskSchedulePageMachineResult.setCreateTime(vizMcDeviceTaskEo.getCreateTime());
        vizMcTaskSchedulePageMachineResult.setLastUpdateTime(vizMcDeviceTaskEo.getLastUpdateTime());
        return vizMcTaskSchedulePageMachineResult;
    }

    @Override
    public Page<VizMcTaskSchedulePageMachineResult> schedulePageMachine(VizMcTaskSchedulePageMachineParam param) {
        Page<VizMcDeviceTaskEo> page = new Page<>(param.getPageNo(), param.getPageSize());
        page = iVizMcDeviceTaskDao.page(page, e -> e.fkVizMcTaskIdEq(param.getVizMcTaskId()).statusIn(param.getStatus()));
        Page<VizMcTaskSchedulePageMachineResult> page1 = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        if(page.getRecords() !=null && !page.getRecords().isEmpty()){
            List<VizMcTaskSchedulePageMachineResult> results = new ArrayList<>();
            for (VizMcDeviceTaskEo vizMcDeviceTaskEo: page.getRecords()){
                results.add(vizMcDeviceTaskEoToSchedulePageResult(vizMcDeviceTaskEo));
            }
            page1.setRecords(results);
        }
        return page1;
    }

    @Override
    public Boolean scheduleUpdate(VizMcTaskScheduleUpdateParam param) {
        VizMcTaskEo vizMcTaskEo = iVizMcTaskDao.selectOne(e -> e.idEq(param.getId()));
        if(vizMcTaskEo == null){
            ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
        }
        VizMcTaskEo up = new VizMcTaskEo();
        up.setStatus(param.getStatus());
        up.setVersionId(vizMcTaskEo.getVersionId() + 1);
        up.setLastUpdateTime(SystemClock.date());
        return iVizMcTaskDao.update(up, e->e.idEq(vizMcTaskEo.getId()).versionIdEq(vizMcTaskEo.getVersionId()));
    }

    @Override
    public Boolean scheduleUpdateMachine(VizMcTaskScheduleUpdateMachineParam param) {
        VizMcDeviceTaskEo mcDeviceTaskEo = iVizMcDeviceTaskDao.selectOne(e -> e.idEq(param.getId()).fkVizMcTaskIdEq(param.getVizMcTaskId()));
        if(mcDeviceTaskEo == null){
            ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
        }
        VizMcDeviceTaskEo up = new VizMcDeviceTaskEo();
        up.setExecuteMsg(param.getExecuteMsg());
        up.setJobId(param.getJobId());
        up.setBeginTime(param.getBeginTime());
        up.setEndTime(param.getEndTime());
        up.setStatus(param.getStatus());
        up.setVersionId(mcDeviceTaskEo.getVersionId()+ 1);
        up.setLastUpdateTime(SystemClock.date());
        return iVizMcDeviceTaskDao.update(up, e -> e.idEq(mcDeviceTaskEo.getId()).fkVizMcTaskIdEq(mcDeviceTaskEo.getFkVizMcTaskId()).versionIdEq(mcDeviceTaskEo.getVersionId()));
    }

    @Override
    public VizMcTaskSchedulePageResult scheduleGetTask(VizMcTaskScheduleGetTaskParam param) {
        VizMcTaskEo vizMcTaskEo = iVizMcTaskDao.selectOne(e -> e.idEq(param.getId()));
        if(vizMcTaskEo == null){
            return null;
        }
        return vizMcTaskEoToSchedulePageResult(vizMcTaskEo);
    }

    @Override
    public VizMcTaskSchedulePageMachineResult scheduleGetTaskMachine(VizMcTaskScheduleGetTaskParam param) {
        VizMcDeviceTaskEo vizMcDeviceTaskEo = iVizMcDeviceTaskDao.selectOne(e -> e.idEq(param.getId()).fkVizMcTaskIdEq(param.getVizMcTaskId()));
        if(vizMcDeviceTaskEo == null){
            return null;
        }
        return vizMcDeviceTaskEoToSchedulePageResult(vizMcDeviceTaskEo);
    }

    @Override
    public Boolean scheduleCheckMachineIncomplete(VizMcTaskScheduleIncompleteParam param) {
        long count = iVizMcDeviceTaskDao.count(e -> e.fkVizMcTaskIdEq(param.getVizMcTaskId()).statusIn(Arrays.asList(VizMcDeviceTaskStatusEnum.WAITING.getValue(), VizMcDeviceTaskStatusEnum.IN_OPERATION.getValue())));
        return count > 0;
    }
}
