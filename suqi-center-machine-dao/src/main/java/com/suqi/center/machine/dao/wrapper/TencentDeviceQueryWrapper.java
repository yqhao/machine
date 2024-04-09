package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentDevice;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 腾讯设备表
 * </p>
 * "tencent_device"
 * @author PC001
 * @since 2023-06-14
 */
public class TencentDeviceQueryWrapper extends QueryWrapper<TencentDevice> {


    public static TencentDeviceQueryWrapper wrapper() {
        return new TencentDeviceQueryWrapper();
    }

    public TencentDeviceQueryWrapper() {
        super();
    }

    public TencentDeviceQueryWrapper(TencentDevice entity) {
        super(entity);
    }

    public TencentDeviceQueryWrapper(TencentDevice entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public TencentDeviceQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }



    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public TencentDeviceQueryWrapper idEq(Long id){
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
    public TencentDeviceQueryWrapper idNe(Long id){
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
    public TencentDeviceQueryWrapper idGt(Long id){
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
    public TencentDeviceQueryWrapper idGe(Long id){
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
    public TencentDeviceQueryWrapper idLt(Long id){
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
    public TencentDeviceQueryWrapper idLe(Long id){
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
    public TencentDeviceQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentDeviceQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentDeviceQueryWrapper idLike(Long id){
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
    public TencentDeviceQueryWrapper idNotLike(Long id){
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
    public TencentDeviceQueryWrapper idLikeLeft(Long id){
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
    public TencentDeviceQueryWrapper idLikeRight(Long id){
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
    public TencentDeviceQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper idIn(Collection<Long> value){
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
    public TencentDeviceQueryWrapper idIn(Long... values){
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
    public TencentDeviceQueryWrapper idNotIn(Collection<Long> value){
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
    public TencentDeviceQueryWrapper idNotIn(Long... values){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdEq(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdNe(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdGt(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdGe(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdLt(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdLe(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdLike(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdNotLike(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdLikeLeft(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdLikeRight(Long fkTencentAccountAreaId){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdIsNull(){
        isNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdIsNotNull(){
        isNotNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdIn(Collection<Long> value){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdIn(Long... values){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdNotIn(Collection<Long> value){
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
    public TencentDeviceQueryWrapper fkTencentAccountAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例 ID</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例 ID</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * 等于 =
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * 不等于 &lt;&gt;
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 大于 &gt;
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 大于等于 &gt;=
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 小于 &lt;
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 小于等于 &lt;=
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper regionBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * NOT BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper regionNotBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>实例所在区域</p>
     * LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * NOT LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
     }


    /**
     * <p>实例所在区域</p>
     * LIKE '%值'
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * LIKE '值%'
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryWrapper regionLikeRight(String region){
        if(region!=null){
            likeRight("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper regionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("region",value);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper regionIn(String... values){
        if(values!=null && values.length>0){
            in("region",values);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper regionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("region",value);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * 不等于 &lt;&gt;
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 大于 &gt;
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 大于等于 &gt;=
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 小于 &lt;
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 小于等于 &lt;=
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值'
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '值%'
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdLikeRight(String imageId){
        if(imageId!=null){
            likeRight("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_id",value);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_id",values);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_id",value);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * 等于 =
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeEq(String instanceType){
        if(instanceType!=null){
            eq("instance_type",instanceType);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * 不等于 &lt;&gt;
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeNe(String instanceType){
        if(instanceType!=null){
            ne("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 大于 &gt;
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeGt(String instanceType){
        if(instanceType!=null){
            gt("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 大于等于 &gt;=
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeGe(String instanceType){
        if(instanceType!=null){
            ge("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 小于 &lt;
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeLt(String instanceType){
        if(instanceType!=null){
            lt("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 小于等于 &lt;=
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeLe(String instanceType){
        if(instanceType!=null){
            le("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * BETWEEN 值1 AND 值2
     * @param instanceTypeStart       值1
     * @param instanceTypeEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeBetween(String instanceTypeStart,String instanceTypeEnd){
        if(instanceTypeStart!=null && instanceTypeEnd!=null){
            between("instance_type",instanceTypeStart,instanceTypeEnd);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceTypeStart       值1
     * @param instanceTypeEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeNotBetween(String instanceTypeStart,String instanceTypeEnd){
        if(instanceTypeStart!=null && instanceTypeEnd!=null){
            notBetween("instance_type",instanceTypeStart,instanceTypeEnd);
        }
        return this;
     }


    /**
     * <p>实例类型</p>
     * LIKE '%值%'
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeLike(String instanceType){
        if(instanceType!=null){
            like("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * NOT LIKE '%值%'
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeNotLike(String instanceType){
        if(instanceType!=null){
            notLike("instance_type",instanceType);
        }
        return this;
     }


    /**
     * <p>实例类型</p>
     * LIKE '%值'
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeLikeLeft(String instanceType){
        if(instanceType!=null){
            likeLeft("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * LIKE '值%'
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeLikeRight(String instanceType){
        if(instanceType!=null){
            likeRight("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeIsNull(){
        isNull("instance_type");
        return this;
    }

    /**
     * <p>实例类型</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeIsNotNull(){
        isNotNull("instance_type");
        return this;
    }

    /**
     * <p>实例类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_type",value);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeIn(String... values){
        if(values!=null && values.length>0){
            in("instance_type",values);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_type",value);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper instanceTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_type",values);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * 等于 =
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipEq(String ip){
        if(ip!=null){
            eq("ip",ip);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * 不等于 &lt;&gt;
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipNe(String ip){
        if(ip!=null){
            ne("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 大于 &gt;
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipGt(String ip){
        if(ip!=null){
            gt("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 大于等于 &gt;=
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipGe(String ip){
        if(ip!=null){
            ge("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 小于 &lt;
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipLt(String ip){
        if(ip!=null){
            lt("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 小于等于 &lt;=
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipLe(String ip){
        if(ip!=null){
            le("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * BETWEEN 值1 AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper ipBetween(String ipStart,String ipEnd){
        if(ipStart!=null && ipEnd!=null){
            between("ip",ipStart,ipEnd);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * NOT BETWEEN 值1 AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper ipNotBetween(String ipStart,String ipEnd){
        if(ipStart!=null && ipEnd!=null){
            notBetween("ip",ipStart,ipEnd);
        }
        return this;
     }


    /**
     * <p>实例内网 IP</p>
     * LIKE '%值%'
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipLike(String ip){
        if(ip!=null){
            like("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * NOT LIKE '%值%'
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipNotLike(String ip){
        if(ip!=null){
            notLike("ip",ip);
        }
        return this;
     }


    /**
     * <p>实例内网 IP</p>
     * LIKE '%值'
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipLikeLeft(String ip){
        if(ip!=null){
            likeLeft("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * LIKE '值%'
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryWrapper ipLikeRight(String ip){
        if(ip!=null){
            likeRight("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper ipIsNull(){
        isNull("ip");
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper ipIsNotNull(){
        isNotNull("ip");
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper ipIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("ip",value);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper ipIn(String... values){
        if(values!=null && values.length>0){
            in("ip",values);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper ipNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("ip",value);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper ipNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ip",values);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 等于 =
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberEq(String hostSerialNumber){
        if(hostSerialNumber!=null){
            eq("host_serial_number",hostSerialNumber);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 不等于 &lt;&gt;
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberNe(String hostSerialNumber){
        if(hostSerialNumber!=null){
            ne("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 大于 &gt;
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberGt(String hostSerialNumber){
        if(hostSerialNumber!=null){
            gt("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 大于等于 &gt;=
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberGe(String hostSerialNumber){
        if(hostSerialNumber!=null){
            ge("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 小于 &lt;
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberLt(String hostSerialNumber){
        if(hostSerialNumber!=null){
            lt("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 小于等于 &lt;=
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberLe(String hostSerialNumber){
        if(hostSerialNumber!=null){
            le("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * BETWEEN 值1 AND 值2
     * @param hostSerialNumberStart       值1
     * @param hostSerialNumberEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberBetween(String hostSerialNumberStart,String hostSerialNumberEnd){
        if(hostSerialNumberStart!=null && hostSerialNumberEnd!=null){
            between("host_serial_number",hostSerialNumberStart,hostSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param hostSerialNumberStart       值1
     * @param hostSerialNumberEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberNotBetween(String hostSerialNumberStart,String hostSerialNumberEnd){
        if(hostSerialNumberStart!=null && hostSerialNumberEnd!=null){
            notBetween("host_serial_number",hostSerialNumberStart,hostSerialNumberEnd);
        }
        return this;
     }


    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值%'
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberLike(String hostSerialNumber){
        if(hostSerialNumber!=null){
            like("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT LIKE '%值%'
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberNotLike(String hostSerialNumber){
        if(hostSerialNumber!=null){
            notLike("host_serial_number",hostSerialNumber);
        }
        return this;
     }


    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值'
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberLikeLeft(String hostSerialNumber){
        if(hostSerialNumber!=null){
            likeLeft("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '值%'
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberLikeRight(String hostSerialNumber){
        if(hostSerialNumber!=null){
            likeRight("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberIsNull(){
        isNull("host_serial_number");
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberIsNotNull(){
        isNotNull("host_serial_number");
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("host_serial_number",value);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberIn(String... values){
        if(values!=null && values.length>0){
            in("host_serial_number",values);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("host_serial_number",value);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper hostSerialNumberNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("host_serial_number",values);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * 等于 =
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringEq(String debugPropertiesString){
        if(debugPropertiesString!=null){
            eq("debug_properties_string",debugPropertiesString);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * 不等于 &lt;&gt;
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringNe(String debugPropertiesString){
        if(debugPropertiesString!=null){
            ne("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 大于 &gt;
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringGt(String debugPropertiesString){
        if(debugPropertiesString!=null){
            gt("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 大于等于 &gt;=
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringGe(String debugPropertiesString){
        if(debugPropertiesString!=null){
            ge("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 小于 &lt;
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringLt(String debugPropertiesString){
        if(debugPropertiesString!=null){
            lt("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 小于等于 &lt;=
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringLe(String debugPropertiesString){
        if(debugPropertiesString!=null){
            le("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * BETWEEN 值1 AND 值2
     * @param debugPropertiesStringStart       值1
     * @param debugPropertiesStringEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringBetween(String debugPropertiesStringStart,String debugPropertiesStringEnd){
        if(debugPropertiesStringStart!=null && debugPropertiesStringEnd!=null){
            between("debug_properties_string",debugPropertiesStringStart,debugPropertiesStringEnd);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * NOT BETWEEN 值1 AND 值2
     * @param debugPropertiesStringStart       值1
     * @param debugPropertiesStringEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringNotBetween(String debugPropertiesStringStart,String debugPropertiesStringEnd){
        if(debugPropertiesStringStart!=null && debugPropertiesStringEnd!=null){
            notBetween("debug_properties_string",debugPropertiesStringStart,debugPropertiesStringEnd);
        }
        return this;
     }


    /**
     * <p>实例特殊配置</p>
     * LIKE '%值%'
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringLike(String debugPropertiesString){
        if(debugPropertiesString!=null){
            like("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * NOT LIKE '%值%'
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringNotLike(String debugPropertiesString){
        if(debugPropertiesString!=null){
            notLike("debug_properties_string",debugPropertiesString);
        }
        return this;
     }


    /**
     * <p>实例特殊配置</p>
     * LIKE '%值'
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringLikeLeft(String debugPropertiesString){
        if(debugPropertiesString!=null){
            likeLeft("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * LIKE '值%'
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringLikeRight(String debugPropertiesString){
        if(debugPropertiesString!=null){
            likeRight("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringIsNull(){
        isNull("debug_properties_string");
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringIsNotNull(){
        isNotNull("debug_properties_string");
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("debug_properties_string",value);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringIn(String... values){
        if(values!=null && values.length>0){
            in("debug_properties_string",values);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("debug_properties_string",value);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper debugPropertiesStringNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("debug_properties_string",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper createTimeEq(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeNe(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeGt(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeGe(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeLt(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeLe(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentDeviceQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentDeviceQueryWrapper createTimeLike(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeNotLike(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeLikeLeft(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeLikeRight(Date createTime){
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
    public TencentDeviceQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper createTimeIn(Collection<Date> value){
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
    public TencentDeviceQueryWrapper createTimeIn(Date... values){
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
    public TencentDeviceQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentDeviceQueryWrapper createTimeNotIn(Date... values){
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
    public TencentDeviceQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentDeviceQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentDeviceQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentDeviceQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentDeviceQueryWrapper lastUpdateTimeIn(Date... values){
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
    public TencentDeviceQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentDeviceQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 等于 =
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeEq(Date lastResetTime){
        if(lastResetTime!=null){
            eq("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 不等于 &lt;&gt;
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeNe(Date lastResetTime){
        if(lastResetTime!=null){
            ne("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于 &gt;
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeGt(Date lastResetTime){
        if(lastResetTime!=null){
            gt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于等于 &gt;=
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeGe(Date lastResetTime){
        if(lastResetTime!=null){
            ge("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于 &lt;
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeLt(Date lastResetTime){
        if(lastResetTime!=null){
            lt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于等于 &lt;=
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeLe(Date lastResetTime){
        if(lastResetTime!=null){
            le("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        if(lastResetTimeStart!=null && lastResetTimeEnd!=null){
            between("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeNotBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        if(lastResetTimeStart!=null && lastResetTimeEnd!=null){
            notBetween("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值%'
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeLike(Date lastResetTime){
        if(lastResetTime!=null){
            like("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT LIKE '%值%'
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeNotLike(Date lastResetTime){
        if(lastResetTime!=null){
            notLike("last_reset_time",lastResetTime);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值'
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeLikeLeft(Date lastResetTime){
        if(lastResetTime!=null){
            likeLeft("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '值%'
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeLikeRight(Date lastResetTime){
        if(lastResetTime!=null){
            likeRight("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeIsNull(){
        isNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeIsNotNull(){
        isNotNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_reset_time",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_reset_time",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_reset_time",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper lastResetTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_reset_time",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * 等于 =
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdEq(String lastTaskId){
        if(lastTaskId!=null){
            eq("last_task_id",lastTaskId);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * 不等于 &lt;&gt;
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdNe(String lastTaskId){
        if(lastTaskId!=null){
            ne("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 大于 &gt;
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdGt(String lastTaskId){
        if(lastTaskId!=null){
            gt("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 大于等于 &gt;=
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdGe(String lastTaskId){
        if(lastTaskId!=null){
            ge("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 小于 &lt;
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdLt(String lastTaskId){
        if(lastTaskId!=null){
            lt("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 小于等于 &lt;=
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdLe(String lastTaskId){
        if(lastTaskId!=null){
            le("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * BETWEEN 值1 AND 值2
     * @param lastTaskIdStart       值1
     * @param lastTaskIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdBetween(String lastTaskIdStart,String lastTaskIdEnd){
        if(lastTaskIdStart!=null && lastTaskIdEnd!=null){
            between("last_task_id",lastTaskIdStart,lastTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastTaskIdStart       值1
     * @param lastTaskIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdNotBetween(String lastTaskIdStart,String lastTaskIdEnd){
        if(lastTaskIdStart!=null && lastTaskIdEnd!=null){
            notBetween("last_task_id",lastTaskIdStart,lastTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值%'
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdLike(String lastTaskId){
        if(lastTaskId!=null){
            like("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT LIKE '%值%'
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdNotLike(String lastTaskId){
        if(lastTaskId!=null){
            notLike("last_task_id",lastTaskId);
        }
        return this;
     }


    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值'
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdLikeLeft(String lastTaskId){
        if(lastTaskId!=null){
            likeLeft("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '值%'
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdLikeRight(String lastTaskId){
        if(lastTaskId!=null){
            likeRight("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdIsNull(){
        isNull("last_task_id");
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdIsNotNull(){
        isNotNull("last_task_id");
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("last_task_id",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdIn(String... values){
        if(values!=null && values.length>0){
            in("last_task_id",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_task_id",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper lastTaskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("last_task_id",values);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 等于 =
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdEq(String resetImageId){
        if(resetImageId!=null){
            eq("reset_image_id",resetImageId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 不等于 &lt;&gt;
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdNe(String resetImageId){
        if(resetImageId!=null){
            ne("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 大于 &gt;
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdGt(String resetImageId){
        if(resetImageId!=null){
            gt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 大于等于 &gt;=
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdGe(String resetImageId){
        if(resetImageId!=null){
            ge("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 小于 &lt;
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdLt(String resetImageId){
        if(resetImageId!=null){
            lt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 小于等于 &lt;=
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdLe(String resetImageId){
        if(resetImageId!=null){
            le("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * BETWEEN 值1 AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdBetween(String resetImageIdStart,String resetImageIdEnd){
        if(resetImageIdStart!=null && resetImageIdEnd!=null){
            between("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdNotBetween(String resetImageIdStart,String resetImageIdEnd){
        if(resetImageIdStart!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdLike(String resetImageId){
        if(resetImageId!=null){
            like("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT LIKE '%值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdNotLike(String resetImageId){
        if(resetImageId!=null){
            notLike("reset_image_id",resetImageId);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值'
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdLikeLeft(String resetImageId){
        if(resetImageId!=null){
            likeLeft("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdLikeRight(String resetImageId){
        if(resetImageId!=null){
            likeRight("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdIsNull(){
        isNull("reset_image_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdIsNotNull(){
        isNotNull("reset_image_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_image_id",value);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdIn(String... values){
        if(values!=null && values.length>0){
            in("reset_image_id",values);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_image_id",value);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper resetImageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_id",values);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }



}
