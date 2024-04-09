package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.McMoveDeviceParam;
import com.suqi.center.machine.api.dto.request.TaskQueryParam;
import com.suqi.center.machine.api.dto.response.McMoveDeviceResult;
import com.suqi.center.common.api.IRestApi;
import com.suqi.center.machine.api.dto.response.McTaskInfoResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 *  移机接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@FeignClient(name = "suqi-center-machine", path = "/v1/machine/McMoveDevice", url = "")
public interface IMcMoveDeviceApi extends IRestApi<McMoveDeviceResult, McMoveDeviceParam, Long> {

    @PostMapping({"taskResult"})
    @ApiOperation("任务结果查询")
    McTaskInfoResult taskResult(@RequestBody  TaskQueryParam taskQueryParam);
}
