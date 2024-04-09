package com.suqi.center.machine.api.dto.reponse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/3/17 18:16
 */
@Data
public class QuerySysDevicesSpecVo implements Serializable {

    @ApiModelProperty("设备规格配置Id")
    private Long id;

    @ApiModelProperty("手机规格名称，不得超过64byte。")
    private String phoneSpecifications;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("最后一次修改时间")
    private Date lastUpdateTime;


}
