package com.suqi.center.machine.api.dto.request;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class TaskQueryParam implements Serializable {

    String taskId;
}
