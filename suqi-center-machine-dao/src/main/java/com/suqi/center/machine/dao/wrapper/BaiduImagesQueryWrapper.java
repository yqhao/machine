package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.BaiduImages;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 百度镜像
 * </p>
 * "baidu_images"
 * @author PC001
 */
public class BaiduImagesQueryWrapper extends QueryWrapper<BaiduImages> {


    public static BaiduImagesQueryWrapper wrapper() {
        return new BaiduImagesQueryWrapper();
    }

    public BaiduImagesQueryWrapper() {
        super();
    }

    public BaiduImagesQueryWrapper(BaiduImages entity) {
        super(entity);
    }

    public BaiduImagesQueryWrapper(BaiduImages entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public BaiduImagesQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public BaiduImagesQueryWrapper selectColumns(Consumer<BaiduImagesSelect> consumer) {
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
     * 等于 =
     * @param id       值
     * @return children
     */
    public BaiduImagesQueryWrapper idEq(Long id){
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
    public BaiduImagesQueryWrapper idNe(Long id){
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
    public BaiduImagesQueryWrapper idGt(Long id){
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
    public BaiduImagesQueryWrapper idGe(Long id){
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
    public BaiduImagesQueryWrapper idLt(Long id){
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
    public BaiduImagesQueryWrapper idLe(Long id){
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
    public BaiduImagesQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduImagesQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduImagesQueryWrapper idLike(Long id){
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
    public BaiduImagesQueryWrapper idNotLike(Long id){
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
    public BaiduImagesQueryWrapper idLikeLeft(Long id){
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
    public BaiduImagesQueryWrapper idLikeRight(Long id){
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
    public BaiduImagesQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper idIn(Collection<Long> value){
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
    public BaiduImagesQueryWrapper idIn(Long... values){
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
    public BaiduImagesQueryWrapper idNotIn(Collection<Long> value){
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
    public BaiduImagesQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 等于 =
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryWrapper fkBaiduAccountIdEq(Long fkBaiduAccountId){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdNe(Long fkBaiduAccountId){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdGt(Long fkBaiduAccountId){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdGe(Long fkBaiduAccountId){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdLt(Long fkBaiduAccountId){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdLe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * BETWEEN 值1 AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        if(fkBaiduAccountIdStart!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        if(fkBaiduAccountIdStart!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>百度账号id</p>
     * LIKE '%值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesQueryWrapper fkBaiduAccountIdLike(Long fkBaiduAccountId){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdNotLike(Long fkBaiduAccountId){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdLikeLeft(Long fkBaiduAccountId){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdLikeRight(Long fkBaiduAccountId){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdIsNull(){
        isNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper fkBaiduAccountIdIsNotNull(){
        isNotNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper fkBaiduAccountIdIn(Collection<Long> value){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdIn(Long... values){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdNotIn(Collection<Long> value){
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
    public BaiduImagesQueryWrapper fkBaiduAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 等于 =
     * @param title       值
     * @return children
     */
    public BaiduImagesQueryWrapper titleEq(String title){
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
    public BaiduImagesQueryWrapper titleNe(String title){
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
    public BaiduImagesQueryWrapper titleGt(String title){
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
    public BaiduImagesQueryWrapper titleGe(String title){
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
    public BaiduImagesQueryWrapper titleLt(String title){
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
    public BaiduImagesQueryWrapper titleLe(String title){
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
    public BaiduImagesQueryWrapper titleBetween(String titleStart,String titleEnd){
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
    public BaiduImagesQueryWrapper titleNotBetween(String titleStart,String titleEnd){
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
    public BaiduImagesQueryWrapper titleLike(String title){
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
    public BaiduImagesQueryWrapper titleNotLike(String title){
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
    public BaiduImagesQueryWrapper titleLikeLeft(String title){
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
    public BaiduImagesQueryWrapper titleLikeRight(String title){
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
    public BaiduImagesQueryWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper titleIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper titleIn(String... values){
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
    public BaiduImagesQueryWrapper titleNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper titleNotIn(String... values){
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
    public BaiduImagesQueryWrapper versionCodeEq(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeNe(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeGt(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeGe(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeLt(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeLe(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduImagesQueryWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduImagesQueryWrapper versionCodeLike(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeNotLike(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeLikeLeft(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeLikeRight(String versionCode){
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
    public BaiduImagesQueryWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper versionCodeIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper versionCodeIn(String... values){
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
    public BaiduImagesQueryWrapper versionCodeNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileUrlEq(String rootImageFileUrl){
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
    public BaiduImagesQueryWrapper rootImageFileUrlNe(String rootImageFileUrl){
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
    public BaiduImagesQueryWrapper rootImageFileUrlGt(String rootImageFileUrl){
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
    public BaiduImagesQueryWrapper rootImageFileUrlGe(String rootImageFileUrl){
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
    public BaiduImagesQueryWrapper rootImageFileUrlLt(String rootImageFileUrl){
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
    public BaiduImagesQueryWrapper rootImageFileUrlLe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            le("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rootImageFileUrlStart       值1
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileUrlBetween(String rootImageFileUrlStart,String rootImageFileUrlEnd){
        if(rootImageFileUrlStart!=null && rootImageFileUrlEnd!=null){
            between("root_image_file_url",rootImageFileUrlStart,rootImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootImageFileUrlStart       值1
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileUrlNotBetween(String rootImageFileUrlStart,String rootImageFileUrlEnd){
        if(rootImageFileUrlStart!=null && rootImageFileUrlEnd!=null){
            notBetween("root_image_file_url",rootImageFileUrlStart,rootImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileUrlLike(String rootImageFileUrl){
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
    public BaiduImagesQueryWrapper rootImageFileUrlNotLike(String rootImageFileUrl){
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
    public BaiduImagesQueryWrapper rootImageFileUrlLikeLeft(String rootImageFileUrl){
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
    public BaiduImagesQueryWrapper rootImageFileUrlLikeRight(String rootImageFileUrl){
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
    public BaiduImagesQueryWrapper rootImageFileUrlIsNull(){
        isNull("root_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileUrlIsNotNull(){
        isNotNull("root_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileUrlIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper rootImageFileUrlIn(String... values){
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
    public BaiduImagesQueryWrapper rootImageFileUrlNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper rootImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileNameEq(String rootImageFileName){
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
    public BaiduImagesQueryWrapper rootImageFileNameNe(String rootImageFileName){
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
    public BaiduImagesQueryWrapper rootImageFileNameGt(String rootImageFileName){
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
    public BaiduImagesQueryWrapper rootImageFileNameGe(String rootImageFileName){
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
    public BaiduImagesQueryWrapper rootImageFileNameLt(String rootImageFileName){
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
    public BaiduImagesQueryWrapper rootImageFileNameLe(String rootImageFileName){
        if(rootImageFileName!=null){
            le("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rootImageFileNameStart       值1
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileNameBetween(String rootImageFileNameStart,String rootImageFileNameEnd){
        if(rootImageFileNameStart!=null && rootImageFileNameEnd!=null){
            between("root_image_file_name",rootImageFileNameStart,rootImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootImageFileNameStart       值1
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileNameNotBetween(String rootImageFileNameStart,String rootImageFileNameEnd){
        if(rootImageFileNameStart!=null && rootImageFileNameEnd!=null){
            notBetween("root_image_file_name",rootImageFileNameStart,rootImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileNameLike(String rootImageFileName){
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
    public BaiduImagesQueryWrapper rootImageFileNameNotLike(String rootImageFileName){
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
    public BaiduImagesQueryWrapper rootImageFileNameLikeLeft(String rootImageFileName){
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
    public BaiduImagesQueryWrapper rootImageFileNameLikeRight(String rootImageFileName){
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
    public BaiduImagesQueryWrapper rootImageFileNameIsNull(){
        isNull("root_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileNameIsNotNull(){
        isNotNull("root_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileNameIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper rootImageFileNameIn(String... values){
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
    public BaiduImagesQueryWrapper rootImageFileNameNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper rootImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileTypeEq(String rootImageFileType){
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
    public BaiduImagesQueryWrapper rootImageFileTypeNe(String rootImageFileType){
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
    public BaiduImagesQueryWrapper rootImageFileTypeGt(String rootImageFileType){
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
    public BaiduImagesQueryWrapper rootImageFileTypeGe(String rootImageFileType){
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
    public BaiduImagesQueryWrapper rootImageFileTypeLt(String rootImageFileType){
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
    public BaiduImagesQueryWrapper rootImageFileTypeLe(String rootImageFileType){
        if(rootImageFileType!=null){
            le("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rootImageFileTypeStart       值1
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileTypeBetween(String rootImageFileTypeStart,String rootImageFileTypeEnd){
        if(rootImageFileTypeStart!=null && rootImageFileTypeEnd!=null){
            between("root_image_file_type",rootImageFileTypeStart,rootImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootImageFileTypeStart       值1
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileTypeNotBetween(String rootImageFileTypeStart,String rootImageFileTypeEnd){
        if(rootImageFileTypeStart!=null && rootImageFileTypeEnd!=null){
            notBetween("root_image_file_type",rootImageFileTypeStart,rootImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileTypeLike(String rootImageFileType){
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
    public BaiduImagesQueryWrapper rootImageFileTypeNotLike(String rootImageFileType){
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
    public BaiduImagesQueryWrapper rootImageFileTypeLikeLeft(String rootImageFileType){
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
    public BaiduImagesQueryWrapper rootImageFileTypeLikeRight(String rootImageFileType){
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
    public BaiduImagesQueryWrapper rootImageFileTypeIsNull(){
        isNull("root_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileTypeIsNotNull(){
        isNotNull("root_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileTypeIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper rootImageFileTypeIn(String... values){
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
    public BaiduImagesQueryWrapper rootImageFileTypeNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper rootImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileMd5Eq(String rootImageFileMd5){
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
    public BaiduImagesQueryWrapper rootImageFileMd5Ne(String rootImageFileMd5){
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
    public BaiduImagesQueryWrapper rootImageFileMd5Gt(String rootImageFileMd5){
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
    public BaiduImagesQueryWrapper rootImageFileMd5Ge(String rootImageFileMd5){
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
    public BaiduImagesQueryWrapper rootImageFileMd5Lt(String rootImageFileMd5){
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
    public BaiduImagesQueryWrapper rootImageFileMd5Le(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            le("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rootImageFileMd5Start       值1
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileMd5Between(String rootImageFileMd5Start,String rootImageFileMd5End){
        if(rootImageFileMd5Start!=null && rootImageFileMd5End!=null){
            between("root_image_file_md5",rootImageFileMd5Start,rootImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootImageFileMd5Start       值1
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileMd5NotBetween(String rootImageFileMd5Start,String rootImageFileMd5End){
        if(rootImageFileMd5Start!=null && rootImageFileMd5End!=null){
            notBetween("root_image_file_md5",rootImageFileMd5Start,rootImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileMd5Like(String rootImageFileMd5){
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
    public BaiduImagesQueryWrapper rootImageFileMd5NotLike(String rootImageFileMd5){
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
    public BaiduImagesQueryWrapper rootImageFileMd5LikeLeft(String rootImageFileMd5){
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
    public BaiduImagesQueryWrapper rootImageFileMd5LikeRight(String rootImageFileMd5){
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
    public BaiduImagesQueryWrapper rootImageFileMd5IsNull(){
        isNull("root_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileMd5IsNotNull(){
        isNotNull("root_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper rootImageFileMd5In(Collection<String> value){
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
    public BaiduImagesQueryWrapper rootImageFileMd5In(String... values){
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
    public BaiduImagesQueryWrapper rootImageFileMd5NotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper rootImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileUrlEq(String systemImageFileUrl){
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
    public BaiduImagesQueryWrapper systemImageFileUrlNe(String systemImageFileUrl){
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
    public BaiduImagesQueryWrapper systemImageFileUrlGt(String systemImageFileUrl){
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
    public BaiduImagesQueryWrapper systemImageFileUrlGe(String systemImageFileUrl){
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
    public BaiduImagesQueryWrapper systemImageFileUrlLt(String systemImageFileUrl){
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
    public BaiduImagesQueryWrapper systemImageFileUrlLe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            le("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param systemImageFileUrlStart       值1
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileUrlBetween(String systemImageFileUrlStart,String systemImageFileUrlEnd){
        if(systemImageFileUrlStart!=null && systemImageFileUrlEnd!=null){
            between("system_image_file_url",systemImageFileUrlStart,systemImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param systemImageFileUrlStart       值1
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileUrlNotBetween(String systemImageFileUrlStart,String systemImageFileUrlEnd){
        if(systemImageFileUrlStart!=null && systemImageFileUrlEnd!=null){
            notBetween("system_image_file_url",systemImageFileUrlStart,systemImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileUrlLike(String systemImageFileUrl){
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
    public BaiduImagesQueryWrapper systemImageFileUrlNotLike(String systemImageFileUrl){
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
    public BaiduImagesQueryWrapper systemImageFileUrlLikeLeft(String systemImageFileUrl){
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
    public BaiduImagesQueryWrapper systemImageFileUrlLikeRight(String systemImageFileUrl){
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
    public BaiduImagesQueryWrapper systemImageFileUrlIsNull(){
        isNull("system_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileUrlIsNotNull(){
        isNotNull("system_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileUrlIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper systemImageFileUrlIn(String... values){
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
    public BaiduImagesQueryWrapper systemImageFileUrlNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper systemImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileNameEq(String systemImageFileName){
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
    public BaiduImagesQueryWrapper systemImageFileNameNe(String systemImageFileName){
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
    public BaiduImagesQueryWrapper systemImageFileNameGt(String systemImageFileName){
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
    public BaiduImagesQueryWrapper systemImageFileNameGe(String systemImageFileName){
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
    public BaiduImagesQueryWrapper systemImageFileNameLt(String systemImageFileName){
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
    public BaiduImagesQueryWrapper systemImageFileNameLe(String systemImageFileName){
        if(systemImageFileName!=null){
            le("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param systemImageFileNameStart       值1
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileNameBetween(String systemImageFileNameStart,String systemImageFileNameEnd){
        if(systemImageFileNameStart!=null && systemImageFileNameEnd!=null){
            between("system_image_file_name",systemImageFileNameStart,systemImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param systemImageFileNameStart       值1
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileNameNotBetween(String systemImageFileNameStart,String systemImageFileNameEnd){
        if(systemImageFileNameStart!=null && systemImageFileNameEnd!=null){
            notBetween("system_image_file_name",systemImageFileNameStart,systemImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileNameLike(String systemImageFileName){
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
    public BaiduImagesQueryWrapper systemImageFileNameNotLike(String systemImageFileName){
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
    public BaiduImagesQueryWrapper systemImageFileNameLikeLeft(String systemImageFileName){
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
    public BaiduImagesQueryWrapper systemImageFileNameLikeRight(String systemImageFileName){
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
    public BaiduImagesQueryWrapper systemImageFileNameIsNull(){
        isNull("system_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileNameIsNotNull(){
        isNotNull("system_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileNameIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper systemImageFileNameIn(String... values){
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
    public BaiduImagesQueryWrapper systemImageFileNameNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper systemImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileTypeEq(String systemImageFileType){
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
    public BaiduImagesQueryWrapper systemImageFileTypeNe(String systemImageFileType){
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
    public BaiduImagesQueryWrapper systemImageFileTypeGt(String systemImageFileType){
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
    public BaiduImagesQueryWrapper systemImageFileTypeGe(String systemImageFileType){
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
    public BaiduImagesQueryWrapper systemImageFileTypeLt(String systemImageFileType){
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
    public BaiduImagesQueryWrapper systemImageFileTypeLe(String systemImageFileType){
        if(systemImageFileType!=null){
            le("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param systemImageFileTypeStart       值1
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileTypeBetween(String systemImageFileTypeStart,String systemImageFileTypeEnd){
        if(systemImageFileTypeStart!=null && systemImageFileTypeEnd!=null){
            between("system_image_file_type",systemImageFileTypeStart,systemImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param systemImageFileTypeStart       值1
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileTypeNotBetween(String systemImageFileTypeStart,String systemImageFileTypeEnd){
        if(systemImageFileTypeStart!=null && systemImageFileTypeEnd!=null){
            notBetween("system_image_file_type",systemImageFileTypeStart,systemImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileTypeLike(String systemImageFileType){
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
    public BaiduImagesQueryWrapper systemImageFileTypeNotLike(String systemImageFileType){
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
    public BaiduImagesQueryWrapper systemImageFileTypeLikeLeft(String systemImageFileType){
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
    public BaiduImagesQueryWrapper systemImageFileTypeLikeRight(String systemImageFileType){
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
    public BaiduImagesQueryWrapper systemImageFileTypeIsNull(){
        isNull("system_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileTypeIsNotNull(){
        isNotNull("system_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileTypeIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper systemImageFileTypeIn(String... values){
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
    public BaiduImagesQueryWrapper systemImageFileTypeNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper systemImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileMd5Eq(String systemImageFileMd5){
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
    public BaiduImagesQueryWrapper systemImageFileMd5Ne(String systemImageFileMd5){
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
    public BaiduImagesQueryWrapper systemImageFileMd5Gt(String systemImageFileMd5){
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
    public BaiduImagesQueryWrapper systemImageFileMd5Ge(String systemImageFileMd5){
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
    public BaiduImagesQueryWrapper systemImageFileMd5Lt(String systemImageFileMd5){
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
    public BaiduImagesQueryWrapper systemImageFileMd5Le(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            le("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param systemImageFileMd5Start       值1
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileMd5Between(String systemImageFileMd5Start,String systemImageFileMd5End){
        if(systemImageFileMd5Start!=null && systemImageFileMd5End!=null){
            between("system_image_file_md5",systemImageFileMd5Start,systemImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param systemImageFileMd5Start       值1
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileMd5NotBetween(String systemImageFileMd5Start,String systemImageFileMd5End){
        if(systemImageFileMd5Start!=null && systemImageFileMd5End!=null){
            notBetween("system_image_file_md5",systemImageFileMd5Start,systemImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileMd5Like(String systemImageFileMd5){
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
    public BaiduImagesQueryWrapper systemImageFileMd5NotLike(String systemImageFileMd5){
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
    public BaiduImagesQueryWrapper systemImageFileMd5LikeLeft(String systemImageFileMd5){
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
    public BaiduImagesQueryWrapper systemImageFileMd5LikeRight(String systemImageFileMd5){
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
    public BaiduImagesQueryWrapper systemImageFileMd5IsNull(){
        isNull("system_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileMd5IsNotNull(){
        isNotNull("system_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper systemImageFileMd5In(Collection<String> value){
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
    public BaiduImagesQueryWrapper systemImageFileMd5In(String... values){
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
    public BaiduImagesQueryWrapper systemImageFileMd5NotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper systemImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileUrlEq(String odmImageFileUrl){
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
    public BaiduImagesQueryWrapper odmImageFileUrlNe(String odmImageFileUrl){
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
    public BaiduImagesQueryWrapper odmImageFileUrlGt(String odmImageFileUrl){
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
    public BaiduImagesQueryWrapper odmImageFileUrlGe(String odmImageFileUrl){
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
    public BaiduImagesQueryWrapper odmImageFileUrlLt(String odmImageFileUrl){
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
    public BaiduImagesQueryWrapper odmImageFileUrlLe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            le("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param odmImageFileUrlStart       值1
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileUrlBetween(String odmImageFileUrlStart,String odmImageFileUrlEnd){
        if(odmImageFileUrlStart!=null && odmImageFileUrlEnd!=null){
            between("odm_image_file_url",odmImageFileUrlStart,odmImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param odmImageFileUrlStart       值1
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileUrlNotBetween(String odmImageFileUrlStart,String odmImageFileUrlEnd){
        if(odmImageFileUrlStart!=null && odmImageFileUrlEnd!=null){
            notBetween("odm_image_file_url",odmImageFileUrlStart,odmImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileUrlLike(String odmImageFileUrl){
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
    public BaiduImagesQueryWrapper odmImageFileUrlNotLike(String odmImageFileUrl){
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
    public BaiduImagesQueryWrapper odmImageFileUrlLikeLeft(String odmImageFileUrl){
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
    public BaiduImagesQueryWrapper odmImageFileUrlLikeRight(String odmImageFileUrl){
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
    public BaiduImagesQueryWrapper odmImageFileUrlIsNull(){
        isNull("odm_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileUrlIsNotNull(){
        isNotNull("odm_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileUrlIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper odmImageFileUrlIn(String... values){
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
    public BaiduImagesQueryWrapper odmImageFileUrlNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper odmImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileNameEq(String odmImageFileName){
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
    public BaiduImagesQueryWrapper odmImageFileNameNe(String odmImageFileName){
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
    public BaiduImagesQueryWrapper odmImageFileNameGt(String odmImageFileName){
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
    public BaiduImagesQueryWrapper odmImageFileNameGe(String odmImageFileName){
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
    public BaiduImagesQueryWrapper odmImageFileNameLt(String odmImageFileName){
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
    public BaiduImagesQueryWrapper odmImageFileNameLe(String odmImageFileName){
        if(odmImageFileName!=null){
            le("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param odmImageFileNameStart       值1
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileNameBetween(String odmImageFileNameStart,String odmImageFileNameEnd){
        if(odmImageFileNameStart!=null && odmImageFileNameEnd!=null){
            between("odm_image_file_name",odmImageFileNameStart,odmImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param odmImageFileNameStart       值1
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileNameNotBetween(String odmImageFileNameStart,String odmImageFileNameEnd){
        if(odmImageFileNameStart!=null && odmImageFileNameEnd!=null){
            notBetween("odm_image_file_name",odmImageFileNameStart,odmImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileNameLike(String odmImageFileName){
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
    public BaiduImagesQueryWrapper odmImageFileNameNotLike(String odmImageFileName){
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
    public BaiduImagesQueryWrapper odmImageFileNameLikeLeft(String odmImageFileName){
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
    public BaiduImagesQueryWrapper odmImageFileNameLikeRight(String odmImageFileName){
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
    public BaiduImagesQueryWrapper odmImageFileNameIsNull(){
        isNull("odm_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileNameIsNotNull(){
        isNotNull("odm_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileNameIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper odmImageFileNameIn(String... values){
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
    public BaiduImagesQueryWrapper odmImageFileNameNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper odmImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileTypeEq(String odmImageFileType){
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
    public BaiduImagesQueryWrapper odmImageFileTypeNe(String odmImageFileType){
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
    public BaiduImagesQueryWrapper odmImageFileTypeGt(String odmImageFileType){
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
    public BaiduImagesQueryWrapper odmImageFileTypeGe(String odmImageFileType){
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
    public BaiduImagesQueryWrapper odmImageFileTypeLt(String odmImageFileType){
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
    public BaiduImagesQueryWrapper odmImageFileTypeLe(String odmImageFileType){
        if(odmImageFileType!=null){
            le("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param odmImageFileTypeStart       值1
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileTypeBetween(String odmImageFileTypeStart,String odmImageFileTypeEnd){
        if(odmImageFileTypeStart!=null && odmImageFileTypeEnd!=null){
            between("odm_image_file_type",odmImageFileTypeStart,odmImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param odmImageFileTypeStart       值1
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileTypeNotBetween(String odmImageFileTypeStart,String odmImageFileTypeEnd){
        if(odmImageFileTypeStart!=null && odmImageFileTypeEnd!=null){
            notBetween("odm_image_file_type",odmImageFileTypeStart,odmImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileTypeLike(String odmImageFileType){
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
    public BaiduImagesQueryWrapper odmImageFileTypeNotLike(String odmImageFileType){
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
    public BaiduImagesQueryWrapper odmImageFileTypeLikeLeft(String odmImageFileType){
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
    public BaiduImagesQueryWrapper odmImageFileTypeLikeRight(String odmImageFileType){
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
    public BaiduImagesQueryWrapper odmImageFileTypeIsNull(){
        isNull("odm_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileTypeIsNotNull(){
        isNotNull("odm_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileTypeIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper odmImageFileTypeIn(String... values){
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
    public BaiduImagesQueryWrapper odmImageFileTypeNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper odmImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileMd5Eq(String odmImageFileMd5){
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
    public BaiduImagesQueryWrapper odmImageFileMd5Ne(String odmImageFileMd5){
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
    public BaiduImagesQueryWrapper odmImageFileMd5Gt(String odmImageFileMd5){
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
    public BaiduImagesQueryWrapper odmImageFileMd5Ge(String odmImageFileMd5){
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
    public BaiduImagesQueryWrapper odmImageFileMd5Lt(String odmImageFileMd5){
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
    public BaiduImagesQueryWrapper odmImageFileMd5Le(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            le("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param odmImageFileMd5Start       值1
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileMd5Between(String odmImageFileMd5Start,String odmImageFileMd5End){
        if(odmImageFileMd5Start!=null && odmImageFileMd5End!=null){
            between("odm_image_file_md5",odmImageFileMd5Start,odmImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param odmImageFileMd5Start       值1
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileMd5NotBetween(String odmImageFileMd5Start,String odmImageFileMd5End){
        if(odmImageFileMd5Start!=null && odmImageFileMd5End!=null){
            notBetween("odm_image_file_md5",odmImageFileMd5Start,odmImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileMd5Like(String odmImageFileMd5){
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
    public BaiduImagesQueryWrapper odmImageFileMd5NotLike(String odmImageFileMd5){
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
    public BaiduImagesQueryWrapper odmImageFileMd5LikeLeft(String odmImageFileMd5){
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
    public BaiduImagesQueryWrapper odmImageFileMd5LikeRight(String odmImageFileMd5){
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
    public BaiduImagesQueryWrapper odmImageFileMd5IsNull(){
        isNull("odm_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileMd5IsNotNull(){
        isNotNull("odm_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper odmImageFileMd5In(Collection<String> value){
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
    public BaiduImagesQueryWrapper odmImageFileMd5In(String... values){
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
    public BaiduImagesQueryWrapper odmImageFileMd5NotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper odmImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileUrlEq(String vendorImageFileUrl){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlNe(String vendorImageFileUrl){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlGt(String vendorImageFileUrl){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlGe(String vendorImageFileUrl){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlLt(String vendorImageFileUrl){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlLe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            le("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param vendorImageFileUrlStart       值1
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileUrlBetween(String vendorImageFileUrlStart,String vendorImageFileUrlEnd){
        if(vendorImageFileUrlStart!=null && vendorImageFileUrlEnd!=null){
            between("vendor_image_file_url",vendorImageFileUrlStart,vendorImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param vendorImageFileUrlStart       值1
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileUrlNotBetween(String vendorImageFileUrlStart,String vendorImageFileUrlEnd){
        if(vendorImageFileUrlStart!=null && vendorImageFileUrlEnd!=null){
            notBetween("vendor_image_file_url",vendorImageFileUrlStart,vendorImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileUrlLike(String vendorImageFileUrl){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlNotLike(String vendorImageFileUrl){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlLikeLeft(String vendorImageFileUrl){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlLikeRight(String vendorImageFileUrl){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlIsNull(){
        isNull("vendor_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileUrlIsNotNull(){
        isNotNull("vendor_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileUrlIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlIn(String... values){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper vendorImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileNameEq(String vendorImageFileName){
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
    public BaiduImagesQueryWrapper vendorImageFileNameNe(String vendorImageFileName){
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
    public BaiduImagesQueryWrapper vendorImageFileNameGt(String vendorImageFileName){
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
    public BaiduImagesQueryWrapper vendorImageFileNameGe(String vendorImageFileName){
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
    public BaiduImagesQueryWrapper vendorImageFileNameLt(String vendorImageFileName){
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
    public BaiduImagesQueryWrapper vendorImageFileNameLe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            le("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param vendorImageFileNameStart       值1
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileNameBetween(String vendorImageFileNameStart,String vendorImageFileNameEnd){
        if(vendorImageFileNameStart!=null && vendorImageFileNameEnd!=null){
            between("vendor_image_file_name",vendorImageFileNameStart,vendorImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param vendorImageFileNameStart       值1
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileNameNotBetween(String vendorImageFileNameStart,String vendorImageFileNameEnd){
        if(vendorImageFileNameStart!=null && vendorImageFileNameEnd!=null){
            notBetween("vendor_image_file_name",vendorImageFileNameStart,vendorImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileNameLike(String vendorImageFileName){
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
    public BaiduImagesQueryWrapper vendorImageFileNameNotLike(String vendorImageFileName){
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
    public BaiduImagesQueryWrapper vendorImageFileNameLikeLeft(String vendorImageFileName){
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
    public BaiduImagesQueryWrapper vendorImageFileNameLikeRight(String vendorImageFileName){
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
    public BaiduImagesQueryWrapper vendorImageFileNameIsNull(){
        isNull("vendor_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileNameIsNotNull(){
        isNotNull("vendor_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileNameIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper vendorImageFileNameIn(String... values){
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
    public BaiduImagesQueryWrapper vendorImageFileNameNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper vendorImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileTypeEq(String vendorImageFileType){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeNe(String vendorImageFileType){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeGt(String vendorImageFileType){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeGe(String vendorImageFileType){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeLt(String vendorImageFileType){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeLe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            le("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param vendorImageFileTypeStart       值1
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileTypeBetween(String vendorImageFileTypeStart,String vendorImageFileTypeEnd){
        if(vendorImageFileTypeStart!=null && vendorImageFileTypeEnd!=null){
            between("vendor_image_file_type",vendorImageFileTypeStart,vendorImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param vendorImageFileTypeStart       值1
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileTypeNotBetween(String vendorImageFileTypeStart,String vendorImageFileTypeEnd){
        if(vendorImageFileTypeStart!=null && vendorImageFileTypeEnd!=null){
            notBetween("vendor_image_file_type",vendorImageFileTypeStart,vendorImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileTypeLike(String vendorImageFileType){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeNotLike(String vendorImageFileType){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeLikeLeft(String vendorImageFileType){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeLikeRight(String vendorImageFileType){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeIsNull(){
        isNull("vendor_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileTypeIsNotNull(){
        isNotNull("vendor_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileTypeIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeIn(String... values){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper vendorImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileMd5Eq(String vendorImageFileMd5){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5Ne(String vendorImageFileMd5){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5Gt(String vendorImageFileMd5){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5Ge(String vendorImageFileMd5){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5Lt(String vendorImageFileMd5){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5Le(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            le("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param vendorImageFileMd5Start       值1
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileMd5Between(String vendorImageFileMd5Start,String vendorImageFileMd5End){
        if(vendorImageFileMd5Start!=null && vendorImageFileMd5End!=null){
            between("vendor_image_file_md5",vendorImageFileMd5Start,vendorImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param vendorImageFileMd5Start       值1
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileMd5NotBetween(String vendorImageFileMd5Start,String vendorImageFileMd5End){
        if(vendorImageFileMd5Start!=null && vendorImageFileMd5End!=null){
            notBetween("vendor_image_file_md5",vendorImageFileMd5Start,vendorImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileMd5Like(String vendorImageFileMd5){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5NotLike(String vendorImageFileMd5){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5LikeLeft(String vendorImageFileMd5){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5LikeRight(String vendorImageFileMd5){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5IsNull(){
        isNull("vendor_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileMd5IsNotNull(){
        isNotNull("vendor_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper vendorImageFileMd5In(Collection<String> value){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5In(String... values){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5NotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper vendorImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryWrapper serverTypeEq(String serverType){
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
    public BaiduImagesQueryWrapper serverTypeNe(String serverType){
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
    public BaiduImagesQueryWrapper serverTypeGt(String serverType){
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
    public BaiduImagesQueryWrapper serverTypeGe(String serverType){
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
    public BaiduImagesQueryWrapper serverTypeLt(String serverType){
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
    public BaiduImagesQueryWrapper serverTypeLe(String serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper serverTypeBetween(String serverTypeStart,String serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper serverTypeNotBetween(String serverTypeStart,String serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public BaiduImagesQueryWrapper serverTypeLike(String serverType){
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
    public BaiduImagesQueryWrapper serverTypeNotLike(String serverType){
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
    public BaiduImagesQueryWrapper serverTypeLikeLeft(String serverType){
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
    public BaiduImagesQueryWrapper serverTypeLikeRight(String serverType){
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
    public BaiduImagesQueryWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper serverTypeIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper serverTypeIn(String... values){
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
    public BaiduImagesQueryWrapper serverTypeNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper serverTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 等于 =
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryWrapper romVersionEq(String romVersion){
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
    public BaiduImagesQueryWrapper romVersionNe(String romVersion){
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
    public BaiduImagesQueryWrapper romVersionGt(String romVersion){
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
    public BaiduImagesQueryWrapper romVersionGe(String romVersion){
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
    public BaiduImagesQueryWrapper romVersionLt(String romVersion){
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
    public BaiduImagesQueryWrapper romVersionLe(String romVersion){
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * BETWEEN 值1 AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper romVersionBetween(String romVersionStart,String romVersionEnd){
        if(romVersionStart!=null && romVersionEnd!=null){
            between("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper romVersionNotBetween(String romVersionStart,String romVersionEnd){
        if(romVersionStart!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesQueryWrapper romVersionLike(String romVersion){
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
    public BaiduImagesQueryWrapper romVersionNotLike(String romVersion){
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
    public BaiduImagesQueryWrapper romVersionLikeLeft(String romVersion){
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
    public BaiduImagesQueryWrapper romVersionLikeRight(String romVersion){
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
    public BaiduImagesQueryWrapper romVersionIsNull(){
        isNull("rom_version");
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper romVersionIsNotNull(){
        isNotNull("rom_version");
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper romVersionIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper romVersionIn(String... values){
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
    public BaiduImagesQueryWrapper romVersionNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper romVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rom_version",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public BaiduImagesQueryWrapper createTimeEq(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeNe(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeGt(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeGe(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeLt(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeLe(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduImagesQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduImagesQueryWrapper createTimeLike(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeNotLike(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeLikeRight(Date createTime){
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
    public BaiduImagesQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper createTimeIn(Collection<Date> value){
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
    public BaiduImagesQueryWrapper createTimeIn(Date... values){
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
    public BaiduImagesQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduImagesQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 等于 =
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryWrapper imageVersionIdEq(String imageVersionId){
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
    public BaiduImagesQueryWrapper imageVersionIdNe(String imageVersionId){
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
    public BaiduImagesQueryWrapper imageVersionIdGt(String imageVersionId){
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
    public BaiduImagesQueryWrapper imageVersionIdGe(String imageVersionId){
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
    public BaiduImagesQueryWrapper imageVersionIdLt(String imageVersionId){
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
    public BaiduImagesQueryWrapper imageVersionIdLe(String imageVersionId){
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper imageVersionIdBetween(String imageVersionIdStart,String imageVersionIdEnd){
        if(imageVersionIdStart!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper imageVersionIdNotBetween(String imageVersionIdStart,String imageVersionIdEnd){
        if(imageVersionIdStart!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像版本id</p>
     * LIKE '%值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesQueryWrapper imageVersionIdLike(String imageVersionId){
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
    public BaiduImagesQueryWrapper imageVersionIdNotLike(String imageVersionId){
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
    public BaiduImagesQueryWrapper imageVersionIdLikeLeft(String imageVersionId){
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
    public BaiduImagesQueryWrapper imageVersionIdLikeRight(String imageVersionId){
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
    public BaiduImagesQueryWrapper imageVersionIdIsNull(){
        isNull("image_version_id");
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper imageVersionIdIsNotNull(){
        isNotNull("image_version_id");
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper imageVersionIdIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper imageVersionIdIn(String... values){
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
    public BaiduImagesQueryWrapper imageVersionIdNotIn(Collection<String> value){
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
    public BaiduImagesQueryWrapper imageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryWrapper statusEq(Integer status){
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
    public BaiduImagesQueryWrapper statusNe(Integer status){
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
    public BaiduImagesQueryWrapper statusGt(Integer status){
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
    public BaiduImagesQueryWrapper statusGe(Integer status){
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
    public BaiduImagesQueryWrapper statusLt(Integer status){
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
    public BaiduImagesQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public BaiduImagesQueryWrapper statusLike(Integer status){
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
    public BaiduImagesQueryWrapper statusNotLike(Integer status){
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
    public BaiduImagesQueryWrapper statusLikeLeft(Integer status){
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
    public BaiduImagesQueryWrapper statusLikeRight(Integer status){
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
    public BaiduImagesQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper statusIn(Collection<Integer> value){
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
    public BaiduImagesQueryWrapper statusIn(Integer... values){
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
    public BaiduImagesQueryWrapper statusNotIn(Collection<Integer> value){
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
    public BaiduImagesQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduImagesQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduImagesQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public BaiduImagesQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public BaiduImagesQueryWrapper lastUpdateTimeIn(Date... values){
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
    public BaiduImagesQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public BaiduImagesQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
