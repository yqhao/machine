package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceCmdRebootLastRecordQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceCmdRebootLastRecordQueryWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceCmdRebootLastRecordUpdateWrapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Administrator
 * @since 2023-12-20
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("em_soc_device_cmd_reboot_last_record")
@ApiModel(value = "EmSocDeviceCmdRebootLastRecord对象", description = "")
public class EmSocDeviceCmdRebootLastRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("最后下发重启指令的时间(非云机重连上报的时间)")
    @TableField("last_cmd_reboot")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastCmdReboot;

    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）")
    @TableField("opt_role")
    private Integer optRole;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    /**
     * 最后下发重启指令的时间(非云机重连上报的时间)
     */
    public Date getLastCmdReboot() {
        return lastCmdReboot;
    }

    /**
     * 最后下发重启指令的时间(非云机重连上报的时间)
     */
    public void setLastCmdReboot(Date lastCmdReboot) {
        this.lastCmdReboot = lastCmdReboot;
    }
    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * 1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机
     */
    public Integer getType() {
        return type;
    }

    /**
     * 1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机
     */
    public void setType(Integer type) {
        this.type = type;
    }
    /**
     * 操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）
     */
    public Integer getOptRole() {
        return optRole;
    }

    /**
     * 操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）
     */
    public void setOptRole(Integer optRole) {
        this.optRole = optRole;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 最后下发重启指令的时间(非云机重连上报的时间)
     */
    public static final String LAST_CMD_REBOOT = "last_cmd_reboot";

    /**
     * 
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机
     */
    public static final String TYPE = "type";

    /**
     * 操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）
     */
    public static final String OPT_ROLE = "opt_role";

    @Override
    public String toString() {
        return "EmSocDeviceCmdRebootLastRecord{" +
            "id=" + id +
            ", deviceId=" + deviceId +
            ", lastCmdReboot=" + lastCmdReboot +
            ", createTime=" + createTime +
            ", type=" + type +
            ", optRole=" + optRole +
        "}";
    }

    public EmSocDeviceCmdRebootLastRecordQueryEntityWrapper queryWrapper(){
        return EmSocDeviceCmdRebootLastRecordQueryEntityWrapper.wrapper(this);
    }

    public EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper updateWrapper(){
        return EmSocDeviceCmdRebootLastRecordUpdateEntityWrapper.wrapper(this);
    }

    public static EmSocDeviceCmdRebootLastRecordQueryWrapper qWrapper(){
        return EmSocDeviceCmdRebootLastRecordQueryWrapper.wrapper();
    }

    public static EmSocDeviceCmdRebootLastRecordUpdateWrapper uWrapper(){
        return EmSocDeviceCmdRebootLastRecordUpdateWrapper.wrapper();
    }

}
