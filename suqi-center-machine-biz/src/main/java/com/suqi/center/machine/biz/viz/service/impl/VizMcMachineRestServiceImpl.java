package com.suqi.center.machine.biz.viz.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Lists;
import com.suqi.center.common.constant.RedissonLockKeyConstants;
import com.suqi.center.common.enums.TnMachineSaleStatusEnum;
import com.suqi.center.common.enums.VizMcAssignTaskEnum;
import com.suqi.center.common.enums.VizMcRecycleTaskEnum;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.common.utils.*;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import com.suqi.center.machine.biz.viz.common.BuilderConvert;
import com.suqi.center.machine.biz.viz.service.VizMcMachineRestService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.dao.IVizMcMachineAssignTaskDao;
import com.suqi.center.machine.dao.viz.dao.IVizMcMachineRecycleTaskDao;
import com.suqi.center.machine.dao.viz.dto.MachinePageDto;
import com.suqi.center.machine.dao.viz.entity.*;
import com.suqi.center.machine.dao.viz.service.IVizMcMachineService;
import com.suqi.center.machine.dao.viz.service.IVizMcMachineStatusService;
import com.suqi.center.machine.dao.viz.service.IVizMcMachineStreamsService;
import com.suqi.center.machine.dao.viz.vo.MachinePageVo;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineQueryWrapper;
import com.suqi.core.kafka.KafkaService;
import com.suqi.core.lock.RedissonLock;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.function.Consumer;

/**
 * @version 1.0
 * @date 2023/8/21 15:44
 */
@Service
@Slf4j
public class VizMcMachineRestServiceImpl implements VizMcMachineRestService {

    @Resource
    private IVizMcMachineService iVizMcMachineService;
    @Resource
    private IVizMcMachineAssignTaskDao vizMcMachineAssignTaskDao;
    @Resource
    private IVizMcMachineRecycleTaskDao vizMcMachineRecycleTaskDao;
    @Resource
    private IVizMcMachineStatusService iVizMcMachineStatusService;
    @Resource
    private KafkaService kafkaService;

    @Resource
    RedissonLock redissonLock;

    @Autowired
    IVizMcMachineStreamsService iVizMcMachineStreamsService;

    @Value("${mc.update.batch.num:1000}")
    private Integer updateBatchNum;

    @Value("${mc.handle.task.partition:0}")
    private Integer taskPartitionNums;

    @Value("${spring.profiles.active:}")
    private String env;

    @Override
    @DS(DBConstants.SHARDING)
    public Page<MachinePageResult> page(MachinePageParam param) {
        MachinePageDto machinePageDto = machinePageParamToDto(param);
        Page<MachinePageVo> page = iVizMcMachineService.pageList(machinePageDto);
        Page<MachinePageResult> page1 = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        if (page.getRecords() != null && !page.getRecords().isEmpty()) {
            List<MachinePageResult> results = new ArrayList<>();
            for (MachinePageVo machinePageVo : page.getRecords()) {
                results.add(machinePageVoToResult(machinePageVo));
            }
            page1.setRecords(results);
        }
        return page1;
    }

    private MachinePageDto machinePageParamToDto(MachinePageParam param) {
        MachinePageDto machinePageDto = new MachinePageDto();
        machinePageDto.setTenantId(param.getTenantId());
        machinePageDto.setFkExtCloudRegionId(param.getFkExtCloudRegionId());
        machinePageDto.setExternalAddr(param.getExternalAddr());
        machinePageDto.setInternalAddr(param.getInternalAddr());
        if (StrUtil.isNotBlank(param.getDeviceId())) {
            machinePageDto.setDeviceId("%" + param.getDeviceId() + "%");
        }
        machinePageDto.setInstanceId(param.getInstanceId());
        machinePageDto.setMacAddr(param.getMacAddr());
        machinePageDto.setServiceSoftwarePackageVersion(param.getServiceSoftwarePackageVersion());
        machinePageDto.setChipModel(param.getChipModel());
        machinePageDto.setOsVersion(param.getOsVersion());
        machinePageDto.setSalesStatus(param.getSalesStatus());
        machinePageDto.setSupplierType(param.getSupplierType());
        machinePageDto.setRootAccess(param.getRootAccess());
        machinePageDto.setStatus(param.getStatus());
        machinePageDto.setRunningStatus(param.getRunningStatus());
        machinePageDto.setHealthStatus(param.getHealthStatus());
        machinePageDto.setStreamingStatus(param.getStreamingStatus());
        machinePageDto.setMaintStatus(param.getMaintStatus());
        machinePageDto.setIsReseting(param.getIsReseting());
        machinePageDto.setIsUserSave(param.getIsUserSave());
        machinePageDto.setIsOtaUpgrade(param.getIsOtaUpgrade());
        machinePageDto.setHangUpStatus(param.getHangUpStatus());
        machinePageDto.setRestartStatus(param.getRestartStatus());
        machinePageDto.setPageNo(param.getPageNo());
        machinePageDto.setPageSize(param.getPageSize());
        return machinePageDto;
    }

