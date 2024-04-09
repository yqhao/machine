package com.suqi.center.machine.dao.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/9/6 17:48
 */
@Data
@ApiModel("获取当前可分配云机数量")
public class StatisticsDistributableNumVo implements Serializable {

    @ApiModelProperty("可分配云机数量")
    private Long distributableNum;

}
