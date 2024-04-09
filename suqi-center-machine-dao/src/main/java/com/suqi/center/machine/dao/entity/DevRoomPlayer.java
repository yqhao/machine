package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.DevRoomPlayerQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.DevRoomPlayerQueryWrapper;
import com.suqi.center.machine.dao.wrapper.DevRoomPlayerUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.DevRoomPlayerUpdateWrapper;
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
 * 设备房间成员记录表（dev_room_player）
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("dev_room_player")
@ApiModel(value = "DevRoomPlayer对象", description = "设备房间成员记录表（dev_room_player）")
public class DevRoomPlayer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("房间成员记录")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户设备表id")
    @TableField("fk_member_device_id")
    private Long fkMemberDeviceId;

    @ApiModelProperty("用户id")
    @TableField("fk_member_id")
    private Long fkMemberId;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("应用包名")
    @TableField("pkg")
    private String pkg;

    @ApiModelProperty("位置信息")
    @TableField("position")
    private String position;

    @ApiModelProperty("房间session")
    @TableField("room_session")
    private String roomSession;

    @ApiModelProperty("房间分享session")
    @TableField("room_share_session")
    private String roomShareSession;

    @ApiModelProperty("玩家session")
    @TableField("room_player_session")
    private String roomPlayerSession;

    @ApiModelProperty("玩家session到期时间")
    @TableField("play_session_expire_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date playSessionExpireTime;

    @ApiModelProperty("队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id")
    @TableField("queue_token")
    private String queueToken;

    @ApiModelProperty("玩家设备ID")
    @TableField("phone_id")
    private String phoneId;

    @ApiModelProperty("操作系统（android|ios）")
    @TableField("os")
    private String os;

    @ApiModelProperty("盒子服务类型(10：boxStream服务，20：boxRtc服务）")
    @TableField("server_type")
    private Integer serverType;

    @ApiModelProperty("登录状态（0：已退出，5：待进入，10：已进入）")
    @TableField("player_login_status")
    private Integer playerLoginStatus;

    @ApiModelProperty("信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）")
    @TableField("msg_report_type")
    private Integer msgReportType;

    @ApiModelProperty("房间成员角色（0：普通玩家，1：队长玩家）")
    @TableField("room_player_role")
    private Integer roomPlayerRole;

    @ApiModelProperty("房间继承者id")
    @TableField("heir_leader_id")
    private Long heirLeaderId;

    @ApiModelProperty("获取到设备时间")
    @TableField("fetch_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date fetchTime;

    @ApiModelProperty("记录时间")
    @TableField("login_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date loginTime;

    @ApiModelProperty("退出时间")
    @TableField("logout_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date logoutTime;

    @ApiModelProperty("设备空闲上报时间")
    @TableField("idle_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date idleTime;

    @ApiModelProperty("客户端streaming进入时间")
    @TableField("client_streaming_start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date clientStreamingStartTime;

    @ApiModelProperty("客户端streaming退出时间")
    @TableField("client_streaming_end_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date clientStreamingEndTime;

    @ApiModelProperty("版本id")
    @TableField("version_id")
    private Long versionId;

    @ApiModelProperty("房间类型（0：普通房间，1：小程序试玩房间）")
    @TableField("room_type")
    private Integer roomType;

    @ApiModelProperty("游族game_id")
    @TableField("game_id")
    private Integer gameId;

    @ApiModelProperty("游族session_id")
    @TableField("session_id")
    private String sessionId;

    /**
     * 房间成员记录
     */
    public Long getId() {
        return id;
    }

    /**
     * 房间成员记录
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 用户设备表id
     */
    public Long getFkMemberDeviceId() {
        return fkMemberDeviceId;
    }

    /**
     * 用户设备表id
     */
    public void setFkMemberDeviceId(Long fkMemberDeviceId) {
        this.fkMemberDeviceId = fkMemberDeviceId;
    }
    /**
     * 用户id
     */
    public Long getFkMemberId() {
        return fkMemberId;
    }

    /**
     * 用户id
     */
    public void setFkMemberId(Long fkMemberId) {
        this.fkMemberId = fkMemberId;
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
     * 位置信息
     */
    public String getPosition() {
        return position;
    }

    /**
     * 位置信息
     */
    public void setPosition(String position) {
        this.position = position;
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
     * 房间分享session
     */
    public String getRoomShareSession() {
        return roomShareSession;
    }

    /**
     * 房间分享session
     */
    public void setRoomShareSession(String roomShareSession) {
        this.roomShareSession = roomShareSession;
    }
    /**
     * 玩家session
     */
    public String getRoomPlayerSession() {
        return roomPlayerSession;
    }

    /**
     * 玩家session
     */
    public void setRoomPlayerSession(String roomPlayerSession) {
        this.roomPlayerSession = roomPlayerSession;
    }
    /**
     * 玩家session到期时间
     */
    public Date getPlaySessionExpireTime() {
        return playSessionExpireTime;
    }

    /**
     * 玩家session到期时间
     */
    public void setPlaySessionExpireTime(Date playSessionExpireTime) {
        this.playSessionExpireTime = playSessionExpireTime;
    }
    /**
     * 队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id
     */
    public String getQueueToken() {
        return queueToken;
    }

    /**
     * 队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id
     */
    public void setQueueToken(String queueToken) {
        this.queueToken = queueToken;
    }
    /**
     * 玩家设备ID
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * 玩家设备ID
     */
    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }
    /**
     * 操作系统（android|ios）
     */
    public String getOs() {
        return os;
    }

    /**
     * 操作系统（android|ios）
     */
    public void setOs(String os) {
        this.os = os;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public Integer getServerType() {
        return serverType;
    }

    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public void setServerType(Integer serverType) {
        this.serverType = serverType;
    }
    /**
     * 登录状态（0：已退出，5：待进入，10：已进入）
     */
    public Integer getPlayerLoginStatus() {
        return playerLoginStatus;
    }

    /**
     * 登录状态（0：已退出，5：待进入，10：已进入）
     */
    public void setPlayerLoginStatus(Integer playerLoginStatus) {
        this.playerLoginStatus = playerLoginStatus;
    }
    /**
     * 信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）
     */
    public Integer getMsgReportType() {
        return msgReportType;
    }

    /**
     * 信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）
     */
    public void setMsgReportType(Integer msgReportType) {
        this.msgReportType = msgReportType;
    }
    /**
     * 房间成员角色（0：普通玩家，1：队长玩家）
     */
    public Integer getRoomPlayerRole() {
        return roomPlayerRole;
    }

    /**
     * 房间成员角色（0：普通玩家，1：队长玩家）
     */
    public void setRoomPlayerRole(Integer roomPlayerRole) {
        this.roomPlayerRole = roomPlayerRole;
    }
    /**
     * 房间继承者id
     */
    public Long getHeirLeaderId() {
        return heirLeaderId;
    }

    /**
     * 房间继承者id
     */
    public void setHeirLeaderId(Long heirLeaderId) {
        this.heirLeaderId = heirLeaderId;
    }
    /**
     * 获取到设备时间
     */
    public Date getFetchTime() {
        return fetchTime;
    }

    /**
     * 获取到设备时间
     */
    public void setFetchTime(Date fetchTime) {
        this.fetchTime = fetchTime;
    }
    /**
     * 记录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 记录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
    /**
     * 退出时间
     */
    public Date getLogoutTime() {
        return logoutTime;
    }

    /**
     * 退出时间
     */
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }
    /**
     * 设备空闲上报时间
     */
    public Date getIdleTime() {
        return idleTime;
    }

    /**
     * 设备空闲上报时间
     */
    public void setIdleTime(Date idleTime) {
        this.idleTime = idleTime;
    }
    /**
     * 客户端streaming进入时间
     */
    public Date getClientStreamingStartTime() {
        return clientStreamingStartTime;
    }

    /**
     * 客户端streaming进入时间
     */
    public void setClientStreamingStartTime(Date clientStreamingStartTime) {
        this.clientStreamingStartTime = clientStreamingStartTime;
    }
    /**
     * 客户端streaming退出时间
     */
    public Date getClientStreamingEndTime() {
        return clientStreamingEndTime;
    }

    /**
     * 客户端streaming退出时间
     */
    public void setClientStreamingEndTime(Date clientStreamingEndTime) {
        this.clientStreamingEndTime = clientStreamingEndTime;
    }
    /**
     * 版本id
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 版本id
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }
    /**
     * 房间类型（0：普通房间，1：小程序试玩房间）
     */
    public Integer getRoomType() {
        return roomType;
    }

    /**
     * 房间类型（0：普通房间，1：小程序试玩房间）
     */
    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }
    /**
     * 游族game_id
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * 游族game_id
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }
    /**
     * 游族session_id
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * 游族session_id
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 房间成员记录
     */
    public static final String ID = "id";

    /**
     * 用户设备表id
     */
    public static final String FK_MEMBER_DEVICE_ID = "fk_member_device_id";

    /**
     * 用户id
     */
    public static final String FK_MEMBER_ID = "fk_member_id";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 应用包名
     */
    public static final String PKG = "pkg";

    /**
     * 位置信息
     */
    public static final String POSITION = "position";

    /**
     * 房间session
     */
    public static final String ROOM_SESSION = "room_session";

    /**
     * 房间分享session
     */
    public static final String ROOM_SHARE_SESSION = "room_share_session";

    /**
     * 玩家session
     */
    public static final String ROOM_PLAYER_SESSION = "room_player_session";

    /**
     * 玩家session到期时间
     */
    public static final String PLAY_SESSION_EXPIRE_TIME = "play_session_expire_time";

    /**
     * 队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id
     */
    public static final String QUEUE_TOKEN = "queue_token";

    /**
     * 玩家设备ID
     */
    public static final String PHONE_ID = "phone_id";

    /**
     * 操作系统（android|ios）
     */
    public static final String OS = "os";

    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public static final String SERVER_TYPE = "server_type";

    /**
     * 登录状态（0：已退出，5：待进入，10：已进入）
     */
    public static final String PLAYER_LOGIN_STATUS = "player_login_status";

    /**
     * 信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）
     */
    public static final String MSG_REPORT_TYPE = "msg_report_type";

    /**
     * 房间成员角色（0：普通玩家，1：队长玩家）
     */
    public static final String ROOM_PLAYER_ROLE = "room_player_role";

    /**
     * 房间继承者id
     */
    public static final String HEIR_LEADER_ID = "heir_leader_id";

    /**
     * 获取到设备时间
     */
    public static final String FETCH_TIME = "fetch_time";

    /**
     * 记录时间
     */
    public static final String LOGIN_TIME = "login_time";

    /**
     * 退出时间
     */
    public static final String LOGOUT_TIME = "logout_time";

    /**
     * 设备空闲上报时间
     */
    public static final String IDLE_TIME = "idle_time";

    /**
     * 客户端streaming进入时间
     */
    public static final String CLIENT_STREAMING_START_TIME = "client_streaming_start_time";

    /**
     * 客户端streaming退出时间
     */
    public static final String CLIENT_STREAMING_END_TIME = "client_streaming_end_time";

    /**
     * 版本id
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 房间类型（0：普通房间，1：小程序试玩房间）
     */
    public static final String ROOM_TYPE = "room_type";

    /**
     * 游族game_id
     */
    public static final String GAME_ID = "game_id";

    /**
     * 游族session_id
     */
    public static final String SESSION_ID = "session_id";

    @Override
    public String toString() {
        return "DevRoomPlayer{" +
            "id=" + id +
            ", fkMemberDeviceId=" + fkMemberDeviceId +
            ", fkMemberId=" + fkMemberId +
            ", deviceId=" + deviceId +
            ", pkg=" + pkg +
            ", position=" + position +
            ", roomSession=" + roomSession +
            ", roomShareSession=" + roomShareSession +
            ", roomPlayerSession=" + roomPlayerSession +
            ", playSessionExpireTime=" + playSessionExpireTime +
            ", queueToken=" + queueToken +
            ", phoneId=" + phoneId +
            ", os=" + os +
            ", serverType=" + serverType +
            ", playerLoginStatus=" + playerLoginStatus +
            ", msgReportType=" + msgReportType +
            ", roomPlayerRole=" + roomPlayerRole +
            ", heirLeaderId=" + heirLeaderId +
            ", fetchTime=" + fetchTime +
            ", loginTime=" + loginTime +
            ", logoutTime=" + logoutTime +
            ", idleTime=" + idleTime +
            ", clientStreamingStartTime=" + clientStreamingStartTime +
            ", clientStreamingEndTime=" + clientStreamingEndTime +
            ", versionId=" + versionId +
            ", roomType=" + roomType +
            ", gameId=" + gameId +
            ", sessionId=" + sessionId +
        "}";
    }

    public DevRoomPlayerQueryEntityWrapper queryWrapper(){
        return DevRoomPlayerQueryEntityWrapper.wrapper(this);
    }

    public DevRoomPlayerUpdateEntityWrapper updateWrapper(){
        return DevRoomPlayerUpdateEntityWrapper.wrapper(this);
    }

    public static DevRoomPlayerQueryWrapper qWrapper(){
        return DevRoomPlayerQueryWrapper.wrapper();
    }

    public static DevRoomPlayerUpdateWrapper uWrapper(){
        return DevRoomPlayerUpdateWrapper.wrapper();
    }

}
