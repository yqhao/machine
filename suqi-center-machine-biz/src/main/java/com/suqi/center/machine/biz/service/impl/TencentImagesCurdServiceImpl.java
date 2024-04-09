package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fast.fsyun.tencent.service.ClientConfig;
import com.fast.fsyun.tencent.service.TencentApiService;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.utils.PropUtils;
import com.suqi.center.machine.api.dto.request.BatchSetTencentDeviceImageParam;
import com.suqi.center.machine.dao.entity.*;
import com.suqi.center.machine.dao.service.*;
import com.suqi.center.machine.dao.wrapper.TencentDeviceAccessInfoQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentImagesQueryWrapper;
import com.tencentcloudapi.gs.v20191118.GsClient;
import com.tencentcloudapi.gs.v20191118.models.CreateCloudDevicesImageResponse;
import com.tencentcloudapi.gs.v20191118.models.DescribeCloudDevicesImagesResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 腾讯镜像管理 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@Service
public class TencentImagesCurdServiceImpl extends CurdService<TencentImages, Long, ITencentImagesService> {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    public TencentImagesCurdServiceImpl() {
        super((e, id) -> {
            e.setId(id);
            e.setStatus(-50);
            e.setLastUpdateTime(new Date());
        });
    }

    @Autowired
    IPcpAreaService iPcpAreaService;

    @Autowired
    ITencentAccountAreaService iTencentAccountAreaService;

    @Autowired
    ITencentAccountService iTencentAccountService;

    @Autowired
    ITencentDeviceAccessInfoService iTencentDeviceAccessInfoService;

    @Autowired
    ITencentDeviceService iTencentDeviceService;

    @Autowired
    ITencentImagesService iTencentImagesService;

    @Autowired
    ClientConfig clientConfig;

    @Autowired
    TencentApiService tencentApiService;

    @Autowired
    RestTemplate restTemplate;


    @Override
    public Result<Boolean> add(TencentImages tencentImages) {
        // TODO 待实现镜像创建状态
        String url = tencentImages.getUrl();
        String md5 = tencentImages.getMd5();
        String imageDescription = tencentImages.getImageDescription();
        logger.info("创建镜像参数url: {},MD5: {},imageDescription: {}", url, md5, imageDescription);

        long existSize = daoService.count(e -> e.urlEq(url).statusIn(1, 50));
        if(existSize>0){
            throw new BizException("镜像地址已存在");
        }
        existSize = daoService.count(e -> e.titleEq(tencentImages.getTitle()).statusIn(1, 50));
        if(existSize>0){
            throw new BizException("镜像名称已存在");
        }
        GsClient client = null;
        HttpURLConnection connection=null;
        try {
            URL req = new URL(url);
            connection = (HttpURLConnection) req.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            Map<String, List<String>> responseHeaders = connection.getHeaderFields();
            if(!String.valueOf(connection.getResponseCode()).startsWith("2")){
                throw new BizException("镜像地址已过期或地址错误："+connection.getResponseCode()+" "+connection.getResponseMessage());
            }
        } catch (Throwable e) {
            throw new BizException("镜像地址已过期或地址错误："+e.getMessage());
        }finally {
            if(connection!=null) {
                try {
                    connection.disconnect();
                } catch (Throwable e) {
                }
            }
        }
//        try {
//            ResponseEntity<Void> responseEntity = restTemplate.exchange(url, HttpMethod.HEAD, null, Void.class);
//            // 获取响应的状态码
//            HttpStatus statusCode = responseEntity.getStatusCode();
//            if(statusCode.is4xxClientError()){
//                throw new BizException("镜像地址已过期或地址错误："+statusCode.value()+" "+statusCode.getReasonPhrase());
//            }
//        } catch (HttpClientErrorException e) {
//            final HttpStatus statusCode = e.getStatusCode();
//            throw new BizException("镜像地址已过期或地址错误：" + statusCode.value() + " " + statusCode.getReasonPhrase());
//        }

        Long fkTencentAccountAreaId = tencentImages.getFkTencentAccountAreaId();
        if (fkTencentAccountAreaId != null) {
            TencentAccountArea tencentAccountArea = iTencentAccountAreaService.getBaseMapper().selectById(fkTencentAccountAreaId);
            TencentAccount tencentAccount = iTencentAccountService.getBaseMapper().selectById(tencentAccountArea.getFkTencentAccountId());
            if (tencentAccount != null) {
                client = clientConfig.getClient(tencentAccount.getSecretId(), tencentAccount.getSecretKey(), tencentAccount.getEndpoint(), tencentAccountArea.getRegion());
            }
        }
        if (client == null) {
            client = clientConfig.getClient();
        }

        CreateCloudDevicesImageResponse response = tencentApiService.createCloudDevicesImage(client, url, md5, imageDescription);
        logger.info("创建镜像返回：{}", DescribeCloudDevicesImagesResponse.toJsonString(response));
        tencentImages.setImageId(response.getImageId());
        tencentImages.setStatus(1);//镜像创建中,需要定时器获取镜像创建状态
        Result<Boolean> rs = new Result<>();
        boolean r = daoService.save(tencentImages);
        rs.setData(r);
        return rs;
    }


