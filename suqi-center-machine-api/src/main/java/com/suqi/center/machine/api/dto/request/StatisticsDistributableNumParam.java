package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/6 17:34
 */
@Data
@ApiModel("查询云机运行状态 参数")
public class StatisticsDistributableNumParam implements Serializable {

    @ApiModelProperty("租户编号")
    private Long tenantId;

    @ApiModelProperty("排队类型： 0、普通，1、排队（不传默认查全部）")
    private Integer queueType;

}
