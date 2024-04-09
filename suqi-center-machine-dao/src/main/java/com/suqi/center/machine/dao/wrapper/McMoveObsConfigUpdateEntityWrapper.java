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
public class McMoveObsConfigUpdateEntityWrapper extends UpdateWrapper<McMoveObsConfig> {

    public static McMoveObsConfigUpdateEntityWrapper wrapper(McMoveObsConfig entity) {
        return new McMoveObsConfigUpdateEntityWrapper(entity);
    }

    private McMoveObsConfig entity;

    public McMoveObsConfigUpdateEntityWrapper(McMoveObsConfig entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public McMoveObsConfigUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 商户id(0：系统，其它商户自定义）
     */
    public McMoveObsConfigUpdateEntityWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 区域id
     */
    public McMoveObsConfigUpdateEntityWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }
    /**
     * 区域名称
     */
    public McMoveObsConfigUpdateEntityWrapper setAreaName(String areaName) {
         set("area_name",areaName);
        return this;
    }
    /**
     * 桶名称
     */
    public McMoveObsConfigUpdateEntityWrapper setBucketName(String bucketName) {
         set("bucket_name",bucketName);
        return this;
    }
    /**
     * 包含路径
     */
    public McMoveObsConfigUpdateEntityWrapper setMoveIncludeFiles(String moveIncludeFiles) {
         set("move_include_files",moveIncludeFiles);
        return this;
    }
    /**
     * 排除路径
     */
    public McMoveObsConfigUpdateEntityWrapper setMoveExcludeFiles(String moveExcludeFiles) {
         set("move_exclude_files",moveExcludeFiles);
        return this;
    }
    /**
     * 状态(-50：删除，50：正常)
     */
    public McMoveObsConfigUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 创建时间
     */
    public McMoveObsConfigUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public McMoveObsConfigUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    protected McMoveObsConfig entity() {
        if(entity==null){
            throw new NullPointerException("McMoveObsConfig is null");
        }
        return entity;
    }

    /**
     * 
     */
    public McMoveObsConfigUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 商户id(0：系统，其它商户自定义）
     */
    public McMoveObsConfigUpdateEntityWrapper setFkMemberId() {
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            set("fk_member_id",fkMemberId);
        }
        return this;
    }
    /**
     * 区域id
     */
    public McMoveObsConfigUpdateEntityWrapper setFkPcpAreaId() {
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            set("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }
    /**
     * 区域名称
     */
    public McMoveObsConfigUpdateEntityWrapper setAreaName() {
        String areaName =entity().getAreaName();
        if(areaName!=null){
            set("area_name",areaName);
        }
        return this;
    }
    /**
     * 桶名称
     */
    public McMoveObsConfigUpdateEntityWrapper setBucketName() {
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            set("bucket_name",bucketName);
        }
        return this;
    }
    /**
     * 包含路径
     */
    public McMoveObsConfigUpdateEntityWrapper setMoveIncludeFiles() {
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            set("move_include_files",moveIncludeFiles);
        }
        return this;
    }
    /**
     * 排除路径
     */
    public McMoveObsConfigUpdateEntityWrapper setMoveExcludeFiles() {
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            set("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }
    /**
     * 状态(-50：删除，50：正常)
     */
    public McMoveObsConfigUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public McMoveObsConfigUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 修改时间
     */
    public McMoveObsConfigUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idLikeRight(Long id){
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
    public McMoveObsConfigUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper idIn(Collection<Long> value){
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
    public McMoveObsConfigUpdateEntityWrapper idIn(Long... values){
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
    public McMoveObsConfigUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public McMoveObsConfigUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 等于 = entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdEq(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 不等于 &lt;&gt; entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdNe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 大于 &gt; entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdGt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 大于等于 &gt;= entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdGe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 小于 &lt; entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 小于等于 &lt;= entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '%值%' entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * NOT LIKE '%值%' entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdNotLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '%值' entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLikeLeft(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '值%' entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLikeRight(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

/**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 不等于 &lt;&gt;
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 大于 &gt;
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 大于等于 &gt;=
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 小于 &lt;
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 小于等于 &lt;=
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * NOT LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
    }


    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '%值'
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '值%'
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdIn(Long... values){
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
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public McMoveObsConfigUpdateEntityWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 等于 = entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdEq(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 不等于 &lt;&gt; entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdNe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于 &gt; entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdGt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于等于 &gt;= entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdGe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于 &lt; entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于等于 &lt;= entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdNotLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值' entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLikeLeft(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * LIKE '值%' entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLikeRight(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

/**
     * <p>区域id</p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 不等于 &lt;&gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 大于 &gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 大于等于 &gt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 小于 &lt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 小于等于 &lt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * NOT LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }


    /**
     * <p>区域id</p>
     * LIKE '%值'
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * LIKE '值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdIn(Long... values){
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
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public McMoveObsConfigUpdateEntityWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 等于 = entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameEq(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            eq("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 不等于 &lt;&gt; entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameNe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            ne("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * 大于 &gt; entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameGt(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            gt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * 大于等于 &gt;= entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameGe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            ge("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * 小于 &lt; entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLt(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            lt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * 小于等于 &lt;= entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameBetween(String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            between("area_name",areaName,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * NOT BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameNotBetween(String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            notBetween("area_name",areaName,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameBetween(String areaNameStart,String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            between("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * NOT BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameNotBetween(String areaNameStart,String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            notBetween("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }


    /**
     * <p>区域名称</p>
     * LIKE '%值%' entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLike(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            like("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * NOT LIKE '%值%' entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameNotLike(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            notLike("area_name",areaName);
        }
        return this;
     }


    /**
     * <p>区域名称</p>
     * LIKE '%值' entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLikeLeft(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            likeLeft("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * LIKE '值%' entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLikeRight(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            likeRight("area_name",areaName);
        }
        return this;
     }

/**
     * <p>区域名称</p>
     * 等于 =
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameEq(String areaName){
        if(areaName!=null){
            eq("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 不等于 &lt;&gt;
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameNe(String areaName){
        if(areaName!=null){
            ne("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 大于 &gt;
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameGt(String areaName){
        if(areaName!=null){
            gt("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 大于等于 &gt;=
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameGe(String areaName){
        if(areaName!=null){
            ge("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 小于 &lt;
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLt(String areaName){
        if(areaName!=null){
            lt("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 小于等于 &lt;=
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLe(String areaName){
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * LIKE '%值%'
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLike(String areaName){
        if(areaName!=null){
            like("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * NOT LIKE '%值%'
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameNotLike(String areaName){
        if(areaName!=null){
            notLike("area_name",areaName);
        }
        return this;
    }


    /**
     * <p>区域名称</p>
     * LIKE '%值'
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLikeLeft(String areaName){
        if(areaName!=null){
            likeLeft("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * LIKE '值%'
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameLikeRight(String areaName){
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
    public McMoveObsConfigUpdateEntityWrapper areaNameIsNull(){
        isNull("area_name");
        return this;
    }

    /**
     * <p>区域名称</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameIsNotNull(){
        isNotNull("area_name");
        return this;
    }

    /**
     * <p>区域名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper areaNameIn(Collection<String> value){
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
    public McMoveObsConfigUpdateEntityWrapper areaNameIn(String... values){
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
    public McMoveObsConfigUpdateEntityWrapper areaNameNotIn(Collection<String> value){
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
    public McMoveObsConfigUpdateEntityWrapper areaNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("area_name",values);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 等于 = entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameEq(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 不等于 &lt;&gt; entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameNe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * 大于 &gt; entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameGt(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * 大于等于 &gt;= entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameGe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * 小于 &lt; entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLt(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * 小于等于 &lt;= entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameBetween(String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            between("bucket_name",bucketName,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * NOT BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameNotBetween(String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketName,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            between("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * NOT BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>桶名称</p>
     * LIKE '%值%' entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * NOT LIKE '%值%' entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameNotLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>桶名称</p>
     * LIKE '%值' entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLikeLeft(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * LIKE '值%' entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLikeRight(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeRight("bucket_name",bucketName);
        }
        return this;
     }

/**
     * <p>桶名称</p>
     * 等于 =
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameEq(String bucketName){
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 不等于 &lt;&gt;
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameNe(String bucketName){
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 大于 &gt;
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameGt(String bucketName){
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 大于等于 &gt;=
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameGe(String bucketName){
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 小于 &lt;
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLt(String bucketName){
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 小于等于 &lt;=
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLe(String bucketName){
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLike(String bucketName){
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * NOT LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameNotLike(String bucketName){
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
    }


    /**
     * <p>桶名称</p>
     * LIKE '%值'
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLikeLeft(String bucketName){
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * LIKE '值%'
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameLikeRight(String bucketName){
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
    public McMoveObsConfigUpdateEntityWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>桶名称</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>桶名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper bucketNameIn(Collection<String> value){
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
    public McMoveObsConfigUpdateEntityWrapper bucketNameIn(String... values){
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
    public McMoveObsConfigUpdateEntityWrapper bucketNameNotIn(Collection<String> value){
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
    public McMoveObsConfigUpdateEntityWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 等于 = entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesEq(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            eq("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 不等于 &lt;&gt; entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesNe(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            ne("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * 大于 &gt; entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesGt(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            gt("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * 大于等于 &gt;= entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesGe(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            ge("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * 小于 &lt; entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLt(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            lt("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * 小于等于 &lt;= entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLe(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            le("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * BETWEEN  entity().getMoveIncludeFiles() AND 值2
     * @param moveIncludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesBetween(String moveIncludeFilesEnd){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null && moveIncludeFilesEnd!=null){
            between("move_include_files",moveIncludeFiles,moveIncludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * NOT BETWEEN  entity().getMoveIncludeFiles() AND 值2
     * @param moveIncludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesNotBetween(String moveIncludeFilesEnd){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null && moveIncludeFilesEnd!=null){
            notBetween("move_include_files",moveIncludeFiles,moveIncludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * BETWEEN  entity().getMoveIncludeFiles() AND 值2
     * @param moveIncludeFilesStart       值1
     * @param moveIncludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesBetween(String moveIncludeFilesStart,String moveIncludeFilesEnd){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null && moveIncludeFilesEnd!=null){
            between("move_include_files",moveIncludeFilesStart,moveIncludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * NOT BETWEEN  entity().getMoveIncludeFiles() AND 值2
     * @param moveIncludeFilesStart       值1
     * @param moveIncludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesNotBetween(String moveIncludeFilesStart,String moveIncludeFilesEnd){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null && moveIncludeFilesEnd!=null){
            notBetween("move_include_files",moveIncludeFilesStart,moveIncludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>包含路径</p>
     * LIKE '%值%' entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLike(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            like("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * NOT LIKE '%值%' entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesNotLike(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            notLike("move_include_files",moveIncludeFiles);
        }
        return this;
     }


    /**
     * <p>包含路径</p>
     * LIKE '%值' entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLikeLeft(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            likeLeft("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * LIKE '值%' entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLikeRight(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            likeRight("move_include_files",moveIncludeFiles);
        }
        return this;
     }

/**
     * <p>包含路径</p>
     * 等于 =
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesEq(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            eq("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 不等于 &lt;&gt;
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesNe(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            ne("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 大于 &gt;
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesGt(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            gt("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 大于等于 &gt;=
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesGe(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            ge("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 小于 &lt;
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLt(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            lt("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 小于等于 &lt;=
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLe(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            le("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * LIKE '%值%'
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLike(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            like("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * NOT LIKE '%值%'
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesNotLike(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            notLike("move_include_files",moveIncludeFiles);
        }
        return this;
    }


    /**
     * <p>包含路径</p>
     * LIKE '%值'
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLikeLeft(String moveIncludeFiles){
        if(moveIncludeFiles!=null){
            likeLeft("move_include_files",moveIncludeFiles);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * LIKE '值%'
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesLikeRight(String moveIncludeFiles){
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
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesIsNull(){
        isNull("move_include_files");
        return this;
    }

    /**
     * <p>包含路径</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesIsNotNull(){
        isNotNull("move_include_files");
        return this;
    }

    /**
     * <p>包含路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesIn(Collection<String> value){
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
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesIn(String... values){
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
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesNotIn(Collection<String> value){
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
    public McMoveObsConfigUpdateEntityWrapper moveIncludeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("move_include_files",values);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 等于 = entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesEq(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            eq("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 不等于 &lt;&gt; entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesNe(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            ne("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * 大于 &gt; entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesGt(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            gt("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * 大于等于 &gt;= entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesGe(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            ge("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * 小于 &lt; entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLt(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            lt("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * 小于等于 &lt;= entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLe(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            le("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * BETWEEN  entity().getMoveExcludeFiles() AND 值2
     * @param moveExcludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesBetween(String moveExcludeFilesEnd){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null && moveExcludeFilesEnd!=null){
            between("move_exclude_files",moveExcludeFiles,moveExcludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * NOT BETWEEN  entity().getMoveExcludeFiles() AND 值2
     * @param moveExcludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesNotBetween(String moveExcludeFilesEnd){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null && moveExcludeFilesEnd!=null){
            notBetween("move_exclude_files",moveExcludeFiles,moveExcludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * BETWEEN  entity().getMoveExcludeFiles() AND 值2
     * @param moveExcludeFilesStart       值1
     * @param moveExcludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesBetween(String moveExcludeFilesStart,String moveExcludeFilesEnd){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null && moveExcludeFilesEnd!=null){
            between("move_exclude_files",moveExcludeFilesStart,moveExcludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * NOT BETWEEN  entity().getMoveExcludeFiles() AND 值2
     * @param moveExcludeFilesStart       值1
     * @param moveExcludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesNotBetween(String moveExcludeFilesStart,String moveExcludeFilesEnd){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null && moveExcludeFilesEnd!=null){
            notBetween("move_exclude_files",moveExcludeFilesStart,moveExcludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>排除路径</p>
     * LIKE '%值%' entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLike(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            like("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * NOT LIKE '%值%' entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesNotLike(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            notLike("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }


    /**
     * <p>排除路径</p>
     * LIKE '%值' entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLikeLeft(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            likeLeft("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * LIKE '值%' entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLikeRight(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            likeRight("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

/**
     * <p>排除路径</p>
     * 等于 =
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesEq(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            eq("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 不等于 &lt;&gt;
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesNe(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            ne("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 大于 &gt;
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesGt(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            gt("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 大于等于 &gt;=
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesGe(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            ge("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 小于 &lt;
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLt(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            lt("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 小于等于 &lt;=
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLe(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            le("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * LIKE '%值%'
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLike(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            like("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * NOT LIKE '%值%'
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesNotLike(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            notLike("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }


    /**
     * <p>排除路径</p>
     * LIKE '%值'
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLikeLeft(String moveExcludeFiles){
        if(moveExcludeFiles!=null){
            likeLeft("move_exclude_files",moveExcludeFiles);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * LIKE '值%'
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesLikeRight(String moveExcludeFiles){
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
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesIsNull(){
        isNull("move_exclude_files");
        return this;
    }

    /**
     * <p>排除路径</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesIsNotNull(){
        isNotNull("move_exclude_files");
        return this;
    }

    /**
     * <p>排除路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesIn(Collection<String> value){
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
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesIn(String... values){
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
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesNotIn(Collection<String> value){
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
    public McMoveObsConfigUpdateEntityWrapper moveExcludeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("move_exclude_files",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

/**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
    }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusLikeRight(Integer status){
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
    public McMoveObsConfigUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper statusIn(Collection<Integer> value){
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
    public McMoveObsConfigUpdateEntityWrapper statusIn(Integer... values){
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
    public McMoveObsConfigUpdateEntityWrapper statusNotIn(Collection<Integer> value){
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
    public McMoveObsConfigUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeEq(){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
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
    public McMoveObsConfigUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

/**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeEq(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeNe(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeGt(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeGe(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeLt(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeLe(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeLike(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeIn(Date... values){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McMoveObsConfigUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeEq(){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

/**
     * <p>修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McMoveObsConfigUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
