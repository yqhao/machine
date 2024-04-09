package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.BaiduImages;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 百度镜像
 * </p>
 * "baidu_images"
 * @author PC001
 */
public class BaiduImagesQueryEntityWrapper extends QueryWrapper<BaiduImages> {

    public static BaiduImagesQueryEntityWrapper wrapper(BaiduImages entity) {
        return new BaiduImagesQueryEntityWrapper(entity);
    }

    private BaiduImages entity;

    public BaiduImagesQueryEntityWrapper(BaiduImages entity) {
         this.entity=entity;
    }


    protected BaiduImages entity() {
        if(entity==null){
            throw new NullPointerException("BaiduImages is null");
        }
        return entity;
    }

    @Override
    public BaiduImagesQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public BaiduImagesQueryEntityWrapper selectColumns(Consumer<BaiduImagesSelect> consumer) {
        BaiduImagesSelect select = new BaiduImagesSelect();
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
    public BaiduImagesQueryEntityWrapper idEq(){
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
    public BaiduImagesQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
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
    public BaiduImagesQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduImagesQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduImagesQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idEq(Long id){
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
    public BaiduImagesQueryEntityWrapper idNe(Long id){
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
    public BaiduImagesQueryEntityWrapper idGt(Long id){
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
    public BaiduImagesQueryEntityWrapper idGe(Long id){
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
    public BaiduImagesQueryEntityWrapper idLt(Long id){
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
    public BaiduImagesQueryEntityWrapper idLe(Long id){
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
    public BaiduImagesQueryEntityWrapper idLike(Long id){
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
    public BaiduImagesQueryEntityWrapper idNotLike(Long id){
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
    public BaiduImagesQueryEntityWrapper idLikeLeft(Long id){
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
    public BaiduImagesQueryEntityWrapper idLikeRight(Long id){
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
    public BaiduImagesQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper idIn(Collection<Long> value){
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
    public BaiduImagesQueryEntityWrapper idIn(Long... values){
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
    public BaiduImagesQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public BaiduImagesQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>百度账号id</p>
     * 等于 = entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdEq(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            eq("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 不等于 &lt;&gt; entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdNe(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            ne("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 大于 &gt; entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdGt(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            gt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 大于等于 &gt;= entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdGe(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            ge("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 小于 &lt; entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLt(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            lt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 小于等于 &lt;= entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLe(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * BETWEEN  entity().getFkBaiduAccountId() AND fkBaiduAccountIdEnd
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountId,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountId,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>百度账号id</p>
     * LIKE '%值%'  entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLike(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            like("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT LIKE '%值%'  entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdNotLike(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            notLike("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }


    /**
     * <p>百度账号id</p>
     * LIKE '%值'  entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLikeLeft(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            likeLeft("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * LIKE '值%'  entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLikeRight(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            likeRight("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 等于 =
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdEq(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            eq("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 不等于 &lt;&gt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdNe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ne("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 大于 &gt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdGt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            gt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 大于等于 &gt;=
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdGe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ge("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 小于 &lt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            lt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 小于等于 &lt;=
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * LIKE '%值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            like("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT LIKE '%值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdNotLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            notLike("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }


    /**
     * <p>百度账号id</p>
     * LIKE '%值'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLikeLeft(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeLeft("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * LIKE '值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdLikeRight(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeRight("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdIsNull(){
        isNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdIsNotNull(){
        isNotNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_baidu_account_id",value);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_baidu_account_id",value);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper fkBaiduAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_account_id",values);
        }
        return this;
    }


    /**
     * <p>镜像名称</p>
     * 等于 = entity().getTitle()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleEq(){
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
    public BaiduImagesQueryEntityWrapper titleNe(){
        String title =entity().getTitle();
        if(title!=null){
            ne("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于 &gt; entity().getTitle()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleGt(){
        String title =entity().getTitle();
        if(title!=null){
            gt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于等于 &gt;= entity().getTitle()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleGe(){
        String title =entity().getTitle();
        if(title!=null){
            ge("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于 &lt; entity().getTitle()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleLt(){
        String title =entity().getTitle();
        if(title!=null){
            lt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于等于 &lt;= entity().getTitle()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleLe(){
        String title =entity().getTitle();
        if(title!=null){
            le("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * BETWEEN  entity().getTitle() AND titleEnd
     * @param titleEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleBetween(String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            between("title",title,titleEnd);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT BETWEEN  entity().getTitle() AND 值2
     * @param titleEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleNotBetween(String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            notBetween("title",title,titleEnd);
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
    public BaiduImagesQueryEntityWrapper titleBetween(String titleStart,String titleEnd){
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
    public BaiduImagesQueryEntityWrapper titleNotBetween(String titleStart,String titleEnd){
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
    public BaiduImagesQueryEntityWrapper titleLike(){
        String title =entity().getTitle();
        if(title!=null){
            like("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT LIKE '%值%'  entity().getTitle()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleNotLike(){
        String title =entity().getTitle();
        if(title!=null){
            notLike("title",title);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值'  entity().getTitle()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleLikeLeft(){
        String title =entity().getTitle();
        if(title!=null){
            likeLeft("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * LIKE '值%'  entity().getTitle()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleLikeRight(){
        String title =entity().getTitle();
        if(title!=null){
            likeRight("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 等于 =
     * @param title       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleEq(String title){
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
    public BaiduImagesQueryEntityWrapper titleNe(String title){
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
    public BaiduImagesQueryEntityWrapper titleGt(String title){
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
    public BaiduImagesQueryEntityWrapper titleGe(String title){
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
    public BaiduImagesQueryEntityWrapper titleLt(String title){
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
    public BaiduImagesQueryEntityWrapper titleLe(String title){
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
    public BaiduImagesQueryEntityWrapper titleLike(String title){
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
    public BaiduImagesQueryEntityWrapper titleNotLike(String title){
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
    public BaiduImagesQueryEntityWrapper titleLikeLeft(String title){
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
    public BaiduImagesQueryEntityWrapper titleLikeRight(String title){
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
    public BaiduImagesQueryEntityWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper titleIn(Collection<String> value){
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
    public BaiduImagesQueryEntityWrapper titleIn(String... values){
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
    public BaiduImagesQueryEntityWrapper titleNotIn(Collection<String> value){
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
    public BaiduImagesQueryEntityWrapper titleNotIn(String... values){
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
    public BaiduImagesQueryEntityWrapper versionCodeEq(){
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
    public BaiduImagesQueryEntityWrapper versionCodeNe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            ne("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于 &gt; entity().getVersionCode()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeGt(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            gt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于等于 &gt;= entity().getVersionCode()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeGe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            ge("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于 &lt; entity().getVersionCode()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeLt(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            lt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于等于 &lt;= entity().getVersionCode()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeLe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            le("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * BETWEEN  entity().getVersionCode() AND versionCodeEnd
     * @param versionCodeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeBetween(String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            between("version_code",versionCode,versionCodeEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT BETWEEN  entity().getVersionCode() AND 值2
     * @param versionCodeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeNotBetween(String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            notBetween("version_code",versionCode,versionCodeEnd);
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
    public BaiduImagesQueryEntityWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduImagesQueryEntityWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduImagesQueryEntityWrapper versionCodeLike(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            like("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT LIKE '%值%'  entity().getVersionCode()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeNotLike(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            notLike("version_code",versionCode);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值'  entity().getVersionCode()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeLikeLeft(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            likeLeft("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * LIKE '值%'  entity().getVersionCode()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeLikeRight(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            likeRight("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 等于 =
     * @param versionCode       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeEq(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeNe(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeGt(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeGe(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeLt(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeLe(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeLike(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeNotLike(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeLikeLeft(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeLikeRight(String versionCode){
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
    public BaiduImagesQueryEntityWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper versionCodeIn(Collection<String> value){
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
    public BaiduImagesQueryEntityWrapper versionCodeIn(String... values){
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
    public BaiduImagesQueryEntityWrapper versionCodeNotIn(Collection<String> value){
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
    public BaiduImagesQueryEntityWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlEq(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            eq("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlNe(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            ne("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlGt(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            gt("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlGe(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            ge("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLt(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            lt("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLe(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            le("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileUrl() AND rootImageFileUrlEnd
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlBetween(String rootImageFileUrlEnd){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null && rootImageFileUrlEnd!=null){
            between("root_image_file_url",rootImageFileUrl,rootImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileUrl() AND 值2
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlNotBetween(String rootImageFileUrlEnd){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null && rootImageFileUrlEnd!=null){
            notBetween("root_image_file_url",rootImageFileUrl,rootImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileUrl() AND 值2
     * @param rootImageFileUrlStart       值1
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlBetween(String rootImageFileUrlStart,String rootImageFileUrlEnd){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null && rootImageFileUrlEnd!=null){
            between("root_image_file_url",rootImageFileUrlStart,rootImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileUrl() AND 值2
     * @param rootImageFileUrlStart       值1
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlNotBetween(String rootImageFileUrlStart,String rootImageFileUrlEnd){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null && rootImageFileUrlEnd!=null){
            notBetween("root_image_file_url",rootImageFileUrlStart,rootImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLike(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            like("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlNotLike(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            notLike("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLikeLeft(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            likeLeft("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLikeRight(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            likeRight("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlEq(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            eq("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlNe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            ne("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlGt(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            gt("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlGe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            ge("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLt(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            lt("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            le("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLike(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            like("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlNotLike(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            notLike("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLikeLeft(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            likeLeft("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlLikeRight(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            likeRight("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlIsNull(){
        isNull("root_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlIsNotNull(){
        isNotNull("root_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("root_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlIn(String... values){
        if(values!=null && values.length>0){
            in("root_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_url",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameEq(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            eq("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameNe(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            ne("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameGt(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            gt("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameGe(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            ge("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLt(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            lt("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLe(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            le("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileName() AND rootImageFileNameEnd
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameBetween(String rootImageFileNameEnd){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null && rootImageFileNameEnd!=null){
            between("root_image_file_name",rootImageFileName,rootImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileName() AND 值2
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameNotBetween(String rootImageFileNameEnd){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null && rootImageFileNameEnd!=null){
            notBetween("root_image_file_name",rootImageFileName,rootImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileName() AND 值2
     * @param rootImageFileNameStart       值1
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameBetween(String rootImageFileNameStart,String rootImageFileNameEnd){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null && rootImageFileNameEnd!=null){
            between("root_image_file_name",rootImageFileNameStart,rootImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileName() AND 值2
     * @param rootImageFileNameStart       值1
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameNotBetween(String rootImageFileNameStart,String rootImageFileNameEnd){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null && rootImageFileNameEnd!=null){
            notBetween("root_image_file_name",rootImageFileNameStart,rootImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLike(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            like("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameNotLike(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            notLike("root_image_file_name",rootImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLikeLeft(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            likeLeft("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLikeRight(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            likeRight("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameEq(String rootImageFileName){
        if(rootImageFileName!=null){
            eq("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameNe(String rootImageFileName){
        if(rootImageFileName!=null){
            ne("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameGt(String rootImageFileName){
        if(rootImageFileName!=null){
            gt("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameGe(String rootImageFileName){
        if(rootImageFileName!=null){
            ge("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLt(String rootImageFileName){
        if(rootImageFileName!=null){
            lt("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLe(String rootImageFileName){
        if(rootImageFileName!=null){
            le("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLike(String rootImageFileName){
        if(rootImageFileName!=null){
            like("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameNotLike(String rootImageFileName){
        if(rootImageFileName!=null){
            notLike("root_image_file_name",rootImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLikeLeft(String rootImageFileName){
        if(rootImageFileName!=null){
            likeLeft("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameLikeRight(String rootImageFileName){
        if(rootImageFileName!=null){
            likeRight("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameIsNull(){
        isNull("root_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameIsNotNull(){
        isNotNull("root_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("root_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameIn(String... values){
        if(values!=null && values.length>0){
            in("root_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_name",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeEq(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            eq("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeNe(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            ne("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeGt(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            gt("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeGe(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            ge("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLt(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            lt("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLe(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            le("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileType() AND rootImageFileTypeEnd
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeBetween(String rootImageFileTypeEnd){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null && rootImageFileTypeEnd!=null){
            between("root_image_file_type",rootImageFileType,rootImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileType() AND 值2
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeNotBetween(String rootImageFileTypeEnd){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null && rootImageFileTypeEnd!=null){
            notBetween("root_image_file_type",rootImageFileType,rootImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileType() AND 值2
     * @param rootImageFileTypeStart       值1
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeBetween(String rootImageFileTypeStart,String rootImageFileTypeEnd){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null && rootImageFileTypeEnd!=null){
            between("root_image_file_type",rootImageFileTypeStart,rootImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileType() AND 值2
     * @param rootImageFileTypeStart       值1
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeNotBetween(String rootImageFileTypeStart,String rootImageFileTypeEnd){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null && rootImageFileTypeEnd!=null){
            notBetween("root_image_file_type",rootImageFileTypeStart,rootImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLike(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            like("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeNotLike(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            notLike("root_image_file_type",rootImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLikeLeft(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            likeLeft("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLikeRight(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            likeRight("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeEq(String rootImageFileType){
        if(rootImageFileType!=null){
            eq("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeNe(String rootImageFileType){
        if(rootImageFileType!=null){
            ne("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeGt(String rootImageFileType){
        if(rootImageFileType!=null){
            gt("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeGe(String rootImageFileType){
        if(rootImageFileType!=null){
            ge("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLt(String rootImageFileType){
        if(rootImageFileType!=null){
            lt("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLe(String rootImageFileType){
        if(rootImageFileType!=null){
            le("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLike(String rootImageFileType){
        if(rootImageFileType!=null){
            like("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeNotLike(String rootImageFileType){
        if(rootImageFileType!=null){
            notLike("root_image_file_type",rootImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLikeLeft(String rootImageFileType){
        if(rootImageFileType!=null){
            likeLeft("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeLikeRight(String rootImageFileType){
        if(rootImageFileType!=null){
            likeRight("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeIsNull(){
        isNull("root_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeIsNotNull(){
        isNotNull("root_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("root_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeIn(String... values){
        if(values!=null && values.length>0){
            in("root_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_type",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Eq(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            eq("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Ne(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            ne("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Gt(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            gt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Ge(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            ge("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Lt(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            lt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Le(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            le("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileMd5() AND rootImageFileMd5End
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Between(String rootImageFileMd5End){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null && rootImageFileMd5End!=null){
            between("root_image_file_md5",rootImageFileMd5,rootImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileMd5() AND 值2
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5NotBetween(String rootImageFileMd5End){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null && rootImageFileMd5End!=null){
            notBetween("root_image_file_md5",rootImageFileMd5,rootImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileMd5() AND 值2
     * @param rootImageFileMd5Start       值1
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Between(String rootImageFileMd5Start,String rootImageFileMd5End){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null && rootImageFileMd5End!=null){
            between("root_image_file_md5",rootImageFileMd5Start,rootImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileMd5() AND 值2
     * @param rootImageFileMd5Start       值1
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5NotBetween(String rootImageFileMd5Start,String rootImageFileMd5End){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null && rootImageFileMd5End!=null){
            notBetween("root_image_file_md5",rootImageFileMd5Start,rootImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Like(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            like("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5NotLike(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            notLike("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5LikeLeft(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            likeLeft("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5LikeRight(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            likeRight("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Eq(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            eq("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Ne(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            ne("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Gt(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            gt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Ge(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            ge("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Lt(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            lt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Le(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            le("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5Like(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            like("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5NotLike(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            notLike("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5LikeLeft(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            likeLeft("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5LikeRight(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            likeRight("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5IsNull(){
        isNull("root_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5IsNotNull(){
        isNotNull("root_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("root_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5In(String... values){
        if(values!=null && values.length>0){
            in("root_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper rootImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_md5",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlEq(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            eq("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlNe(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            ne("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlGt(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            gt("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlGe(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            ge("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLt(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            lt("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLe(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            le("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileUrl() AND systemImageFileUrlEnd
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlBetween(String systemImageFileUrlEnd){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null && systemImageFileUrlEnd!=null){
            between("system_image_file_url",systemImageFileUrl,systemImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileUrl() AND 值2
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlNotBetween(String systemImageFileUrlEnd){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null && systemImageFileUrlEnd!=null){
            notBetween("system_image_file_url",systemImageFileUrl,systemImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileUrl() AND 值2
     * @param systemImageFileUrlStart       值1
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlBetween(String systemImageFileUrlStart,String systemImageFileUrlEnd){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null && systemImageFileUrlEnd!=null){
            between("system_image_file_url",systemImageFileUrlStart,systemImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileUrl() AND 值2
     * @param systemImageFileUrlStart       值1
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlNotBetween(String systemImageFileUrlStart,String systemImageFileUrlEnd){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null && systemImageFileUrlEnd!=null){
            notBetween("system_image_file_url",systemImageFileUrlStart,systemImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLike(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            like("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlNotLike(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            notLike("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLikeLeft(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            likeLeft("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLikeRight(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            likeRight("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlEq(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            eq("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlNe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            ne("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlGt(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            gt("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlGe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            ge("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLt(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            lt("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            le("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLike(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            like("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlNotLike(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            notLike("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLikeLeft(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            likeLeft("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlLikeRight(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            likeRight("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlIsNull(){
        isNull("system_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlIsNotNull(){
        isNotNull("system_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("system_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlIn(String... values){
        if(values!=null && values.length>0){
            in("system_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("system_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_url",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameEq(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            eq("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameNe(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            ne("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameGt(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            gt("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameGe(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            ge("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLt(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            lt("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLe(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            le("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileName() AND systemImageFileNameEnd
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameBetween(String systemImageFileNameEnd){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null && systemImageFileNameEnd!=null){
            between("system_image_file_name",systemImageFileName,systemImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileName() AND 值2
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameNotBetween(String systemImageFileNameEnd){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null && systemImageFileNameEnd!=null){
            notBetween("system_image_file_name",systemImageFileName,systemImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileName() AND 值2
     * @param systemImageFileNameStart       值1
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameBetween(String systemImageFileNameStart,String systemImageFileNameEnd){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null && systemImageFileNameEnd!=null){
            between("system_image_file_name",systemImageFileNameStart,systemImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileName() AND 值2
     * @param systemImageFileNameStart       值1
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameNotBetween(String systemImageFileNameStart,String systemImageFileNameEnd){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null && systemImageFileNameEnd!=null){
            notBetween("system_image_file_name",systemImageFileNameStart,systemImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLike(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            like("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameNotLike(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            notLike("system_image_file_name",systemImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLikeLeft(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            likeLeft("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLikeRight(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            likeRight("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameEq(String systemImageFileName){
        if(systemImageFileName!=null){
            eq("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameNe(String systemImageFileName){
        if(systemImageFileName!=null){
            ne("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameGt(String systemImageFileName){
        if(systemImageFileName!=null){
            gt("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameGe(String systemImageFileName){
        if(systemImageFileName!=null){
            ge("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLt(String systemImageFileName){
        if(systemImageFileName!=null){
            lt("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLe(String systemImageFileName){
        if(systemImageFileName!=null){
            le("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLike(String systemImageFileName){
        if(systemImageFileName!=null){
            like("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameNotLike(String systemImageFileName){
        if(systemImageFileName!=null){
            notLike("system_image_file_name",systemImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLikeLeft(String systemImageFileName){
        if(systemImageFileName!=null){
            likeLeft("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameLikeRight(String systemImageFileName){
        if(systemImageFileName!=null){
            likeRight("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameIsNull(){
        isNull("system_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameIsNotNull(){
        isNotNull("system_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("system_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameIn(String... values){
        if(values!=null && values.length>0){
            in("system_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("system_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_name",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeEq(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            eq("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeNe(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            ne("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeGt(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            gt("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeGe(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            ge("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLt(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            lt("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLe(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            le("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileType() AND systemImageFileTypeEnd
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeBetween(String systemImageFileTypeEnd){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null && systemImageFileTypeEnd!=null){
            between("system_image_file_type",systemImageFileType,systemImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileType() AND 值2
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeNotBetween(String systemImageFileTypeEnd){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null && systemImageFileTypeEnd!=null){
            notBetween("system_image_file_type",systemImageFileType,systemImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileType() AND 值2
     * @param systemImageFileTypeStart       值1
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeBetween(String systemImageFileTypeStart,String systemImageFileTypeEnd){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null && systemImageFileTypeEnd!=null){
            between("system_image_file_type",systemImageFileTypeStart,systemImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileType() AND 值2
     * @param systemImageFileTypeStart       值1
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeNotBetween(String systemImageFileTypeStart,String systemImageFileTypeEnd){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null && systemImageFileTypeEnd!=null){
            notBetween("system_image_file_type",systemImageFileTypeStart,systemImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLike(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            like("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeNotLike(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            notLike("system_image_file_type",systemImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLikeLeft(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            likeLeft("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLikeRight(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            likeRight("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeEq(String systemImageFileType){
        if(systemImageFileType!=null){
            eq("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeNe(String systemImageFileType){
        if(systemImageFileType!=null){
            ne("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeGt(String systemImageFileType){
        if(systemImageFileType!=null){
            gt("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeGe(String systemImageFileType){
        if(systemImageFileType!=null){
            ge("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLt(String systemImageFileType){
        if(systemImageFileType!=null){
            lt("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLe(String systemImageFileType){
        if(systemImageFileType!=null){
            le("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLike(String systemImageFileType){
        if(systemImageFileType!=null){
            like("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeNotLike(String systemImageFileType){
        if(systemImageFileType!=null){
            notLike("system_image_file_type",systemImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLikeLeft(String systemImageFileType){
        if(systemImageFileType!=null){
            likeLeft("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeLikeRight(String systemImageFileType){
        if(systemImageFileType!=null){
            likeRight("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeIsNull(){
        isNull("system_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeIsNotNull(){
        isNotNull("system_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("system_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeIn(String... values){
        if(values!=null && values.length>0){
            in("system_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("system_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_type",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Eq(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            eq("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Ne(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            ne("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Gt(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            gt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Ge(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            ge("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Lt(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            lt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Le(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            le("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileMd5() AND systemImageFileMd5End
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Between(String systemImageFileMd5End){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null && systemImageFileMd5End!=null){
            between("system_image_file_md5",systemImageFileMd5,systemImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileMd5() AND 值2
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5NotBetween(String systemImageFileMd5End){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null && systemImageFileMd5End!=null){
            notBetween("system_image_file_md5",systemImageFileMd5,systemImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileMd5() AND 值2
     * @param systemImageFileMd5Start       值1
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Between(String systemImageFileMd5Start,String systemImageFileMd5End){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null && systemImageFileMd5End!=null){
            between("system_image_file_md5",systemImageFileMd5Start,systemImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileMd5() AND 值2
     * @param systemImageFileMd5Start       值1
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5NotBetween(String systemImageFileMd5Start,String systemImageFileMd5End){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null && systemImageFileMd5End!=null){
            notBetween("system_image_file_md5",systemImageFileMd5Start,systemImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Like(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            like("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5NotLike(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            notLike("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5LikeLeft(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            likeLeft("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5LikeRight(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            likeRight("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Eq(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            eq("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Ne(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            ne("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Gt(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            gt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Ge(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            ge("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Lt(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            lt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Le(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            le("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5Like(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            like("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5NotLike(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            notLike("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5LikeLeft(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            likeLeft("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5LikeRight(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            likeRight("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5IsNull(){
        isNull("system_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5IsNotNull(){
        isNotNull("system_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("system_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5In(String... values){
        if(values!=null && values.length>0){
            in("system_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("system_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper systemImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_md5",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlEq(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            eq("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlNe(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            ne("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlGt(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            gt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlGe(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            ge("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLt(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            lt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLe(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            le("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileUrl() AND odmImageFileUrlEnd
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlBetween(String odmImageFileUrlEnd){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null && odmImageFileUrlEnd!=null){
            between("odm_image_file_url",odmImageFileUrl,odmImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileUrl() AND 值2
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlNotBetween(String odmImageFileUrlEnd){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null && odmImageFileUrlEnd!=null){
            notBetween("odm_image_file_url",odmImageFileUrl,odmImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileUrl() AND 值2
     * @param odmImageFileUrlStart       值1
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlBetween(String odmImageFileUrlStart,String odmImageFileUrlEnd){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null && odmImageFileUrlEnd!=null){
            between("odm_image_file_url",odmImageFileUrlStart,odmImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileUrl() AND 值2
     * @param odmImageFileUrlStart       值1
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlNotBetween(String odmImageFileUrlStart,String odmImageFileUrlEnd){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null && odmImageFileUrlEnd!=null){
            notBetween("odm_image_file_url",odmImageFileUrlStart,odmImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLike(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            like("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlNotLike(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            notLike("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLikeLeft(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            likeLeft("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLikeRight(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            likeRight("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlEq(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            eq("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlNe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            ne("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlGt(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            gt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlGe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            ge("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLt(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            lt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            le("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLike(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            like("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlNotLike(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            notLike("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLikeLeft(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            likeLeft("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlLikeRight(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            likeRight("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlIsNull(){
        isNull("odm_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlIsNotNull(){
        isNotNull("odm_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("odm_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlIn(String... values){
        if(values!=null && values.length>0){
            in("odm_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("odm_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_url",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameEq(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            eq("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameNe(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            ne("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameGt(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            gt("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameGe(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            ge("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLt(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            lt("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLe(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            le("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileName() AND odmImageFileNameEnd
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameBetween(String odmImageFileNameEnd){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null && odmImageFileNameEnd!=null){
            between("odm_image_file_name",odmImageFileName,odmImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileName() AND 值2
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameNotBetween(String odmImageFileNameEnd){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null && odmImageFileNameEnd!=null){
            notBetween("odm_image_file_name",odmImageFileName,odmImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileName() AND 值2
     * @param odmImageFileNameStart       值1
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameBetween(String odmImageFileNameStart,String odmImageFileNameEnd){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null && odmImageFileNameEnd!=null){
            between("odm_image_file_name",odmImageFileNameStart,odmImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileName() AND 值2
     * @param odmImageFileNameStart       值1
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameNotBetween(String odmImageFileNameStart,String odmImageFileNameEnd){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null && odmImageFileNameEnd!=null){
            notBetween("odm_image_file_name",odmImageFileNameStart,odmImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLike(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            like("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameNotLike(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            notLike("odm_image_file_name",odmImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLikeLeft(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            likeLeft("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLikeRight(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            likeRight("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameEq(String odmImageFileName){
        if(odmImageFileName!=null){
            eq("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameNe(String odmImageFileName){
        if(odmImageFileName!=null){
            ne("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameGt(String odmImageFileName){
        if(odmImageFileName!=null){
            gt("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameGe(String odmImageFileName){
        if(odmImageFileName!=null){
            ge("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLt(String odmImageFileName){
        if(odmImageFileName!=null){
            lt("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLe(String odmImageFileName){
        if(odmImageFileName!=null){
            le("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLike(String odmImageFileName){
        if(odmImageFileName!=null){
            like("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameNotLike(String odmImageFileName){
        if(odmImageFileName!=null){
            notLike("odm_image_file_name",odmImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLikeLeft(String odmImageFileName){
        if(odmImageFileName!=null){
            likeLeft("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameLikeRight(String odmImageFileName){
        if(odmImageFileName!=null){
            likeRight("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameIsNull(){
        isNull("odm_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameIsNotNull(){
        isNotNull("odm_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("odm_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameIn(String... values){
        if(values!=null && values.length>0){
            in("odm_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("odm_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_name",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeEq(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            eq("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeNe(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            ne("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeGt(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            gt("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeGe(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            ge("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLt(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            lt("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLe(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            le("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileType() AND odmImageFileTypeEnd
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeBetween(String odmImageFileTypeEnd){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null && odmImageFileTypeEnd!=null){
            between("odm_image_file_type",odmImageFileType,odmImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileType() AND 值2
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeNotBetween(String odmImageFileTypeEnd){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null && odmImageFileTypeEnd!=null){
            notBetween("odm_image_file_type",odmImageFileType,odmImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileType() AND 值2
     * @param odmImageFileTypeStart       值1
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeBetween(String odmImageFileTypeStart,String odmImageFileTypeEnd){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null && odmImageFileTypeEnd!=null){
            between("odm_image_file_type",odmImageFileTypeStart,odmImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileType() AND 值2
     * @param odmImageFileTypeStart       值1
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeNotBetween(String odmImageFileTypeStart,String odmImageFileTypeEnd){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null && odmImageFileTypeEnd!=null){
            notBetween("odm_image_file_type",odmImageFileTypeStart,odmImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLike(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            like("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeNotLike(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            notLike("odm_image_file_type",odmImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLikeLeft(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            likeLeft("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLikeRight(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            likeRight("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeEq(String odmImageFileType){
        if(odmImageFileType!=null){
            eq("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeNe(String odmImageFileType){
        if(odmImageFileType!=null){
            ne("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeGt(String odmImageFileType){
        if(odmImageFileType!=null){
            gt("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeGe(String odmImageFileType){
        if(odmImageFileType!=null){
            ge("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLt(String odmImageFileType){
        if(odmImageFileType!=null){
            lt("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLe(String odmImageFileType){
        if(odmImageFileType!=null){
            le("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLike(String odmImageFileType){
        if(odmImageFileType!=null){
            like("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeNotLike(String odmImageFileType){
        if(odmImageFileType!=null){
            notLike("odm_image_file_type",odmImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLikeLeft(String odmImageFileType){
        if(odmImageFileType!=null){
            likeLeft("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeLikeRight(String odmImageFileType){
        if(odmImageFileType!=null){
            likeRight("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeIsNull(){
        isNull("odm_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeIsNotNull(){
        isNotNull("odm_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("odm_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeIn(String... values){
        if(values!=null && values.length>0){
            in("odm_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("odm_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_type",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Eq(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            eq("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Ne(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            ne("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Gt(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            gt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Ge(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            ge("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Lt(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            lt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Le(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            le("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileMd5() AND odmImageFileMd5End
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Between(String odmImageFileMd5End){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null && odmImageFileMd5End!=null){
            between("odm_image_file_md5",odmImageFileMd5,odmImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileMd5() AND 值2
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5NotBetween(String odmImageFileMd5End){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null && odmImageFileMd5End!=null){
            notBetween("odm_image_file_md5",odmImageFileMd5,odmImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileMd5() AND 值2
     * @param odmImageFileMd5Start       值1
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Between(String odmImageFileMd5Start,String odmImageFileMd5End){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null && odmImageFileMd5End!=null){
            between("odm_image_file_md5",odmImageFileMd5Start,odmImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileMd5() AND 值2
     * @param odmImageFileMd5Start       值1
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5NotBetween(String odmImageFileMd5Start,String odmImageFileMd5End){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null && odmImageFileMd5End!=null){
            notBetween("odm_image_file_md5",odmImageFileMd5Start,odmImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Like(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            like("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5NotLike(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            notLike("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5LikeLeft(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            likeLeft("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5LikeRight(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            likeRight("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Eq(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            eq("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Ne(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            ne("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Gt(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            gt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Ge(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            ge("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Lt(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            lt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Le(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            le("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5Like(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            like("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5NotLike(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            notLike("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5LikeLeft(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            likeLeft("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5LikeRight(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            likeRight("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5IsNull(){
        isNull("odm_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5IsNotNull(){
        isNotNull("odm_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("odm_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5In(String... values){
        if(values!=null && values.length>0){
            in("odm_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("odm_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper odmImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_md5",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlEq(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            eq("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlNe(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            ne("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlGt(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            gt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlGe(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            ge("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLt(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            lt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLe(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            le("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileUrl() AND vendorImageFileUrlEnd
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlBetween(String vendorImageFileUrlEnd){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null && vendorImageFileUrlEnd!=null){
            between("vendor_image_file_url",vendorImageFileUrl,vendorImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileUrl() AND 值2
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlNotBetween(String vendorImageFileUrlEnd){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null && vendorImageFileUrlEnd!=null){
            notBetween("vendor_image_file_url",vendorImageFileUrl,vendorImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileUrl() AND 值2
     * @param vendorImageFileUrlStart       值1
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlBetween(String vendorImageFileUrlStart,String vendorImageFileUrlEnd){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null && vendorImageFileUrlEnd!=null){
            between("vendor_image_file_url",vendorImageFileUrlStart,vendorImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileUrl() AND 值2
     * @param vendorImageFileUrlStart       值1
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlNotBetween(String vendorImageFileUrlStart,String vendorImageFileUrlEnd){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null && vendorImageFileUrlEnd!=null){
            notBetween("vendor_image_file_url",vendorImageFileUrlStart,vendorImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLike(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            like("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlNotLike(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            notLike("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLikeLeft(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            likeLeft("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLikeRight(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            likeRight("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlEq(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            eq("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlNe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            ne("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlGt(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            gt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlGe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            ge("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLt(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            lt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            le("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLike(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            like("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlNotLike(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            notLike("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLikeLeft(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            likeLeft("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlLikeRight(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            likeRight("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlIsNull(){
        isNull("vendor_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlIsNotNull(){
        isNotNull("vendor_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("vendor_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlIn(String... values){
        if(values!=null && values.length>0){
            in("vendor_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("vendor_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_url",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameEq(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            eq("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameNe(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            ne("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameGt(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            gt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameGe(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            ge("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLt(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            lt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLe(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            le("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileName() AND vendorImageFileNameEnd
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameBetween(String vendorImageFileNameEnd){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null && vendorImageFileNameEnd!=null){
            between("vendor_image_file_name",vendorImageFileName,vendorImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileName() AND 值2
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameNotBetween(String vendorImageFileNameEnd){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null && vendorImageFileNameEnd!=null){
            notBetween("vendor_image_file_name",vendorImageFileName,vendorImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileName() AND 值2
     * @param vendorImageFileNameStart       值1
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameBetween(String vendorImageFileNameStart,String vendorImageFileNameEnd){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null && vendorImageFileNameEnd!=null){
            between("vendor_image_file_name",vendorImageFileNameStart,vendorImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileName() AND 值2
     * @param vendorImageFileNameStart       值1
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameNotBetween(String vendorImageFileNameStart,String vendorImageFileNameEnd){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null && vendorImageFileNameEnd!=null){
            notBetween("vendor_image_file_name",vendorImageFileNameStart,vendorImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLike(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            like("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameNotLike(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            notLike("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLikeLeft(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            likeLeft("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLikeRight(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            likeRight("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameEq(String vendorImageFileName){
        if(vendorImageFileName!=null){
            eq("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameNe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            ne("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameGt(String vendorImageFileName){
        if(vendorImageFileName!=null){
            gt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameGe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            ge("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLt(String vendorImageFileName){
        if(vendorImageFileName!=null){
            lt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            le("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLike(String vendorImageFileName){
        if(vendorImageFileName!=null){
            like("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameNotLike(String vendorImageFileName){
        if(vendorImageFileName!=null){
            notLike("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLikeLeft(String vendorImageFileName){
        if(vendorImageFileName!=null){
            likeLeft("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameLikeRight(String vendorImageFileName){
        if(vendorImageFileName!=null){
            likeRight("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameIsNull(){
        isNull("vendor_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameIsNotNull(){
        isNotNull("vendor_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("vendor_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameIn(String... values){
        if(values!=null && values.length>0){
            in("vendor_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("vendor_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_name",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeEq(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            eq("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeNe(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            ne("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeGt(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            gt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeGe(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            ge("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLt(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            lt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLe(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            le("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileType() AND vendorImageFileTypeEnd
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeBetween(String vendorImageFileTypeEnd){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null && vendorImageFileTypeEnd!=null){
            between("vendor_image_file_type",vendorImageFileType,vendorImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileType() AND 值2
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeNotBetween(String vendorImageFileTypeEnd){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null && vendorImageFileTypeEnd!=null){
            notBetween("vendor_image_file_type",vendorImageFileType,vendorImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileType() AND 值2
     * @param vendorImageFileTypeStart       值1
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeBetween(String vendorImageFileTypeStart,String vendorImageFileTypeEnd){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null && vendorImageFileTypeEnd!=null){
            between("vendor_image_file_type",vendorImageFileTypeStart,vendorImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileType() AND 值2
     * @param vendorImageFileTypeStart       值1
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeNotBetween(String vendorImageFileTypeStart,String vendorImageFileTypeEnd){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null && vendorImageFileTypeEnd!=null){
            notBetween("vendor_image_file_type",vendorImageFileTypeStart,vendorImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLike(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            like("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeNotLike(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            notLike("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLikeLeft(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            likeLeft("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLikeRight(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            likeRight("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeEq(String vendorImageFileType){
        if(vendorImageFileType!=null){
            eq("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeNe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            ne("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeGt(String vendorImageFileType){
        if(vendorImageFileType!=null){
            gt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeGe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            ge("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLt(String vendorImageFileType){
        if(vendorImageFileType!=null){
            lt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            le("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLike(String vendorImageFileType){
        if(vendorImageFileType!=null){
            like("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeNotLike(String vendorImageFileType){
        if(vendorImageFileType!=null){
            notLike("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLikeLeft(String vendorImageFileType){
        if(vendorImageFileType!=null){
            likeLeft("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeLikeRight(String vendorImageFileType){
        if(vendorImageFileType!=null){
            likeRight("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeIsNull(){
        isNull("vendor_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeIsNotNull(){
        isNotNull("vendor_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("vendor_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeIn(String... values){
        if(values!=null && values.length>0){
            in("vendor_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("vendor_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_type",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Eq(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            eq("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Ne(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            ne("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Gt(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            gt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Ge(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            ge("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Lt(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            lt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Le(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            le("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileMd5() AND vendorImageFileMd5End
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Between(String vendorImageFileMd5End){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null && vendorImageFileMd5End!=null){
            between("vendor_image_file_md5",vendorImageFileMd5,vendorImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileMd5() AND 值2
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5NotBetween(String vendorImageFileMd5End){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null && vendorImageFileMd5End!=null){
            notBetween("vendor_image_file_md5",vendorImageFileMd5,vendorImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileMd5() AND 值2
     * @param vendorImageFileMd5Start       值1
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Between(String vendorImageFileMd5Start,String vendorImageFileMd5End){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null && vendorImageFileMd5End!=null){
            between("vendor_image_file_md5",vendorImageFileMd5Start,vendorImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileMd5() AND 值2
     * @param vendorImageFileMd5Start       值1
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5NotBetween(String vendorImageFileMd5Start,String vendorImageFileMd5End){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null && vendorImageFileMd5End!=null){
            notBetween("vendor_image_file_md5",vendorImageFileMd5Start,vendorImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Like(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            like("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5NotLike(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            notLike("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5LikeLeft(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            likeLeft("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5LikeRight(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            likeRight("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Eq(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            eq("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Ne(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            ne("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Gt(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            gt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Ge(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            ge("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Lt(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            lt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Le(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            le("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5Like(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            like("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5NotLike(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            notLike("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5LikeLeft(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            likeLeft("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5LikeRight(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            likeRight("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5IsNull(){
        isNull("vendor_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5IsNotNull(){
        isNotNull("vendor_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("vendor_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5In(String... values){
        if(values!=null && values.length>0){
            in("vendor_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("vendor_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper vendorImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_md5",values);
        }
        return this;
    }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 等于 = entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeEq(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 不等于 &lt;&gt; entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeNe(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于 &gt; entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeGt(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于等于 &gt;= entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeGe(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于 &lt; entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLt(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于等于 &lt;= entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLe(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * BETWEEN  entity().getServerType() AND serverTypeEnd
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeBetween(String serverTypeEnd){
        String serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeNotBetween(String serverTypeEnd){
        String serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeBetween(String serverTypeStart,String serverTypeEnd){
        String serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeNotBetween(String serverTypeStart,String serverTypeEnd){
        String serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值%'  entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLike(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT LIKE '%值%'  entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeNotLike(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值'  entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLikeLeft(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '值%'  entity().getServerType()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLikeRight(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeEq(String serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 不等于 &lt;&gt;
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeNe(String serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于 &gt;
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeGt(String serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于等于 &gt;=
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeGe(String serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于 &lt;
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLt(String serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于等于 &lt;=
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLe(String serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLike(String serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeNotLike(String serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值'
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLikeLeft(String serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '值%'
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeLikeRight(String serverType){
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("server_type",value);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeIn(String... values){
        if(values!=null && values.length>0){
            in("server_type",values);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_type",value);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper serverTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 等于 = entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionEq(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 不等于 &lt;&gt; entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionNe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于 &gt; entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionGt(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于等于 &gt;= entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionGe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于 &lt; entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLt(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于等于 &lt;= entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * BETWEEN  entity().getRomVersion() AND romVersionEnd
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionBetween(String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            between("rom_version",romVersion,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionNotBetween(String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersion,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionBetween(String romVersionStart,String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            between("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionNotBetween(String romVersionStart,String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值%'  entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLike(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT LIKE '%值%'  entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionNotLike(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
     }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值'  entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLikeLeft(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '值%'  entity().getRomVersion()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLikeRight(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            likeRight("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 等于 =
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionEq(String romVersion){
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 不等于 &lt;&gt;
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionNe(String romVersion){
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于 &gt;
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionGt(String romVersion){
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于等于 &gt;=
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionGe(String romVersion){
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于 &lt;
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLt(String romVersion){
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于等于 &lt;=
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLe(String romVersion){
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLike(String romVersion){
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionNotLike(String romVersion){
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
     }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值'
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLikeLeft(String romVersion){
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '值%'
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionLikeRight(String romVersion){
        if(romVersion!=null){
            likeRight("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionIsNull(){
        isNull("rom_version");
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionIsNotNull(){
        isNotNull("rom_version");
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("rom_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionIn(String... values){
        if(values!=null && values.length>0){
            in("rom_version",values);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("rom_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper romVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rom_version",values);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeEq(Date createTime){
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
    public BaiduImagesQueryEntityWrapper createTimeNe(Date createTime){
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
    public BaiduImagesQueryEntityWrapper createTimeGt(Date createTime){
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
    public BaiduImagesQueryEntityWrapper createTimeGe(Date createTime){
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
    public BaiduImagesQueryEntityWrapper createTimeLt(Date createTime){
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
    public BaiduImagesQueryEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeLike(Date createTime){
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
    public BaiduImagesQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public BaiduImagesQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduImagesQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public BaiduImagesQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public BaiduImagesQueryEntityWrapper createTimeIn(Date... values){
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
    public BaiduImagesQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduImagesQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p>镜像版本id</p>
     * 等于 = entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdEq(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            eq("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 不等于 &lt;&gt; entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdNe(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            ne("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 大于 &gt; entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdGt(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            gt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 大于等于 &gt;= entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdGe(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            ge("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 小于 &lt; entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLt(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            lt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 小于等于 &lt;= entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLe(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * BETWEEN  entity().getImageVersionId() AND imageVersionIdEnd
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdBetween(String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionId,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdNotBetween(String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionId,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdBetween(String imageVersionIdStart,String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdNotBetween(String imageVersionIdStart,String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像版本id</p>
     * LIKE '%值%'  entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLike(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            like("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT LIKE '%值%'  entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdNotLike(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            notLike("image_version_id",imageVersionId);
        }
        return this;
     }


    /**
     * <p>镜像版本id</p>
     * LIKE '%值'  entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLikeLeft(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            likeLeft("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * LIKE '值%'  entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLikeRight(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            likeRight("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 等于 =
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdEq(String imageVersionId){
        if(imageVersionId!=null){
            eq("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdNe(String imageVersionId){
        if(imageVersionId!=null){
            ne("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 大于 &gt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdGt(String imageVersionId){
        if(imageVersionId!=null){
            gt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 大于等于 &gt;=
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdGe(String imageVersionId){
        if(imageVersionId!=null){
            ge("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 小于 &lt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLt(String imageVersionId){
        if(imageVersionId!=null){
            lt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 小于等于 &lt;=
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLe(String imageVersionId){
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * LIKE '%值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLike(String imageVersionId){
        if(imageVersionId!=null){
            like("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT LIKE '%值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdNotLike(String imageVersionId){
        if(imageVersionId!=null){
            notLike("image_version_id",imageVersionId);
        }
        return this;
     }


    /**
     * <p>镜像版本id</p>
     * LIKE '%值'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLikeLeft(String imageVersionId){
        if(imageVersionId!=null){
            likeLeft("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * LIKE '值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdLikeRight(String imageVersionId){
        if(imageVersionId!=null){
            likeRight("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdIsNull(){
        isNull("image_version_id");
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdIsNotNull(){
        isNotNull("image_version_id");
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_version_id",value);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_version_id",value);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper imageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_version_id",values);
        }
        return this;
    }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeEq(){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public BaiduImagesQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }



}
