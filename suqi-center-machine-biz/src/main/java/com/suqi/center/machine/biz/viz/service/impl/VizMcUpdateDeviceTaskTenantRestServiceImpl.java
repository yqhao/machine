package com.suqi.center.machine.biz.viz.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.viz.dto.request.McUpdateDeviceTaskTenantPageParam;
import com.suqi.center.machine.api.viz.dto.request.McUpdateDeviceTaskTenantSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.McUpdateDeviceTaskTenantListResult;
import com.suqi.center.machine.biz.viz.service.VizMcUpdateDeviceTaskTenantRestService;
import com.suqi.center.machine.dao.viz.dto.McUpdateDeviceTaskTenantListDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskTenant;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceTaskTenantService;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskTenantListVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/16 10:47
 */
@Service
@Slf4j
public class VizMcUpdateDeviceTaskTenantRestServiceImpl implements VizMcUpdateDeviceTaskTenantRestService {

    @Resource
    IMcUpdateDeviceTaskTenantService iMcUpdateDeviceTaskTenantService;

    @Override
    public Page<McUpdateDeviceTaskTenantListResult> page(McUpdateDeviceTaskTenantPageParam param) {
        McUpdateDeviceTaskTenantListDto mcUpdateDeviceTaskTenantListDto = new McUpdateDeviceTaskTenantListDto();
        mcUpdateDeviceTaskTenantListDto.setFkTenantId(param.getFkTenantId());
        mcUpdateDeviceTaskTenantListDto.setCurrent(param.getCurrent());
        mcUpdateDeviceTaskTenantListDto.setSize(param.getSize());
        Page<McUpdateDeviceTaskTenantListVo> page = iMcUpdateDeviceTaskTenantService.listPage(mcUpdateDeviceTaskTenantListDto);
        Page<McUpdateDeviceTaskTenantListResult> page1 = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        if(page.getRecords() !=null && !page.getRecords().isEmpty()){
            List<McUpdateDeviceTaskTenantListResult> results = new ArrayList<>();
            for (McUpdateDeviceTaskTenantListVo mcUpdateDeviceTaskTenantListVo: page.getRecords()){
                results.add(mcUpdateDeviceTaskTenantListVoToResult(mcUpdateDeviceTaskTenantListVo));
            }
            page1.setRecords(results);
        }
        return page1;
    }

    @Override
    public Boolean saveOrUpdate(McUpdateDeviceTaskTenantSaveOrUpdateParam param) {
        Boolean isRepeat = iMcUpdateDeviceTaskTenantService.checkTaskRepeat(param.getFkTenantId(), param.getFkMcUpdateDeviceTaskId());
        if(isRepeat){
            throw new BizException("不允许重复添加相同的供应类型和软件包类型");
        }
        McUpdateDeviceTaskTenant mcUpdateDeviceTaskTenant = new McUpdateDeviceTaskTenant();
        mcUpdateDeviceTaskTenant.setId(param.getId());
        mcUpdateDeviceTaskTenant.setFkMcUpdateDeviceTaskId(param.getFkMcUpdateDeviceTaskId());
        mcUpdateDeviceTaskTenant.setFkTenantId(param.getFkTenantId());
        mcUpdateDeviceTaskTenant.setStatus(param.getStatus());
        mcUpdateDeviceTaskTenant.setLastUpdateTime(SystemClock.date());
        if(mcUpdateDeviceTaskTenant.getId() == null){
            mcUpdateDeviceTaskTenant.setVersionId(0L);
            mcUpdateDeviceTaskTenant.setCreateTime(SystemClock.date());
        }
        return iMcUpdateDeviceTaskTenantService.saveOrUpdate(mcUpdateDeviceTaskTenant);
    }

    private McUpdateDeviceTaskTenantListResult mcUpdateDeviceTaskTenantListVoToResult(McUpdateDeviceTaskTenantListVo mcUpdateDeviceTaskTenantListVo){
        McUpdateDeviceTaskTenantListResult mcUpdateDeviceTaskTenantListResult = new McUpdateDeviceTaskTenantListResult();
        mcUpdateDeviceTaskTenantListResult.setId(mcUpdateDeviceTaskTenantListVo.getId());
        mcUpdateDeviceTaskTenantListResult.setFkTenantId(mcUpdateDeviceTaskTenantListVo.getFkTenantId());
        mcUpdateDeviceTaskTenantListResult.setMcUpdateDeviceTaskName(mcUpdateDeviceTaskTenantListVo.getMcUpdateDeviceTaskName());
        mcUpdateDeviceTaskTenantListResult.setSupplierType(mcUpdateDeviceTaskTenantListVo.getSupplierType());
        mcUpdateDeviceTaskTenantListResult.setServiceSoftwarePackageName(mcUpdateDeviceTaskTenantListVo.getServiceSoftwarePackageName());
        mcUpdateDeviceTaskTenantListResult.setServiceSoftwarePackageTypeName(mcUpdateDeviceTaskTenantListVo.getServiceSoftwarePackageTypeName());
        mcUpdateDeviceTaskTenantListResult.setCreateTime(mcUpdateDeviceTaskTenantListVo.getCreateTime());
        mcUpdateDeviceTaskTenantListResult.setLastUpdateTime(mcUpdateDeviceTaskTenantListVo.getLastUpdateTime());
        return mcUpdateDeviceTaskTenantListResult;
    }


}
