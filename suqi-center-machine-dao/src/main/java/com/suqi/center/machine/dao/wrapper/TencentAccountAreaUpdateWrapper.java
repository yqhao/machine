package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentAccountArea;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 腾讯账号区域表
 * </p>
 * "tencent_account_area"
 * @author PC001
 */
public class TencentAccountAreaUpdateWrapper extends UpdateWrapper<TencentAccountArea> {

    public static TencentAccountAreaUpdateWrapper wrapper() {
        return new TencentAccountAreaUpdateWrapper();
    }

    public TencentAccountAreaUpdateWrapper() {
        super();
    }

    public TencentAccountAreaUpdateWrapper(TencentAccountArea entity) {
        super(entity);
    }

    /**
     * 
     */
    public TencentAccountAreaUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 腾讯账号Id
     */
    public TencentAccountAreaUpdateWrapper setFkTencentAccountId(Long fkTencentAccountId) {
         set("fk_tencent_account_id",fkTencentAccountId);
        return this;
    }
    /**
     * box_soc的表的主键ID[用这个id做关联]
     */
    public TencentAccountAreaUpdateWrapper setFkAccountAreaId(Long fkAccountAreaId) {
         set("fk_account_area_id",fkAccountAreaId);
        return this;
    }
    /**
     * 腾讯区域
     */
    public TencentAccountAreaUpdateWrapper setRegion(String region) {
         set("region",region);
        return this;
    }
    /**
     * 创建时间
     */
    public TencentAccountAreaUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public TencentAccountAreaUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 区域表ID
     */
    public TencentAccountAreaUpdateWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper idEq(Long id){
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
    public TencentAccountAreaUpdateWrapper idNe(Long id){
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
    public TencentAccountAreaUpdateWrapper idGt(Long id){
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
    public TencentAccountAreaUpdateWrapper idGe(Long id){
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
    public TencentAccountAreaUpdateWrapper idLt(Long id){
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
    public TencentAccountAreaUpdateWrapper idLe(Long id){
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
    public TencentAccountAreaUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentAccountAreaUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentAccountAreaUpdateWrapper idLike(Long id){
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
    public TencentAccountAreaUpdateWrapper idNotLike(Long id){
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
    public TencentAccountAreaUpdateWrapper idLikeLeft(Long id){
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
    public TencentAccountAreaUpdateWrapper idLikeRight(Long id){
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
    public TencentAccountAreaUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateWrapper idIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateWrapper idIn(Long... values){
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
    public TencentAccountAreaUpdateWrapper idNotIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 等于 = fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdEq(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            eq("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 不等于 &lt;&gt; fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdNe(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            ne("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 大于 &gt; fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdGt(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            gt("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 大于等于 &gt;= fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdGe(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            ge("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 小于 &lt; fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdLt(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            lt("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 小于等于 &lt;= fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdLe(Long fkTencentAccountId){
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
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdBetween(Long fkTencentAccountIdStart,Long fkTencentAccountIdEnd){
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
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdNotBetween(Long fkTencentAccountIdStart,Long fkTencentAccountIdEnd){
        if(fkTencentAccountIdStart!=null && fkTencentAccountIdEnd!=null){
            notBetween("fk_tencent_account_id",fkTencentAccountIdStart,fkTencentAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯账号Id</p>
     * LIKE '%值%' fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdLike(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            like("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * NOT LIKE '%值%' fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdNotLike(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            notLike("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }


    /**
     * <p>腾讯账号Id</p>
     * LIKE '%值' fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdLikeLeft(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            likeLeft("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * LIKE '值%' fkTencentAccountId
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdLikeRight(Long fkTencentAccountId){
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
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdIsNull(){
        isNull("fk_tencent_account_id");
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdIsNotNull(){
        isNotNull("fk_tencent_account_id");
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdIn(Long... values){
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
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdNotIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateWrapper fkTencentAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_account_id",values);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 等于 = fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdEq(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            eq("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 不等于 &lt;&gt; fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdNe(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            ne("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于 &gt; fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdGt(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            gt("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于等于 &gt;= fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdGe(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            ge("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于 &lt; fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdLt(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            lt("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于等于 &lt;= fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdLe(Long fkAccountAreaId){
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
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdBetween(Long fkAccountAreaIdStart,Long fkAccountAreaIdEnd){
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
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdNotBetween(Long fkAccountAreaIdStart,Long fkAccountAreaIdEnd){
        if(fkAccountAreaIdStart!=null && fkAccountAreaIdEnd!=null){
            notBetween("fk_account_area_id",fkAccountAreaIdStart,fkAccountAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值%' fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdLike(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            like("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT LIKE '%值%' fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdNotLike(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            notLike("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值' fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdLikeLeft(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            likeLeft("fk_account_area_id",fkAccountAreaId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '值%' fkAccountAreaId
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdLikeRight(Long fkAccountAreaId){
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
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdIsNull(){
        isNull("fk_account_area_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdIsNotNull(){
        isNotNull("fk_account_area_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdIn(Long... values){
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
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdNotIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateWrapper fkAccountAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 等于 = region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 不等于 &lt;&gt; region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 大于 &gt; region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 大于等于 &gt;= region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 小于 &lt; region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 小于等于 &lt;= region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionLe(String region){
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
    public TencentAccountAreaUpdateWrapper regionBetween(String regionStart,String regionEnd){
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
    public TencentAccountAreaUpdateWrapper regionNotBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>腾讯区域</p>
     * LIKE '%值%' region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * NOT LIKE '%值%' region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
     }


    /**
     * <p>腾讯区域</p>
     * LIKE '%值' region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * LIKE '值%' region
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionLikeRight(String region){
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
    public TencentAccountAreaUpdateWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateWrapper regionIn(Collection<String> value){
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
    public TencentAccountAreaUpdateWrapper regionIn(String... values){
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
    public TencentAccountAreaUpdateWrapper regionNotIn(Collection<String> value){
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
    public TencentAccountAreaUpdateWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper createTimeEq(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeNe(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeGt(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeGe(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeLt(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeLe(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountAreaUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountAreaUpdateWrapper createTimeLike(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeNotLike(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeLikeRight(Date createTime){
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
    public TencentAccountAreaUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateWrapper createTimeIn(Collection<Date> value){
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
    public TencentAccountAreaUpdateWrapper createTimeIn(Date... values){
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
    public TencentAccountAreaUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentAccountAreaUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountAreaUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentAccountAreaUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public TencentAccountAreaUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentAccountAreaUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 等于 = fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 不等于 &lt;&gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 大于 &gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 大于等于 &gt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 小于 &lt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 小于等于 &lt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
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
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
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
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域表ID</p>
     * LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * NOT LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>区域表ID</p>
     * LIKE '%值' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * LIKE '值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域表ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域表ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdIn(Long... values){
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
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


}
