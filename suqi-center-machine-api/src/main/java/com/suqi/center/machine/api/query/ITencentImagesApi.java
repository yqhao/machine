package com.suqi.center.machine.api.query;

import com.suqi.center.common.api.IRestApi;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.TencentImagesResult;
import com.suqi.center.machine.api.dto.request.BatchSetTencentDeviceImageParam;
import com.suqi.center.machine.api.dto.request.TencentImagesParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/TencentImages",
        url = ""
)
public interface ITencentImagesApi extends IRestApi<TencentImagesResult, TencentImagesParam, Long> {


    @PostMapping({"apply/devices"})
    @ApiOperation("批量设置云机新镜像id")
    Result<Boolean> changeImageId(@Validated @RequestBody BatchSetTencentDeviceImageParam batchSetTencentDeviceImageParam);

}
