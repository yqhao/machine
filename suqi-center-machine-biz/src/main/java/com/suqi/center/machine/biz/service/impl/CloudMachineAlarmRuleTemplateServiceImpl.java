package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.dto.reponse.CloudMachineAlarmRuleTemplateVo;
import com.suqi.center.machine.api.dto.request.CloudMachineAlarmRuleTemplateListParam;
import com.suqi.center.machine.api.dto.request.CloudMachineAlarmRuleTemplateParam;
import com.suqi.center.machine.biz.service.CloudMachineAlarmRuleTemplateService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.McCloudMachineAlarmRuleTemplate;
import com.suqi.center.machine.dao.service.IMcCloudMachineAlarmRuleTemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 云机告警规则模板 实现类
 * @version 1.0
 * @date 2023/4/19 15:10
 */
@Service
public class CloudMachineAlarmRuleTemplateServiceImpl implements CloudMachineAlarmRuleTemplateService {

    @Resource
    IMcCloudMachineAlarmRuleTemplateService iMcCloudMachineAlarmRuleTemplateService;

    @Override
    @DS(DBConstants.SHARDING)
    public Page<CloudMachineAlarmRuleTemplateVo> list(CloudMachineAlarmRuleTemplateListParam param) {
        LambdaQueryWrapper<McCloudMachineAlarmRuleTemplate> queryWrapper = new LambdaQueryWrapper<>();

        CloudMachineAlarmRuleTemplateListParam resultPage = iMcCloudMachineAlarmRuleTemplateService.page(param, queryWrapper);
        if (resultPage.getRecords().size() > 0) {
            List<CloudMachineAlarmRuleTemplateVo> cloudMachineAlarmRuleTemplateVos = new ArrayList<>();
            resultPage.getRecords().forEach(e -> cloudMachineAlarmRuleTemplateVos.add(alarmRuleTemplateToAlarmRuleTemplateVo((McCloudMachineAlarmRuleTemplate) e)));
            resultPage.setRecords(cloudMachineAlarmRuleTemplateVos);
        }
        return resultPage;
    }

