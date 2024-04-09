package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 百度镜像
 * </p>
 * "baidu_images"
 * @author PC001
 */
public class BaiduImagesSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public BaiduImagesSelect columns(){
        set.add("id");
        set.add("fk_baidu_account_id");
        set.add("title");
        set.add("version_code");
        set.add("root_image_file_url");
        set.add("root_image_file_name");
        set.add("root_image_file_type");
        set.add("root_image_file_md5");
        set.add("system_image_file_url");
        set.add("system_image_file_name");
        set.add("system_image_file_type");
        set.add("system_image_file_md5");
        set.add("odm_image_file_url");
        set.add("odm_image_file_name");
        set.add("odm_image_file_type");
        set.add("odm_image_file_md5");
        set.add("vendor_image_file_url");
        set.add("vendor_image_file_name");
        set.add("vendor_image_file_type");
        set.add("vendor_image_file_md5");
        set.add("server_type");
        set.add("rom_version");
        set.add("create_time");
        set.add("image_version_id");
        set.add("status");
        set.add("last_update_time");
        return this;
    }

    public BaiduImagesSelect id(){
        set.add("id");
        return this;
    }

    public BaiduImagesSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public BaiduImagesSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public BaiduImagesSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public BaiduImagesSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public BaiduImagesSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public BaiduImagesSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public BaiduImagesSelect fkBaiduAccountId(){
        set.add("fk_baidu_account_id");
        return this;
    }

    public BaiduImagesSelect excludeFkBaiduAccountId(){
        excludeSet.add("fk_baidu_account_id");
        return this;
    }

    public BaiduImagesSelect avgFkBaiduAccountId(){
        set.add("avg(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }

    public BaiduImagesSelect countFkBaiduAccountId(){
        set.add("count(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }

    public BaiduImagesSelect minFkBaiduAccountId(){
        set.add("min(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }

    public BaiduImagesSelect maxFkBaiduAccountId(){
        set.add("max(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }

    public BaiduImagesSelect sumFkBaiduAccountId(){
        set.add("sum(fk_baidu_account_id) as fk_baidu_account_id");
        return this;
    }
    public BaiduImagesSelect title(){
        set.add("title");
        return this;
    }

    public BaiduImagesSelect excludeTitle(){
        excludeSet.add("title");
        return this;
    }

    public BaiduImagesSelect avgTitle(){
        set.add("avg(title) as title");
        return this;
    }

    public BaiduImagesSelect countTitle(){
        set.add("count(title) as title");
        return this;
    }

    public BaiduImagesSelect minTitle(){
        set.add("min(title) as title");
        return this;
    }

    public BaiduImagesSelect maxTitle(){
        set.add("max(title) as title");
        return this;
    }

    public BaiduImagesSelect sumTitle(){
        set.add("sum(title) as title");
        return this;
    }
    public BaiduImagesSelect versionCode(){
        set.add("version_code");
        return this;
    }

    public BaiduImagesSelect excludeVersionCode(){
        excludeSet.add("version_code");
        return this;
    }

    public BaiduImagesSelect avgVersionCode(){
        set.add("avg(version_code) as version_code");
        return this;
    }

    public BaiduImagesSelect countVersionCode(){
        set.add("count(version_code) as version_code");
        return this;
    }

    public BaiduImagesSelect minVersionCode(){
        set.add("min(version_code) as version_code");
        return this;
    }

    public BaiduImagesSelect maxVersionCode(){
        set.add("max(version_code) as version_code");
        return this;
    }

    public BaiduImagesSelect sumVersionCode(){
        set.add("sum(version_code) as version_code");
        return this;
    }
    public BaiduImagesSelect rootImageFileUrl(){
        set.add("root_image_file_url");
        return this;
    }

    public BaiduImagesSelect excludeRootImageFileUrl(){
        excludeSet.add("root_image_file_url");
        return this;
    }

    public BaiduImagesSelect avgRootImageFileUrl(){
        set.add("avg(root_image_file_url) as root_image_file_url");
        return this;
    }

    public BaiduImagesSelect countRootImageFileUrl(){
        set.add("count(root_image_file_url) as root_image_file_url");
        return this;
    }

    public BaiduImagesSelect minRootImageFileUrl(){
        set.add("min(root_image_file_url) as root_image_file_url");
        return this;
    }

    public BaiduImagesSelect maxRootImageFileUrl(){
        set.add("max(root_image_file_url) as root_image_file_url");
        return this;
    }

    public BaiduImagesSelect sumRootImageFileUrl(){
        set.add("sum(root_image_file_url) as root_image_file_url");
        return this;
    }
    public BaiduImagesSelect rootImageFileName(){
        set.add("root_image_file_name");
        return this;
    }

    public BaiduImagesSelect excludeRootImageFileName(){
        excludeSet.add("root_image_file_name");
        return this;
    }

    public BaiduImagesSelect avgRootImageFileName(){
        set.add("avg(root_image_file_name) as root_image_file_name");
        return this;
    }

    public BaiduImagesSelect countRootImageFileName(){
        set.add("count(root_image_file_name) as root_image_file_name");
        return this;
    }

    public BaiduImagesSelect minRootImageFileName(){
        set.add("min(root_image_file_name) as root_image_file_name");
        return this;
    }

    public BaiduImagesSelect maxRootImageFileName(){
        set.add("max(root_image_file_name) as root_image_file_name");
        return this;
    }

    public BaiduImagesSelect sumRootImageFileName(){
        set.add("sum(root_image_file_name) as root_image_file_name");
        return this;
    }
    public BaiduImagesSelect rootImageFileType(){
        set.add("root_image_file_type");
        return this;
    }

    public BaiduImagesSelect excludeRootImageFileType(){
        excludeSet.add("root_image_file_type");
        return this;
    }

    public BaiduImagesSelect avgRootImageFileType(){
        set.add("avg(root_image_file_type) as root_image_file_type");
        return this;
    }

    public BaiduImagesSelect countRootImageFileType(){
        set.add("count(root_image_file_type) as root_image_file_type");
        return this;
    }

    public BaiduImagesSelect minRootImageFileType(){
        set.add("min(root_image_file_type) as root_image_file_type");
        return this;
    }

    public BaiduImagesSelect maxRootImageFileType(){
        set.add("max(root_image_file_type) as root_image_file_type");
        return this;
    }

    public BaiduImagesSelect sumRootImageFileType(){
        set.add("sum(root_image_file_type) as root_image_file_type");
        return this;
    }
    public BaiduImagesSelect rootImageFileMd5(){
        set.add("root_image_file_md5");
        return this;
    }

    public BaiduImagesSelect excludeRootImageFileMd5(){
        excludeSet.add("root_image_file_md5");
        return this;
    }

    public BaiduImagesSelect avgRootImageFileMd5(){
        set.add("avg(root_image_file_md5) as root_image_file_md5");
        return this;
    }

    public BaiduImagesSelect countRootImageFileMd5(){
        set.add("count(root_image_file_md5) as root_image_file_md5");
        return this;
    }

    public BaiduImagesSelect minRootImageFileMd5(){
        set.add("min(root_image_file_md5) as root_image_file_md5");
        return this;
    }

    public BaiduImagesSelect maxRootImageFileMd5(){
        set.add("max(root_image_file_md5) as root_image_file_md5");
        return this;
    }

    public BaiduImagesSelect sumRootImageFileMd5(){
        set.add("sum(root_image_file_md5) as root_image_file_md5");
        return this;
    }
    public BaiduImagesSelect systemImageFileUrl(){
        set.add("system_image_file_url");
        return this;
    }

    public BaiduImagesSelect excludeSystemImageFileUrl(){
        excludeSet.add("system_image_file_url");
        return this;
    }

    public BaiduImagesSelect avgSystemImageFileUrl(){
        set.add("avg(system_image_file_url) as system_image_file_url");
        return this;
    }

    public BaiduImagesSelect countSystemImageFileUrl(){
        set.add("count(system_image_file_url) as system_image_file_url");
        return this;
    }

    public BaiduImagesSelect minSystemImageFileUrl(){
        set.add("min(system_image_file_url) as system_image_file_url");
        return this;
    }

    public BaiduImagesSelect maxSystemImageFileUrl(){
        set.add("max(system_image_file_url) as system_image_file_url");
        return this;
    }

    public BaiduImagesSelect sumSystemImageFileUrl(){
        set.add("sum(system_image_file_url) as system_image_file_url");
        return this;
    }
    public BaiduImagesSelect systemImageFileName(){
        set.add("system_image_file_name");
        return this;
    }

    public BaiduImagesSelect excludeSystemImageFileName(){
        excludeSet.add("system_image_file_name");
        return this;
    }

    public BaiduImagesSelect avgSystemImageFileName(){
        set.add("avg(system_image_file_name) as system_image_file_name");
        return this;
    }

    public BaiduImagesSelect countSystemImageFileName(){
        set.add("count(system_image_file_name) as system_image_file_name");
        return this;
    }

    public BaiduImagesSelect minSystemImageFileName(){
        set.add("min(system_image_file_name) as system_image_file_name");
        return this;
    }

    public BaiduImagesSelect maxSystemImageFileName(){
        set.add("max(system_image_file_name) as system_image_file_name");
        return this;
    }

    public BaiduImagesSelect sumSystemImageFileName(){
        set.add("sum(system_image_file_name) as system_image_file_name");
        return this;
    }
    public BaiduImagesSelect systemImageFileType(){
        set.add("system_image_file_type");
        return this;
    }

    public BaiduImagesSelect excludeSystemImageFileType(){
        excludeSet.add("system_image_file_type");
        return this;
    }

    public BaiduImagesSelect avgSystemImageFileType(){
        set.add("avg(system_image_file_type) as system_image_file_type");
        return this;
    }

    public BaiduImagesSelect countSystemImageFileType(){
        set.add("count(system_image_file_type) as system_image_file_type");
        return this;
    }

    public BaiduImagesSelect minSystemImageFileType(){
        set.add("min(system_image_file_type) as system_image_file_type");
        return this;
    }

    public BaiduImagesSelect maxSystemImageFileType(){
        set.add("max(system_image_file_type) as system_image_file_type");
        return this;
    }

    public BaiduImagesSelect sumSystemImageFileType(){
        set.add("sum(system_image_file_type) as system_image_file_type");
        return this;
    }
    public BaiduImagesSelect systemImageFileMd5(){
        set.add("system_image_file_md5");
        return this;
    }

    public BaiduImagesSelect excludeSystemImageFileMd5(){
        excludeSet.add("system_image_file_md5");
        return this;
    }

    public BaiduImagesSelect avgSystemImageFileMd5(){
        set.add("avg(system_image_file_md5) as system_image_file_md5");
        return this;
    }

    public BaiduImagesSelect countSystemImageFileMd5(){
        set.add("count(system_image_file_md5) as system_image_file_md5");
        return this;
    }

    public BaiduImagesSelect minSystemImageFileMd5(){
        set.add("min(system_image_file_md5) as system_image_file_md5");
        return this;
    }

    public BaiduImagesSelect maxSystemImageFileMd5(){
        set.add("max(system_image_file_md5) as system_image_file_md5");
        return this;
    }

    public BaiduImagesSelect sumSystemImageFileMd5(){
        set.add("sum(system_image_file_md5) as system_image_file_md5");
        return this;
    }
    public BaiduImagesSelect odmImageFileUrl(){
        set.add("odm_image_file_url");
        return this;
    }

    public BaiduImagesSelect excludeOdmImageFileUrl(){
        excludeSet.add("odm_image_file_url");
        return this;
    }

    public BaiduImagesSelect avgOdmImageFileUrl(){
        set.add("avg(odm_image_file_url) as odm_image_file_url");
        return this;
    }

    public BaiduImagesSelect countOdmImageFileUrl(){
        set.add("count(odm_image_file_url) as odm_image_file_url");
        return this;
    }

    public BaiduImagesSelect minOdmImageFileUrl(){
        set.add("min(odm_image_file_url) as odm_image_file_url");
        return this;
    }

    public BaiduImagesSelect maxOdmImageFileUrl(){
        set.add("max(odm_image_file_url) as odm_image_file_url");
        return this;
    }

    public BaiduImagesSelect sumOdmImageFileUrl(){
        set.add("sum(odm_image_file_url) as odm_image_file_url");
        return this;
    }
    public BaiduImagesSelect odmImageFileName(){
        set.add("odm_image_file_name");
        return this;
    }

    public BaiduImagesSelect excludeOdmImageFileName(){
        excludeSet.add("odm_image_file_name");
        return this;
    }

    public BaiduImagesSelect avgOdmImageFileName(){
        set.add("avg(odm_image_file_name) as odm_image_file_name");
        return this;
    }

    public BaiduImagesSelect countOdmImageFileName(){
        set.add("count(odm_image_file_name) as odm_image_file_name");
        return this;
    }

    public BaiduImagesSelect minOdmImageFileName(){
        set.add("min(odm_image_file_name) as odm_image_file_name");
        return this;
    }

    public BaiduImagesSelect maxOdmImageFileName(){
        set.add("max(odm_image_file_name) as odm_image_file_name");
        return this;
    }

    public BaiduImagesSelect sumOdmImageFileName(){
        set.add("sum(odm_image_file_name) as odm_image_file_name");
        return this;
    }
    public BaiduImagesSelect odmImageFileType(){
        set.add("odm_image_file_type");
        return this;
    }

    public BaiduImagesSelect excludeOdmImageFileType(){
        excludeSet.add("odm_image_file_type");
        return this;
    }

    public BaiduImagesSelect avgOdmImageFileType(){
        set.add("avg(odm_image_file_type) as odm_image_file_type");
        return this;
    }

    public BaiduImagesSelect countOdmImageFileType(){
        set.add("count(odm_image_file_type) as odm_image_file_type");
        return this;
    }

    public BaiduImagesSelect minOdmImageFileType(){
        set.add("min(odm_image_file_type) as odm_image_file_type");
        return this;
    }

    public BaiduImagesSelect maxOdmImageFileType(){
        set.add("max(odm_image_file_type) as odm_image_file_type");
        return this;
    }

    public BaiduImagesSelect sumOdmImageFileType(){
        set.add("sum(odm_image_file_type) as odm_image_file_type");
        return this;
    }
    public BaiduImagesSelect odmImageFileMd5(){
        set.add("odm_image_file_md5");
        return this;
    }

    public BaiduImagesSelect excludeOdmImageFileMd5(){
        excludeSet.add("odm_image_file_md5");
        return this;
    }

    public BaiduImagesSelect avgOdmImageFileMd5(){
        set.add("avg(odm_image_file_md5) as odm_image_file_md5");
        return this;
    }

    public BaiduImagesSelect countOdmImageFileMd5(){
        set.add("count(odm_image_file_md5) as odm_image_file_md5");
        return this;
    }

    public BaiduImagesSelect minOdmImageFileMd5(){
        set.add("min(odm_image_file_md5) as odm_image_file_md5");
        return this;
    }

    public BaiduImagesSelect maxOdmImageFileMd5(){
        set.add("max(odm_image_file_md5) as odm_image_file_md5");
        return this;
    }

    public BaiduImagesSelect sumOdmImageFileMd5(){
        set.add("sum(odm_image_file_md5) as odm_image_file_md5");
        return this;
    }
    public BaiduImagesSelect vendorImageFileUrl(){
        set.add("vendor_image_file_url");
        return this;
    }

    public BaiduImagesSelect excludeVendorImageFileUrl(){
        excludeSet.add("vendor_image_file_url");
        return this;
    }

    public BaiduImagesSelect avgVendorImageFileUrl(){
        set.add("avg(vendor_image_file_url) as vendor_image_file_url");
        return this;
    }

    public BaiduImagesSelect countVendorImageFileUrl(){
        set.add("count(vendor_image_file_url) as vendor_image_file_url");
        return this;
    }

    public BaiduImagesSelect minVendorImageFileUrl(){
        set.add("min(vendor_image_file_url) as vendor_image_file_url");
        return this;
    }

    public BaiduImagesSelect maxVendorImageFileUrl(){
        set.add("max(vendor_image_file_url) as vendor_image_file_url");
        return this;
    }

    public BaiduImagesSelect sumVendorImageFileUrl(){
        set.add("sum(vendor_image_file_url) as vendor_image_file_url");
        return this;
    }
    public BaiduImagesSelect vendorImageFileName(){
        set.add("vendor_image_file_name");
        return this;
    }

    public BaiduImagesSelect excludeVendorImageFileName(){
        excludeSet.add("vendor_image_file_name");
        return this;
    }

    public BaiduImagesSelect avgVendorImageFileName(){
        set.add("avg(vendor_image_file_name) as vendor_image_file_name");
        return this;
    }

    public BaiduImagesSelect countVendorImageFileName(){
        set.add("count(vendor_image_file_name) as vendor_image_file_name");
        return this;
    }

    public BaiduImagesSelect minVendorImageFileName(){
        set.add("min(vendor_image_file_name) as vendor_image_file_name");
        return this;
    }

    public BaiduImagesSelect maxVendorImageFileName(){
        set.add("max(vendor_image_file_name) as vendor_image_file_name");
        return this;
    }

    public BaiduImagesSelect sumVendorImageFileName(){
        set.add("sum(vendor_image_file_name) as vendor_image_file_name");
        return this;
    }
    public BaiduImagesSelect vendorImageFileType(){
        set.add("vendor_image_file_type");
        return this;
    }

    public BaiduImagesSelect excludeVendorImageFileType(){
        excludeSet.add("vendor_image_file_type");
        return this;
    }

    public BaiduImagesSelect avgVendorImageFileType(){
        set.add("avg(vendor_image_file_type) as vendor_image_file_type");
        return this;
    }

    public BaiduImagesSelect countVendorImageFileType(){
        set.add("count(vendor_image_file_type) as vendor_image_file_type");
        return this;
    }

    public BaiduImagesSelect minVendorImageFileType(){
        set.add("min(vendor_image_file_type) as vendor_image_file_type");
        return this;
    }

    public BaiduImagesSelect maxVendorImageFileType(){
        set.add("max(vendor_image_file_type) as vendor_image_file_type");
        return this;
    }

    public BaiduImagesSelect sumVendorImageFileType(){
        set.add("sum(vendor_image_file_type) as vendor_image_file_type");
        return this;
    }
    public BaiduImagesSelect vendorImageFileMd5(){
        set.add("vendor_image_file_md5");
        return this;
    }

    public BaiduImagesSelect excludeVendorImageFileMd5(){
        excludeSet.add("vendor_image_file_md5");
        return this;
    }

    public BaiduImagesSelect avgVendorImageFileMd5(){
        set.add("avg(vendor_image_file_md5) as vendor_image_file_md5");
        return this;
    }

    public BaiduImagesSelect countVendorImageFileMd5(){
        set.add("count(vendor_image_file_md5) as vendor_image_file_md5");
        return this;
    }

    public BaiduImagesSelect minVendorImageFileMd5(){
        set.add("min(vendor_image_file_md5) as vendor_image_file_md5");
        return this;
    }

    public BaiduImagesSelect maxVendorImageFileMd5(){
        set.add("max(vendor_image_file_md5) as vendor_image_file_md5");
        return this;
    }

    public BaiduImagesSelect sumVendorImageFileMd5(){
        set.add("sum(vendor_image_file_md5) as vendor_image_file_md5");
        return this;
    }
    public BaiduImagesSelect serverType(){
        set.add("server_type");
        return this;
    }

    public BaiduImagesSelect excludeServerType(){
        excludeSet.add("server_type");
        return this;
    }

    public BaiduImagesSelect avgServerType(){
        set.add("avg(server_type) as server_type");
        return this;
    }

    public BaiduImagesSelect countServerType(){
        set.add("count(server_type) as server_type");
        return this;
    }

    public BaiduImagesSelect minServerType(){
        set.add("min(server_type) as server_type");
        return this;
    }

    public BaiduImagesSelect maxServerType(){
        set.add("max(server_type) as server_type");
        return this;
    }

    public BaiduImagesSelect sumServerType(){
        set.add("sum(server_type) as server_type");
        return this;
    }
    public BaiduImagesSelect romVersion(){
        set.add("rom_version");
        return this;
    }

    public BaiduImagesSelect excludeRomVersion(){
        excludeSet.add("rom_version");
        return this;
    }

    public BaiduImagesSelect avgRomVersion(){
        set.add("avg(rom_version) as rom_version");
        return this;
    }

    public BaiduImagesSelect countRomVersion(){
        set.add("count(rom_version) as rom_version");
        return this;
    }

    public BaiduImagesSelect minRomVersion(){
        set.add("min(rom_version) as rom_version");
        return this;
    }

    public BaiduImagesSelect maxRomVersion(){
        set.add("max(rom_version) as rom_version");
        return this;
    }

    public BaiduImagesSelect sumRomVersion(){
        set.add("sum(rom_version) as rom_version");
        return this;
    }
    public BaiduImagesSelect createTime(){
        set.add("create_time");
        return this;
    }

    public BaiduImagesSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public BaiduImagesSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public BaiduImagesSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public BaiduImagesSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public BaiduImagesSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public BaiduImagesSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public BaiduImagesSelect imageVersionId(){
        set.add("image_version_id");
        return this;
    }

    public BaiduImagesSelect excludeImageVersionId(){
        excludeSet.add("image_version_id");
        return this;
    }

    public BaiduImagesSelect avgImageVersionId(){
        set.add("avg(image_version_id) as image_version_id");
        return this;
    }

    public BaiduImagesSelect countImageVersionId(){
        set.add("count(image_version_id) as image_version_id");
        return this;
    }

    public BaiduImagesSelect minImageVersionId(){
        set.add("min(image_version_id) as image_version_id");
        return this;
    }

    public BaiduImagesSelect maxImageVersionId(){
        set.add("max(image_version_id) as image_version_id");
        return this;
    }

    public BaiduImagesSelect sumImageVersionId(){
        set.add("sum(image_version_id) as image_version_id");
        return this;
    }
    public BaiduImagesSelect status(){
        set.add("status");
        return this;
    }

    public BaiduImagesSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public BaiduImagesSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public BaiduImagesSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public BaiduImagesSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public BaiduImagesSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public BaiduImagesSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public BaiduImagesSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public BaiduImagesSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public BaiduImagesSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public BaiduImagesSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public BaiduImagesSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public BaiduImagesSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public BaiduImagesSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public BaiduImagesSelect distinct(){
        this.distinct=true;
        return this;
    }

    public BaiduImagesSelect includes(Consumer<Set<String>> other){
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
