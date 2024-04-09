package com.suqi.center.machine.api.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.CloudMachineAlarmRuleTemplateVo;
import com.suqi.center.machine.api.dto.request.CloudMachineAlarmRuleTemplateListParam;
import com.suqi.center.machine.api.dto.request.CloudMachineAlarmRuleTemplateParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 云机告警规则模板接口服务
 *
 * @version 1.0
 * @date 2023/4/19 10:20
 */
@Api(tags = {"云机告警规则模板接口服务"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/alarm/rule/template",
        url = ""
)
public interface ICloudMachineAlarmRuleTemplateApi {

    @PostMapping("/list")
    @ApiOperation(value = "根据参数进行查询云机告警规则模板列表", notes = "根据参数进行查询云机告警规则模板列表")
    Result<Page<CloudMachineAlarmRuleTemplateVo>> list(@RequestBody CloudMachineAlarmRuleTemplateListParam param);

    @PostMapping("/delete")
    @ApiOperation(value = "根据云机告警规则模板Id标记删除模板", notes = "根据云机告警规则模板Id标记删除模板")
    Result<Boolean> delete(@RequestBody CloudMachineAlarmRuleTemplateParam param);

    @PostMapping("/update")
    @ApiOperation(value = "根据云机告警规则模板Id更新模板", notes = "根据云机告警规则模板Id更新模板")
    Result<Boolean> update(@RequestBody CloudMachineAlarmRuleTemplateParam param);

    @PostMapping("/add")
    @ApiOperation(value = "添加云机告警规则模板", notes = "添加云机告警规则模板")
    Result<Boolean> add(@RequestBody CloudMachineAlarmRuleTemplateParam param);
}
