package com.suqi.center.machine.dao.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 分页获取设备标签返回参数
 * @version 1.0
 * @date 2023/3/30 17:29
 */
@Data
public class DevicesLabelListVo implements Serializable {

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("公网ip")
    private String externalAddr;

    @ApiModelProperty("内网ip")
    private String internalAddr;

    @ApiModelProperty("设备系统标签Id")
    private Long fkSysDeviceLabelId;

    @ApiModelProperty("设备系统标签名称")
    private String sysDeviceLabelName;

    @ApiModelProperty("状态(50：正常，-50：删除)")
    private Integer status;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

}
