package com.suqi.center.machine.api.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/9/4 16:01
 */
@Data
@ApiModel("分页查询商户设备标签库存 返回数据")
public class MemberDeviceLabelInventoryPageResult implements Serializable {

    @ApiModelProperty("商户设备标签库存ID")
    private Long id;

    @ApiModelProperty("会员id")
    private Long fkMemberId;

    @ApiModelProperty("会员名称")
    private String memberName;

    @ApiModelProperty("设备系统标签Id")
    private Long fkSysDeviceLabelId;

    @ApiModelProperty("设备系统标签名称")
    private String sysDeviceLabelName;

    @ApiModelProperty("总库存")
    private Integer productStock;

    @ApiModelProperty("剩余库存")
    private Integer lastStock;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    private Date lastUpdateTime;
}
