package com.suqi.center.machine.api.dto.request;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 查询云机告警规则模板参数
 * @version 1.0
 * @date 2023/4/19 10:28
 */
@Data
@ApiModel(value = "CloudMachineAlarmRuleTemplateListParam对象", description = "查询云机告警规则模板参数")
public class CloudMachineAlarmRuleTemplateListParam extends Page implements Serializable {

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("类型（1：云机空间不足告警、2：gpu 显存告警）")
    private Integer type;

    @ApiModelProperty("状态(-50：删除，0：未启用，50：启用)")
    private Integer status;

}
