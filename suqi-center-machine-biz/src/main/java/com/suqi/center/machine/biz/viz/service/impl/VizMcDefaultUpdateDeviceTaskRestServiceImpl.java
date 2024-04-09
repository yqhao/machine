package com.suqi.center.machine.biz.viz.service.impl;

import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.viz.dto.request.McDefaultUpdateDeviceTaskSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.McDefaultUpdateDeviceTaskListResult;
import com.suqi.center.machine.biz.viz.service.VizMcDefaultUpdateDeviceTaskRestService;
import com.suqi.center.machine.dao.viz.entity.McDefaultUpdateDeviceTask;
import com.suqi.center.machine.dao.viz.service.IMcDefaultUpdateDeviceTaskService;
import com.suqi.center.machine.dao.viz.vo.McDefaultUpdateDeviceTaskListVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/16 14:56
 */
@Service
@Slf4j
public class VizMcDefaultUpdateDeviceTaskRestServiceImpl implements VizMcDefaultUpdateDeviceTaskRestService {

    @Resource
    IMcDefaultUpdateDeviceTaskService mcDefaultUpdateDeviceTaskService;

    @Override
    public List<McDefaultUpdateDeviceTaskListResult> list() {
        List<McDefaultUpdateDeviceTaskListResult> results = new ArrayList<>();
        List<McDefaultUpdateDeviceTaskListVo> mcDefaultUpdateDeviceTaskListResults = mcDefaultUpdateDeviceTaskService.listVo();
        if(mcDefaultUpdateDeviceTaskListResults != null && !mcDefaultUpdateDeviceTaskListResults.isEmpty()){
            mcDefaultUpdateDeviceTaskListResults.forEach(e->results.add(mcDefaultUpdateDeviceTaskListVoToResult(e)));
        }
        return results;
    }

    private McDefaultUpdateDeviceTaskListResult mcDefaultUpdateDeviceTaskListVoToResult(McDefaultUpdateDeviceTaskListVo mcDefaultUpdateDeviceTaskListVo){
        McDefaultUpdateDeviceTaskListResult mcDefaultUpdateDeviceTaskListResult = new McDefaultUpdateDeviceTaskListResult();
        mcDefaultUpdateDeviceTaskListResult.setId(mcDefaultUpdateDeviceTaskListVo.getId());
        mcDefaultUpdateDeviceTaskListResult.setMcUpdateDeviceTaskName(mcDefaultUpdateDeviceTaskListVo.getMcUpdateDeviceTaskName());
        mcDefaultUpdateDeviceTaskListResult.setSupplierType(mcDefaultUpdateDeviceTaskListVo.getSupplierType());
        mcDefaultUpdateDeviceTaskListResult.setServiceSoftwarePackageName(mcDefaultUpdateDeviceTaskListVo.getServiceSoftwarePackageName());
        mcDefaultUpdateDeviceTaskListResult.setServiceSoftwarePackageTypeName(mcDefaultUpdateDeviceTaskListVo.getServiceSoftwarePackageTypeName());
        mcDefaultUpdateDeviceTaskListResult.setCreateTime(mcDefaultUpdateDeviceTaskListVo.getCreateTime());
        mcDefaultUpdateDeviceTaskListResult.setLastUpdateTime(mcDefaultUpdateDeviceTaskListVo.getLastUpdateTime());
        return mcDefaultUpdateDeviceTaskListResult;
    }

    @Override
    public Boolean saveOrUpdate(McDefaultUpdateDeviceTaskSaveOrUpdateParam param) {
        Boolean isRepeat = mcDefaultUpdateDeviceTaskService.checkTaskRepeat(param.getFkMcUpdateDeviceTaskId());
        if(isRepeat){
            throw new BizException("不允许重复添加相同的供应类型和软件包类型");
        }
        McDefaultUpdateDeviceTask mcDefaultUpdateDeviceTask = new McDefaultUpdateDeviceTask();
        mcDefaultUpdateDeviceTask.setId(param.getId());
        mcDefaultUpdateDeviceTask.setFkMcUpdateDeviceTaskId(param.getFkMcUpdateDeviceTaskId());
        mcDefaultUpdateDeviceTask.setStatus(param.getStatus());
        mcDefaultUpdateDeviceTask.setLastUpdateTime(SystemClock.date());
        if(mcDefaultUpdateDeviceTask.getId() == null){
            mcDefaultUpdateDeviceTask.setVersionId(0L);
            mcDefaultUpdateDeviceTask.setCreateTime(SystemClock.date());
        }
        return mcDefaultUpdateDeviceTaskService.saveOrUpdate(mcDefaultUpdateDeviceTask);
    }
}
