package com.suqi.center.machine.dao.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/6 17:47
 */
@Data
public class StatisticsDistributableNumDto implements Serializable {

    @ApiModelProperty("租户编号")
    private Long tenantId;

    @ApiModelProperty("排队类型： 0、普通，1、排队（不传默认查全部）")
    private Integer queueType;

}
