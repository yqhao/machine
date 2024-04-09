package com.suqi.center.machine.api.viz.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @version 1.0
 * @date 2023/7/26 17:33
 */
@Data
public class ServerBundleOssTmpUploadResult implements Serializable {

    @ApiModelProperty("云机端软件包对象存储记录Id")
    private Long mcServiceSoftwarePackageOssRecordId;

    @ApiModelProperty("请求头")
    private Map<String,String> headers;

    @ApiModelProperty("上传路径")
    private String signedUrl;

}
