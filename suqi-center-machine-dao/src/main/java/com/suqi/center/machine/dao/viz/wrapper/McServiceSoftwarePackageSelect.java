package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 云机端软件包表
 * </p>
 * "mc_service_software_package"
 * @author 18374
 */
public class McServiceSoftwarePackageSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McServiceSoftwarePackageSelect columns(){
        set.add("id");
        set.add("fk_mc_service_software_package_type_id");
        set.add("supplier_type");
        set.add("name");
        set.add("image_id");
        set.add("version");
        set.add("status");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McServiceSoftwarePackageSelect id(){
        set.add("id");
        return this;
    }

    public McServiceSoftwarePackageSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McServiceSoftwarePackageSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McServiceSoftwarePackageSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McServiceSoftwarePackageSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McServiceSoftwarePackageSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McServiceSoftwarePackageSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McServiceSoftwarePackageSelect fkMcServiceSoftwarePackageTypeId(){
        set.add("fk_mc_service_software_package_type_id");
        return this;
    }

    public McServiceSoftwarePackageSelect excludeFkMcServiceSoftwarePackageTypeId(){
        excludeSet.add("fk_mc_service_software_package_type_id");
        return this;
    }

    public McServiceSoftwarePackageSelect avgFkMcServiceSoftwarePackageTypeId(){
        set.add("avg(fk_mc_service_software_package_type_id) as fk_mc_service_software_package_type_id");
        return this;
    }

    public McServiceSoftwarePackageSelect countFkMcServiceSoftwarePackageTypeId(){
        set.add("count(fk_mc_service_software_package_type_id) as fk_mc_service_software_package_type_id");
        return this;
    }

    public McServiceSoftwarePackageSelect minFkMcServiceSoftwarePackageTypeId(){
        set.add("min(fk_mc_service_software_package_type_id) as fk_mc_service_software_package_type_id");
        return this;
    }

    public McServiceSoftwarePackageSelect maxFkMcServiceSoftwarePackageTypeId(){
        set.add("max(fk_mc_service_software_package_type_id) as fk_mc_service_software_package_type_id");
        return this;
    }

    public McServiceSoftwarePackageSelect sumFkMcServiceSoftwarePackageTypeId(){
        set.add("sum(fk_mc_service_software_package_type_id) as fk_mc_service_software_package_type_id");
        return this;
    }
    public McServiceSoftwarePackageSelect supplierType(){
        set.add("supplier_type");
        return this;
    }

    public McServiceSoftwarePackageSelect excludeSupplierType(){
        excludeSet.add("supplier_type");
        return this;
    }

    public McServiceSoftwarePackageSelect avgSupplierType(){
        set.add("avg(supplier_type) as supplier_type");
        return this;
    }

    public McServiceSoftwarePackageSelect countSupplierType(){
        set.add("count(supplier_type) as supplier_type");
        return this;
    }

    public McServiceSoftwarePackageSelect minSupplierType(){
        set.add("min(supplier_type) as supplier_type");
        return this;
    }

    public McServiceSoftwarePackageSelect maxSupplierType(){
        set.add("max(supplier_type) as supplier_type");
        return this;
    }

    public McServiceSoftwarePackageSelect sumSupplierType(){
        set.add("sum(supplier_type) as supplier_type");
        return this;
    }
    public McServiceSoftwarePackageSelect name(){
        set.add("name");
        return this;
    }

    public McServiceSoftwarePackageSelect excludeName(){
        excludeSet.add("name");
        return this;
    }

    public McServiceSoftwarePackageSelect avgName(){
        set.add("avg(name) as name");
        return this;
    }

    public McServiceSoftwarePackageSelect countName(){
        set.add("count(name) as name");
        return this;
    }

    public McServiceSoftwarePackageSelect minName(){
        set.add("min(name) as name");
        return this;
    }

    public McServiceSoftwarePackageSelect maxName(){
        set.add("max(name) as name");
        return this;
    }

    public McServiceSoftwarePackageSelect sumName(){
        set.add("sum(name) as name");
        return this;
    }
    public McServiceSoftwarePackageSelect imageId(){
        set.add("image_id");
        return this;
    }

    public McServiceSoftwarePackageSelect excludeImageId(){
        excludeSet.add("image_id");
        return this;
    }

    public McServiceSoftwarePackageSelect avgImageId(){
        set.add("avg(image_id) as image_id");
        return this;
    }

    public McServiceSoftwarePackageSelect countImageId(){
        set.add("count(image_id) as image_id");
        return this;
    }

    public McServiceSoftwarePackageSelect minImageId(){
        set.add("min(image_id) as image_id");
        return this;
    }

    public McServiceSoftwarePackageSelect maxImageId(){
        set.add("max(image_id) as image_id");
        return this;
    }

    public McServiceSoftwarePackageSelect sumImageId(){
        set.add("sum(image_id) as image_id");
        return this;
    }
    public McServiceSoftwarePackageSelect version(){
        set.add("version");
        return this;
    }

    public McServiceSoftwarePackageSelect excludeVersion(){
        excludeSet.add("version");
        return this;
    }

    public McServiceSoftwarePackageSelect avgVersion(){
        set.add("avg(version) as version");
        return this;
    }

    public McServiceSoftwarePackageSelect countVersion(){
        set.add("count(version) as version");
        return this;
    }

    public McServiceSoftwarePackageSelect minVersion(){
        set.add("min(version) as version");
        return this;
    }

    public McServiceSoftwarePackageSelect maxVersion(){
        set.add("max(version) as version");
        return this;
    }

    public McServiceSoftwarePackageSelect sumVersion(){
        set.add("sum(version) as version");
        return this;
    }
    public McServiceSoftwarePackageSelect status(){
        set.add("status");
        return this;
    }

    public McServiceSoftwarePackageSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McServiceSoftwarePackageSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McServiceSoftwarePackageSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McServiceSoftwarePackageSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McServiceSoftwarePackageSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McServiceSoftwarePackageSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McServiceSoftwarePackageSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McServiceSoftwarePackageSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McServiceSoftwarePackageSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McServiceSoftwarePackageSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McServiceSoftwarePackageSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McServiceSoftwarePackageSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McServiceSoftwarePackageSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McServiceSoftwarePackageSelect includes(Consumer<Set<String>> other){
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
