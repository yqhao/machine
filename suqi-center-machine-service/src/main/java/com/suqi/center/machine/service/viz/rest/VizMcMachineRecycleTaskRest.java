package com.suqi.center.machine.service.viz.rest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineRecycleTaskEoPageParam;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineRecycleTaskReqDto;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineRecycleTaskRespDto;
import com.suqi.center.machine.api.viz.query.IVizMcMachineRecycleTaskApi;
import com.suqi.center.machine.biz.viz.service.curd.VizMcMachineRecycleTaskCurdService;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineAssignTaskEo;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineRecycleTaskEo;
import com.suqi.center.service.rest.BasePageRest;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 【可视化】机器回收任务表 接口
 * </p>
 *
 * @author Administrator
 * @since 2023-10-17
 */
@Api(tags = {"【可视化】机器回收任务表接口"})
@RestController
@Validated
@RequestMapping("/viz/v1/recycle/task")
public class VizMcMachineRecycleTaskRest extends BasePageRest<VizMcMachineRecycleTaskCurdService, VizMcMachineRecycleTaskEo, Long, VizMcMachineRecycleTaskRespDto, VizMcMachineRecycleTaskReqDto, VizMcMachineRecycleTaskEoPageParam, IVizMcMachineRecycleTaskApi> implements IVizMcMachineRecycleTaskApi {


    protected QueryWrapper<VizMcMachineRecycleTaskEo> queryWrapper(VizMcMachineRecycleTaskReqDto q) {
        return VizMcMachineRecycleTaskEo.qWrapper()
                // 主键ID
                .idEq(q.getId())
                // 任务批次号
                .batchNoEq(q.getBatchNo())
                // 商户ID
                .tenantIdEq(q.getTenantId())
                // 商户名称
                .tenantNameEq(q.getTenantName())
                // 内网ip地址
                .externalAddrEq(q.getExternalAddr())
                // 外网ip地址
                .internalAddrEq(q.getInternalAddr())
                // 机器基础信息表记录id
                .fkMcMachineIdEq(q.getFkMcMachineId())
                // 租户设备表记录id
                .fkVizTnMachineIdEq(q.getFkVizTnMachineId())
                // 设备唯一码
                .deviceIdLike(q.getDeviceId())
                // 实例Id
                .instanceIdEq(q.getInstanceId())
                // 回收状态(10：待回收，20：已回收, 30:回收失败)
                .recycleStatusEq(q.getRecycleStatus())
                // 操作人用户ID
                .operateUserIdEq(q.getOperateUserId())
                // 回收时间
                .recycleTimeGe(q.getRecycleTime())
                // 回收时间结束范围值
                .recycleTimeLe(q.getQueryEndRecycleTime())
                // 版本id
                .versionIdEq(q.getVersionId())
                // 创建时间
                .createTimeGe(q.getCreateTime())
                // 创建时间结束范围值
                .createTimeLe(q.getQueryEndCreateTime())
                // 创建人
                .createPersonEq(q.getCreatePerson())
                // 最后修改时间
                .updateTimeGe(q.getUpdateTime())
                // 最后修改时间结束范围值
                .updateTimeLe(q.getQueryEndUpdateTime())
                // 是否删除
                .drEq(0)
                // 执行结果
                .msgLike(q.getMsg())
                // 链路ID
                .traceIdEq(q.getTraceId())
                .orderByDesc(VizMcMachineAssignTaskEo.CREATE_TIME)
                ;
    }

    protected QueryWrapper<VizMcMachineRecycleTaskEo> pageQueryWrapper(VizMcMachineRecycleTaskEoPageParam q) {
        return VizMcMachineRecycleTaskEo.qWrapper()
                // 主键ID
                .idEq(q.getId())
                // 任务批次号
                .batchNoEq(q.getBatchNo())
                // 商户ID
                .tenantIdEq(q.getTenantId())
                // 商户名称
                .tenantNameLike(q.getTenantName())
                // 内网ip地址
                .externalAddrEq(q.getExternalAddr())
                // 外网ip地址
                .internalAddrEq(q.getInternalAddr())
                // 机器基础信息表记录id
                .fkMcMachineIdEq(q.getFkMcMachineId())
                // 租户设备表记录id
                .fkVizTnMachineIdEq(q.getFkVizTnMachineId())
                // 设备唯一码
                .deviceIdEq(q.getDeviceId())
                // 实例Id
                .instanceIdEq(q.getInstanceId())
                // 回收状态(10：待回收，20：已回收, 30:回收失败)
                .recycleStatusEq(q.getRecycleStatus())
                // 操作人用户ID
                .operateUserIdEq(q.getOperateUserId())
                // 回收时间
                .recycleTimeGe(q.getRecycleTime())
                // 回收时间结束范围值
                .recycleTimeLe(q.getQueryEndRecycleTime())
                // 版本id
                .versionIdEq(q.getVersionId())
                // 创建时间
                .createTimeGe(q.getCreateTime())
                // 创建时间结束范围值
                .createTimeLe(q.getQueryEndCreateTime())
                // 创建人
                .createPersonEq(q.getCreatePerson())
                // 最后修改时间
                .updateTimeGe(q.getUpdateTime())
                // 最后修改时间结束范围值
                .updateTimeLe(q.getQueryEndUpdateTime())
                // 是否删除
                .drEq(0)
                // 执行结果
                .msgLike(q.getMsg())
                // 链路ID
                .traceIdEq(q.getTraceId())
                .orderByDesc(VizMcMachineAssignTaskEo.CREATE_TIME)
                ;
    }

}