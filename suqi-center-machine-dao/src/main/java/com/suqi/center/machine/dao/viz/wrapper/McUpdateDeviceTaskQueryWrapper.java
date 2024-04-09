package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTask;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 更新机器任务表
 * </p>
 * "mc_update_device_task"
 * @author 18374
 */
public class McUpdateDeviceTaskQueryWrapper extends QueryWrapper<McUpdateDeviceTask> {


    public static McUpdateDeviceTaskQueryWrapper wrapper() {
        return new McUpdateDeviceTaskQueryWrapper();
    }

    public McUpdateDeviceTaskQueryWrapper() {
        super();
    }

    public McUpdateDeviceTaskQueryWrapper(McUpdateDeviceTask entity) {
        super(entity);
    }

    public McUpdateDeviceTaskQueryWrapper(McUpdateDeviceTask entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public McUpdateDeviceTaskQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public McUpdateDeviceTaskQueryWrapper selectColumns(Consumer<McUpdateDeviceTaskSelect> consumer) {
        McUpdateDeviceTaskSelect select = new McUpdateDeviceTaskSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idLe(Long id){
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
    public McUpdateDeviceTaskQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceTaskQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idLikeRight(Long id){
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
    public McUpdateDeviceTaskQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryWrapper idIn(Long... values){
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
    public McUpdateDeviceTaskQueryWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 等于 =
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdEq(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            eq("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdNe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ne("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于 &gt;
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdGt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            gt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于等于 &gt;=
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdGe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ge("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于 &lt;
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdLt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            lt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于等于 &lt;=
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdLe(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
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
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdNotBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        if(fkMcServerSoftwarePackageIdStart!=null && fkMcServerSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            like("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT LIKE '%值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdNotLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            notLike("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdLikeLeft(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            likeLeft("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdLikeRight(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdIsNull(){
        isNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdIn(Long... values){
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
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryWrapper fkMcServerSoftwarePackageIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_server_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 等于 =
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 不等于 &lt;&gt;
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于 &gt;
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于等于 &gt;=
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于 &lt;
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于等于 &lt;=
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameLe(String name){
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
    public McUpdateDeviceTaskQueryWrapper nameBetween(String nameStart,String nameEnd){
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
    public McUpdateDeviceTaskQueryWrapper nameNotBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值%'
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT LIKE '%值%'
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值'
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * LIKE '值%'
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameLikeRight(String name){
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
    public McUpdateDeviceTaskQueryWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper nameIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper nameIn(String... values){
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
    public McUpdateDeviceTaskQueryWrapper nameNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * 不等于 &lt;&gt;
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 大于 &gt;
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 大于等于 &gt;=
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 小于 &lt;
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 小于等于 &lt;=
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdLe(String imageId){
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
    public McUpdateDeviceTaskQueryWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
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
    public McUpdateDeviceTaskQueryWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>华为镜像Id</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * NOT LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>华为镜像Id</p>
     * LIKE '%值'
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * LIKE '值%'
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdLikeRight(String imageId){
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
    public McUpdateDeviceTaskQueryWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper imageIdIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper imageIdIn(String... values){
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
    public McUpdateDeviceTaskQueryWrapper imageIdNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }

    /**
     * <p>云机属性</p>
     * 等于 =
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyEq(String property){
        if(property!=null){
            eq("property",property);
        }
        return this;
    }

    /**
     * <p>云机属性</p>
     * 不等于 &lt;&gt;
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyNe(String property){
        if(property!=null){
            ne("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 大于 &gt;
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyGt(String property){
        if(property!=null){
            gt("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 大于等于 &gt;=
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyGe(String property){
        if(property!=null){
            ge("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 小于 &lt;
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyLt(String property){
        if(property!=null){
            lt("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 小于等于 &lt;=
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyLe(String property){
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
    public McUpdateDeviceTaskQueryWrapper propertyBetween(String propertyStart,String propertyEnd){
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
    public McUpdateDeviceTaskQueryWrapper propertyNotBetween(String propertyStart,String propertyEnd){
        if(propertyStart!=null && propertyEnd!=null){
            notBetween("property",propertyStart,propertyEnd);
        }
        return this;
     }


    /**
     * <p>云机属性</p>
     * LIKE '%值%'
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyLike(String property){
        if(property!=null){
            like("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * NOT LIKE '%值%'
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyNotLike(String property){
        if(property!=null){
            notLike("property",property);
        }
        return this;
     }


    /**
     * <p>云机属性</p>
     * LIKE '%值'
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyLikeLeft(String property){
        if(property!=null){
            likeLeft("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * LIKE '值%'
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyLikeRight(String property){
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
    public McUpdateDeviceTaskQueryWrapper propertyIsNull(){
        isNull("property");
        return this;
    }

    /**
     * <p>云机属性</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyIsNotNull(){
        isNotNull("property");
        return this;
    }

    /**
     * <p>云机属性</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper propertyIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper propertyIn(String... values){
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
    public McUpdateDeviceTaskQueryWrapper propertyNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper propertyNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("property",values);
        }
        return this;
    }

    /**
     * <p>chmod命令</p>
     * 等于 =
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodEq(String chmod){
        if(chmod!=null){
            eq("chmod",chmod);
        }
        return this;
    }

    /**
     * <p>chmod命令</p>
     * 不等于 &lt;&gt;
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodNe(String chmod){
        if(chmod!=null){
            ne("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 大于 &gt;
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodGt(String chmod){
        if(chmod!=null){
            gt("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 大于等于 &gt;=
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodGe(String chmod){
        if(chmod!=null){
            ge("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 小于 &lt;
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodLt(String chmod){
        if(chmod!=null){
            lt("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 小于等于 &lt;=
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodLe(String chmod){
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
    public McUpdateDeviceTaskQueryWrapper chmodBetween(String chmodStart,String chmodEnd){
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
    public McUpdateDeviceTaskQueryWrapper chmodNotBetween(String chmodStart,String chmodEnd){
        if(chmodStart!=null && chmodEnd!=null){
            notBetween("chmod",chmodStart,chmodEnd);
        }
        return this;
     }


    /**
     * <p>chmod命令</p>
     * LIKE '%值%'
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodLike(String chmod){
        if(chmod!=null){
            like("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * NOT LIKE '%值%'
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodNotLike(String chmod){
        if(chmod!=null){
            notLike("chmod",chmod);
        }
        return this;
     }


    /**
     * <p>chmod命令</p>
     * LIKE '%值'
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodLikeLeft(String chmod){
        if(chmod!=null){
            likeLeft("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * LIKE '值%'
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodLikeRight(String chmod){
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
    public McUpdateDeviceTaskQueryWrapper chmodIsNull(){
        isNull("chmod");
        return this;
    }

    /**
     * <p>chmod命令</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodIsNotNull(){
        isNotNull("chmod");
        return this;
    }

    /**
     * <p>chmod命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper chmodIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper chmodIn(String... values){
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
    public McUpdateDeviceTaskQueryWrapper chmodNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper chmodNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("chmod",values);
        }
        return this;
    }

    /**
     * <p>命令</p>
     * 等于 =
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandEq(String command){
        if(command!=null){
            eq("command",command);
        }
        return this;
    }

    /**
     * <p>命令</p>
     * 不等于 &lt;&gt;
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandNe(String command){
        if(command!=null){
            ne("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 大于 &gt;
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandGt(String command){
        if(command!=null){
            gt("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 大于等于 &gt;=
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandGe(String command){
        if(command!=null){
            ge("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 小于 &lt;
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandLt(String command){
        if(command!=null){
            lt("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 小于等于 &lt;=
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandLe(String command){
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
    public McUpdateDeviceTaskQueryWrapper commandBetween(String commandStart,String commandEnd){
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
    public McUpdateDeviceTaskQueryWrapper commandNotBetween(String commandStart,String commandEnd){
        if(commandStart!=null && commandEnd!=null){
            notBetween("command",commandStart,commandEnd);
        }
        return this;
     }


    /**
     * <p>命令</p>
     * LIKE '%值%'
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandLike(String command){
        if(command!=null){
            like("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * NOT LIKE '%值%'
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandNotLike(String command){
        if(command!=null){
            notLike("command",command);
        }
        return this;
     }


    /**
     * <p>命令</p>
     * LIKE '%值'
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandLikeLeft(String command){
        if(command!=null){
            likeLeft("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * LIKE '值%'
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandLikeRight(String command){
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
    public McUpdateDeviceTaskQueryWrapper commandIsNull(){
        isNull("command");
        return this;
    }

    /**
     * <p>命令</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandIsNotNull(){
        isNotNull("command");
        return this;
    }

    /**
     * <p>命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper commandIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper commandIn(String... values){
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
    public McUpdateDeviceTaskQueryWrapper commandNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryWrapper commandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("command",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 等于 =
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeEq(Date startTime){
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 不等于 &lt;&gt;
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeNe(Date startTime){
        if(startTime!=null){
            ne("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于 &gt;
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeGt(Date startTime){
        if(startTime!=null){
            gt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于等于 &gt;=
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeGe(Date startTime){
        if(startTime!=null){
            ge("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于 &lt;
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeLt(Date startTime){
        if(startTime!=null){
            lt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于等于 &lt;=
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeLe(Date startTime){
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
    public McUpdateDeviceTaskQueryWrapper startTimeBetween(Date startTimeStart,Date startTimeEnd){
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
    public McUpdateDeviceTaskQueryWrapper startTimeNotBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            notBetween("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeLike(Date startTime){
        if(startTime!=null){
            like("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeNotLike(Date startTime){
        if(startTime!=null){
            notLike("start_time",startTime);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeLikeLeft(Date startTime){
        if(startTime!=null){
            likeLeft("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * LIKE '值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeLikeRight(Date startTime){
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
    public McUpdateDeviceTaskQueryWrapper startTimeIsNull(){
        isNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeIsNotNull(){
        isNotNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper startTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryWrapper startTimeIn(Date... values){
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
    public McUpdateDeviceTaskQueryWrapper startTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryWrapper startTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 等于 =
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeEq(Integer overtimeTime){
        if(overtimeTime!=null){
            eq("overtime_time",overtimeTime);
        }
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 不等于 &lt;&gt;
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeNe(Integer overtimeTime){
        if(overtimeTime!=null){
            ne("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 大于 &gt;
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeGt(Integer overtimeTime){
        if(overtimeTime!=null){
            gt("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 大于等于 &gt;=
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeGe(Integer overtimeTime){
        if(overtimeTime!=null){
            ge("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 小于 &lt;
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeLt(Integer overtimeTime){
        if(overtimeTime!=null){
            lt("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 小于等于 &lt;=
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeLe(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryWrapper overtimeTimeBetween(Integer overtimeTimeStart,Integer overtimeTimeEnd){
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
    public McUpdateDeviceTaskQueryWrapper overtimeTimeNotBetween(Integer overtimeTimeStart,Integer overtimeTimeEnd){
        if(overtimeTimeStart!=null && overtimeTimeEnd!=null){
            notBetween("overtime_time",overtimeTimeStart,overtimeTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值%'
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeLike(Integer overtimeTime){
        if(overtimeTime!=null){
            like("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * NOT LIKE '%值%'
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeNotLike(Integer overtimeTime){
        if(overtimeTime!=null){
            notLike("overtime_time",overtimeTime);
        }
        return this;
     }


    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值'
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeLikeLeft(Integer overtimeTime){
        if(overtimeTime!=null){
            likeLeft("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '值%'
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeLikeRight(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryWrapper overtimeTimeIsNull(){
        isNull("overtime_time");
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeIsNotNull(){
        isNotNull("overtime_time");
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper overtimeTimeIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryWrapper overtimeTimeIn(Integer... values){
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
    public McUpdateDeviceTaskQueryWrapper overtimeTimeNotIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryWrapper overtimeTimeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("overtime_time",values);
        }
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 等于 =
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeEq(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            eq("wait_start_over_time",waitStartOverTime);
        }
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 不等于 &lt;&gt;
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeNe(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            ne("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 大于 &gt;
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeGt(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            gt("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 大于等于 &gt;=
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeGe(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            ge("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 小于 &lt;
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeLt(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            lt("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 小于等于 &lt;=
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeLe(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeBetween(Integer waitStartOverTimeStart,Integer waitStartOverTimeEnd){
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
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeNotBetween(Integer waitStartOverTimeStart,Integer waitStartOverTimeEnd){
        if(waitStartOverTimeStart!=null && waitStartOverTimeEnd!=null){
            notBetween("wait_start_over_time",waitStartOverTimeStart,waitStartOverTimeEnd);
        }
        return this;
     }


    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值%'
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeLike(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            like("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * NOT LIKE '%值%'
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeNotLike(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            notLike("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }


    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值'
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeLikeLeft(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            likeLeft("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '值%'
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeLikeRight(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeIsNull(){
        isNull("wait_start_over_time");
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeIsNotNull(){
        isNotNull("wait_start_over_time");
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeIn(Integer... values){
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
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeNotIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryWrapper waitStartOverTimeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("wait_start_over_time",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusLe(Integer status){
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
    public McUpdateDeviceTaskQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public McUpdateDeviceTaskQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusLikeRight(Integer status){
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
    public McUpdateDeviceTaskQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper statusIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryWrapper statusIn(Integer... values){
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
    public McUpdateDeviceTaskQueryWrapper statusNotIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdLe(Long versionId){
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
    public McUpdateDeviceTaskQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceTaskQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdLikeRight(Long versionId){
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
    public McUpdateDeviceTaskQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper versionIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryWrapper versionIdIn(Long... values){
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
    public McUpdateDeviceTaskQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceTaskQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceTaskQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceTaskQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceTaskQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
