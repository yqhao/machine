package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.math.BigDecimal;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.PcpArea;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * pcp区域表（pcp_area）
 * </p>
 * "pcp_area"
 * @author PC001
 * @since 2023-06-14
 */
public class PcpAreaQueryWrapper extends QueryWrapper<PcpArea> {


    public static PcpAreaQueryWrapper wrapper() {
        return new PcpAreaQueryWrapper();
    }

    public PcpAreaQueryWrapper() {
        super();
    }

    public PcpAreaQueryWrapper(PcpArea entity) {
        super(entity);
    }

    public PcpAreaQueryWrapper(PcpArea entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public PcpAreaQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }



    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public PcpAreaQueryWrapper idEq(Long id){
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
    public PcpAreaQueryWrapper idNe(Long id){
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
    public PcpAreaQueryWrapper idGt(Long id){
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
    public PcpAreaQueryWrapper idGe(Long id){
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
    public PcpAreaQueryWrapper idLt(Long id){
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
    public PcpAreaQueryWrapper idLe(Long id){
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
    public PcpAreaQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpAreaQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public PcpAreaQueryWrapper idLike(Long id){
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
    public PcpAreaQueryWrapper idNotLike(Long id){
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
    public PcpAreaQueryWrapper idLikeLeft(Long id){
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
    public PcpAreaQueryWrapper idLikeRight(Long id){
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
    public PcpAreaQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaQueryWrapper idIn(Collection<Long> value){
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
    public PcpAreaQueryWrapper idIn(Long... values){
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
    public PcpAreaQueryWrapper idNotIn(Collection<Long> value){
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
    public PcpAreaQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameLe(String name){
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
    public PcpAreaQueryWrapper nameBetween(String nameStart,String nameEnd){
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
    public PcpAreaQueryWrapper nameNotBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param name       值
     * @return children
     */
    public PcpAreaQueryWrapper nameLikeRight(String name){
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
    public PcpAreaQueryWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaQueryWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaQueryWrapper nameIn(Collection<String> value){
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
    public PcpAreaQueryWrapper nameIn(String... values){
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
    public PcpAreaQueryWrapper nameNotIn(Collection<String> value){
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
    public PcpAreaQueryWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 等于 =
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngEq(BigDecimal lng){
        if(lng!=null){
            eq("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 不等于 &lt;&gt;
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngNe(BigDecimal lng){
        if(lng!=null){
            ne("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于 &gt;
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngGt(BigDecimal lng){
        if(lng!=null){
            gt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于等于 &gt;=
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngGe(BigDecimal lng){
        if(lng!=null){
            ge("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于 &lt;
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngLt(BigDecimal lng){
        if(lng!=null){
            lt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于等于 &lt;=
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngLe(BigDecimal lng){
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
    public PcpAreaQueryWrapper lngBetween(BigDecimal lngStart,BigDecimal lngEnd){
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
    public PcpAreaQueryWrapper lngNotBetween(BigDecimal lngStart,BigDecimal lngEnd){
        if(lngStart!=null && lngEnd!=null){
            notBetween("lng",lngStart,lngEnd);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值%'
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngLike(BigDecimal lng){
        if(lng!=null){
            like("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT LIKE '%值%'
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngNotLike(BigDecimal lng){
        if(lng!=null){
            notLike("lng",lng);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值'
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngLikeLeft(BigDecimal lng){
        if(lng!=null){
            likeLeft("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * LIKE '值%'
     * @param lng       值
     * @return children
     */
    public PcpAreaQueryWrapper lngLikeRight(BigDecimal lng){
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
    public PcpAreaQueryWrapper lngIsNull(){
        isNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaQueryWrapper lngIsNotNull(){
        isNotNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaQueryWrapper lngIn(Collection<BigDecimal> value){
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
    public PcpAreaQueryWrapper lngIn(BigDecimal... values){
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
    public PcpAreaQueryWrapper lngNotIn(Collection<BigDecimal> value){
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
    public PcpAreaQueryWrapper lngNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lng",values);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 等于 =
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latEq(BigDecimal lat){
        if(lat!=null){
            eq("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 不等于 &lt;&gt;
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latNe(BigDecimal lat){
        if(lat!=null){
            ne("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于 &gt;
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latGt(BigDecimal lat){
        if(lat!=null){
            gt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于等于 &gt;=
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latGe(BigDecimal lat){
        if(lat!=null){
            ge("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于 &lt;
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latLt(BigDecimal lat){
        if(lat!=null){
            lt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于等于 &lt;=
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latLe(BigDecimal lat){
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
    public PcpAreaQueryWrapper latBetween(BigDecimal latStart,BigDecimal latEnd){
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
    public PcpAreaQueryWrapper latNotBetween(BigDecimal latStart,BigDecimal latEnd){
        if(latStart!=null && latEnd!=null){
            notBetween("lat",latStart,latEnd);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值%'
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latLike(BigDecimal lat){
        if(lat!=null){
            like("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT LIKE '%值%'
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latNotLike(BigDecimal lat){
        if(lat!=null){
            notLike("lat",lat);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值'
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latLikeLeft(BigDecimal lat){
        if(lat!=null){
            likeLeft("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * LIKE '值%'
     * @param lat       值
     * @return children
     */
    public PcpAreaQueryWrapper latLikeRight(BigDecimal lat){
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
    public PcpAreaQueryWrapper latIsNull(){
        isNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaQueryWrapper latIsNotNull(){
        isNotNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaQueryWrapper latIn(Collection<BigDecimal> value){
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
    public PcpAreaQueryWrapper latIn(BigDecimal... values){
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
    public PcpAreaQueryWrapper latNotIn(Collection<BigDecimal> value){
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
    public PcpAreaQueryWrapper latNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lat",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeEq(String code){
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeNe(String code){
        if(code!=null){
            ne("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeGt(String code){
        if(code!=null){
            gt("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeGe(String code){
        if(code!=null){
            ge("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeLt(String code){
        if(code!=null){
            lt("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeLe(String code){
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
    public PcpAreaQueryWrapper codeBetween(String codeStart,String codeEnd){
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
    public PcpAreaQueryWrapper codeNotBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            notBetween("code",codeStart,codeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeLike(String code){
        if(code!=null){
            like("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeNotLike(String code){
        if(code!=null){
            notLike("code",code);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeLikeLeft(String code){
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param code       值
     * @return children
     */
    public PcpAreaQueryWrapper codeLikeRight(String code){
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
    public PcpAreaQueryWrapper codeIsNull(){
        isNull("code");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaQueryWrapper codeIsNotNull(){
        isNotNull("code");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaQueryWrapper codeIn(Collection<String> value){
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
    public PcpAreaQueryWrapper codeIn(String... values){
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
    public PcpAreaQueryWrapper codeNotIn(Collection<String> value){
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
    public PcpAreaQueryWrapper codeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("code",values);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * 等于 =
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * 不等于 &lt;&gt;
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 大于 &gt;
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 大于等于 &gt;=
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 小于 &lt;
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 小于等于 &lt;=
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionLe(String region){
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
    public PcpAreaQueryWrapper regionBetween(String regionStart,String regionEnd){
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
    public PcpAreaQueryWrapper regionNotBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>区域</p>
     * LIKE '%值%'
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * NOT LIKE '%值%'
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
     }


    /**
     * <p>区域</p>
     * LIKE '%值'
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * LIKE '值%'
     * @param region       值
     * @return children
     */
    public PcpAreaQueryWrapper regionLikeRight(String region){
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
    public PcpAreaQueryWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>区域</p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaQueryWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaQueryWrapper regionIn(Collection<String> value){
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
    public PcpAreaQueryWrapper regionIn(String... values){
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
    public PcpAreaQueryWrapper regionNotIn(Collection<String> value){
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
    public PcpAreaQueryWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }



}
