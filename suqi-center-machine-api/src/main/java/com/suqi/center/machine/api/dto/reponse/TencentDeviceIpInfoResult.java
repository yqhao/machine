package com.suqi.center.machine.api.dto.reponse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@Builder
@ToString
@ApiModel(value = "云机公网信息", description = "云机公网信息")
public class TencentDeviceIpInfoResult implements Serializable {

    @ApiModelProperty("运营商（CTCC：电信，CMCC：移动，CUCC：联通）")
    String isp;

    @ApiModelProperty("公网IP")
    String publicIp;

    @ApiModelProperty("端口")
    Integer minPort;



}