    private MachinePageResult machinePageVoToResult(MachinePageVo machinePageVo) {
        MachinePageResult machinePageResult = new MachinePageResult();
        machinePageResult.setId(machinePageVo.getId());
        machinePageResult.setFkExtCloudRegionId(machinePageVo.getFkExtCloudRegionId());
        machinePageResult.setExternalAddr(machinePageVo.getExternalAddr());
        machinePageResult.setInternalAddr(machinePageVo.getInternalAddr());
        machinePageResult.setExtCloudRegionName(machinePageVo.getExtCloudRegionName());
        machinePageResult.setDeviceId(machinePageVo.getDeviceId());
        machinePageResult.setInstanceId(machinePageVo.getInstanceId());
        machinePageResult.setMacAddr(machinePageVo.getMacAddr());
        machinePageResult.setServiceSoftwarePackageVersion(machinePageVo.getServiceSoftwarePackageVersion());
        machinePageResult.setChipModel(machinePageVo.getChipModel());
        machinePageResult.setOsVersion(machinePageVo.getOsVersion());
        machinePageResult.setSalesStatus(machinePageVo.getSalesStatus());
        machinePageResult.setLogLevel(machinePageVo.getLogLevel());
        machinePageResult.setLogPkg(machinePageVo.getLogPkg());
        machinePageResult.setSupplierType(machinePageVo.getSupplierType());
        machinePageResult.setRootAccess(machinePageVo.getRootAccess());
        machinePageResult.setStatus(machinePageVo.getStatus());
        machinePageResult.setRunningStatus(machinePageVo.getRunningStatus());
        machinePageResult.setHealthStatus(machinePageVo.getHealthStatus());
        machinePageResult.setStreamingStatus(machinePageVo.getStreamingStatus());
        machinePageResult.setMaintStatus(machinePageVo.getMaintStatus());
        machinePageResult.setIsReseting(machinePageVo.getIsReseting());
        machinePageResult.setIsUserSave(machinePageVo.getIsUserSave());
        machinePageResult.setIsOtaUpgrade(machinePageVo.getIsOtaUpgrade());
        machinePageResult.setHangUpStatus(machinePageVo.getHangUpStatus());
        machinePageResult.setRestartStatus(machinePageVo.getRestartStatus());
        machinePageResult.setCreateTime(machinePageVo.getCreateTime());
        machinePageResult.setLastUpdateTime(machinePageVo.getLastUpdateTime());
        machinePageResult.setSpecificationModel(machinePageVo.getSpecificationModel());
        machinePageResult.setMemoryLimit(machinePageVo.getMemoryLimit());
        return machinePageResult;
    }

    private MachineInfoResult machineToInfoResult(VizMcMachine mcMachine) {
        if (mcMachine == null) {
            return null;
        }
        MachineInfoResult machineInfoResult = new MachineInfoResult();
        machineInfoResult.setId(mcMachine.getId());
        machineInfoResult.setFkExtCloudRegionId(mcMachine.getFkExtCloudRegionId());
        machineInfoResult.setExternalAddr(mcMachine.getExternalAddr());
        machineInfoResult.setInternalAddr(mcMachine.getInternalAddr());
        machineInfoResult.setDeviceId(mcMachine.getDeviceId());
        machineInfoResult.setInstanceId(mcMachine.getInstanceId());
        machineInfoResult.setMacAddr(mcMachine.getMacAddr());
        machineInfoResult.setServiceSoftwarePackageVersion(mcMachine.getServiceSoftwarePackageVersion());
        machineInfoResult.setChipModel(mcMachine.getChipModel());
        machineInfoResult.setOsVersion(mcMachine.getOsVersion());
        machineInfoResult.setSalesStatus(mcMachine.getSalesStatus());
        machineInfoResult.setLogLevel(mcMachine.getLogLevel());
        machineInfoResult.setLogPkg(mcMachine.getLogPkg());
        machineInfoResult.setSupplierType(mcMachine.getSupplierType());
        machineInfoResult.setStatus(mcMachine.getStatus());
        machineInfoResult.setVersionId(mcMachine.getVersionId());
        machineInfoResult.setCreateTime(mcMachine.getCreateTime());
        machineInfoResult.setLastUpdateTime(mcMachine.getLastUpdateTime());
        machineInfoResult.setMemoryLimit(mcMachine.getMemoryLimit());
        machineInfoResult.setSpecificationModel(mcMachine.getSpecificationModel());
        return machineInfoResult;
    }

