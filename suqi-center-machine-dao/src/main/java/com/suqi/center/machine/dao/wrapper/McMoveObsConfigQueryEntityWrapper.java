package com.suqi.center.machine.dao.wrapper;

import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.McMoveObsConfig;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 
 * </p>
 * "mc_move_obs_config"
 * @author PC001
 */
public class McMoveObsConfigQueryEntityWrapper extends QueryWrapper<McMoveObsConfig> {

    public static McMoveObsConfigQueryEntityWrapper wrapper(McMoveObsConfig entity) {
        return new McMoveObsConfigQueryEntityWrapper(entity);
    }

    private McMoveObsConfig entity;

    public McMoveObsConfigQueryEntityWrapper(McMoveObsConfig entity) {
         this.entity=entity;
    }


    protected McMoveObsConfig entity() {
        if(entity==null){
            throw new NullPointerException("McMoveObsConfig is null");
        }
        return entity;
    }

    @Override
    public McMoveObsConfigQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public McMoveObsConfigQueryEntityWrapper selectColumns(Consumer<McMoveObsConfigSelect> consumer) {
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
     * 等于 = entity().getId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper idEq(){
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
    public McMoveObsConfigQueryEntityWrapper idNe(){
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
    public McMoveObsConfigQueryEntityWrapper idGt(){
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
    public McMoveObsConfigQueryEntityWrapper idGe(){
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
    public McMoveObsConfigQueryEntityWrapper idLt(){
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
    public McMoveObsConfigQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper idBetween(Long idEnd){
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
    public McMoveObsConfigQueryEntityWrapper idNotBetween(Long idEnd){
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
    public McMoveObsConfigQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public McMoveObsConfigQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper idLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper idEq(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idNe(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idGt(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idGe(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idLt(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idLe(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idLike(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idNotLike(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idLikeLeft(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idLikeRight(Long id){
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
    public McMoveObsConfigQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper idIn(Collection<Long> value){
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
    public McMoveObsConfigQueryEntityWrapper idIn(Long... values){
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
    public McMoveObsConfigQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public McMoveObsConfigQueryEntityWrapper idNotIn(Long... values){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdEq(){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdNe(){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdGt(){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdGe(){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLt(){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * BETWEEN  entity().getFkMemberId() AND fkMemberIdEnd
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '%值%'  entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * NOT LIKE '%值%'  entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkMemberIdNotLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '%值'  entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLikeLeft(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * LIKE '值%'  entity().getFkMemberId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdEq(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdNe(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdGt(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdGe(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLt(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLe(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLike(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id(0：系统，其它商户自定义）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdIn(Long... values){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public McMoveObsConfigQueryEntityWrapper fkMemberIdNotIn(Long... values){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdEq(){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdNe(){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdGt(){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdGe(){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLt(){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN  entity().getFkPcpAreaId() AND fkPcpAreaIdEnd
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdEnd){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdEnd){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值%'  entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT LIKE '%值%'  entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdNotLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值'  entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLikeLeft(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * LIKE '值%'  entity().getFkPcpAreaId()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdIn(Long... values){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public McMoveObsConfigQueryEntityWrapper fkPcpAreaIdNotIn(Long... values){
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
    public McMoveObsConfigQueryEntityWrapper areaNameEq(){
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
    public McMoveObsConfigQueryEntityWrapper areaNameNe(){
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
    public McMoveObsConfigQueryEntityWrapper areaNameGt(){
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
    public McMoveObsConfigQueryEntityWrapper areaNameGe(){
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
    public McMoveObsConfigQueryEntityWrapper areaNameLt(){
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
    public McMoveObsConfigQueryEntityWrapper areaNameLe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * BETWEEN  entity().getAreaName() AND areaNameEnd
     * @param areaNameEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper areaNameBetween(String areaNameEnd){
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
    public McMoveObsConfigQueryEntityWrapper areaNameNotBetween(String areaNameEnd){
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
    public McMoveObsConfigQueryEntityWrapper areaNameBetween(String areaNameStart,String areaNameEnd){
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
    public McMoveObsConfigQueryEntityWrapper areaNameNotBetween(String areaNameStart,String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            notBetween("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }


    /**
     * <p>区域名称</p>
     * LIKE '%值%'  entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper areaNameLike(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            like("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * NOT LIKE '%值%'  entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper areaNameNotLike(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            notLike("area_name",areaName);
        }
        return this;
     }


    /**
     * <p>区域名称</p>
     * LIKE '%值'  entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper areaNameLikeLeft(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            likeLeft("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>区域名称</p>
     * LIKE '值%'  entity().getAreaName()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper areaNameLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper areaNameEq(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameNe(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameGt(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameGe(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameLt(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameLe(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameLike(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameNotLike(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameLikeLeft(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameLikeRight(String areaName){
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
    public McMoveObsConfigQueryEntityWrapper areaNameIsNull(){
        isNull("area_name");
        return this;
    }

    /**
     * <p>区域名称</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper areaNameIsNotNull(){
        isNotNull("area_name");
        return this;
    }

    /**
     * <p>区域名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper areaNameIn(Collection<String> value){
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
    public McMoveObsConfigQueryEntityWrapper areaNameIn(String... values){
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
    public McMoveObsConfigQueryEntityWrapper areaNameNotIn(Collection<String> value){
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
    public McMoveObsConfigQueryEntityWrapper areaNameNotIn(String... values){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameEq(){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameNe(){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameGt(){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameGe(){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameLt(){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameLe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * BETWEEN  entity().getBucketName() AND bucketNameEnd
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper bucketNameBetween(String bucketNameEnd){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameNotBetween(String bucketNameEnd){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>桶名称</p>
     * LIKE '%值%'  entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper bucketNameLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * NOT LIKE '%值%'  entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper bucketNameNotLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>桶名称</p>
     * LIKE '%值'  entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper bucketNameLikeLeft(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>桶名称</p>
     * LIKE '值%'  entity().getBucketName()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper bucketNameLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameEq(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameNe(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameGt(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameGe(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameLt(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameLe(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameLike(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameNotLike(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameLikeLeft(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameLikeRight(String bucketName){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>桶名称</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>桶名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper bucketNameIn(Collection<String> value){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameIn(String... values){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameNotIn(Collection<String> value){
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
    public McMoveObsConfigQueryEntityWrapper bucketNameNotIn(String... values){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesEq(){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesNe(){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesGt(){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesGe(){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLt(){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLe(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            le("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * BETWEEN  entity().getMoveIncludeFiles() AND moveIncludeFilesEnd
     * @param moveIncludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesBetween(String moveIncludeFilesEnd){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesNotBetween(String moveIncludeFilesEnd){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesBetween(String moveIncludeFilesStart,String moveIncludeFilesEnd){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesNotBetween(String moveIncludeFilesStart,String moveIncludeFilesEnd){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null && moveIncludeFilesEnd!=null){
            notBetween("move_include_files",moveIncludeFilesStart,moveIncludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>包含路径</p>
     * LIKE '%值%'  entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLike(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            like("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * NOT LIKE '%值%'  entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesNotLike(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            notLike("move_include_files",moveIncludeFiles);
        }
        return this;
     }


    /**
     * <p>包含路径</p>
     * LIKE '%值'  entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLikeLeft(){
        String moveIncludeFiles =entity().getMoveIncludeFiles();
        if(moveIncludeFiles!=null){
            likeLeft("move_include_files",moveIncludeFiles);
        }
        return this;
     }

    /**
     * <p>包含路径</p>
     * LIKE '值%'  entity().getMoveIncludeFiles()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesEq(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesNe(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesGt(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesGe(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLt(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLe(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLike(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesNotLike(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLikeLeft(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesLikeRight(String moveIncludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesIsNull(){
        isNull("move_include_files");
        return this;
    }

    /**
     * <p>包含路径</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesIsNotNull(){
        isNotNull("move_include_files");
        return this;
    }

    /**
     * <p>包含路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesIn(Collection<String> value){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesIn(String... values){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesNotIn(Collection<String> value){
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
    public McMoveObsConfigQueryEntityWrapper moveIncludeFilesNotIn(String... values){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesEq(){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesNe(){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesGt(){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesGe(){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLt(){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLe(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            le("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * BETWEEN  entity().getMoveExcludeFiles() AND moveExcludeFilesEnd
     * @param moveExcludeFilesEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesBetween(String moveExcludeFilesEnd){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesNotBetween(String moveExcludeFilesEnd){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesBetween(String moveExcludeFilesStart,String moveExcludeFilesEnd){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesNotBetween(String moveExcludeFilesStart,String moveExcludeFilesEnd){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null && moveExcludeFilesEnd!=null){
            notBetween("move_exclude_files",moveExcludeFilesStart,moveExcludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>排除路径</p>
     * LIKE '%值%'  entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLike(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            like("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * NOT LIKE '%值%'  entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesNotLike(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            notLike("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }


    /**
     * <p>排除路径</p>
     * LIKE '%值'  entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLikeLeft(){
        String moveExcludeFiles =entity().getMoveExcludeFiles();
        if(moveExcludeFiles!=null){
            likeLeft("move_exclude_files",moveExcludeFiles);
        }
        return this;
     }

    /**
     * <p>排除路径</p>
     * LIKE '值%'  entity().getMoveExcludeFiles()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesEq(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesNe(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesGt(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesGe(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLt(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLe(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLike(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesNotLike(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLikeLeft(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesLikeRight(String moveExcludeFiles){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesIsNull(){
        isNull("move_exclude_files");
        return this;
    }

    /**
     * <p>排除路径</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesIsNotNull(){
        isNotNull("move_exclude_files");
        return this;
    }

    /**
     * <p>排除路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesIn(Collection<String> value){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesIn(String... values){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesNotIn(Collection<String> value){
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
    public McMoveObsConfigQueryEntityWrapper moveExcludeFilesNotIn(String... values){
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
    public McMoveObsConfigQueryEntityWrapper statusEq(){
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
    public McMoveObsConfigQueryEntityWrapper statusNe(){
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
    public McMoveObsConfigQueryEntityWrapper statusGt(){
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
    public McMoveObsConfigQueryEntityWrapper statusGe(){
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
    public McMoveObsConfigQueryEntityWrapper statusLt(){
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
    public McMoveObsConfigQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper statusBetween(Integer statusEnd){
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
    public McMoveObsConfigQueryEntityWrapper statusNotBetween(Integer statusEnd){
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
    public McMoveObsConfigQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public McMoveObsConfigQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper statusLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper statusEq(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusNe(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusGt(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusGe(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusLt(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusLe(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusLike(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusNotLike(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusLikeLeft(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusLikeRight(Integer status){
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
    public McMoveObsConfigQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper statusIn(Collection<Integer> value){
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
    public McMoveObsConfigQueryEntityWrapper statusIn(Integer... values){
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
    public McMoveObsConfigQueryEntityWrapper statusNotIn(Collection<Integer> value){
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
    public McMoveObsConfigQueryEntityWrapper statusNotIn(Integer... values){
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
    public McMoveObsConfigQueryEntityWrapper createTimeEq(){
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
    public McMoveObsConfigQueryEntityWrapper createTimeNe(){
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
    public McMoveObsConfigQueryEntityWrapper createTimeGt(){
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
    public McMoveObsConfigQueryEntityWrapper createTimeGe(){
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
    public McMoveObsConfigQueryEntityWrapper createTimeLt(){
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
    public McMoveObsConfigQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public McMoveObsConfigQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public McMoveObsConfigQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McMoveObsConfigQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McMoveObsConfigQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper createTimeLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper createTimeEq(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeNe(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeGt(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeGe(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeLt(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeLe(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeLike(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public McMoveObsConfigQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public McMoveObsConfigQueryEntityWrapper createTimeIn(Date... values){
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
    public McMoveObsConfigQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McMoveObsConfigQueryEntityWrapper createTimeNotIn(Date... values){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeEq(){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeNe(){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeGt(){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeGe(){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLt(){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McMoveObsConfigQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }



}
