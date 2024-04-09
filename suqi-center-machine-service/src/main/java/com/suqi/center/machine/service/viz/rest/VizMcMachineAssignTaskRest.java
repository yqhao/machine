package com.suqi.center.machine.service.viz.rest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineAssignTaskReqDto;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineAssignTaskEoPageParam;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineAssignTaskRespDto;
import com.suqi.center.machine.api.viz.query.IVizMcMachineAssignTaskApi;
import com.suqi.center.machine.biz.viz.service.curd.VizMcMachineAssignTaskCurdService;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineAssignTaskEo;
import com.suqi.center.service.rest.BasePageRest;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 【可视化】机器分配任务表 接口
 * </p>
 *
 * @author Administrator
 * @since 2023-10-16
 */
@Api(tags = {"【可视化】机器分配任务表接口"})
@RestController
@Validated
@RequestMapping("/viz/v1/machine/assign/task")
public class VizMcMachineAssignTaskRest extends BasePageRest<VizMcMachineAssignTaskCurdService, VizMcMachineAssignTaskEo, Long, VizMcMachineAssignTaskRespDto, VizMcMachineAssignTaskReqDto, VizMcMachineAssignTaskEoPageParam, IVizMcMachineAssignTaskApi> implements IVizMcMachineAssignTaskApi {


    protected QueryWrapper<VizMcMachineAssignTaskEo> queryWrapper(VizMcMachineAssignTaskReqDto q) {
        return VizMcMachineAssignTaskEo.qWrapper()
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
                // 设备唯一码
                .deviceIdLike(q.getDeviceId())
                // 实例Id
                .instanceIdEq(q.getInstanceId())
                // 分配状态(10：待分配，20：已分配, 30:分配失败)
                .assignStatusEq(q.getAssignStatus())
                // 操作人用户ID
                .operateUserIdEq(q.getOperateUserId())
                // 使用有效期开始时间
                .validStartTimeGe(q.getValidStartTime())
                // 使用有效期开始时间结束范围值
                .validStartTimeLe(q.getQueryEndValidStartTime())
                // 使用有效期结束时间
                .validEndTimeGe(q.getValidEndTime())
                // 使用有效期结束时间结束范围值
                .validEndTimeLe(q.getQueryEndValidEndTime())
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
                // app许可证id
                .appLicenseIdEq(q.getAppLicenseId())
                // app许可证类型（1：云应用，2：云手机，3：云游戏）
                .appLicenseTypeEq(q.getAppLicenseType())
                // 链路ID
                .traceIdEq(q.getTraceId())
                .orderByDesc(VizMcMachineAssignTaskEo.CREATE_TIME)
                ;
    }

    protected QueryWrapper<VizMcMachineAssignTaskEo> pageQueryWrapper(VizMcMachineAssignTaskEoPageParam q) {
        return VizMcMachineAssignTaskEo.qWrapper()
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
                // 设备唯一码
                .deviceIdEq(q.getDeviceId())
                // 实例Id
                .instanceIdEq(q.getInstanceId())
                // 分配状态(10：待分配，20：已分配, 30:分配失败)
                .assignStatusEq(q.getAssignStatus())
                // 操作人用户ID
                .operateUserIdEq(q.getOperateUserId())
                // 使用有效期开始时间
                .validStartTimeGe(q.getValidStartTime())
                // 使用有效期开始时间结束范围值
                .validStartTimeLe(q.getQueryEndValidStartTime())
                // 使用有效期结束时间
                .validEndTimeGe(q.getValidEndTime())
                // 使用有效期结束时间结束范围值
                .validEndTimeLe(q.getQueryEndValidEndTime())
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
                // app许可证id
                .appLicenseIdEq(q.getAppLicenseId())
                // app许可证类型（1：云应用，2：云手机，3：云游戏）
                .appLicenseTypeEq(q.getAppLicenseType())
                // 链路ID
                .traceIdEq(q.getTraceId())
                .orderByDesc(VizMcMachineAssignTaskEo.CREATE_TIME)
                ;
    }
}