    @Override
    @DS(DBConstants.SHARDING)
    public MachineInfoResult info(MachineInfoParam param) {
        VizMcMachine mcMachine = iVizMcMachineService.selectOne(e -> e.idEq(param.getId()).deviceIdEq(param.getDeviceId()).instanceIdEq(param.getInstanceId()));
        return machineToInfoResult(mcMachine);
    }

    private MachineStatusInfoResult machineStatusToInfoResult(VizMcMachineStatus mcMachineStatus) {
        if (mcMachineStatus == null) {
            return null;
        }
        MachineStatusInfoResult machineStatusInfoResult = new MachineStatusInfoResult();
        machineStatusInfoResult.setId(mcMachineStatus.getId());
        machineStatusInfoResult.setFkMcMachineId(mcMachineStatus.getFkMcMachineId());
        machineStatusInfoResult.setDeviceId(mcMachineStatus.getDeviceId());
        machineStatusInfoResult.setInstanceId(mcMachineStatus.getInstanceId());
        machineStatusInfoResult.setRunningStatus(mcMachineStatus.getRunningStatus());
        machineStatusInfoResult.setHealthStatus(mcMachineStatus.getHealthStatus());
        machineStatusInfoResult.setStreamingStatus(mcMachineStatus.getStreamingStatus());
        machineStatusInfoResult.setMaintStatus(mcMachineStatus.getMaintStatus());
        machineStatusInfoResult.setIsReseting(mcMachineStatus.getIsReseting());
        machineStatusInfoResult.setIsUserSave(mcMachineStatus.getIsUserSave());
        machineStatusInfoResult.setIsOtaUpgrade(mcMachineStatus.getIsOtaUpgrade());
        machineStatusInfoResult.setHangUpStatus(mcMachineStatus.getHangUpStatus());
        machineStatusInfoResult.setRestartStatus(mcMachineStatus.getRestartStatus());
        machineStatusInfoResult.setRootAccess(mcMachineStatus.getRootAccess());
        machineStatusInfoResult.setVersionId(mcMachineStatus.getVersionId());
        machineStatusInfoResult.setCreateTime(mcMachineStatus.getCreateTime());
        machineStatusInfoResult.setLastUpdateTime(mcMachineStatus.getLastUpdateTime());
        return machineStatusInfoResult;
    }

    @Override
    @DS(DBConstants.SHARDING)
    public MachineStatusInfoResult statusInfo(MachineInfoParam param) {
        VizMcMachineStatus mcMachineStatus = iVizMcMachineStatusService.selectOne(e -> e.idEq(param.getId()).deviceIdEq(param.getDeviceId()).instanceIdEq(param.getInstanceId()));
        return machineStatusToInfoResult(mcMachineStatus);
    }

    private VizMcMachineStatus machineStatusParamToEntity(MachineStatusParam param) {
        VizMcMachineStatus vizMcMachineStatus = new VizMcMachineStatus();
        vizMcMachineStatus.setId(param.getId());
        vizMcMachineStatus.setFkMcMachineId(param.getFkMcMachineId());
        vizMcMachineStatus.setDeviceId(param.getDeviceId());
        vizMcMachineStatus.setInstanceId(param.getInstanceId());
        vizMcMachineStatus.setRunningStatus(param.getRunningStatus());
        vizMcMachineStatus.setHealthStatus(param.getHealthStatus());
        vizMcMachineStatus.setStreamingStatus(param.getStreamingStatus());
        vizMcMachineStatus.setMaintStatus(param.getMaintStatus());
        vizMcMachineStatus.setIsReseting(param.getIsReseting());
        vizMcMachineStatus.setIsUserSave(param.getIsUserSave());
        vizMcMachineStatus.setIsOtaUpgrade(param.getIsOtaUpgrade());
        vizMcMachineStatus.setHangUpStatus(param.getHangUpStatus());
        vizMcMachineStatus.setRestartStatus(param.getRestartStatus());
        vizMcMachineStatus.setRootAccess(param.getRootAccess());
        return vizMcMachineStatus;
    }

