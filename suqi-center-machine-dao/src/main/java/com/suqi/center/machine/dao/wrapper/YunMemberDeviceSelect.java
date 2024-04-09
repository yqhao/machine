package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 用户设备表（yun_member_device）
 * </p>
 * "yun_member_device"
 * @author PC001
 */
public class YunMemberDeviceSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public YunMemberDeviceSelect columns(){
        set.add("id");
        set.add("fk_member_id");
        set.add("fk_em_member_group_id");
        set.add("user_device_no");
        set.add("smkp_instance_id");
        set.add("fk_em_soc_devices_id");
        set.add("fk_soc_vm_devices_id");
        set.add("member_group_name");
        set.add("fk_yun_product_id");
        set.add("fk_yun_product_sku_id");
        set.add("product_name");
        set.add("device_id");
        set.add("device_name");
        set.add("valid_start_time");
        set.add("valid_end_time");
        set.add("freeze_start_time");
        set.add("freeze_end_time");
        set.add("total_available_days");
        set.add("total_available_times");
        set.add("rest_valid_days");
        set.add("rest_valid_times");
        set.add("biz_type");
        set.add("source_type");
        set.add("expired_times");
        set.add("lifecycle");
        set.add("factory_reset_times");
        set.add("is_silent");
        set.add("reboot_times");
        set.add("failure");
        set.add("sync_install");
        set.add("room_session");
        set.add("room_people_max_num");
        set.add("room_people_total_num");
        set.add("allot_status");
        set.add("server_type");
        set.add("service_biz_type");
        set.add("downstream_broadband");
        set.add("status");
        set.add("buy_time");
        set.add("last_renew_time");
        set.add("create_time");
        set.add("idle_time");
        set.add("version_id");
        set.add("proxy_province");
        set.add("proxy_city");
        set.add("proxy_server");
        set.add("connected");
        set.add("proxy_net_ip");
        set.add("proxy_net_ip_address");
        set.add("seed_device");
        set.add("fk_server_host_usage_rate_id");
        set.add("fk_pcp_area_id");
        return this;
    }

    public YunMemberDeviceSelect id(){
        set.add("id");
        return this;
    }

    public YunMemberDeviceSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public YunMemberDeviceSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public YunMemberDeviceSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public YunMemberDeviceSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public YunMemberDeviceSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public YunMemberDeviceSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public YunMemberDeviceSelect fkMemberId(){
        set.add("fk_member_id");
        return this;
    }

    public YunMemberDeviceSelect excludeFkMemberId(){
        excludeSet.add("fk_member_id");
        return this;
    }

    public YunMemberDeviceSelect avgFkMemberId(){
        set.add("avg(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberDeviceSelect countFkMemberId(){
        set.add("count(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberDeviceSelect minFkMemberId(){
        set.add("min(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberDeviceSelect maxFkMemberId(){
        set.add("max(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberDeviceSelect sumFkMemberId(){
        set.add("sum(fk_member_id) as fk_member_id");
        return this;
    }
    public YunMemberDeviceSelect fkEmMemberGroupId(){
        set.add("fk_em_member_group_id");
        return this;
    }

    public YunMemberDeviceSelect excludeFkEmMemberGroupId(){
        excludeSet.add("fk_em_member_group_id");
        return this;
    }

    public YunMemberDeviceSelect avgFkEmMemberGroupId(){
        set.add("avg(fk_em_member_group_id) as fk_em_member_group_id");
        return this;
    }

    public YunMemberDeviceSelect countFkEmMemberGroupId(){
        set.add("count(fk_em_member_group_id) as fk_em_member_group_id");
        return this;
    }

    public YunMemberDeviceSelect minFkEmMemberGroupId(){
        set.add("min(fk_em_member_group_id) as fk_em_member_group_id");
        return this;
    }

    public YunMemberDeviceSelect maxFkEmMemberGroupId(){
        set.add("max(fk_em_member_group_id) as fk_em_member_group_id");
        return this;
    }

    public YunMemberDeviceSelect sumFkEmMemberGroupId(){
        set.add("sum(fk_em_member_group_id) as fk_em_member_group_id");
        return this;
    }
    public YunMemberDeviceSelect userDeviceNo(){
        set.add("user_device_no");
        return this;
    }

    public YunMemberDeviceSelect excludeUserDeviceNo(){
        excludeSet.add("user_device_no");
        return this;
    }

    public YunMemberDeviceSelect avgUserDeviceNo(){
        set.add("avg(user_device_no) as user_device_no");
        return this;
    }

    public YunMemberDeviceSelect countUserDeviceNo(){
        set.add("count(user_device_no) as user_device_no");
        return this;
    }

    public YunMemberDeviceSelect minUserDeviceNo(){
        set.add("min(user_device_no) as user_device_no");
        return this;
    }

    public YunMemberDeviceSelect maxUserDeviceNo(){
        set.add("max(user_device_no) as user_device_no");
        return this;
    }

    public YunMemberDeviceSelect sumUserDeviceNo(){
        set.add("sum(user_device_no) as user_device_no");
        return this;
    }
    public YunMemberDeviceSelect smkpInstanceId(){
        set.add("smkp_instance_id");
        return this;
    }

    public YunMemberDeviceSelect excludeSmkpInstanceId(){
        excludeSet.add("smkp_instance_id");
        return this;
    }

    public YunMemberDeviceSelect avgSmkpInstanceId(){
        set.add("avg(smkp_instance_id) as smkp_instance_id");
        return this;
    }

    public YunMemberDeviceSelect countSmkpInstanceId(){
        set.add("count(smkp_instance_id) as smkp_instance_id");
        return this;
    }

    public YunMemberDeviceSelect minSmkpInstanceId(){
        set.add("min(smkp_instance_id) as smkp_instance_id");
        return this;
    }

    public YunMemberDeviceSelect maxSmkpInstanceId(){
        set.add("max(smkp_instance_id) as smkp_instance_id");
        return this;
    }

    public YunMemberDeviceSelect sumSmkpInstanceId(){
        set.add("sum(smkp_instance_id) as smkp_instance_id");
        return this;
    }
    public YunMemberDeviceSelect fkEmSocDevicesId(){
        set.add("fk_em_soc_devices_id");
        return this;
    }

    public YunMemberDeviceSelect excludeFkEmSocDevicesId(){
        excludeSet.add("fk_em_soc_devices_id");
        return this;
    }

    public YunMemberDeviceSelect avgFkEmSocDevicesId(){
        set.add("avg(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public YunMemberDeviceSelect countFkEmSocDevicesId(){
        set.add("count(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public YunMemberDeviceSelect minFkEmSocDevicesId(){
        set.add("min(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public YunMemberDeviceSelect maxFkEmSocDevicesId(){
        set.add("max(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public YunMemberDeviceSelect sumFkEmSocDevicesId(){
        set.add("sum(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }
    public YunMemberDeviceSelect fkSocVmDevicesId(){
        set.add("fk_soc_vm_devices_id");
        return this;
    }

    public YunMemberDeviceSelect excludeFkSocVmDevicesId(){
        excludeSet.add("fk_soc_vm_devices_id");
        return this;
    }

    public YunMemberDeviceSelect avgFkSocVmDevicesId(){
        set.add("avg(fk_soc_vm_devices_id) as fk_soc_vm_devices_id");
        return this;
    }

    public YunMemberDeviceSelect countFkSocVmDevicesId(){
        set.add("count(fk_soc_vm_devices_id) as fk_soc_vm_devices_id");
        return this;
    }

    public YunMemberDeviceSelect minFkSocVmDevicesId(){
        set.add("min(fk_soc_vm_devices_id) as fk_soc_vm_devices_id");
        return this;
    }

    public YunMemberDeviceSelect maxFkSocVmDevicesId(){
        set.add("max(fk_soc_vm_devices_id) as fk_soc_vm_devices_id");
        return this;
    }

    public YunMemberDeviceSelect sumFkSocVmDevicesId(){
        set.add("sum(fk_soc_vm_devices_id) as fk_soc_vm_devices_id");
        return this;
    }
    public YunMemberDeviceSelect memberGroupName(){
        set.add("member_group_name");
        return this;
    }

    public YunMemberDeviceSelect excludeMemberGroupName(){
        excludeSet.add("member_group_name");
        return this;
    }

    public YunMemberDeviceSelect avgMemberGroupName(){
        set.add("avg(member_group_name) as member_group_name");
        return this;
    }

    public YunMemberDeviceSelect countMemberGroupName(){
        set.add("count(member_group_name) as member_group_name");
        return this;
    }

    public YunMemberDeviceSelect minMemberGroupName(){
        set.add("min(member_group_name) as member_group_name");
        return this;
    }

    public YunMemberDeviceSelect maxMemberGroupName(){
        set.add("max(member_group_name) as member_group_name");
        return this;
    }

    public YunMemberDeviceSelect sumMemberGroupName(){
        set.add("sum(member_group_name) as member_group_name");
        return this;
    }
    public YunMemberDeviceSelect fkYunProductId(){
        set.add("fk_yun_product_id");
        return this;
    }

    public YunMemberDeviceSelect excludeFkYunProductId(){
        excludeSet.add("fk_yun_product_id");
        return this;
    }

    public YunMemberDeviceSelect avgFkYunProductId(){
        set.add("avg(fk_yun_product_id) as fk_yun_product_id");
        return this;
    }

    public YunMemberDeviceSelect countFkYunProductId(){
        set.add("count(fk_yun_product_id) as fk_yun_product_id");
        return this;
    }

    public YunMemberDeviceSelect minFkYunProductId(){
        set.add("min(fk_yun_product_id) as fk_yun_product_id");
        return this;
    }

    public YunMemberDeviceSelect maxFkYunProductId(){
        set.add("max(fk_yun_product_id) as fk_yun_product_id");
        return this;
    }

    public YunMemberDeviceSelect sumFkYunProductId(){
        set.add("sum(fk_yun_product_id) as fk_yun_product_id");
        return this;
    }
    public YunMemberDeviceSelect fkYunProductSkuId(){
        set.add("fk_yun_product_sku_id");
        return this;
    }

    public YunMemberDeviceSelect excludeFkYunProductSkuId(){
        excludeSet.add("fk_yun_product_sku_id");
        return this;
    }

    public YunMemberDeviceSelect avgFkYunProductSkuId(){
        set.add("avg(fk_yun_product_sku_id) as fk_yun_product_sku_id");
        return this;
    }

    public YunMemberDeviceSelect countFkYunProductSkuId(){
        set.add("count(fk_yun_product_sku_id) as fk_yun_product_sku_id");
        return this;
    }

    public YunMemberDeviceSelect minFkYunProductSkuId(){
        set.add("min(fk_yun_product_sku_id) as fk_yun_product_sku_id");
        return this;
    }

    public YunMemberDeviceSelect maxFkYunProductSkuId(){
        set.add("max(fk_yun_product_sku_id) as fk_yun_product_sku_id");
        return this;
    }

    public YunMemberDeviceSelect sumFkYunProductSkuId(){
        set.add("sum(fk_yun_product_sku_id) as fk_yun_product_sku_id");
        return this;
    }
    public YunMemberDeviceSelect productName(){
        set.add("product_name");
        return this;
    }

    public YunMemberDeviceSelect excludeProductName(){
        excludeSet.add("product_name");
        return this;
    }

    public YunMemberDeviceSelect avgProductName(){
        set.add("avg(product_name) as product_name");
        return this;
    }

    public YunMemberDeviceSelect countProductName(){
        set.add("count(product_name) as product_name");
        return this;
    }

    public YunMemberDeviceSelect minProductName(){
        set.add("min(product_name) as product_name");
        return this;
    }

    public YunMemberDeviceSelect maxProductName(){
        set.add("max(product_name) as product_name");
        return this;
    }

    public YunMemberDeviceSelect sumProductName(){
        set.add("sum(product_name) as product_name");
        return this;
    }
    public YunMemberDeviceSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public YunMemberDeviceSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public YunMemberDeviceSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public YunMemberDeviceSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public YunMemberDeviceSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public YunMemberDeviceSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public YunMemberDeviceSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public YunMemberDeviceSelect deviceName(){
        set.add("device_name");
        return this;
    }

    public YunMemberDeviceSelect excludeDeviceName(){
        excludeSet.add("device_name");
        return this;
    }

    public YunMemberDeviceSelect avgDeviceName(){
        set.add("avg(device_name) as device_name");
        return this;
    }

    public YunMemberDeviceSelect countDeviceName(){
        set.add("count(device_name) as device_name");
        return this;
    }

    public YunMemberDeviceSelect minDeviceName(){
        set.add("min(device_name) as device_name");
        return this;
    }

    public YunMemberDeviceSelect maxDeviceName(){
        set.add("max(device_name) as device_name");
        return this;
    }

    public YunMemberDeviceSelect sumDeviceName(){
        set.add("sum(device_name) as device_name");
        return this;
    }
    public YunMemberDeviceSelect validStartTime(){
        set.add("valid_start_time");
        return this;
    }

    public YunMemberDeviceSelect excludeValidStartTime(){
        excludeSet.add("valid_start_time");
        return this;
    }

    public YunMemberDeviceSelect avgValidStartTime(){
        set.add("avg(valid_start_time) as valid_start_time");
        return this;
    }

    public YunMemberDeviceSelect countValidStartTime(){
        set.add("count(valid_start_time) as valid_start_time");
        return this;
    }

    public YunMemberDeviceSelect minValidStartTime(){
        set.add("min(valid_start_time) as valid_start_time");
        return this;
    }

    public YunMemberDeviceSelect maxValidStartTime(){
        set.add("max(valid_start_time) as valid_start_time");
        return this;
    }

    public YunMemberDeviceSelect sumValidStartTime(){
        set.add("sum(valid_start_time) as valid_start_time");
        return this;
    }
    public YunMemberDeviceSelect validEndTime(){
        set.add("valid_end_time");
        return this;
    }

    public YunMemberDeviceSelect excludeValidEndTime(){
        excludeSet.add("valid_end_time");
        return this;
    }

    public YunMemberDeviceSelect avgValidEndTime(){
        set.add("avg(valid_end_time) as valid_end_time");
        return this;
    }

    public YunMemberDeviceSelect countValidEndTime(){
        set.add("count(valid_end_time) as valid_end_time");
        return this;
    }

    public YunMemberDeviceSelect minValidEndTime(){
        set.add("min(valid_end_time) as valid_end_time");
        return this;
    }

    public YunMemberDeviceSelect maxValidEndTime(){
        set.add("max(valid_end_time) as valid_end_time");
        return this;
    }

    public YunMemberDeviceSelect sumValidEndTime(){
        set.add("sum(valid_end_time) as valid_end_time");
        return this;
    }
    public YunMemberDeviceSelect freezeStartTime(){
        set.add("freeze_start_time");
        return this;
    }

    public YunMemberDeviceSelect excludeFreezeStartTime(){
        excludeSet.add("freeze_start_time");
        return this;
    }

    public YunMemberDeviceSelect avgFreezeStartTime(){
        set.add("avg(freeze_start_time) as freeze_start_time");
        return this;
    }

    public YunMemberDeviceSelect countFreezeStartTime(){
        set.add("count(freeze_start_time) as freeze_start_time");
        return this;
    }

    public YunMemberDeviceSelect minFreezeStartTime(){
        set.add("min(freeze_start_time) as freeze_start_time");
        return this;
    }

    public YunMemberDeviceSelect maxFreezeStartTime(){
        set.add("max(freeze_start_time) as freeze_start_time");
        return this;
    }

    public YunMemberDeviceSelect sumFreezeStartTime(){
        set.add("sum(freeze_start_time) as freeze_start_time");
        return this;
    }
    public YunMemberDeviceSelect freezeEndTime(){
        set.add("freeze_end_time");
        return this;
    }

    public YunMemberDeviceSelect excludeFreezeEndTime(){
        excludeSet.add("freeze_end_time");
        return this;
    }

    public YunMemberDeviceSelect avgFreezeEndTime(){
        set.add("avg(freeze_end_time) as freeze_end_time");
        return this;
    }

    public YunMemberDeviceSelect countFreezeEndTime(){
        set.add("count(freeze_end_time) as freeze_end_time");
        return this;
    }

    public YunMemberDeviceSelect minFreezeEndTime(){
        set.add("min(freeze_end_time) as freeze_end_time");
        return this;
    }

    public YunMemberDeviceSelect maxFreezeEndTime(){
        set.add("max(freeze_end_time) as freeze_end_time");
        return this;
    }

    public YunMemberDeviceSelect sumFreezeEndTime(){
        set.add("sum(freeze_end_time) as freeze_end_time");
        return this;
    }
    public YunMemberDeviceSelect totalAvailableDays(){
        set.add("total_available_days");
        return this;
    }

    public YunMemberDeviceSelect excludeTotalAvailableDays(){
        excludeSet.add("total_available_days");
        return this;
    }

    public YunMemberDeviceSelect avgTotalAvailableDays(){
        set.add("avg(total_available_days) as total_available_days");
        return this;
    }

    public YunMemberDeviceSelect countTotalAvailableDays(){
        set.add("count(total_available_days) as total_available_days");
        return this;
    }

    public YunMemberDeviceSelect minTotalAvailableDays(){
        set.add("min(total_available_days) as total_available_days");
        return this;
    }

    public YunMemberDeviceSelect maxTotalAvailableDays(){
        set.add("max(total_available_days) as total_available_days");
        return this;
    }

    public YunMemberDeviceSelect sumTotalAvailableDays(){
        set.add("sum(total_available_days) as total_available_days");
        return this;
    }
    public YunMemberDeviceSelect totalAvailableTimes(){
        set.add("total_available_times");
        return this;
    }

    public YunMemberDeviceSelect excludeTotalAvailableTimes(){
        excludeSet.add("total_available_times");
        return this;
    }

    public YunMemberDeviceSelect avgTotalAvailableTimes(){
        set.add("avg(total_available_times) as total_available_times");
        return this;
    }

    public YunMemberDeviceSelect countTotalAvailableTimes(){
        set.add("count(total_available_times) as total_available_times");
        return this;
    }

    public YunMemberDeviceSelect minTotalAvailableTimes(){
        set.add("min(total_available_times) as total_available_times");
        return this;
    }

    public YunMemberDeviceSelect maxTotalAvailableTimes(){
        set.add("max(total_available_times) as total_available_times");
        return this;
    }

    public YunMemberDeviceSelect sumTotalAvailableTimes(){
        set.add("sum(total_available_times) as total_available_times");
        return this;
    }
    public YunMemberDeviceSelect restValidDays(){
        set.add("rest_valid_days");
        return this;
    }

    public YunMemberDeviceSelect excludeRestValidDays(){
        excludeSet.add("rest_valid_days");
        return this;
    }

    public YunMemberDeviceSelect avgRestValidDays(){
        set.add("avg(rest_valid_days) as rest_valid_days");
        return this;
    }

    public YunMemberDeviceSelect countRestValidDays(){
        set.add("count(rest_valid_days) as rest_valid_days");
        return this;
    }

    public YunMemberDeviceSelect minRestValidDays(){
        set.add("min(rest_valid_days) as rest_valid_days");
        return this;
    }

    public YunMemberDeviceSelect maxRestValidDays(){
        set.add("max(rest_valid_days) as rest_valid_days");
        return this;
    }

    public YunMemberDeviceSelect sumRestValidDays(){
        set.add("sum(rest_valid_days) as rest_valid_days");
        return this;
    }
    public YunMemberDeviceSelect restValidTimes(){
        set.add("rest_valid_times");
        return this;
    }

    public YunMemberDeviceSelect excludeRestValidTimes(){
        excludeSet.add("rest_valid_times");
        return this;
    }

    public YunMemberDeviceSelect avgRestValidTimes(){
        set.add("avg(rest_valid_times) as rest_valid_times");
        return this;
    }

    public YunMemberDeviceSelect countRestValidTimes(){
        set.add("count(rest_valid_times) as rest_valid_times");
        return this;
    }

    public YunMemberDeviceSelect minRestValidTimes(){
        set.add("min(rest_valid_times) as rest_valid_times");
        return this;
    }

    public YunMemberDeviceSelect maxRestValidTimes(){
        set.add("max(rest_valid_times) as rest_valid_times");
        return this;
    }

    public YunMemberDeviceSelect sumRestValidTimes(){
        set.add("sum(rest_valid_times) as rest_valid_times");
        return this;
    }
    public YunMemberDeviceSelect bizType(){
        set.add("biz_type");
        return this;
    }

    public YunMemberDeviceSelect excludeBizType(){
        excludeSet.add("biz_type");
        return this;
    }

    public YunMemberDeviceSelect avgBizType(){
        set.add("avg(biz_type) as biz_type");
        return this;
    }

    public YunMemberDeviceSelect countBizType(){
        set.add("count(biz_type) as biz_type");
        return this;
    }

    public YunMemberDeviceSelect minBizType(){
        set.add("min(biz_type) as biz_type");
        return this;
    }

    public YunMemberDeviceSelect maxBizType(){
        set.add("max(biz_type) as biz_type");
        return this;
    }

    public YunMemberDeviceSelect sumBizType(){
        set.add("sum(biz_type) as biz_type");
        return this;
    }
    public YunMemberDeviceSelect sourceType(){
        set.add("source_type");
        return this;
    }

    public YunMemberDeviceSelect excludeSourceType(){
        excludeSet.add("source_type");
        return this;
    }

    public YunMemberDeviceSelect avgSourceType(){
        set.add("avg(source_type) as source_type");
        return this;
    }

    public YunMemberDeviceSelect countSourceType(){
        set.add("count(source_type) as source_type");
        return this;
    }

    public YunMemberDeviceSelect minSourceType(){
        set.add("min(source_type) as source_type");
        return this;
    }

    public YunMemberDeviceSelect maxSourceType(){
        set.add("max(source_type) as source_type");
        return this;
    }

    public YunMemberDeviceSelect sumSourceType(){
        set.add("sum(source_type) as source_type");
        return this;
    }
    public YunMemberDeviceSelect expiredTimes(){
        set.add("expired_times");
        return this;
    }

    public YunMemberDeviceSelect excludeExpiredTimes(){
        excludeSet.add("expired_times");
        return this;
    }

    public YunMemberDeviceSelect avgExpiredTimes(){
        set.add("avg(expired_times) as expired_times");
        return this;
    }

    public YunMemberDeviceSelect countExpiredTimes(){
        set.add("count(expired_times) as expired_times");
        return this;
    }

    public YunMemberDeviceSelect minExpiredTimes(){
        set.add("min(expired_times) as expired_times");
        return this;
    }

    public YunMemberDeviceSelect maxExpiredTimes(){
        set.add("max(expired_times) as expired_times");
        return this;
    }

    public YunMemberDeviceSelect sumExpiredTimes(){
        set.add("sum(expired_times) as expired_times");
        return this;
    }
    public YunMemberDeviceSelect lifecycle(){
        set.add("lifecycle");
        return this;
    }

    public YunMemberDeviceSelect excludeLifecycle(){
        excludeSet.add("lifecycle");
        return this;
    }

    public YunMemberDeviceSelect avgLifecycle(){
        set.add("avg(lifecycle) as lifecycle");
        return this;
    }

    public YunMemberDeviceSelect countLifecycle(){
        set.add("count(lifecycle) as lifecycle");
        return this;
    }

    public YunMemberDeviceSelect minLifecycle(){
        set.add("min(lifecycle) as lifecycle");
        return this;
    }

    public YunMemberDeviceSelect maxLifecycle(){
        set.add("max(lifecycle) as lifecycle");
        return this;
    }

    public YunMemberDeviceSelect sumLifecycle(){
        set.add("sum(lifecycle) as lifecycle");
        return this;
    }
    public YunMemberDeviceSelect factoryResetTimes(){
        set.add("factory_reset_times");
        return this;
    }

    public YunMemberDeviceSelect excludeFactoryResetTimes(){
        excludeSet.add("factory_reset_times");
        return this;
    }

    public YunMemberDeviceSelect avgFactoryResetTimes(){
        set.add("avg(factory_reset_times) as factory_reset_times");
        return this;
    }

    public YunMemberDeviceSelect countFactoryResetTimes(){
        set.add("count(factory_reset_times) as factory_reset_times");
        return this;
    }

    public YunMemberDeviceSelect minFactoryResetTimes(){
        set.add("min(factory_reset_times) as factory_reset_times");
        return this;
    }

    public YunMemberDeviceSelect maxFactoryResetTimes(){
        set.add("max(factory_reset_times) as factory_reset_times");
        return this;
    }

    public YunMemberDeviceSelect sumFactoryResetTimes(){
        set.add("sum(factory_reset_times) as factory_reset_times");
        return this;
    }
    public YunMemberDeviceSelect isSilent(){
        set.add("is_silent");
        return this;
    }

    public YunMemberDeviceSelect excludeIsSilent(){
        excludeSet.add("is_silent");
        return this;
    }

    public YunMemberDeviceSelect avgIsSilent(){
        set.add("avg(is_silent) as is_silent");
        return this;
    }

    public YunMemberDeviceSelect countIsSilent(){
        set.add("count(is_silent) as is_silent");
        return this;
    }

    public YunMemberDeviceSelect minIsSilent(){
        set.add("min(is_silent) as is_silent");
        return this;
    }

    public YunMemberDeviceSelect maxIsSilent(){
        set.add("max(is_silent) as is_silent");
        return this;
    }

    public YunMemberDeviceSelect sumIsSilent(){
        set.add("sum(is_silent) as is_silent");
        return this;
    }
    public YunMemberDeviceSelect rebootTimes(){
        set.add("reboot_times");
        return this;
    }

    public YunMemberDeviceSelect excludeRebootTimes(){
        excludeSet.add("reboot_times");
        return this;
    }

    public YunMemberDeviceSelect avgRebootTimes(){
        set.add("avg(reboot_times) as reboot_times");
        return this;
    }

    public YunMemberDeviceSelect countRebootTimes(){
        set.add("count(reboot_times) as reboot_times");
        return this;
    }

    public YunMemberDeviceSelect minRebootTimes(){
        set.add("min(reboot_times) as reboot_times");
        return this;
    }

    public YunMemberDeviceSelect maxRebootTimes(){
        set.add("max(reboot_times) as reboot_times");
        return this;
    }

    public YunMemberDeviceSelect sumRebootTimes(){
        set.add("sum(reboot_times) as reboot_times");
        return this;
    }
    public YunMemberDeviceSelect failure(){
        set.add("failure");
        return this;
    }

    public YunMemberDeviceSelect excludeFailure(){
        excludeSet.add("failure");
        return this;
    }

    public YunMemberDeviceSelect avgFailure(){
        set.add("avg(failure) as failure");
        return this;
    }

    public YunMemberDeviceSelect countFailure(){
        set.add("count(failure) as failure");
        return this;
    }

    public YunMemberDeviceSelect minFailure(){
        set.add("min(failure) as failure");
        return this;
    }

    public YunMemberDeviceSelect maxFailure(){
        set.add("max(failure) as failure");
        return this;
    }

    public YunMemberDeviceSelect sumFailure(){
        set.add("sum(failure) as failure");
        return this;
    }
    public YunMemberDeviceSelect syncInstall(){
        set.add("sync_install");
        return this;
    }

    public YunMemberDeviceSelect excludeSyncInstall(){
        excludeSet.add("sync_install");
        return this;
    }

    public YunMemberDeviceSelect avgSyncInstall(){
        set.add("avg(sync_install) as sync_install");
        return this;
    }

    public YunMemberDeviceSelect countSyncInstall(){
        set.add("count(sync_install) as sync_install");
        return this;
    }

    public YunMemberDeviceSelect minSyncInstall(){
        set.add("min(sync_install) as sync_install");
        return this;
    }

    public YunMemberDeviceSelect maxSyncInstall(){
        set.add("max(sync_install) as sync_install");
        return this;
    }

    public YunMemberDeviceSelect sumSyncInstall(){
        set.add("sum(sync_install) as sync_install");
        return this;
    }
    public YunMemberDeviceSelect roomSession(){
        set.add("room_session");
        return this;
    }

    public YunMemberDeviceSelect excludeRoomSession(){
        excludeSet.add("room_session");
        return this;
    }

    public YunMemberDeviceSelect avgRoomSession(){
        set.add("avg(room_session) as room_session");
        return this;
    }

    public YunMemberDeviceSelect countRoomSession(){
        set.add("count(room_session) as room_session");
        return this;
    }

    public YunMemberDeviceSelect minRoomSession(){
        set.add("min(room_session) as room_session");
        return this;
    }

    public YunMemberDeviceSelect maxRoomSession(){
        set.add("max(room_session) as room_session");
        return this;
    }

    public YunMemberDeviceSelect sumRoomSession(){
        set.add("sum(room_session) as room_session");
        return this;
    }
    public YunMemberDeviceSelect roomPeopleMaxNum(){
        set.add("room_people_max_num");
        return this;
    }

    public YunMemberDeviceSelect excludeRoomPeopleMaxNum(){
        excludeSet.add("room_people_max_num");
        return this;
    }

    public YunMemberDeviceSelect avgRoomPeopleMaxNum(){
        set.add("avg(room_people_max_num) as room_people_max_num");
        return this;
    }

    public YunMemberDeviceSelect countRoomPeopleMaxNum(){
        set.add("count(room_people_max_num) as room_people_max_num");
        return this;
    }

    public YunMemberDeviceSelect minRoomPeopleMaxNum(){
        set.add("min(room_people_max_num) as room_people_max_num");
        return this;
    }

    public YunMemberDeviceSelect maxRoomPeopleMaxNum(){
        set.add("max(room_people_max_num) as room_people_max_num");
        return this;
    }

    public YunMemberDeviceSelect sumRoomPeopleMaxNum(){
        set.add("sum(room_people_max_num) as room_people_max_num");
        return this;
    }
    public YunMemberDeviceSelect roomPeopleTotalNum(){
        set.add("room_people_total_num");
        return this;
    }

    public YunMemberDeviceSelect excludeRoomPeopleTotalNum(){
        excludeSet.add("room_people_total_num");
        return this;
    }

    public YunMemberDeviceSelect avgRoomPeopleTotalNum(){
        set.add("avg(room_people_total_num) as room_people_total_num");
        return this;
    }

    public YunMemberDeviceSelect countRoomPeopleTotalNum(){
        set.add("count(room_people_total_num) as room_people_total_num");
        return this;
    }

    public YunMemberDeviceSelect minRoomPeopleTotalNum(){
        set.add("min(room_people_total_num) as room_people_total_num");
        return this;
    }

    public YunMemberDeviceSelect maxRoomPeopleTotalNum(){
        set.add("max(room_people_total_num) as room_people_total_num");
        return this;
    }

    public YunMemberDeviceSelect sumRoomPeopleTotalNum(){
        set.add("sum(room_people_total_num) as room_people_total_num");
        return this;
    }
    public YunMemberDeviceSelect allotStatus(){
        set.add("allot_status");
        return this;
    }

    public YunMemberDeviceSelect excludeAllotStatus(){
        excludeSet.add("allot_status");
        return this;
    }

    public YunMemberDeviceSelect avgAllotStatus(){
        set.add("avg(allot_status) as allot_status");
        return this;
    }

    public YunMemberDeviceSelect countAllotStatus(){
        set.add("count(allot_status) as allot_status");
        return this;
    }

    public YunMemberDeviceSelect minAllotStatus(){
        set.add("min(allot_status) as allot_status");
        return this;
    }

    public YunMemberDeviceSelect maxAllotStatus(){
        set.add("max(allot_status) as allot_status");
        return this;
    }

    public YunMemberDeviceSelect sumAllotStatus(){
        set.add("sum(allot_status) as allot_status");
        return this;
    }
    public YunMemberDeviceSelect serverType(){
        set.add("server_type");
        return this;
    }

    public YunMemberDeviceSelect excludeServerType(){
        excludeSet.add("server_type");
        return this;
    }

    public YunMemberDeviceSelect avgServerType(){
        set.add("avg(server_type) as server_type");
        return this;
    }

    public YunMemberDeviceSelect countServerType(){
        set.add("count(server_type) as server_type");
        return this;
    }

    public YunMemberDeviceSelect minServerType(){
        set.add("min(server_type) as server_type");
        return this;
    }

    public YunMemberDeviceSelect maxServerType(){
        set.add("max(server_type) as server_type");
        return this;
    }

    public YunMemberDeviceSelect sumServerType(){
        set.add("sum(server_type) as server_type");
        return this;
    }
    public YunMemberDeviceSelect serviceBizType(){
        set.add("service_biz_type");
        return this;
    }

    public YunMemberDeviceSelect excludeServiceBizType(){
        excludeSet.add("service_biz_type");
        return this;
    }

    public YunMemberDeviceSelect avgServiceBizType(){
        set.add("avg(service_biz_type) as service_biz_type");
        return this;
    }

    public YunMemberDeviceSelect countServiceBizType(){
        set.add("count(service_biz_type) as service_biz_type");
        return this;
    }

    public YunMemberDeviceSelect minServiceBizType(){
        set.add("min(service_biz_type) as service_biz_type");
        return this;
    }

    public YunMemberDeviceSelect maxServiceBizType(){
        set.add("max(service_biz_type) as service_biz_type");
        return this;
    }

    public YunMemberDeviceSelect sumServiceBizType(){
        set.add("sum(service_biz_type) as service_biz_type");
        return this;
    }
    public YunMemberDeviceSelect downstreamBroadband(){
        set.add("downstream_broadband");
        return this;
    }

    public YunMemberDeviceSelect excludeDownstreamBroadband(){
        excludeSet.add("downstream_broadband");
        return this;
    }

    public YunMemberDeviceSelect avgDownstreamBroadband(){
        set.add("avg(downstream_broadband) as downstream_broadband");
        return this;
    }

    public YunMemberDeviceSelect countDownstreamBroadband(){
        set.add("count(downstream_broadband) as downstream_broadband");
        return this;
    }

    public YunMemberDeviceSelect minDownstreamBroadband(){
        set.add("min(downstream_broadband) as downstream_broadband");
        return this;
    }

    public YunMemberDeviceSelect maxDownstreamBroadband(){
        set.add("max(downstream_broadband) as downstream_broadband");
        return this;
    }

    public YunMemberDeviceSelect sumDownstreamBroadband(){
        set.add("sum(downstream_broadband) as downstream_broadband");
        return this;
    }
    public YunMemberDeviceSelect status(){
        set.add("status");
        return this;
    }

    public YunMemberDeviceSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public YunMemberDeviceSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public YunMemberDeviceSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public YunMemberDeviceSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public YunMemberDeviceSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public YunMemberDeviceSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public YunMemberDeviceSelect buyTime(){
        set.add("buy_time");
        return this;
    }

    public YunMemberDeviceSelect excludeBuyTime(){
        excludeSet.add("buy_time");
        return this;
    }

    public YunMemberDeviceSelect avgBuyTime(){
        set.add("avg(buy_time) as buy_time");
        return this;
    }

    public YunMemberDeviceSelect countBuyTime(){
        set.add("count(buy_time) as buy_time");
        return this;
    }

    public YunMemberDeviceSelect minBuyTime(){
        set.add("min(buy_time) as buy_time");
        return this;
    }

    public YunMemberDeviceSelect maxBuyTime(){
        set.add("max(buy_time) as buy_time");
        return this;
    }

    public YunMemberDeviceSelect sumBuyTime(){
        set.add("sum(buy_time) as buy_time");
        return this;
    }
    public YunMemberDeviceSelect lastRenewTime(){
        set.add("last_renew_time");
        return this;
    }

    public YunMemberDeviceSelect excludeLastRenewTime(){
        excludeSet.add("last_renew_time");
        return this;
    }

    public YunMemberDeviceSelect avgLastRenewTime(){
        set.add("avg(last_renew_time) as last_renew_time");
        return this;
    }

    public YunMemberDeviceSelect countLastRenewTime(){
        set.add("count(last_renew_time) as last_renew_time");
        return this;
    }

    public YunMemberDeviceSelect minLastRenewTime(){
        set.add("min(last_renew_time) as last_renew_time");
        return this;
    }

    public YunMemberDeviceSelect maxLastRenewTime(){
        set.add("max(last_renew_time) as last_renew_time");
        return this;
    }

    public YunMemberDeviceSelect sumLastRenewTime(){
        set.add("sum(last_renew_time) as last_renew_time");
        return this;
    }
    public YunMemberDeviceSelect createTime(){
        set.add("create_time");
        return this;
    }

    public YunMemberDeviceSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public YunMemberDeviceSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public YunMemberDeviceSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public YunMemberDeviceSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public YunMemberDeviceSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public YunMemberDeviceSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public YunMemberDeviceSelect idleTime(){
        set.add("idle_time");
        return this;
    }

    public YunMemberDeviceSelect excludeIdleTime(){
        excludeSet.add("idle_time");
        return this;
    }

    public YunMemberDeviceSelect avgIdleTime(){
        set.add("avg(idle_time) as idle_time");
        return this;
    }

    public YunMemberDeviceSelect countIdleTime(){
        set.add("count(idle_time) as idle_time");
        return this;
    }

    public YunMemberDeviceSelect minIdleTime(){
        set.add("min(idle_time) as idle_time");
        return this;
    }

    public YunMemberDeviceSelect maxIdleTime(){
        set.add("max(idle_time) as idle_time");
        return this;
    }

    public YunMemberDeviceSelect sumIdleTime(){
        set.add("sum(idle_time) as idle_time");
        return this;
    }
    public YunMemberDeviceSelect versionId(){
        set.add("version_id");
        return this;
    }

    public YunMemberDeviceSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public YunMemberDeviceSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public YunMemberDeviceSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public YunMemberDeviceSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public YunMemberDeviceSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public YunMemberDeviceSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public YunMemberDeviceSelect proxyProvince(){
        set.add("proxy_province");
        return this;
    }

    public YunMemberDeviceSelect excludeProxyProvince(){
        excludeSet.add("proxy_province");
        return this;
    }

    public YunMemberDeviceSelect avgProxyProvince(){
        set.add("avg(proxy_province) as proxy_province");
        return this;
    }

    public YunMemberDeviceSelect countProxyProvince(){
        set.add("count(proxy_province) as proxy_province");
        return this;
    }

    public YunMemberDeviceSelect minProxyProvince(){
        set.add("min(proxy_province) as proxy_province");
        return this;
    }

    public YunMemberDeviceSelect maxProxyProvince(){
        set.add("max(proxy_province) as proxy_province");
        return this;
    }

    public YunMemberDeviceSelect sumProxyProvince(){
        set.add("sum(proxy_province) as proxy_province");
        return this;
    }
    public YunMemberDeviceSelect proxyCity(){
        set.add("proxy_city");
        return this;
    }

    public YunMemberDeviceSelect excludeProxyCity(){
        excludeSet.add("proxy_city");
        return this;
    }

    public YunMemberDeviceSelect avgProxyCity(){
        set.add("avg(proxy_city) as proxy_city");
        return this;
    }

    public YunMemberDeviceSelect countProxyCity(){
        set.add("count(proxy_city) as proxy_city");
        return this;
    }

    public YunMemberDeviceSelect minProxyCity(){
        set.add("min(proxy_city) as proxy_city");
        return this;
    }

    public YunMemberDeviceSelect maxProxyCity(){
        set.add("max(proxy_city) as proxy_city");
        return this;
    }

    public YunMemberDeviceSelect sumProxyCity(){
        set.add("sum(proxy_city) as proxy_city");
        return this;
    }
    public YunMemberDeviceSelect proxyServer(){
        set.add("proxy_server");
        return this;
    }

    public YunMemberDeviceSelect excludeProxyServer(){
        excludeSet.add("proxy_server");
        return this;
    }

    public YunMemberDeviceSelect avgProxyServer(){
        set.add("avg(proxy_server) as proxy_server");
        return this;
    }

    public YunMemberDeviceSelect countProxyServer(){
        set.add("count(proxy_server) as proxy_server");
        return this;
    }

    public YunMemberDeviceSelect minProxyServer(){
        set.add("min(proxy_server) as proxy_server");
        return this;
    }

    public YunMemberDeviceSelect maxProxyServer(){
        set.add("max(proxy_server) as proxy_server");
        return this;
    }

    public YunMemberDeviceSelect sumProxyServer(){
        set.add("sum(proxy_server) as proxy_server");
        return this;
    }
    public YunMemberDeviceSelect connected(){
        set.add("connected");
        return this;
    }

    public YunMemberDeviceSelect excludeConnected(){
        excludeSet.add("connected");
        return this;
    }

    public YunMemberDeviceSelect avgConnected(){
        set.add("avg(connected) as connected");
        return this;
    }

    public YunMemberDeviceSelect countConnected(){
        set.add("count(connected) as connected");
        return this;
    }

    public YunMemberDeviceSelect minConnected(){
        set.add("min(connected) as connected");
        return this;
    }

    public YunMemberDeviceSelect maxConnected(){
        set.add("max(connected) as connected");
        return this;
    }

    public YunMemberDeviceSelect sumConnected(){
        set.add("sum(connected) as connected");
        return this;
    }
    public YunMemberDeviceSelect proxyNetIp(){
        set.add("proxy_net_ip");
        return this;
    }

    public YunMemberDeviceSelect excludeProxyNetIp(){
        excludeSet.add("proxy_net_ip");
        return this;
    }

    public YunMemberDeviceSelect avgProxyNetIp(){
        set.add("avg(proxy_net_ip) as proxy_net_ip");
        return this;
    }

    public YunMemberDeviceSelect countProxyNetIp(){
        set.add("count(proxy_net_ip) as proxy_net_ip");
        return this;
    }

    public YunMemberDeviceSelect minProxyNetIp(){
        set.add("min(proxy_net_ip) as proxy_net_ip");
        return this;
    }

    public YunMemberDeviceSelect maxProxyNetIp(){
        set.add("max(proxy_net_ip) as proxy_net_ip");
        return this;
    }

    public YunMemberDeviceSelect sumProxyNetIp(){
        set.add("sum(proxy_net_ip) as proxy_net_ip");
        return this;
    }
    public YunMemberDeviceSelect proxyNetIpAddress(){
        set.add("proxy_net_ip_address");
        return this;
    }

    public YunMemberDeviceSelect excludeProxyNetIpAddress(){
        excludeSet.add("proxy_net_ip_address");
        return this;
    }

    public YunMemberDeviceSelect avgProxyNetIpAddress(){
        set.add("avg(proxy_net_ip_address) as proxy_net_ip_address");
        return this;
    }

    public YunMemberDeviceSelect countProxyNetIpAddress(){
        set.add("count(proxy_net_ip_address) as proxy_net_ip_address");
        return this;
    }

    public YunMemberDeviceSelect minProxyNetIpAddress(){
        set.add("min(proxy_net_ip_address) as proxy_net_ip_address");
        return this;
    }

    public YunMemberDeviceSelect maxProxyNetIpAddress(){
        set.add("max(proxy_net_ip_address) as proxy_net_ip_address");
        return this;
    }

    public YunMemberDeviceSelect sumProxyNetIpAddress(){
        set.add("sum(proxy_net_ip_address) as proxy_net_ip_address");
        return this;
    }
    public YunMemberDeviceSelect seedDevice(){
        set.add("seed_device");
        return this;
    }

    public YunMemberDeviceSelect excludeSeedDevice(){
        excludeSet.add("seed_device");
        return this;
    }

    public YunMemberDeviceSelect avgSeedDevice(){
        set.add("avg(seed_device) as seed_device");
        return this;
    }

    public YunMemberDeviceSelect countSeedDevice(){
        set.add("count(seed_device) as seed_device");
        return this;
    }

    public YunMemberDeviceSelect minSeedDevice(){
        set.add("min(seed_device) as seed_device");
        return this;
    }

    public YunMemberDeviceSelect maxSeedDevice(){
        set.add("max(seed_device) as seed_device");
        return this;
    }

    public YunMemberDeviceSelect sumSeedDevice(){
        set.add("sum(seed_device) as seed_device");
        return this;
    }
    public YunMemberDeviceSelect fkServerHostUsageRateId(){
        set.add("fk_server_host_usage_rate_id");
        return this;
    }

    public YunMemberDeviceSelect excludeFkServerHostUsageRateId(){
        excludeSet.add("fk_server_host_usage_rate_id");
        return this;
    }

    public YunMemberDeviceSelect avgFkServerHostUsageRateId(){
        set.add("avg(fk_server_host_usage_rate_id) as fk_server_host_usage_rate_id");
        return this;
    }

    public YunMemberDeviceSelect countFkServerHostUsageRateId(){
        set.add("count(fk_server_host_usage_rate_id) as fk_server_host_usage_rate_id");
        return this;
    }

    public YunMemberDeviceSelect minFkServerHostUsageRateId(){
        set.add("min(fk_server_host_usage_rate_id) as fk_server_host_usage_rate_id");
        return this;
    }

    public YunMemberDeviceSelect maxFkServerHostUsageRateId(){
        set.add("max(fk_server_host_usage_rate_id) as fk_server_host_usage_rate_id");
        return this;
    }

    public YunMemberDeviceSelect sumFkServerHostUsageRateId(){
        set.add("sum(fk_server_host_usage_rate_id) as fk_server_host_usage_rate_id");
        return this;
    }
    public YunMemberDeviceSelect fkPcpAreaId(){
        set.add("fk_pcp_area_id");
        return this;
    }

    public YunMemberDeviceSelect excludeFkPcpAreaId(){
        excludeSet.add("fk_pcp_area_id");
        return this;
    }

    public YunMemberDeviceSelect avgFkPcpAreaId(){
        set.add("avg(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public YunMemberDeviceSelect countFkPcpAreaId(){
        set.add("count(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public YunMemberDeviceSelect minFkPcpAreaId(){
        set.add("min(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public YunMemberDeviceSelect maxFkPcpAreaId(){
        set.add("max(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public YunMemberDeviceSelect sumFkPcpAreaId(){
        set.add("sum(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    boolean distinct=false;

     public YunMemberDeviceSelect distinct(){
        this.distinct=true;
        return this;
    }

    public YunMemberDeviceSelect includes(Consumer<Set<String>> other){
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
