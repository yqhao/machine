package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTask;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 更新机器任务表
 * </p>
 * "mc_update_device_task"
 * @author 18374
 */
public class McUpdateDeviceTaskUpdateWrapper extends UpdateWrapper<McUpdateDeviceTask> {

    public static McUpdateDeviceTaskUpdateWrapper wrapper() {
        return new McUpdateDeviceTaskUpdateWrapper();
    }

    public McUpdateDeviceTaskUpdateWrapper() {
        super();
    }

    public McUpdateDeviceTaskUpdateWrapper(McUpdateDeviceTask entity) {
        super(entity);
    }

    /**
     * 记录id自动增长
     */
    public McUpdateDeviceTaskUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 云机端软件包记录Id
     */
    public McUpdateDeviceTaskUpdateWrapper setFkMcServerSoftwarePackageId(Long fkMcServerSoftwarePackageId) {
         set("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        return this;
    }
    /**
     * 任务名称
     */
    public McUpdateDeviceTaskUpdateWrapper setName(String name) {
         set("name",name);
        return this;
    }
    /**
     * 华为镜像Id
     */
    public McUpdateDeviceTaskUpdateWrapper setImageId(String imageId) {
         set("image_id",imageId);
        return this;
    }
    /**
     * 云机属性
     */
    public McUpdateDeviceTaskUpdateWrapper setProperty(String property) {
         set("property",property);
        return this;
    }
    /**
     * chmod命令
     */
    public McUpdateDeviceTaskUpdateWrapper setChmod(String chmod) {
         set("chmod",chmod);
        return this;
    }
    /**
     * 命令
     */
    public McUpdateDeviceTaskUpdateWrapper setCommand(String command) {
         set("command",command);
        return this;
    }
    /**
     * 任务开始时间
     */
    public McUpdateDeviceTaskUpdateWrapper setStartTime(Date startTime) {
         set("start_time",startTime);
        return this;
    }
    /**
     * 任务开始后超时时间单位（时）（设置为0则不超时）
     */
    public McUpdateDeviceTaskUpdateWrapper setOvertimeTime(Integer overtimeTime) {
         set("overtime_time",overtimeTime);
        return this;
    }
    /**
     * 等待开始执行超时时间单位（时）（设置为0则不超时）
     */
    public McUpdateDeviceTaskUpdateWrapper setWaitStartOverTime(Integer waitStartOverTime) {
         set("wait_start_over_time",waitStartOverTime);
        return this;
    }
    /**
     * 状态（-50：删除，50：正常）
     */
    public McUpdateDeviceTaskUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 版本Id
     */
    public McUpdateDeviceTaskUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public McUpdateDeviceTaskUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public McUpdateDeviceTaskUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 等于 = fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdEq(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            eq("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 不等于 &lt;&gt; fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdNe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ne("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于 &gt; fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdGt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            gt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于等于 &gt;= fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdGe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ge("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于 &lt; fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdLt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            lt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于等于 &lt;= fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdLe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            le("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        if(fkMcServerSoftwarePackageIdStart!=null && fkMcServerSoftwarePackageIdEnd!=null){
            between("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdNotBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        if(fkMcServerSoftwarePackageIdStart!=null && fkMcServerSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值%' fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            like("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT LIKE '%值%' fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdNotLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            notLike("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值' fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdLikeLeft(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            likeLeft("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '值%' fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdLikeRight(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            likeRight("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdIsNull(){
        isNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_server_software_package_id",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_server_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_server_software_package_id",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper fkMcServerSoftwarePackageIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_server_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 等于 = name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 不等于 &lt;&gt; name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于 &gt; name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于等于 &gt;= name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于 &lt; name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于等于 &lt;= name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameLe(String name){
        if(name!=null){
            le("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * BETWEEN 值1 AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            between("name",nameStart,nameEnd);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameNotBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值%' name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT LIKE '%值%' name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值' name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * LIKE '值%' name
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameLikeRight(String name){
        if(name!=null){
            likeRight("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("name",value);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameIn(String... values){
        if(values!=null && values.length>0){
            in("name",values);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("name",value);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * 等于 = imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * 不等于 &lt;&gt; imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 大于 &gt; imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 大于等于 &gt;= imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 小于 &lt; imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 小于等于 &lt;= imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>华为镜像Id</p>
     * LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * NOT LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>华为镜像Id</p>
     * LIKE '%值' imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * LIKE '值%' imageId
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdLikeRight(String imageId){
        if(imageId!=null){
            likeRight("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_id",value);
        }
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_id",values);
        }
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_id",value);
        }
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }

    /**
     * <p>云机属性</p>
     * 等于 = property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyEq(String property){
        if(property!=null){
            eq("property",property);
        }
        return this;
    }

    /**
     * <p>云机属性</p>
     * 不等于 &lt;&gt; property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyNe(String property){
        if(property!=null){
            ne("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 大于 &gt; property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyGt(String property){
        if(property!=null){
            gt("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 大于等于 &gt;= property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyGe(String property){
        if(property!=null){
            ge("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 小于 &lt; property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyLt(String property){
        if(property!=null){
            lt("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 小于等于 &lt;= property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyLe(String property){
        if(property!=null){
            le("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * BETWEEN 值1 AND 值2
     * @param propertyStart       值1
     * @param propertyEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyBetween(String propertyStart,String propertyEnd){
        if(propertyStart!=null && propertyEnd!=null){
            between("property",propertyStart,propertyEnd);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * NOT BETWEEN 值1 AND 值2
     * @param propertyStart       值1
     * @param propertyEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyNotBetween(String propertyStart,String propertyEnd){
        if(propertyStart!=null && propertyEnd!=null){
            notBetween("property",propertyStart,propertyEnd);
        }
        return this;
     }


    /**
     * <p>云机属性</p>
     * LIKE '%值%' property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyLike(String property){
        if(property!=null){
            like("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * NOT LIKE '%值%' property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyNotLike(String property){
        if(property!=null){
            notLike("property",property);
        }
        return this;
     }


    /**
     * <p>云机属性</p>
     * LIKE '%值' property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyLikeLeft(String property){
        if(property!=null){
            likeLeft("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * LIKE '值%' property
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyLikeRight(String property){
        if(property!=null){
            likeRight("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyIsNull(){
        isNull("property");
        return this;
    }

    /**
     * <p>云机属性</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyIsNotNull(){
        isNotNull("property");
        return this;
    }

    /**
     * <p>云机属性</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("property",value);
        }
        return this;
    }

    /**
     * <p>云机属性</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyIn(String... values){
        if(values!=null && values.length>0){
            in("property",values);
        }
        return this;
    }

    /**
     * <p>云机属性</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("property",value);
        }
        return this;
    }

    /**
     * <p>云机属性</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper propertyNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("property",values);
        }
        return this;
    }

    /**
     * <p>chmod命令</p>
     * 等于 = chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodEq(String chmod){
        if(chmod!=null){
            eq("chmod",chmod);
        }
        return this;
    }

    /**
     * <p>chmod命令</p>
     * 不等于 &lt;&gt; chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodNe(String chmod){
        if(chmod!=null){
            ne("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 大于 &gt; chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodGt(String chmod){
        if(chmod!=null){
            gt("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 大于等于 &gt;= chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodGe(String chmod){
        if(chmod!=null){
            ge("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 小于 &lt; chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodLt(String chmod){
        if(chmod!=null){
            lt("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 小于等于 &lt;= chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodLe(String chmod){
        if(chmod!=null){
            le("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * BETWEEN 值1 AND 值2
     * @param chmodStart       值1
     * @param chmodEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodBetween(String chmodStart,String chmodEnd){
        if(chmodStart!=null && chmodEnd!=null){
            between("chmod",chmodStart,chmodEnd);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * NOT BETWEEN 值1 AND 值2
     * @param chmodStart       值1
     * @param chmodEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodNotBetween(String chmodStart,String chmodEnd){
        if(chmodStart!=null && chmodEnd!=null){
            notBetween("chmod",chmodStart,chmodEnd);
        }
        return this;
     }


    /**
     * <p>chmod命令</p>
     * LIKE '%值%' chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodLike(String chmod){
        if(chmod!=null){
            like("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * NOT LIKE '%值%' chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodNotLike(String chmod){
        if(chmod!=null){
            notLike("chmod",chmod);
        }
        return this;
     }


    /**
     * <p>chmod命令</p>
     * LIKE '%值' chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodLikeLeft(String chmod){
        if(chmod!=null){
            likeLeft("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * LIKE '值%' chmod
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodLikeRight(String chmod){
        if(chmod!=null){
            likeRight("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodIsNull(){
        isNull("chmod");
        return this;
    }

    /**
     * <p>chmod命令</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodIsNotNull(){
        isNotNull("chmod");
        return this;
    }

    /**
     * <p>chmod命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("chmod",value);
        }
        return this;
    }

    /**
     * <p>chmod命令</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodIn(String... values){
        if(values!=null && values.length>0){
            in("chmod",values);
        }
        return this;
    }

    /**
     * <p>chmod命令</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("chmod",value);
        }
        return this;
    }

    /**
     * <p>chmod命令</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper chmodNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("chmod",values);
        }
        return this;
    }

    /**
     * <p>命令</p>
     * 等于 = command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandEq(String command){
        if(command!=null){
            eq("command",command);
        }
        return this;
    }

    /**
     * <p>命令</p>
     * 不等于 &lt;&gt; command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandNe(String command){
        if(command!=null){
            ne("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 大于 &gt; command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandGt(String command){
        if(command!=null){
            gt("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 大于等于 &gt;= command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandGe(String command){
        if(command!=null){
            ge("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 小于 &lt; command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandLt(String command){
        if(command!=null){
            lt("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 小于等于 &lt;= command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandLe(String command){
        if(command!=null){
            le("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * BETWEEN 值1 AND 值2
     * @param commandStart       值1
     * @param commandEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandBetween(String commandStart,String commandEnd){
        if(commandStart!=null && commandEnd!=null){
            between("command",commandStart,commandEnd);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * NOT BETWEEN 值1 AND 值2
     * @param commandStart       值1
     * @param commandEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandNotBetween(String commandStart,String commandEnd){
        if(commandStart!=null && commandEnd!=null){
            notBetween("command",commandStart,commandEnd);
        }
        return this;
     }


    /**
     * <p>命令</p>
     * LIKE '%值%' command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandLike(String command){
        if(command!=null){
            like("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * NOT LIKE '%值%' command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandNotLike(String command){
        if(command!=null){
            notLike("command",command);
        }
        return this;
     }


    /**
     * <p>命令</p>
     * LIKE '%值' command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandLikeLeft(String command){
        if(command!=null){
            likeLeft("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * LIKE '值%' command
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandLikeRight(String command){
        if(command!=null){
            likeRight("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandIsNull(){
        isNull("command");
        return this;
    }

    /**
     * <p>命令</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandIsNotNull(){
        isNotNull("command");
        return this;
    }

    /**
     * <p>命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("command",value);
        }
        return this;
    }

    /**
     * <p>命令</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandIn(String... values){
        if(values!=null && values.length>0){
            in("command",values);
        }
        return this;
    }

    /**
     * <p>命令</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("command",value);
        }
        return this;
    }

    /**
     * <p>命令</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper commandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("command",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 等于 = startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeEq(Date startTime){
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 不等于 &lt;&gt; startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeNe(Date startTime){
        if(startTime!=null){
            ne("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于 &gt; startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeGt(Date startTime){
        if(startTime!=null){
            gt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于等于 &gt;= startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeGe(Date startTime){
        if(startTime!=null){
            ge("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于 &lt; startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeLt(Date startTime){
        if(startTime!=null){
            lt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于等于 &lt;= startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeLe(Date startTime){
        if(startTime!=null){
            le("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            between("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeNotBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            notBetween("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值%' startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeLike(Date startTime){
        if(startTime!=null){
            like("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT LIKE '%值%' startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeNotLike(Date startTime){
        if(startTime!=null){
            notLike("start_time",startTime);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值' startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeLikeLeft(Date startTime){
        if(startTime!=null){
            likeLeft("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * LIKE '值%' startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeLikeRight(Date startTime){
        if(startTime!=null){
            likeRight("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeIsNull(){
        isNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeIsNotNull(){
        isNotNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper startTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 等于 = overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeEq(Integer overtimeTime){
        if(overtimeTime!=null){
            eq("overtime_time",overtimeTime);
        }
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 不等于 &lt;&gt; overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeNe(Integer overtimeTime){
        if(overtimeTime!=null){
            ne("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 大于 &gt; overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeGt(Integer overtimeTime){
        if(overtimeTime!=null){
            gt("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 大于等于 &gt;= overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeGe(Integer overtimeTime){
        if(overtimeTime!=null){
            ge("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 小于 &lt; overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeLt(Integer overtimeTime){
        if(overtimeTime!=null){
            lt("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 小于等于 &lt;= overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeLe(Integer overtimeTime){
        if(overtimeTime!=null){
            le("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * BETWEEN 值1 AND 值2
     * @param overtimeTimeStart       值1
     * @param overtimeTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeBetween(Integer overtimeTimeStart,Integer overtimeTimeEnd){
        if(overtimeTimeStart!=null && overtimeTimeEnd!=null){
            between("overtime_time",overtimeTimeStart,overtimeTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param overtimeTimeStart       值1
     * @param overtimeTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeNotBetween(Integer overtimeTimeStart,Integer overtimeTimeEnd){
        if(overtimeTimeStart!=null && overtimeTimeEnd!=null){
            notBetween("overtime_time",overtimeTimeStart,overtimeTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值%' overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeLike(Integer overtimeTime){
        if(overtimeTime!=null){
            like("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * NOT LIKE '%值%' overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeNotLike(Integer overtimeTime){
        if(overtimeTime!=null){
            notLike("overtime_time",overtimeTime);
        }
        return this;
     }


    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值' overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeLikeLeft(Integer overtimeTime){
        if(overtimeTime!=null){
            likeLeft("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '值%' overtimeTime
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeLikeRight(Integer overtimeTime){
        if(overtimeTime!=null){
            likeRight("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeIsNull(){
        isNull("overtime_time");
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeIsNotNull(){
        isNotNull("overtime_time");
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("overtime_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeIn(Integer... values){
        if(values!=null && values.length>0){
            in("overtime_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("overtime_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper overtimeTimeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("overtime_time",values);
        }
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 等于 = waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeEq(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            eq("wait_start_over_time",waitStartOverTime);
        }
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 不等于 &lt;&gt; waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeNe(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            ne("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 大于 &gt; waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeGt(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            gt("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 大于等于 &gt;= waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeGe(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            ge("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 小于 &lt; waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeLt(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            lt("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 小于等于 &lt;= waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeLe(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            le("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * BETWEEN 值1 AND 值2
     * @param waitStartOverTimeStart       值1
     * @param waitStartOverTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeBetween(Integer waitStartOverTimeStart,Integer waitStartOverTimeEnd){
        if(waitStartOverTimeStart!=null && waitStartOverTimeEnd!=null){
            between("wait_start_over_time",waitStartOverTimeStart,waitStartOverTimeEnd);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param waitStartOverTimeStart       值1
     * @param waitStartOverTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeNotBetween(Integer waitStartOverTimeStart,Integer waitStartOverTimeEnd){
        if(waitStartOverTimeStart!=null && waitStartOverTimeEnd!=null){
            notBetween("wait_start_over_time",waitStartOverTimeStart,waitStartOverTimeEnd);
        }
        return this;
     }


    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值%' waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeLike(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            like("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * NOT LIKE '%值%' waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeNotLike(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            notLike("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }


    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值' waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeLikeLeft(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            likeLeft("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '值%' waitStartOverTime
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeLikeRight(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            likeRight("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeIsNull(){
        isNull("wait_start_over_time");
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeIsNotNull(){
        isNotNull("wait_start_over_time");
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("wait_start_over_time",value);
        }
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeIn(Integer... values){
        if(values!=null && values.length>0){
            in("wait_start_over_time",values);
        }
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("wait_start_over_time",value);
        }
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper waitStartOverTimeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("wait_start_over_time",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 不等于 &lt;&gt; versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt; versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;= versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt; versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;= versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值' versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%' versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