    @Override
    public Boolean statusUpdate(MachineStatusParam param) {
        String lockKey = RedissonLockKeyConstants.SAVE_UPDATE_VIZ_MC_MACHINE_STATUS + param.getId();
        try {
            // 加锁
            boolean lock = redissonLock.lock(lockKey, 5, 3);
            AssertUtil.isTrue(lock, "根据自增ID修改机器状态信息#获取锁失败!");
            VizMcMachineStatus mcMachineStatus = iVizMcMachineStatusService.selectOne(e -> e.idEq(param.getId()));
            if (mcMachineStatus == null) {
                ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
            }
            VizMcMachineStatus vizMcMachineStatus = machineStatusParamToEntity(param);
            vizMcMachineStatus.setLastUpdateTime(SystemClock.date());
            vizMcMachineStatus.setVersionId(mcMachineStatus.getVersionId() + 1);
            return iVizMcMachineStatusService.update(vizMcMachineStatus, e -> e.idEq(param.getId()).versionIdEq(mcMachineStatus.getVersionId()));
        } finally {
            // 释放锁
            redissonLock.unlock(lockKey);
        }
    }

    private VizMcMachine machineUpdateParamToEntity(MachineUpdateParam param) {
        VizMcMachine vizMcMachine = new VizMcMachine();
        vizMcMachine.setId(param.getId());
        vizMcMachine.setFkExtCloudRegionId(param.getFkExtCloudRegionId());
        vizMcMachine.setExternalAddr(param.getExternalAddr());
        vizMcMachine.setInternalAddr(param.getInternalAddr());
        vizMcMachine.setDeviceId(param.getDeviceId());
        vizMcMachine.setInstanceId(param.getInstanceId());
        vizMcMachine.setMacAddr(param.getMacAddr());
        vizMcMachine.setServiceSoftwarePackageVersion(param.getServiceSoftwarePackageVersion());
        vizMcMachine.setChipModel(param.getChipModel());
        vizMcMachine.setOsVersion(param.getOsVersion());
        vizMcMachine.setSalesStatus(param.getSalesStatus());
        vizMcMachine.setLogLevel(param.getLogLevel());
        vizMcMachine.setLogPkg(param.getLogPkg());
        vizMcMachine.setSupplierType(param.getSupplierType());
        vizMcMachine.setStatus(param.getStatus());
        return vizMcMachine;
    }

    @Override
    public Boolean update(MachineUpdateParam param) {
        VizMcMachine mcMachine = selectMachineById(param.getId());
        if (mcMachine == null) {
            ExceptionCode.RECORD_DOES_NOT_EXIST.throwBizException();
        }
        VizMcMachine vizMcMachine = machineUpdateParamToEntity(param);
        vizMcMachine.setLastUpdateTime(SystemClock.date());
        vizMcMachine.setVersionId(mcMachine.getVersionId() + 1);
        return iVizMcMachineService.update(vizMcMachine, e -> e.idEq(param.getId()).versionIdEq(mcMachine.getVersionId()));
    }


    /**
     * 根据分配任务更新更新机器的销售状态
     *
     * @param updateReq
     * @return
     */
    @Transactional(rollbackFor = Throwable.class)
    @DS(DBConstants.SHARDING)
    @Override
    public Boolean updateSalesStatusByTaskId(MachineSaleStatusReqDto updateReq) {
        log.info("updateSalesStatusByTaskId request is ==> {}", updateReq);
        if (Objects.isNull(updateReq.getTaskId())) {
            return false;
        }
        List<Long> fkMcMachineIds = Lists.newArrayList(updateReq.getFkMcMachineIds());
        List<VizMcMachine> vizMcMachineList = fkMcMachineIds.stream().map(machineId -> VizMcMachine.builder()
                .salesStatus(updateReq.getSalesStatus()).lastUpdateTime(new Date()).id(machineId).build()).toList();
        iVizMcMachineService.updateBatchById(vizMcMachineList, updateBatchNum);

        vizMcMachineAssignTaskDao.update((update) -> update.setAssignStatus(updateReq.getAssignStatus()).idEq(updateReq.getTaskId()).setMsg(updateReq.getMsg()));
        return true;
    }

