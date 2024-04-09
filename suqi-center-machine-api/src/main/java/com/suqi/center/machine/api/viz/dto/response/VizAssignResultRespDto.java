package com.suqi.center.machine.api.viz.dto.response;

import com.suqi.center.machine.api.viz.dto.request.McMachineTaskHandleDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: chenbinhong
 * @Date: 2023/10/16 14:56
 * @Description: VizAssignResultRespDto
 * @Version 1.0.0
 */
@Data
public class VizAssignResultRespDto {
    /**
     * 本次任务
     */
    List<McMachineTaskHandleDto> taskHandleList;

    @ApiModelProperty("已经存在待分配任务的机器集合")
    private List<String> existWaitAssignTaskList = new ArrayList<>();

    @ApiModelProperty("已经是已售状态的机器集合")
    private List<String> alreadyAssignedList = new ArrayList<>();


    @ApiModelProperty("已经存在等待回收任务的机器集合")
    private List<String> existWaitRecycleTaskList = new ArrayList<>();
    public VizAssignResultRespDto(List<String> existWaitRecycleTaskList) {
        this.existWaitRecycleTaskList = existWaitRecycleTaskList;
    }

    public VizAssignResultRespDto() {
    }

    public VizAssignResultRespDto(List<String> existWaitAssignTaskList, List<String> alreadyAssignedList) {
        this.existWaitAssignTaskList = existWaitAssignTaskList;
        this.alreadyAssignedList = alreadyAssignedList;
    }

}
