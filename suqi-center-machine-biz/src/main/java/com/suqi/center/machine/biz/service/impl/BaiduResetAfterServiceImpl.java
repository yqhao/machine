package com.suqi.center.machine.biz.service.impl;


import com.suqi.center.common.utils.JsonUtil;
import com.suqi.center.machine.api.dto.request.BaiduDeviceParam;
import com.suqi.center.machine.dao.entity.BaiduAccount;
import com.suqi.center.machine.dao.entity.BaiduDevice;
import com.suqi.center.machine.dao.service.IBaiduAccountService;
import com.suqi.center.machine.dao.service.IBaiduDeviceService;
import com.suqi.center.machine.dao.service.IBaiduImagesService;
import com.suqi.core.baidu.dto.*;
import com.suqi.core.baidu.service.BaiduApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.Date;

@Service
public class BaiduResetAfterServiceImpl {
    protected static Logger log = LoggerFactory.getLogger(BaiduResetAfterServiceImpl.class);

    @Autowired
    IBaiduImagesService baiduImagesService;

    @Autowired
    BaiduApiService baiduApiService;

    @Autowired
    IBaiduAccountService baiduAccountService;

    @Autowired
    IBaiduDeviceService baiduDeviceService;

    @Autowired
    BaiduDeviceCurdServiceImpl baiduDeviceCurdService;


    public void recoverResetFail(BaiduDevice t) {

        log.info("恢复重置失败百度云机：{}", t.getCode());
        BaiduDeviceParam baiduDeviceParam = new BaiduDeviceParam();
        baiduDeviceParam.setId(t.getId());
        baiduDeviceCurdService.reset(baiduDeviceParam);
    }


    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,rollbackFor = Throwable.class)
    public void syncResetStatus(BaiduDevice t) {
        BaiduAccount a = getBaiduAccount(t);
        BaiduTaskRequest btr = new BaiduTaskRequest();
        btr.setConditions(Arrays.asList(BaiduTaskRequest.Condition.builder().key("uid").value(t.getResetTastUid()).build()));
        BaiduTaskQueryParamRequest query = new BaiduTaskQueryParamRequest(t.getGroupCode());
        BaiduTaskResponse task = baiduApiService.task(a.getHost(), a.getBearerToken(), query, btr);
        String status = task.getData().getContent().get(0).getStatus();
        //            status	状态，init:刚创建 working: 执行中 finish: 完成 error: 错误
        int resetStatus = status.equals("finish") ? 3 : (status.equals("error") ? 2 : 1);
        if (resetStatus == 3) {
            //升级镜像
            upgradeImage(t, a);
        } else if (resetStatus != 1) {
            //修改状态为成功
            baiduDeviceService.update(u -> u.setResetStatus(resetStatus).setLastUpdateTime(new Date()).idEq(t.getId()));
        }
    }

    public final BaiduAccount getBaiduAccount(BaiduDevice t) {
        return baiduAccountService.getById(t.getFkBaiduAccountId());
    }

    public void upgradeImage(BaiduDevice t) {
        BaiduAccount a = getBaiduAccount(t);
        upgradeImage(t, a);
    }

    public void upgradeImage(BaiduDevice t, BaiduAccount a) {

        BaiduAospUploadRequest bur = new BaiduAospUploadRequest();
        bur.setImageVersionId(ObjectUtils.isEmpty(t.getResetImageVersionId()) ? t.getImageVersionId() : t.getResetImageVersionId());
        bur.setCodes(Arrays.asList(t.getCode()));
        if (ObjectUtils.isEmpty(bur.getImageVersionId())) {
            log.error("百度云机：{}镜像版本不存在，无法更新百度进行", t.getCode());
            return;
        }
        log.info("百度更新镜像任务请求：{}", bur);
        BaiduAospUploadResponse response = baiduApiService.aospUpload(a.getHost(), a.getBearerToken(), bur);
        String json = JsonUtil.objectToJson(response);
        log.info("百度更新镜像任务返回：{}", json);
        String taskId = String.valueOf(response.getData().get(0).getTaskId());
        baiduDeviceService.update(u -> u.setResetStatus(4).setUploadImageTaskId(taskId).setUploadResponse(json).setLastUpdateTime(new Date()).idEq(t.getId()));
    }

    public void syncUpgradeStatus(BaiduDevice t) {
        BaiduAccount a = getBaiduAccount(t);
        BaiduAospUploadResultRequest brr = new BaiduAospUploadResultRequest();
        brr.setTaskIds(Arrays.asList(t.getUploadImageTaskId()));
        log.info("百度更新镜像任务结果请求：{}", brr);
        BaiduAospUploadResultResponse r = baiduApiService.aospUploadResult(a.getHost(), a.getBearerToken(), brr);
        String json = JsonUtil.objectToJson(r);
        log.info("百度更新镜像任务结果返回：{}", json);
        Integer taskStatus = r.getData().get(0).getTaskStatus();
        if (taskStatus == 7 || taskStatus == 8) {
            baiduDeviceService.update(u -> u.setResetStatus(taskStatus == 7 ? 6 : 5).setLastUpdateTime(new Date()).idEq(t.getId()));
        }

    }

}
