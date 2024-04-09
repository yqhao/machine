package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.dto.request.McSmnRecordParam;
import com.suqi.center.machine.biz.service.SmnRecordService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.McSmnRecord;
import com.suqi.center.machine.dao.service.IMcSmnRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 华为smn消息记录实现层
 * @version 1.0
 * @date 2023/4/19 16:29
 */
@Service
@Slf4j
public class SmnRecordServiceImpl implements SmnRecordService {

    @Resource
    IMcSmnRecordService iMcSmnRecordService;

    @Override
    @DS(DBConstants.SHARDING)
    public Boolean save(McSmnRecordParam param) {
        Boolean isOk = true;
        McSmnRecord mcSmnRecord = new McSmnRecord();
        mcSmnRecord.setMessageId(param.getMessageId());
        mcSmnRecord.setTopicUrn(param.getTopicUrn());
        mcSmnRecord.setMsg(param.getMsg());
        mcSmnRecord.setProcessStatus(param.getProcessStatus());
        mcSmnRecord.setRetryCount(param.getRetryCount());
        mcSmnRecord.setCreateTime(SystemClock.date());
        mcSmnRecord.setVersionId(0L);
        mcSmnRecord.setFailMessage(param.getFailMessage());
        try {
            isOk = iMcSmnRecordService.save(mcSmnRecord);
        }catch (Exception e){
            e.printStackTrace();
            log.error(e.getMessage(), e);
        }
        return isOk;
    }
}
