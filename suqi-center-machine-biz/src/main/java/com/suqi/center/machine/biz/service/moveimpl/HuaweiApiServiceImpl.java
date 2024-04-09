package com.suqi.center.machine.biz.service.moveimpl;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.suqi.center.machine.biz.dto.*;
import com.suqi.center.machine.biz.service.HuaweiApiService;
import com.suqi.center.machine.biz.utils.huawei.HuaweiRequestUtil;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.core.redis.util.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HuaweiApiServiceImpl implements HuaweiApiService {
    protected static Logger log = LoggerFactory.getLogger(HuaweiApiServiceImpl.class);


    @Override
    public HuaWeiAppResult batchRestart(PcpConfig pcpConfig, HuaWeiTaskParam huaWeiTaskParam) {
        String url = new StringBuilder(pcpConfig.getEndpointPhonesUrl()).append("/v1/")
                .append(pcpConfig.getProjectId())
                .append("/cloud-phone/phones/batch-restart")
                .toString();

        HuaWeiBatchRestartRequest huaWeiBatchRestartRequest = new HuaWeiBatchRestartRequest();
        HuaWeiBatchRestartRequest.PhonesBean phonesBean = new HuaWeiBatchRestartRequest.PhonesBean();
        phonesBean.setPhone_id(huaWeiTaskParam.getPhoneId());
        huaWeiBatchRestartRequest.setPhones(Arrays.asList(phonesBean));
        log.info("重启传输数据为：{}" , JsonUtil.objectToJson(huaWeiBatchRestartRequest));

        if (StringUtils.isNoneBlank(pcpConfig.getAccessKeyId()) && StringUtils.isNoneBlank(pcpConfig.getSecretAccessKey())) {
            return HuaweiRequestUtil.postJson(url, pcpConfig, huaWeiBatchRestartRequest, HuaWeiAppResult.class);
        } else {
            HttpResponse httpResponse = HttpRequest.post(url)
                    .header("Content-Type", "application/json")
                    .header("X-Auth-Token", pcpConfig.getToken())
                    .body(JsonUtil.objectToJson(huaWeiBatchRestartRequest))
                    .timeout(20000)//超时，毫秒
                    .setReadTimeout(10000)
                    .execute();
            log.info("重启response数据为：{}" , httpResponse.body());
            if (httpResponse.isOk()) {
                return JsonUtil.jsonToPojo(httpResponse.body(), HuaWeiAppResult.class);
            }
        }
        return null;
    }

    /**
     * 关机
     * @param pcpConfig
     * @param batchStopRequest
     * @return
     */
    @Override
    public HuaWeiAppResult batchStop(PcpConfig pcpConfig, BatchStopRequest batchStopRequest) {
        String url = new StringBuilder(pcpConfig.getEndpointPhonesUrl()).append("/v1/")
                .append(pcpConfig.getProjectId())
                .append("/cloud-phone/phones/batch-stop")
                .toString();

        log.info("华为关机传输数据为：{}" ,JsonUtil.objectToJson(batchStopRequest));

        if (StringUtils.isNoneBlank(pcpConfig.getAccessKeyId()) && StringUtils.isNoneBlank(pcpConfig.getSecretAccessKey())) {
            return HuaweiRequestUtil.postJson(url, pcpConfig, batchStopRequest, HuaWeiAppResult.class);
        } else {
            HttpResponse httpResponse = HttpRequest.post(url)
                    .header("Content-Type", "application/json")
                    .header("X-Auth-Token", pcpConfig.getToken())
                    .body(JsonUtil.objectToJson(batchStopRequest))
                    .timeout(20000)//超时，毫秒
                    .setReadTimeout(10000)
                    .execute();
            log.info("华为关机response数据为：{}" , httpResponse.body());
            if (httpResponse.isOk()) {
                return JsonUtil.jsonToPojo(httpResponse.body(), HuaWeiAppResult.class);
            }
        }
        return null;
    }

    /**
     * 导出云手机数据
     * @param pcpConfig
     * @param batchStorageRequest
     * @return
     */
    @Override
    public HuaWeiAppResult batchStorage(PcpConfig pcpConfig, BatchStorageRequest batchStorageRequest) {
        String url = new StringBuilder(pcpConfig.getEndpointPhonesUrl()).append("/v1/")
                .append(pcpConfig.getProjectId())
                .append("/cloud-phone/phones/batch-storage")
                .toString();

        log.info("华为导出云手机数据传输数据为：{}" ,JsonUtil.objectToJson(batchStorageRequest));

        if (StringUtils.isNoneBlank(pcpConfig.getAccessKeyId()) && StringUtils.isNoneBlank(pcpConfig.getSecretAccessKey())) {
            return HuaweiRequestUtil.postJson(url, pcpConfig, batchStorageRequest, HuaWeiAppResult.class);
        } else {
            HttpResponse httpResponse = HttpRequest.post(url)
                    .header("Content-Type", "application/json")
                    .header("X-Auth-Token", pcpConfig.getToken())
                    .body(JsonUtil.objectToJson(batchStorageRequest))
                    .timeout(20000)//超时，毫秒
                    .setReadTimeout(10000)
                    .execute();
            log.info("华为导出云手机数据response数据为：{}" , httpResponse.body());
            if (httpResponse.isOk()) {
                return JsonUtil.jsonToPojo(httpResponse.body(), HuaWeiAppResult.class);
            }
        }
        return null;
    }


    /**
     * 恢复云手机数据
     * @param pcpConfig
     * @param batchRestoreRequest
     * @return
     */
    @Override
    public HuaWeiAppResult batchRestore(PcpConfig pcpConfig, BatchRestoreRequest batchRestoreRequest) {
        String url = new StringBuilder(pcpConfig.getEndpointPhonesUrl()).append("/v1/")
                .append(pcpConfig.getProjectId())
                .append("/cloud-phone/phones/batch-restore")
                .toString();

        log.info("华为恢复云手机数据传输数据为：{}" ,JsonUtil.objectToJson(batchRestoreRequest));

        if (StringUtils.isNoneBlank(pcpConfig.getAccessKeyId()) && StringUtils.isNoneBlank(pcpConfig.getSecretAccessKey())) {
            return HuaweiRequestUtil.postJson(url, pcpConfig, batchRestoreRequest, HuaWeiAppResult.class);
        } else {
            HttpResponse httpResponse = HttpRequest.post(url)
                    .header("Content-Type", "application/json")
                    .header("X-Auth-Token", pcpConfig.getToken())
                    .body(JsonUtil.objectToJson(batchRestoreRequest))
                    .timeout(20000)//超时，毫秒
                    .setReadTimeout(10000)
                    .execute();
            log.info("华为恢复云手机数据response数据为：{}" , httpResponse.body());
            if (httpResponse.isOk()) {
                return JsonUtil.jsonToPojo(httpResponse.body(), HuaWeiAppResult.class);
            }
        }
        return null;
    }


    @Override
    public QueryJobResult queryJobResult(PcpConfig pcpConfig, String jobId) {
        String url = new StringBuilder(pcpConfig.getEndpointPhonesUrl()).append("/v1/")
                .append(pcpConfig.getProjectId())
                .append("/cloud-phone/jobs/"+jobId)
                .toString();
        log.info("华为查询job：{}" , jobId);
        log.info("华为查询url：{}" , url);
        if (StringUtils.isNoneBlank(pcpConfig.getAccessKeyId()) && StringUtils.isNoneBlank(pcpConfig.getSecretAccessKey())) {
            return HuaweiRequestUtil.get(url, pcpConfig, QueryJobResult.class);
        } else {
            HttpResponse httpResponse = HttpRequest.get(url)
                    //.header("Content-Type", "application/json")
                    .header("X-Auth-Token", pcpConfig.getToken())
                    .timeout(20000)//超时，毫秒
                    .setReadTimeout(10000)
                    .execute();
            log.info("华为查询job:{},response数据为：{}" ,jobId, httpResponse.body());
            if (httpResponse.isOk()) {
                return JsonUtil.jsonToPojo(httpResponse.body(), QueryJobResult.class);
            }
        }
        return null;
    }
}
