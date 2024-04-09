package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.EmSocDevicesParam;
import com.suqi.center.machine.api.dto.response.EmSocDevicesResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 * 设备（em_soc_devices） 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-16
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/EmSocDevices",
        url = ""
)
public interface IEmSocDevicesApi extends IRestApi<EmSocDevicesResult, EmSocDevicesParam, Long>  {

}
