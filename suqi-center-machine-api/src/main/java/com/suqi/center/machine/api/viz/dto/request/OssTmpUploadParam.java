package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/7/26 17:31
 */
@Data
public class OssTmpUploadParam implements Serializable {

    @ApiModelProperty("对象存储记录Id")
    @NotNull(message = "对象存储记录Id不能为空")
    private Long ossId;

    @NotNull(message = "对象存储服务类型不能为空")
    @ApiModelProperty("对象存储服务类型（1：obs）")
    private Integer ossType;

    @NotNull(message = "云机端软件包记录Id不能为空")
    @ApiModelProperty("云机端软件包记录Id")
    private Long mcServiceSoftwarePackageId;
}
