package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.TencentImages;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 腾讯镜像管理
 * </p>
 * "tencent_images"
 * @author PC001
 */
public class TencentImagesQueryWrapper extends QueryWrapper<TencentImages> {


    public static TencentImagesQueryWrapper wrapper() {
        return new TencentImagesQueryWrapper();
    }

    public TencentImagesQueryWrapper() {
        super();
    }

    public TencentImagesQueryWrapper(TencentImages entity) {
        super(entity);
    }

    public TencentImagesQueryWrapper(TencentImages entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public TencentImagesQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public TencentImagesQueryWrapper selectColumns(Consumer<TencentImagesSelect> consumer) {
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
     * 等于 =
     * @param id       值
     * @return children
     */
    public TencentImagesQueryWrapper idEq(Long id){
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
    public TencentImagesQueryWrapper idNe(Long id){
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
    public TencentImagesQueryWrapper idGt(Long id){
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
    public TencentImagesQueryWrapper idGe(Long id){
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
    public TencentImagesQueryWrapper idLt(Long id){
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
    public TencentImagesQueryWrapper idLe(Long id){
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
    public TencentImagesQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentImagesQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentImagesQueryWrapper idLike(Long id){
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
    public TencentImagesQueryWrapper idNotLike(Long id){
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
    public TencentImagesQueryWrapper idLikeLeft(Long id){
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
    public TencentImagesQueryWrapper idLikeRight(Long id){
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
    public TencentImagesQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper idIn(Collection<Long> value){
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
    public TencentImagesQueryWrapper idIn(Long... values){
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
    public TencentImagesQueryWrapper idNotIn(Collection<Long> value){
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
    public TencentImagesQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * 等于 =
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryWrapper fkTencentAccountAreaIdEq(Long fkTencentAccountAreaId){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdNe(Long fkTencentAccountAreaId){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdGt(Long fkTencentAccountAreaId){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdGe(Long fkTencentAccountAreaId){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdLt(Long fkTencentAccountAreaId){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdLe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            le("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkTencentAccountAreaIdStart       值1
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
        if(fkTencentAccountAreaIdStart!=null && fkTencentAccountAreaIdEnd!=null){
            between("fk_tencent_account_area_id",fkTencentAccountAreaIdStart,fkTencentAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTencentAccountAreaIdStart       值1
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
        if(fkTencentAccountAreaIdStart!=null && fkTencentAccountAreaIdEnd!=null){
            notBetween("fk_tencent_account_area_id",fkTencentAccountAreaIdStart,fkTencentAccountAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值%'
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentImagesQueryWrapper fkTencentAccountAreaIdLike(Long fkTencentAccountAreaId){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdNotLike(Long fkTencentAccountAreaId){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdLikeLeft(Long fkTencentAccountAreaId){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdLikeRight(Long fkTencentAccountAreaId){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdIsNull(){
        isNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper fkTencentAccountAreaIdIsNotNull(){
        isNotNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper fkTencentAccountAreaIdIn(Collection<Long> value){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdIn(Long... values){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdNotIn(Collection<Long> value){
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
    public TencentImagesQueryWrapper fkTencentAccountAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 等于 =
     * @param region       值
     * @return children
     */
    public TencentImagesQueryWrapper regionEq(String region){
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
    public TencentImagesQueryWrapper regionNe(String region){
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
    public TencentImagesQueryWrapper regionGt(String region){
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
    public TencentImagesQueryWrapper regionGe(String region){
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
    public TencentImagesQueryWrapper regionLt(String region){
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
    public TencentImagesQueryWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper regionBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper regionNotBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentImagesQueryWrapper regionLike(String region){
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
    public TencentImagesQueryWrapper regionNotLike(String region){
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
    public TencentImagesQueryWrapper regionLikeLeft(String region){
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
    public TencentImagesQueryWrapper regionLikeRight(String region){
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
    public TencentImagesQueryWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper regionIn(Collection<String> value){
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
    public TencentImagesQueryWrapper regionIn(String... values){
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
    public TencentImagesQueryWrapper regionNotIn(Collection<String> value){
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
    public TencentImagesQueryWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 等于 =
     * @param title       值
     * @return children
     */
    public TencentImagesQueryWrapper titleEq(String title){
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
    public TencentImagesQueryWrapper titleNe(String title){
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
    public TencentImagesQueryWrapper titleGt(String title){
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
    public TencentImagesQueryWrapper titleGe(String title){
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
    public TencentImagesQueryWrapper titleLt(String title){
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
    public TencentImagesQueryWrapper titleLe(String title){
        if(title!=null){
            le("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * BETWEEN 值1 AND 值2
     * @param titleStart       值1
     * @param titleEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper titleBetween(String titleStart,String titleEnd){
        if(titleStart!=null && titleEnd!=null){
            between("title",titleStart,titleEnd);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param titleStart       值1
     * @param titleEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper titleNotBetween(String titleStart,String titleEnd){
        if(titleStart!=null && titleEnd!=null){
            notBetween("title",titleStart,titleEnd);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值%'
     * @param title       值
     * @return children
     */
    public TencentImagesQueryWrapper titleLike(String title){
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
    public TencentImagesQueryWrapper titleNotLike(String title){
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
    public TencentImagesQueryWrapper titleLikeLeft(String title){
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
    public TencentImagesQueryWrapper titleLikeRight(String title){
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
    public TencentImagesQueryWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper titleIn(Collection<String> value){
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
    public TencentImagesQueryWrapper titleIn(String... values){
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
    public TencentImagesQueryWrapper titleNotIn(Collection<String> value){
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
    public TencentImagesQueryWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 等于 =
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryWrapper versionCodeEq(String versionCode){
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
    public TencentImagesQueryWrapper versionCodeNe(String versionCode){
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
    public TencentImagesQueryWrapper versionCodeGt(String versionCode){
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
    public TencentImagesQueryWrapper versionCodeGe(String versionCode){
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
    public TencentImagesQueryWrapper versionCodeLt(String versionCode){
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
    public TencentImagesQueryWrapper versionCodeLe(String versionCode){
        if(versionCode!=null){
            le("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * BETWEEN 值1 AND 值2
     * @param versionCodeStart       值1
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
        if(versionCodeStart!=null && versionCodeEnd!=null){
            between("version_code",versionCodeStart,versionCodeEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionCodeStart       值1
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
        if(versionCodeStart!=null && versionCodeEnd!=null){
            notBetween("version_code",versionCodeStart,versionCodeEnd);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值%'
     * @param versionCode       值
     * @return children
     */
    public TencentImagesQueryWrapper versionCodeLike(String versionCode){
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
    public TencentImagesQueryWrapper versionCodeNotLike(String versionCode){
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
    public TencentImagesQueryWrapper versionCodeLikeLeft(String versionCode){
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
    public TencentImagesQueryWrapper versionCodeLikeRight(String versionCode){
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
    public TencentImagesQueryWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper versionCodeIn(Collection<String> value){
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
    public TencentImagesQueryWrapper versionCodeIn(String... values){
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
    public TencentImagesQueryWrapper versionCodeNotIn(Collection<String> value){
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
    public TencentImagesQueryWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * 等于 =
     * @param url       值
     * @return children
     */
    public TencentImagesQueryWrapper urlEq(String url){
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
    public TencentImagesQueryWrapper urlNe(String url){
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
    public TencentImagesQueryWrapper urlGt(String url){
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
    public TencentImagesQueryWrapper urlGe(String url){
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
    public TencentImagesQueryWrapper urlLt(String url){
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
    public TencentImagesQueryWrapper urlLe(String url){
        if(url!=null){
            le("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * BETWEEN 值1 AND 值2
     * @param urlStart       值1
     * @param urlEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper urlBetween(String urlStart,String urlEnd){
        if(urlStart!=null && urlEnd!=null){
            between("url",urlStart,urlEnd);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param urlStart       值1
     * @param urlEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper urlNotBetween(String urlStart,String urlEnd){
        if(urlStart!=null && urlEnd!=null){
            notBetween("url",urlStart,urlEnd);
        }
        return this;
     }


    /**
     * <p>镜像下载地址</p>
     * LIKE '%值%'
     * @param url       值
     * @return children
     */
    public TencentImagesQueryWrapper urlLike(String url){
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
    public TencentImagesQueryWrapper urlNotLike(String url){
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
    public TencentImagesQueryWrapper urlLikeLeft(String url){
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
    public TencentImagesQueryWrapper urlLikeRight(String url){
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
    public TencentImagesQueryWrapper urlIsNull(){
        isNull("url");
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper urlIsNotNull(){
        isNotNull("url");
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper urlIn(Collection<String> value){
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
    public TencentImagesQueryWrapper urlIn(String... values){
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
    public TencentImagesQueryWrapper urlNotIn(Collection<String> value){
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
    public TencentImagesQueryWrapper urlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("url",values);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 等于 =
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryWrapper md5Eq(String md5){
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
    public TencentImagesQueryWrapper md5Ne(String md5){
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
    public TencentImagesQueryWrapper md5Gt(String md5){
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
    public TencentImagesQueryWrapper md5Ge(String md5){
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
    public TencentImagesQueryWrapper md5Lt(String md5){
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
    public TencentImagesQueryWrapper md5Le(String md5){
        if(md5!=null){
            le("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * BETWEEN 值1 AND 值2
     * @param md5Start       值1
     * @param md5End      值2
     * @return children
     */
    public TencentImagesQueryWrapper md5Between(String md5Start,String md5End){
        if(md5Start!=null && md5End!=null){
            between("md5",md5Start,md5End);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT BETWEEN 值1 AND 值2
     * @param md5Start       值1
     * @param md5End      值2
     * @return children
     */
    public TencentImagesQueryWrapper md5NotBetween(String md5Start,String md5End){
        if(md5Start!=null && md5End!=null){
            notBetween("md5",md5Start,md5End);
        }
        return this;
     }


    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '%值%'
     * @param md5       值
     * @return children
     */
    public TencentImagesQueryWrapper md5Like(String md5){
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
    public TencentImagesQueryWrapper md5NotLike(String md5){
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
    public TencentImagesQueryWrapper md5LikeLeft(String md5){
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
    public TencentImagesQueryWrapper md5LikeRight(String md5){
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
    public TencentImagesQueryWrapper md5IsNull(){
        isNull("md5");
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper md5IsNotNull(){
        isNotNull("md5");
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper md5In(Collection<String> value){
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
    public TencentImagesQueryWrapper md5In(String... values){
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
    public TencentImagesQueryWrapper md5NotIn(Collection<String> value){
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
    public TencentImagesQueryWrapper md5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("md5",values);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * 等于 =
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryWrapper imageDescriptionEq(String imageDescription){
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
    public TencentImagesQueryWrapper imageDescriptionNe(String imageDescription){
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
    public TencentImagesQueryWrapper imageDescriptionGt(String imageDescription){
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
    public TencentImagesQueryWrapper imageDescriptionGe(String imageDescription){
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
    public TencentImagesQueryWrapper imageDescriptionLt(String imageDescription){
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
    public TencentImagesQueryWrapper imageDescriptionLe(String imageDescription){
        if(imageDescription!=null){
            le("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * BETWEEN 值1 AND 值2
     * @param imageDescriptionStart       值1
     * @param imageDescriptionEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper imageDescriptionBetween(String imageDescriptionStart,String imageDescriptionEnd){
        if(imageDescriptionStart!=null && imageDescriptionEnd!=null){
            between("image_description",imageDescriptionStart,imageDescriptionEnd);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageDescriptionStart       值1
     * @param imageDescriptionEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper imageDescriptionNotBetween(String imageDescriptionStart,String imageDescriptionEnd){
        if(imageDescriptionStart!=null && imageDescriptionEnd!=null){
            notBetween("image_description",imageDescriptionStart,imageDescriptionEnd);
        }
        return this;
     }


    /**
     * <p>镜像描述</p>
     * LIKE '%值%'
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesQueryWrapper imageDescriptionLike(String imageDescription){
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
    public TencentImagesQueryWrapper imageDescriptionNotLike(String imageDescription){
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
    public TencentImagesQueryWrapper imageDescriptionLikeLeft(String imageDescription){
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
    public TencentImagesQueryWrapper imageDescriptionLikeRight(String imageDescription){
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
    public TencentImagesQueryWrapper imageDescriptionIsNull(){
        isNull("image_description");
        return this;
    }

    /**
     * <p>镜像描述</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper imageDescriptionIsNotNull(){
        isNotNull("image_description");
        return this;
    }

    /**
     * <p>镜像描述</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper imageDescriptionIn(Collection<String> value){
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
    public TencentImagesQueryWrapper imageDescriptionIn(String... values){
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
    public TencentImagesQueryWrapper imageDescriptionNotIn(Collection<String> value){
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
    public TencentImagesQueryWrapper imageDescriptionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_description",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryWrapper imageIdEq(String imageId){
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
    public TencentImagesQueryWrapper imageIdNe(String imageId){
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
    public TencentImagesQueryWrapper imageIdGt(String imageId){
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
    public TencentImagesQueryWrapper imageIdGe(String imageId){
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
    public TencentImagesQueryWrapper imageIdLt(String imageId){
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
    public TencentImagesQueryWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public TencentImagesQueryWrapper imageIdLike(String imageId){
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
    public TencentImagesQueryWrapper imageIdNotLike(String imageId){
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
    public TencentImagesQueryWrapper imageIdLikeLeft(String imageId){
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
    public TencentImagesQueryWrapper imageIdLikeRight(String imageId){
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
    public TencentImagesQueryWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper imageIdIn(Collection<String> value){
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
    public TencentImagesQueryWrapper imageIdIn(String... values){
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
    public TencentImagesQueryWrapper imageIdNotIn(Collection<String> value){
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
    public TencentImagesQueryWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public TencentImagesQueryWrapper statusEq(Integer status){
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
    public TencentImagesQueryWrapper statusNe(Integer status){
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
    public TencentImagesQueryWrapper statusGt(Integer status){
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
    public TencentImagesQueryWrapper statusGe(Integer status){
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
    public TencentImagesQueryWrapper statusLt(Integer status){
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
    public TencentImagesQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public TencentImagesQueryWrapper statusLike(Integer status){
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
    public TencentImagesQueryWrapper statusNotLike(Integer status){
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
    public TencentImagesQueryWrapper statusLikeLeft(Integer status){
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
    public TencentImagesQueryWrapper statusLikeRight(Integer status){
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
    public TencentImagesQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper statusIn(Collection<Integer> value){
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
    public TencentImagesQueryWrapper statusIn(Integer... values){
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
    public TencentImagesQueryWrapper statusNotIn(Collection<Integer> value){
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
    public TencentImagesQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryWrapper createTimeEq(Date createTime){
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
    public TencentImagesQueryWrapper createTimeNe(Date createTime){
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
    public TencentImagesQueryWrapper createTimeGt(Date createTime){
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
    public TencentImagesQueryWrapper createTimeGe(Date createTime){
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
    public TencentImagesQueryWrapper createTimeLt(Date createTime){
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
    public TencentImagesQueryWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public TencentImagesQueryWrapper createTimeLike(Date createTime){
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
    public TencentImagesQueryWrapper createTimeNotLike(Date createTime){
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
    public TencentImagesQueryWrapper createTimeLikeLeft(Date createTime){
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
    public TencentImagesQueryWrapper createTimeLikeRight(Date createTime){
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
    public TencentImagesQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper createTimeIn(Collection<Date> value){
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
    public TencentImagesQueryWrapper createTimeIn(Date... values){
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
    public TencentImagesQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentImagesQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentImagesQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentImagesQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentImagesQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentImagesQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentImagesQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentImagesQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentImagesQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentImagesQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentImagesQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentImagesQueryWrapper lastUpdateTimeIn(Date... values){
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
    public TencentImagesQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentImagesQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryWrapper createUserIdEq(Long createUserId){
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
    public TencentImagesQueryWrapper createUserIdNe(Long createUserId){
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
    public TencentImagesQueryWrapper createUserIdGt(Long createUserId){
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
    public TencentImagesQueryWrapper createUserIdGe(Long createUserId){
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
    public TencentImagesQueryWrapper createUserIdLt(Long createUserId){
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
    public TencentImagesQueryWrapper createUserIdLe(Long createUserId){
        if(createUserId!=null){
            le("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createUserIdStart       值1
     * @param createUserIdEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper createUserIdBetween(Long createUserIdStart,Long createUserIdEnd){
        if(createUserIdStart!=null && createUserIdEnd!=null){
            between("create_user_id",createUserIdStart,createUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createUserIdStart       值1
     * @param createUserIdEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper createUserIdNotBetween(Long createUserIdStart,Long createUserIdEnd){
        if(createUserIdStart!=null && createUserIdEnd!=null){
            notBetween("create_user_id",createUserIdStart,createUserIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param createUserId       值
     * @return children
     */
    public TencentImagesQueryWrapper createUserIdLike(Long createUserId){
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
    public TencentImagesQueryWrapper createUserIdNotLike(Long createUserId){
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
    public TencentImagesQueryWrapper createUserIdLikeLeft(Long createUserId){
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
    public TencentImagesQueryWrapper createUserIdLikeRight(Long createUserId){
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
    public TencentImagesQueryWrapper createUserIdIsNull(){
        isNull("create_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper createUserIdIsNotNull(){
        isNotNull("create_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper createUserIdIn(Collection<Long> value){
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
    public TencentImagesQueryWrapper createUserIdIn(Long... values){
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
    public TencentImagesQueryWrapper createUserIdNotIn(Collection<Long> value){
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
    public TencentImagesQueryWrapper createUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("create_user_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateIdEq(Long lastUpdateId){
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
    public TencentImagesQueryWrapper lastUpdateIdNe(Long lastUpdateId){
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
    public TencentImagesQueryWrapper lastUpdateIdGt(Long lastUpdateId){
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
    public TencentImagesQueryWrapper lastUpdateIdGe(Long lastUpdateId){
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
    public TencentImagesQueryWrapper lastUpdateIdLt(Long lastUpdateId){
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
    public TencentImagesQueryWrapper lastUpdateIdLe(Long lastUpdateId){
        if(lastUpdateId!=null){
            le("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateIdStart       值1
     * @param lastUpdateIdEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateIdBetween(Long lastUpdateIdStart,Long lastUpdateIdEnd){
        if(lastUpdateIdStart!=null && lastUpdateIdEnd!=null){
            between("last_update_id",lastUpdateIdStart,lastUpdateIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateIdStart       值1
     * @param lastUpdateIdEnd      值2
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateIdNotBetween(Long lastUpdateIdStart,Long lastUpdateIdEnd){
        if(lastUpdateIdStart!=null && lastUpdateIdEnd!=null){
            notBetween("last_update_id",lastUpdateIdStart,lastUpdateIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateIdLike(Long lastUpdateId){
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
    public TencentImagesQueryWrapper lastUpdateIdNotLike(Long lastUpdateId){
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
    public TencentImagesQueryWrapper lastUpdateIdLikeLeft(Long lastUpdateId){
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
    public TencentImagesQueryWrapper lastUpdateIdLikeRight(Long lastUpdateId){
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
    public TencentImagesQueryWrapper lastUpdateIdIsNull(){
        isNull("last_update_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateIdIsNotNull(){
        isNotNull("last_update_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesQueryWrapper lastUpdateIdIn(Collection<Long> value){
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
    public TencentImagesQueryWrapper lastUpdateIdIn(Long... values){
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
    public TencentImagesQueryWrapper lastUpdateIdNotIn(Collection<Long> value){
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
    public TencentImagesQueryWrapper lastUpdateIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("last_update_id",values);
        }
        return this;
    }


}
