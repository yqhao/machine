package com.suqi.center.machine.biz.service;

import com.suqi.center.machine.api.dto.request.McSmnRecordParam;

/**
 * 华为smn消息记录接口层
 * @version 1.0
 * @date 2023/4/19 16:28
 */
public interface SmnRecordService {

    /**
     * 保存华为smn消息记录
     * @param param
     * @return
     */
    Boolean save(McSmnRecordParam param);
}
