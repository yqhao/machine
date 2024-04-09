package com.suqi.center.machine.biz.viz.service.curd;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.viz.dao.IVizMcMachineAssignTaskDao;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineAssignTaskEo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 【可视化】机器分配任务表 接口
 * </p>
 *
 * @author Administrator
 * @since 2023-10-16
 */
@Service
public class VizMcMachineAssignTaskCurdService extends CurdService<VizMcMachineAssignTaskEo, Long, IVizMcMachineAssignTaskDao> {


    @Override
    protected QueryWrapper<VizMcMachineAssignTaskEo> queryPageWrapper(VizMcMachineAssignTaskEo q) {
        return q.queryWrapper()
                .idEq()//主键ID
                .batchNoEq()//任务批次号
                .tenantIdEq()//商户ID
                .tenantNameEq()//商户名称
                .externalAddrEq()//内网ip地址
                .internalAddrEq()//外网ip地址
                .fkMcMachineIdEq()//机器基础信息表记录id
                .deviceIdLike()//设备唯一码
                .instanceIdEq()//实例Id
                .assignStatusEq()//分配状态(10：待分配，20：已分配, 30:分配失败)
                .operateUserIdEq()//操作人用户ID
                .validStartTimeGe()//使用有效期开始时间
                .validEndTimeGe()//使用有效期结束时间
                .versionIdEq()//版本id
                .createTimeGe()//创建时间
                .createPersonEq()//创建人
                .updateTimeGe()//最后修改时间
                .drEq()//是否删除
                .msgLike()//执行结果
                .appLicenseIdEq()//app许可证id
                .appLicenseTypeEq()//app许可证类型（1：云应用，2：云手机，3：云游戏）
                .traceIdEq()//链路ID
                ;
    }

    @Override
    protected Page<VizMcMachineAssignTaskEo> pageQuery(PageSet pageSet, QueryWrapper<VizMcMachineAssignTaskEo> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()),queryWrapper);
    }
}