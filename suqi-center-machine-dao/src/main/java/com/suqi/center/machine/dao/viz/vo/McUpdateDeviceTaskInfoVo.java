package com.suqi.center.machine.dao.viz.vo;

import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTask;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/8/16 14:34
 */
@Data
public class McUpdateDeviceTaskInfoVo extends McUpdateDeviceTask implements Serializable {

    @ApiModelProperty("供应商类型（1：华为，2：腾讯，3：百度）")
    private Integer supplierType;

    @ApiModelProperty("云机端软件包名称")
    private String mcServiceSoftwarePackageName;

    @ApiModelProperty("镜像id")
    private String imageId;

    @ApiModelProperty("云机端软件包类型id")
    private Long fkMcServiceSoftwarePackageTypeId;

    @ApiModelProperty("云机端软件包类型名称")
    private String mcServiceSoftwarePackageTypeName;

}
