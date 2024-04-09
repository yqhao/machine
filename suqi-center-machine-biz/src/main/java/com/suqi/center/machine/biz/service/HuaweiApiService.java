package com.suqi.center.machine.biz.service;

import com.suqi.center.machine.biz.dto.*;
import com.suqi.center.machine.dao.entity.PcpConfig;

public interface HuaweiApiService {
    HuaWeiAppResult batchRestart(PcpConfig pcpConfig, HuaWeiTaskParam huaWeiTaskParam);

    HuaWeiAppResult batchStop(PcpConfig pcpConfig, BatchStopRequest batchStopRequest);

    HuaWeiAppResult batchStorage(PcpConfig pcpConfig, BatchStorageRequest batchStorageRequest);

    HuaWeiAppResult batchRestore(PcpConfig pcpConfig, BatchRestoreRequest batchRestoreRequest);

    QueryJobResult queryJobResult(PcpConfig pcpConfig, String jobId);
}
