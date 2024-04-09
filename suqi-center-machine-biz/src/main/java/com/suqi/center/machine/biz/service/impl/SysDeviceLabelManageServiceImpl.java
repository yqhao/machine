package com.suqi.center.machine.biz.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.constant.RedisKeyNameConstants;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.dto.reponse.SysDeviceLabelListResult;
import com.suqi.center.machine.api.dto.request.GetDeviceIdleNumParam;
import com.suqi.center.machine.api.dto.request.SysDeviceLabelListParam;
import com.suqi.center.machine.api.dto.request.SysDeviceLabelParam;
import com.suqi.center.machine.api.dto.response.GetDeviceIdleNumResult;
import com.suqi.center.machine.api.dto.response.GetDeviceNumResult;
import com.suqi.center.machine.biz.service.SysDeviceLabelManageService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.SysDeviceLabel;
import com.suqi.center.machine.dao.service.ISysDeviceLabelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 设备系统标签实现层
 *
 * @version 1.0
 * @date 2023/3/29 19:30
 */
@Service
@Slf4j
public class SysDeviceLabelManageServiceImpl implements SysDeviceLabelManageService {

    @Resource
    ISysDeviceLabelService iSysDeviceLabelService;

    @Resource
    RedisTemplate<String, Object> redisTemplate;

    @Override
    @DS(DBConstants.SLAVE)
    public Page<SysDeviceLabelListResult> list(SysDeviceLabelListParam param) {
        LambdaQueryWrapper<SysDeviceLabel> queryWrapper = new LambdaQueryWrapper<>();
        if(param.getStatus() != null) {
            queryWrapper.eq(SysDeviceLabel::getStatus, param.getStatus());
        }
        if(StrUtil.isNotBlank(param.getLabelName())) {
            queryWrapper.like(SysDeviceLabel::getLabelName, param.getLabelName());
        }
        SysDeviceLabelListParam resultPage = iSysDeviceLabelService.page(param, queryWrapper);
        if (resultPage.getRecords().size() > 0) {
            List<SysDeviceLabelListResult> sysDeviceLabelListResults = new ArrayList<>();
            resultPage.getRecords().forEach(e -> sysDeviceLabelListResults.add(sysDeviceLabelToSysDeviceLabelListResult((SysDeviceLabel) e)));
            resultPage.setRecords(sysDeviceLabelListResults);
        }
        return resultPage;
    }

