package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.PcpAreaParam;
import com.suqi.center.machine.api.dto.reponse.PcpAreaResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 * pcp区域表（pcp_area） 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/PcpArea",
        url = ""
)
public interface IPcpAreaApi extends IRestApi<PcpAreaResult, PcpAreaParam, Long>  {

}
