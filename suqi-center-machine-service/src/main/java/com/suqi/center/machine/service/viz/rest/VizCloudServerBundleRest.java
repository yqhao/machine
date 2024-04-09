package com.suqi.center.machine.service.viz.rest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.machine.api.viz.dto.request.AddOrUpdMcServiceSoftwarePackageParam;
import com.suqi.center.machine.api.viz.dto.request.McServiceSoftwarePackageParam;
import com.suqi.center.machine.api.viz.dto.request.OssTmpUploadParam;
import com.suqi.center.machine.api.viz.dto.request.ReportOssUploadResultParam;
import com.suqi.center.machine.api.viz.dto.response.McServiceSoftwarePackageResult;
import com.suqi.center.machine.api.viz.dto.response.OssServerBundleRecordResult;
import com.suqi.center.machine.api.viz.dto.response.ServerBundleOssTmpUploadResult;
import com.suqi.center.machine.api.viz.query.IVizCloudServerBundleApi;
import com.suqi.center.machine.biz.viz.service.VizCloudServerBundleRestService;
import com.suqi.center.machine.service.rest.BaseApiController;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 云机端软件包表 接口
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
@Api(tags = {"云机端软件包接口"})
@RestController
@Validated
@RequestMapping("/viz/v1/cloud/server/bundle")
public class VizCloudServerBundleRest extends BaseApiController implements IVizCloudServerBundleApi {


    @Resource
    VizCloudServerBundleRestService vizCloudServerBundleRestService;

    @Override
    public Result<Page<McServiceSoftwarePackageResult>> page(McServiceSoftwarePackageParam param) {
        return rest(()->vizCloudServerBundleRestService.page(param));
    }

    @Override
    public Result<List<McServiceSoftwarePackageResult>> list(McServiceSoftwarePackageParam param) {
        return rest(()->vizCloudServerBundleRestService.list(param));
    }

    @Override
    public Result<Boolean> addOrUpd(AddOrUpdMcServiceSoftwarePackageParam param) {
        return rest(()->vizCloudServerBundleRestService.addOrUpd(param));
    }

    @Override
    public Result<List<OssServerBundleRecordResult>> getOssRecord(Long id) {
        return rest(()->{
            if(id == null){
                throw new BizException("记录Id不能为空");
            }
            return vizCloudServerBundleRestService.getOssRecord(id);
        });
    }

    @Override
    public Result<ServerBundleOssTmpUploadResult> getOssTmpUpload(OssTmpUploadParam param) {
        return rest(()->vizCloudServerBundleRestService.getOssTmpUpload(param));
    }

    @Override
    public Result<Boolean> reportOssUploadResult(ReportOssUploadResultParam param) {
        return rest(()->vizCloudServerBundleRestService.reportOssUploadResult(param));
    }
}