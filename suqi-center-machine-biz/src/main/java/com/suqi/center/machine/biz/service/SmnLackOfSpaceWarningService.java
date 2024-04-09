package com.suqi.center.machine.biz.service;

import com.suqi.center.machine.api.dto.request.SmnLackOfSpaceWarningParam;

/**
 * SMN 云机空间不足告警接口层
 *
 * @version 1.0
 * @date 2023/4/20 15:37
 */
public interface SmnLackOfSpaceWarningService {


    /**
     * 根据告警值进行平台规则判断处理告警
     * @param param
     * @return
     */
    Boolean smnLackOfSpaceWarning(SmnLackOfSpaceWarningParam param);

}
