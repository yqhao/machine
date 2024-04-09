package com.suqi.center.machine.api.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@ApiModel(value = "McTaskInfoResult", description = "")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class McTaskInfoResult implements Serializable {


    @ApiModelProperty("商户用户id")
    private String userId;

    @ApiModelProperty("云机设备id")
    private String facilitiesId;

    @ApiModelProperty("用户启流设备id")
    private String userPhoneId;

    @ApiModelProperty("使用有效期开始时间")
    private String validStartTime;

    @ApiModelProperty("使用有效期结束时间")
    private String validEndTime;

    @ApiModelProperty("状态（1：迁移中，2：迁移成功，-1：迁移失败）")
    private int status;

    //private int runingStatus;

    @ApiModelProperty("订购时间")
    private String buyTime;
    @ApiModelProperty("最近一次续费时间")
    private String lastRenewTime;






}

