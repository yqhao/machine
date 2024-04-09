package com.suqi.center.machine.dao.viz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/11 11:41
 */
@Data
@ApiModel("查询主任务列表参数")
public class McUpdateDeviceTaskListDto implements Serializable {

    @ApiModelProperty("主任务名称")
    private String name;

    @ApiModelProperty("供应商类型（1：华为，2：腾讯，3：百度）")
    private Integer supplierType;

    @ApiModelProperty("当前页")
    private long current = 1;

    @ApiModelProperty("每页显示条数，默认 10")
    private long size = 10;
}
