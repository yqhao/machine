package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.TencentImages;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 腾讯镜像管理
 * </p>
 * "tencent_images"
 * @author PC001
 */
public class TencentImagesQueryEntityWrapper extends QueryWrapper<TencentImages> {

    public static TencentImagesQueryEntityWrapper wrapper(TencentImages entity) {
        return new TencentImagesQueryEntityWrapper(entity);
    }

    private TencentImages entity;

    public TencentImagesQueryEntityWrapper(TencentImages entity) {
         this.entity=entity;
    }


    protected TencentImages entity() {
        if(entity==null){
            throw new NullPointerException("TencentImages is null");
        }
        return entity;
    }

    @Override
    public TencentImagesQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public TencentImagesQueryEntityWrapper selectColumns(Consumer<TencentImagesSelect> consumer) {
        TencentImagesSelect select = new TencentImagesSelect();
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
    public TencentImagesQueryEntityWrapper idEq(){
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
    public TencentImagesQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",entity().getId(),idEnd);
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
    public TencentImagesQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentImagesQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentImagesQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper idEq(Long id){
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
    public TencentImagesQueryEntityWrapper idNe(Long id){
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
    public TencentImagesQueryEntityWrapper idGt(Long id){
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
    public TencentImagesQueryEntityWrapper idGe(Long id){
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
    public TencentImagesQueryEntityWrapper idLt(Long id){
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
    public TencentImagesQueryEntityWrapper idLe(Long id){
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
    public TencentImagesQueryEntityWrapper idLike(Long id){
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
    public TencentImagesQueryEntityWrapper idNotLike(Long id){
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
    public TencentImagesQueryEntityWrapper idLikeLeft(Long id){
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
    public TencentImagesQueryEntityWrapper idLikeRight(Long id){
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
    public TencentImagesQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper idIn(Collection<Long> value){
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
    public TencentImagesQueryEntityWrapper idIn(Long... values){
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
    public TencentImagesQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public TencentImagesQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>腾讯账号区域Id</p>
     * 等于 = entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdEq(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            eq("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * 不等于 &lt;&gt; entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdNe(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            ne("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于 &gt; entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdGt(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            gt("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于等于 &gt;= entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdGe(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            ge("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于 &lt; entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLt(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            lt("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于等于 &lt;= entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLe(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            le("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * BETWEEN  entity().getFkTencentAccountAreaId() AND fkTencentAccountAreaIdEnd
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdEnd){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null && fkTencentAccountAreaIdEnd!=null){
            between("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId(),fkTencentAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT BETWEEN  entity().getFkTencentAccountAreaId() AND 值2
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdEnd){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null && fkTencentAccountAreaIdEnd!=null){
            notBetween("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId(),fkTencentAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * BETWEEN  entity().getFkTencentAccountAreaId() AND 值2
     * @param fkTencentAccountAreaIdStart       值1
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null && fkTencentAccountAreaIdEnd!=null){
            between("fk_tencent_account_area_id",fkTencentAccountAreaIdStart,fkTencentAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT BETWEEN  entity().getFkTencentAccountAreaId() AND 值2
     * @param fkTencentAccountAreaIdStart       值1
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null && fkTencentAccountAreaIdEnd!=null){
            notBetween("fk_tencent_account_area_id",fkTencentAccountAreaIdStart,fkTencentAccountAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值%'  entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLike(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            like("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT LIKE '%值%'  entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdNotLike(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            notLike("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值'  entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLikeLeft(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            likeLeft("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '值%'  entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLikeRight(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            likeRight("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 等于 =
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdEq(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            eq("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * 不等于 &lt;&gt;
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdNe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            ne("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于 &gt;
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdGt(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            gt("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于等于 &gt;=
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdGe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            ge("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于 &lt;
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLt(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            lt("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于等于 &lt;=
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            le("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值%'
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLike(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            like("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT LIKE '%值%'
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdNotLike(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            notLike("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值'
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLikeLeft(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            likeLeft("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '值%'
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdLikeRight(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            likeRight("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdIsNull(){
        isNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdIsNotNull(){
        isNotNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_account_area_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_account_area_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper fkTencentAccountAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_account_area_id",values);
        }
        return this;
    }


    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 等于 = entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionEq(){
        String region =entity().getRegion();
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 不等于 &lt;&gt; entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionNe(){
        String region =entity().getRegion();
        if(region!=null){
            ne("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 大于 &gt; entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionGt(){
        String region =entity().getRegion();
        if(region!=null){
            gt("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 大于等于 &gt;= entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionGe(){
        String region =entity().getRegion();
        if(region!=null){
            ge("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 小于 &lt; entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLt(){
        String region =entity().getRegion();
        if(region!=null){
            lt("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 小于等于 &lt;= entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLe(){
        String region =entity().getRegion();
        if(region!=null){
            le("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * BETWEEN  entity().getRegion() AND regionEnd
     * @param regionEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionBetween(String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            between("region",entity().getRegion(),regionEnd);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT BETWEEN  entity().getRegion() AND 值2
     * @param regionEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionNotBetween(String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            notBetween("region",entity().getRegion(),regionEnd);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * BETWEEN  entity().getRegion() AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionBetween(String regionStart,String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT BETWEEN  entity().getRegion() AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionNotBetween(String regionStart,String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '%值%'  entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLike(){
        String region =entity().getRegion();
        if(region!=null){
            like("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT LIKE '%值%'  entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionNotLike(){
        String region =entity().getRegion();
        if(region!=null){
            notLike("region",entity().getRegion());
        }
        return this;
     }


    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '%值'  entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLikeLeft(){
        String region =entity().getRegion();
        if(region!=null){
            likeLeft("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '值%'  entity().getRegion()
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLikeRight(){
        String region =entity().getRegion();
        if(region!=null){
            likeRight("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 等于 =
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 不等于 &lt;&gt;
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 大于 &gt;
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 大于等于 &gt;=
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 小于 &lt;
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 小于等于 &lt;=
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
     }


    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '%值'
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '值%'
     * @param region       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionLikeRight(String region){
        if(region!=null){
            likeRight("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("region",value);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionIn(String... values){
        if(values!=null && values.length>0){
            in("region",values);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("region",value);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }


    /**
     * <p>镜像名称</p>
     * 等于 = entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleEq(){
        String title =entity().getTitle();
        if(title!=null){
            eq("title",title);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 不等于 &lt;&gt; entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleNe(){
        String title =entity().getTitle();
        if(title!=null){
            ne("title",entity().getTitle());
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于 &gt; entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleGt(){
        String title =entity().getTitle();
        if(title!=null){
            gt("title",entity().getTitle());
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于等于 &gt;= entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleGe(){
        String title =entity().getTitle();
        if(title!=null){
            ge("title",entity().getTitle());
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于 &lt; entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLt(){
        String title =entity().getTitle();
        if(title!=null){
            lt("title",entity().getTitle());
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于等于 &lt;= entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLe(){
        String title =entity().getTitle();
        if(title!=null){
            le("title",entity().getTitle());
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * BETWEEN  entity().getTitle() AND titleEnd
     * @param titleEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleBetween(String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            between("title",entity().getTitle(),titleEnd);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT BETWEEN  entity().getTitle() AND 值2
     * @param titleEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleNotBetween(String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            notBetween("title",entity().getTitle(),titleEnd);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * BETWEEN  entity().getTitle() AND 值2
     * @param titleStart       值1
     * @param titleEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleBetween(String titleStart,String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            between("title",titleStart,titleEnd);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT BETWEEN  entity().getTitle() AND 值2
     * @param titleStart       值1
     * @param titleEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleNotBetween(String titleStart,String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            notBetween("title",titleStart,titleEnd);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值%'  entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLike(){
        String title =entity().getTitle();
        if(title!=null){
            like("title",entity().getTitle());
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT LIKE '%值%'  entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleNotLike(){
        String title =entity().getTitle();
        if(title!=null){
            notLike("title",entity().getTitle());
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值'  entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLikeLeft(){
        String title =entity().getTitle();
        if(title!=null){
            likeLeft("title",entity().getTitle());
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * LIKE '值%'  entity().getTitle()
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLikeRight(){
        String title =entity().getTitle();
        if(title!=null){
            likeRight("title",entity().getTitle());
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 等于 =
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleEq(String title){
        if(title!=null){
            eq("title",title);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 不等于 &lt;&gt;
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleNe(String title){
        if(title!=null){
            ne("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于 &gt;
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleGt(String title){
        if(title!=null){
            gt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于等于 &gt;=
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleGe(String title){
        if(title!=null){
            ge("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于 &lt;
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLt(String title){
        if(title!=null){
            lt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于等于 &lt;=
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLe(String title){
        if(title!=null){
            le("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * LIKE '%值%'
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLike(String title){
        if(title!=null){
            like("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT LIKE '%值%'
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleNotLike(String title){
        if(title!=null){
            notLike("title",title);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值'
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLikeLeft(String title){
        if(title!=null){
            likeLeft("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * LIKE '值%'
     * @param title       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleLikeRight(String title){
        if(title!=null){
            likeRight("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("title",value);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleIn(String... values){
        if(values!=null && values.length>0){
            in("title",values);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("title",value);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }


    /**
     * <p>镜像版本</p>
     * 等于 = entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeEq(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            eq("version_code",versionCode);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 不等于 &lt;&gt; entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeNe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            ne("version_code",entity().getVersionCode());
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于 &gt; entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeGt(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            gt("version_code",entity().getVersionCode());
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于等于 &gt;= entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeGe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            ge("version_code",entity().getVersionCode());
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于 &lt; entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLt(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            lt("version_code",entity().getVersionCode());
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于等于 &lt;= entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            le("version_code",entity().getVersionCode());
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * BETWEEN  entity().getVersionCode() AND versionCodeEnd
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeBetween(String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            between("version_code",entity().getVersionCode(),versionCodeEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT BETWEEN  entity().getVersionCode() AND 值2
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeNotBetween(String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            notBetween("version_code",entity().getVersionCode(),versionCodeEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * BETWEEN  entity().getVersionCode() AND 值2
     * @param versionCodeStart       值1
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            between("version_code",versionCodeStart,versionCodeEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT BETWEEN  entity().getVersionCode() AND 值2
     * @param versionCodeStart       值1
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            notBetween("version_code",versionCodeStart,versionCodeEnd);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值%'  entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLike(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            like("version_code",entity().getVersionCode());
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT LIKE '%值%'  entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeNotLike(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            notLike("version_code",entity().getVersionCode());
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值'  entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLikeLeft(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            likeLeft("version_code",entity().getVersionCode());
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * LIKE '值%'  entity().getVersionCode()
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLikeRight(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            likeRight("version_code",entity().getVersionCode());
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 等于 =
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeEq(String versionCode){
        if(versionCode!=null){
            eq("version_code",versionCode);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 不等于 &lt;&gt;
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeNe(String versionCode){
        if(versionCode!=null){
            ne("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于 &gt;
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeGt(String versionCode){
        if(versionCode!=null){
            gt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于等于 &gt;=
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeGe(String versionCode){
        if(versionCode!=null){
            ge("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于 &lt;
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLt(String versionCode){
        if(versionCode!=null){
            lt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于等于 &lt;=
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLe(String versionCode){
        if(versionCode!=null){
            le("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * LIKE '%值%'
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLike(String versionCode){
        if(versionCode!=null){
            like("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT LIKE '%值%'
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeNotLike(String versionCode){
        if(versionCode!=null){
            notLike("version_code",versionCode);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值'
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLikeLeft(String versionCode){
        if(versionCode!=null){
            likeLeft("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * LIKE '值%'
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeLikeRight(String versionCode){
        if(versionCode!=null){
            likeRight("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("version_code",value);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeIn(String... values){
        if(values!=null && values.length>0){
            in("version_code",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_code",value);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }


    /**
     * <p>镜像下载地址</p>
     * 等于 = entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlEq(){
        String url =entity().getUrl();
        if(url!=null){
            eq("url",url);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * 不等于 &lt;&gt; entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlNe(){
        String url =entity().getUrl();
        if(url!=null){
            ne("url",entity().getUrl());
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 大于 &gt; entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlGt(){
        String url =entity().getUrl();
        if(url!=null){
            gt("url",entity().getUrl());
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 大于等于 &gt;= entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlGe(){
        String url =entity().getUrl();
        if(url!=null){
            ge("url",entity().getUrl());
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 小于 &lt; entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLt(){
        String url =entity().getUrl();
        if(url!=null){
            lt("url",entity().getUrl());
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 小于等于 &lt;= entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLe(){
        String url =entity().getUrl();
        if(url!=null){
            le("url",entity().getUrl());
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * BETWEEN  entity().getUrl() AND urlEnd
     * @param urlEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlBetween(String urlEnd){
        String url =entity().getUrl();
        if(url!=null && urlEnd!=null){
            between("url",entity().getUrl(),urlEnd);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * NOT BETWEEN  entity().getUrl() AND 值2
     * @param urlEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlNotBetween(String urlEnd){
        String url =entity().getUrl();
        if(url!=null && urlEnd!=null){
            notBetween("url",entity().getUrl(),urlEnd);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * BETWEEN  entity().getUrl() AND 值2
     * @param urlStart       值1
     * @param urlEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlBetween(String urlStart,String urlEnd){
        String url =entity().getUrl();
        if(url!=null && urlEnd!=null){
            between("url",urlStart,urlEnd);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * NOT BETWEEN  entity().getUrl() AND 值2
     * @param urlStart       值1
     * @param urlEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlNotBetween(String urlStart,String urlEnd){
        String url =entity().getUrl();
        if(url!=null && urlEnd!=null){
            notBetween("url",urlStart,urlEnd);
        }
        return this;
     }


    /**
     * <p>镜像下载地址</p>
     * LIKE '%值%'  entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLike(){
        String url =entity().getUrl();
        if(url!=null){
            like("url",entity().getUrl());
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * NOT LIKE '%值%'  entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlNotLike(){
        String url =entity().getUrl();
        if(url!=null){
            notLike("url",entity().getUrl());
        }
        return this;
     }


    /**
     * <p>镜像下载地址</p>
     * LIKE '%值'  entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLikeLeft(){
        String url =entity().getUrl();
        if(url!=null){
            likeLeft("url",entity().getUrl());
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * LIKE '值%'  entity().getUrl()
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLikeRight(){
        String url =entity().getUrl();
        if(url!=null){
            likeRight("url",entity().getUrl());
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 等于 =
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlEq(String url){
        if(url!=null){
            eq("url",url);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * 不等于 &lt;&gt;
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlNe(String url){
        if(url!=null){
            ne("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 大于 &gt;
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlGt(String url){
        if(url!=null){
            gt("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 大于等于 &gt;=
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlGe(String url){
        if(url!=null){
            ge("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 小于 &lt;
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLt(String url){
        if(url!=null){
            lt("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 小于等于 &lt;=
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLe(String url){
        if(url!=null){
            le("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * LIKE '%值%'
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLike(String url){
        if(url!=null){
            like("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * NOT LIKE '%值%'
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlNotLike(String url){
        if(url!=null){
            notLike("url",url);
        }
        return this;
     }


    /**
     * <p>镜像下载地址</p>
     * LIKE '%值'
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLikeLeft(String url){
        if(url!=null){
            likeLeft("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * LIKE '值%'
     * @param url       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlLikeRight(String url){
        if(url!=null){
            likeRight("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlIsNull(){
        isNull("url");
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlIsNotNull(){
        isNotNull("url");
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("url",value);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlIn(String... values){
        if(values!=null && values.length>0){
            in("url",values);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("url",value);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper urlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("url",values);
        }
        return this;
    }


    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 等于 = entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Eq(){
        String md5 =entity().getMd5();
        if(md5!=null){
            eq("md5",md5);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 不等于 &lt;&gt; entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Ne(){
        String md5 =entity().getMd5();
        if(md5!=null){
            ne("md5",entity().getMd5());
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 大于 &gt; entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Gt(){
        String md5 =entity().getMd5();
        if(md5!=null){
            gt("md5",entity().getMd5());
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 大于等于 &gt;= entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Ge(){
        String md5 =entity().getMd5();
        if(md5!=null){
            ge("md5",entity().getMd5());
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 小于 &lt; entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Lt(){
        String md5 =entity().getMd5();
        if(md5!=null){
            lt("md5",entity().getMd5());
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 小于等于 &lt;= entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Le(){
        String md5 =entity().getMd5();
        if(md5!=null){
            le("md5",entity().getMd5());
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * BETWEEN  entity().getMd5() AND md5End
     * @param md5End      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Between(String md5End){
        String md5 =entity().getMd5();
        if(md5!=null && md5End!=null){
            between("md5",entity().getMd5(),md5End);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT BETWEEN  entity().getMd5() AND 值2
     * @param md5End      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5NotBetween(String md5End){
        String md5 =entity().getMd5();
        if(md5!=null && md5End!=null){
            notBetween("md5",entity().getMd5(),md5End);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * BETWEEN  entity().getMd5() AND 值2
     * @param md5Start       值1
     * @param md5End      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Between(String md5Start,String md5End){
        String md5 =entity().getMd5();
        if(md5!=null && md5End!=null){
            between("md5",md5Start,md5End);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT BETWEEN  entity().getMd5() AND 值2
     * @param md5Start       值1
     * @param md5End      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5NotBetween(String md5Start,String md5End){
        String md5 =entity().getMd5();
        if(md5!=null && md5End!=null){
            notBetween("md5",md5Start,md5End);
        }
        return this;
     }


    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '%值%'  entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Like(){
        String md5 =entity().getMd5();
        if(md5!=null){
            like("md5",entity().getMd5());
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT LIKE '%值%'  entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5NotLike(){
        String md5 =entity().getMd5();
        if(md5!=null){
            notLike("md5",entity().getMd5());
        }
        return this;
     }


    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '%值'  entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5LikeLeft(){
        String md5 =entity().getMd5();
        if(md5!=null){
            likeLeft("md5",entity().getMd5());
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '值%'  entity().getMd5()
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5LikeRight(){
        String md5 =entity().getMd5();
        if(md5!=null){
            likeRight("md5",entity().getMd5());
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 等于 =
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Eq(String md5){
        if(md5!=null){
            eq("md5",md5);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 不等于 &lt;&gt;
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Ne(String md5){
        if(md5!=null){
            ne("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 大于 &gt;
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Gt(String md5){
        if(md5!=null){
            gt("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 大于等于 &gt;=
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Ge(String md5){
        if(md5!=null){
            ge("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 小于 &lt;
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Lt(String md5){
        if(md5!=null){
            lt("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 小于等于 &lt;=
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Le(String md5){
        if(md5!=null){
            le("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '%值%'
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5Like(String md5){
        if(md5!=null){
            like("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT LIKE '%值%'
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5NotLike(String md5){
        if(md5!=null){
            notLike("md5",md5);
        }
        return this;
     }


    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '%值'
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5LikeLeft(String md5){
        if(md5!=null){
            likeLeft("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '值%'
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5LikeRight(String md5){
        if(md5!=null){
            likeRight("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5IsNull(){
        isNull("md5");
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5IsNotNull(){
        isNotNull("md5");
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("md5",value);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5In(String... values){
        if(values!=null && values.length>0){
            in("md5",values);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("md5",value);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper md5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("md5",values);
        }
        return this;
    }


    /**
     * <p>镜像描述</p>
     * 等于 = entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionEq(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            eq("image_description",imageDescription);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * 不等于 &lt;&gt; entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionNe(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            ne("image_description",entity().getImageDescription());
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 大于 &gt; entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionGt(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            gt("image_description",entity().getImageDescription());
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 大于等于 &gt;= entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionGe(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            ge("image_description",entity().getImageDescription());
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 小于 &lt; entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLt(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            lt("image_description",entity().getImageDescription());
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 小于等于 &lt;= entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLe(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            le("image_description",entity().getImageDescription());
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * BETWEEN  entity().getImageDescription() AND imageDescriptionEnd
     * @param imageDescriptionEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionBetween(String imageDescriptionEnd){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null && imageDescriptionEnd!=null){
            between("image_description",entity().getImageDescription(),imageDescriptionEnd);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * NOT BETWEEN  entity().getImageDescription() AND 值2
     * @param imageDescriptionEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionNotBetween(String imageDescriptionEnd){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null && imageDescriptionEnd!=null){
            notBetween("image_description",entity().getImageDescription(),imageDescriptionEnd);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * BETWEEN  entity().getImageDescription() AND 值2
     * @param imageDescriptionStart       值1
     * @param imageDescriptionEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionBetween(String imageDescriptionStart,String imageDescriptionEnd){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null && imageDescriptionEnd!=null){
            between("image_description",imageDescriptionStart,imageDescriptionEnd);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * NOT BETWEEN  entity().getImageDescription() AND 值2
     * @param imageDescriptionStart       值1
     * @param imageDescriptionEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionNotBetween(String imageDescriptionStart,String imageDescriptionEnd){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null && imageDescriptionEnd!=null){
            notBetween("image_description",imageDescriptionStart,imageDescriptionEnd);
        }
        return this;
     }


    /**
     * <p>镜像描述</p>
     * LIKE '%值%'  entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLike(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            like("image_description",entity().getImageDescription());
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * NOT LIKE '%值%'  entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionNotLike(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            notLike("image_description",entity().getImageDescription());
        }
        return this;
     }


    /**
     * <p>镜像描述</p>
     * LIKE '%值'  entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLikeLeft(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            likeLeft("image_description",entity().getImageDescription());
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * LIKE '值%'  entity().getImageDescription()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLikeRight(){
        String imageDescription =entity().getImageDescription();
        if(imageDescription!=null){
            likeRight("image_description",entity().getImageDescription());
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 等于 =
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionEq(String imageDescription){
        if(imageDescription!=null){
            eq("image_description",imageDescription);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * 不等于 &lt;&gt;
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionNe(String imageDescription){
        if(imageDescription!=null){
            ne("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 大于 &gt;
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionGt(String imageDescription){
        if(imageDescription!=null){
            gt("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 大于等于 &gt;=
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionGe(String imageDescription){
        if(imageDescription!=null){
            ge("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 小于 &lt;
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLt(String imageDescription){
        if(imageDescription!=null){
            lt("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 小于等于 &lt;=
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLe(String imageDescription){
        if(imageDescription!=null){
            le("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * LIKE '%值%'
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLike(String imageDescription){
        if(imageDescription!=null){
            like("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * NOT LIKE '%值%'
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionNotLike(String imageDescription){
        if(imageDescription!=null){
            notLike("image_description",imageDescription);
        }
        return this;
     }


    /**
     * <p>镜像描述</p>
     * LIKE '%值'
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLikeLeft(String imageDescription){
        if(imageDescription!=null){
            likeLeft("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * LIKE '值%'
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionLikeRight(String imageDescription){
        if(imageDescription!=null){
            likeRight("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionIsNull(){
        isNull("image_description");
        return this;
    }

    /**
     * <p>镜像描述</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionIsNotNull(){
        isNotNull("image_description");
        return this;
    }

    /**
     * <p>镜像描述</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_description",value);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionIn(String... values){
        if(values!=null && values.length>0){
            in("image_description",values);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_description",value);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageDescriptionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_description",values);
        }
        return this;
    }


    /**
     * <p>镜像id</p>
     * 等于 = entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdEq(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt; entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdNe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ne("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt; entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdGt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            gt("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;= entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdGe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ge("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt; entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            lt("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;= entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            le("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN  entity().getImageId() AND imageIdEnd
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("image_id",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdNotBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("image_id",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            like("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdNotLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            notLike("image_id",entity().getImageId());
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值'  entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLikeLeft(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeLeft("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%'  entity().getImageId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLikeRight(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeRight("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt;
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt;
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;=
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt;
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;=
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值'
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%'
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdLikeRight(String imageId){
        if(imageId!=null){
            likeRight("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_id",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_id",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_id",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",entity().getStatus());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdEq(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            eq("create_user_id",createUserId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdNe(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            ne("create_user_id",entity().getCreateUserId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdGt(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            gt("create_user_id",entity().getCreateUserId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdGe(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            ge("create_user_id",entity().getCreateUserId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLt(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            lt("create_user_id",entity().getCreateUserId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLe(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            le("create_user_id",entity().getCreateUserId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateUserId() AND createUserIdEnd
     * @param createUserIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdBetween(Long createUserIdEnd){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null && createUserIdEnd!=null){
            between("create_user_id",entity().getCreateUserId(),createUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateUserId() AND 值2
     * @param createUserIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdNotBetween(Long createUserIdEnd){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null && createUserIdEnd!=null){
            notBetween("create_user_id",entity().getCreateUserId(),createUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateUserId() AND 值2
     * @param createUserIdStart       值1
     * @param createUserIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdBetween(Long createUserIdStart,Long createUserIdEnd){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null && createUserIdEnd!=null){
            between("create_user_id",createUserIdStart,createUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateUserId() AND 值2
     * @param createUserIdStart       值1
     * @param createUserIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdNotBetween(Long createUserIdStart,Long createUserIdEnd){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null && createUserIdEnd!=null){
            notBetween("create_user_id",createUserIdStart,createUserIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLike(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            like("create_user_id",entity().getCreateUserId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdNotLike(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            notLike("create_user_id",entity().getCreateUserId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLikeLeft(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            likeLeft("create_user_id",entity().getCreateUserId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getCreateUserId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLikeRight(){
        Long createUserId =entity().getCreateUserId();
        if(createUserId!=null){
            likeRight("create_user_id",entity().getCreateUserId());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdEq(Long createUserId){
        if(createUserId!=null){
            eq("create_user_id",createUserId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdNe(Long createUserId){
        if(createUserId!=null){
            ne("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdGt(Long createUserId){
        if(createUserId!=null){
            gt("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdGe(Long createUserId){
        if(createUserId!=null){
            ge("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLt(Long createUserId){
        if(createUserId!=null){
            lt("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLe(Long createUserId){
        if(createUserId!=null){
            le("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLike(Long createUserId){
        if(createUserId!=null){
            like("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdNotLike(Long createUserId){
        if(createUserId!=null){
            notLike("create_user_id",createUserId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLikeLeft(Long createUserId){
        if(createUserId!=null){
            likeLeft("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdLikeRight(Long createUserId){
        if(createUserId!=null){
            likeRight("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdIsNull(){
        isNull("create_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdIsNotNull(){
        isNotNull("create_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("create_user_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdIn(Long... values){
        if(values!=null && values.length>0){
            in("create_user_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_user_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper createUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("create_user_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdEq(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            eq("last_update_id",lastUpdateId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdNe(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            ne("last_update_id",entity().getLastUpdateId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdGt(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            gt("last_update_id",entity().getLastUpdateId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdGe(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            ge("last_update_id",entity().getLastUpdateId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLt(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            lt("last_update_id",entity().getLastUpdateId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLe(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            le("last_update_id",entity().getLastUpdateId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateId() AND lastUpdateIdEnd
     * @param lastUpdateIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdBetween(Long lastUpdateIdEnd){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null && lastUpdateIdEnd!=null){
            between("last_update_id",entity().getLastUpdateId(),lastUpdateIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateId() AND 值2
     * @param lastUpdateIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdNotBetween(Long lastUpdateIdEnd){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null && lastUpdateIdEnd!=null){
            notBetween("last_update_id",entity().getLastUpdateId(),lastUpdateIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateId() AND 值2
     * @param lastUpdateIdStart       值1
     * @param lastUpdateIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdBetween(Long lastUpdateIdStart,Long lastUpdateIdEnd){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null && lastUpdateIdEnd!=null){
            between("last_update_id",lastUpdateIdStart,lastUpdateIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateId() AND 值2
     * @param lastUpdateIdStart       值1
     * @param lastUpdateIdEnd      值2
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdNotBetween(Long lastUpdateIdStart,Long lastUpdateIdEnd){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null && lastUpdateIdEnd!=null){
            notBetween("last_update_id",lastUpdateIdStart,lastUpdateIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLike(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            like("last_update_id",entity().getLastUpdateId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdNotLike(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            notLike("last_update_id",entity().getLastUpdateId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLikeLeft(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            likeLeft("last_update_id",entity().getLastUpdateId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getLastUpdateId()
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLikeRight(){
        Long lastUpdateId =entity().getLastUpdateId();
        if(lastUpdateId!=null){
            likeRight("last_update_id",entity().getLastUpdateId());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdEq(Long lastUpdateId){
        if(lastUpdateId!=null){
            eq("last_update_id",lastUpdateId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdNe(Long lastUpdateId){
        if(lastUpdateId!=null){
            ne("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdGt(Long lastUpdateId){
        if(lastUpdateId!=null){
            gt("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdGe(Long lastUpdateId){
        if(lastUpdateId!=null){
            ge("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLt(Long lastUpdateId){
        if(lastUpdateId!=null){
            lt("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLe(Long lastUpdateId){
        if(lastUpdateId!=null){
            le("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLike(Long lastUpdateId){
        if(lastUpdateId!=null){
            like("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdNotLike(Long lastUpdateId){
        if(lastUpdateId!=null){
            notLike("last_update_id",lastUpdateId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLikeLeft(Long lastUpdateId){
        if(lastUpdateId!=null){
            likeLeft("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdLikeRight(Long lastUpdateId){
        if(lastUpdateId!=null){
            likeRight("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdIsNull(){
        isNull("last_update_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdIsNotNull(){
        isNotNull("last_update_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdIn(Long... values){
        if(values!=null && values.length>0){
            in("last_update_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesQueryEntityWrapper lastUpdateIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("last_update_id",values);
        }
        return this;
    }



}
