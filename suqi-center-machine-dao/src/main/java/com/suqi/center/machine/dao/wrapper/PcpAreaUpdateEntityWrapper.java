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
public class PcpAreaUpdateEntityWrapper extends UpdateWrapper<PcpArea> {

    public static PcpAreaUpdateEntityWrapper wrapper(PcpArea entity) {
        return new PcpAreaUpdateEntityWrapper(entity);
    }

    private PcpArea entity;

    public PcpAreaUpdateEntityWrapper(PcpArea entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public PcpAreaUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public PcpAreaUpdateEntityWrapper setName(String name) {
         set("name",name);
        return this;
    }
    /**
     * 经度
     */
    public PcpAreaUpdateEntityWrapper setLng(BigDecimal lng) {
         set("lng",lng);
        return this;
    }
    /**
     * 纬度
     */
    public PcpAreaUpdateEntityWrapper setLat(BigDecimal lat) {
         set("lat",lat);
        return this;
    }
    /**
     * 
     */
    public PcpAreaUpdateEntityWrapper setCode(String code) {
         set("code",code);
        return this;
    }
    /**
     * 区域
     */
    public PcpAreaUpdateEntityWrapper setRegion(String region) {
         set("region",region);
        return this;
    }

    protected PcpArea entity() {
        if(entity==null){
            throw new NullPointerException("PcpArea is null");
        }
        return entity;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper idEq(){
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
    public PcpAreaUpdateEntityWrapper idNe(){
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
    public PcpAreaUpdateEntityWrapper idGt(){
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
    public PcpAreaUpdateEntityWrapper idGe(){
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
    public PcpAreaUpdateEntityWrapper idLt(){
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
    public PcpAreaUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper idBetween(Long idEnd){
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
    public PcpAreaUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public PcpAreaUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpAreaUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper idLikeRight(){
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
    public PcpAreaUpdateEntityWrapper idEq(Long id){
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
    public PcpAreaUpdateEntityWrapper idNe(Long id){
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
    public PcpAreaUpdateEntityWrapper idGt(Long id){
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
    public PcpAreaUpdateEntityWrapper idGe(Long id){
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
    public PcpAreaUpdateEntityWrapper idLt(Long id){
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
    public PcpAreaUpdateEntityWrapper idLe(Long id){
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
    public PcpAreaUpdateEntityWrapper idLike(Long id){
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
    public PcpAreaUpdateEntityWrapper idNotLike(Long id){
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
    public PcpAreaUpdateEntityWrapper idLikeLeft(Long id){
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
    public PcpAreaUpdateEntityWrapper idLikeRight(Long id){
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
    public PcpAreaUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateEntityWrapper idIn(Collection<Long> value){
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
    public PcpAreaUpdateEntityWrapper idIn(Long... values){
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
    public PcpAreaUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public PcpAreaUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameEq(){
        String name =entity().getName();
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameNe(){
        String name =entity().getName();
        if(name!=null){
            ne("name",entity().getName());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameGt(){
        String name =entity().getName();
        if(name!=null){
            gt("name",entity().getName());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameGe(){
        String name =entity().getName();
        if(name!=null){
            ge("name",entity().getName());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameLt(){
        String name =entity().getName();
        if(name!=null){
            lt("name",entity().getName());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameLe(){
        String name =entity().getName();
        if(name!=null){
            le("name",entity().getName());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getName() AND 值2
     * @param nameEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",entity().getName(),nameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameNotBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",entity().getName(),nameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",nameStart,nameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameNotBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameLike(){
        String name =entity().getName();
        if(name!=null){
            like("name",entity().getName());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameNotLike(){
        String name =entity().getName();
        if(name!=null){
            notLike("name",entity().getName());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameLikeLeft(){
        String name =entity().getName();
        if(name!=null){
            likeLeft("name",entity().getName());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getName()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameLikeRight(){
        String name =entity().getName();
        if(name!=null){
            likeRight("name",entity().getName());
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameEq(String name){
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
    public PcpAreaUpdateEntityWrapper nameNe(String name){
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
    public PcpAreaUpdateEntityWrapper nameGt(String name){
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
    public PcpAreaUpdateEntityWrapper nameGe(String name){
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
    public PcpAreaUpdateEntityWrapper nameLt(String name){
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
    public PcpAreaUpdateEntityWrapper nameLe(String name){
        if(name!=null){
            le("name",name);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param name       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameLike(String name){
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
    public PcpAreaUpdateEntityWrapper nameNotLike(String name){
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
    public PcpAreaUpdateEntityWrapper nameLikeLeft(String name){
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
    public PcpAreaUpdateEntityWrapper nameLikeRight(String name){
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
    public PcpAreaUpdateEntityWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateEntityWrapper nameIn(Collection<String> value){
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
    public PcpAreaUpdateEntityWrapper nameIn(String... values){
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
    public PcpAreaUpdateEntityWrapper nameNotIn(Collection<String> value){
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
    public PcpAreaUpdateEntityWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 等于 = entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngEq(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            eq("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 不等于 &lt;&gt; entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngNe(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            ne("lng",entity().getLng());
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于 &gt; entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngGt(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            gt("lng",entity().getLng());
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于等于 &gt;= entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngGe(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            ge("lng",entity().getLng());
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于 &lt; entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngLt(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            lt("lng",entity().getLng());
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于等于 &lt;= entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngLe(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            le("lng",entity().getLng());
        }
        return this;
     }

    /**
     * <p>经度</p>
     * BETWEEN  entity().getLng() AND 值2
     * @param lngEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngBetween(BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            between("lng",entity().getLng(),lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT BETWEEN  entity().getLng() AND 值2
     * @param lngEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngNotBetween(BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            notBetween("lng",entity().getLng(),lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * BETWEEN  entity().getLng() AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngBetween(BigDecimal lngStart,BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            between("lng",lngStart,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT BETWEEN  entity().getLng() AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngNotBetween(BigDecimal lngStart,BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            notBetween("lng",lngStart,lngEnd);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值%' entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngLike(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            like("lng",entity().getLng());
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT LIKE '%值%' entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngNotLike(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            notLike("lng",entity().getLng());
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值' entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngLikeLeft(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            likeLeft("lng",entity().getLng());
        }
        return this;
     }

    /**
     * <p>经度</p>
     * LIKE '值%' entity().getLng()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngLikeRight(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            likeRight("lng",entity().getLng());
        }
        return this;
     }

/**
     * <p>经度</p>
     * 等于 =
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngEq(BigDecimal lng){
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
    public PcpAreaUpdateEntityWrapper lngNe(BigDecimal lng){
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
    public PcpAreaUpdateEntityWrapper lngGt(BigDecimal lng){
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
    public PcpAreaUpdateEntityWrapper lngGe(BigDecimal lng){
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
    public PcpAreaUpdateEntityWrapper lngLt(BigDecimal lng){
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
    public PcpAreaUpdateEntityWrapper lngLe(BigDecimal lng){
        if(lng!=null){
            le("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * LIKE '%值%'
     * @param lng       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngLike(BigDecimal lng){
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
    public PcpAreaUpdateEntityWrapper lngNotLike(BigDecimal lng){
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
    public PcpAreaUpdateEntityWrapper lngLikeLeft(BigDecimal lng){
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
    public PcpAreaUpdateEntityWrapper lngLikeRight(BigDecimal lng){
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
    public PcpAreaUpdateEntityWrapper lngIsNull(){
        isNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngIsNotNull(){
        isNotNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateEntityWrapper lngIn(Collection<BigDecimal> value){
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
    public PcpAreaUpdateEntityWrapper lngIn(BigDecimal... values){
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
    public PcpAreaUpdateEntityWrapper lngNotIn(Collection<BigDecimal> value){
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
    public PcpAreaUpdateEntityWrapper lngNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lng",values);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 等于 = entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latEq(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            eq("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 不等于 &lt;&gt; entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latNe(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            ne("lat",entity().getLat());
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于 &gt; entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latGt(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            gt("lat",entity().getLat());
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于等于 &gt;= entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latGe(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            ge("lat",entity().getLat());
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于 &lt; entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latLt(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            lt("lat",entity().getLat());
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于等于 &lt;= entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latLe(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            le("lat",entity().getLat());
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * BETWEEN  entity().getLat() AND 值2
     * @param latEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latBetween(BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            between("lat",entity().getLat(),latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT BETWEEN  entity().getLat() AND 值2
     * @param latEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latNotBetween(BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            notBetween("lat",entity().getLat(),latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * BETWEEN  entity().getLat() AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latBetween(BigDecimal latStart,BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            between("lat",latStart,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT BETWEEN  entity().getLat() AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latNotBetween(BigDecimal latStart,BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            notBetween("lat",latStart,latEnd);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值%' entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latLike(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            like("lat",entity().getLat());
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT LIKE '%值%' entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latNotLike(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            notLike("lat",entity().getLat());
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值' entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latLikeLeft(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            likeLeft("lat",entity().getLat());
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * LIKE '值%' entity().getLat()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latLikeRight(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            likeRight("lat",entity().getLat());
        }
        return this;
     }

/**
     * <p>纬度</p>
     * 等于 =
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latEq(BigDecimal lat){
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
    public PcpAreaUpdateEntityWrapper latNe(BigDecimal lat){
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
    public PcpAreaUpdateEntityWrapper latGt(BigDecimal lat){
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
    public PcpAreaUpdateEntityWrapper latGe(BigDecimal lat){
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
    public PcpAreaUpdateEntityWrapper latLt(BigDecimal lat){
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
    public PcpAreaUpdateEntityWrapper latLe(BigDecimal lat){
        if(lat!=null){
            le("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * LIKE '%值%'
     * @param lat       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latLike(BigDecimal lat){
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
    public PcpAreaUpdateEntityWrapper latNotLike(BigDecimal lat){
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
    public PcpAreaUpdateEntityWrapper latLikeLeft(BigDecimal lat){
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
    public PcpAreaUpdateEntityWrapper latLikeRight(BigDecimal lat){
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
    public PcpAreaUpdateEntityWrapper latIsNull(){
        isNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latIsNotNull(){
        isNotNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateEntityWrapper latIn(Collection<BigDecimal> value){
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
    public PcpAreaUpdateEntityWrapper latIn(BigDecimal... values){
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
    public PcpAreaUpdateEntityWrapper latNotIn(Collection<BigDecimal> value){
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
    public PcpAreaUpdateEntityWrapper latNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lat",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeEq(){
        String code =entity().getCode();
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeNe(){
        String code =entity().getCode();
        if(code!=null){
            ne("code",entity().getCode());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeGt(){
        String code =entity().getCode();
        if(code!=null){
            gt("code",entity().getCode());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeGe(){
        String code =entity().getCode();
        if(code!=null){
            ge("code",entity().getCode());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeLt(){
        String code =entity().getCode();
        if(code!=null){
            lt("code",entity().getCode());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeLe(){
        String code =entity().getCode();
        if(code!=null){
            le("code",entity().getCode());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCode() AND 值2
     * @param codeEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeBetween(String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            between("code",entity().getCode(),codeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCode() AND 值2
     * @param codeEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeNotBetween(String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            notBetween("code",entity().getCode(),codeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCode() AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeBetween(String codeStart,String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            between("code",codeStart,codeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCode() AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeNotBetween(String codeStart,String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            notBetween("code",codeStart,codeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeLike(){
        String code =entity().getCode();
        if(code!=null){
            like("code",entity().getCode());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeNotLike(){
        String code =entity().getCode();
        if(code!=null){
            notLike("code",entity().getCode());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeLikeLeft(){
        String code =entity().getCode();
        if(code!=null){
            likeLeft("code",entity().getCode());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getCode()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeLikeRight(){
        String code =entity().getCode();
        if(code!=null){
            likeRight("code",entity().getCode());
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeEq(String code){
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
    public PcpAreaUpdateEntityWrapper codeNe(String code){
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
    public PcpAreaUpdateEntityWrapper codeGt(String code){
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
    public PcpAreaUpdateEntityWrapper codeGe(String code){
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
    public PcpAreaUpdateEntityWrapper codeLt(String code){
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
    public PcpAreaUpdateEntityWrapper codeLe(String code){
        if(code!=null){
            le("code",code);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param code       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeLike(String code){
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
    public PcpAreaUpdateEntityWrapper codeNotLike(String code){
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
    public PcpAreaUpdateEntityWrapper codeLikeLeft(String code){
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
    public PcpAreaUpdateEntityWrapper codeLikeRight(String code){
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
    public PcpAreaUpdateEntityWrapper codeIsNull(){
        isNull("code");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeIsNotNull(){
        isNotNull("code");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateEntityWrapper codeIn(Collection<String> value){
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
    public PcpAreaUpdateEntityWrapper codeIn(String... values){
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
    public PcpAreaUpdateEntityWrapper codeNotIn(Collection<String> value){
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
    public PcpAreaUpdateEntityWrapper codeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("code",values);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * 等于 = entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionEq(){
        String region =entity().getRegion();
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * 不等于 &lt;&gt; entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionNe(){
        String region =entity().getRegion();
        if(region!=null){
            ne("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 大于 &gt; entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionGt(){
        String region =entity().getRegion();
        if(region!=null){
            gt("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 大于等于 &gt;= entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionGe(){
        String region =entity().getRegion();
        if(region!=null){
            ge("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 小于 &lt; entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionLt(){
        String region =entity().getRegion();
        if(region!=null){
            lt("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>区域</p>
     * 小于等于 &lt;= entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionLe(){
        String region =entity().getRegion();
        if(region!=null){
            le("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>区域</p>
     * BETWEEN  entity().getRegion() AND 值2
     * @param regionEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionBetween(String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            between("region",entity().getRegion(),regionEnd);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * NOT BETWEEN  entity().getRegion() AND 值2
     * @param regionEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionNotBetween(String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            notBetween("region",entity().getRegion(),regionEnd);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * BETWEEN  entity().getRegion() AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionBetween(String regionStart,String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>区域</p>
     * NOT BETWEEN  entity().getRegion() AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionNotBetween(String regionStart,String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>区域</p>
     * LIKE '%值%' entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionLike(){
        String region =entity().getRegion();
        if(region!=null){
            like("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>区域</p>
     * NOT LIKE '%值%' entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionNotLike(){
        String region =entity().getRegion();
        if(region!=null){
            notLike("region",entity().getRegion());
        }
        return this;
     }


    /**
     * <p>区域</p>
     * LIKE '%值' entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionLikeLeft(){
        String region =entity().getRegion();
        if(region!=null){
            likeLeft("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>区域</p>
     * LIKE '值%' entity().getRegion()
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionLikeRight(){
        String region =entity().getRegion();
        if(region!=null){
            likeRight("region",entity().getRegion());
        }
        return this;
     }

/**
     * <p>区域</p>
     * 等于 =
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionEq(String region){
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
    public PcpAreaUpdateEntityWrapper regionNe(String region){
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
    public PcpAreaUpdateEntityWrapper regionGt(String region){
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
    public PcpAreaUpdateEntityWrapper regionGe(String region){
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
    public PcpAreaUpdateEntityWrapper regionLt(String region){
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
    public PcpAreaUpdateEntityWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
    }

    /**
     * <p>区域</p>
     * LIKE '%值%'
     * @param region       值
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionLike(String region){
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
    public PcpAreaUpdateEntityWrapper regionNotLike(String region){
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
    public PcpAreaUpdateEntityWrapper regionLikeLeft(String region){
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
    public PcpAreaUpdateEntityWrapper regionLikeRight(String region){
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
    public PcpAreaUpdateEntityWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>区域</p>
     * IS NOT NULL
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpAreaUpdateEntityWrapper regionIn(Collection<String> value){
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
    public PcpAreaUpdateEntityWrapper regionIn(String... values){
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
    public PcpAreaUpdateEntityWrapper regionNotIn(Collection<String> value){
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
    public PcpAreaUpdateEntityWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }


}
