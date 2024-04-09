package com.suqi.center.machine.dao.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.McMoveObsConfig;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 
 * </p>
 * "mc_move_obs_config"
 * @author PC001
 */
public class McMoveObsConfigUpdateWrapper extends UpdateWrapper<McMoveObsConfig> {

    public static McMoveObsConfigUpdateWrapper wrapper() {
        return new McMoveObsConfigUpdateWrapper();
    }

    public McMoveObsConfigUpdateWrapper() {
        super();
    }

    public McMoveObsConfigUpdateWrapper(McMoveObsConfig entity) {
        super(entity);
    }

    /**
     * 
     */
    public McMoveObsConfigUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 商户id(0：系统，其它商户自定义）
     */
    public McMoveObsConfigUpdateWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 区域id
     */
    public McMoveObsConfigUpdateWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }
    /**
     * 区域名称
     */
    public McMoveObsConfigUpdateWrapper setAreaName(String areaName) {
         set("area_name",areaName);
        return this;
    }
    /**
     * 桶名称
     */
    public McMoveObsConfigUpdateWrapper setBucketName(String bucketName) {
         set("bucket_name",bucketName);
        return this;
    }
    /**
     * 包含路径
     */
    public McMoveObsConfigUpdateWrapper setMoveIncludeFiles(String moveIncludeFiles) {
         set("move_include_files",moveIncludeFiles);
        return this;
    }
    /**
     * 排除路径
     */
    public McMoveObsConfigUpdateWrapper setMoveExcludeFiles(String moveExcludeFiles) {
         set("move_exclude_files",moveExcludeFiles);
        return this;
    }
    /**
     * 状态(-50：删除，50：正常)
     */
    public McMoveObsConfigUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 创建时间
     */
    public McMoveObsConfigUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public McMoveObsConfigUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 等于 = fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 不等于 &lt;&gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 大于 &gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 大于等于 &gt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 小于 &lt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 小于等于 &lt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * NOT LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '%值' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdLikeRight(Long fkMemberId){
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IS NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 等于 = fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 不等于 &lt;&gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于 &gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于等于 &gt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于 &lt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于等于 &lt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * LIKE '值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * IS NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 等于 = areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameEq(String areaName){
        if(areaName!=null){
            eq("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 不等于 &lt;&gt; areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameNe(String areaName){
        if(areaName!=null){
            ne("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * 大于 &gt; areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameGt(String areaName){
        if(areaName!=null){
            gt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * 大于等于 &gt;= areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameGe(String areaName){
        if(areaName!=null){
            ge("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * 小于 &lt; areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameLt(String areaName){
        if(areaName!=null){
            lt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * 小于等于 &lt;= areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameLe(String areaName){
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * BETWEEN 值1 AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameBetween(String areaNameStart,String areaNameEnd){
        if(areaNameStart!=null && areaNameEnd!=null){
            between("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameNotBetween(String areaNameStart,String areaNameEnd){
        if(areaNameStart!=null && areaNameEnd!=null){
            notBetween("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }


    /**
     * <p>区域名称</p>
     * LIKE '%值%' areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameLike(String areaName){
        if(areaName!=null){
            like("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * NOT LIKE '%值%' areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameNotLike(String areaName){
        if(areaName!=null){
            notLike("area_name",areaName);
        }
        return this;
     }


    /**
     * <p>区域名称</p>
     * LIKE '%值' areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameLikeLeft(String areaName){
        if(areaName!=null){
            likeLeft("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * LIKE '值%' areaName
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameLikeRight(String areaName){
        if(areaName!=null){
            likeRight("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * IS NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameIsNull(){
        isNull("area_name");
        return this;
    }

    /**
     * <p>区域名称</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameIsNotNull(){
        isNotNull("area_name");
        return this;
    }

    /**
     * <p>区域名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("area_name",value);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameIn(String... values){
        if(values!=null && values.length>0){
            in("area_name",values);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("area_name",value);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper areaNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("area_name",values);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 等于 = bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameEq(String bucketName){
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 不等于 &lt;&gt; bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameNe(String bucketName){
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * 大于 &gt; bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameGt(String bucketName){
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * 大于等于 &gt;= bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameGe(String bucketName){
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * 小于 &lt; bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameLt(String bucketName){
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * 小于等于 &lt;= bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameLe(String bucketName){
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            between("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>桶名称</p>
     * LIKE '%值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameLike(String bucketName){
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * NOT LIKE '%值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameNotLike(String bucketName){
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>桶名称</p>
     * LIKE '%值' bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameLikeLeft(String bucketName){
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * LIKE '值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameLikeRight(String bucketName){
        if(bucketName!=null){
            likeRight("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * IS NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>桶名称</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>桶名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameIn(String... values){
        if(values!=null && values.length>0){
            in("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 等于 = moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesEq(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            eq("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 不等于 &lt;&gt; moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesNe(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            ne("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * 大于 &gt; moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesGt(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            gt("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * 大于等于 &gt;= moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesGe(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            ge("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * 小于 &lt; moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesLt(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            lt("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * 小于等于 &lt;= moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesLe(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            le("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * BETWEEN 值1 AND 值2
     * @param moveIncludeFilesStart       值1
     * @param moveIncludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesBetween(String moveIncludeFilesStart,String moveIncludeFilesEnd){
        if(moveIncludeFilesStart!=null && moveIncludeFilesEnd!=null){
            between("move_include_files",moveIncludeFilesStart,moveIncludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * NOT BETWEEN 值1 AND 值2
     * @param moveIncludeFilesStart       值1
     * @param moveIncludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesNotBetween(String moveIncludeFilesStart,String moveIncludeFilesEnd){
        if(moveIncludeFilesStart!=null && moveIncludeFilesEnd!=null){
            notBetween("move_include_files",moveIncludeFilesStart,moveIncludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>包含路径</p>
     * LIKE '%值%' moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesLike(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            like("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * NOT LIKE '%值%' moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesNotLike(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            notLike("move_include_files",moveIncludeFiles);
        }
        return this;
     }


    /**
     * <p>包含路径</p>
     * LIKE '%值' moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesLikeLeft(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            likeLeft("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * LIKE '值%' moveIncludeFiles
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesLikeRight(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            likeRight("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * IS NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesIsNull(){
        isNull("move_include_files");
        return this;
    }

    /**
     * <p>包含路径</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesIsNotNull(){
        isNotNull("move_include_files");
        return this;
    }

    /**
     * <p>包含路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("move_include_files",value);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesIn(String... values){
        if(values!=null && values.length>0){
            in("move_include_files",values);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("move_include_files",value);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveIncludeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("move_include_files",values);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 等于 = moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesEq(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            eq("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 不等于 &lt;&gt; moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesNe(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            ne("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * 大于 &gt; moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesGt(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            gt("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * 大于等于 &gt;= moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesGe(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            ge("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * 小于 &lt; moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesLt(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            lt("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * 小于等于 &lt;= moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesLe(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            le("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * BETWEEN 值1 AND 值2
     * @param moveExcludeFilesStart       值1
     * @param moveExcludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesBetween(String moveExcludeFilesStart,String moveExcludeFilesEnd){
        if(moveExcludeFilesStart!=null && moveExcludeFilesEnd!=null){
            between("move_exclude_files",moveExcludeFilesStart,moveExcludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * NOT BETWEEN 值1 AND 值2
     * @param moveExcludeFilesStart       值1
     * @param moveExcludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesNotBetween(String moveExcludeFilesStart,String moveExcludeFilesEnd){
        if(moveExcludeFilesStart!=null && moveExcludeFilesEnd!=null){
            notBetween("move_exclude_files",moveExcludeFilesStart,moveExcludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>排除路径</p>
     * LIKE '%值%' moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesLike(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            like("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * NOT LIKE '%值%' moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesNotLike(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            notLike("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }


    /**
     * <p>排除路径</p>
     * LIKE '%值' moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesLikeLeft(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            likeLeft("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * LIKE '值%' moveExcludeFiles
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesLikeRight(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            likeRight("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * IS NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesIsNull(){
        isNull("move_exclude_files");
        return this;
    }

    /**
     * <p>排除路径</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesIsNotNull(){
        isNotNull("move_exclude_files");
        return this;
    }

    /**
     * <p>排除路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("move_exclude_files",value);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesIn(String... values){
        if(values!=null && values.length>0){
            in("move_exclude_files",values);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("move_exclude_files",value);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper moveExcludeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("move_exclude_files",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public McMoveObsConfigUpdateWrapper createTimeEq(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeNe(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeGt(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeGe(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeLt(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeLe(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McMoveObsConfigUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McMoveObsConfigUpdateWrapper createTimeLike(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeNotLike(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeLikeRight(Date createTime){
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
    public McMoveObsConfigUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper createTimeIn(Collection<Date> value){
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
    public McMoveObsConfigUpdateWrapper createTimeIn(Date... values){
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
    public McMoveObsConfigUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public McMoveObsConfigUpdateWrapper createTimeNotIn(Date... values){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McMoveObsConfigUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
