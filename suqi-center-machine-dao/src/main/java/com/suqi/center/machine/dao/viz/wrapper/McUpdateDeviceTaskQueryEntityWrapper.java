package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTask;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 更新机器任务表
 * </p>
 * "mc_update_device_task"
 * @author 18374
 */
public class McUpdateDeviceTaskQueryEntityWrapper extends QueryWrapper<McUpdateDeviceTask> {

    public static McUpdateDeviceTaskQueryEntityWrapper wrapper(McUpdateDeviceTask entity) {
        return new McUpdateDeviceTaskQueryEntityWrapper(entity);
    }

    private McUpdateDeviceTask entity;

    public McUpdateDeviceTaskQueryEntityWrapper(McUpdateDeviceTask entity) {
         this.entity=entity;
    }


    protected McUpdateDeviceTask entity() {
        if(entity==null){
            throw new NullPointerException("McUpdateDeviceTask is null");
        }
        return entity;
    }

    @Override
    public McUpdateDeviceTaskQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public McUpdateDeviceTaskQueryEntityWrapper selectColumns(Consumer<McUpdateDeviceTaskSelect> consumer) {
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
     * 等于 = entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idEq(Long id){
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
    public McUpdateDeviceTaskQueryEntityWrapper idNe(Long id){
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
    public McUpdateDeviceTaskQueryEntityWrapper idGt(Long id){
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
    public McUpdateDeviceTaskQueryEntityWrapper idGe(Long id){
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
    public McUpdateDeviceTaskQueryEntityWrapper idLt(Long id){
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
    public McUpdateDeviceTaskQueryEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idLike(Long id){
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
    public McUpdateDeviceTaskQueryEntityWrapper idNotLike(Long id){
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
    public McUpdateDeviceTaskQueryEntityWrapper idLikeLeft(Long id){
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
    public McUpdateDeviceTaskQueryEntityWrapper idLikeRight(Long id){
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
    public McUpdateDeviceTaskQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper idIn(Long... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>云机端软件包记录Id</p>
     * 等于 = entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdEq(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            eq("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 不等于 &lt;&gt; entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdNe(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            ne("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于 &gt; entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdGt(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            gt("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于等于 &gt;= entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdGe(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            ge("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于 &lt; entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLt(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            lt("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于等于 &lt;= entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLe(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            le("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * BETWEEN  entity().getFkMcServerSoftwarePackageId() AND fkMcServerSoftwarePackageIdEnd
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdBetween(Long fkMcServerSoftwarePackageIdEnd){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null && fkMcServerSoftwarePackageIdEnd!=null){
            between("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId(),fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT BETWEEN  entity().getFkMcServerSoftwarePackageId() AND 值2
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdNotBetween(Long fkMcServerSoftwarePackageIdEnd){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null && fkMcServerSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId(),fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * BETWEEN  entity().getFkMcServerSoftwarePackageId() AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null && fkMcServerSoftwarePackageIdEnd!=null){
            between("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT BETWEEN  entity().getFkMcServerSoftwarePackageId() AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdNotBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null && fkMcServerSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值%'  entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLike(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            like("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT LIKE '%值%'  entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdNotLike(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            notLike("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值'  entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLikeLeft(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            likeLeft("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '值%'  entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLikeRight(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            likeRight("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 等于 =
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdEq(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdNe(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdGt(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdGe(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLt(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            le("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLike(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdNotLike(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLikeLeft(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdLikeRight(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdIsNull(){
        isNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdIn(Long... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper fkMcServerSoftwarePackageIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_server_software_package_id",values);
        }
        return this;
    }


    /**
     * <p>任务名称</p>
     * 等于 = entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameEq(){
        String name =entity().getName();
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 不等于 &lt;&gt; entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameNe(){
        String name =entity().getName();
        if(name!=null){
            ne("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于 &gt; entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameGt(){
        String name =entity().getName();
        if(name!=null){
            gt("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于等于 &gt;= entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameGe(){
        String name =entity().getName();
        if(name!=null){
            ge("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于 &lt; entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameLt(){
        String name =entity().getName();
        if(name!=null){
            lt("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于等于 &lt;= entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameLe(){
        String name =entity().getName();
        if(name!=null){
            le("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * BETWEEN  entity().getName() AND nameEnd
     * @param nameEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",entity().getName(),nameEnd);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameNotBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",entity().getName(),nameEnd);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",nameStart,nameEnd);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameNotBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值%'  entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameLike(){
        String name =entity().getName();
        if(name!=null){
            like("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT LIKE '%值%'  entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameNotLike(){
        String name =entity().getName();
        if(name!=null){
            notLike("name",entity().getName());
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值'  entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameLikeLeft(){
        String name =entity().getName();
        if(name!=null){
            likeLeft("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * LIKE '值%'  entity().getName()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameLikeRight(){
        String name =entity().getName();
        if(name!=null){
            likeRight("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 等于 =
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameEq(String name){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameNe(String name){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameGt(String name){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameGe(String name){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameLt(String name){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameLe(String name){
        if(name!=null){
            le("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * LIKE '%值%'
     * @param name       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameLike(String name){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameNotLike(String name){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameLikeLeft(String name){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameLikeRight(String name){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper nameIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameIn(String... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }


    /**
     * <p>华为镜像Id</p>
     * 等于 = entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdEq(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * 不等于 &lt;&gt; entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdNe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ne("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 大于 &gt; entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdGt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            gt("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 大于等于 &gt;= entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdGe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ge("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 小于 &lt; entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            lt("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 小于等于 &lt;= entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            le("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * BETWEEN  entity().getImageId() AND imageIdEnd
     * @param imageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("image_id",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdNotBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("image_id",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>华为镜像Id</p>
     * LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            like("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * NOT LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdNotLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            notLike("image_id",entity().getImageId());
        }
        return this;
     }


    /**
     * <p>华为镜像Id</p>
     * LIKE '%值'  entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLikeLeft(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeLeft("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * LIKE '值%'  entity().getImageId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLikeRight(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeRight("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdEq(String imageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdNe(String imageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdGt(String imageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdGe(String imageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLt(String imageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>华为镜像Id</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLike(String imageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdNotLike(String imageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLikeLeft(String imageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdLikeRight(String imageId){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>华为镜像Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper imageIdIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdIn(String... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }


    /**
     * <p>云机属性</p>
     * 等于 = entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyEq(){
        String property =entity().getProperty();
        if(property!=null){
            eq("property",property);
        }
        return this;
    }

    /**
     * <p>云机属性</p>
     * 不等于 &lt;&gt; entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyNe(){
        String property =entity().getProperty();
        if(property!=null){
            ne("property",entity().getProperty());
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 大于 &gt; entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyGt(){
        String property =entity().getProperty();
        if(property!=null){
            gt("property",entity().getProperty());
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 大于等于 &gt;= entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyGe(){
        String property =entity().getProperty();
        if(property!=null){
            ge("property",entity().getProperty());
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 小于 &lt; entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyLt(){
        String property =entity().getProperty();
        if(property!=null){
            lt("property",entity().getProperty());
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 小于等于 &lt;= entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyLe(){
        String property =entity().getProperty();
        if(property!=null){
            le("property",entity().getProperty());
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * BETWEEN  entity().getProperty() AND propertyEnd
     * @param propertyEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyBetween(String propertyEnd){
        String property =entity().getProperty();
        if(property!=null && propertyEnd!=null){
            between("property",entity().getProperty(),propertyEnd);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * NOT BETWEEN  entity().getProperty() AND 值2
     * @param propertyEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyNotBetween(String propertyEnd){
        String property =entity().getProperty();
        if(property!=null && propertyEnd!=null){
            notBetween("property",entity().getProperty(),propertyEnd);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * BETWEEN  entity().getProperty() AND 值2
     * @param propertyStart       值1
     * @param propertyEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyBetween(String propertyStart,String propertyEnd){
        String property =entity().getProperty();
        if(property!=null && propertyEnd!=null){
            between("property",propertyStart,propertyEnd);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * NOT BETWEEN  entity().getProperty() AND 值2
     * @param propertyStart       值1
     * @param propertyEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyNotBetween(String propertyStart,String propertyEnd){
        String property =entity().getProperty();
        if(property!=null && propertyEnd!=null){
            notBetween("property",propertyStart,propertyEnd);
        }
        return this;
     }


    /**
     * <p>云机属性</p>
     * LIKE '%值%'  entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyLike(){
        String property =entity().getProperty();
        if(property!=null){
            like("property",entity().getProperty());
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * NOT LIKE '%值%'  entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyNotLike(){
        String property =entity().getProperty();
        if(property!=null){
            notLike("property",entity().getProperty());
        }
        return this;
     }


    /**
     * <p>云机属性</p>
     * LIKE '%值'  entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyLikeLeft(){
        String property =entity().getProperty();
        if(property!=null){
            likeLeft("property",entity().getProperty());
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * LIKE '值%'  entity().getProperty()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyLikeRight(){
        String property =entity().getProperty();
        if(property!=null){
            likeRight("property",entity().getProperty());
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * 等于 =
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyEq(String property){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyNe(String property){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyGt(String property){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyGe(String property){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyLt(String property){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyLe(String property){
        if(property!=null){
            le("property",property);
        }
        return this;
     }

    /**
     * <p>云机属性</p>
     * LIKE '%值%'
     * @param property       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyLike(String property){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyNotLike(String property){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyLikeLeft(String property){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyLikeRight(String property){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyIsNull(){
        isNull("property");
        return this;
    }

    /**
     * <p>云机属性</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyIsNotNull(){
        isNotNull("property");
        return this;
    }

    /**
     * <p>云机属性</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper propertyIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyIn(String... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper propertyNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("property",values);
        }
        return this;
    }


    /**
     * <p>chmod命令</p>
     * 等于 = entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodEq(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            eq("chmod",chmod);
        }
        return this;
    }

    /**
     * <p>chmod命令</p>
     * 不等于 &lt;&gt; entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodNe(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            ne("chmod",entity().getChmod());
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 大于 &gt; entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodGt(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            gt("chmod",entity().getChmod());
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 大于等于 &gt;= entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodGe(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            ge("chmod",entity().getChmod());
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 小于 &lt; entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodLt(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            lt("chmod",entity().getChmod());
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 小于等于 &lt;= entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodLe(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            le("chmod",entity().getChmod());
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * BETWEEN  entity().getChmod() AND chmodEnd
     * @param chmodEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodBetween(String chmodEnd){
        String chmod =entity().getChmod();
        if(chmod!=null && chmodEnd!=null){
            between("chmod",entity().getChmod(),chmodEnd);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * NOT BETWEEN  entity().getChmod() AND 值2
     * @param chmodEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodNotBetween(String chmodEnd){
        String chmod =entity().getChmod();
        if(chmod!=null && chmodEnd!=null){
            notBetween("chmod",entity().getChmod(),chmodEnd);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * BETWEEN  entity().getChmod() AND 值2
     * @param chmodStart       值1
     * @param chmodEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodBetween(String chmodStart,String chmodEnd){
        String chmod =entity().getChmod();
        if(chmod!=null && chmodEnd!=null){
            between("chmod",chmodStart,chmodEnd);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * NOT BETWEEN  entity().getChmod() AND 值2
     * @param chmodStart       值1
     * @param chmodEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodNotBetween(String chmodStart,String chmodEnd){
        String chmod =entity().getChmod();
        if(chmod!=null && chmodEnd!=null){
            notBetween("chmod",chmodStart,chmodEnd);
        }
        return this;
     }


    /**
     * <p>chmod命令</p>
     * LIKE '%值%'  entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodLike(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            like("chmod",entity().getChmod());
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * NOT LIKE '%值%'  entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodNotLike(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            notLike("chmod",entity().getChmod());
        }
        return this;
     }


    /**
     * <p>chmod命令</p>
     * LIKE '%值'  entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodLikeLeft(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            likeLeft("chmod",entity().getChmod());
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * LIKE '值%'  entity().getChmod()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodLikeRight(){
        String chmod =entity().getChmod();
        if(chmod!=null){
            likeRight("chmod",entity().getChmod());
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * 等于 =
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodEq(String chmod){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodNe(String chmod){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodGt(String chmod){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodGe(String chmod){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodLt(String chmod){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodLe(String chmod){
        if(chmod!=null){
            le("chmod",chmod);
        }
        return this;
     }

    /**
     * <p>chmod命令</p>
     * LIKE '%值%'
     * @param chmod       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodLike(String chmod){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodNotLike(String chmod){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodLikeLeft(String chmod){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodLikeRight(String chmod){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodIsNull(){
        isNull("chmod");
        return this;
    }

    /**
     * <p>chmod命令</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodIsNotNull(){
        isNotNull("chmod");
        return this;
    }

    /**
     * <p>chmod命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper chmodIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodIn(String... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper chmodNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("chmod",values);
        }
        return this;
    }


    /**
     * <p>命令</p>
     * 等于 = entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandEq(){
        String command =entity().getCommand();
        if(command!=null){
            eq("command",command);
        }
        return this;
    }

    /**
     * <p>命令</p>
     * 不等于 &lt;&gt; entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandNe(){
        String command =entity().getCommand();
        if(command!=null){
            ne("command",entity().getCommand());
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 大于 &gt; entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandGt(){
        String command =entity().getCommand();
        if(command!=null){
            gt("command",entity().getCommand());
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 大于等于 &gt;= entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandGe(){
        String command =entity().getCommand();
        if(command!=null){
            ge("command",entity().getCommand());
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 小于 &lt; entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandLt(){
        String command =entity().getCommand();
        if(command!=null){
            lt("command",entity().getCommand());
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 小于等于 &lt;= entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandLe(){
        String command =entity().getCommand();
        if(command!=null){
            le("command",entity().getCommand());
        }
        return this;
     }

    /**
     * <p>命令</p>
     * BETWEEN  entity().getCommand() AND commandEnd
     * @param commandEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandBetween(String commandEnd){
        String command =entity().getCommand();
        if(command!=null && commandEnd!=null){
            between("command",entity().getCommand(),commandEnd);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * NOT BETWEEN  entity().getCommand() AND 值2
     * @param commandEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandNotBetween(String commandEnd){
        String command =entity().getCommand();
        if(command!=null && commandEnd!=null){
            notBetween("command",entity().getCommand(),commandEnd);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * BETWEEN  entity().getCommand() AND 值2
     * @param commandStart       值1
     * @param commandEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandBetween(String commandStart,String commandEnd){
        String command =entity().getCommand();
        if(command!=null && commandEnd!=null){
            between("command",commandStart,commandEnd);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * NOT BETWEEN  entity().getCommand() AND 值2
     * @param commandStart       值1
     * @param commandEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandNotBetween(String commandStart,String commandEnd){
        String command =entity().getCommand();
        if(command!=null && commandEnd!=null){
            notBetween("command",commandStart,commandEnd);
        }
        return this;
     }


    /**
     * <p>命令</p>
     * LIKE '%值%'  entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandLike(){
        String command =entity().getCommand();
        if(command!=null){
            like("command",entity().getCommand());
        }
        return this;
     }

    /**
     * <p>命令</p>
     * NOT LIKE '%值%'  entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandNotLike(){
        String command =entity().getCommand();
        if(command!=null){
            notLike("command",entity().getCommand());
        }
        return this;
     }


    /**
     * <p>命令</p>
     * LIKE '%值'  entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandLikeLeft(){
        String command =entity().getCommand();
        if(command!=null){
            likeLeft("command",entity().getCommand());
        }
        return this;
     }

    /**
     * <p>命令</p>
     * LIKE '值%'  entity().getCommand()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandLikeRight(){
        String command =entity().getCommand();
        if(command!=null){
            likeRight("command",entity().getCommand());
        }
        return this;
     }

    /**
     * <p>命令</p>
     * 等于 =
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandEq(String command){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandNe(String command){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandGt(String command){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandGe(String command){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandLt(String command){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandLe(String command){
        if(command!=null){
            le("command",command);
        }
        return this;
     }

    /**
     * <p>命令</p>
     * LIKE '%值%'
     * @param command       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandLike(String command){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandNotLike(String command){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandLikeLeft(String command){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandLikeRight(String command){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandIsNull(){
        isNull("command");
        return this;
    }

    /**
     * <p>命令</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandIsNotNull(){
        isNotNull("command");
        return this;
    }

    /**
     * <p>命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper commandIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandIn(String... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper commandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("command",values);
        }
        return this;
    }


    /**
     * <p>任务开始时间</p>
     * 等于 = entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeEq(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 不等于 &lt;&gt; entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeNe(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            ne("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于 &gt; entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeGt(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            gt("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于等于 &gt;= entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeGe(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            ge("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于 &lt; entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLt(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            lt("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于等于 &lt;= entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLe(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            le("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * BETWEEN  entity().getStartTime() AND startTimeEnd
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeBetween(Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            between("start_time",entity().getStartTime(),startTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeNotBetween(Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            notBetween("start_time",entity().getStartTime(),startTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeBetween(Date startTimeStart,Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            between("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeNotBetween(Date startTimeStart,Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            notBetween("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值%'  entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLike(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            like("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT LIKE '%值%'  entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeNotLike(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            notLike("start_time",entity().getStartTime());
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值'  entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLikeLeft(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            likeLeft("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * LIKE '值%'  entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLikeRight(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            likeRight("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 等于 =
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeEq(Date startTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeNe(Date startTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeGt(Date startTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeGe(Date startTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLt(Date startTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLe(Date startTime){
        if(startTime!=null){
            le("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLike(Date startTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeNotLike(Date startTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLikeLeft(Date startTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeLikeRight(Date startTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeIsNull(){
        isNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeIsNotNull(){
        isNotNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper startTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeIn(Date... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper startTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("start_time",values);
        }
        return this;
    }


    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 等于 = entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeEq(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            eq("overtime_time",overtimeTime);
        }
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 不等于 &lt;&gt; entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeNe(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            ne("overtime_time",entity().getOvertimeTime());
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 大于 &gt; entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeGt(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            gt("overtime_time",entity().getOvertimeTime());
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 大于等于 &gt;= entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeGe(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            ge("overtime_time",entity().getOvertimeTime());
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 小于 &lt; entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLt(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            lt("overtime_time",entity().getOvertimeTime());
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 小于等于 &lt;= entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLe(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            le("overtime_time",entity().getOvertimeTime());
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * BETWEEN  entity().getOvertimeTime() AND overtimeTimeEnd
     * @param overtimeTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeBetween(Integer overtimeTimeEnd){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null && overtimeTimeEnd!=null){
            between("overtime_time",entity().getOvertimeTime(),overtimeTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * NOT BETWEEN  entity().getOvertimeTime() AND 值2
     * @param overtimeTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeNotBetween(Integer overtimeTimeEnd){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null && overtimeTimeEnd!=null){
            notBetween("overtime_time",entity().getOvertimeTime(),overtimeTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * BETWEEN  entity().getOvertimeTime() AND 值2
     * @param overtimeTimeStart       值1
     * @param overtimeTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeBetween(Integer overtimeTimeStart,Integer overtimeTimeEnd){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null && overtimeTimeEnd!=null){
            between("overtime_time",overtimeTimeStart,overtimeTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * NOT BETWEEN  entity().getOvertimeTime() AND 值2
     * @param overtimeTimeStart       值1
     * @param overtimeTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeNotBetween(Integer overtimeTimeStart,Integer overtimeTimeEnd){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null && overtimeTimeEnd!=null){
            notBetween("overtime_time",overtimeTimeStart,overtimeTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值%'  entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLike(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            like("overtime_time",entity().getOvertimeTime());
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * NOT LIKE '%值%'  entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeNotLike(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            notLike("overtime_time",entity().getOvertimeTime());
        }
        return this;
     }


    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值'  entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLikeLeft(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            likeLeft("overtime_time",entity().getOvertimeTime());
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '值%'  entity().getOvertimeTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLikeRight(){
        Integer overtimeTime =entity().getOvertimeTime();
        if(overtimeTime!=null){
            likeRight("overtime_time",entity().getOvertimeTime());
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * 等于 =
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeEq(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeNe(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeGt(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeGe(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLt(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLe(Integer overtimeTime){
        if(overtimeTime!=null){
            le("overtime_time",overtimeTime);
        }
        return this;
     }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值%'
     * @param overtimeTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLike(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeNotLike(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLikeLeft(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeLikeRight(Integer overtimeTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeIsNull(){
        isNull("overtime_time");
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeIsNotNull(){
        isNotNull("overtime_time");
        return this;
    }

    /**
     * <p>任务开始后超时时间单位（时）（设置为0则不超时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeIn(Integer... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeNotIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper overtimeTimeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("overtime_time",values);
        }
        return this;
    }


    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 等于 = entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeEq(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            eq("wait_start_over_time",waitStartOverTime);
        }
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 不等于 &lt;&gt; entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeNe(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            ne("wait_start_over_time",entity().getWaitStartOverTime());
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 大于 &gt; entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeGt(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            gt("wait_start_over_time",entity().getWaitStartOverTime());
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 大于等于 &gt;= entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeGe(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            ge("wait_start_over_time",entity().getWaitStartOverTime());
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 小于 &lt; entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLt(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            lt("wait_start_over_time",entity().getWaitStartOverTime());
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 小于等于 &lt;= entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLe(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            le("wait_start_over_time",entity().getWaitStartOverTime());
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * BETWEEN  entity().getWaitStartOverTime() AND waitStartOverTimeEnd
     * @param waitStartOverTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeBetween(Integer waitStartOverTimeEnd){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null && waitStartOverTimeEnd!=null){
            between("wait_start_over_time",entity().getWaitStartOverTime(),waitStartOverTimeEnd);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * NOT BETWEEN  entity().getWaitStartOverTime() AND 值2
     * @param waitStartOverTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeNotBetween(Integer waitStartOverTimeEnd){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null && waitStartOverTimeEnd!=null){
            notBetween("wait_start_over_time",entity().getWaitStartOverTime(),waitStartOverTimeEnd);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * BETWEEN  entity().getWaitStartOverTime() AND 值2
     * @param waitStartOverTimeStart       值1
     * @param waitStartOverTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeBetween(Integer waitStartOverTimeStart,Integer waitStartOverTimeEnd){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null && waitStartOverTimeEnd!=null){
            between("wait_start_over_time",waitStartOverTimeStart,waitStartOverTimeEnd);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * NOT BETWEEN  entity().getWaitStartOverTime() AND 值2
     * @param waitStartOverTimeStart       值1
     * @param waitStartOverTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeNotBetween(Integer waitStartOverTimeStart,Integer waitStartOverTimeEnd){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null && waitStartOverTimeEnd!=null){
            notBetween("wait_start_over_time",waitStartOverTimeStart,waitStartOverTimeEnd);
        }
        return this;
     }


    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值%'  entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLike(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            like("wait_start_over_time",entity().getWaitStartOverTime());
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * NOT LIKE '%值%'  entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeNotLike(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            notLike("wait_start_over_time",entity().getWaitStartOverTime());
        }
        return this;
     }


    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值'  entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLikeLeft(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            likeLeft("wait_start_over_time",entity().getWaitStartOverTime());
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '值%'  entity().getWaitStartOverTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLikeRight(){
        Integer waitStartOverTime =entity().getWaitStartOverTime();
        if(waitStartOverTime!=null){
            likeRight("wait_start_over_time",entity().getWaitStartOverTime());
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * 等于 =
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeEq(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeNe(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeGt(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeGe(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLt(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLe(Integer waitStartOverTime){
        if(waitStartOverTime!=null){
            le("wait_start_over_time",waitStartOverTime);
        }
        return this;
     }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * LIKE '%值%'
     * @param waitStartOverTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLike(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeNotLike(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLikeLeft(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeLikeRight(Integer waitStartOverTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeIsNull(){
        isNull("wait_start_over_time");
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeIsNotNull(){
        isNotNull("wait_start_over_time");
        return this;
    }

    /**
     * <p>等待开始执行超时时间单位（时）（设置为0则不超时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeIn(Integer... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeNotIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper waitStartOverTimeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("wait_start_over_time",values);
        }
        return this;
    }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",entity().getStatus());
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusEq(Integer status){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusNe(Integer status){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusGt(Integer status){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusGe(Integer status){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusLt(Integer status){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusLike(Integer status){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusNotLike(Integer status){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusLikeLeft(Integer status){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusLikeRight(Integer status){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper statusIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusIn(Integer... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusNotIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p>版本Id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN  entity().getVersionId() AND versionIdEnd
     * @param versionIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",entity().getVersionId(),versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",entity().getVersionId(),versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",entity().getVersionId());
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值'  entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%'  entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdEq(Long versionId){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdNe(Long versionId){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdGt(Long versionId){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdGe(Long versionId){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLt(Long versionId){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLike(Long versionId){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdIn(Long... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p>修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }



}
