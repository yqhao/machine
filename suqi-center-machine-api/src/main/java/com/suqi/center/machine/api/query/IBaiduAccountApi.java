package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.BaiduAccountParam;
import com.suqi.center.machine.api.dto.response.BaiduAccountResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 * 百度账号表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@FeignClient(name = "suqi-center-machine", path = "/v1/machine/BaiduAccount", url = "")
public interface IBaiduAccountApi extends IRestApi<BaiduAccountResult, BaiduAccountParam, Long> {
}
