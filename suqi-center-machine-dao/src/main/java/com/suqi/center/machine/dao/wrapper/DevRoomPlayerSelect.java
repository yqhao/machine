package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 设备房间成员记录表（dev_room_player）
 * </p>
 * "dev_room_player"
 * @author PC001
 */
public class DevRoomPlayerSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public DevRoomPlayerSelect columns(){
        set.add("id");
        set.add("fk_member_device_id");
        set.add("fk_member_id");
        set.add("device_id");
        set.add("pkg");
        set.add("position");
        set.add("room_session");
        set.add("room_share_session");
        set.add("room_player_session");
        set.add("play_session_expire_time");
        set.add("queue_token");
        set.add("phone_id");
        set.add("os");
        set.add("server_type");
        set.add("player_login_status");
        set.add("msg_report_type");
        set.add("room_player_role");
        set.add("heir_leader_id");
        set.add("fetch_time");
        set.add("login_time");
        set.add("logout_time");
        set.add("idle_time");
        set.add("client_streaming_start_time");
        set.add("client_streaming_end_time");
        set.add("version_id");
        set.add("room_type");
        set.add("game_id");
        set.add("session_id");
        return this;
    }

    public DevRoomPlayerSelect id(){
        set.add("id");
        return this;
    }

    public DevRoomPlayerSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public DevRoomPlayerSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public DevRoomPlayerSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public DevRoomPlayerSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public DevRoomPlayerSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public DevRoomPlayerSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public DevRoomPlayerSelect fkMemberDeviceId(){
        set.add("fk_member_device_id");
        return this;
    }

    public DevRoomPlayerSelect excludeFkMemberDeviceId(){
        excludeSet.add("fk_member_device_id");
        return this;
    }

    public DevRoomPlayerSelect avgFkMemberDeviceId(){
        set.add("avg(fk_member_device_id) as fk_member_device_id");
        return this;
    }

    public DevRoomPlayerSelect countFkMemberDeviceId(){
        set.add("count(fk_member_device_id) as fk_member_device_id");
        return this;
    }

    public DevRoomPlayerSelect minFkMemberDeviceId(){
        set.add("min(fk_member_device_id) as fk_member_device_id");
        return this;
    }

    public DevRoomPlayerSelect maxFkMemberDeviceId(){
        set.add("max(fk_member_device_id) as fk_member_device_id");
        return this;
    }

    public DevRoomPlayerSelect sumFkMemberDeviceId(){
        set.add("sum(fk_member_device_id) as fk_member_device_id");
        return this;
    }
    public DevRoomPlayerSelect fkMemberId(){
        set.add("fk_member_id");
        return this;
    }

    public DevRoomPlayerSelect excludeFkMemberId(){
        excludeSet.add("fk_member_id");
        return this;
    }

    public DevRoomPlayerSelect avgFkMemberId(){
        set.add("avg(fk_member_id) as fk_member_id");
        return this;
    }

    public DevRoomPlayerSelect countFkMemberId(){
        set.add("count(fk_member_id) as fk_member_id");
        return this;
    }

    public DevRoomPlayerSelect minFkMemberId(){
        set.add("min(fk_member_id) as fk_member_id");
        return this;
    }

    public DevRoomPlayerSelect maxFkMemberId(){
        set.add("max(fk_member_id) as fk_member_id");
        return this;
    }

    public DevRoomPlayerSelect sumFkMemberId(){
        set.add("sum(fk_member_id) as fk_member_id");
        return this;
    }
    public DevRoomPlayerSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public DevRoomPlayerSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public DevRoomPlayerSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public DevRoomPlayerSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public DevRoomPlayerSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public DevRoomPlayerSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public DevRoomPlayerSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public DevRoomPlayerSelect pkg(){
        set.add("pkg");
        return this;
    }

    public DevRoomPlayerSelect excludePkg(){
        excludeSet.add("pkg");
        return this;
    }

    public DevRoomPlayerSelect avgPkg(){
        set.add("avg(pkg) as pkg");
        return this;
    }

    public DevRoomPlayerSelect countPkg(){
        set.add("count(pkg) as pkg");
        return this;
    }

    public DevRoomPlayerSelect minPkg(){
        set.add("min(pkg) as pkg");
        return this;
    }

    public DevRoomPlayerSelect maxPkg(){
        set.add("max(pkg) as pkg");
        return this;
    }

    public DevRoomPlayerSelect sumPkg(){
        set.add("sum(pkg) as pkg");
        return this;
    }
    public DevRoomPlayerSelect position(){
        set.add("position");
        return this;
    }

    public DevRoomPlayerSelect excludePosition(){
        excludeSet.add("position");
        return this;
    }

    public DevRoomPlayerSelect avgPosition(){
        set.add("avg(position) as position");
        return this;
    }

    public DevRoomPlayerSelect countPosition(){
        set.add("count(position) as position");
        return this;
    }

    public DevRoomPlayerSelect minPosition(){
        set.add("min(position) as position");
        return this;
    }

    public DevRoomPlayerSelect maxPosition(){
        set.add("max(position) as position");
        return this;
    }

    public DevRoomPlayerSelect sumPosition(){
        set.add("sum(position) as position");
        return this;
    }
    public DevRoomPlayerSelect roomSession(){
        set.add("room_session");
        return this;
    }

    public DevRoomPlayerSelect excludeRoomSession(){
        excludeSet.add("room_session");
        return this;
    }

    public DevRoomPlayerSelect avgRoomSession(){
        set.add("avg(room_session) as room_session");
        return this;
    }

    public DevRoomPlayerSelect countRoomSession(){
        set.add("count(room_session) as room_session");
        return this;
    }

    public DevRoomPlayerSelect minRoomSession(){
        set.add("min(room_session) as room_session");
        return this;
    }

    public DevRoomPlayerSelect maxRoomSession(){
        set.add("max(room_session) as room_session");
        return this;
    }

    public DevRoomPlayerSelect sumRoomSession(){
        set.add("sum(room_session) as room_session");
        return this;
    }
    public DevRoomPlayerSelect roomShareSession(){
        set.add("room_share_session");
        return this;
    }

    public DevRoomPlayerSelect excludeRoomShareSession(){
        excludeSet.add("room_share_session");
        return this;
    }

    public DevRoomPlayerSelect avgRoomShareSession(){
        set.add("avg(room_share_session) as room_share_session");
        return this;
    }

    public DevRoomPlayerSelect countRoomShareSession(){
        set.add("count(room_share_session) as room_share_session");
        return this;
    }

    public DevRoomPlayerSelect minRoomShareSession(){
        set.add("min(room_share_session) as room_share_session");
        return this;
    }

    public DevRoomPlayerSelect maxRoomShareSession(){
        set.add("max(room_share_session) as room_share_session");
        return this;
    }

    public DevRoomPlayerSelect sumRoomShareSession(){
        set.add("sum(room_share_session) as room_share_session");
        return this;
    }
    public DevRoomPlayerSelect roomPlayerSession(){
        set.add("room_player_session");
        return this;
    }

    public DevRoomPlayerSelect excludeRoomPlayerSession(){
        excludeSet.add("room_player_session");
        return this;
    }

    public DevRoomPlayerSelect avgRoomPlayerSession(){
        set.add("avg(room_player_session) as room_player_session");
        return this;
    }

    public DevRoomPlayerSelect countRoomPlayerSession(){
        set.add("count(room_player_session) as room_player_session");
        return this;
    }

    public DevRoomPlayerSelect minRoomPlayerSession(){
        set.add("min(room_player_session) as room_player_session");
        return this;
    }

    public DevRoomPlayerSelect maxRoomPlayerSession(){
        set.add("max(room_player_session) as room_player_session");
        return this;
    }

    public DevRoomPlayerSelect sumRoomPlayerSession(){
        set.add("sum(room_player_session) as room_player_session");
        return this;
    }
    public DevRoomPlayerSelect playSessionExpireTime(){
        set.add("play_session_expire_time");
        return this;
    }

    public DevRoomPlayerSelect excludePlaySessionExpireTime(){
        excludeSet.add("play_session_expire_time");
        return this;
    }

    public DevRoomPlayerSelect avgPlaySessionExpireTime(){
        set.add("avg(play_session_expire_time) as play_session_expire_time");
        return this;
    }

    public DevRoomPlayerSelect countPlaySessionExpireTime(){
        set.add("count(play_session_expire_time) as play_session_expire_time");
        return this;
    }

    public DevRoomPlayerSelect minPlaySessionExpireTime(){
        set.add("min(play_session_expire_time) as play_session_expire_time");
        return this;
    }

    public DevRoomPlayerSelect maxPlaySessionExpireTime(){
        set.add("max(play_session_expire_time) as play_session_expire_time");
        return this;
    }

    public DevRoomPlayerSelect sumPlaySessionExpireTime(){
        set.add("sum(play_session_expire_time) as play_session_expire_time");
        return this;
    }
    public DevRoomPlayerSelect queueToken(){
        set.add("queue_token");
        return this;
    }

    public DevRoomPlayerSelect excludeQueueToken(){
        excludeSet.add("queue_token");
        return this;
    }

    public DevRoomPlayerSelect avgQueueToken(){
        set.add("avg(queue_token) as queue_token");
        return this;
    }

    public DevRoomPlayerSelect countQueueToken(){
        set.add("count(queue_token) as queue_token");
        return this;
    }

    public DevRoomPlayerSelect minQueueToken(){
        set.add("min(queue_token) as queue_token");
        return this;
    }

    public DevRoomPlayerSelect maxQueueToken(){
        set.add("max(queue_token) as queue_token");
        return this;
    }

    public DevRoomPlayerSelect sumQueueToken(){
        set.add("sum(queue_token) as queue_token");
        return this;
    }
    public DevRoomPlayerSelect phoneId(){
        set.add("phone_id");
        return this;
    }

    public DevRoomPlayerSelect excludePhoneId(){
        excludeSet.add("phone_id");
        return this;
    }

    public DevRoomPlayerSelect avgPhoneId(){
        set.add("avg(phone_id) as phone_id");
        return this;
    }

    public DevRoomPlayerSelect countPhoneId(){
        set.add("count(phone_id) as phone_id");
        return this;
    }

    public DevRoomPlayerSelect minPhoneId(){
        set.add("min(phone_id) as phone_id");
        return this;
    }

    public DevRoomPlayerSelect maxPhoneId(){
        set.add("max(phone_id) as phone_id");
        return this;
    }

    public DevRoomPlayerSelect sumPhoneId(){
        set.add("sum(phone_id) as phone_id");
        return this;
    }
    public DevRoomPlayerSelect os(){
        set.add("os");
        return this;
    }

    public DevRoomPlayerSelect excludeOs(){
        excludeSet.add("os");
        return this;
    }

    public DevRoomPlayerSelect avgOs(){
        set.add("avg(os) as os");
        return this;
    }

    public DevRoomPlayerSelect countOs(){
        set.add("count(os) as os");
        return this;
    }

    public DevRoomPlayerSelect minOs(){
        set.add("min(os) as os");
        return this;
    }

    public DevRoomPlayerSelect maxOs(){
        set.add("max(os) as os");
        return this;
    }

    public DevRoomPlayerSelect sumOs(){
        set.add("sum(os) as os");
        return this;
    }
    public DevRoomPlayerSelect serverType(){
        set.add("server_type");
        return this;
    }

    public DevRoomPlayerSelect excludeServerType(){
        excludeSet.add("server_type");
        return this;
    }

    public DevRoomPlayerSelect avgServerType(){
        set.add("avg(server_type) as server_type");
        return this;
    }

    public DevRoomPlayerSelect countServerType(){
        set.add("count(server_type) as server_type");
        return this;
    }

    public DevRoomPlayerSelect minServerType(){
        set.add("min(server_type) as server_type");
        return this;
    }

    public DevRoomPlayerSelect maxServerType(){
        set.add("max(server_type) as server_type");
        return this;
    }

    public DevRoomPlayerSelect sumServerType(){
        set.add("sum(server_type) as server_type");
        return this;
    }
    public DevRoomPlayerSelect playerLoginStatus(){
        set.add("player_login_status");
        return this;
    }

    public DevRoomPlayerSelect excludePlayerLoginStatus(){
        excludeSet.add("player_login_status");
        return this;
    }

    public DevRoomPlayerSelect avgPlayerLoginStatus(){
        set.add("avg(player_login_status) as player_login_status");
        return this;
    }

    public DevRoomPlayerSelect countPlayerLoginStatus(){
        set.add("count(player_login_status) as player_login_status");
        return this;
    }

    public DevRoomPlayerSelect minPlayerLoginStatus(){
        set.add("min(player_login_status) as player_login_status");
        return this;
    }

    public DevRoomPlayerSelect maxPlayerLoginStatus(){
        set.add("max(player_login_status) as player_login_status");
        return this;
    }

    public DevRoomPlayerSelect sumPlayerLoginStatus(){
        set.add("sum(player_login_status) as player_login_status");
        return this;
    }
    public DevRoomPlayerSelect msgReportType(){
        set.add("msg_report_type");
        return this;
    }

    public DevRoomPlayerSelect excludeMsgReportType(){
        excludeSet.add("msg_report_type");
        return this;
    }

    public DevRoomPlayerSelect avgMsgReportType(){
        set.add("avg(msg_report_type) as msg_report_type");
        return this;
    }

    public DevRoomPlayerSelect countMsgReportType(){
        set.add("count(msg_report_type) as msg_report_type");
        return this;
    }

    public DevRoomPlayerSelect minMsgReportType(){
        set.add("min(msg_report_type) as msg_report_type");
        return this;
    }

    public DevRoomPlayerSelect maxMsgReportType(){
        set.add("max(msg_report_type) as msg_report_type");
        return this;
    }

    public DevRoomPlayerSelect sumMsgReportType(){
        set.add("sum(msg_report_type) as msg_report_type");
        return this;
    }
    public DevRoomPlayerSelect roomPlayerRole(){
        set.add("room_player_role");
        return this;
    }

    public DevRoomPlayerSelect excludeRoomPlayerRole(){
        excludeSet.add("room_player_role");
        return this;
    }

    public DevRoomPlayerSelect avgRoomPlayerRole(){
        set.add("avg(room_player_role) as room_player_role");
        return this;
    }

    public DevRoomPlayerSelect countRoomPlayerRole(){
        set.add("count(room_player_role) as room_player_role");
        return this;
    }

    public DevRoomPlayerSelect minRoomPlayerRole(){
        set.add("min(room_player_role) as room_player_role");
        return this;
    }

    public DevRoomPlayerSelect maxRoomPlayerRole(){
        set.add("max(room_player_role) as room_player_role");
        return this;
    }

    public DevRoomPlayerSelect sumRoomPlayerRole(){
        set.add("sum(room_player_role) as room_player_role");
        return this;
    }
    public DevRoomPlayerSelect heirLeaderId(){
        set.add("heir_leader_id");
        return this;
    }

    public DevRoomPlayerSelect excludeHeirLeaderId(){
        excludeSet.add("heir_leader_id");
        return this;
    }

    public DevRoomPlayerSelect avgHeirLeaderId(){
        set.add("avg(heir_leader_id) as heir_leader_id");
        return this;
    }

    public DevRoomPlayerSelect countHeirLeaderId(){
        set.add("count(heir_leader_id) as heir_leader_id");
        return this;
    }

    public DevRoomPlayerSelect minHeirLeaderId(){
        set.add("min(heir_leader_id) as heir_leader_id");
        return this;
    }

    public DevRoomPlayerSelect maxHeirLeaderId(){
        set.add("max(heir_leader_id) as heir_leader_id");
        return this;
    }

    public DevRoomPlayerSelect sumHeirLeaderId(){
        set.add("sum(heir_leader_id) as heir_leader_id");
        return this;
    }
    public DevRoomPlayerSelect fetchTime(){
        set.add("fetch_time");
        return this;
    }

    public DevRoomPlayerSelect excludeFetchTime(){
        excludeSet.add("fetch_time");
        return this;
    }

    public DevRoomPlayerSelect avgFetchTime(){
        set.add("avg(fetch_time) as fetch_time");
        return this;
    }

    public DevRoomPlayerSelect countFetchTime(){
        set.add("count(fetch_time) as fetch_time");
        return this;
    }

    public DevRoomPlayerSelect minFetchTime(){
        set.add("min(fetch_time) as fetch_time");
        return this;
    }

    public DevRoomPlayerSelect maxFetchTime(){
        set.add("max(fetch_time) as fetch_time");
        return this;
    }

    public DevRoomPlayerSelect sumFetchTime(){
        set.add("sum(fetch_time) as fetch_time");
        return this;
    }
    public DevRoomPlayerSelect loginTime(){
        set.add("login_time");
        return this;
    }

    public DevRoomPlayerSelect excludeLoginTime(){
        excludeSet.add("login_time");
        return this;
    }

    public DevRoomPlayerSelect avgLoginTime(){
        set.add("avg(login_time) as login_time");
        return this;
    }

    public DevRoomPlayerSelect countLoginTime(){
        set.add("count(login_time) as login_time");
        return this;
    }

    public DevRoomPlayerSelect minLoginTime(){
        set.add("min(login_time) as login_time");
        return this;
    }

    public DevRoomPlayerSelect maxLoginTime(){
        set.add("max(login_time) as login_time");
        return this;
    }

    public DevRoomPlayerSelect sumLoginTime(){
        set.add("sum(login_time) as login_time");
        return this;
    }
    public DevRoomPlayerSelect logoutTime(){
        set.add("logout_time");
        return this;
    }

    public DevRoomPlayerSelect excludeLogoutTime(){
        excludeSet.add("logout_time");
        return this;
    }

    public DevRoomPlayerSelect avgLogoutTime(){
        set.add("avg(logout_time) as logout_time");
        return this;
    }

    public DevRoomPlayerSelect countLogoutTime(){
        set.add("count(logout_time) as logout_time");
        return this;
    }

    public DevRoomPlayerSelect minLogoutTime(){
        set.add("min(logout_time) as logout_time");
        return this;
    }

    public DevRoomPlayerSelect maxLogoutTime(){
        set.add("max(logout_time) as logout_time");
        return this;
    }

    public DevRoomPlayerSelect sumLogoutTime(){
        set.add("sum(logout_time) as logout_time");
        return this;
    }
    public DevRoomPlayerSelect idleTime(){
        set.add("idle_time");
        return this;
    }

    public DevRoomPlayerSelect excludeIdleTime(){
        excludeSet.add("idle_time");
        return this;
    }

    public DevRoomPlayerSelect avgIdleTime(){
        set.add("avg(idle_time) as idle_time");
        return this;
    }

    public DevRoomPlayerSelect countIdleTime(){
        set.add("count(idle_time) as idle_time");
        return this;
    }

    public DevRoomPlayerSelect minIdleTime(){
        set.add("min(idle_time) as idle_time");
        return this;
    }

    public DevRoomPlayerSelect maxIdleTime(){
        set.add("max(idle_time) as idle_time");
        return this;
    }

    public DevRoomPlayerSelect sumIdleTime(){
        set.add("sum(idle_time) as idle_time");
        return this;
    }
    public DevRoomPlayerSelect clientStreamingStartTime(){
        set.add("client_streaming_start_time");
        return this;
    }

    public DevRoomPlayerSelect excludeClientStreamingStartTime(){
        excludeSet.add("client_streaming_start_time");
        return this;
    }

    public DevRoomPlayerSelect avgClientStreamingStartTime(){
        set.add("avg(client_streaming_start_time) as client_streaming_start_time");
        return this;
    }

    public DevRoomPlayerSelect countClientStreamingStartTime(){
        set.add("count(client_streaming_start_time) as client_streaming_start_time");
        return this;
    }

    public DevRoomPlayerSelect minClientStreamingStartTime(){
        set.add("min(client_streaming_start_time) as client_streaming_start_time");
        return this;
    }

    public DevRoomPlayerSelect maxClientStreamingStartTime(){
        set.add("max(client_streaming_start_time) as client_streaming_start_time");
        return this;
    }

    public DevRoomPlayerSelect sumClientStreamingStartTime(){
        set.add("sum(client_streaming_start_time) as client_streaming_start_time");
        return this;
    }
    public DevRoomPlayerSelect clientStreamingEndTime(){
        set.add("client_streaming_end_time");
        return this;
    }

    public DevRoomPlayerSelect excludeClientStreamingEndTime(){
        excludeSet.add("client_streaming_end_time");
        return this;
    }

    public DevRoomPlayerSelect avgClientStreamingEndTime(){
        set.add("avg(client_streaming_end_time) as client_streaming_end_time");
        return this;
    }

    public DevRoomPlayerSelect countClientStreamingEndTime(){
        set.add("count(client_streaming_end_time) as client_streaming_end_time");
        return this;
    }

    public DevRoomPlayerSelect minClientStreamingEndTime(){
        set.add("min(client_streaming_end_time) as client_streaming_end_time");
        return this;
    }

    public DevRoomPlayerSelect maxClientStreamingEndTime(){
        set.add("max(client_streaming_end_time) as client_streaming_end_time");
        return this;
    }

    public DevRoomPlayerSelect sumClientStreamingEndTime(){
        set.add("sum(client_streaming_end_time) as client_streaming_end_time");
        return this;
    }
    public DevRoomPlayerSelect versionId(){
        set.add("version_id");
        return this;
    }

    public DevRoomPlayerSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public DevRoomPlayerSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public DevRoomPlayerSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public DevRoomPlayerSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public DevRoomPlayerSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public DevRoomPlayerSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public DevRoomPlayerSelect roomType(){
        set.add("room_type");
        return this;
    }

    public DevRoomPlayerSelect excludeRoomType(){
        excludeSet.add("room_type");
        return this;
    }

    public DevRoomPlayerSelect avgRoomType(){
        set.add("avg(room_type) as room_type");
        return this;
    }

    public DevRoomPlayerSelect countRoomType(){
        set.add("count(room_type) as room_type");
        return this;
    }

    public DevRoomPlayerSelect minRoomType(){
        set.add("min(room_type) as room_type");
        return this;
    }

    public DevRoomPlayerSelect maxRoomType(){
        set.add("max(room_type) as room_type");
        return this;
    }

    public DevRoomPlayerSelect sumRoomType(){
        set.add("sum(room_type) as room_type");
        return this;
    }
    public DevRoomPlayerSelect gameId(){
        set.add("game_id");
        return this;
    }

    public DevRoomPlayerSelect excludeGameId(){
        excludeSet.add("game_id");
        return this;
    }

    public DevRoomPlayerSelect avgGameId(){
        set.add("avg(game_id) as game_id");
        return this;
    }

    public DevRoomPlayerSelect countGameId(){
        set.add("count(game_id) as game_id");
        return this;
    }

    public DevRoomPlayerSelect minGameId(){
        set.add("min(game_id) as game_id");
        return this;
    }

    public DevRoomPlayerSelect maxGameId(){
        set.add("max(game_id) as game_id");
        return this;
    }

    public DevRoomPlayerSelect sumGameId(){
        set.add("sum(game_id) as game_id");
        return this;
    }
    public DevRoomPlayerSelect sessionId(){
        set.add("session_id");
        return this;
    }

    public DevRoomPlayerSelect excludeSessionId(){
        excludeSet.add("session_id");
        return this;
    }

    public DevRoomPlayerSelect avgSessionId(){
        set.add("avg(session_id) as session_id");
        return this;
    }

    public DevRoomPlayerSelect countSessionId(){
        set.add("count(session_id) as session_id");
        return this;
    }

    public DevRoomPlayerSelect minSessionId(){
        set.add("min(session_id) as session_id");
        return this;
    }

    public DevRoomPlayerSelect maxSessionId(){
        set.add("max(session_id) as session_id");
        return this;
    }

    public DevRoomPlayerSelect sumSessionId(){
        set.add("sum(session_id) as session_id");
        return this;
    }

    boolean distinct=false;

     public DevRoomPlayerSelect distinct(){
        this.distinct=true;
        return this;
    }

    public DevRoomPlayerSelect includes(Consumer<Set<String>> other){
        if(other!=null){
            other.accept(set);
        }
        return this;
    }

    public String[] select(){
        if(!excludeSet.isEmpty()){
            set.removeAll(excludeSet);
        }
        String[] columns = set.isEmpty() ? new String[]{"*"} : set.toArray(new String[0]);
        set.clear();
        excludeSet.clear();
        set=null;
        excludeSet=null;
        if(distinct){
            columns[0]=" DISTINCT "+columns[0];
        }
        return columns;
    }

    @Override
    public String toString(){
        String[] all=select();
        if(all.length==1){
            return all[0];
        }
        StringBuilder b =new StringBuilder();
        for (String s : all) {
            b.append(s).append(",");
        }
        b.deleteCharAt(b.length()-1);
        return b.toString();
    }
}
