package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/7/26 18:31
 */
@Data
public class ReportOssUploadResultParam implements Serializable {

    @NotNull(message = "云机端软件包对象存储记录Id不能为空")
    @ApiModelProperty("云机端软件包对象存储记录Id")
    private Long mcServiceSoftwarePackageOssRecordId;

    @NotNull(message = "状态不能为空")
    @ApiModelProperty("状态(-50：删除，0：未上传，50：正常")
    private Integer status;
}
