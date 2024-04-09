package com.suqi.center.machine.service.rest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.machine.api.dto.reponse.CloudMachineAlarmRuleTemplateVo;
import com.suqi.center.machine.api.dto.request.CloudMachineAlarmRuleTemplateListParam;
import com.suqi.center.machine.api.dto.request.CloudMachineAlarmRuleTemplateParam;
import com.suqi.center.machine.api.query.ICloudMachineAlarmRuleTemplateApi;
import com.suqi.center.machine.biz.service.CloudMachineAlarmRuleTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 云机告警规则模板接口服务
 * @version 1.0
 * @date 2023/4/19 10:21
 */
@RestController
@RequestMapping("/v1/machine/alarm/rule/template")
@Api(value = "", tags = {"配置告警模板-接口"}, produces = "application/json")
public class CloudMachineAlarmRuleTemplateRest extends BaseApiController implements ICloudMachineAlarmRuleTemplateApi {

    @Resource
    CloudMachineAlarmRuleTemplateService cloudMachineAlarmRuleTemplateService;

    @ApiOperation(value = "查询模板列表", consumes = "application/json", produces = "application/json")
    @Override
    public Result<Page<CloudMachineAlarmRuleTemplateVo>> list(CloudMachineAlarmRuleTemplateListParam param) {
        return rest(()->{
            return cloudMachineAlarmRuleTemplateService.list(param);
        });
    }

    @ApiOperation(value = "根据云机告警规则模板Id标记删除模板", consumes = "application/json", produces = "application/json")
    @Override
    public Result<Boolean> delete(CloudMachineAlarmRuleTemplateParam param) {
        return rest(()->{
            if(param == null || param.getId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return cloudMachineAlarmRuleTemplateService.delete(param.getId());
        });
    }

    @ApiOperation(value = "根据云机告警规则模板Id更新模板", consumes = "application/json", produces = "application/json")
    @Override
    public Result<Boolean> update(CloudMachineAlarmRuleTemplateParam param) {
        return rest(()->{
            if(param == null || param.getId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return cloudMachineAlarmRuleTemplateService.update(param);
        });
    }

    @ApiOperation(value = "添加云机告警规则模板", consumes = "application/json", produces = "application/json")
    @Override
    public Result<Boolean> add(CloudMachineAlarmRuleTemplateParam param) {
        return rest(()->{
            return cloudMachineAlarmRuleTemplateService.add(param);
        });
    }

}
