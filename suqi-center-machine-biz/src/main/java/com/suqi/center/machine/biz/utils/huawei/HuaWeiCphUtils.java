package com.suqi.center.machine.biz.utils.huawei;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONUtil;
import com.suqi.center.machine.biz.dto.HuaWeiAppResult;
import com.suqi.center.machine.biz.dto.HuaWeiBatchRestartRequest;
import com.suqi.center.machine.biz.dto.HuaWeiTaskParam;
import com.suqi.center.machine.dao.entity.PcpConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @version 1.0
 * @date 2023/5/8 10:46
 */
@Slf4j
public class HuaWeiCphUtils {

    /**
     * Content-Type
     * 发送的实体的MIME类型。推荐用户默认使用application/json，有其他取值时会在具体接口中专门说明。
     */
    public final static  String CONTENT_TYPE = "application/json";

    /**
     * 重启
     */
    public static HuaWeiAppResult batchRestart(PcpConfig pcpConfig, HuaWeiTaskParam huaWeiTaskParam) {
        String url = new StringBuilder(pcpConfig.getEndpointPhonesUrl()).append("/v1/").append(pcpConfig.getProjectId()).append("/cloud-phone/phones/batch-restart").toString();

        HuaWeiBatchRestartRequest huaWeiBatchRestartRequest = new HuaWeiBatchRestartRequest();
        HuaWeiBatchRestartRequest.PhonesBean phonesBean = new HuaWeiBatchRestartRequest.PhonesBean();
        phonesBean.setPhone_id(huaWeiTaskParam.getPhoneId());
        huaWeiBatchRestartRequest.setPhones(Arrays.asList(phonesBean));
        logInfo("重启","传输数据为："+ JSONUtil.toJsonStr(huaWeiBatchRestartRequest));

        if(StringUtils.isNoneBlank(pcpConfig.getAccessKeyId()) && StringUtils.isNoneBlank(pcpConfig.getSecretAccessKey())) {
            return HuaweiRequestUtil.postJson(url, pcpConfig, huaWeiBatchRestartRequest, HuaWeiAppResult.class);
        }else {
            HttpResponse httpResponse = HttpRequest.post(url)
                    .header("Content-Type",CONTENT_TYPE)
                    .header("X-Auth-Token",pcpConfig.getToken())
                    .body(JSONUtil.toJsonStr(huaWeiBatchRestartRequest))
                    .timeout(20000)//超时，毫秒
                    .execute();
            logInfo("重启","response数据为："+httpResponse.body());
            if(httpResponse.isOk()){
                HuaWeiAppResult huaWeiAppResult = JSONUtil.toBean(httpResponse.body(),HuaWeiAppResult.class);
                return huaWeiAppResult;
            }
        }
        return null;
    }


    public static final boolean isEmpty(String content) {
        return content == null || "".equals(content.trim());
    }

    private static void logInfo(String name ,String logInfo){
        log.info("HuaWei：接口{}：{}",name,logInfo);
    }
}