    /**
     * 查询并未售机器并且没有分配任务的数据
     *
     * @param reqDto
     * @return
     */
    @Transactional(rollbackFor = Throwable.class)
    @DS(DBConstants.SHARDING)
    @Override
    public VizAssignResultRespDto executeUnSoldMachine(MachineSaleStatusReqDto reqDto) {
        log.info("executeUnSoldMachine request is ==> {}", reqDto);
        AssertUtil.isTrue(Objects.nonNull(reqDto.getAppLicenseType()), "appLicenseType不能为null");
        // 1、查询当前平台下全量[未售]的机器、并且没有分配任务的数据
        List<VizMcMachine> unsoldList = iVizMcMachineService.list(unSoldQueryWrapperConsumer(reqDto));
        AssertUtil.isTrue(CollUtil.isNotEmpty(unsoldList), "查询不到未售机器");

        VizAssignResultRespDto result = new VizAssignResultRespDto();
        // 本次未售可分配的机器集合
        List<MachineInfoResult> unsoldDeviceList = new ArrayList<>();
        // 已经存在待分配任务的机器集合
        List<String> existWaitAssignTaskList = result.getExistWaitAssignTaskList();
        // 已经是已售状态的机器集合
        List<String> alreadyAssignedList = result.getAlreadyAssignedList();

        // 2、按900阈值做一次in查询 大量的情况下
        List<List<VizMcMachine>> partitionList = Lists.partition(unsoldList, 900);
        String batchNo = "AS" + Convert.toStr(DateUtil.currentSeconds()) + RandomUtil.randomNumbers(3);
        partitionList.forEach(list -> {
            // 2.1: 过滤掉已经有待分配或者已分配 并且小于等于有效结束时间范围内
            List<VizMcMachineAssignTaskEo> assignTaskList = vizMcMachineAssignTaskDao.list((query) -> query.fkMcMachineIdIn(LambdaUtils.list2Fields(list, VizMcMachine::getId)).assignStatusIn(10).drEq(0).validEndTimeLt(new Date()));
            Map<String, VizMcMachineAssignTaskEo> devicieKeyValueInfoMap = LambdaUtils.list2FieldsMap(assignTaskList, VizMcMachineAssignTaskEo::getDeviceId);
            // 2.2: 本次归类：未售可分配数、已存在分配任务集合、已经分配出去的集合
            for (VizMcMachine machineEo : list) {
                VizMcMachineAssignTaskEo taskEo = devicieKeyValueInfoMap.getOrDefault(machineEo.getDeviceId(), null);
                if (Objects.isNull(taskEo)) {
                    unsoldDeviceList.add(machineToInfoResult(machineEo));
                } else if (taskEo.getAssignStatus().equals(10)) {
                    existWaitAssignTaskList.add(taskEo.getDeviceId());
                } else if (taskEo.getAssignStatus().equals(20)) {
                    alreadyAssignedList.add(taskEo.getDeviceId());
                }
            }
        });

        // 3、插入【分配机器任务表】 生成本次批次号 状态:待分配
        List<VizMcMachineAssignTaskEo> buildInsertTaskEoList = BuilderConvert.buildInsertTaskEoList(batchNo, reqDto, unsoldDeviceList);
        vizMcMachineAssignTaskDao.saveBatch(buildInsertTaskEoList);
        List<McMachineTaskHandleDto> taskHandleList = LambdaUtils.list2Fields(buildInsertTaskEoList, recycleTaskEo -> new McMachineTaskHandleDto(recycleTaskEo.getBatchNo(), recycleTaskEo.getId(), recycleTaskEo.getDeviceId()));
        result.setTaskHandleList(taskHandleList);
        return result;
    }


    /**
     * 处理分配任务
     *
     * @param saleStatusReqDto
     * @return
     */
    @Transactional(rollbackFor = Throwable.class)
    @DS(DBConstants.SHARDING)
    @Override
    public VizMcMachineAssignTaskRespDto handleAssignTask(McMachineTaskHandleDto saleStatusReqDto) {
        log.info("handleAssignTask request is ==> {}", saleStatusReqDto);
        VizMcMachineAssignTaskEo assignTaskEo = vizMcMachineAssignTaskDao.selectOne((query) -> query.idEq(saleStatusReqDto.getTaskId()));
        // 当前机器是否【未售】
        VizMcMachine machineEo = iVizMcMachineService.selectOne((query) -> query.idEq(assignTaskEo.getFkMcMachineId()));
        if (Objects.nonNull(machineEo) && TnMachineSaleStatusEnum.UN_SOLD.getStatus() == machineEo.getSalesStatus() && VizMcAssignTaskEnum.WAIT_ASSIGN.getStatus().equals(assignTaskEo.getAssignStatus())) {
            VizMcMachineAssignTaskRespDto respDto = SqBeanUtil.copyProperties(assignTaskEo, VizMcMachineAssignTaskRespDto.class);
            respDto.setFkExtCloudRegionId(machineEo.getFkExtCloudRegionId());
            respDto.setExtCloudRegionName(machineEo.getExtCloudRegionName());
            respDto.setSpecificationModel(machineEo.getSpecificationModel());
            respDto.setSupplierType(machineEo.getSupplierType());
            respDto.setMemoryLimit(machineEo.getMemoryLimit());
            return respDto;
        }
        String msg = "";
        if (!VizMcAssignTaskEnum.WAIT_ASSIGN.getStatus().equals(assignTaskEo.getAssignStatus())) {
            msg += String.format("任务ID [%s] 的状态[%s]", assignTaskEo.getId(), assignTaskEo.getAssignStatus());
        }
        if (Objects.isNull(machineEo)) {
            msg += String.format("任务ID [%s] 记录的设备[%s]不存在", assignTaskEo.getId(), assignTaskEo.getDeviceId());
        }
        if ((TnMachineSaleStatusEnum.SOLD.getStatus() == machineEo.getSalesStatus())) {
            msg += String.format("任务ID [%s] 下的设备[%s]已被分配[%s]", assignTaskEo.getId(), machineEo.getDeviceId(), machineEo.getSalesStatus());
        }
        String finalMsg = msg;
        vizMcMachineAssignTaskDao.update((update) -> update.idEq(assignTaskEo.getId()).versionIdEq(assignTaskEo.getVersionId()).setAssignStatus(VizMcAssignTaskEnum.FAIL_ASSIGN.getStatus()).setMsg(finalMsg).setVersionId(assignTaskEo.getVersionId() + 1));
        return new VizMcMachineAssignTaskRespDto();
    }

