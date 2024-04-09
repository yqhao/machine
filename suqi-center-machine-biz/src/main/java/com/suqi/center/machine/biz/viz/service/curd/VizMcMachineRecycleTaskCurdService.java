package com.suqi.center.machine.biz.viz.service.curd;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.viz.dao.IVizMcMachineRecycleTaskDao;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineRecycleTaskEo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 【可视化】机器回收任务表 接口
 * </p>
 *
 * @author Administrator
 * @since 2023-10-17
 */
@Service
public class VizMcMachineRecycleTaskCurdService extends CurdService<VizMcMachineRecycleTaskEo, Long,IVizMcMachineRecycleTaskDao> {


    @Override
    protected QueryWrapper<VizMcMachineRecycleTaskEo> queryPageWrapper(VizMcMachineRecycleTaskEo q) {
        return q.queryWrapper()
                    .idEq()//主键ID
                    .batchNoEq()//任务批次号
                    .tenantIdEq()//商户ID
                    .tenantNameEq()//商户名称
                    .externalAddrEq()//内网ip地址
                    .internalAddrEq()//外网ip地址
                    .fkMcMachineIdEq()//机器基础信息表记录id
                    .fkVizTnMachineIdEq()//租户设备表记录id
                    .deviceIdLike()//设备唯一码
                    .instanceIdEq()//实例Id
                    .recycleStatusEq()//回收状态(10：待回收，20：已回收, 30:回收失败)
                    .operateUserIdEq()//操作人用户ID
                    .recycleTimeGe()//回收时间
                    .versionIdEq()//版本id
                    .createTimeGe()//创建时间
                    .createPersonEq()//创建人
                    .updateTimeGe()//最后修改时间
                    .drEq()//是否删除
                    .msgLike()//执行结果
                    .traceIdEq()//链路ID
                ;
    }

    @Override
    protected Page<VizMcMachineRecycleTaskEo> pageQuery(PageSet pageSet, QueryWrapper<VizMcMachineRecycleTaskEo> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()),queryWrapper);
    }
}