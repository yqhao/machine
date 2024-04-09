package com.suqi.center.machine.biz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.api.dto.reponse.CloudMachineAlarmRuleTemplateVo;
import com.suqi.center.machine.api.dto.request.CloudMachineAlarmRuleTemplateListParam;
import com.suqi.center.machine.api.dto.request.CloudMachineAlarmRuleTemplateParam;
import com.suqi.center.machine.dao.entity.McCloudMachineAlarmRuleTemplate;

/**
 * 云机告警规则模板接口
 *
 * @version 1.0
 * @date 2023/4/19 15:10
 */
public interface CloudMachineAlarmRuleTemplateService {

    /**
     * 根据参数进行查询云机告警规则模板列表
     * @param param
     * @return
     */
    Page<CloudMachineAlarmRuleTemplateVo> list(CloudMachineAlarmRuleTemplateListParam param);

    /**
     * 根据云机告警规则模板Id标记删除模板
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 根据云机告警规则模板Id更新模板
     * @param param
     * @return
     */
    Boolean update(CloudMachineAlarmRuleTemplateParam param);

    /**
     * 添加云机告警规则模板
     * @param param
     * @return
     */
    Boolean add(CloudMachineAlarmRuleTemplateParam param);

    /**
     * 根据 告警值获取匹配的告警值
     * @param currentData
     * @param type
     * @return
     */
    McCloudMachineAlarmRuleTemplate getRuleByAlarmValue(String currentData, Integer type);

    /**
     * 根据类型查询模板
     *
     * @param type        类型
     * @param memberPhone
     * @return 模板
     */
    McCloudMachineAlarmRuleTemplate getRuleByType(Integer type, String memberPhone);
}