    /**
     * 预执行回收-租户下可用机器并且没有回收任务的数据
     *
     * @param reqListDto
     * @return
     */
    @Transactional(rollbackFor = Throwable.class)
    @DS(DBConstants.SHARDING)
    @Override
    public SqKeyValuePair<List<String>, List<McMachineTaskHandleDto>> executeRecycleDevice(List<MachineRecycleReqDto> reqListDto) {
        log.info("executeRecycleDevice request is ==> {}", reqListDto);
        // 已存在待回收任务的记录
        List<String> alreadyExistList = new ArrayList<>(reqListDto.size() / 2);
        // 本次要创建待回收任务的记录
        List<VizMcMachineRecycleTaskEo> currentHandleList = new ArrayList<>(reqListDto.size());
        // 大量数据时 分批处理
        String batchNo = "RC" + Convert.toStr(DateUtil.currentSeconds()) + RandomUtil.randomNumbers(3);

        List<List<MachineRecycleReqDto>> partitionList = Lists.partition(reqListDto, updateBatchNum);
        partitionList.forEach(list -> {
            // 查询当前机器是否已经存在待回收任务记录
            List<VizMcMachineRecycleTaskEo> taskList = vizMcMachineRecycleTaskDao.list((query) -> query.drEq(0).deviceIdIn(LambdaUtils.list2Fields(list, MachineRecycleReqDto::getDeviceId)).recycleStatusEq(VizMcRecycleTaskEnum.WAIT_RECYCLE.getStatus()));
            Map<String, VizMcMachineRecycleTaskEo> keyDeviceIdValueInfoMap = LambdaUtils.list2FieldsMap(taskList, VizMcMachineRecycleTaskEo::getDeviceId);
            for (MachineRecycleReqDto dto : list) {
                VizMcMachineRecycleTaskEo taskEo = keyDeviceIdValueInfoMap.getOrDefault(dto.getDeviceId(), null);
                if (Objects.isNull(taskEo)) {
                    VizMcMachineRecycleTaskEo eo = BuilderConvert.buildVizMcMachineRecycleTaskEo(batchNo, dto, () -> selectMachineByDeviceId(dto.getDeviceId()));
                    currentHandleList.add(eo);
                } else {
                    alreadyExistList.add(dto.getDeviceId());
                }
            }
        });
        vizMcMachineRecycleTaskDao.saveBatch(currentHandleList);
        // 4、发送分配任务的MQ消息 按设备ID hash和分区 取模发送
        List<McMachineTaskHandleDto> taskHandleList = LambdaUtils.list2Fields(currentHandleList, recycleTaskEo -> new McMachineTaskHandleDto(recycleTaskEo.getBatchNo(), recycleTaskEo.getId(), recycleTaskEo.getDeviceId()));
        return new SqKeyValuePair<List<String>, List<McMachineTaskHandleDto>>(alreadyExistList, taskHandleList);
    }


