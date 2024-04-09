package com.suqi.center.machine.api.query;

import com.suqi.center.common.api.IRestApi;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.BaiduImagesParam;
import com.suqi.center.machine.api.dto.request.BatchSetBaiduDeviceImageParam;
import com.suqi.center.machine.api.dto.response.BaiduImagesResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 *  接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@FeignClient(name = "suqi-center-machine", path = "/v1/machine/BaiduImages", url = "")
public interface IBaiduImagesApi extends IRestApi<BaiduImagesResult, BaiduImagesParam, Long> {

    @PostMapping({"apply/devices"})
    @ApiOperation("批量设置云机新镜像id")
    Result<Boolean> changeImageId(@Validated @RequestBody BatchSetBaiduDeviceImageParam batchSetBaiduDeviceImageParam);

}
