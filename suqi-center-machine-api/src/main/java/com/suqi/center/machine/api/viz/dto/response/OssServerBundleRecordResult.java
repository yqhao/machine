package com.suqi.center.machine.api.viz.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @date 2023/7/26 15:42
 */
@Data
public class OssServerBundleRecordResult implements Serializable {

    @ApiModelProperty("对象存储服务记录Id")
    private Long ossId;

    @ApiModelProperty("对象存储服务名称")
    private String name;

    @ApiModelProperty("对象存储服务类型（1：obs）")
    private Integer ossType;

    @ApiModelProperty("对象存储桶名")
    private String bucketName;

    @ApiModelProperty("状态(-50：删除，0：未上传，50：正常")
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