    public Result<Boolean> changeImageId(BatchSetTencentDeviceImageParam batchSetTencentDeviceImageParam) {
        Result<Boolean> rs = new Result<>(false);
        String imageId = batchSetTencentDeviceImageParam.getImageId();
        TencentImages tencentImages = daoService.getBaseMapper().selectOne(TencentImagesQueryWrapper.wrapper().imageIdEq(imageId));
        Integer status = tencentImages.getStatus();
        if (status == null || !status.equals(50)) {
            throw new RuntimeException("镜像状态不可使用，请等镜像创建成功后再设置云机重置镜像");
        }
        List<String> instanceIds = batchSetTencentDeviceImageParam.getInstanceIds();
        List<TencentDevice> tencentDevices = null;
        if (instanceIds != null && !instanceIds.isEmpty()) {
            tencentDevices = iTencentDeviceService.getBaseMapper().selectList(TencentDeviceQueryWrapper.wrapper().instanceIdIn(instanceIds));
        } else {
            List<String> publicIps = batchSetTencentDeviceImageParam.getPublicIps();
            if (publicIps != null) {
                List<TencentDeviceAccessInfo> tencentDeviceAccessInfos = iTencentDeviceAccessInfoService.getBaseMapper().selectList(((TencentDeviceAccessInfoQueryWrapper) TencentDeviceAccessInfoQueryWrapper.wrapper().select("DISTINCT  " + TencentDeviceAccessInfo.INSTANCE_ID)).publicIpIn(publicIps));
                List<String> instanceIdAll = PropUtils.distinctKeys(tencentDeviceAccessInfos, TencentDeviceAccessInfo::getInstanceId);
                if (instanceIdAll != null && !instanceIdAll.isEmpty()) {
                    tencentDevices = iTencentDeviceService.getBaseMapper().selectList(TencentDeviceQueryWrapper.wrapper().instanceIdIn(instanceIdAll));
                }
            }
        }

        if (tencentDevices != null && !tencentDevices.isEmpty()) {
            tencentDevices.forEach(e -> {
                TencentDevice up = new TencentDevice();
                up.setId(e.getId());
                up.setResetImageId(imageId);
                up.setLastUpdateTime(new Date());
                iTencentDeviceService.getBaseMapper().updateById(up);
            });
            rs.setData(true);
        }
        return rs;
    }

     @Override
    protected QueryWrapper<TencentImages> queryPageWrapper(TencentImages q) {
        return q.queryWrapper()
                    //
                    .idEq()
                    //腾讯账号区域Id
                    .fkTencentAccountAreaIdEq()
                    //
                    .regionEq()
                    //镜像名称
                    .titleEq()
                    //镜像版本
                    .versionCodeEq()
                    //镜像下载地址
                    .urlLike()
                    //镜像导出文件 MD5 校验值
                    .md5Eq()
                    //镜像描述
                    .imageDescriptionEq()
                    //镜像id
                    .imageIdEq()
                    //
                    .statusEq()
                    //
                    .createTimeGe()
                    //
                    .lastUpdateTimeGe()
                    //
                    .createUserIdEq()
                    //
                    .lastUpdateIdEq()
                ;
    }

    @Override
    public Result<Boolean> remove(Long id) {
        TencentImages i = daoService.getById(id);
        if(i==null){
            return Result.data(false,"记录不存在");
        }

        Integer status = i.getStatus();
        if(status ==-50){
            return Result.data(true);
        }

        if(status ==1){
            throw new BizException("创建中的镜像不允许删除");
        }

        String imageId = i.getImageId();
        long count = iTencentDeviceService.count(e -> e.resetImageIdEq(imageId));
        if(count>0){
            throw new BizException("不允许删除已经在绑定中的镜像id");
        }

        return super.remove(id);
    }
}