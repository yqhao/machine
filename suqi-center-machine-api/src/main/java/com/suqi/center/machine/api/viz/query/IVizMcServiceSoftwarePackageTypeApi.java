package com.suqi.center.machine.api.viz.query;

import com.suqi.center.machine.api.viz.dto.request.McServiceSoftwarePackageTypeParam;
import com.suqi.center.machine.api.viz.dto.response.McServiceSoftwarePackageTypeResult;
import com.suqi.center.common.api.IRestApi;
import org.springframework.cloud.openfeign.FeignClient;



/**
 * <p>
 * 云机端软件包类型表 接口
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/machine/McServiceSoftwarePackageType",
        url = ""
)
public interface IVizMcServiceSoftwarePackageTypeApi extends IRestApi<McServiceSoftwarePackageTypeResult, McServiceSoftwarePackageTypeParam, Long>  {

}
