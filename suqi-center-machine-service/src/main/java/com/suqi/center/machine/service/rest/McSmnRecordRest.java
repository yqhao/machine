package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.McSmnRecordParam;
import com.suqi.center.machine.api.query.IMcSmnRecordApi;
import com.suqi.center.machine.biz.service.SmnRecordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 华为smn消息记录相关控制层
 * @version 1.0
 * @date 2023/4/19 16:26
 */
@RestController
@RequestMapping("/v1/machine/smn/record")
public class McSmnRecordRest extends BaseApiController implements IMcSmnRecordApi {

    @Resource
    SmnRecordService SmnRecordService;

    @Override
    public Result<Boolean> save(McSmnRecordParam param) {
        return rest(()->{
            return SmnRecordService.save(param);
        });
    }
}
