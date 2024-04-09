package com.suqi.center.machine.service;

import com.suqi.center.common.exception.BizException;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class UrlTest {

    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void urlValidTest() {
        String u = "https://tx-image-gz-1302307350.cos.ap-guangzhou.myqcloud.com/images/rk3588_docker-android10-userdebug-super.img-20230727.1203.tgz?q-sign-algorithm=sha1&q-ak=AKIDKqhiY3ITZcyx0AXXn2uEKhi4CRfDLn3zIbQD9AqE0Taus7l6OGqA_oLwBctbYWgS&q-sign-time=1690439661;1690443261&q-key-time=1690439661;1690443261&q-header-list=host&q-url-param-list=&q-signature=c8fc73fcab8c2015b12cd5112367fbab828a981a&x-cos-security-token=H6Ol7yTLhCBiv9DA4YPvpuiHPrk1ChFadab992a2907a67254f70588e357a6336t3MaS7wbh5zyex2Mh164xiLscnTf3pTrx6FXw45eseiDopna_XZCOeuFCVF_Ie91I-7wvo0y07tKO59YvIY9_ojABGKNyFgLapade7-8X9y5j1QWtlr9wEtmjA3v3VyG3UPvXzDodjwnIEXIqRK1ew-H2OPJYcjghA_xu6YSaF1oQUq8Pk-ffjG9uKVynQ3t";

        try {
            URL url = new URL(u);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            Map<String, List<String>> responseHeaders = connection.getHeaderFields();
            if(connection.getResponseCode()==200){

            }
            connection.disconnect();
            // 获取响应的状态码
        } catch (Throwable e) {
            throw new BizException("镜像地址已过期或地址错误：");
        }
    }
}
