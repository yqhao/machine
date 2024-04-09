package com.suqi.center.machine.biz.schedule;

import com.fast.fsyun.tencent.service.ClientConfig;
import com.fast.fsyun.tencent.service.TencentApiService;
import com.suqi.center.common.lock.annotations.TraceId;
import com.suqi.center.common.utils.DateUtil;
import com.suqi.center.common.utils.JsonUtil;
import com.suqi.center.machine.dao.entity.*;
import com.suqi.center.machine.dao.service.*;
import com.suqi.center.machine.dao.wrapper.BaiduImagesQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentImagesQueryWrapper;
import com.suqi.core.baidu.dto.BaiduAospImageUploadResultRequest;
import com.suqi.core.baidu.dto.BaiduAospImageUploadResultResponse;
import com.suqi.core.baidu.service.BaiduApiService;
import com.tencentcloudapi.gs.v20191118.GsClient;
import com.tencentcloudapi.gs.v20191118.models.CloudDevicesImage;
import com.tencentcloudapi.gs.v20191118.models.DescribeCloudDevicesImagesResponse;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

@Component
@EnableScheduling
@RefreshScope
public class ImageCreateResultTask {
    private static Logger log = LoggerFactory.getLogger(ImageCreateResultTask.class);

    @Autowired
    ITencentImagesService iTencentImagesService;

    @Autowired
    ITencentAccountService iTencentAccountService;

    @Autowired
    ClientConfig clientConfig;

    @Autowired
    ITencentAccountAreaService iTencentAccountAreaService;

    @Autowired
    TencentApiService tencentApiService;

    @Value("${createImageTimeOut:1}")
    int createImageTimeOut=1;

    @Value("${createBaiduImageTimeOut:1}")
    int createBaiduImageTimeOut=1;

    @Autowired
    IBaiduImagesService baiduImagesService;

    @Autowired
    BaiduApiService baiduApiService;

    @Autowired
    IBaiduAccountService iBaiduAccountService;


    /**
     * 镜像状态同步任务（Bean模式）
     */
    @XxlJob("suqi-center-machine/ImageCreateResultTask.imageSyncJobHandler")
    @TraceId
    public void imageSyncJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, 镜像状态同步任务.");
        iTencentImagesService.pageConsumer(50, TencentImagesQueryWrapper.wrapper().statusEq(1).createTimeGe(DateUtil.addDay(new Date(), -1)), t -> {
            TencentAccountArea tencentAccountArea = iTencentAccountAreaService.getBaseMapper().selectById(t.getFkTencentAccountAreaId());
            TencentAccount tencentAccount = iTencentAccountService.getBaseMapper().selectById(tencentAccountArea.getFkTencentAccountId());
            GsClient client = clientConfig.getClient(tencentAccount.getSecretId(), tencentAccount.getSecretKey(), tencentAccount.getEndpoint(), tencentAccountArea.getRegion());
            if (client == null) {
                client = clientConfig.getClient();
            }
            DescribeCloudDevicesImagesResponse describeCloudDevicesImagesResponse = tencentApiService.describeCloudDevicesImages(client);
            Optional<CloudDevicesImage> first = Arrays.stream(describeCloudDevicesImagesResponse.getImageSet()).filter(a -> a.getImageId().equals(t.getImageId())).findFirst();
            first.ifPresentOrElse(e -> {
                if ("NORMAL".equals(e.getImageState())) {
                    TencentImages up = new TencentImages();
                    up.setStatus(50);
                    up.setLastUpdateId(0L);
                    up.setLastUpdateTime(new Date());
                    iTencentImagesService.getBaseMapper().update(up, TencentImages.uWrapper().idEq(t.getId()).statusEq(t.getStatus()));
                }
            },()->{
                //创建镜像超时检测
                if (t.getCreateTime().before(DateUtil.addHours(new Date(),-createImageTimeOut))) {
                    TencentImages up = new TencentImages();
                    up.setStatus(-40);//超时
                    up.setLastUpdateId(0L);
                    up.setLastUpdateTime(new Date());
                    iTencentImagesService.getBaseMapper().update(up, TencentImages.uWrapper().idEq(t.getId()).statusEq(t.getStatus()));
                }
            });

        });
    }

    @XxlJob("suqi-center-machine/ImageCreateResultTask.baiduImageSyncJobHandler")
    @TraceId
    //@Scheduled(cron = "0/3 * * * * *")
    public void baiduImageSyncJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, 百度镜像状态同步任务.");
        baiduImagesService.pageConsumer(50, BaiduImagesQueryWrapper.wrapper().statusIn(0,1).createTimeGe(DateUtil.addDay(new Date(), -1)), t -> {
            BaiduAccount account = iBaiduAccountService.getById(t.getFkBaiduAccountId());
            BaiduAospImageUploadResultRequest req = BaiduAospImageUploadResultRequest.builder().imageVersionIds(Arrays.asList(t.getImageVersionId())).build();
            log.info("百度查询镜像创建结果参数：{}", JsonUtil.objectToJson(req));
            BaiduAospImageUploadResultResponse response =  baiduApiService.imageUploadResult(account.getHost(), account.getBearerToken(), req);
            log.info("百度查询镜像创建结果返回：{}", JsonUtil.objectToJson(response));
            ArrayList<BaiduAospImageUploadResultResponse.Data> data = response.getData();
            if(data!=null && !data.isEmpty()){
                BaiduAospImageUploadResultResponse.Data d = data.get(0);
                if(d!=null){
                    String imageUploadStatus = d.getImageUploadStatus();
                    if(imageUploadStatus!=null ){
                        Integer status = Integer.valueOf(imageUploadStatus);
                        if(t.getStatus()==null || !t.getStatus().equals(status)){
                            BaiduImages up = new BaiduImages();
                            up.setStatus(status);
                            up.setLastUpdateTime(new Date());
                            baiduImagesService.getBaseMapper().update(up, t.updateWrapper().idEq().statusEq());
                        }
                    }
                }
            }
            //创建镜像超时检测
            if (t.getCreateTime().before(DateUtil.addHours(new Date(),-createBaiduImageTimeOut))) {
                BaiduImages up = new BaiduImages();
                up.setStatus(-40);//超时
                up.setLastUpdateTime(new Date());
                baiduImagesService.getBaseMapper().update(up, t.updateWrapper().idEq().statusEq());
            }

        });
    }
}
