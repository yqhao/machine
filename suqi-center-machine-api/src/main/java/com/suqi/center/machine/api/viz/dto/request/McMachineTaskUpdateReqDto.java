package com.suqi.center.machine.api.viz.dto.request;

import lombok.Data;

/**
 * @Auther: chenbinhong
 * @Date: 2023/10/21 17:42
 * @Description: McMachineTaskUpdateReqDto
 * @Version 1.0.0
 */
@Data
public class McMachineTaskUpdateReqDto extends McMachineTaskHandleDto{

    String msg;

    Integer recycleStatus;


}
