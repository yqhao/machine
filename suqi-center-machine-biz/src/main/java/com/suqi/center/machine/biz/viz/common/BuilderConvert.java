package com.suqi.center.machine.biz.viz.common;

import cn.hutool.core.util.IdUtil;
import com.suqi.center.common.constant.CenterConstant;
import com.suqi.center.common.dto.VizSysUserLoginInfoDto;
import com.suqi.center.common.enums.VizMcAssignTaskEnum;
import com.suqi.center.common.enums.VizMcRecycleTaskEnum;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.utils.LambdaUtils;
import com.suqi.center.common.utils.VizInfoUtil;
import com.suqi.center.machine.api.viz.dto.request.MachineRecycleReqDto;
import com.suqi.center.machine.api.viz.dto.request.MachineSaleStatusReqDto;
import com.suqi.center.machine.api.viz.dto.response.MachineInfoResult;
import com.suqi.center.machine.dao.viz.entity.VizMcMachine;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineAssignTaskEo;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineRecycleTaskEo;
import org.slf4j.MDC;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @创建人 binhong
 * @创建时间 2023/10/08
 * @描述 Eo类查询条件组装
 */
public class BuilderConvert {
    public static List<VizMcMachineAssignTaskEo> buildInsertTaskEoList(String batchNo,MachineSaleStatusReqDto reqDto, List<MachineInfoResult> unsoldDeviceList) {
        return LambdaUtils.list2Fields(unsoldDeviceList, dto -> {
            VizMcMachineAssignTaskEo insertTaskEo = new VizMcMachineAssignTaskEo();
            insertTaskEo.setId(IdUtil.getSnowflake().nextId());
            insertTaskEo.setBatchNo(batchNo);
            insertTaskEo.setTenantId(reqDto.getFkTenantId());
            insertTaskEo.setTenantName(Optional.ofNullable(VizInfoUtil.getUserInfo()).map(VizSysUserLoginInfoDto::getTenantName).orElse(""));
            insertTaskEo.setExternalAddr(dto.getExternalAddr());
            insertTaskEo.setInternalAddr(dto.getInternalAddr());
            insertTaskEo.setFkMcMachineId(dto.getId());
            insertTaskEo.setDeviceId(dto.getDeviceId());
            insertTaskEo.setFkCpTnResourcePoolId(reqDto.getFkCpTnResourcePoolId());
            insertTaskEo.setResourcePoolName(reqDto.getResourcePoolName());
            insertTaskEo.setAppLicenseId(reqDto.getAppLicenseId());
            insertTaskEo.setAppLicenseType(reqDto.getAppLicenseType());
            insertTaskEo.setInstanceId(dto.getInstanceId());
            insertTaskEo.setAssignStatus(VizMcAssignTaskEnum.WAIT_ASSIGN.getStatus());
            insertTaskEo.setOperateUserId(reqDto.getSysUserId());
            insertTaskEo.setValidStartTime(reqDto.getValidStartTime());
            insertTaskEo.setValidEndTime(reqDto.getValidEndTime());
            insertTaskEo.setTraceId(MDC.get(CenterConstant.LOG_TRACE_ID));
            return insertTaskEo;
        });
    }


    public static VizMcMachineRecycleTaskEo buildVizMcMachineRecycleTaskEo(String batchNo,MachineRecycleReqDto dto, Supplier<VizMcMachine> supplier) {
        if (Objects.isNull(supplier) || Objects.isNull(supplier.get())) {
            throw new BizException(String.format("机器%s记录不存在", dto.getFkMcMachineId()));
        }
        VizMcMachine mcMachine = supplier.get();
        VizMcMachineRecycleTaskEo buildInsertEo = new VizMcMachineRecycleTaskEo();
        buildInsertEo.setBatchNo(batchNo);
        buildInsertEo.setId(IdUtil.getSnowflake().nextId());
        buildInsertEo.setTenantId(dto.getFkTenantId());
        buildInsertEo.setTenantName(Optional.ofNullable(VizInfoUtil.getUserInfo()).map(VizSysUserLoginInfoDto::getTenantName).orElse(""));
        buildInsertEo.setExternalAddr(mcMachine.getExternalAddr());
        buildInsertEo.setInternalAddr(mcMachine.getInternalAddr());
        buildInsertEo.setFkMcMachineId(mcMachine.getId());
        buildInsertEo.setFkVizTnMachineId(dto.getFkVizTnMachineId());
        buildInsertEo.setDeviceId(mcMachine.getDeviceId());
        buildInsertEo.setInstanceId(mcMachine.getInstanceId());
        buildInsertEo.setRecycleStatus(VizMcRecycleTaskEnum.WAIT_RECYCLE.getStatus());
        buildInsertEo.setOperateUserId(dto.getSysUserId());
        buildInsertEo.setVersionId(0L);
        buildInsertEo.setFkCpTnResourcePoolId(dto.getFkCpTnResourcePoolId());
        buildInsertEo.setResourcePoolName(dto.getResourcePoolName());
        buildInsertEo.setCreateTime(new Date());
        buildInsertEo.setUpdateTime(new Date());
        buildInsertEo.setMsg("");
        buildInsertEo.setTraceId(MDC.get(CenterConstant.LOG_TRACE_ID));
        return buildInsertEo;
    }
}
