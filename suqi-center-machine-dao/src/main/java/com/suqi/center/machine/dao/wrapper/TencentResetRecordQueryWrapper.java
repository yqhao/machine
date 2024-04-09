package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.TencentResetRecord;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 腾讯云机重置记录
 * </p>
 * "tencent_reset_record"
 * @author PC001
 */
public class TencentResetRecordQueryWrapper extends QueryWrapper<TencentResetRecord> {


    public static TencentResetRecordQueryWrapper wrapper() {
        return new TencentResetRecordQueryWrapper();
    }

    public TencentResetRecordQueryWrapper() {
        super();
    }

    public TencentResetRecordQueryWrapper(TencentResetRecord entity) {
        super(entity);
    }

    public TencentResetRecordQueryWrapper(TencentResetRecord entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public TencentResetRecordQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public TencentResetRecordQueryWrapper selectColumns(Consumer<TencentResetRecordSelect> consumer) {
        TencentResetRecordSelect select = new TencentResetRecordSelect();
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
    public TencentResetRecordQueryWrapper idEq(Long id){
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
    public TencentResetRecordQueryWrapper idNe(Long id){
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
    public TencentResetRecordQueryWrapper idGt(Long id){
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
    public TencentResetRecordQueryWrapper idGe(Long id){
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
    public TencentResetRecordQueryWrapper idLt(Long id){
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
    public TencentResetRecordQueryWrapper idLe(Long id){
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
    public TencentResetRecordQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentResetRecordQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentResetRecordQueryWrapper idLike(Long id){
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
    public TencentResetRecordQueryWrapper idNotLike(Long id){
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
    public TencentResetRecordQueryWrapper idLikeLeft(Long id){
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
    public TencentResetRecordQueryWrapper idLikeRight(Long id){
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
    public TencentResetRecordQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper idIn(Collection<Long> value){
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
    public TencentResetRecordQueryWrapper idIn(Long... values){
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
    public TencentResetRecordQueryWrapper idNotIn(Collection<Long> value){
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
    public TencentResetRecordQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdEq(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            eq("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdNe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ne("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdGt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            gt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdGe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ge("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdLt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            lt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdLe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        if(fkTencentDeviceIdStart!=null && fkTencentDeviceIdEnd!=null){
            between("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        if(fkTencentDeviceIdStart!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdNotLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdLikeLeft(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdLikeRight(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeRight("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdIsNull(){
        isNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdIsNotNull(){
        isNotNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_device_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云机id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>腾讯云机id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdEq(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            eq("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdNe(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            ne("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdGt(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            gt("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdGe(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            ge("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdLt(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            lt("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdLe(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            le("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkTencentImagesIdStart       值1
     * @param fkTencentImagesIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdBetween(Long fkTencentImagesIdStart,Long fkTencentImagesIdEnd){
        if(fkTencentImagesIdStart!=null && fkTencentImagesIdEnd!=null){
            between("fk_tencent_images_id",fkTencentImagesIdStart,fkTencentImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTencentImagesIdStart       值1
     * @param fkTencentImagesIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdNotBetween(Long fkTencentImagesIdStart,Long fkTencentImagesIdEnd){
        if(fkTencentImagesIdStart!=null && fkTencentImagesIdEnd!=null){
            notBetween("fk_tencent_images_id",fkTencentImagesIdStart,fkTencentImagesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdLike(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            like("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdNotLike(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            notLike("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdLikeLeft(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            likeLeft("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdLikeRight(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            likeRight("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdIsNull(){
        isNull("fk_tencent_images_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdIsNotNull(){
        isNotNull("fk_tencent_images_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_images_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_images_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_images_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper fkTencentImagesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_images_id",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 等于 =
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryWrapper versionCodeEq(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeNe(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeGt(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeGe(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeLt(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeLe(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public TencentResetRecordQueryWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
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
    public TencentResetRecordQueryWrapper versionCodeLike(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeNotLike(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeLikeLeft(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeLikeRight(String versionCode){
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
    public TencentResetRecordQueryWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper versionCodeIn(Collection<String> value){
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
    public TencentResetRecordQueryWrapper versionCodeIn(String... values){
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
    public TencentResetRecordQueryWrapper versionCodeNotIn(Collection<String> value){
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
    public TencentResetRecordQueryWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 等于 =
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryWrapper titleEq(String title){
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
    public TencentResetRecordQueryWrapper titleNe(String title){
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
    public TencentResetRecordQueryWrapper titleGt(String title){
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
    public TencentResetRecordQueryWrapper titleGe(String title){
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
    public TencentResetRecordQueryWrapper titleLt(String title){
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
    public TencentResetRecordQueryWrapper titleLe(String title){
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
    public TencentResetRecordQueryWrapper titleBetween(String titleStart,String titleEnd){
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
    public TencentResetRecordQueryWrapper titleNotBetween(String titleStart,String titleEnd){
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
    public TencentResetRecordQueryWrapper titleLike(String title){
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
    public TencentResetRecordQueryWrapper titleNotLike(String title){
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
    public TencentResetRecordQueryWrapper titleLikeLeft(String title){
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
    public TencentResetRecordQueryWrapper titleLikeRight(String title){
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
    public TencentResetRecordQueryWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper titleIn(Collection<String> value){
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
    public TencentResetRecordQueryWrapper titleIn(String... values){
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
    public TencentResetRecordQueryWrapper titleNotIn(Collection<String> value){
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
    public TencentResetRecordQueryWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 等于 =
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdEq(String oldImageId){
        if(oldImageId!=null){
            eq("old_image_id",oldImageId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdNe(String oldImageId){
        if(oldImageId!=null){
            ne("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于 &gt;
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdGt(String oldImageId){
        if(oldImageId!=null){
            gt("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于等于 &gt;=
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdGe(String oldImageId){
        if(oldImageId!=null){
            ge("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于 &lt;
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdLt(String oldImageId){
        if(oldImageId!=null){
            lt("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于等于 &lt;=
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdLe(String oldImageId){
        if(oldImageId!=null){
            le("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param oldImageIdStart       值1
     * @param oldImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdBetween(String oldImageIdStart,String oldImageIdEnd){
        if(oldImageIdStart!=null && oldImageIdEnd!=null){
            between("old_image_id",oldImageIdStart,oldImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param oldImageIdStart       值1
     * @param oldImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdNotBetween(String oldImageIdStart,String oldImageIdEnd){
        if(oldImageIdStart!=null && oldImageIdEnd!=null){
            notBetween("old_image_id",oldImageIdStart,oldImageIdEnd);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值%'
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdLike(String oldImageId){
        if(oldImageId!=null){
            like("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT LIKE '%值%'
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdNotLike(String oldImageId){
        if(oldImageId!=null){
            notLike("old_image_id",oldImageId);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值'
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdLikeLeft(String oldImageId){
        if(oldImageId!=null){
            likeLeft("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '值%'
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdLikeRight(String oldImageId){
        if(oldImageId!=null){
            likeRight("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdIsNull(){
        isNull("old_image_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdIsNotNull(){
        isNotNull("old_image_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("old_image_id",value);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdIn(String... values){
        if(values!=null && values.length>0){
            in("old_image_id",values);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("old_image_id",value);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper oldImageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("old_image_id",values);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 等于 =
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdEq(String resetImageId){
        if(resetImageId!=null){
            eq("reset_image_id",resetImageId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdNe(String resetImageId){
        if(resetImageId!=null){
            ne("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于 &gt;
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdGt(String resetImageId){
        if(resetImageId!=null){
            gt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于等于 &gt;=
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdGe(String resetImageId){
        if(resetImageId!=null){
            ge("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于 &lt;
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdLt(String resetImageId){
        if(resetImageId!=null){
            lt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于等于 &lt;=
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdLe(String resetImageId){
        if(resetImageId!=null){
            le("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdBetween(String resetImageIdStart,String resetImageIdEnd){
        if(resetImageIdStart!=null && resetImageIdEnd!=null){
            between("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdNotBetween(String resetImageIdStart,String resetImageIdEnd){
        if(resetImageIdStart!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdLike(String resetImageId){
        if(resetImageId!=null){
            like("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT LIKE '%值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdNotLike(String resetImageId){
        if(resetImageId!=null){
            notLike("reset_image_id",resetImageId);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值'
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdLikeLeft(String resetImageId){
        if(resetImageId!=null){
            likeLeft("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdLikeRight(String resetImageId){
        if(resetImageId!=null){
            likeRight("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdIsNull(){
        isNull("reset_image_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdIsNotNull(){
        isNotNull("reset_image_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_image_id",value);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdIn(String... values){
        if(values!=null && values.length>0){
            in("reset_image_id",values);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_image_id",value);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper resetImageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdEq(Long resetUserId){
        if(resetUserId!=null){
            eq("reset_user_id",resetUserId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdNe(Long resetUserId){
        if(resetUserId!=null){
            ne("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdGt(Long resetUserId){
        if(resetUserId!=null){
            gt("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdGe(Long resetUserId){
        if(resetUserId!=null){
            ge("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdLt(Long resetUserId){
        if(resetUserId!=null){
            lt("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdLe(Long resetUserId){
        if(resetUserId!=null){
            le("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param resetUserIdStart       值1
     * @param resetUserIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdBetween(Long resetUserIdStart,Long resetUserIdEnd){
        if(resetUserIdStart!=null && resetUserIdEnd!=null){
            between("reset_user_id",resetUserIdStart,resetUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetUserIdStart       值1
     * @param resetUserIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdNotBetween(Long resetUserIdStart,Long resetUserIdEnd){
        if(resetUserIdStart!=null && resetUserIdEnd!=null){
            notBetween("reset_user_id",resetUserIdStart,resetUserIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdLike(Long resetUserId){
        if(resetUserId!=null){
            like("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdNotLike(Long resetUserId){
        if(resetUserId!=null){
            notLike("reset_user_id",resetUserId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdLikeLeft(Long resetUserId){
        if(resetUserId!=null){
            likeLeft("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdLikeRight(Long resetUserId){
        if(resetUserId!=null){
            likeRight("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdIsNull(){
        isNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdIsNotNull(){
        isNotNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("reset_user_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdIn(Long... values){
        if(values!=null && values.length>0){
            in("reset_user_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_user_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper resetUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("reset_user_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseEq(String response){
        if(response!=null){
            eq("response",response);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseNe(String response){
        if(response!=null){
            ne("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseGt(String response){
        if(response!=null){
            gt("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseGe(String response){
        if(response!=null){
            ge("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseLt(String response){
        if(response!=null){
            lt("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseLe(String response){
        if(response!=null){
            le("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param responseStart       值1
     * @param responseEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper responseBetween(String responseStart,String responseEnd){
        if(responseStart!=null && responseEnd!=null){
            between("response",responseStart,responseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param responseStart       值1
     * @param responseEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper responseNotBetween(String responseStart,String responseEnd){
        if(responseStart!=null && responseEnd!=null){
            notBetween("response",responseStart,responseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseLike(String response){
        if(response!=null){
            like("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseNotLike(String response){
        if(response!=null){
            notLike("response",response);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseLikeLeft(String response){
        if(response!=null){
            likeLeft("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryWrapper responseLikeRight(String response){
        if(response!=null){
            likeRight("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper responseIsNull(){
        isNull("response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper responseIsNotNull(){
        isNotNull("response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper responseIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("response",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper responseIn(String... values){
        if(values!=null && values.length>0){
            in("response",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper responseNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("response",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper responseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("response",values);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>重置时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>重置时间</p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


}
