package com.suqi.center.machine.biz.service.moveimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.common.enums.PlayerLoginStatusEnum;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.MoveDeviceService;
import com.suqi.center.machine.biz.service.MoveStatusService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.*;
import com.suqi.center.machine.dao.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class MoveCloudPhoneRelationServiceImpl {

    @Autowired
    IYunMemberDeviceService yunMemberDeviceService;

    @Autowired
    IEmSocDevicesService iEmSocDevicesService;

    @Autowired
    IEmSocDeviceExtendService iEmSocDeviceExtendService;

    @Autowired
    IDevRoomPlayerService iDevRoomPlayerService;

    @Autowired
    IYunMemberHangUpService iYunMemberHangUpService;

    @Autowired
    MoveStatusService moveStatusService;

    @Autowired
    MoveDeviceService moveDeviceService;

    /**
     * 修改用户设备关系
     * @param mcMoveDevice
     * @return
     */
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean changeRelation(McMoveDevice mcMoveDevice) {

        updateYunMemberDeviceRelation(mcMoveDevice);

        updateEmSocDeviceExtend(mcMoveDevice);

        String toDeviceId = mcMoveDevice.getToDeviceId();
        YunMemberDevice yunMemberDevice = yunMemberDeviceService.selectOne(e -> e.deviceIdEq(toDeviceId).statusEq(50));

        String roomSession = getSessioin(mcMoveDevice,yunMemberDevice);

        Long fkYunMemberDeviceId = yunMemberDevice.getId();
        String userPhoneId =mcMoveDevice.getUserPhoneId();

        updateDevRoomPlayer(toDeviceId, userPhoneId, roomSession, fkYunMemberDeviceId);

        updateYunMemberHangUp(toDeviceId, userPhoneId);
        EmSocDevices toDevice = iEmSocDevicesService.selectOne(e -> e.deviceIdEq(toDeviceId));
        setToEmSocDeviceExtend(toDeviceId, toDevice);

        moveStatusService.updateStatus(mcMoveDevice, MoveStateEnum.step_15_recovery_data_relation_succeed);
        Boolean dataMigration = mcMoveDevice.getDataMigration();
        boolean noMoveData = dataMigration == null || !dataMigration;
        if(noMoveData){
            //不迁移数据不会重启，需要退出维护模式
            moveDeviceService.exitMaint(mcMoveDevice.getToDeviceId());
        }

        return true;
    }

    private void setToEmSocDeviceExtend(String toDeviceId, EmSocDevices toDevice) {
        EmSocDeviceExtend emSocDeviceExtendExist = iEmSocDeviceExtendService.selectOne(e -> e.deviceIdEq(toDeviceId));
        if(emSocDeviceExtendExist==null) {
            EmSocDeviceExtend emSocDeviceExtend = new EmSocDeviceExtend();
            emSocDeviceExtend.setFkEmSocDevicesId(toDevice.getId());
            emSocDeviceExtend.setDeviceId(toDeviceId);
            emSocDeviceExtend.setHangUpStatus(1);
            emSocDeviceExtend.setCreateTime(SystemClock.date());
            emSocDeviceExtend.setVersionId(0L);
            iEmSocDeviceExtendService.save(emSocDeviceExtend);
        }else if (emSocDeviceExtendExist.getHangUpStatus()==null || !emSocDeviceExtendExist.getHangUpStatus().equals(1)){
            EmSocDeviceExtend esdeUp =new EmSocDeviceExtend();
            esdeUp.setId(emSocDeviceExtendExist.getId());
            esdeUp.setHangUpStatus(1);
            esdeUp.setLastUpdateTime(new Date());
            iEmSocDeviceExtendService.updateById(esdeUp);
        }
    }

    private void updateYunMemberHangUp(String toDeviceId, String userPhoneId) {
        List<YunMemberHangUp> ymhUOldList = iYunMemberHangUpService.select(e -> e.phoneIdEq(userPhoneId).statusNe(0));
        if (ymhUOldList != null && !ymhUOldList.isEmpty()) {
            ymhUOldList.forEach(ymhUOld -> {
                YunMemberHangUp ymhU = new YunMemberHangUp();
                ymhU.setId(ymhUOld.getId());
                ymhU.setDeviceId(toDeviceId);
                iYunMemberHangUpService.updateById(ymhU);
            });
        }
    }

    private void updateDevRoomPlayer(String toDeviceId, String userPhoneId, String roomSession, Long fkYunMemberDeviceId) {
        List<DevRoomPlayer> drpUpOldLists = iDevRoomPlayerService.select(e -> e.phoneIdEq(userPhoneId).roomSessionEq(roomSession));
        if (drpUpOldLists != null && !drpUpOldLists.isEmpty()) {
            drpUpOldLists.forEach(drpUpOld -> {
                DevRoomPlayer drpUp = new DevRoomPlayer();
                drpUp.setId(drpUpOld.getId());
                drpUp.setFkMemberDeviceId(fkYunMemberDeviceId);
                drpUp.setDeviceId(toDeviceId);
                iDevRoomPlayerService.updateById(drpUp);
            });
        }
    }

    public void updateYunMemberDeviceRelation(McMoveDevice mcMoveDevice) {

        updateYunMemberDeviceToRelation(mcMoveDevice);
        updateYunMemberDeviceFromRelation(mcMoveDevice);

    }

    private void updateYunMemberDeviceToRelation(McMoveDevice mcMoveDevice) {
        String fromDeviceId = mcMoveDevice.getFromDeviceId();
        String toDeviceId = mcMoveDevice.getToDeviceId();

        YunMemberDevice yunMemberDevice = yunMemberDeviceService.selectOne(e -> e.deviceIdEq(toDeviceId).statusEq(50));
        YunMemberDevice yunMemberDeviceUp = new YunMemberDevice();
        if (yunMemberDevice != null) {
            yunMemberDeviceUp.setId(yunMemberDevice.getId());
        }
        //新机器设置排队
        yunMemberDeviceUp.setServiceBizType(0);
        //用户设备分配状态（未分配：0，已分配：1）
        yunMemberDeviceUp.setAllotStatus(1);
        YunMemberDevice from = yunMemberDeviceService.selectOne(e -> e.deviceIdEq(fromDeviceId).statusEq(50));
        yunMemberDeviceUp.setRoomSession(from.getRoomSession());
        yunMemberDeviceUp.setRoomPeopleMaxNum(from.getRoomPeopleMaxNum());
        yunMemberDeviceUp.setRoomPeopleTotalNum(from.getRoomPeopleTotalNum());
        yunMemberDeviceUp.setServerType(from.getServerType());
        if (yunMemberDevice != null) {
            yunMemberDeviceService.updateById(yunMemberDeviceUp);
        } else {
            yunMemberDeviceService.save(yunMemberDeviceUp);
        }
    }

    private void updateYunMemberDeviceFromRelation(McMoveDevice mcMoveDevice) {
        String fromDeviceId = mcMoveDevice.getFromDeviceId();
        YunMemberDevice yunMemberDevice = yunMemberDeviceService.selectOne(e -> e.deviceIdEq(fromDeviceId).statusEq(50));
        YunMemberDevice yunMemberDeviceUp = new YunMemberDevice();
        if (yunMemberDevice != null) {
            yunMemberDeviceUp.setId(yunMemberDevice.getId());
        }
        //yunMemberDeviceUp.setServiceBizType(0); //此处不修改，待最后修改

        yunMemberDeviceUp.setRoomSession("del_"+yunMemberDevice.getRoomSession());//不能设置为空标记为一个不可用的RoomSession
        yunMemberDeviceUp.setRoomPeopleMaxNum(0);
        yunMemberDeviceUp.setRoomPeopleTotalNum(0);
        yunMemberDeviceUp.setAllotStatus(0);//用户设备分配状态（未分配：0，已分配：1）
        if (yunMemberDevice != null) {
            yunMemberDeviceService.updateById(yunMemberDeviceUp);
        } else {
            yunMemberDeviceService.save(yunMemberDeviceUp);
        }
    }

    private void updateEmSocDeviceExtend(McMoveDevice mcMoveDevice) {
        String fromDeviceId = mcMoveDevice.getFromDeviceId();
        EmSocDeviceExtend old = iEmSocDeviceExtendService.selectOne(e -> e.deviceIdEq(fromDeviceId));
        EmSocDeviceExtend emSocDeviceExtendUp = new EmSocDeviceExtend();
        emSocDeviceExtendUp.setId(old.getId());
        emSocDeviceExtendUp.setHangUpStatus(0);
        emSocDeviceExtendUp.setLastUpdateTime(new Date());
        iEmSocDeviceExtendService.updateById(emSocDeviceExtendUp);
    }

    private String getSessioin(McMoveDevice mcMoveDevice,YunMemberDevice yunMemberDevice) {
        String session = null;
        session = yunMemberDevice.getRoomSession();
        Long fkMemberId = yunMemberDevice.getFkMemberId();
        String userPhoneId =mcMoveDevice.getUserPhoneId();
        DevRoomPlayer devRoomPlayer = iDevRoomPlayerService.selectOne(e -> e.phoneIdEq(userPhoneId).playerLoginStatusIn(Arrays.asList(PlayerLoginStatusEnum.TOBEENTERED.getValue(), PlayerLoginStatusEnum.Entered.getValue(), PlayerLoginStatusEnum.OUTER.getValue())));
        if (session == null) {
            YunMemberHangUp yunMemberHangUp = iYunMemberHangUpService.selectOne(e -> e.phoneIdEq(userPhoneId).statusNe(0));
            if (yunMemberHangUp != null) {
                session = yunMemberHangUp.getRoomSession();
            } else {
                if (devRoomPlayer != null) {
                    session = devRoomPlayer.getRoomSession();
                }
            }
        }
        return session;
    }
}
