package com.suqi.center.machine.api.query;

import com.suqi.center.machine.api.dto.request.YunMemberDeviceParam;
import com.suqi.center.machine.api.dto.response.YunMemberDeviceResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 * 用户设备表（yun_member_device） 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-28
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/YunMemberDevice",
        url = ""
)
public interface IYunMemberDeviceApi extends IRestApi<YunMemberDeviceResult, YunMemberDeviceParam, Long>  {

}