    @Override
    public Boolean add(SysDeviceLabelParam param) {
        LambdaQueryWrapper<SysDeviceLabel> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysDeviceLabel::getLabelName, param.getLabelName());
        SysDeviceLabel one = iSysDeviceLabelService.getOne(queryWrapper);
        if (one != null) {
            ExceptionCode.DUPLICATE_INSERTS_OF_DATA_ARE_NOT_ALLOWED.throwBizException();
        }
        SysDeviceLabel sysDeviceLabel = new SysDeviceLabel();
        sysDeviceLabel.setLabelName(param.getLabelName());
        sysDeviceLabel.setStatus(param.getStatus());
        sysDeviceLabel.setCreateTime(SystemClock.date());
        sysDeviceLabel.setProtocol(param.getProtocol());
        sysDeviceLabel.setVersionId(0L);
        boolean save = iSysDeviceLabelService.save(sysDeviceLabel);
        if(save && param.getProtocol() != null){
            redisTemplate.opsForValue().set(RedisKeyNameConstants.DEVICE_SYSTEM_LABEL_PROTOCOL+":"+sysDeviceLabel.getId(),sysDeviceLabel.getProtocol());
        }
        return save;
    }

    @Override
    public Boolean update(SysDeviceLabelParam param) {
        if (param.getIds().size() > 1 && StrUtil.isNotBlank(param.getLabelName())) {
            log.info("不允许批量修改时修改标签名称");
            ExceptionCode.DUPLICATE_INSERTS_OF_DATA_ARE_NOT_ALLOWED.throwBizException();
        }
        if (StrUtil.isNotBlank(param.getLabelName())) {
            LambdaQueryWrapper<SysDeviceLabel> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(SysDeviceLabel::getLabelName, param.getLabelName());
            SysDeviceLabel one = iSysDeviceLabelService.getOne(queryWrapper);
            if (one != null && !param.getIds().contains(one.getId())) {
                log.info("当前设备系统标签名称已存在");
                ExceptionCode.DUPLICATE_INSERTS_OF_DATA_ARE_NOT_ALLOWED.throwBizException();
            }
        }
        List<SysDeviceLabel> updateList = new ArrayList<>();
        for (Long id : param.getIds()) {
            SysDeviceLabel update = new SysDeviceLabel();
            update.setId(id);
            update.setLastUpdateTime(SystemClock.date());
            update.setStatus(param.getStatus());
            update.setProtocol(param.getProtocol());
            if (StrUtil.isNotBlank(param.getLabelName())) {
                update.setLabelName(param.getLabelName());
            }
            updateList.add(update);
        }
        boolean b = iSysDeviceLabelService.updateBatchById(updateList);
        if(b && param.getProtocol() != null){
            for (Long id : param.getIds()) {
                redisTemplate.opsForValue().set(RedisKeyNameConstants.DEVICE_SYSTEM_LABEL_PROTOCOL+":"+id,param.getProtocol());
            }
        }
        return b;
    }

    @Override
    @DS(DBConstants.SLAVE)
    public SysDeviceLabelListResult getInfoByLabelName(SysDeviceLabelListParam param) {
        LambdaQueryWrapper<SysDeviceLabel> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysDeviceLabel::getLabelName, param.getLabelName())
                .eq(SysDeviceLabel::getStatus, 50);
        SysDeviceLabel sysDeviceLabel = iSysDeviceLabelService.getOne(queryWrapper);
        if(sysDeviceLabel == null){
            return null;
        }
        return sysDeviceLabelToSysDeviceLabelListResult(sysDeviceLabel);
    }

    @Override
    @DS(DBConstants.SLAVE)
    public GetDeviceIdleNumResult getDeviceIdleNum(GetDeviceIdleNumParam param) {
        Integer deviceIdleNum = iSysDeviceLabelService.getDeviceNum(param.getTenantId(), param.getDeviceLabelId(), 0);
        GetDeviceIdleNumResult getDeviceIdleNumResult = new GetDeviceIdleNumResult();
        getDeviceIdleNumResult.setIdleDeviceCount(deviceIdleNum);
        return getDeviceIdleNumResult;
    }

    @Override
    @DS(DBConstants.SLAVE)
    public GetDeviceNumResult getDeviceNum(GetDeviceIdleNumParam param) {
        // 获取设备总数
        Integer deviceIdleNum = iSysDeviceLabelService.getDeviceNum(param.getTenantId(), param.getDeviceLabelId(), null);
        GetDeviceNumResult getDeviceNumResult = new GetDeviceNumResult();
        getDeviceNumResult.setDeviceCount(deviceIdleNum);
        return getDeviceNumResult;
    }

    public SysDeviceLabelListResult sysDeviceLabelToSysDeviceLabelListResult(SysDeviceLabel sysDeviceLabel) {
        SysDeviceLabelListResult sysDeviceLabelListResult = new SysDeviceLabelListResult();
        sysDeviceLabelListResult.setLabelName(sysDeviceLabel.getLabelName());
        sysDeviceLabelListResult.setId(sysDeviceLabel.getId());
        sysDeviceLabelListResult.setStatus(sysDeviceLabel.getStatus());
        sysDeviceLabelListResult.setCreateTime(sysDeviceLabel.getCreateTime());
        sysDeviceLabelListResult.setLastUpdateTime(sysDeviceLabel.getLastUpdateTime());
        sysDeviceLabelListResult.setProtocol(sysDeviceLabel.getProtocol());
        return sysDeviceLabelListResult;
    }

}
