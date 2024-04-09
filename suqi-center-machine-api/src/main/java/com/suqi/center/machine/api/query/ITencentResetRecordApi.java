package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.TencentResetRecordParam;
import com.suqi.center.machine.api.dto.response.TencentResetRecordResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 * 腾讯云机重置记录 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@FeignClient(name = "suqi-center-machine", path = "/v1/machine/TencentResetRecord", url = "")
public interface ITencentResetRecordApi extends IRestApi<TencentResetRecordResult, TencentResetRecordParam, Long> {
}
