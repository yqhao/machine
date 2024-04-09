package com.suqi.center.machine.api.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * SMN 云机空间不足告警 参数
 * @version 1.0
 * @date 2023/4/20 15:27
 */
@Data
public class SmnLackOfSpaceWarningParam implements Serializable {

    @ApiModelProperty("cph PhoneId")
    private String cphPhoneId;

    @ApiModelProperty("cph ServerId")
    private String cphServerId;

    @ApiModelProperty("当前告警值")
    private String currentData;

}
