package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.TencentAccountAreaParam;
import com.suqi.center.machine.api.dto.reponse.TencentAccountAreaResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 * 腾讯账号区域表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/TencentAccountArea",
        url = ""
)
public interface ITencentAccountAreaApi extends IRestApi<TencentAccountAreaResult, TencentAccountAreaParam, Long>  {

}
