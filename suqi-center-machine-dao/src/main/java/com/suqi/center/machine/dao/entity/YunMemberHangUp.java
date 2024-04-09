package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.YunMemberHangUpQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberHangUpQueryWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberHangUpUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberHangUpUpdateWrapper;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * <p>
 * 商户挂机时长表
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("yun_member_hang_up")
@ApiModel(value = "YunMemberHangUp对象", description = "商户挂机时长表")
public class YunMemberHangUp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("商户id")
    @TableField("fk_member_id")
    private Long fkMemberId;

    @ApiModelProperty("房间session")
    @TableField("room_session")
    private String roomSession;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("玩家ID")
    @TableField("phone_id")
    private String phoneId;

    @ApiModelProperty("应用包名")
    @TableField("pkg")
    private String pkg;

    @ApiModelProperty("状态(0：已退出，5：in，10：out，15：idle)")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("挂机时长单位（秒）")
    @TableField("hang_up_time")
    private Long hangUpTime;

    @ApiModelProperty("挂机到期时间")
    @TableField("hang_up_maturity_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date hangUpMaturityTime;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("最近修改时间")
    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @TableField("version_id")
    private Long versionId;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 商户id
     */
    public Long getFkMemberId() {
        return fkMemberId;
    }

    /**
     * 商户id
     */
    public void setFkMemberId(Long fkMemberId) {
        this.fkMemberId = fkMemberId;
    }
    /**
     * 房间session
     */
    public String getRoomSession() {
        return roomSession;
    }

    /**
     * 房间session
     */
    public void setRoomSession(String roomSession) {
        this.roomSession = roomSession;
    }
    /**
     * 设备唯一码
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设备唯一码
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    /**
     * 玩家ID
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * 玩家ID
     */
    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }
    /**
     * 应用包名
     */
    public String getPkg() {
        return pkg;
    }

    /**
     * 应用包名
     */
    public void setPkg(String pkg) {
        this.pkg = pkg;
    }
    /**
     * 状态(0：已退出，5：in，10：out，15：idle)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态(0：已退出，5：in，10：out，15：idle)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 挂机时长单位（秒）
     */
    public Long getHangUpTime() {
        return hangUpTime;
    }

    /**
     * 挂机时长单位（秒）
     */
    public void setHangUpTime(Long hangUpTime) {
        this.hangUpTime = hangUpTime;
    }
    /**
     * 挂机到期时间
     */
    public Date getHangUpMaturityTime() {
        return hangUpMaturityTime;
    }

    /**
     * 挂机到期时间
     */
    public void setHangUpMaturityTime(Date hangUpMaturityTime) {
        this.hangUpMaturityTime = hangUpMaturityTime;
    }
    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * 最近修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最近修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    /**
     * 
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    /**
     * id
     */
    public static final String ID = "id";

    /**
     * 商户id
     */
    public static final String FK_MEMBER_ID = "fk_member_id";

    /**
     * 房间session
     */
    public static final String ROOM_SESSION = "room_session";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 玩家ID
     */
    public static final String PHONE_ID = "phone_id";

    /**
     * 应用包名
     */
    public static final String PKG = "pkg";

    /**
     * 状态(0：已退出，5：in，10：out，15：idle)
     */
    public static final String STATUS = "status";

    /**
     * 挂机时长单位（秒）
     */
    public static final String HANG_UP_TIME = "hang_up_time";

    /**
     * 挂机到期时间
     */
    public static final String HANG_UP_MATURITY_TIME = "hang_up_maturity_time";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最近修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 
     */
    public static final String VERSION_ID = "version_id";

    @Override
    public String toString() {
        return "YunMemberHangUp{" +
            "id=" + id +
            ", fkMemberId=" + fkMemberId +
            ", roomSession=" + roomSession +
            ", deviceId=" + deviceId +
            ", phoneId=" + phoneId +
            ", pkg=" + pkg +
            ", status=" + status +
            ", hangUpTime=" + hangUpTime +
            ", hangUpMaturityTime=" + hangUpMaturityTime +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", versionId=" + versionId +
        "}";
    }

    public YunMemberHangUpQueryEntityWrapper queryWrapper(){
        return YunMemberHangUpQueryEntityWrapper.wrapper(this);
    }

    public YunMemberHangUpUpdateEntityWrapper updateWrapper(){
        return YunMemberHangUpUpdateEntityWrapper.wrapper(this);
    }

    public static YunMemberHangUpQueryWrapper qWrapper(){
        return YunMemberHangUpQueryWrapper.wrapper();
    }

    public static YunMemberHangUpUpdateWrapper uWrapper(){
        return YunMemberHangUpUpdateWrapper.wrapper();
    }

}
