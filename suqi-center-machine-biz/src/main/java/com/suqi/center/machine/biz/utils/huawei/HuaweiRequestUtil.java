
package com.suqi.center.machine.biz.utils.huawei;

import com.cloud.apigateway.sdk.utils.Client;
import com.cloud.apigateway.sdk.utils.Request;
import com.suqi.center.common.rest.RestUtil;
import com.suqi.center.common.utils.JsonUtil;
import com.suqi.center.machine.dao.entity.PcpConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


@Slf4j
public class HuaweiRequestUtil {
	

	public static <T> T postJson(String url, PcpConfig pcpConfig, Object req, Class<T> responseClass) {
		if (pcpConfig == null || isEmpty(pcpConfig.getEndpointPhonesUrl())) {
			log.error("账号信息错误：{}", pcpConfig);
			return null;
		}

		Request request = new Request();
		try {
			//Set the AK/SK to sign and authenticate the request.
			request.setKey(pcpConfig.getAccessKeyId());
			request.setSecret(pcpConfig.getSecretAccessKey());
			//The following example shows how to set the request URL and parameters to query a VPC list.
			//Specify a request method, such as GET, PUT, POST, DELETE, HEAD, and PATCH.
			request.setMethod("POST");
			//Set a request URL in the format of https://{Endpoint}/{URI}.
			LinkedHashMap<String, String> map = RestUtil.urlSplit(url);
			request.setUrl(RestUtil.urlTrimParam(url));
			if (map != null && !map.isEmpty()) {
				Set<Map.Entry<String, String>> entrySet = map.entrySet();
				for (Map.Entry<String, String> entry : entrySet) {
					request.addQueryStringParam(entry.getKey(), entry.getValue());
				}
			}
			//Set parameters for the request URL.
			//request.addQueryStringParam("limit", "2");
			//Add header parameters, for example, X-Domain-Id for invoking a global service and X-Project-Id for invoking a project-level service.
			request.addHeader("X-Project-Id", pcpConfig.getProjectId());
			//Add a body if you have äÝc²Ē the PUT or POST method. Special characters, such as the double quotation mark ("), contained in the body must be escaped.
			//request.setBody("demo");
			if (req != null) {
				request.setBody(JsonUtil.objectToJson(req));
			}
			//setBody只支持string类型
			try (CloseableHttpClient client = HttpClients.custom().build();) {
				HttpRequestBase signedRequest = Client.sign(request);
				HttpResponse httpResponse = client.execute(signedRequest);
				log.info("{}",httpResponse.getStatusLine());
				Header[] resHeaders = httpResponse.getAllHeaders();
				for (Header h : resHeaders) {
					log.debug("{}:{}", h.getName(), h.getValue());
				}
				HttpEntity resEntity = httpResponse.getEntity();
				if (resEntity != null) {
					log.debug("ak sk 华为请求：{}，参数：{}", url, request);
					String rx = EntityUtils.toString(resEntity, "UTF-8");
					log.info("ak sk 华为返回数据：{}", rx);
					T response = JsonUtil.jsonToPojo(rx, responseClass);
					return response;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage(), e);
		}
		return null;
	}

	public static <T> T get(String url, PcpConfig pcpConfig, Class<T> responseClass) {
		if (pcpConfig == null || isEmpty(pcpConfig.getEndpointPhonesUrl())) {
			log.error("账号信息错误：{}", pcpConfig);
			return null;
		}

		Request request = new Request();
		try {
			//Set the AK/SK to sign and authenticate the request.
			request.setKey(pcpConfig.getAccessKeyId());
			request.setSecret(pcpConfig.getSecretAccessKey());
			//The following example shows how to set the request URL and parameters to query a VPC list.
			//Specify a request method, such as GET, PUT, POST, DELETE, HEAD, and PATCH.
			request.setMethod("GET");
			//Set a request URL in the format of https://{Endpoint}/{URI}.
			LinkedHashMap<String, String> map = RestUtil.urlSplit(url);
			request.setUrl(RestUtil.urlTrimParam(url));
			if (map != null && !map.isEmpty()) {
				Set<Map.Entry<String, String>> entrySet = map.entrySet();
				for (Map.Entry<String, String> entry : entrySet) {
					request.addQueryStringParam(entry.getKey(), entry.getValue());
				}
			}
			//Set parameters for the request URL.
			//request.addQueryStringParam("limit", "2");
			//Add header parameters, for example, X-Domain-Id for invoking a global service and X-Project-Id for invoking a project-level service.
			request.addHeader("X-Project-Id", pcpConfig.getProjectId());
			//Add a body if you have äÝc²Ē the PUT or POST method. Special characters, such as the double quotation mark ("), contained in the body must be escaped.
			//request.setBody("demo");
			//setBody只支持string类型
			try (CloseableHttpClient client = HttpClients.custom().build();) {
				HttpRequestBase signedRequest = Client.sign(request);
				HttpResponse httpResponse = client.execute(signedRequest);
				log.info("{}",httpResponse.getStatusLine());
				Header[] resHeaders = httpResponse.getAllHeaders();
				for (Header h : resHeaders) {
					log.debug("{}:{}", h.getName(), h.getValue());
				}
				HttpEntity resEntity = httpResponse.getEntity();
				if (resEntity != null) {
					log.debug("ak sk 华为请求：{}，参数：{}", url, request);
					String rx = EntityUtils.toString(resEntity, "UTF-8");
					log.info("ak sk 华为返回数据：{}", rx);
					T response = JsonUtil.jsonToPojo(rx, responseClass);
					return response;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage(), e);
		}
		return null;
	}

	public static final boolean isEmpty(String content) {
		return content == null || "".equals(content.trim());
	}
}
