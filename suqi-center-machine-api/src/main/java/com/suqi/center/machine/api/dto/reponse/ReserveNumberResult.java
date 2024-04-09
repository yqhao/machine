package com.suqi.center.machine.api.dto.reponse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 获取商户库存数返回内容
 * @version 1.0
 * @date 2023/5/19 11:43
 */
@Data
@ApiModel("获取商户库存数返回内容")
public class ReserveNumberResult implements Serializable {

    @ApiModelProperty("库存数量")
    private Integer reserveNumber;

    @ApiModelProperty("剩余库存")
    private Integer lastStock;
}
