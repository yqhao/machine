package com.suqi.center.machine.dao.viz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.entity.McDefaultUpdateDeviceTask;
import com.suqi.center.machine.dao.viz.mapper.McDefaultUpdateDeviceTaskMapper;
import com.suqi.center.machine.dao.viz.service.IMcDefaultUpdateDeviceTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceTaskService;
import com.suqi.center.machine.dao.viz.vo.McDefaultUpdateDeviceTaskListVo;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskInfoVo;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 更新机器默认任务表 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-08-16
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class McDefaultUpdateDeviceTaskServiceImpl extends ServiceImpl<McDefaultUpdateDeviceTaskMapper, McDefaultUpdateDeviceTask> implements IMcDefaultUpdateDeviceTaskService {

    @Resource
    private IMcUpdateDeviceTaskService iMcUpdateDeviceTaskService;

    @Override
    public Page<McDefaultUpdateDeviceTask> quickPageById(boolean queryTotals,Page<McDefaultUpdateDeviceTask> page,long lastId, QueryWrapper<McDefaultUpdateDeviceTask> wrapper){
        page.setCurrent(page.getCurrent());
        if(queryTotals){
            long total = 0L;
            boolean overrideSelect=false;
            String sqlSelect = wrapper.getSqlSelect();
            if(sqlSelect!=null && !"".equals(sqlSelect) && sqlSelect.indexOf(",")>0){
                wrapper.select("*");
                overrideSelect=true;
            }
            total=baseMapper.selectCount(wrapper);
            if(overrideSelect){
                wrapper.select(sqlSelect);
            }
            page.setTotal(total);
            if(total==0L){
                return page;
            }
        }
        page.setRecords(baseMapper.quickPageById(page.getSize(),lastId,wrapper));
        return page;
    }

    @Override
    public Page<McDefaultUpdateDeviceTask> quickPage(Page<McDefaultUpdateDeviceTask> page,QueryWrapper<McDefaultUpdateDeviceTask> wrapper){
        long total = 0L;
        boolean overrideSelect=false;
        String sqlSelect = wrapper.getSqlSelect();
        if(sqlSelect!=null && !"".equals(sqlSelect) && sqlSelect.indexOf(",")>0){
            wrapper.select("*");
            overrideSelect=true;
        }
        total=baseMapper.selectCount(wrapper);
        if(overrideSelect){
            wrapper.select(sqlSelect);
        }
        page.setTotal(total);
        if(total>0L){
            page.setRecords(baseMapper.quickPage(page.getCurrent(),page.getSize(),wrapper));
        }
        return page;
    }

    @Override
    public List<McDefaultUpdateDeviceTaskListVo> listVo() {
        return baseMapper.listVo();
    }

    @Override
    public Boolean checkTaskRepeat(Long fkMcUpdateDeviceTaskId) {
        McUpdateDeviceTaskInfoVo info = iMcUpdateDeviceTaskService.info(fkMcUpdateDeviceTaskId);
        return baseMapper.checkTaskRepeat(info.getFkMcServiceSoftwarePackageTypeId(), info.getSupplierType()) > 0;
    }
}
