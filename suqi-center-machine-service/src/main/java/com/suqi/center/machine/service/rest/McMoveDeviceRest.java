package com.suqi.center.machine.service.rest;

import com.suqi.center.machine.api.dto.request.TaskQueryParam;
import com.suqi.center.machine.api.dto.response.McTaskInfoResult;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.api.dto.request.McMoveDeviceParam;
import com.suqi.center.machine.api.dto.response.McMoveDeviceResult;
import com.suqi.center.machine.api.query.IMcMoveDeviceApi;
import com.suqi.center.machine.biz.service.impl.McMoveDeviceCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 *  接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@Api(tags = {"换机接口"})
@RestController
@Validated
@RequestMapping("/v1/machine/McMoveDevice")
public class McMoveDeviceRest extends BaseRest<McMoveDeviceCurdServiceImpl, McMoveDevice,Long, McMoveDeviceResult, McMoveDeviceParam, IMcMoveDeviceApi> implements IMcMoveDeviceApi{

    @Override
    public McTaskInfoResult taskResult(TaskQueryParam taskQueryParam) {
        return service.taskResult(taskQueryParam.getTaskId());
    }

    @Override
    protected QueryWrapper<McMoveDevice> queryWrapper(McMoveDeviceParam q) {
        return McMoveDevice.qWrapper()
                    //
                    .idEq(q.getId())
                    //商户id
                    .fkMemberIdEq(q.getFkMemberId())
                    //
                    .userPhoneIdEq(q.getUserPhoneId())
                    //旧设备id
                    .fromDeviceIdEq(q.getFromDeviceId())
                    //旧云手机ID
                    .fromPhoneIdEq(q.getFromPhoneId())
                    //新设备id
                    .toDeviceIdEq(q.getToDeviceId())
                    //新设备云手机ID
                    .toPhoneIdEq(q.getToPhoneId())
                    //需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
                    .includeFilesLike(q.getIncludeFiles())
                    //不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。
                    .excludeFilesLike(q.getExcludeFiles())
                    //导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。
                    .bucketNameEq(q.getBucketName())
                    //导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
                    .objectPathLike(q.getObjectPath())
                    //申请换机时间
                    .createTimeGe(q.getCreateTime())
                    //申请换机时间结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：导出旧云机数据中，6：导出就云机数据失败，7：导出旧云机数据成功，8：恢复数据中，9：恢复数据失败，10：恢复成功，11：恢复关系数据失败，12：恢复关系数据成功，13：新云机退出维护模式失败，50：换机完成
                    .statusEq(q.getStatus())
                    //最后任务id
                    .jobIdEq(q.getJobId())
                    //最后修改时间
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //最后修改时间结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                    //重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）
                    .releaseUseEq(q.getRelease())
                ;
    }
}