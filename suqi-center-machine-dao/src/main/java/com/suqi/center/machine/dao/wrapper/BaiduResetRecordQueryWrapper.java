package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.BaiduResetRecord;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 百度云机重置记录
 * </p>
 * "baidu_reset_record"
 * @author PC001
 */
public class BaiduResetRecordQueryWrapper extends QueryWrapper<BaiduResetRecord> {


    public static BaiduResetRecordQueryWrapper wrapper() {
        return new BaiduResetRecordQueryWrapper();
    }

    public BaiduResetRecordQueryWrapper() {
        super();
    }

    public BaiduResetRecordQueryWrapper(BaiduResetRecord entity) {
        super(entity);
    }

    public BaiduResetRecordQueryWrapper(BaiduResetRecord entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public BaiduResetRecordQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public BaiduResetRecordQueryWrapper selectColumns(Consumer<BaiduResetRecordSelect> consumer) {
        BaiduResetRecordSelect select = new BaiduResetRecordSelect();
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
    public BaiduResetRecordQueryWrapper idEq(Long id){
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
    public BaiduResetRecordQueryWrapper idNe(Long id){
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
    public BaiduResetRecordQueryWrapper idGt(Long id){
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
    public BaiduResetRecordQueryWrapper idGe(Long id){
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
    public BaiduResetRecordQueryWrapper idLt(Long id){
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
    public BaiduResetRecordQueryWrapper idLe(Long id){
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
    public BaiduResetRecordQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduResetRecordQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduResetRecordQueryWrapper idLike(Long id){
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
    public BaiduResetRecordQueryWrapper idNotLike(Long id){
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
    public BaiduResetRecordQueryWrapper idLikeLeft(Long id){
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
    public BaiduResetRecordQueryWrapper idLikeRight(Long id){
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
    public BaiduResetRecordQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper idIn(Collection<Long> value){
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
    public BaiduResetRecordQueryWrapper idIn(Long... values){
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
    public BaiduResetRecordQueryWrapper idNotIn(Collection<Long> value){
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
    public BaiduResetRecordQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdEq(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            eq("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdNe(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            ne("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdGt(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            gt("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdGe(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            ge("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdLt(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            lt("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdLe(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            le("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkBaiduDeviceIdStart       值1
     * @param fkBaiduDeviceIdEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdBetween(Long fkBaiduDeviceIdStart,Long fkBaiduDeviceIdEnd){
        if(fkBaiduDeviceIdStart!=null && fkBaiduDeviceIdEnd!=null){
            between("fk_baidu_device_id",fkBaiduDeviceIdStart,fkBaiduDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkBaiduDeviceIdStart       值1
     * @param fkBaiduDeviceIdEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdNotBetween(Long fkBaiduDeviceIdStart,Long fkBaiduDeviceIdEnd){
        if(fkBaiduDeviceIdStart!=null && fkBaiduDeviceIdEnd!=null){
            notBetween("fk_baidu_device_id",fkBaiduDeviceIdStart,fkBaiduDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdLike(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            like("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdNotLike(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            notLike("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdLikeLeft(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            likeLeft("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdLikeRight(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            likeRight("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdIsNull(){
        isNull("fk_baidu_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdIsNotNull(){
        isNotNull("fk_baidu_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_baidu_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_baidu_device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_baidu_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_device_id",values);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 等于 =
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeEq(String code){
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 不等于 &lt;&gt;
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeNe(String code){
        if(code!=null){
            ne("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 大于 &gt;
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeGt(String code){
        if(code!=null){
            gt("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 大于等于 &gt;=
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeGe(String code){
        if(code!=null){
            ge("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 小于 &lt;
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeLt(String code){
        if(code!=null){
            lt("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 小于等于 &lt;=
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeLe(String code){
        if(code!=null){
            le("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            between("code",codeStart,codeEnd);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeNotBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            notBetween("code",codeStart,codeEnd);
        }
        return this;
     }


    /**
     * <p>百度云机id</p>
     * LIKE '%值%'
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeLike(String code){
        if(code!=null){
            like("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * NOT LIKE '%值%'
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeNotLike(String code){
        if(code!=null){
            notLike("code",code);
        }
        return this;
     }


    /**
     * <p>百度云机id</p>
     * LIKE '%值'
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeLikeLeft(String code){
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * LIKE '值%'
     * @param code       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeLikeRight(String code){
        if(code!=null){
            likeRight("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeIsNull(){
        isNull("code");
        return this;
    }

    /**
     * <p>百度云机id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeIsNotNull(){
        isNotNull("code");
        return this;
    }

    /**
     * <p>百度云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("code",value);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeIn(String... values){
        if(values!=null && values.length>0){
            in("code",values);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("code",value);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper codeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdEq(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            eq("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdNe(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            ne("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdGt(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            gt("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdGe(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            ge("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdLt(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            lt("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdLe(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            le("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkBaiduImagesIdStart       值1
     * @param fkBaiduImagesIdEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdBetween(Long fkBaiduImagesIdStart,Long fkBaiduImagesIdEnd){
        if(fkBaiduImagesIdStart!=null && fkBaiduImagesIdEnd!=null){
            between("fk_baidu_images_id",fkBaiduImagesIdStart,fkBaiduImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkBaiduImagesIdStart       值1
     * @param fkBaiduImagesIdEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdNotBetween(Long fkBaiduImagesIdStart,Long fkBaiduImagesIdEnd){
        if(fkBaiduImagesIdStart!=null && fkBaiduImagesIdEnd!=null){
            notBetween("fk_baidu_images_id",fkBaiduImagesIdStart,fkBaiduImagesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdLike(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            like("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdNotLike(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            notLike("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdLikeLeft(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            likeLeft("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdLikeRight(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            likeRight("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdIsNull(){
        isNull("fk_baidu_images_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdIsNotNull(){
        isNotNull("fk_baidu_images_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_baidu_images_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_baidu_images_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_baidu_images_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper fkBaiduImagesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_images_id",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 等于 =
     * @param versionCode       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper versionCodeEq(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeNe(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeGt(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeGe(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeLt(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeLe(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduResetRecordQueryWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduResetRecordQueryWrapper versionCodeLike(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeNotLike(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeLikeLeft(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeLikeRight(String versionCode){
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
    public BaiduResetRecordQueryWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper versionCodeIn(Collection<String> value){
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
    public BaiduResetRecordQueryWrapper versionCodeIn(String... values){
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
    public BaiduResetRecordQueryWrapper versionCodeNotIn(Collection<String> value){
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
    public BaiduResetRecordQueryWrapper versionCodeNotIn(String... values){
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
    public BaiduResetRecordQueryWrapper titleEq(String title){
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
    public BaiduResetRecordQueryWrapper titleNe(String title){
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
    public BaiduResetRecordQueryWrapper titleGt(String title){
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
    public BaiduResetRecordQueryWrapper titleGe(String title){
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
    public BaiduResetRecordQueryWrapper titleLt(String title){
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
    public BaiduResetRecordQueryWrapper titleLe(String title){
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
    public BaiduResetRecordQueryWrapper titleBetween(String titleStart,String titleEnd){
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
    public BaiduResetRecordQueryWrapper titleNotBetween(String titleStart,String titleEnd){
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
    public BaiduResetRecordQueryWrapper titleLike(String title){
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
    public BaiduResetRecordQueryWrapper titleNotLike(String title){
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
    public BaiduResetRecordQueryWrapper titleLikeLeft(String title){
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
    public BaiduResetRecordQueryWrapper titleLikeRight(String title){
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
    public BaiduResetRecordQueryWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper titleIn(Collection<String> value){
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
    public BaiduResetRecordQueryWrapper titleIn(String... values){
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
    public BaiduResetRecordQueryWrapper titleNotIn(Collection<String> value){
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
    public BaiduResetRecordQueryWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 等于 =
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdEq(String oldImageVersionId){
        if(oldImageVersionId!=null){
            eq("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdNe(String oldImageVersionId){
        if(oldImageVersionId!=null){
            ne("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于 &gt;
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdGt(String oldImageVersionId){
        if(oldImageVersionId!=null){
            gt("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于等于 &gt;=
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdGe(String oldImageVersionId){
        if(oldImageVersionId!=null){
            ge("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于 &lt;
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdLt(String oldImageVersionId){
        if(oldImageVersionId!=null){
            lt("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于等于 &lt;=
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdLe(String oldImageVersionId){
        if(oldImageVersionId!=null){
            le("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param oldImageVersionIdStart       值1
     * @param oldImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdBetween(String oldImageVersionIdStart,String oldImageVersionIdEnd){
        if(oldImageVersionIdStart!=null && oldImageVersionIdEnd!=null){
            between("old_image_version_id",oldImageVersionIdStart,oldImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param oldImageVersionIdStart       值1
     * @param oldImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdNotBetween(String oldImageVersionIdStart,String oldImageVersionIdEnd){
        if(oldImageVersionIdStart!=null && oldImageVersionIdEnd!=null){
            notBetween("old_image_version_id",oldImageVersionIdStart,oldImageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值%'
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdLike(String oldImageVersionId){
        if(oldImageVersionId!=null){
            like("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT LIKE '%值%'
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdNotLike(String oldImageVersionId){
        if(oldImageVersionId!=null){
            notLike("old_image_version_id",oldImageVersionId);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值'
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdLikeLeft(String oldImageVersionId){
        if(oldImageVersionId!=null){
            likeLeft("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '值%'
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdLikeRight(String oldImageVersionId){
        if(oldImageVersionId!=null){
            likeRight("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdIsNull(){
        isNull("old_image_version_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdIsNotNull(){
        isNotNull("old_image_version_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("old_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("old_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("old_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper oldImageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("old_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 等于 =
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdEq(String resetImageVersionId){
        if(resetImageVersionId!=null){
            eq("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdNe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ne("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于 &gt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdGt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            gt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于等于 &gt;=
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdGe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ge("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于 &lt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdLt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            lt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于等于 &lt;=
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdLe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            le("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        if(resetImageVersionIdStart!=null && resetImageVersionIdEnd!=null){
            between("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdNotBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        if(resetImageVersionIdStart!=null && resetImageVersionIdEnd!=null){
            notBetween("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            like("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT LIKE '%值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdNotLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            notLike("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdLikeLeft(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeLeft("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdLikeRight(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeRight("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdIsNull(){
        isNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdIsNotNull(){
        isNotNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetImageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param resetUserId       值
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetUserIdEq(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdNe(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdGt(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdGe(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdLt(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdLe(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdBetween(Long resetUserIdStart,Long resetUserIdEnd){
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
    public BaiduResetRecordQueryWrapper resetUserIdNotBetween(Long resetUserIdStart,Long resetUserIdEnd){
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
    public BaiduResetRecordQueryWrapper resetUserIdLike(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdNotLike(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdLikeLeft(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdLikeRight(Long resetUserId){
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
    public BaiduResetRecordQueryWrapper resetUserIdIsNull(){
        isNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetUserIdIsNotNull(){
        isNotNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper resetUserIdIn(Collection<Long> value){
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
    public BaiduResetRecordQueryWrapper resetUserIdIn(Long... values){
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
    public BaiduResetRecordQueryWrapper resetUserIdNotIn(Collection<Long> value){
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
    public BaiduResetRecordQueryWrapper resetUserIdNotIn(Long... values){
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
    public BaiduResetRecordQueryWrapper responseEq(String response){
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
    public BaiduResetRecordQueryWrapper responseNe(String response){
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
    public BaiduResetRecordQueryWrapper responseGt(String response){
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
    public BaiduResetRecordQueryWrapper responseGe(String response){
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
    public BaiduResetRecordQueryWrapper responseLt(String response){
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
    public BaiduResetRecordQueryWrapper responseLe(String response){
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
    public BaiduResetRecordQueryWrapper responseBetween(String responseStart,String responseEnd){
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
    public BaiduResetRecordQueryWrapper responseNotBetween(String responseStart,String responseEnd){
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
    public BaiduResetRecordQueryWrapper responseLike(String response){
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
    public BaiduResetRecordQueryWrapper responseNotLike(String response){
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
    public BaiduResetRecordQueryWrapper responseLikeLeft(String response){
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
    public BaiduResetRecordQueryWrapper responseLikeRight(String response){
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
    public BaiduResetRecordQueryWrapper responseIsNull(){
        isNull("response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper responseIsNotNull(){
        isNotNull("response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper responseIn(Collection<String> value){
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
    public BaiduResetRecordQueryWrapper responseIn(String... values){
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
    public BaiduResetRecordQueryWrapper responseNotIn(Collection<String> value){
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
    public BaiduResetRecordQueryWrapper responseNotIn(String... values){
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
    public BaiduResetRecordQueryWrapper createTimeEq(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeNe(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeGt(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeGe(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeLt(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeLe(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduResetRecordQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduResetRecordQueryWrapper createTimeLike(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeNotLike(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeLikeRight(Date createTime){
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
    public BaiduResetRecordQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordQueryWrapper createTimeIn(Collection<Date> value){
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
    public BaiduResetRecordQueryWrapper createTimeIn(Date... values){
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
    public BaiduResetRecordQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduResetRecordQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


}
