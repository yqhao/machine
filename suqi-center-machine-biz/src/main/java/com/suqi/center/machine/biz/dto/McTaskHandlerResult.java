package com.suqi.center.machine.biz.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @date 2023/10/21 15:35
 */
@Data
public class McTaskHandlerResult implements Serializable {

    /**
     * 是否需要处理当前结果 true :需要处理， false：不需要处理
     */
    private Boolean isNeedHandler;

    /**
     * 任务状态：-50：失败，0：运行中，50：成功
     */
    private Integer handlerStatus;

    /**
     * 任务处理消息
     */
    private String handlerMsg;

}
