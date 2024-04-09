package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.McMoveObsConfigParam;
import com.suqi.center.machine.api.dto.response.McMoveObsConfigResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 *  接口
 * </p>
 *
 * @author PC001
 * @since 2023-09-25
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/McMoveObsConfig",
        url = ""
)
public interface IMcMoveObsConfigApi extends IRestApi<McMoveObsConfigResult, McMoveObsConfigParam, Long>  {

}
