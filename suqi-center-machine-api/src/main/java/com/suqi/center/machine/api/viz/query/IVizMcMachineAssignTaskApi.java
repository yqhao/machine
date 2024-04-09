package com.suqi.center.machine.api.viz.query;

import com.suqi.center.common.api.IRestPageApi;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineAssignTaskReqDto;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineAssignTaskEoPageParam;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineAssignTaskRespDto;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 * 【可视化】机器分配任务表 接口
 * </p>
 *
 * @author Administrator
 * @since 2023-10-16
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/machine/assign/task",
        url = ""
)
public interface IVizMcMachineAssignTaskApi extends IRestPageApi<VizMcMachineAssignTaskRespDto, VizMcMachineAssignTaskReqDto, Long, VizMcMachineAssignTaskEoPageParam> {

}
