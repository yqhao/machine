package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.TencentAccountArea;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 腾讯账号区域表
 * </p>
 * "tencent_account_area"
 * @author PC001
 */
public class TencentAccountAreaQueryWrapper extends QueryWrapper<TencentAccountArea> {


    public static TencentAccountAreaQueryWrapper wrapper() {
        return new TencentAccountAreaQueryWrapper();
    }

    public TencentAccountAreaQueryWrapper() {
        super();
    }

    public TencentAccountAreaQueryWrapper(TencentAccountArea entity) {
        super(entity);
    }

    public TencentAccountAreaQueryWrapper(TencentAccountArea entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public TencentAccountAreaQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public TencentAccountAreaQueryWrapper selectColumns(Consumer<TencentAccountAreaSelect> consumer) {
        TencentAccountAreaSelect select = new TencentAccountAreaSelect();
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
    public TencentAccountAreaQueryWrapper idEq(Long id){
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
    public TencentAccountAreaQueryWrapper idNe(Long id){
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
    public TencentAccountAreaQueryWrapper idGt(Long id){
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
    public TencentAccountAreaQueryWrapper idGe(Long id){
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
    public TencentAccountAreaQueryWrapper idLt(Long id){
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
    public TencentAccountAreaQueryWrapper idLe(Long id){
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
    public TencentAccountAreaQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentAccountAreaQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentAccountAreaQueryWrapper idLike(Long id){
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
    public TencentAccountAreaQueryWrapper idNotLike(Long id){
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
    public TencentAccountAreaQueryWrapper idLikeLeft(Long id){
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
    public TencentAccountAreaQueryWrapper idLikeRight(Long id){
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
    public TencentAccountAreaQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper idIn(Collection<Long> value){
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
    public TencentAccountAreaQueryWrapper idIn(Long... values){
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
    public TencentAccountAreaQueryWrapper idNotIn(Collection<Long> value){
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
    public TencentAccountAreaQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 等于 =
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdEq(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            eq("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 不等于 &lt;&gt;
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdNe(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            ne("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 大于 &gt;
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdGt(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            gt("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 大于等于 &gt;=
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdGe(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            ge("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 小于 &lt;
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdLt(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            lt("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 小于等于 &lt;=
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdLe(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            le("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkTencentAccountIdStart       值1
     * @param fkTencentAccountIdEnd      值2
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdBetween(Long fkTencentAccountIdStart,Long fkTencentAccountIdEnd){
        if(fkTencentAccountIdStart!=null && fkTencentAccountIdEnd!=null){
            between("fk_tencent_account_id",fkTencentAccountIdStart,fkTencentAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTencentAccountIdStart       值1
     * @param fkTencentAccountIdEnd      值2
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdNotBetween(Long fkTencentAccountIdStart,Long fkTencentAccountIdEnd){
        if(fkTencentAccountIdStart!=null && fkTencentAccountIdEnd!=null){
            notBetween("fk_tencent_account_id",fkTencentAccountIdStart,fkTencentAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯账号Id</p>
     * LIKE '%值%'
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdLike(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            like("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * NOT LIKE '%值%'
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdNotLike(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            notLike("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }


    /**
     * <p>腾讯账号Id</p>
     * LIKE '%值'
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdLikeLeft(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            likeLeft("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * LIKE '值%'
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdLikeRight(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            likeRight("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * IS NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdIsNull(){
        isNull("fk_tencent_account_id");
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdIsNotNull(){
        isNotNull("fk_tencent_account_id");
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_account_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_account_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_account_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkTencentAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_account_id",values);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 等于 =
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdEq(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            eq("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 不等于 &lt;&gt;
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdNe(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            ne("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于 &gt;
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdGt(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            gt("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于等于 &gt;=
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdGe(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            ge("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于 &lt;
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdLt(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            lt("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于等于 &lt;=
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdLe(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            le("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * BETWEEN 值1 AND 值2
     * @param fkAccountAreaIdStart       值1
     * @param fkAccountAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdBetween(Long fkAccountAreaIdStart,Long fkAccountAreaIdEnd){
        if(fkAccountAreaIdStart!=null && fkAccountAreaIdEnd!=null){
            between("fk_account_area_id",fkAccountAreaIdStart,fkAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkAccountAreaIdStart       值1
     * @param fkAccountAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdNotBetween(Long fkAccountAreaIdStart,Long fkAccountAreaIdEnd){
        if(fkAccountAreaIdStart!=null && fkAccountAreaIdEnd!=null){
            notBetween("fk_account_area_id",fkAccountAreaIdStart,fkAccountAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值%'
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdLike(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            like("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT LIKE '%值%'
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdNotLike(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            notLike("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值'
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdLikeLeft(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            likeLeft("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '值%'
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdLikeRight(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            likeRight("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IS NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdIsNull(){
        isNull("fk_account_area_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdIsNotNull(){
        isNotNull("fk_account_area_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_account_area_id",value);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_account_area_id",value);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkAccountAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 等于 =
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 不等于 &lt;&gt;
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 大于 &gt;
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 大于等于 &gt;=
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 小于 &lt;
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 小于等于 &lt;=
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * NOT BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionNotBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>腾讯区域</p>
     * LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * NOT LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
     }


    /**
     * <p>腾讯区域</p>
     * LIKE '%值'
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * LIKE '值%'
     * @param region       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionLikeRight(String region){
        if(region!=null){
            likeRight("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * IS NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("region",value);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionIn(String... values){
        if(values!=null && values.length>0){
            in("region",values);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("region",value);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper createTimeEq(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeNe(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeGt(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeGe(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeLt(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeLe(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountAreaQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountAreaQueryWrapper createTimeLike(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeNotLike(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeLikeLeft(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeLikeRight(Date createTime){
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
    public TencentAccountAreaQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper createTimeIn(Collection<Date> value){
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
    public TencentAccountAreaQueryWrapper createTimeIn(Date... values){
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
    public TencentAccountAreaQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentAccountAreaQueryWrapper createTimeNotIn(Date... values){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeIn(Date... values){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentAccountAreaQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 不等于 &lt;&gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 大于 &gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 大于等于 &gt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 小于 &lt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 小于等于 &lt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域表ID</p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * NOT LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>区域表ID</p>
     * LIKE '%值'
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * LIKE '值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * IS NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域表ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域表ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaQueryWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


}
