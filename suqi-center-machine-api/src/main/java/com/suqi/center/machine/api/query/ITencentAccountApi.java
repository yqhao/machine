package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.TencentAccountParam;
import com.suqi.center.machine.api.dto.reponse.TencentAccountResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 * 腾讯账号表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/TencentAccount",
        url = ""
)
public interface ITencentAccountApi extends IRestApi<TencentAccountResult, TencentAccountParam, Long>  {

}
