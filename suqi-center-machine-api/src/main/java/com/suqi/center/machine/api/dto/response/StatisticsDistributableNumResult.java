package com.suqi.center.machine.api.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/6 17:40
 */
@Data
@ApiModel("查询云机运行状态返回数据")
public class StatisticsDistributableNumResult implements Serializable {

    @ApiModelProperty("空闲云机数")
    private Long distributableNum;

}
