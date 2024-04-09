package com.suqi.center.machine.biz.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/7/6 10:58
 */
@Data
public class ExternalAddrByServerIdResult implements Serializable {

    @ApiModelProperty("服务器ID")
    private String serverId;

    @ApiModelProperty("公网ip")
    private String externalAddr;

    @ApiModelProperty("商户ID")
    private List<String> memberMobiles;

}
