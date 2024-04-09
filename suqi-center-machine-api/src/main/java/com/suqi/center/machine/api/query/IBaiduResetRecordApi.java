package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.BaiduResetRecordParam;
import com.suqi.center.machine.api.dto.response.BaiduResetRecordResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 * 百度云机重置记录 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@FeignClient(name = "suqi-center-machine", path = "/v1/machine/BaiduResetRecord", url = "")
public interface IBaiduResetRecordApi extends IRestApi<BaiduResetRecordResult, BaiduResetRecordParam, Long> {
}
