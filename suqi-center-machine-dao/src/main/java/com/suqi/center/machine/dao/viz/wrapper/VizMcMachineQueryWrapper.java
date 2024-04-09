package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachine;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 机器基础信息表
 * </p>
 * "viz_mc_machine"
 * @author 18374
 */
public class VizMcMachineQueryWrapper extends QueryWrapper<VizMcMachine> {


    public static VizMcMachineQueryWrapper wrapper() {
        return new VizMcMachineQueryWrapper();
    }

    public VizMcMachineQueryWrapper() {
        super();
    }

    public VizMcMachineQueryWrapper(VizMcMachine entity) {
        super(entity);
    }

    public VizMcMachineQueryWrapper(VizMcMachine entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public VizMcMachineQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public VizMcMachineQueryWrapper selectColumns(Consumer<VizMcMachineSelect> consumer) {
        VizMcMachineSelect select = new VizMcMachineSelect();
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
    public VizMcMachineQueryWrapper idEq(Long id){
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
    public VizMcMachineQueryWrapper idNe(Long id){
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
    public VizMcMachineQueryWrapper idGt(Long id){
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
    public VizMcMachineQueryWrapper idGe(Long id){
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
    public VizMcMachineQueryWrapper idLt(Long id){
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
    public VizMcMachineQueryWrapper idLe(Long id){
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
    public VizMcMachineQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcMachineQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public VizMcMachineQueryWrapper idLike(Long id){
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
    public VizMcMachineQueryWrapper idNotLike(Long id){
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
    public VizMcMachineQueryWrapper idLikeLeft(Long id){
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
    public VizMcMachineQueryWrapper idLikeRight(Long id){
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
    public VizMcMachineQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper idIn(Collection<Long> value){
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
    public VizMcMachineQueryWrapper idIn(Long... values){
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
    public VizMcMachineQueryWrapper idNotIn(Collection<Long> value){
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
    public VizMcMachineQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 等于 =
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdEq(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            eq("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 不等于 &lt;&gt;
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdNe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            ne("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于 &gt;
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdGt(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            gt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于等于 &gt;=
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdGe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            ge("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于 &lt;
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdLt(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            lt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于等于 &lt;=
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdLe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            le("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * BETWEEN 值1 AND 值2
     * @param fkExtCloudRegionIdStart       值1
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdBetween(Long fkExtCloudRegionIdStart,Long fkExtCloudRegionIdEnd){
        if(fkExtCloudRegionIdStart!=null && fkExtCloudRegionIdEnd!=null){
            between("fk_ext_cloud_region_id",fkExtCloudRegionIdStart,fkExtCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkExtCloudRegionIdStart       值1
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdNotBetween(Long fkExtCloudRegionIdStart,Long fkExtCloudRegionIdEnd){
        if(fkExtCloudRegionIdStart!=null && fkExtCloudRegionIdEnd!=null){
            notBetween("fk_ext_cloud_region_id",fkExtCloudRegionIdStart,fkExtCloudRegionIdEnd);
        }
        return this;
     }


    /**
     * <p>机房记录id</p>
     * LIKE '%值%'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdLike(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            like("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT LIKE '%值%'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdNotLike(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            notLike("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }


    /**
     * <p>机房记录id</p>
     * LIKE '%值'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdLikeLeft(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            likeLeft("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * LIKE '值%'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdLikeRight(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            likeRight("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdIsNull(){
        isNull("fk_ext_cloud_region_id");
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdIsNotNull(){
        isNotNull("fk_ext_cloud_region_id");
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_ext_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_ext_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_ext_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper fkExtCloudRegionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_ext_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 等于 =
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameEq(String extCloudRegionName){
        if(extCloudRegionName!=null){
            eq("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 不等于 &lt;&gt;
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameNe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            ne("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于 &gt;
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameGt(String extCloudRegionName){
        if(extCloudRegionName!=null){
            gt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于等于 &gt;=
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameGe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            ge("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于 &lt;
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameLt(String extCloudRegionName){
        if(extCloudRegionName!=null){
            lt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于等于 &lt;=
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameLe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            le("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * BETWEEN 值1 AND 值2
     * @param extCloudRegionNameStart       值1
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameBetween(String extCloudRegionNameStart,String extCloudRegionNameEnd){
        if(extCloudRegionNameStart!=null && extCloudRegionNameEnd!=null){
            between("ext_cloud_region_name",extCloudRegionNameStart,extCloudRegionNameEnd);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT BETWEEN 值1 AND 值2
     * @param extCloudRegionNameStart       值1
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameNotBetween(String extCloudRegionNameStart,String extCloudRegionNameEnd){
        if(extCloudRegionNameStart!=null && extCloudRegionNameEnd!=null){
            notBetween("ext_cloud_region_name",extCloudRegionNameStart,extCloudRegionNameEnd);
        }
        return this;
     }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值%'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameLike(String extCloudRegionName){
        if(extCloudRegionName!=null){
            like("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT LIKE '%值%'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameNotLike(String extCloudRegionName){
        if(extCloudRegionName!=null){
            notLike("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameLikeLeft(String extCloudRegionName){
        if(extCloudRegionName!=null){
            likeLeft("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '值%'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameLikeRight(String extCloudRegionName){
        if(extCloudRegionName!=null){
            likeRight("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameIsNull(){
        isNull("ext_cloud_region_name");
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameIsNotNull(){
        isNotNull("ext_cloud_region_name");
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("ext_cloud_region_name",value);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameIn(String... values){
        if(values!=null && values.length>0){
            in("ext_cloud_region_name",values);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("ext_cloud_region_name",value);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper extCloudRegionNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ext_cloud_region_name",values);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 等于 =
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrEq(String externalAddr){
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 不等于 &lt;&gt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrNe(String externalAddr){
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于 &gt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrGt(String externalAddr){
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于等于 &gt;=
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrGe(String externalAddr){
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于 &lt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrLt(String externalAddr){
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于等于 &lt;=
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrLike(String externalAddr){
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrNotLike(String externalAddr){
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrLikeLeft(String externalAddr){
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * LIKE '值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrLikeRight(String externalAddr){
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("external_addr",value);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("external_addr",values);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_addr",value);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 等于 =
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrEq(String internalAddr){
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 不等于 &lt;&gt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrNe(String internalAddr){
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于 &gt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrGt(String internalAddr){
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于等于 &gt;=
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrGe(String internalAddr){
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于 &lt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrLt(String internalAddr){
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于等于 &lt;=
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrLike(String internalAddr){
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrNotLike(String internalAddr){
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrLikeLeft(String internalAddr){
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * LIKE '值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrLikeRight(String internalAddr){
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 等于 =
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrEq(String macAddr){
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 不等于 &lt;&gt;
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrNe(String macAddr){
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于 &gt;
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrGt(String macAddr){
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于等于 &gt;=
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrGe(String macAddr){
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于 &lt;
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrLt(String macAddr){
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于等于 &lt;=
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrLe(String macAddr){
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * BETWEEN 值1 AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrBetween(String macAddrStart,String macAddrEnd){
        if(macAddrStart!=null && macAddrEnd!=null){
            between("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT BETWEEN 值1 AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrNotBetween(String macAddrStart,String macAddrEnd){
        if(macAddrStart!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrLike(String macAddr){
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrNotLike(String macAddr){
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
     }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrLikeLeft(String macAddr){
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '值%'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrLikeRight(String macAddr){
        if(macAddr!=null){
            likeRight("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrIsNull(){
        isNull("mac_addr");
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrIsNotNull(){
        isNotNull("mac_addr");
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrIn(String... values){
        if(values!=null && values.length>0){
            in("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper macAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 等于 =
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionEq(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            eq("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 不等于 &lt;&gt;
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionNe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            ne("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于 &gt;
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionGt(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            gt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于等于 &gt;=
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionGe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            ge("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于 &lt;
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionLt(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            lt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于等于 &lt;=
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionLe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            le("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * BETWEEN 值1 AND 值2
     * @param serviceSoftwarePackageVersionStart       值1
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionBetween(String serviceSoftwarePackageVersionStart,String serviceSoftwarePackageVersionEnd){
        if(serviceSoftwarePackageVersionStart!=null && serviceSoftwarePackageVersionEnd!=null){
            between("service_software_package_version",serviceSoftwarePackageVersionStart,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serviceSoftwarePackageVersionStart       值1
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionNotBetween(String serviceSoftwarePackageVersionStart,String serviceSoftwarePackageVersionEnd){
        if(serviceSoftwarePackageVersionStart!=null && serviceSoftwarePackageVersionEnd!=null){
            notBetween("service_software_package_version",serviceSoftwarePackageVersionStart,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值%'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionLike(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            like("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT LIKE '%值%'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionNotLike(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            notLike("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionLikeLeft(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            likeLeft("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * LIKE '值%'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionLikeRight(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            likeRight("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionIsNull(){
        isNull("service_software_package_version");
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionIsNotNull(){
        isNotNull("service_software_package_version");
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("service_software_package_version",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionIn(String... values){
        if(values!=null && values.length>0){
            in("service_software_package_version",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("service_software_package_version",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper serviceSoftwarePackageVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("service_software_package_version",values);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 等于 =
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelEq(String chipModel){
        if(chipModel!=null){
            eq("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 不等于 &lt;&gt;
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelNe(String chipModel){
        if(chipModel!=null){
            ne("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于 &gt;
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelGt(String chipModel){
        if(chipModel!=null){
            gt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于等于 &gt;=
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelGe(String chipModel){
        if(chipModel!=null){
            ge("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于 &lt;
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelLt(String chipModel){
        if(chipModel!=null){
            lt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于等于 &lt;=
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelLe(String chipModel){
        if(chipModel!=null){
            le("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * BETWEEN 值1 AND 值2
     * @param chipModelStart       值1
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelBetween(String chipModelStart,String chipModelEnd){
        if(chipModelStart!=null && chipModelEnd!=null){
            between("chip_model",chipModelStart,chipModelEnd);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param chipModelStart       值1
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelNotBetween(String chipModelStart,String chipModelEnd){
        if(chipModelStart!=null && chipModelEnd!=null){
            notBetween("chip_model",chipModelStart,chipModelEnd);
        }
        return this;
     }


    /**
     * <p>设备型号</p>
     * LIKE '%值%'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelLike(String chipModel){
        if(chipModel!=null){
            like("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT LIKE '%值%'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelNotLike(String chipModel){
        if(chipModel!=null){
            notLike("chip_model",chipModel);
        }
        return this;
     }


    /**
     * <p>设备型号</p>
     * LIKE '%值'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelLikeLeft(String chipModel){
        if(chipModel!=null){
            likeLeft("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * LIKE '值%'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelLikeRight(String chipModel){
        if(chipModel!=null){
            likeRight("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelIsNull(){
        isNull("chip_model");
        return this;
    }

    /**
     * <p>设备型号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelIsNotNull(){
        isNotNull("chip_model");
        return this;
    }

    /**
     * <p>设备型号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("chip_model",value);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelIn(String... values){
        if(values!=null && values.length>0){
            in("chip_model",values);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("chip_model",value);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper chipModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("chip_model",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 等于 =
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionEq(String osVersion){
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt;
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionNe(String osVersion){
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于 &gt;
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionGt(String osVersion){
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;=
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionGe(String osVersion){
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于 &lt;
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionLt(String osVersion){
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;=
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionLe(String osVersion){
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN 值1 AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionBetween(String osVersionStart,String osVersionEnd){
        if(osVersionStart!=null && osVersionEnd!=null){
            between("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionNotBetween(String osVersionStart,String osVersionEnd){
        if(osVersionStart!=null && osVersionEnd!=null){
            notBetween("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionLike(String osVersion){
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionNotLike(String osVersion){
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionLikeLeft(String osVersion){
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '值%'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionLikeRight(String osVersion){
        if(osVersion!=null){
            likeRight("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionIsNull(){
        isNull("os_version");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionIsNotNull(){
        isNotNull("os_version");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("os_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionIn(String... values){
        if(values!=null && values.length>0){
            in("os_version",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("os_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper osVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_version",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 =
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusEq(Integer salesStatus){
        if(salesStatus!=null){
            eq("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 不等于 &lt;&gt;
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusNe(Integer salesStatus){
        if(salesStatus!=null){
            ne("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于 &gt;
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusGt(Integer salesStatus){
        if(salesStatus!=null){
            gt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于等于 &gt;=
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusGe(Integer salesStatus){
        if(salesStatus!=null){
            ge("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于 &lt;
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusLt(Integer salesStatus){
        if(salesStatus!=null){
            lt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于等于 &lt;=
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusLe(Integer salesStatus){
        if(salesStatus!=null){
            le("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * BETWEEN 值1 AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusBetween(Integer salesStatusStart,Integer salesStatusEnd){
        if(salesStatusStart!=null && salesStatusEnd!=null){
            between("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusNotBetween(Integer salesStatusStart,Integer salesStatusEnd){
        if(salesStatusStart!=null && salesStatusEnd!=null){
            notBetween("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值%'
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusLike(Integer salesStatus){
        if(salesStatus!=null){
            like("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT LIKE '%值%'
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusNotLike(Integer salesStatus){
        if(salesStatus!=null){
            notLike("sales_status",salesStatus);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值'
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusLikeLeft(Integer salesStatus){
        if(salesStatus!=null){
            likeLeft("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '值%'
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusLikeRight(Integer salesStatus){
        if(salesStatus!=null){
            likeRight("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusIsNull(){
        isNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusIsNotNull(){
        isNotNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("sales_status",value);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("sales_status",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("sales_status",value);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper salesStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sales_status",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 =
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelEq(Integer logLevel){
        if(logLevel!=null){
            eq("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt;
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelNe(Integer logLevel){
        if(logLevel!=null){
            ne("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt;
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelGt(Integer logLevel){
        if(logLevel!=null){
            gt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;=
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelGe(Integer logLevel){
        if(logLevel!=null){
            ge("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt;
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelLt(Integer logLevel){
        if(logLevel!=null){
            lt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;=
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelLe(Integer logLevel){
        if(logLevel!=null){
            le("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN 值1 AND 值2
     * @param logLevelStart       值1
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelBetween(Integer logLevelStart,Integer logLevelEnd){
        if(logLevelStart!=null && logLevelEnd!=null){
            between("log_level",logLevelStart,logLevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN 值1 AND 值2
     * @param logLevelStart       值1
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelNotBetween(Integer logLevelStart,Integer logLevelEnd){
        if(logLevelStart!=null && logLevelEnd!=null){
            notBetween("log_level",logLevelStart,logLevelEnd);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelLike(Integer logLevel){
        if(logLevel!=null){
            like("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelNotLike(Integer logLevel){
        if(logLevel!=null){
            notLike("log_level",logLevel);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelLikeLeft(Integer logLevel){
        if(logLevel!=null){
            likeLeft("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelLikeRight(Integer logLevel){
        if(logLevel!=null){
            likeRight("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelIsNull(){
        isNull("log_level");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelIsNotNull(){
        isNotNull("log_level");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("log_level",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelIn(Integer... values){
        if(values!=null && values.length>0){
            in("log_level",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("log_level",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper logLevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("log_level",values);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 等于 =
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgEq(String logPkg){
        if(logPkg!=null){
            eq("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 不等于 &lt;&gt;
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgNe(String logPkg){
        if(logPkg!=null){
            ne("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于 &gt;
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgGt(String logPkg){
        if(logPkg!=null){
            gt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于等于 &gt;=
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgGe(String logPkg){
        if(logPkg!=null){
            ge("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于 &lt;
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgLt(String logPkg){
        if(logPkg!=null){
            lt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于等于 &lt;=
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgLe(String logPkg){
        if(logPkg!=null){
            le("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * BETWEEN 值1 AND 值2
     * @param logPkgStart       值1
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgBetween(String logPkgStart,String logPkgEnd){
        if(logPkgStart!=null && logPkgEnd!=null){
            between("log_pkg",logPkgStart,logPkgEnd);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT BETWEEN 值1 AND 值2
     * @param logPkgStart       值1
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgNotBetween(String logPkgStart,String logPkgEnd){
        if(logPkgStart!=null && logPkgEnd!=null){
            notBetween("log_pkg",logPkgStart,logPkgEnd);
        }
        return this;
     }


    /**
     * <p>日志包名</p>
     * LIKE '%值%'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgLike(String logPkg){
        if(logPkg!=null){
            like("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT LIKE '%值%'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgNotLike(String logPkg){
        if(logPkg!=null){
            notLike("log_pkg",logPkg);
        }
        return this;
     }


    /**
     * <p>日志包名</p>
     * LIKE '%值'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgLikeLeft(String logPkg){
        if(logPkg!=null){
            likeLeft("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * LIKE '值%'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgLikeRight(String logPkg){
        if(logPkg!=null){
            likeRight("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgIsNull(){
        isNull("log_pkg");
        return this;
    }

    /**
     * <p>日志包名</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgIsNotNull(){
        isNotNull("log_pkg");
        return this;
    }

    /**
     * <p>日志包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("log_pkg",value);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgIn(String... values){
        if(values!=null && values.length>0){
            in("log_pkg",values);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("log_pkg",value);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper logPkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("log_pkg",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 等于 =
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 不等于 &lt;&gt;
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于 &gt;
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于等于 &gt;=
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于 &lt;
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于等于 &lt;=
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '值%'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeLikeRight(Integer supplierType){
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper versionIdNotIn(Long... values){
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
    public VizMcMachineQueryWrapper createTimeEq(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeNe(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeGt(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeGe(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeLt(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeLe(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineQueryWrapper createTimeLike(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineQueryWrapper createTimeIn(Date... values){
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
    public VizMcMachineQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 等于 =
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelEq(String specificationModel){
        if(specificationModel!=null){
            eq("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 不等于 &lt;&gt;
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelNe(String specificationModel){
        if(specificationModel!=null){
            ne("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于 &gt;
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelGt(String specificationModel){
        if(specificationModel!=null){
            gt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于等于 &gt;=
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelGe(String specificationModel){
        if(specificationModel!=null){
            ge("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于 &lt;
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelLt(String specificationModel){
        if(specificationModel!=null){
            lt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于等于 &lt;=
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelLe(String specificationModel){
        if(specificationModel!=null){
            le("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * BETWEEN 值1 AND 值2
     * @param specificationModelStart       值1
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelBetween(String specificationModelStart,String specificationModelEnd){
        if(specificationModelStart!=null && specificationModelEnd!=null){
            between("specification_model",specificationModelStart,specificationModelEnd);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param specificationModelStart       值1
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelNotBetween(String specificationModelStart,String specificationModelEnd){
        if(specificationModelStart!=null && specificationModelEnd!=null){
            notBetween("specification_model",specificationModelStart,specificationModelEnd);
        }
        return this;
     }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值%'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelLike(String specificationModel){
        if(specificationModel!=null){
            like("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT LIKE '%值%'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelNotLike(String specificationModel){
        if(specificationModel!=null){
            notLike("specification_model",specificationModel);
        }
        return this;
     }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelLikeLeft(String specificationModel){
        if(specificationModel!=null){
            likeLeft("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * LIKE '值%'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelLikeRight(String specificationModel){
        if(specificationModel!=null){
            likeRight("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelIsNull(){
        isNull("specification_model");
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelIsNotNull(){
        isNotNull("specification_model");
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("specification_model",value);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelIn(String... values){
        if(values!=null && values.length>0){
            in("specification_model",values);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("specification_model",value);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper specificationModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("specification_model",values);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 等于 =
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitEq(Long memoryLimit){
        if(memoryLimit!=null){
            eq("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 不等于 &lt;&gt;
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitNe(Long memoryLimit){
        if(memoryLimit!=null){
            ne("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于 &gt;
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitGt(Long memoryLimit){
        if(memoryLimit!=null){
            gt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于等于 &gt;=
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitGe(Long memoryLimit){
        if(memoryLimit!=null){
            ge("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于 &lt;
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitLt(Long memoryLimit){
        if(memoryLimit!=null){
            lt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于等于 &lt;=
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitLe(Long memoryLimit){
        if(memoryLimit!=null){
            le("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * BETWEEN 值1 AND 值2
     * @param memoryLimitStart       值1
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitBetween(Long memoryLimitStart,Long memoryLimitEnd){
        if(memoryLimitStart!=null && memoryLimitEnd!=null){
            between("memory_limit",memoryLimitStart,memoryLimitEnd);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT BETWEEN 值1 AND 值2
     * @param memoryLimitStart       值1
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitNotBetween(Long memoryLimitStart,Long memoryLimitEnd){
        if(memoryLimitStart!=null && memoryLimitEnd!=null){
            notBetween("memory_limit",memoryLimitStart,memoryLimitEnd);
        }
        return this;
     }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值%'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitLike(Long memoryLimit){
        if(memoryLimit!=null){
            like("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT LIKE '%值%'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitNotLike(Long memoryLimit){
        if(memoryLimit!=null){
            notLike("memory_limit",memoryLimit);
        }
        return this;
     }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitLikeLeft(Long memoryLimit){
        if(memoryLimit!=null){
            likeLeft("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '值%'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitLikeRight(Long memoryLimit){
        if(memoryLimit!=null){
            likeRight("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitIsNull(){
        isNull("memory_limit");
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitIsNotNull(){
        isNotNull("memory_limit");
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("memory_limit",value);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitIn(Long... values){
        if(values!=null && values.length>0){
            in("memory_limit",values);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("memory_limit",value);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryWrapper memoryLimitNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("memory_limit",values);
        }
        return this;
    }


}
