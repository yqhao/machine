package com.suqi.center.machine.api.query;

import com.suqi.center.common.api.IRestApi;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.TencentDeviceResult;
import com.suqi.center.machine.api.dto.request.TencentDeviceParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * <p>
 * 腾讯设备表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/TencentDevice",
        url = ""
)
public interface ITencentDeviceApi extends IRestApi<TencentDeviceResult, TencentDeviceParam, Long>  {

    @PostMapping({"reset"})
    @ApiOperation("重置")
    Result<String> reset(@RequestBody TencentDeviceParam tencentDeviceParam);

}
