package com.suqi.center.machine.api.viz.dto.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/21 15:53
 */
@Data
@ApiModel("云机重启、初始化后第一次上线 请求参数")
public class VizLifeCycleRebootOnlineParam implements Serializable {

    private String deviceId;

}
