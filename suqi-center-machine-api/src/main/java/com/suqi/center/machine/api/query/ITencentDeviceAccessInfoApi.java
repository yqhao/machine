package com.suqi.center.machine.api.query;

import com.suqi.center.common.api.IRestApi;
import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageQueryParamBody;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.TencentDeviceAccessInfoResult;
import com.suqi.center.machine.api.dto.request.TencentDeviceAccessInfoParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 * 腾讯设备公网映射表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@FeignClient(name = "suqi-center-machine", path = "/v1/machine/TencentDeviceAccessInfo", url = "")
public interface ITencentDeviceAccessInfoApi extends IRestApi<TencentDeviceAccessInfoResult, TencentDeviceAccessInfoParam, Long> {

    @PostMapping({ "publicIpPage" })
    @ApiOperation("分页查询云机公网ip")
    Result<Page<String>> publicIpPage(@RequestBody PageQueryParamBody<String> params);
}
