package com.suqi.center.machine.biz.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zxx
 * @version 1.0
 * @date 2021/7/2 15:32
 */
@Data
public class NotificationBaseVo<T> implements Serializable {

    private Long fkMemberId;

    private Integer type;

    private Long fkUcMemberNotificationRecordId;

    private T data;

}
