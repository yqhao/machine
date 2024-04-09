package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.math.BigDecimal;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.PcpArea;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * pcp区域表（pcp_area）
 * </p>
 * "pcp_area"
 * @author PC001
 * @since 2023-06-14
 */
public class PcpAreaUpdateWrapper extends UpdateWrapper<PcpArea> {

    public static PcpAreaUpdateWrapper wrapper() {
        return new PcpAreaUpdateWrapper();
    }

    public PcpAreaUpdateWrapper() {
        super();
    }

    public PcpAreaUpdateWrapper(PcpArea entity) {
        super(entity);
    }

    /**
     * 
     */
    public PcpAreaUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public PcpAreaUpdateWrapper setName(String name) {
         set("name",name);
        return this;
    }
    /**
     * 经度
     */
    public PcpAreaUpdateWrapper setLng(BigDecimal lng) {
         set("lng",lng);
        return this;
    }
    /**
     * 纬度
     */
    public PcpAreaUpdateWrapper setLat(BigDecimal lat) {
         set("lat",lat);
        return this;
    }
    /**
     * 
     */
    public PcpAreaUpdateWrapper setCode(String code) {
         set("code",code);
        return this;
    }
    /**
     * 区域
     */
    public PcpAreaUpdateWrapper setRegion(String region) {
         set("region",region);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public PcpAreaUpdateWrapper idEq(Long id){
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
    public PcpAreaUpdateWrapper idNe(Long id){
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
    public PcpAreaUpdateWrapper idGt(Long id){
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
    public PcpAreaUpdateWrapper idGe(Long id){
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
    public PcpAreaUpdateWrapper idLt(Long id){
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
    public PcpAreaUpdateWrapper idLe(Long id){
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
    public PcpAreaUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpAreaUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public PcpAreaUpdateWrapper idLike(Long id){
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
    public PcpAreaUpdateWrapper idNotLike(Long id){
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
    public PcpAreaUpdateWrapper idLikeLeft(Long id){
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
    public PcpAreaUpdateWrapper idLikeRight(Long id){
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
    public PcpAreaUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper idIn(Collection<Long> value){
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
    public PcpAreaUpdateWrapper idIn(Long... values){
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
    public PcpAreaUpdateWrapper idNotIn(Collection<Long> value){
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
    public PcpAreaUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameLe(String name){
        if(name!=null){
            le("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper nameBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            between("name",nameStart,nameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper nameNotBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' name
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateWrapper nameLikeRight(String name){
        if(name!=null){
            likeRight("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public PcpAreaUpdateWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper nameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper nameIn(String... values){
        if(values!=null && values.length>0){
            in("name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper nameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 等于 = lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngEq(BigDecimal lng){
        if(lng!=null){
            eq("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 不等于 &lt;&gt; lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngNe(BigDecimal lng){
        if(lng!=null){
            ne("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于 &gt; lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngGt(BigDecimal lng){
        if(lng!=null){
            gt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于等于 &gt;= lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngGe(BigDecimal lng){
        if(lng!=null){
            ge("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于 &lt; lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngLt(BigDecimal lng){
        if(lng!=null){
            lt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于等于 &lt;= lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngLe(BigDecimal lng){
        if(lng!=null){
            le("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * BETWEEN 值1 AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper lngBetween(BigDecimal lngStart,BigDecimal lngEnd){
        if(lngStart!=null && lngEnd!=null){
            between("lng",lngStart,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper lngNotBetween(BigDecimal lngStart,BigDecimal lngEnd){
        if(lngStart!=null && lngEnd!=null){
            notBetween("lng",lngStart,lngEnd);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值%' lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngLike(BigDecimal lng){
        if(lng!=null){
            like("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT LIKE '%值%' lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngNotLike(BigDecimal lng){
        if(lng!=null){
            notLike("lng",lng);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值' lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngLikeLeft(BigDecimal lng){
        if(lng!=null){
            likeLeft("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * LIKE '值%' lng
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateWrapper lngLikeRight(BigDecimal lng){
        if(lng!=null){
            likeRight("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * IS NULL
     * @return children
     */
    public PcpAreaUpdateWrapper lngIsNull(){
        isNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateWrapper lngIsNotNull(){
        isNotNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper lngIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            in("lng",value);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper lngIn(BigDecimal... values){
        if(values!=null && values.length>0){
            in("lng",values);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper lngNotIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            notIn("lng",value);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper lngNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lng",values);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 等于 = lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latEq(BigDecimal lat){
        if(lat!=null){
            eq("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 不等于 &lt;&gt; lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latNe(BigDecimal lat){
        if(lat!=null){
            ne("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于 &gt; lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latGt(BigDecimal lat){
        if(lat!=null){
            gt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于等于 &gt;= lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latGe(BigDecimal lat){
        if(lat!=null){
            ge("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于 &lt; lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latLt(BigDecimal lat){
        if(lat!=null){
            lt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于等于 &lt;= lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latLe(BigDecimal lat){
        if(lat!=null){
            le("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * BETWEEN 值1 AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper latBetween(BigDecimal latStart,BigDecimal latEnd){
        if(latStart!=null && latEnd!=null){
            between("lat",latStart,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT BETWEEN 值1 AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper latNotBetween(BigDecimal latStart,BigDecimal latEnd){
        if(latStart!=null && latEnd!=null){
            notBetween("lat",latStart,latEnd);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值%' lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latLike(BigDecimal lat){
        if(lat!=null){
            like("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT LIKE '%值%' lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latNotLike(BigDecimal lat){
        if(lat!=null){
            notLike("lat",lat);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值' lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latLikeLeft(BigDecimal lat){
        if(lat!=null){
            likeLeft("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * LIKE '值%' lat
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateWrapper latLikeRight(BigDecimal lat){
        if(lat!=null){
            likeRight("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * IS NULL
     * @return children
     */
    public PcpAreaUpdateWrapper latIsNull(){
        isNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateWrapper latIsNotNull(){
        isNotNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper latIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            in("lat",value);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper latIn(BigDecimal... values){
        if(values!=null && values.length>0){
            in("lat",values);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper latNotIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            notIn("lat",value);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper latNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lat",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeEq(String code){
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeNe(String code){
        if(code!=null){
            ne("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeGt(String code){
        if(code!=null){
            gt("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeGe(String code){
        if(code!=null){
            ge("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeLt(String code){
        if(code!=null){
            lt("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeLe(String code){
        if(code!=null){
            le("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper codeBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            between("code",codeStart,codeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper codeNotBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            notBetween("code",codeStart,codeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeLike(String code){
        if(code!=null){
            like("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeNotLike(String code){
        if(code!=null){
            notLike("code",code);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeLikeLeft(String code){
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' code
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateWrapper codeLikeRight(String code){
        if(code!=null){
            likeRight("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public PcpAreaUpdateWrapper codeIsNull(){
        isNull("code");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateWrapper codeIsNotNull(){
        isNotNull("code");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper codeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper codeIn(String... values){
        if(values!=null && values.length>0){
            in("code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper codeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper codeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("code",values);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * 等于 = region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * 不等于 &lt;&gt; region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 大于 &gt; region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 大于等于 &gt;= region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 小于 &lt; region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 小于等于 &lt;= region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper regionBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * NOT BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public PcpAreaUpdateWrapper regionNotBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>区域</p>
     * LIKE '%值%' region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * NOT LIKE '%值%' region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
     }


    /**
     * <p>区域</p>
     * LIKE '%值' region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * LIKE '值%' region
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateWrapper regionLikeRight(String region){
        if(region!=null){
            likeRight("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * IS NULL
     * @return children
     */
    public PcpAreaUpdateWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>区域</p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper regionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("region",value);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper regionIn(String... values){
        if(values!=null && values.length>0){
            in("region",values);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper regionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("region",value);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }


}
