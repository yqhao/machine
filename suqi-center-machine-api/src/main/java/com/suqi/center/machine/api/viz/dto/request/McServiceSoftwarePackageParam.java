package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 云机端软件包表
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
@Data
@ApiModel(value = "McServiceSoftwarePackage对象", description = "云机端软件包表")
public class McServiceSoftwarePackageParam implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("软件包类型记录id")
    private Long fkMcServiceSoftwarePackageTypeId;


    @ApiModelProperty("供应商类型（1：华为，2：腾讯，3：百度）")
    private Integer supplierType;


    @ApiModelProperty("软件包名称")
    private String name;


    @ApiModelProperty("镜像id")
    private String imageId;


    @ApiModelProperty("版本名称")
    private String version;


    @ApiModelProperty("状态(-50：删除，50：正常)")
    private Integer status;


    @ApiModelProperty("每页显示条数，默认 10")
    protected long size = 10;

    @ApiModelProperty("当前页")
    protected long current = 1;

}
