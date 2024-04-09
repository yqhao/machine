package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 获取商户库存数请求参数
 *
 * @version 1.0
 * @date 2023/5/19 11:46
 */
@Data
@ApiModel("获取商户库存数请求参数")
public class ReserveNumberParam implements Serializable {

    private Long fkMemberId;

}
