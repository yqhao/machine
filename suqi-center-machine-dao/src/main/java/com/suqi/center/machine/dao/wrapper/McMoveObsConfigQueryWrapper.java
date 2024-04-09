package com.suqi.center.machine.dao.wrapper;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.McMoveObsConfig;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 
 * </p>
 * "mc_move_obs_config"
 * @author PC001
 */
public class McMoveObsConfigQueryWrapper extends QueryWrapper<McMoveObsConfig> {


    public static McMoveObsConfigQueryWrapper wrapper() {
        return new McMoveObsConfigQueryWrapper();
    }

    public McMoveObsConfigQueryWrapper() {
        super();
    }

    public McMoveObsConfigQueryWrapper(McMoveObsConfig entity) {
        super(entity);
    }

    public McMoveObsConfigQueryWrapper(McMoveObsConfig entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public McMoveObsConfigQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public McMoveObsConfigQueryWrapper selectColumns(Consumer<McMoveObsConfigSelect> consumer) {
        McMoveObsConfigSelect select = new McMoveObsConfigSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper idEq(Long id){
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
    public McMoveObsConfigQueryWrapper idNe(Long id){
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
    public McMoveObsConfigQueryWrapper idGt(Long id){
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
    public McMoveObsConfigQueryWrapper idGe(Long id){
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
    public McMoveObsConfigQueryWrapper idLt(Long id){
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
    public McMoveObsConfigQueryWrapper idLe(Long id){
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
    public McMoveObsConfigQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public McMoveObsConfigQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper idLike(Long id){
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
    public McMoveObsConfigQueryWrapper idNotLike(Long id){
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
    public McMoveObsConfigQueryWrapper idLikeLeft(Long id){
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
    public McMoveObsConfigQueryWrapper idLikeRight(Long id){
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
    public McMoveObsConfigQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper idIn(Collection<Long> value){
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
    public McMoveObsConfigQueryWrapper idIn(Long... values){
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
    public McMoveObsConfigQueryWrapper idNotIn(Collection<Long> value){
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
    public McMoveObsConfigQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper fkMemberIdEq(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdNe(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdGt(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdGe(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdLt(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdLe(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public McMoveObsConfigQueryWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper fkMemberIdLike(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public McMoveObsConfigQueryWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper fkMemberIdIn(Collection<Long> value){
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
    public McMoveObsConfigQueryWrapper fkMemberIdIn(Long... values){
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
    public McMoveObsConfigQueryWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public McMoveObsConfigQueryWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdIn(Long... values){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public McMoveObsConfigQueryWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>区域名称</p>
     * 等于 =
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper areaNameEq(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameNe(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameGt(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameGe(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameLt(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameLe(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameBetween(String areaNameStart,String areaNameEnd){
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
    public McMoveObsConfigQueryWrapper areaNameNotBetween(String areaNameStart,String areaNameEnd){
        if(areaNameStart!=null && areaNameEnd!=null){
            notBetween("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }


    /**
     * <p>区域名称</p>
     * LIKE '%值%'
     * @param areaName       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper areaNameLike(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameNotLike(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameLikeLeft(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameLikeRight(String areaName){
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
    public McMoveObsConfigQueryWrapper areaNameIsNull(){
        isNull("area_name");
        return this;
    }

    /**
     * <p>区域名称</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper areaNameIsNotNull(){
        isNotNull("area_name");
        return this;
    }

    /**
     * <p>区域名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper areaNameIn(Collection<String> value){
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
    public McMoveObsConfigQueryWrapper areaNameIn(String... values){
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
    public McMoveObsConfigQueryWrapper areaNameNotIn(Collection<String> value){
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
    public McMoveObsConfigQueryWrapper areaNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("area_name",values);
        }
        return this;
    }

    /**
     * <p>桶名称</p>
     * 等于 =
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper bucketNameEq(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameNe(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameGt(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameGe(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameLt(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameLe(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
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
    public McMoveObsConfigQueryWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>桶名称</p>
     * LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper bucketNameLike(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameNotLike(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameLikeLeft(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameLikeRight(String bucketName){
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
    public McMoveObsConfigQueryWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>桶名称</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>桶名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper bucketNameIn(Collection<String> value){
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
    public McMoveObsConfigQueryWrapper bucketNameIn(String... values){
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
    public McMoveObsConfigQueryWrapper bucketNameNotIn(Collection<String> value){
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
    public McMoveObsConfigQueryWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>包含路径</p>
     * 等于 =
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper moveIncludeFilesEq(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesNe(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesGt(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesGe(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesLt(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesLe(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesBetween(String moveIncludeFilesStart,String moveIncludeFilesEnd){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesNotBetween(String moveIncludeFilesStart,String moveIncludeFilesEnd){
        if(moveIncludeFilesStart!=null && moveIncludeFilesEnd!=null){
            notBetween("move_include_files",moveIncludeFilesStart,moveIncludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>包含路径</p>
     * LIKE '%值%'
     * @param moveIncludeFiles       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper moveIncludeFilesLike(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesNotLike(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesLikeLeft(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesLikeRight(String moveIncludeFiles){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesIsNull(){
        isNull("move_include_files");
        return this;
    }

    /**
     * <p>包含路径</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper moveIncludeFilesIsNotNull(){
        isNotNull("move_include_files");
        return this;
    }

    /**
     * <p>包含路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper moveIncludeFilesIn(Collection<String> value){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesIn(String... values){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesNotIn(Collection<String> value){
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
    public McMoveObsConfigQueryWrapper moveIncludeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("move_include_files",values);
        }
        return this;
    }

    /**
     * <p>排除路径</p>
     * 等于 =
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper moveExcludeFilesEq(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesNe(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesGt(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesGe(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesLt(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesLe(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesBetween(String moveExcludeFilesStart,String moveExcludeFilesEnd){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesNotBetween(String moveExcludeFilesStart,String moveExcludeFilesEnd){
        if(moveExcludeFilesStart!=null && moveExcludeFilesEnd!=null){
            notBetween("move_exclude_files",moveExcludeFilesStart,moveExcludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>排除路径</p>
     * LIKE '%值%'
     * @param moveExcludeFiles       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper moveExcludeFilesLike(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesNotLike(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesLikeLeft(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesLikeRight(String moveExcludeFiles){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesIsNull(){
        isNull("move_exclude_files");
        return this;
    }

    /**
     * <p>排除路径</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper moveExcludeFilesIsNotNull(){
        isNotNull("move_exclude_files");
        return this;
    }

    /**
     * <p>排除路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper moveExcludeFilesIn(Collection<String> value){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesIn(String... values){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesNotIn(Collection<String> value){
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
    public McMoveObsConfigQueryWrapper moveExcludeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("move_exclude_files",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper statusEq(Integer status){
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
    public McMoveObsConfigQueryWrapper statusNe(Integer status){
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
    public McMoveObsConfigQueryWrapper statusGt(Integer status){
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
    public McMoveObsConfigQueryWrapper statusGe(Integer status){
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
    public McMoveObsConfigQueryWrapper statusLt(Integer status){
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
    public McMoveObsConfigQueryWrapper statusLe(Integer status){
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
    public McMoveObsConfigQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public McMoveObsConfigQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper statusLike(Integer status){
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
    public McMoveObsConfigQueryWrapper statusNotLike(Integer status){
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
    public McMoveObsConfigQueryWrapper statusLikeLeft(Integer status){
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
    public McMoveObsConfigQueryWrapper statusLikeRight(Integer status){
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
    public McMoveObsConfigQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper statusIn(Collection<Integer> value){
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
    public McMoveObsConfigQueryWrapper statusIn(Integer... values){
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
    public McMoveObsConfigQueryWrapper statusNotIn(Collection<Integer> value){
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
    public McMoveObsConfigQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McMoveObsConfigQueryWrapper createTimeEq(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeNe(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeGt(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeGe(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeLt(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeLe(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McMoveObsConfigQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McMoveObsConfigQueryWrapper createTimeLike(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeNotLike(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeLikeLeft(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeLikeRight(Date createTime){
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
    public McMoveObsConfigQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper createTimeIn(Collection<Date> value){
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
    public McMoveObsConfigQueryWrapper createTimeIn(Date... values){
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
    public McMoveObsConfigQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public McMoveObsConfigQueryWrapper createTimeNotIn(Date... values){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeIn(Date... values){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McMoveObsConfigQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
