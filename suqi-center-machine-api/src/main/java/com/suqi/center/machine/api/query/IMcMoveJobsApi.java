package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.McMoveJobsParam;
import com.suqi.center.machine.api.dto.response.McMoveJobsResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 *  移机任务信息接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/McMoveJobs",
        url = ""
)
public interface IMcMoveJobsApi extends IRestApi<McMoveJobsResult, McMoveJobsParam, Long>  {

}
