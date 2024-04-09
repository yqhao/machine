package com.suqi.center.machine.api.viz.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

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
public class McServiceSoftwarePackageResult implements Serializable {

    @ApiModelProperty("记录id自动增长")
    private Long id;

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

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;
}