    /**
     * 处理回收任务
     *
     * @param taskHandleDto
     * @return
     */
    @Transactional(rollbackFor = Throwable.class)
    @DS(DBConstants.SHARDING)
    @Override
    public VizMcMachineRecycleTaskRespDto handleRecycleTask(McMachineTaskHandleDto taskHandleDto) {
        log.info("handleRecycleTask request is ==> {}", taskHandleDto);
        VizMcMachineRecycleTaskEo recycleTaskEo = vizMcMachineRecycleTaskDao.selectOne((query) -> query.idEq(taskHandleDto.getTaskId()).drEq(0));
        VizMcMachine machineEo = selectMachineByDeviceId(taskHandleDto.getDeviceId());
        // 当前机器是否为【已售】 任务是否未执行
        if (Objects.nonNull(machineEo) && Objects.nonNull(recycleTaskEo) && VizMcRecycleTaskEnum.WAIT_RECYCLE.getStatus().equals(recycleTaskEo.getRecycleStatus())) {
            machineEo.setSalesStatus(TnMachineSaleStatusEnum.UN_SOLD.getStatus());
            updateTaskAndSoldStatus(recycleTaskEo, machineEo, VizMcRecycleTaskEnum.ALREADY_RECYCLE.getStatus(), "success");
            return SqBeanUtil.copyProperties(recycleTaskEo, VizMcMachineRecycleTaskRespDto.class);
        }

        String msg = "";
        if (Objects.isNull(recycleTaskEo)) {
            msg += String.format("任务ID [%s] 记录[%s]不存在 \n", taskHandleDto.getTaskId(), taskHandleDto.getDeviceId());
        }
        if (Objects.nonNull(recycleTaskEo) && !VizMcRecycleTaskEnum.WAIT_RECYCLE.getStatus().equals(recycleTaskEo.getRecycleStatus())) {
            msg += String.format("任务ID [%s] 的状态[%s] \n", taskHandleDto.getTaskId(), recycleTaskEo.getRecycleStatus());
        }
        if (Objects.isNull(machineEo)) {
            msg += String.format("任务ID [%s] 记录的设备[%s]不存在 \n", taskHandleDto.getTaskId(), taskHandleDto.getDeviceId());
        }
        if (Objects.nonNull(machineEo) && (TnMachineSaleStatusEnum.UN_SOLD.getStatus() == machineEo.getSalesStatus())) {
            msg += String.format("任务ID [%s] 下的设备[%s]已被回收[%s]", taskHandleDto.getTaskId(), machineEo.getDeviceId(), machineEo.getSalesStatus());
        }
        String finalMsg = msg;
        updateTaskAndSoldStatus(recycleTaskEo, null, VizMcAssignTaskEnum.FAIL_ASSIGN.getStatus(), finalMsg);
        return null;
    }

    /**
     * 根据回收任务更新更新机器的销售状态
     *
     * @param req
     */
    @Transactional(rollbackFor = Throwable.class)
    @DS(DBConstants.SHARDING)
    @Override
    public Boolean updateRecycleStatusByTaskId(McMachineTaskUpdateReqDto req) {
        VizMcMachineRecycleTaskEo recycleTaskEo = vizMcMachineRecycleTaskDao.selectOne((query) -> query.idEq(req.getTaskId()).drEq(0));
        if (Objects.nonNull(recycleTaskEo)) {
            updateTaskAndSoldStatus(recycleTaskEo, null, req.getRecycleStatus(), req.getMsg());
        }
        return true;
    }

    private void updateTaskAndSoldStatus(VizMcMachineRecycleTaskEo recycleTaskEo, VizMcMachine machineEo, Integer recycleStatus, String success) {
        vizMcMachineRecycleTaskDao.update((update) -> update.idEq(recycleTaskEo.getId()).versionIdEq(recycleTaskEo.getVersionId()).setRecycleStatus(recycleStatus).setMsg(success).setVersionId(recycleTaskEo.getVersionId() + 1));
        if (Objects.nonNull(machineEo)) {
            iVizMcMachineService.update((update) -> update.idEq(recycleTaskEo.getFkMcMachineId()).versionIdEq(machineEo.getVersionId())
                    .setSalesStatus(machineEo.getSalesStatus()).setVersionId(machineEo.getVersionId() + 1));
        }
    }

    @NotNull
    private static Consumer<VizMcMachineQueryWrapper> unSoldQueryWrapperConsumer(MachineSaleStatusReqDto saleStatusReqDto) {
        if (Boolean.TRUE.equals(saleStatusReqDto.getFullUnSoldFlag())) {
            saleStatusReqDto.setFkMcMachineIds(null);
        }
        return (wr) -> wr.salesStatusEq(TnMachineSaleStatusEnum.UN_SOLD.getStatus()).idIn(saleStatusReqDto.getFkMcMachineIds());
    }


    private VizMcMachine selectMachineById(Long id) {
        return iVizMcMachineService.selectOne(e -> e.idEq(id));
    }

    private VizMcMachine selectMachineByDeviceId(String deviceId) {
        return iVizMcMachineService.selectOne(e -> e.deviceIdEq(deviceId));
    }