    @Override
    @DS(DBConstants.SHARDING)
    public Boolean delete(Long id) {
        McCloudMachineAlarmRuleTemplate mcCloudMachineAlarmRuleTemplate = new McCloudMachineAlarmRuleTemplate();
        mcCloudMachineAlarmRuleTemplate.setId(id);
        mcCloudMachineAlarmRuleTemplate.setStatus(-50);
        return iMcCloudMachineAlarmRuleTemplateService.updateById(mcCloudMachineAlarmRuleTemplate);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public Boolean update(CloudMachineAlarmRuleTemplateParam param) {
        McCloudMachineAlarmRuleTemplate mcCloudMachineAlarmRuleTemplate = new McCloudMachineAlarmRuleTemplate();
        mcCloudMachineAlarmRuleTemplate.setId(param.getId());
        mcCloudMachineAlarmRuleTemplate.setType(param.getType());
        mcCloudMachineAlarmRuleTemplate.setTitle(param.getTitle());
        mcCloudMachineAlarmRuleTemplate.setMinimum(param.getMinimum());
        mcCloudMachineAlarmRuleTemplate.setMaximum(param.getMaximum());
        mcCloudMachineAlarmRuleTemplate.setMessageTemplate(param.getMessageTemplate());
        mcCloudMachineAlarmRuleTemplate.setCommandTemplate(param.getCommandTemplate());
        mcCloudMachineAlarmRuleTemplate.setStatus(param.getStatus());
        mcCloudMachineAlarmRuleTemplate.setIsNoticeUser(param.getIsNoticeUser());
        mcCloudMachineAlarmRuleTemplate.setIsNoticeTenant(param.getIsNoticeTenant());
        mcCloudMachineAlarmRuleTemplate.setIsNoticeFeishu(param.getIsNoticeFeishu());
        mcCloudMachineAlarmRuleTemplate.setLastUpdateTime(SystemClock.date());
        mcCloudMachineAlarmRuleTemplate.setIsRestart(param.getIsRestart());
        if(param.getType().equals(2)) {
            if(Objects.nonNull(param.getEnableRestartPhone()) && !param.getIsRestart()) {
                return false;
            }
            if(param.getIsRestart()
                    && Objects.isNull(param.getRestartDelaySeconds())) {
                return false;
            }
        }
        mcCloudMachineAlarmRuleTemplate.setEnableRestartPhone(param.getEnableRestartPhone());
        mcCloudMachineAlarmRuleTemplate.setRestartDelaySeconds(param.getRestartDelaySeconds());
        return iMcCloudMachineAlarmRuleTemplateService.updateById(mcCloudMachineAlarmRuleTemplate);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public Boolean add(CloudMachineAlarmRuleTemplateParam param) {
        McCloudMachineAlarmRuleTemplate mcCloudMachineAlarmRuleTemplate = new McCloudMachineAlarmRuleTemplate();
        mcCloudMachineAlarmRuleTemplate.setType(param.getType());
        mcCloudMachineAlarmRuleTemplate.setTitle(param.getTitle());
        mcCloudMachineAlarmRuleTemplate.setMinimum(param.getMinimum());
        mcCloudMachineAlarmRuleTemplate.setMaximum(param.getMaximum());
        mcCloudMachineAlarmRuleTemplate.setMessageTemplate(param.getMessageTemplate());
        mcCloudMachineAlarmRuleTemplate.setCommandTemplate(param.getCommandTemplate());
        mcCloudMachineAlarmRuleTemplate.setStatus(50);
        mcCloudMachineAlarmRuleTemplate.setIsNoticeUser(param.getIsNoticeUser());
        mcCloudMachineAlarmRuleTemplate.setIsNoticeTenant(param.getIsNoticeTenant());
        mcCloudMachineAlarmRuleTemplate.setIsNoticeFeishu(param.getIsNoticeFeishu());
        mcCloudMachineAlarmRuleTemplate.setCreateTime(SystemClock.date());
        mcCloudMachineAlarmRuleTemplate.setVersionId(0L);
        if(param.getType().equals(2)) {
            if(Objects.nonNull(param.getEnableRestartPhone()) && !param.getIsRestart()) {
                return false;
            }
            if(param.getIsRestart()
                    && Objects.isNull(param.getRestartDelaySeconds())) {
                return false;
            }
        }
        mcCloudMachineAlarmRuleTemplate.setIsRestart(param.getIsRestart());
        mcCloudMachineAlarmRuleTemplate.setEnableRestartPhone(param.getEnableRestartPhone());
        mcCloudMachineAlarmRuleTemplate.setRestartDelaySeconds(param.getRestartDelaySeconds());
        return iMcCloudMachineAlarmRuleTemplateService.save(mcCloudMachineAlarmRuleTemplate);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public McCloudMachineAlarmRuleTemplate getRuleByAlarmValue(String currentData, Integer type) {
        LambdaQueryWrapper<McCloudMachineAlarmRuleTemplate> mcCloudMachineAlarmRuleTemplateLambdaQueryWrapper = new LambdaQueryWrapper<>();
        mcCloudMachineAlarmRuleTemplateLambdaQueryWrapper.eq(McCloudMachineAlarmRuleTemplate::getType, type)
                .eq(McCloudMachineAlarmRuleTemplate::getStatus, 50)
                .le(McCloudMachineAlarmRuleTemplate::getMinimum, currentData)
                .ge(McCloudMachineAlarmRuleTemplate::getMaximum, currentData)
                .last("LIMIT 1");
        return iMcCloudMachineAlarmRuleTemplateService.getOne(mcCloudMachineAlarmRuleTemplateLambdaQueryWrapper);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public McCloudMachineAlarmRuleTemplate getRuleByType(Integer type, String memberPhone) {
        LambdaQueryWrapper<McCloudMachineAlarmRuleTemplate> mcCloudMachineAlarmRuleTemplateLambdaQueryWrapper = new LambdaQueryWrapper<>();
        mcCloudMachineAlarmRuleTemplateLambdaQueryWrapper
                .eq(McCloudMachineAlarmRuleTemplate::getType, type)
                .eq(McCloudMachineAlarmRuleTemplate::getStatus, 50)
                .eq(McCloudMachineAlarmRuleTemplate::getEnableRestartPhone, memberPhone)
                .last("LIMIT 1");
        return iMcCloudMachineAlarmRuleTemplateService.getOne(mcCloudMachineAlarmRuleTemplateLambdaQueryWrapper);
    }

    public CloudMachineAlarmRuleTemplateVo alarmRuleTemplateToAlarmRuleTemplateVo(McCloudMachineAlarmRuleTemplate mcCloudMachineAlarmRuleTemplate) {
        CloudMachineAlarmRuleTemplateVo cloudMachineAlarmRuleTemplateVo = new CloudMachineAlarmRuleTemplateVo();
        cloudMachineAlarmRuleTemplateVo.setId(mcCloudMachineAlarmRuleTemplate.getId());
        cloudMachineAlarmRuleTemplateVo.setTitle(mcCloudMachineAlarmRuleTemplate.getTitle());
        cloudMachineAlarmRuleTemplateVo.setType(mcCloudMachineAlarmRuleTemplate.getType());
        cloudMachineAlarmRuleTemplateVo.setMinimum(mcCloudMachineAlarmRuleTemplate.getMinimum());
        cloudMachineAlarmRuleTemplateVo.setMaximum(mcCloudMachineAlarmRuleTemplate.getMaximum());
        cloudMachineAlarmRuleTemplateVo.setMessageTemplate(mcCloudMachineAlarmRuleTemplate.getMessageTemplate());
        cloudMachineAlarmRuleTemplateVo.setCommandTemplate(mcCloudMachineAlarmRuleTemplate.getCommandTemplate());
        cloudMachineAlarmRuleTemplateVo.setStatus(mcCloudMachineAlarmRuleTemplate.getStatus());
        cloudMachineAlarmRuleTemplateVo.setIsNoticeUser(mcCloudMachineAlarmRuleTemplate.getIsNoticeUser());
        cloudMachineAlarmRuleTemplateVo.setIsNoticeTenant(mcCloudMachineAlarmRuleTemplate.getIsNoticeTenant());
        cloudMachineAlarmRuleTemplateVo.setIsNoticeFeishu(mcCloudMachineAlarmRuleTemplate.getIsNoticeFeishu());
        cloudMachineAlarmRuleTemplateVo.setCreateTime(mcCloudMachineAlarmRuleTemplate.getCreateTime());
        cloudMachineAlarmRuleTemplateVo.setLastUpdateTime(mcCloudMachineAlarmRuleTemplate.getLastUpdateTime());
        cloudMachineAlarmRuleTemplateVo.setIsRestart(mcCloudMachineAlarmRuleTemplate.getIsRestart());
        cloudMachineAlarmRuleTemplateVo.setRestartDelaySeconds(mcCloudMachineAlarmRuleTemplate.getRestartDelaySeconds());
        return cloudMachineAlarmRuleTemplateVo;
    }
}
