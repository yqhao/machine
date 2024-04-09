package com.suqi.center.machine.api.query;

import com.suqi.center.common.api.IRestApi;
import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageQueryParamBody;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.BaiduDeviceParam;
import com.suqi.center.machine.api.dto.response.BaiduDeviceResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 * 百度云机 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@FeignClient(name = "suqi-center-machine", path = "/v1/machine/BaiduDevice", url = "")
public interface IBaiduDeviceApi extends IRestApi<BaiduDeviceResult, BaiduDeviceParam, Long> {

    @PostMapping({ "reset" })
    @ApiOperation("重置")
    Result<String> reset(BaiduDeviceParam baiduDeviceParam);

    @PostMapping({ "publicIpPage" })
    @ApiOperation("分页查询百度云机公网ip")
    Result<Page<String>> publicIpPage(@RequestBody PageQueryParamBody<String> params);
}
