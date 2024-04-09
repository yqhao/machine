package com.suqi.center.machine.api.viz.dto.request;

import com.suqi.center.common.dto.ValidationGroups;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/7/26 12:24
 */
@Data
public class AddOrUpdMcServiceSoftwarePackageParam implements Serializable {

    @ApiModelProperty("软件包记录id")
    private Long id;

    @ApiModelProperty("软件包类型记录id")
    @NotNull(groups = ValidationGroups.Insert.class,message = "软件包类型记录id不能为null")
    private Long fkMcServiceSoftwarePackageTypeId;

    @ApiModelProperty("供应商类型（1：华为，2：腾讯，3：百度）")
    @NotNull(groups = ValidationGroups.Insert.class,message = "供应商类型（1：华为，2：腾讯，3：百度）不能为null")
    private Integer supplierType;

    @ApiModelProperty("软件包名称")
    @NotEmpty(groups = ValidationGroups.Insert.class,message = "软件包名称不能为空")
    private String name;

    @ApiModelProperty("镜像id")
    private String imageId;

    @ApiModelProperty("版本名称")
    private String version;

    @ApiModelProperty("状态(-50：删除，50：正常)")
    private Integer status;
}
