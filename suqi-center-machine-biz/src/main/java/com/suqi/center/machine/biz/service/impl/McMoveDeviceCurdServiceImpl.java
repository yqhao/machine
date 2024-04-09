package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.common.lock.annotations.ReadWriteLock;
import com.suqi.center.common.lock.annotations.RedisNx;
import com.suqi.center.common.utils.DateUtil;
import com.suqi.center.common.utils.ServiceContextOrgUtils;
import com.suqi.center.machine.api.dto.response.McMoveDeviceResult;
import com.suqi.center.machine.api.dto.response.McTaskInfoResult;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.IMoveDeviceStepState;
import com.suqi.center.machine.biz.service.moveimpl.MoveQueryServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.*;
import com.suqi.center.machine.dao.mapper.EmSocDevicesMapper;
import com.suqi.center.machine.dao.service.IMcMoveDeviceService;
import com.suqi.center.machine.dao.service.IMcMoveObsConfigService;
import com.suqi.center.machine.dao.service.IPcpDeviceService;
import com.suqi.center.machine.dao.service.IYunMemberDeviceService;
import com.suqi.center.machine.dao.service.impl.*;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceUpdateEntityWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import java.util.Date;
import java.util.UUID;

import com.suqi.center.machine.dao.entity.McMoveDevice;