    @Override
    @DS(DBConstants.SHARDING)
    @Retryable(value = {Throwable.class}, maxAttempts = 3, backoff = @Backoff(100L))
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public Boolean save(VizMcMachineParam vizMcMachineParam) {
        if (StringUtils.isEmpty(vizMcMachineParam.getDeviceId())) {
            log.warn("设备id为空，忽略同步");
            return true;
        }
        VizMcMachine m = new VizMcMachine();
        BeanUtils.copyProperties(vizMcMachineParam, m);
        VizMcMachine old = iVizMcMachineService.selectOne(m.queryWrapper().deviceIdEq());
        Date now = new Date();
        if (old == null) {
            // 新增
            m.setCreateTime(now);
            iVizMcMachineService.save(m);
            VizMcMachineStatus vizMcMachineStatus = iVizMcMachineStatusService.selectOne(x -> x.deviceIdEq(m.getDeviceId()));
            if (vizMcMachineStatus == null) {
                vizMcMachineStatus = new VizMcMachineStatus();
                vizMcMachineStatus.setDeviceId(m.getDeviceId());
                vizMcMachineStatus.setCreateTime(now);
                vizMcMachineStatus.setFkMcMachineId(m.getId());
                vizMcMachineStatus.setInstanceId(m.getInstanceId());
                vizMcMachineStatus.setVersionId(0L);
                iVizMcMachineStatusService.save(vizMcMachineStatus);
            }

        } else {
            // 更新
            m.setId(old.getId());
            m.setLastUpdateTime(now);
            iVizMcMachineService.updateById(m);
        }
        List<VizMcMachineStreamsParam> vizMcMachineStreamsParams = vizMcMachineParam.getVizMcMachineStreamsParams();
        if (vizMcMachineStreamsParams == null || vizMcMachineStreamsParams.isEmpty()) {
            log.warn("云机{}端口信息不存在", m.getDeviceId());
            // 没端口信息
            return true;
        }
        List<VizMcMachineStreams> ports = vizMcMachineStreamsParams.stream().filter(x -> !ObjectUtils.isEmpty(x.getExternalAddress())).map(x -> {
            VizMcMachineStreams p = new VizMcMachineStreams();
            BeanUtils.copyProperties(x, p);
            p.setId(null);
            p.setFkMcMachineId(m.getId());
            return p;
        }).toList();
        List<VizMcMachineStreams> oldports = iVizMcMachineStreamsService.select(x -> x.deviceIdEq(m.getDeviceId()));
        if (oldports == null || oldports.isEmpty()) {
            ports.forEach(x -> {
                x.setCreateTime(now);
                iVizMcMachineStreamsService.save(x);
            });
            return true;
        }
        // 已存在
        // 新增
        ports.stream().filter(b -> oldports.stream().noneMatch(ob -> (b.getExternalAddress() != null && b.getExternalAddress().equals(ob.getExternalAddress())) && (b.getExternalVport() == null || b.getExternalVport() != null && b.getExternalVport().equals(ob.getExternalVport())) && (b.getExternalAport() == null || b.getExternalAport() != null && b.getExternalAport().equals(ob.getExternalAport())))).forEach(x -> {
            x.setCreateTime(now);
            iVizMcMachineStreamsService.save(x);
        });

        // 删除
        oldports.stream().filter(ob -> ports.stream().noneMatch(b -> (b.getExternalAddress() != null && b.getExternalAddress().equals(ob.getExternalAddress())) && (b.getExternalVport() == null || b.getExternalVport() != null && b.getExternalVport().equals(ob.getExternalVport())) && (b.getExternalAport() == null || b.getExternalAport() != null && b.getExternalAport().equals(ob.getExternalAport())))).forEach(x -> {
            x.setDr(1);
            x.setLastUpdateTime(now);
            iVizMcMachineStreamsService.updateById(x);
        });
        // 修改
        ports.stream().forEach(b -> {
            oldports.stream().filter(ob -> (b.getExternalAddress() != null && b.getExternalAddress().equals(ob.getExternalAddress())) && (b.getExternalVport() == null || b.getExternalVport() != null && b.getExternalVport().equals(ob.getExternalVport())) && (b.getExternalAport() == null || b.getExternalAport() != null && b.getExternalAport().equals(ob.getExternalAport()))).findFirst().ifPresent(u -> {
                b.setId(u.getId());
                b.setLastUpdateTime(now);
                iVizMcMachineStreamsService.updateById(b);
            });
        });
        //删除其它不存在的公网ip
        List<String> ips=PropUtils.distinctKeys(ports,VizMcMachineStreams::getExternalAddress);
        if(ips!=null && !ips.isEmpty()) {
            List<VizMcMachineStreams> deletePublicIps = iVizMcMachineStreamsService.select(q -> q.deviceIdEq(vizMcMachineParam.getDeviceId()).externalAddressNotIn(ips).drEq(0));
            if (deletePublicIps != null) {
                deletePublicIps.forEach(d -> iVizMcMachineStreamsService.update(d.updateWrapper().setDr(1).idEq()));
            }
        }
        return true;
    }
}
