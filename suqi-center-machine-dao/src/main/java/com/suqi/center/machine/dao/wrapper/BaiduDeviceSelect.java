package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 百度云机
 * </p>
 * "baidu_device"
 * @author PC001
 */
public class BaiduDeviceSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public BaiduDeviceSelect columns(){
        set.add("id");
        set.add("device_id");
        set.add("fk_baidu_account_id");
        set.add("uid");
        set.add("code");
        set.add("group_code");
        set.add("idc_code");
        set.add("image_version_id");
        set.add("last_reset_time");
        set.add("reset_status");
        set.add("reset_image_version_id");
        set.add("order_code");
        set.add("deliver_day");
        set.add("old_code");
        set.add("sn");
        set.add("ip");
        set.add("paas");
        set.add("device_code");
        set.add("device_ip");
        set.add("hardware_code");
        set.add("unit_seg");
        set.add("boot_time");
        set.add("hb_time");
        set.add("alert_expire_time");
        set.add("offline_time");
        set.add("tx");
        set.add("rx");
        set.add("status_online");
        set.add("off_seconds");
        set.add("error_message");
        set.add("status_control");
        set.add("alert_enabled");
        set.add("status_paa_s");
        set.add("last_apply_username");
        set.add("last_apply_date");
        set.add("last_active_date");
        set.add("pkgs");
        set.add("tag");
        set.add("capture_ok");
        set.add("cap_diff");
        set.add("dg_version");
        set.add("dg_version_code");
        set.add("dg_xm_status");
        set.add("dg_top_app");
        set.add("dg_display_width");
        set.add("dg_apps_count");
        set.add("dg_prop_product");
        set.add("dg_sim_imei");
        set.add("dg_net_status");
        set.add("dg_net_bs");
        set.add("dg_proxy_host");
        set.add("dg_proxy_port");
        set.add("dg_proxy_username");
        set.add("dg_proxy_location");
        set.add("dg_proxy_ip");
        set.add("create_time");
        set.add("last_update_time");
        set.add("last_sync_time");
        set.add("fk_cloud_region_id");
        set.add("pub_ip");
        set.add("audio_sock_type");
        set.add("audio_port");
        set.add("audio_external_port");
        set.add("video_port");
        set.add("video_external_port");
        set.add("maxslots");
        set.add("rtc_min_port");
        set.add("rtc_max_port");
        set.add("rtc_min_external_port");
        set.add("rtc_max_external_port");
        set.add("reset_tast_uid");
        set.add("upload_image_task_id");
        set.add("reset_reponse");
        set.add("upload_response");
        return this;
    }

    public BaiduDeviceSelect id(){
        set.add("id");
        return this;
    }

    public BaiduDeviceSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public BaiduDeviceSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public BaiduDeviceSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public BaiduDeviceSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public BaiduDeviceSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public BaiduDeviceSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public BaiduDeviceSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public BaiduDeviceSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public BaiduDeviceSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public BaiduDeviceSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public BaiduDeviceSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public BaiduDeviceSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public BaiduDeviceSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public BaiduDeviceSelect fkBaiduAccountId(){
        set.add("fk_baidu_account_id");
        return this;
    }

    public BaiduDeviceSelect excludeFkBaiduAccountId(){
        excludeSet.add("fk_baidu_account_id");
        return this;
    }

    public BaiduDeviceSelect avgFkBaiduAccountId(){
        set.add("avg(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }

    public BaiduDeviceSelect countFkBaiduAccountId(){
        set.add("count(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }

    public BaiduDeviceSelect minFkBaiduAccountId(){
        set.add("min(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }

    public BaiduDeviceSelect maxFkBaiduAccountId(){
        set.add("max(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }

    public BaiduDeviceSelect sumFkBaiduAccountId(){
        set.add("sum(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }
    public BaiduDeviceSelect uid(){
        set.add("uid");
        return this;
    }

    public BaiduDeviceSelect excludeUid(){
        excludeSet.add("uid");
        return this;
    }

    public BaiduDeviceSelect avgUid(){
        set.add("avg(uid) as uid");
        return this;
    }

    public BaiduDeviceSelect countUid(){
        set.add("count(uid) as uid");
        return this;
    }

    public BaiduDeviceSelect minUid(){
        set.add("min(uid) as uid");
        return this;
    }

    public BaiduDeviceSelect maxUid(){
        set.add("max(uid) as uid");
        return this;
    }

    public BaiduDeviceSelect sumUid(){
        set.add("sum(uid) as uid");
        return this;
    }
    public BaiduDeviceSelect code(){
        set.add("code");
        return this;
    }

    public BaiduDeviceSelect excludeCode(){
        excludeSet.add("code");
        return this;
    }

    public BaiduDeviceSelect avgCode(){
        set.add("avg(code) as code");
        return this;
    }

    public BaiduDeviceSelect countCode(){
        set.add("count(code) as code");
        return this;
    }

    public BaiduDeviceSelect minCode(){
        set.add("min(code) as code");
        return this;
    }

    public BaiduDeviceSelect maxCode(){
        set.add("max(code) as code");
        return this;
    }

    public BaiduDeviceSelect sumCode(){
        set.add("sum(code) as code");
        return this;
    }
    public BaiduDeviceSelect groupCode(){
        set.add("group_code");
        return this;
    }

    public BaiduDeviceSelect excludeGroupCode(){
        excludeSet.add("group_code");
        return this;
    }

    public BaiduDeviceSelect avgGroupCode(){
        set.add("avg(group_code) as group_code");
        return this;
    }

    public BaiduDeviceSelect countGroupCode(){
        set.add("count(group_code) as group_code");
        return this;
    }

    public BaiduDeviceSelect minGroupCode(){
        set.add("min(group_code) as group_code");
        return this;
    }

    public BaiduDeviceSelect maxGroupCode(){
        set.add("max(group_code) as group_code");
        return this;
    }

    public BaiduDeviceSelect sumGroupCode(){
        set.add("sum(group_code) as group_code");
        return this;
    }
    public BaiduDeviceSelect idcCode(){
        set.add("idc_code");
        return this;
    }

    public BaiduDeviceSelect excludeIdcCode(){
        excludeSet.add("idc_code");
        return this;
    }

    public BaiduDeviceSelect avgIdcCode(){
        set.add("avg(idc_code) as idc_code");
        return this;
    }

    public BaiduDeviceSelect countIdcCode(){
        set.add("count(idc_code) as idc_code");
        return this;
    }

    public BaiduDeviceSelect minIdcCode(){
        set.add("min(idc_code) as idc_code");
        return this;
    }

    public BaiduDeviceSelect maxIdcCode(){
        set.add("max(idc_code) as idc_code");
        return this;
    }

    public BaiduDeviceSelect sumIdcCode(){
        set.add("sum(idc_code) as idc_code");
        return this;
    }
    public BaiduDeviceSelect imageVersionId(){
        set.add("image_version_id");
        return this;
    }

    public BaiduDeviceSelect excludeImageVersionId(){
        excludeSet.add("image_version_id");
        return this;
    }

    public BaiduDeviceSelect avgImageVersionId(){
        set.add("avg(image_version_id) as image_version_id");
        return this;
    }

    public BaiduDeviceSelect countImageVersionId(){
        set.add("count(image_version_id) as image_version_id");
        return this;
    }

    public BaiduDeviceSelect minImageVersionId(){
        set.add("min(image_version_id) as image_version_id");
        return this;
    }

    public BaiduDeviceSelect maxImageVersionId(){
        set.add("max(image_version_id) as image_version_id");
        return this;
    }

    public BaiduDeviceSelect sumImageVersionId(){
        set.add("sum(image_version_id) as image_version_id");
        return this;
    }
    public BaiduDeviceSelect lastResetTime(){
        set.add("last_reset_time");
        return this;
    }

    public BaiduDeviceSelect excludeLastResetTime(){
        excludeSet.add("last_reset_time");
        return this;
    }

    public BaiduDeviceSelect avgLastResetTime(){
        set.add("avg(last_reset_time) as last_reset_time");
        return this;
    }

    public BaiduDeviceSelect countLastResetTime(){
        set.add("count(last_reset_time) as last_reset_time");
        return this;
    }

    public BaiduDeviceSelect minLastResetTime(){
        set.add("min(last_reset_time) as last_reset_time");
        return this;
    }

    public BaiduDeviceSelect maxLastResetTime(){
        set.add("max(last_reset_time) as last_reset_time");
        return this;
    }

    public BaiduDeviceSelect sumLastResetTime(){
        set.add("sum(last_reset_time) as last_reset_time");
        return this;
    }
    public BaiduDeviceSelect resetStatus(){
        set.add("reset_status");
        return this;
    }

    public BaiduDeviceSelect excludeResetStatus(){
        excludeSet.add("reset_status");
        return this;
    }

    public BaiduDeviceSelect avgResetStatus(){
        set.add("avg(reset_status) as reset_status");
        return this;
    }

    public BaiduDeviceSelect countResetStatus(){
        set.add("count(reset_status) as reset_status");
        return this;
    }

    public BaiduDeviceSelect minResetStatus(){
        set.add("min(reset_status) as reset_status");
        return this;
    }

    public BaiduDeviceSelect maxResetStatus(){
        set.add("max(reset_status) as reset_status");
        return this;
    }

    public BaiduDeviceSelect sumResetStatus(){
        set.add("sum(reset_status) as reset_status");
        return this;
    }
    public BaiduDeviceSelect resetImageVersionId(){
        set.add("reset_image_version_id");
        return this;
    }

    public BaiduDeviceSelect excludeResetImageVersionId(){
        excludeSet.add("reset_image_version_id");
        return this;
    }

    public BaiduDeviceSelect avgResetImageVersionId(){
        set.add("avg(reset_image_version_id) as reset_image_version_id");
        return this;
    }

    public BaiduDeviceSelect countResetImageVersionId(){
        set.add("count(reset_image_version_id) as reset_image_version_id");
        return this;
    }

    public BaiduDeviceSelect minResetImageVersionId(){
        set.add("min(reset_image_version_id) as reset_image_version_id");
        return this;
    }

    public BaiduDeviceSelect maxResetImageVersionId(){
        set.add("max(reset_image_version_id) as reset_image_version_id");
        return this;
    }

    public BaiduDeviceSelect sumResetImageVersionId(){
        set.add("sum(reset_image_version_id) as reset_image_version_id");
        return this;
    }
    public BaiduDeviceSelect orderCode(){
        set.add("order_code");
        return this;
    }

    public BaiduDeviceSelect excludeOrderCode(){
        excludeSet.add("order_code");
        return this;
    }

    public BaiduDeviceSelect avgOrderCode(){
        set.add("avg(order_code) as order_code");
        return this;
    }

    public BaiduDeviceSelect countOrderCode(){
        set.add("count(order_code) as order_code");
        return this;
    }

    public BaiduDeviceSelect minOrderCode(){
        set.add("min(order_code) as order_code");
        return this;
    }

    public BaiduDeviceSelect maxOrderCode(){
        set.add("max(order_code) as order_code");
        return this;
    }

    public BaiduDeviceSelect sumOrderCode(){
        set.add("sum(order_code) as order_code");
        return this;
    }
    public BaiduDeviceSelect deliverDay(){
        set.add("deliver_day");
        return this;
    }

    public BaiduDeviceSelect excludeDeliverDay(){
        excludeSet.add("deliver_day");
        return this;
    }

    public BaiduDeviceSelect avgDeliverDay(){
        set.add("avg(deliver_day) as deliver_day");
        return this;
    }

    public BaiduDeviceSelect countDeliverDay(){
        set.add("count(deliver_day) as deliver_day");
        return this;
    }

    public BaiduDeviceSelect minDeliverDay(){
        set.add("min(deliver_day) as deliver_day");
        return this;
    }

    public BaiduDeviceSelect maxDeliverDay(){
        set.add("max(deliver_day) as deliver_day");
        return this;
    }

    public BaiduDeviceSelect sumDeliverDay(){
        set.add("sum(deliver_day) as deliver_day");
        return this;
    }
    public BaiduDeviceSelect oldCode(){
        set.add("old_code");
        return this;
    }

    public BaiduDeviceSelect excludeOldCode(){
        excludeSet.add("old_code");
        return this;
    }

    public BaiduDeviceSelect avgOldCode(){
        set.add("avg(old_code) as old_code");
        return this;
    }

    public BaiduDeviceSelect countOldCode(){
        set.add("count(old_code) as old_code");
        return this;
    }

    public BaiduDeviceSelect minOldCode(){
        set.add("min(old_code) as old_code");
        return this;
    }

    public BaiduDeviceSelect maxOldCode(){
        set.add("max(old_code) as old_code");
        return this;
    }

    public BaiduDeviceSelect sumOldCode(){
        set.add("sum(old_code) as old_code");
        return this;
    }
    public BaiduDeviceSelect sn(){
        set.add("sn");
        return this;
    }

    public BaiduDeviceSelect excludeSn(){
        excludeSet.add("sn");
        return this;
    }

    public BaiduDeviceSelect avgSn(){
        set.add("avg(sn) as sn");
        return this;
    }

    public BaiduDeviceSelect countSn(){
        set.add("count(sn) as sn");
        return this;
    }

    public BaiduDeviceSelect minSn(){
        set.add("min(sn) as sn");
        return this;
    }

    public BaiduDeviceSelect maxSn(){
        set.add("max(sn) as sn");
        return this;
    }

    public BaiduDeviceSelect sumSn(){
        set.add("sum(sn) as sn");
        return this;
    }
    public BaiduDeviceSelect ip(){
        set.add("ip");
        return this;
    }

    public BaiduDeviceSelect excludeIp(){
        excludeSet.add("ip");
        return this;
    }

    public BaiduDeviceSelect avgIp(){
        set.add("avg(ip) as ip");
        return this;
    }

    public BaiduDeviceSelect countIp(){
        set.add("count(ip) as ip");
        return this;
    }

    public BaiduDeviceSelect minIp(){
        set.add("min(ip) as ip");
        return this;
    }

    public BaiduDeviceSelect maxIp(){
        set.add("max(ip) as ip");
        return this;
    }

    public BaiduDeviceSelect sumIp(){
        set.add("sum(ip) as ip");
        return this;
    }
    public BaiduDeviceSelect paas(){
        set.add("paas");
        return this;
    }

    public BaiduDeviceSelect excludePaas(){
        excludeSet.add("paas");
        return this;
    }

    public BaiduDeviceSelect avgPaas(){
        set.add("avg(paas) as paas");
        return this;
    }

    public BaiduDeviceSelect countPaas(){
        set.add("count(paas) as paas");
        return this;
    }

    public BaiduDeviceSelect minPaas(){
        set.add("min(paas) as paas");
        return this;
    }

    public BaiduDeviceSelect maxPaas(){
        set.add("max(paas) as paas");
        return this;
    }

    public BaiduDeviceSelect sumPaas(){
        set.add("sum(paas) as paas");
        return this;
    }
    public BaiduDeviceSelect deviceCode(){
        set.add("device_code");
        return this;
    }

    public BaiduDeviceSelect excludeDeviceCode(){
        excludeSet.add("device_code");
        return this;
    }

    public BaiduDeviceSelect avgDeviceCode(){
        set.add("avg(device_code) as device_code");
        return this;
    }

    public BaiduDeviceSelect countDeviceCode(){
        set.add("count(device_code) as device_code");
        return this;
    }

    public BaiduDeviceSelect minDeviceCode(){
        set.add("min(device_code) as device_code");
        return this;
    }

    public BaiduDeviceSelect maxDeviceCode(){
        set.add("max(device_code) as device_code");
        return this;
    }

    public BaiduDeviceSelect sumDeviceCode(){
        set.add("sum(device_code) as device_code");
        return this;
    }
    public BaiduDeviceSelect deviceIp(){
        set.add("device_ip");
        return this;
    }

    public BaiduDeviceSelect excludeDeviceIp(){
        excludeSet.add("device_ip");
        return this;
    }

    public BaiduDeviceSelect avgDeviceIp(){
        set.add("avg(device_ip) as device_ip");
        return this;
    }

    public BaiduDeviceSelect countDeviceIp(){
        set.add("count(device_ip) as device_ip");
        return this;
    }

    public BaiduDeviceSelect minDeviceIp(){
        set.add("min(device_ip) as device_ip");
        return this;
    }

    public BaiduDeviceSelect maxDeviceIp(){
        set.add("max(device_ip) as device_ip");
        return this;
    }

    public BaiduDeviceSelect sumDeviceIp(){
        set.add("sum(device_ip) as device_ip");
        return this;
    }
    public BaiduDeviceSelect hardwareCode(){
        set.add("hardware_code");
        return this;
    }

    public BaiduDeviceSelect excludeHardwareCode(){
        excludeSet.add("hardware_code");
        return this;
    }

    public BaiduDeviceSelect avgHardwareCode(){
        set.add("avg(hardware_code) as hardware_code");
        return this;
    }

    public BaiduDeviceSelect countHardwareCode(){
        set.add("count(hardware_code) as hardware_code");
        return this;
    }

    public BaiduDeviceSelect minHardwareCode(){
        set.add("min(hardware_code) as hardware_code");
        return this;
    }

    public BaiduDeviceSelect maxHardwareCode(){
        set.add("max(hardware_code) as hardware_code");
        return this;
    }

    public BaiduDeviceSelect sumHardwareCode(){
        set.add("sum(hardware_code) as hardware_code");
        return this;
    }
    public BaiduDeviceSelect unitSeg(){
        set.add("unit_seg");
        return this;
    }

    public BaiduDeviceSelect excludeUnitSeg(){
        excludeSet.add("unit_seg");
        return this;
    }

    public BaiduDeviceSelect avgUnitSeg(){
        set.add("avg(unit_seg) as unit_seg");
        return this;
    }

    public BaiduDeviceSelect countUnitSeg(){
        set.add("count(unit_seg) as unit_seg");
        return this;
    }

    public BaiduDeviceSelect minUnitSeg(){
        set.add("min(unit_seg) as unit_seg");
        return this;
    }

    public BaiduDeviceSelect maxUnitSeg(){
        set.add("max(unit_seg) as unit_seg");
        return this;
    }

    public BaiduDeviceSelect sumUnitSeg(){
        set.add("sum(unit_seg) as unit_seg");
        return this;
    }
    public BaiduDeviceSelect bootTime(){
        set.add("boot_time");
        return this;
    }

    public BaiduDeviceSelect excludeBootTime(){
        excludeSet.add("boot_time");
        return this;
    }

    public BaiduDeviceSelect avgBootTime(){
        set.add("avg(boot_time) as boot_time");
        return this;
    }

    public BaiduDeviceSelect countBootTime(){
        set.add("count(boot_time) as boot_time");
        return this;
    }

    public BaiduDeviceSelect minBootTime(){
        set.add("min(boot_time) as boot_time");
        return this;
    }

    public BaiduDeviceSelect maxBootTime(){
        set.add("max(boot_time) as boot_time");
        return this;
    }

    public BaiduDeviceSelect sumBootTime(){
        set.add("sum(boot_time) as boot_time");
        return this;
    }
    public BaiduDeviceSelect hbTime(){
        set.add("hb_time");
        return this;
    }

    public BaiduDeviceSelect excludeHbTime(){
        excludeSet.add("hb_time");
        return this;
    }

    public BaiduDeviceSelect avgHbTime(){
        set.add("avg(hb_time) as hb_time");
        return this;
    }

    public BaiduDeviceSelect countHbTime(){
        set.add("count(hb_time) as hb_time");
        return this;
    }

    public BaiduDeviceSelect minHbTime(){
        set.add("min(hb_time) as hb_time");
        return this;
    }

    public BaiduDeviceSelect maxHbTime(){
        set.add("max(hb_time) as hb_time");
        return this;
    }

    public BaiduDeviceSelect sumHbTime(){
        set.add("sum(hb_time) as hb_time");
        return this;
    }
    public BaiduDeviceSelect alertExpireTime(){
        set.add("alert_expire_time");
        return this;
    }

    public BaiduDeviceSelect excludeAlertExpireTime(){
        excludeSet.add("alert_expire_time");
        return this;
    }

    public BaiduDeviceSelect avgAlertExpireTime(){
        set.add("avg(alert_expire_time) as alert_expire_time");
        return this;
    }

    public BaiduDeviceSelect countAlertExpireTime(){
        set.add("count(alert_expire_time) as alert_expire_time");
        return this;
    }

    public BaiduDeviceSelect minAlertExpireTime(){
        set.add("min(alert_expire_time) as alert_expire_time");
        return this;
    }

    public BaiduDeviceSelect maxAlertExpireTime(){
        set.add("max(alert_expire_time) as alert_expire_time");
        return this;
    }

    public BaiduDeviceSelect sumAlertExpireTime(){
        set.add("sum(alert_expire_time) as alert_expire_time");
        return this;
    }
    public BaiduDeviceSelect offlineTime(){
        set.add("offline_time");
        return this;
    }

    public BaiduDeviceSelect excludeOfflineTime(){
        excludeSet.add("offline_time");
        return this;
    }

    public BaiduDeviceSelect avgOfflineTime(){
        set.add("avg(offline_time) as offline_time");
        return this;
    }

    public BaiduDeviceSelect countOfflineTime(){
        set.add("count(offline_time) as offline_time");
        return this;
    }

    public BaiduDeviceSelect minOfflineTime(){
        set.add("min(offline_time) as offline_time");
        return this;
    }

    public BaiduDeviceSelect maxOfflineTime(){
        set.add("max(offline_time) as offline_time");
        return this;
    }

    public BaiduDeviceSelect sumOfflineTime(){
        set.add("sum(offline_time) as offline_time");
        return this;
    }
    public BaiduDeviceSelect tx(){
        set.add("tx");
        return this;
    }

    public BaiduDeviceSelect excludeTx(){
        excludeSet.add("tx");
        return this;
    }

    public BaiduDeviceSelect avgTx(){
        set.add("avg(tx) as tx");
        return this;
    }

    public BaiduDeviceSelect countTx(){
        set.add("count(tx) as tx");
        return this;
    }

    public BaiduDeviceSelect minTx(){
        set.add("min(tx) as tx");
        return this;
    }

    public BaiduDeviceSelect maxTx(){
        set.add("max(tx) as tx");
        return this;
    }

    public BaiduDeviceSelect sumTx(){
        set.add("sum(tx) as tx");
        return this;
    }
    public BaiduDeviceSelect rx(){
        set.add("rx");
        return this;
    }

    public BaiduDeviceSelect excludeRx(){
        excludeSet.add("rx");
        return this;
    }

    public BaiduDeviceSelect avgRx(){
        set.add("avg(rx) as rx");
        return this;
    }

    public BaiduDeviceSelect countRx(){
        set.add("count(rx) as rx");
        return this;
    }

    public BaiduDeviceSelect minRx(){
        set.add("min(rx) as rx");
        return this;
    }

    public BaiduDeviceSelect maxRx(){
        set.add("max(rx) as rx");
        return this;
    }

    public BaiduDeviceSelect sumRx(){
        set.add("sum(rx) as rx");
        return this;
    }
    public BaiduDeviceSelect statusOnline(){
        set.add("status_online");
        return this;
    }

    public BaiduDeviceSelect excludeStatusOnline(){
        excludeSet.add("status_online");
        return this;
    }

    public BaiduDeviceSelect avgStatusOnline(){
        set.add("avg(status_online) as status_online");
        return this;
    }

    public BaiduDeviceSelect countStatusOnline(){
        set.add("count(status_online) as status_online");
        return this;
    }

    public BaiduDeviceSelect minStatusOnline(){
        set.add("min(status_online) as status_online");
        return this;
    }

    public BaiduDeviceSelect maxStatusOnline(){
        set.add("max(status_online) as status_online");
        return this;
    }

    public BaiduDeviceSelect sumStatusOnline(){
        set.add("sum(status_online) as status_online");
        return this;
    }
    public BaiduDeviceSelect offSeconds(){
        set.add("off_seconds");
        return this;
    }

    public BaiduDeviceSelect excludeOffSeconds(){
        excludeSet.add("off_seconds");
        return this;
    }

    public BaiduDeviceSelect avgOffSeconds(){
        set.add("avg(off_seconds) as off_seconds");
        return this;
    }

    public BaiduDeviceSelect countOffSeconds(){
        set.add("count(off_seconds) as off_seconds");
        return this;
    }

    public BaiduDeviceSelect minOffSeconds(){
        set.add("min(off_seconds) as off_seconds");
        return this;
    }

    public BaiduDeviceSelect maxOffSeconds(){
        set.add("max(off_seconds) as off_seconds");
        return this;
    }

    public BaiduDeviceSelect sumOffSeconds(){
        set.add("sum(off_seconds) as off_seconds");
        return this;
    }
    public BaiduDeviceSelect errorMessage(){
        set.add("error_message");
        return this;
    }

    public BaiduDeviceSelect excludeErrorMessage(){
        excludeSet.add("error_message");
        return this;
    }

    public BaiduDeviceSelect avgErrorMessage(){
        set.add("avg(error_message) as error_message");
        return this;
    }

    public BaiduDeviceSelect countErrorMessage(){
        set.add("count(error_message) as error_message");
        return this;
    }

    public BaiduDeviceSelect minErrorMessage(){
        set.add("min(error_message) as error_message");
        return this;
    }

    public BaiduDeviceSelect maxErrorMessage(){
        set.add("max(error_message) as error_message");
        return this;
    }

    public BaiduDeviceSelect sumErrorMessage(){
        set.add("sum(error_message) as error_message");
        return this;
    }
    public BaiduDeviceSelect statusControl(){
        set.add("status_control");
        return this;
    }

    public BaiduDeviceSelect excludeStatusControl(){
        excludeSet.add("status_control");
        return this;
    }

    public BaiduDeviceSelect avgStatusControl(){
        set.add("avg(status_control) as status_control");
        return this;
    }

    public BaiduDeviceSelect countStatusControl(){
        set.add("count(status_control) as status_control");
        return this;
    }

    public BaiduDeviceSelect minStatusControl(){
        set.add("min(status_control) as status_control");
        return this;
    }

    public BaiduDeviceSelect maxStatusControl(){
        set.add("max(status_control) as status_control");
        return this;
    }

    public BaiduDeviceSelect sumStatusControl(){
        set.add("sum(status_control) as status_control");
        return this;
    }
    public BaiduDeviceSelect alertEnabled(){
        set.add("alert_enabled");
        return this;
    }

    public BaiduDeviceSelect excludeAlertEnabled(){
        excludeSet.add("alert_enabled");
        return this;
    }

    public BaiduDeviceSelect avgAlertEnabled(){
        set.add("avg(alert_enabled) as alert_enabled");
        return this;
    }

    public BaiduDeviceSelect countAlertEnabled(){
        set.add("count(alert_enabled) as alert_enabled");
        return this;
    }

    public BaiduDeviceSelect minAlertEnabled(){
        set.add("min(alert_enabled) as alert_enabled");
        return this;
    }

    public BaiduDeviceSelect maxAlertEnabled(){
        set.add("max(alert_enabled) as alert_enabled");
        return this;
    }

    public BaiduDeviceSelect sumAlertEnabled(){
        set.add("sum(alert_enabled) as alert_enabled");
        return this;
    }
    public BaiduDeviceSelect statusPaaS(){
        set.add("status_paa_s");
        return this;
    }

    public BaiduDeviceSelect excludeStatusPaaS(){
        excludeSet.add("status_paa_s");
        return this;
    }

    public BaiduDeviceSelect avgStatusPaaS(){
        set.add("avg(status_paa_s) as status_paa_s");
        return this;
    }

    public BaiduDeviceSelect countStatusPaaS(){
        set.add("count(status_paa_s) as status_paa_s");
        return this;
    }

    public BaiduDeviceSelect minStatusPaaS(){
        set.add("min(status_paa_s) as status_paa_s");
        return this;
    }

    public BaiduDeviceSelect maxStatusPaaS(){
        set.add("max(status_paa_s) as status_paa_s");
        return this;
    }

    public BaiduDeviceSelect sumStatusPaaS(){
        set.add("sum(status_paa_s) as status_paa_s");
        return this;
    }
    public BaiduDeviceSelect lastApplyUsername(){
        set.add("last_apply_username");
        return this;
    }

    public BaiduDeviceSelect excludeLastApplyUsername(){
        excludeSet.add("last_apply_username");
        return this;
    }

    public BaiduDeviceSelect avgLastApplyUsername(){
        set.add("avg(last_apply_username) as last_apply_username");
        return this;
    }

    public BaiduDeviceSelect countLastApplyUsername(){
        set.add("count(last_apply_username) as last_apply_username");
        return this;
    }

    public BaiduDeviceSelect minLastApplyUsername(){
        set.add("min(last_apply_username) as last_apply_username");
        return this;
    }

    public BaiduDeviceSelect maxLastApplyUsername(){
        set.add("max(last_apply_username) as last_apply_username");
        return this;
    }

    public BaiduDeviceSelect sumLastApplyUsername(){
        set.add("sum(last_apply_username) as last_apply_username");
        return this;
    }
    public BaiduDeviceSelect lastApplyDate(){
        set.add("last_apply_date");
        return this;
    }

    public BaiduDeviceSelect excludeLastApplyDate(){
        excludeSet.add("last_apply_date");
        return this;
    }

    public BaiduDeviceSelect avgLastApplyDate(){
        set.add("avg(last_apply_date) as last_apply_date");
        return this;
    }

    public BaiduDeviceSelect countLastApplyDate(){
        set.add("count(last_apply_date) as last_apply_date");
        return this;
    }

    public BaiduDeviceSelect minLastApplyDate(){
        set.add("min(last_apply_date) as last_apply_date");
        return this;
    }

    public BaiduDeviceSelect maxLastApplyDate(){
        set.add("max(last_apply_date) as last_apply_date");
        return this;
    }

    public BaiduDeviceSelect sumLastApplyDate(){
        set.add("sum(last_apply_date) as last_apply_date");
        return this;
    }
    public BaiduDeviceSelect lastActiveDate(){
        set.add("last_active_date");
        return this;
    }

    public BaiduDeviceSelect excludeLastActiveDate(){
        excludeSet.add("last_active_date");
        return this;
    }

    public BaiduDeviceSelect avgLastActiveDate(){
        set.add("avg(last_active_date) as last_active_date");
        return this;
    }

    public BaiduDeviceSelect countLastActiveDate(){
        set.add("count(last_active_date) as last_active_date");
        return this;
    }

    public BaiduDeviceSelect minLastActiveDate(){
        set.add("min(last_active_date) as last_active_date");
        return this;
    }

    public BaiduDeviceSelect maxLastActiveDate(){
        set.add("max(last_active_date) as last_active_date");
        return this;
    }

    public BaiduDeviceSelect sumLastActiveDate(){
        set.add("sum(last_active_date) as last_active_date");
        return this;
    }
    public BaiduDeviceSelect pkgs(){
        set.add("pkgs");
        return this;
    }

    public BaiduDeviceSelect excludePkgs(){
        excludeSet.add("pkgs");
        return this;
    }

    public BaiduDeviceSelect avgPkgs(){
        set.add("avg(pkgs) as pkgs");
        return this;
    }

    public BaiduDeviceSelect countPkgs(){
        set.add("count(pkgs) as pkgs");
        return this;
    }

    public BaiduDeviceSelect minPkgs(){
        set.add("min(pkgs) as pkgs");
        return this;
    }

    public BaiduDeviceSelect maxPkgs(){
        set.add("max(pkgs) as pkgs");
        return this;
    }

    public BaiduDeviceSelect sumPkgs(){
        set.add("sum(pkgs) as pkgs");
        return this;
    }
    public BaiduDeviceSelect tag(){
        set.add("tag");
        return this;
    }

    public BaiduDeviceSelect excludeTag(){
        excludeSet.add("tag");
        return this;
    }

    public BaiduDeviceSelect avgTag(){
        set.add("avg(tag) as tag");
        return this;
    }

    public BaiduDeviceSelect countTag(){
        set.add("count(tag) as tag");
        return this;
    }

    public BaiduDeviceSelect minTag(){
        set.add("min(tag) as tag");
        return this;
    }

    public BaiduDeviceSelect maxTag(){
        set.add("max(tag) as tag");
        return this;
    }

    public BaiduDeviceSelect sumTag(){
        set.add("sum(tag) as tag");
        return this;
    }
    public BaiduDeviceSelect captureOk(){
        set.add("capture_ok");
        return this;
    }

    public BaiduDeviceSelect excludeCaptureOk(){
        excludeSet.add("capture_ok");
        return this;
    }

    public BaiduDeviceSelect avgCaptureOk(){
        set.add("avg(capture_ok) as capture_ok");
        return this;
    }

    public BaiduDeviceSelect countCaptureOk(){
        set.add("count(capture_ok) as capture_ok");
        return this;
    }

    public BaiduDeviceSelect minCaptureOk(){
        set.add("min(capture_ok) as capture_ok");
        return this;
    }

    public BaiduDeviceSelect maxCaptureOk(){
        set.add("max(capture_ok) as capture_ok");
        return this;
    }

    public BaiduDeviceSelect sumCaptureOk(){
        set.add("sum(capture_ok) as capture_ok");
        return this;
    }
    public BaiduDeviceSelect capDiff(){
        set.add("cap_diff");
        return this;
    }

    public BaiduDeviceSelect excludeCapDiff(){
        excludeSet.add("cap_diff");
        return this;
    }

    public BaiduDeviceSelect avgCapDiff(){
        set.add("avg(cap_diff) as cap_diff");
        return this;
    }

    public BaiduDeviceSelect countCapDiff(){
        set.add("count(cap_diff) as cap_diff");
        return this;
    }

    public BaiduDeviceSelect minCapDiff(){
        set.add("min(cap_diff) as cap_diff");
        return this;
    }

    public BaiduDeviceSelect maxCapDiff(){
        set.add("max(cap_diff) as cap_diff");
        return this;
    }

    public BaiduDeviceSelect sumCapDiff(){
        set.add("sum(cap_diff) as cap_diff");
        return this;
    }
    public BaiduDeviceSelect dgVersion(){
        set.add("dg_version");
        return this;
    }

    public BaiduDeviceSelect excludeDgVersion(){
        excludeSet.add("dg_version");
        return this;
    }

    public BaiduDeviceSelect avgDgVersion(){
        set.add("avg(dg_version) as dg_version");
        return this;
    }

    public BaiduDeviceSelect countDgVersion(){
        set.add("count(dg_version) as dg_version");
        return this;
    }

    public BaiduDeviceSelect minDgVersion(){
        set.add("min(dg_version) as dg_version");
        return this;
    }

    public BaiduDeviceSelect maxDgVersion(){
        set.add("max(dg_version) as dg_version");
        return this;
    }

    public BaiduDeviceSelect sumDgVersion(){
        set.add("sum(dg_version) as dg_version");
        return this;
    }
    public BaiduDeviceSelect dgVersionCode(){
        set.add("dg_version_code");
        return this;
    }

    public BaiduDeviceSelect excludeDgVersionCode(){
        excludeSet.add("dg_version_code");
        return this;
    }

    public BaiduDeviceSelect avgDgVersionCode(){
        set.add("avg(dg_version_code) as dg_version_code");
        return this;
    }

    public BaiduDeviceSelect countDgVersionCode(){
        set.add("count(dg_version_code) as dg_version_code");
        return this;
    }

    public BaiduDeviceSelect minDgVersionCode(){
        set.add("min(dg_version_code) as dg_version_code");
        return this;
    }

    public BaiduDeviceSelect maxDgVersionCode(){
        set.add("max(dg_version_code) as dg_version_code");
        return this;
    }

    public BaiduDeviceSelect sumDgVersionCode(){
        set.add("sum(dg_version_code) as dg_version_code");
        return this;
    }
    public BaiduDeviceSelect dgXmStatus(){
        set.add("dg_xm_status");
        return this;
    }

    public BaiduDeviceSelect excludeDgXmStatus(){
        excludeSet.add("dg_xm_status");
        return this;
    }

    public BaiduDeviceSelect avgDgXmStatus(){
        set.add("avg(dg_xm_status) as dg_xm_status");
        return this;
    }

    public BaiduDeviceSelect countDgXmStatus(){
        set.add("count(dg_xm_status) as dg_xm_status");
        return this;
    }

    public BaiduDeviceSelect minDgXmStatus(){
        set.add("min(dg_xm_status) as dg_xm_status");
        return this;
    }

    public BaiduDeviceSelect maxDgXmStatus(){
        set.add("max(dg_xm_status) as dg_xm_status");
        return this;
    }

    public BaiduDeviceSelect sumDgXmStatus(){
        set.add("sum(dg_xm_status) as dg_xm_status");
        return this;
    }
    public BaiduDeviceSelect dgTopApp(){
        set.add("dg_top_app");
        return this;
    }

    public BaiduDeviceSelect excludeDgTopApp(){
        excludeSet.add("dg_top_app");
        return this;
    }

    public BaiduDeviceSelect avgDgTopApp(){
        set.add("avg(dg_top_app) as dg_top_app");
        return this;
    }

    public BaiduDeviceSelect countDgTopApp(){
        set.add("count(dg_top_app) as dg_top_app");
        return this;
    }

    public BaiduDeviceSelect minDgTopApp(){
        set.add("min(dg_top_app) as dg_top_app");
        return this;
    }

    public BaiduDeviceSelect maxDgTopApp(){
        set.add("max(dg_top_app) as dg_top_app");
        return this;
    }

    public BaiduDeviceSelect sumDgTopApp(){
        set.add("sum(dg_top_app) as dg_top_app");
        return this;
    }
    public BaiduDeviceSelect dgDisplayWidth(){
        set.add("dg_display_width");
        return this;
    }

    public BaiduDeviceSelect excludeDgDisplayWidth(){
        excludeSet.add("dg_display_width");
        return this;
    }

    public BaiduDeviceSelect avgDgDisplayWidth(){
        set.add("avg(dg_display_width) as dg_display_width");
        return this;
    }

    public BaiduDeviceSelect countDgDisplayWidth(){
        set.add("count(dg_display_width) as dg_display_width");
        return this;
    }

    public BaiduDeviceSelect minDgDisplayWidth(){
        set.add("min(dg_display_width) as dg_display_width");
        return this;
    }

    public BaiduDeviceSelect maxDgDisplayWidth(){
        set.add("max(dg_display_width) as dg_display_width");
        return this;
    }

    public BaiduDeviceSelect sumDgDisplayWidth(){
        set.add("sum(dg_display_width) as dg_display_width");
        return this;
    }
    public BaiduDeviceSelect dgAppsCount(){
        set.add("dg_apps_count");
        return this;
    }

    public BaiduDeviceSelect excludeDgAppsCount(){
        excludeSet.add("dg_apps_count");
        return this;
    }

    public BaiduDeviceSelect avgDgAppsCount(){
        set.add("avg(dg_apps_count) as dg_apps_count");
        return this;
    }

    public BaiduDeviceSelect countDgAppsCount(){
        set.add("count(dg_apps_count) as dg_apps_count");
        return this;
    }

    public BaiduDeviceSelect minDgAppsCount(){
        set.add("min(dg_apps_count) as dg_apps_count");
        return this;
    }

    public BaiduDeviceSelect maxDgAppsCount(){
        set.add("max(dg_apps_count) as dg_apps_count");
        return this;
    }

    public BaiduDeviceSelect sumDgAppsCount(){
        set.add("sum(dg_apps_count) as dg_apps_count");
        return this;
    }
    public BaiduDeviceSelect dgPropProduct(){
        set.add("dg_prop_product");
        return this;
    }

    public BaiduDeviceSelect excludeDgPropProduct(){
        excludeSet.add("dg_prop_product");
        return this;
    }

    public BaiduDeviceSelect avgDgPropProduct(){
        set.add("avg(dg_prop_product) as dg_prop_product");
        return this;
    }

    public BaiduDeviceSelect countDgPropProduct(){
        set.add("count(dg_prop_product) as dg_prop_product");
        return this;
    }

    public BaiduDeviceSelect minDgPropProduct(){
        set.add("min(dg_prop_product) as dg_prop_product");
        return this;
    }

    public BaiduDeviceSelect maxDgPropProduct(){
        set.add("max(dg_prop_product) as dg_prop_product");
        return this;
    }

    public BaiduDeviceSelect sumDgPropProduct(){
        set.add("sum(dg_prop_product) as dg_prop_product");
        return this;
    }
    public BaiduDeviceSelect dgSimImei(){
        set.add("dg_sim_imei");
        return this;
    }

    public BaiduDeviceSelect excludeDgSimImei(){
        excludeSet.add("dg_sim_imei");
        return this;
    }

    public BaiduDeviceSelect avgDgSimImei(){
        set.add("avg(dg_sim_imei) as dg_sim_imei");
        return this;
    }

    public BaiduDeviceSelect countDgSimImei(){
        set.add("count(dg_sim_imei) as dg_sim_imei");
        return this;
    }

    public BaiduDeviceSelect minDgSimImei(){
        set.add("min(dg_sim_imei) as dg_sim_imei");
        return this;
    }

    public BaiduDeviceSelect maxDgSimImei(){
        set.add("max(dg_sim_imei) as dg_sim_imei");
        return this;
    }

    public BaiduDeviceSelect sumDgSimImei(){
        set.add("sum(dg_sim_imei) as dg_sim_imei");
        return this;
    }
    public BaiduDeviceSelect dgNetStatus(){
        set.add("dg_net_status");
        return this;
    }

    public BaiduDeviceSelect excludeDgNetStatus(){
        excludeSet.add("dg_net_status");
        return this;
    }

    public BaiduDeviceSelect avgDgNetStatus(){
        set.add("avg(dg_net_status) as dg_net_status");
        return this;
    }

    public BaiduDeviceSelect countDgNetStatus(){
        set.add("count(dg_net_status) as dg_net_status");
        return this;
    }

    public BaiduDeviceSelect minDgNetStatus(){
        set.add("min(dg_net_status) as dg_net_status");
        return this;
    }

    public BaiduDeviceSelect maxDgNetStatus(){
        set.add("max(dg_net_status) as dg_net_status");
        return this;
    }

    public BaiduDeviceSelect sumDgNetStatus(){
        set.add("sum(dg_net_status) as dg_net_status");
        return this;
    }
    public BaiduDeviceSelect dgNetBs(){
        set.add("dg_net_bs");
        return this;
    }

    public BaiduDeviceSelect excludeDgNetBs(){
        excludeSet.add("dg_net_bs");
        return this;
    }

    public BaiduDeviceSelect avgDgNetBs(){
        set.add("avg(dg_net_bs) as dg_net_bs");
        return this;
    }

    public BaiduDeviceSelect countDgNetBs(){
        set.add("count(dg_net_bs) as dg_net_bs");
        return this;
    }

    public BaiduDeviceSelect minDgNetBs(){
        set.add("min(dg_net_bs) as dg_net_bs");
        return this;
    }

    public BaiduDeviceSelect maxDgNetBs(){
        set.add("max(dg_net_bs) as dg_net_bs");
        return this;
    }

    public BaiduDeviceSelect sumDgNetBs(){
        set.add("sum(dg_net_bs) as dg_net_bs");
        return this;
    }
    public BaiduDeviceSelect dgProxyHost(){
        set.add("dg_proxy_host");
        return this;
    }

    public BaiduDeviceSelect excludeDgProxyHost(){
        excludeSet.add("dg_proxy_host");
        return this;
    }

    public BaiduDeviceSelect avgDgProxyHost(){
        set.add("avg(dg_proxy_host) as dg_proxy_host");
        return this;
    }

    public BaiduDeviceSelect countDgProxyHost(){
        set.add("count(dg_proxy_host) as dg_proxy_host");
        return this;
    }

    public BaiduDeviceSelect minDgProxyHost(){
        set.add("min(dg_proxy_host) as dg_proxy_host");
        return this;
    }

    public BaiduDeviceSelect maxDgProxyHost(){
        set.add("max(dg_proxy_host) as dg_proxy_host");
        return this;
    }

    public BaiduDeviceSelect sumDgProxyHost(){
        set.add("sum(dg_proxy_host) as dg_proxy_host");
        return this;
    }
    public BaiduDeviceSelect dgProxyPort(){
        set.add("dg_proxy_port");
        return this;
    }

    public BaiduDeviceSelect excludeDgProxyPort(){
        excludeSet.add("dg_proxy_port");
        return this;
    }

    public BaiduDeviceSelect avgDgProxyPort(){
        set.add("avg(dg_proxy_port) as dg_proxy_port");
        return this;
    }

    public BaiduDeviceSelect countDgProxyPort(){
        set.add("count(dg_proxy_port) as dg_proxy_port");
        return this;
    }

    public BaiduDeviceSelect minDgProxyPort(){
        set.add("min(dg_proxy_port) as dg_proxy_port");
        return this;
    }

    public BaiduDeviceSelect maxDgProxyPort(){
        set.add("max(dg_proxy_port) as dg_proxy_port");
        return this;
    }

    public BaiduDeviceSelect sumDgProxyPort(){
        set.add("sum(dg_proxy_port) as dg_proxy_port");
        return this;
    }
    public BaiduDeviceSelect dgProxyUsername(){
        set.add("dg_proxy_username");
        return this;
    }

    public BaiduDeviceSelect excludeDgProxyUsername(){
        excludeSet.add("dg_proxy_username");
        return this;
    }

    public BaiduDeviceSelect avgDgProxyUsername(){
        set.add("avg(dg_proxy_username) as dg_proxy_username");
        return this;
    }

    public BaiduDeviceSelect countDgProxyUsername(){
        set.add("count(dg_proxy_username) as dg_proxy_username");
        return this;
    }

    public BaiduDeviceSelect minDgProxyUsername(){
        set.add("min(dg_proxy_username) as dg_proxy_username");
        return this;
    }

    public BaiduDeviceSelect maxDgProxyUsername(){
        set.add("max(dg_proxy_username) as dg_proxy_username");
        return this;
    }

    public BaiduDeviceSelect sumDgProxyUsername(){
        set.add("sum(dg_proxy_username) as dg_proxy_username");
        return this;
    }
    public BaiduDeviceSelect dgProxyLocation(){
        set.add("dg_proxy_location");
        return this;
    }

    public BaiduDeviceSelect excludeDgProxyLocation(){
        excludeSet.add("dg_proxy_location");
        return this;
    }

    public BaiduDeviceSelect avgDgProxyLocation(){
        set.add("avg(dg_proxy_location) as dg_proxy_location");
        return this;
    }

    public BaiduDeviceSelect countDgProxyLocation(){
        set.add("count(dg_proxy_location) as dg_proxy_location");
        return this;
    }

    public BaiduDeviceSelect minDgProxyLocation(){
        set.add("min(dg_proxy_location) as dg_proxy_location");
        return this;
    }

    public BaiduDeviceSelect maxDgProxyLocation(){
        set.add("max(dg_proxy_location) as dg_proxy_location");
        return this;
    }

    public BaiduDeviceSelect sumDgProxyLocation(){
        set.add("sum(dg_proxy_location) as dg_proxy_location");
        return this;
    }
    public BaiduDeviceSelect dgProxyIp(){
        set.add("dg_proxy_ip");
        return this;
    }

    public BaiduDeviceSelect excludeDgProxyIp(){
        excludeSet.add("dg_proxy_ip");
        return this;
    }

    public BaiduDeviceSelect avgDgProxyIp(){
        set.add("avg(dg_proxy_ip) as dg_proxy_ip");
        return this;
    }

    public BaiduDeviceSelect countDgProxyIp(){
        set.add("count(dg_proxy_ip) as dg_proxy_ip");
        return this;
    }

    public BaiduDeviceSelect minDgProxyIp(){
        set.add("min(dg_proxy_ip) as dg_proxy_ip");
        return this;
    }

    public BaiduDeviceSelect maxDgProxyIp(){
        set.add("max(dg_proxy_ip) as dg_proxy_ip");
        return this;
    }

    public BaiduDeviceSelect sumDgProxyIp(){
        set.add("sum(dg_proxy_ip) as dg_proxy_ip");
        return this;
    }
    public BaiduDeviceSelect createTime(){
        set.add("create_time");
        return this;
    }

    public BaiduDeviceSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public BaiduDeviceSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public BaiduDeviceSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public BaiduDeviceSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public BaiduDeviceSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public BaiduDeviceSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public BaiduDeviceSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public BaiduDeviceSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public BaiduDeviceSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public BaiduDeviceSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public BaiduDeviceSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public BaiduDeviceSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public BaiduDeviceSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public BaiduDeviceSelect lastSyncTime(){
        set.add("last_sync_time");
        return this;
    }

    public BaiduDeviceSelect excludeLastSyncTime(){
        excludeSet.add("last_sync_time");
        return this;
    }

    public BaiduDeviceSelect avgLastSyncTime(){
        set.add("avg(last_sync_time) as last_sync_time");
        return this;
    }

    public BaiduDeviceSelect countLastSyncTime(){
        set.add("count(last_sync_time) as last_sync_time");
        return this;
    }

    public BaiduDeviceSelect minLastSyncTime(){
        set.add("min(last_sync_time) as last_sync_time");
        return this;
    }

    public BaiduDeviceSelect maxLastSyncTime(){
        set.add("max(last_sync_time) as last_sync_time");
        return this;
    }

    public BaiduDeviceSelect sumLastSyncTime(){
        set.add("sum(last_sync_time) as last_sync_time");
        return this;
    }
    public BaiduDeviceSelect fkCloudRegionId(){
        set.add("fk_cloud_region_id");
        return this;
    }

    public BaiduDeviceSelect excludeFkCloudRegionId(){
        excludeSet.add("fk_cloud_region_id");
        return this;
    }

    public BaiduDeviceSelect avgFkCloudRegionId(){
        set.add("avg(fk_cloud_region_id) as fk_cloud_region_id");
        return this;
    }

    public BaiduDeviceSelect countFkCloudRegionId(){
        set.add("count(fk_cloud_region_id) as fk_cloud_region_id");
        return this;
    }

    public BaiduDeviceSelect minFkCloudRegionId(){
        set.add("min(fk_cloud_region_id) as fk_cloud_region_id");
        return this;
    }

    public BaiduDeviceSelect maxFkCloudRegionId(){
        set.add("max(fk_cloud_region_id) as fk_cloud_region_id");
        return this;
    }

    public BaiduDeviceSelect sumFkCloudRegionId(){
        set.add("sum(fk_cloud_region_id) as fk_cloud_region_id");
        return this;
    }
    public BaiduDeviceSelect pubIp(){
        set.add("pub_ip");
        return this;
    }

    public BaiduDeviceSelect excludePubIp(){
        excludeSet.add("pub_ip");
        return this;
    }

    public BaiduDeviceSelect avgPubIp(){
        set.add("avg(pub_ip) as pub_ip");
        return this;
    }

    public BaiduDeviceSelect countPubIp(){
        set.add("count(pub_ip) as pub_ip");
        return this;
    }

    public BaiduDeviceSelect minPubIp(){
        set.add("min(pub_ip) as pub_ip");
        return this;
    }

    public BaiduDeviceSelect maxPubIp(){
        set.add("max(pub_ip) as pub_ip");
        return this;
    }

    public BaiduDeviceSelect sumPubIp(){
        set.add("sum(pub_ip) as pub_ip");
        return this;
    }
    public BaiduDeviceSelect audioSockType(){
        set.add("audio_sock_type");
        return this;
    }

    public BaiduDeviceSelect excludeAudioSockType(){
        excludeSet.add("audio_sock_type");
        return this;
    }

    public BaiduDeviceSelect avgAudioSockType(){
        set.add("avg(audio_sock_type) as audio_sock_type");
        return this;
    }

    public BaiduDeviceSelect countAudioSockType(){
        set.add("count(audio_sock_type) as audio_sock_type");
        return this;
    }

    public BaiduDeviceSelect minAudioSockType(){
        set.add("min(audio_sock_type) as audio_sock_type");
        return this;
    }

    public BaiduDeviceSelect maxAudioSockType(){
        set.add("max(audio_sock_type) as audio_sock_type");
        return this;
    }

    public BaiduDeviceSelect sumAudioSockType(){
        set.add("sum(audio_sock_type) as audio_sock_type");
        return this;
    }
    public BaiduDeviceSelect audioPort(){
        set.add("audio_port");
        return this;
    }

    public BaiduDeviceSelect excludeAudioPort(){
        excludeSet.add("audio_port");
        return this;
    }

    public BaiduDeviceSelect avgAudioPort(){
        set.add("avg(audio_port) as audio_port");
        return this;
    }

    public BaiduDeviceSelect countAudioPort(){
        set.add("count(audio_port) as audio_port");
        return this;
    }

    public BaiduDeviceSelect minAudioPort(){
        set.add("min(audio_port) as audio_port");
        return this;
    }

    public BaiduDeviceSelect maxAudioPort(){
        set.add("max(audio_port) as audio_port");
        return this;
    }

    public BaiduDeviceSelect sumAudioPort(){
        set.add("sum(audio_port) as audio_port");
        return this;
    }
    public BaiduDeviceSelect audioExternalPort(){
        set.add("audio_external_port");
        return this;
    }

    public BaiduDeviceSelect excludeAudioExternalPort(){
        excludeSet.add("audio_external_port");
        return this;
    }

    public BaiduDeviceSelect avgAudioExternalPort(){
        set.add("avg(audio_external_port) as audio_external_port");
        return this;
    }

    public BaiduDeviceSelect countAudioExternalPort(){
        set.add("count(audio_external_port) as audio_external_port");
        return this;
    }

    public BaiduDeviceSelect minAudioExternalPort(){
        set.add("min(audio_external_port) as audio_external_port");
        return this;
    }

    public BaiduDeviceSelect maxAudioExternalPort(){
        set.add("max(audio_external_port) as audio_external_port");
        return this;
    }

    public BaiduDeviceSelect sumAudioExternalPort(){
        set.add("sum(audio_external_port) as audio_external_port");
        return this;
    }
    public BaiduDeviceSelect videoPort(){
        set.add("video_port");
        return this;
    }

    public BaiduDeviceSelect excludeVideoPort(){
        excludeSet.add("video_port");
        return this;
    }

    public BaiduDeviceSelect avgVideoPort(){
        set.add("avg(video_port) as video_port");
        return this;
    }

    public BaiduDeviceSelect countVideoPort(){
        set.add("count(video_port) as video_port");
        return this;
    }

    public BaiduDeviceSelect minVideoPort(){
        set.add("min(video_port) as video_port");
        return this;
    }

    public BaiduDeviceSelect maxVideoPort(){
        set.add("max(video_port) as video_port");
        return this;
    }

    public BaiduDeviceSelect sumVideoPort(){
        set.add("sum(video_port) as video_port");
        return this;
    }
    public BaiduDeviceSelect videoExternalPort(){
        set.add("video_external_port");
        return this;
    }

    public BaiduDeviceSelect excludeVideoExternalPort(){
        excludeSet.add("video_external_port");
        return this;
    }

    public BaiduDeviceSelect avgVideoExternalPort(){
        set.add("avg(video_external_port) as video_external_port");
        return this;
    }

    public BaiduDeviceSelect countVideoExternalPort(){
        set.add("count(video_external_port) as video_external_port");
        return this;
    }

    public BaiduDeviceSelect minVideoExternalPort(){
        set.add("min(video_external_port) as video_external_port");
        return this;
    }

    public BaiduDeviceSelect maxVideoExternalPort(){
        set.add("max(video_external_port) as video_external_port");
        return this;
    }

    public BaiduDeviceSelect sumVideoExternalPort(){
        set.add("sum(video_external_port) as video_external_port");
        return this;
    }
    public BaiduDeviceSelect maxslots(){
        set.add("maxslots");
        return this;
    }

    public BaiduDeviceSelect excludeMaxslots(){
        excludeSet.add("maxslots");
        return this;
    }

    public BaiduDeviceSelect avgMaxslots(){
        set.add("avg(maxslots) as maxslots");
        return this;
    }

    public BaiduDeviceSelect countMaxslots(){
        set.add("count(maxslots) as maxslots");
        return this;
    }

    public BaiduDeviceSelect minMaxslots(){
        set.add("min(maxslots) as maxslots");
        return this;
    }

    public BaiduDeviceSelect maxMaxslots(){
        set.add("max(maxslots) as maxslots");
        return this;
    }

    public BaiduDeviceSelect sumMaxslots(){
        set.add("sum(maxslots) as maxslots");
        return this;
    }
    public BaiduDeviceSelect rtcMinPort(){
        set.add("rtc_min_port");
        return this;
    }

    public BaiduDeviceSelect excludeRtcMinPort(){
        excludeSet.add("rtc_min_port");
        return this;
    }

    public BaiduDeviceSelect avgRtcMinPort(){
        set.add("avg(rtc_min_port) as rtc_min_port");
        return this;
    }

    public BaiduDeviceSelect countRtcMinPort(){
        set.add("count(rtc_min_port) as rtc_min_port");
        return this;
    }

    public BaiduDeviceSelect minRtcMinPort(){
        set.add("min(rtc_min_port) as rtc_min_port");
        return this;
    }

    public BaiduDeviceSelect maxRtcMinPort(){
        set.add("max(rtc_min_port) as rtc_min_port");
        return this;
    }

    public BaiduDeviceSelect sumRtcMinPort(){
        set.add("sum(rtc_min_port) as rtc_min_port");
        return this;
    }
    public BaiduDeviceSelect rtcMaxPort(){
        set.add("rtc_max_port");
        return this;
    }

    public BaiduDeviceSelect excludeRtcMaxPort(){
        excludeSet.add("rtc_max_port");
        return this;
    }

    public BaiduDeviceSelect avgRtcMaxPort(){
        set.add("avg(rtc_max_port) as rtc_max_port");
        return this;
    }

    public BaiduDeviceSelect countRtcMaxPort(){
        set.add("count(rtc_max_port) as rtc_max_port");
        return this;
    }

    public BaiduDeviceSelect minRtcMaxPort(){
        set.add("min(rtc_max_port) as rtc_max_port");
        return this;
    }

    public BaiduDeviceSelect maxRtcMaxPort(){
        set.add("max(rtc_max_port) as rtc_max_port");
        return this;
    }

    public BaiduDeviceSelect sumRtcMaxPort(){
        set.add("sum(rtc_max_port) as rtc_max_port");
        return this;
    }
    public BaiduDeviceSelect rtcMinExternalPort(){
        set.add("rtc_min_external_port");
        return this;
    }

    public BaiduDeviceSelect excludeRtcMinExternalPort(){
        excludeSet.add("rtc_min_external_port");
        return this;
    }

    public BaiduDeviceSelect avgRtcMinExternalPort(){
        set.add("avg(rtc_min_external_port) as rtc_min_external_port");
        return this;
    }

    public BaiduDeviceSelect countRtcMinExternalPort(){
        set.add("count(rtc_min_external_port) as rtc_min_external_port");
        return this;
    }

    public BaiduDeviceSelect minRtcMinExternalPort(){
        set.add("min(rtc_min_external_port) as rtc_min_external_port");
        return this;
    }

    public BaiduDeviceSelect maxRtcMinExternalPort(){
        set.add("max(rtc_min_external_port) as rtc_min_external_port");
        return this;
    }

    public BaiduDeviceSelect sumRtcMinExternalPort(){
        set.add("sum(rtc_min_external_port) as rtc_min_external_port");
        return this;
    }
    public BaiduDeviceSelect rtcMaxExternalPort(){
        set.add("rtc_max_external_port");
        return this;
    }

    public BaiduDeviceSelect excludeRtcMaxExternalPort(){
        excludeSet.add("rtc_max_external_port");
        return this;
    }

    public BaiduDeviceSelect avgRtcMaxExternalPort(){
        set.add("avg(rtc_max_external_port) as rtc_max_external_port");
        return this;
    }

    public BaiduDeviceSelect countRtcMaxExternalPort(){
        set.add("count(rtc_max_external_port) as rtc_max_external_port");
        return this;
    }

    public BaiduDeviceSelect minRtcMaxExternalPort(){
        set.add("min(rtc_max_external_port) as rtc_max_external_port");
        return this;
    }

    public BaiduDeviceSelect maxRtcMaxExternalPort(){
        set.add("max(rtc_max_external_port) as rtc_max_external_port");
        return this;
    }

    public BaiduDeviceSelect sumRtcMaxExternalPort(){
        set.add("sum(rtc_max_external_port) as rtc_max_external_port");
        return this;
    }
    public BaiduDeviceSelect resetTastUid(){
        set.add("reset_tast_uid");
        return this;
    }

    public BaiduDeviceSelect excludeResetTastUid(){
        excludeSet.add("reset_tast_uid");
        return this;
    }

    public BaiduDeviceSelect avgResetTastUid(){
        set.add("avg(reset_tast_uid) as reset_tast_uid");
        return this;
    }

    public BaiduDeviceSelect countResetTastUid(){
        set.add("count(reset_tast_uid) as reset_tast_uid");
        return this;
    }

    public BaiduDeviceSelect minResetTastUid(){
        set.add("min(reset_tast_uid) as reset_tast_uid");
        return this;
    }

    public BaiduDeviceSelect maxResetTastUid(){
        set.add("max(reset_tast_uid) as reset_tast_uid");
        return this;
    }

    public BaiduDeviceSelect sumResetTastUid(){
        set.add("sum(reset_tast_uid) as reset_tast_uid");
        return this;
    }
    public BaiduDeviceSelect uploadImageTaskId(){
        set.add("upload_image_task_id");
        return this;
    }

    public BaiduDeviceSelect excludeUploadImageTaskId(){
        excludeSet.add("upload_image_task_id");
        return this;
    }

    public BaiduDeviceSelect avgUploadImageTaskId(){
        set.add("avg(upload_image_task_id) as upload_image_task_id");
        return this;
    }

    public BaiduDeviceSelect countUploadImageTaskId(){
        set.add("count(upload_image_task_id) as upload_image_task_id");
        return this;
    }

    public BaiduDeviceSelect minUploadImageTaskId(){
        set.add("min(upload_image_task_id) as upload_image_task_id");
        return this;
    }

    public BaiduDeviceSelect maxUploadImageTaskId(){
        set.add("max(upload_image_task_id) as upload_image_task_id");
        return this;
    }

    public BaiduDeviceSelect sumUploadImageTaskId(){
        set.add("sum(upload_image_task_id) as upload_image_task_id");
        return this;
    }
    public BaiduDeviceSelect resetReponse(){
        set.add("reset_reponse");
        return this;
    }

    public BaiduDeviceSelect excludeResetReponse(){
        excludeSet.add("reset_reponse");
        return this;
    }

    public BaiduDeviceSelect avgResetReponse(){
        set.add("avg(reset_reponse) as reset_reponse");
        return this;
    }

    public BaiduDeviceSelect countResetReponse(){
        set.add("count(reset_reponse) as reset_reponse");
        return this;
    }

    public BaiduDeviceSelect minResetReponse(){
        set.add("min(reset_reponse) as reset_reponse");
        return this;
    }

    public BaiduDeviceSelect maxResetReponse(){
        set.add("max(reset_reponse) as reset_reponse");
        return this;
    }

    public BaiduDeviceSelect sumResetReponse(){
        set.add("sum(reset_reponse) as reset_reponse");
        return this;
    }
    public BaiduDeviceSelect uploadResponse(){
        set.add("upload_response");
        return this;
    }

    public BaiduDeviceSelect excludeUploadResponse(){
        excludeSet.add("upload_response");
        return this;
    }

    public BaiduDeviceSelect avgUploadResponse(){
        set.add("avg(upload_response) as upload_response");
        return this;
    }

    public BaiduDeviceSelect countUploadResponse(){
        set.add("count(upload_response) as upload_response");
        return this;
    }

    public BaiduDeviceSelect minUploadResponse(){
        set.add("min(upload_response) as upload_response");
        return this;
    }

    public BaiduDeviceSelect maxUploadResponse(){
        set.add("max(upload_response) as upload_response");
        return this;
    }

    public BaiduDeviceSelect sumUploadResponse(){
        set.add("sum(upload_response) as upload_response");
        return this;
    }

    boolean distinct=false;

     public BaiduDeviceSelect distinct(){
        this.distinct=true;
        return this;
    }

    public BaiduDeviceSelect includes(Consumer<Set<String>> other){
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