/**
 * <p>
 * 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@DS(DBConstants.SHARDING)
@Service
@RefreshScope
public class McMoveDeviceCurdServiceImpl extends CurdService<McMoveDevice, Long, IMcMoveDeviceService> {

    protected static Logger log = LoggerFactory.getLogger(McMoveDeviceCurdServiceImpl.class);

    @Autowired
    IMoveDeviceStepState<McMoveDevice> iMoveDeviceStepState;

    @Autowired
    MoveQueryServiceImpl moveQueryService;

    @Autowired
    RoomServiceImpl roomService;

    //    @Value("${move.bucketName:backup-system-gz}")
    //    String bucketName = "backup-system-gz";
    @Value("${move.includeFiles:/data/app,/data/local,/data/media}")
    String moveIncludeFiles = "/data/app,/data/local,/data/media";

    @Value("${move.excludeFiles:}")
    String moveExcludeFiles = "";

    @Value("${spring.profiles.active:}")
    private String env;

    @Autowired
    EmSocDevicesMapper emSocDevicesMapper;

    @Autowired
    McMoveObsConfigServiceImpl mcMoveObsConfigService;

    @Autowired
    PcpConfigCurdServiceImpl pcpConfigCurdService;

    @Autowired
    EmSocDevicesServiceImpl emSocDevicesService;

    @Autowired
    YunMemberUserDeviceServiceImpl yunMemberUserDeviceService;

    @Override
    @ReadWriteLock(value = "#MethodName+#Args[0].userPhoneId", mode = ReadWriteLock.ReadWriteLockModel.W)
    @Retryable(maxAttempts = 1,backoff = @Backoff(100),include = DuplicateKeyException.class)
    public McMoveDevice insert(McMoveDevice mcMoveDevice) {
        log.info("新增换机记录：{}", mcMoveDevice);
        String userPhoneId = mcMoveDevice.getUserPhoneId();
        DevRoomPlayer devRoomPlayer = roomService.getRoomByUserPhoneId(userPhoneId);
        if (devRoomPlayer == null) {
            throw new BizException("userPhoneId房间记录不存在");
        }
        String currentUserId = ServiceContextOrgUtils.getCurrentUserId();
        if(currentUserId!=null && !devRoomPlayer.getFkMemberId().equals(Long.valueOf(currentUserId))){
            throw new BizException("非法访问");
        }
        if (ObjectUtils.isEmpty(mcMoveDevice.getFromDeviceId()) || mcMoveDevice.getFkMemberId() == null) {
            if (ObjectUtils.isEmpty(userPhoneId)) {
                throw new BizException("userPhoneId和fromDeviceId不能同时为空");
            } else {
                if (ObjectUtils.isEmpty(mcMoveDevice.getFromDeviceId())) {
                    mcMoveDevice.setFromDeviceId(devRoomPlayer.getDeviceId());
                }
                if (mcMoveDevice.getFkMemberId() == null) {
                    mcMoveDevice.setFkMemberId(devRoomPlayer.getFkMemberId());
                }
            }
        }
        long count = daoService.count(e -> e.userPhoneIdEq(userPhoneId).statusBetween(0, 23));
        if (count > 0) {
            throw new BizException("userPhoneId已存在换机任务");
        }
        EmSocDevices fromEmSocDevices = emSocDevicesService.getEmSocDevicesByDeviceId(mcMoveDevice.getFromDeviceId());
        Long fkPcpAreaId = pcpConfigCurdService.getFkPcpAreaId(mcMoveDevice);
        if (fkPcpAreaId == null) {
            fkPcpAreaId = fromEmSocDevices.getFkPcpAreaId();
        }
        Boolean dataMigration = mcMoveDevice.getDataMigration();
        boolean noMoveData = dataMigration == null || !dataMigration;
        boolean moveData = !noMoveData;
        PcpDevice fromPcpDevice = moveQueryService.getPcpDevice(mcMoveDevice.getFromDeviceId());
        if(moveData){
            //如果源机器不是华为云机拒绝执行
            Integer supplierType = fromEmSocDevices.getSupplierType();
            //pd.project_id not like 'youchuang%' and pd.project_id not like 'tengxun%' and pd.project_id not like 'baidu%'  and pd.project_id is not null
            if(supplierType!=null  && supplierType !=1){
                throw new BizException("创建迁移任务失败，当前云机不允许迁移数据");
            }
            if(fromPcpDevice!=null ){
                String projectId = fromPcpDevice.getProjectId();
                if(projectId==null || projectId.contains("youchuang") || projectId.contains("tengxun")  || projectId.contains("baidu")){
                    throw new BizException("创建迁移任务失败，当前云机不允许迁移数据");
                }
            }
        }

        Long finalFkPcpAreaId = fkPcpAreaId;
        Long totals = emSocDevicesMapper.fetchIdelDeviceTotals(mcMoveDevice.getFkMemberId(), mcMoveDevice.getSpecCode(), finalFkPcpAreaId, moveData);
        if (totals == null || totals == 0L) {
            if (noMoveData) {
                //不迁移数据，可不限制区域拿设备
                totals = emSocDevicesMapper.fetchIdelDeviceTotals(mcMoveDevice.getFkMemberId(), mcMoveDevice.getSpecCode(), null, moveData);
                if (totals == null || totals == 0L) {
                    ExceptionCode.NOT_AVAILABLE_MEMBER_DEVICE.throwBizException();
                }
            } else {
                ExceptionCode.NOT_AVAILABLE_MEMBER_DEVICE.throwBizException();
            }
        }
        McMoveObsConfig mcMoveObsConfig = mcMoveObsConfigService.selectOne(e -> e.fkMemberIdEq(mcMoveDevice.getFkMemberId()).fkPcpAreaIdEq(finalFkPcpAreaId));
        if (mcMoveObsConfig == null) {
            mcMoveObsConfig = mcMoveObsConfigService.selectOne(e -> e.fkMemberIdEq(0L).fkPcpAreaIdEq(finalFkPcpAreaId));
        }
        if (mcMoveObsConfig == null) {
            throw new BizException("当前区域迁移存储桶不支持");
        }
        if (ObjectUtils.isEmpty(mcMoveDevice.getFromPhoneId())) {
            if (fromPcpDevice != null) {
                mcMoveDevice.setFromPhoneId(fromPcpDevice.getPhoneId());
            }
        }
        if (!ObjectUtils.isEmpty(mcMoveDevice.getToDeviceId()) && ObjectUtils.isEmpty(mcMoveDevice.getToPhoneId())) {
            PcpDevice pcpDevice = moveQueryService.getPcpDevice(mcMoveDevice.getToDeviceId());
            if (pcpDevice != null) {
                mcMoveDevice.setToPhoneId(pcpDevice.getPhoneId());
            }
        }
        if (ObjectUtils.isEmpty(mcMoveDevice.getBucketName())) {
            mcMoveDevice.setBucketName(mcMoveObsConfig.getBucketName());
        }
        if (ObjectUtils.isEmpty(mcMoveDevice.getIncludeFiles()) && !ObjectUtils.isEmpty(mcMoveObsConfig.getMoveIncludeFiles())) {
            mcMoveDevice.setIncludeFiles(mcMoveObsConfig.getMoveIncludeFiles());
        } else if (ObjectUtils.isEmpty(mcMoveDevice.getIncludeFiles())) {
            mcMoveDevice.setIncludeFiles(moveIncludeFiles);
        }
        if (ObjectUtils.isEmpty(mcMoveDevice.getExcludeFiles()) && !ObjectUtils.isEmpty(mcMoveObsConfig.getMoveExcludeFiles())) {
            mcMoveDevice.setExcludeFiles(mcMoveObsConfig.getMoveExcludeFiles());
        } else if (ObjectUtils.isEmpty(mcMoveDevice.getExcludeFiles()) && !ObjectUtils.isEmpty(moveExcludeFiles)) {
            mcMoveDevice.setExcludeFiles(moveExcludeFiles);
        }
        if (ObjectUtils.isEmpty(mcMoveDevice.getObjectPath())) {
            StringBuilder op = new StringBuilder("movedevice/data/");
            op.append(env).append("/").append(userPhoneId).append("/").append(mcMoveDevice.getFromDeviceId().replaceAll("\\:", "_")).append("/").append(DateUtil.formatDateTime(new Date(), "yyyyMMddHHmmss")).append(".tar");
            mcMoveDevice.setObjectPath(op.toString().replaceAll(" ",""));
        }
        mcMoveDevice.setCreateTime(new Date());
        mcMoveDevice.setStatus(0);
        mcMoveDevice.setTaskId(UUID.randomUUID().toString().replaceAll("-",""));
        McMoveDevice rs = super.insert(mcMoveDevice);
        log.info("开始换机：{}", mcMoveDevice);
        //开始移机流程
        iMoveDeviceStepState.handler(mcMoveDevice);
        return rs;
    }

    @DS(DBConstants.SHARDING)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean update(McMoveDeviceUpdateEntityWrapper mcMoveDeviceUpdateEntityWrapper) {
        return daoService.update(mcMoveDeviceUpdateEntityWrapper);
    }

    public McTaskInfoResult taskResult(String taskId) {
        Assert.hasLength(taskId,"任务id不能为空");
        McMoveDevice mcMoveDevice = daoService.selectOne(q -> q.taskIdEq(taskId));
        if(mcMoveDevice==null){
            throw new BizException("任务不存在");
        }
        String currentUserId = ServiceContextOrgUtils.getCurrentUserId();
        if(currentUserId!=null && !mcMoveDevice.getFkMemberId().equals(Long.valueOf(currentUserId))){
            throw new BizException("非法访问");
        }
        Integer status = mcMoveDevice.getStatus();
        YunMemberUserDevice d = yunMemberUserDeviceService.selectOne(q -> q.userPhoneIdEq(mcMoveDevice.getUserPhoneId()));

        return McTaskInfoResult.builder()
                .userId(d.getUserId())
                .userPhoneId(mcMoveDevice.getUserPhoneId())
                .validStartTime(d.getValidStartTime()!=null?DateUtil.formatDateTime(d.getValidStartTime()):null)
                .validEndTime(d.getValidEndTime()!=null?DateUtil.formatDateTime(d.getValidEndTime()):null)
                .facilitiesId(d.getFacilitiesId())
                .buyTime(d.getBuyTime()!=null?DateUtil.formatDateTime(d.getBuyTime()):null)
                .lastRenewTime(d.getLastRenewTime()!=null?DateUtil.formatDateTime(d.getLastRenewTime()):null)
                .status(status ==50?2:(status <50 && status>=0?1:-1))
                .build();
    }

    public McMoveDeviceCurdServiceImpl() {
        super((e, id) -> {
            e.setId(id);
            e.setStatus(-50);
            e.setLastUpdateTime(new Date());
        });
    }

    @Override
    protected QueryWrapper<McMoveDevice> queryPageWrapper(McMoveDevice q) {
        return q.queryWrapper().//
        idEq().//商户id
        fkMemberIdEq().//
        userPhoneIdEq().//旧设备id
        fromDeviceIdEq().//旧云手机ID
        fromPhoneIdEq().//新设备id
        toDeviceIdEq().//新设备云手机ID
        toPhoneIdEq().//需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
        includeFilesLike().//不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。
        excludeFilesLike().//导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。
        bucketNameEq().//导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
        objectPathLike().//申请换机时间
        createTimeGe().//换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成
        statusEq().//最后任务id
        jobIdEq().//最后修改时间
        lastUpdateTimeGe().//
        specCodeEq().//重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）
        releaseUseEq().//是否迁移数据（false：不迁移，true：迁移）默认不迁移
        dataMigrationEq().//
        taskIdEq();
    }

    @Override
    protected Page<McMoveDevice> pageQuery(PageSet pageSet, QueryWrapper<McMoveDevice> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()), queryWrapper);
    }


}
