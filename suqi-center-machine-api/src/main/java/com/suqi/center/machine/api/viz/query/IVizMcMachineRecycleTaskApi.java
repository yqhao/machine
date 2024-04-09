package com.suqi.center.machine.api.viz.query;

import com.suqi.center.common.api.IRestPageApi;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineRecycleTaskEoPageParam;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineRecycleTaskReqDto;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineRecycleTaskRespDto;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 * 【可视化】机器回收任务表 接口
 * </p>
 *
 * @author Administrator
 * @since 2023-10-17
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/recycle/task",
        url = ""
)
public interface IVizMcMachineRecycleTaskApi extends IRestPageApi<VizMcMachineRecycleTaskRespDto, VizMcMachineRecycleTaskReqDto, Long,VizMcMachineRecycleTaskEoPageParam> {

}
