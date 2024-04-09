package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.PcpConfig;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 华为云配置表
 * </p>
 * "pcp_config"
 * @author PC001
 */
public class PcpConfigQueryWrapper extends QueryWrapper<PcpConfig> {


    public static PcpConfigQueryWrapper wrapper() {
        return new PcpConfigQueryWrapper();
    }

    public PcpConfigQueryWrapper() {
        super();
    }

    public PcpConfigQueryWrapper(PcpConfig entity) {
        super(entity);
    }

    public PcpConfigQueryWrapper(PcpConfig entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public PcpConfigQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public PcpConfigQueryWrapper selectColumns(Consumer<PcpConfigSelect> consumer) {
        PcpConfigSelect select = new PcpConfigSelect();
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
    public PcpConfigQueryWrapper idEq(Long id){
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
    public PcpConfigQueryWrapper idNe(Long id){
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
    public PcpConfigQueryWrapper idGt(Long id){
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
    public PcpConfigQueryWrapper idGe(Long id){
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
    public PcpConfigQueryWrapper idLt(Long id){
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
    public PcpConfigQueryWrapper idLe(Long id){
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
    public PcpConfigQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpConfigQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public PcpConfigQueryWrapper idLike(Long id){
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
    public PcpConfigQueryWrapper idNotLike(Long id){
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
    public PcpConfigQueryWrapper idLikeLeft(Long id){
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
    public PcpConfigQueryWrapper idLikeRight(Long id){
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
    public PcpConfigQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper idIn(Collection<Long> value){
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
    public PcpConfigQueryWrapper idIn(Long... values){
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
    public PcpConfigQueryWrapper idNotIn(Collection<Long> value){
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
    public PcpConfigQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 等于 =
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdEq(String projectId){
        if(projectId!=null){
            eq("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 不等于 &lt;&gt;
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdNe(String projectId){
        if(projectId!=null){
            ne("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于 &gt;
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdGt(String projectId){
        if(projectId!=null){
            gt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于等于 &gt;=
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdGe(String projectId){
        if(projectId!=null){
            ge("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于 &lt;
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdLt(String projectId){
        if(projectId!=null){
            lt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于等于 &lt;=
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdLe(String projectId){
        if(projectId!=null){
            le("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * BETWEEN 值1 AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper projectIdBetween(String projectIdStart,String projectIdEnd){
        if(projectIdStart!=null && projectIdEnd!=null){
            between("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper projectIdNotBetween(String projectIdStart,String projectIdEnd){
        if(projectIdStart!=null && projectIdEnd!=null){
            notBetween("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值%'
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdLike(String projectId){
        if(projectId!=null){
            like("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT LIKE '%值%'
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdNotLike(String projectId){
        if(projectId!=null){
            notLike("project_id",projectId);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值'
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdLikeLeft(String projectId){
        if(projectId!=null){
            likeLeft("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * LIKE '值%'
     * @param projectId       值
     * @return children
     */
    public PcpConfigQueryWrapper projectIdLikeRight(String projectId){
        if(projectId!=null){
            likeRight("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper projectIdIsNull(){
        isNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper projectIdIsNotNull(){
        isNotNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper projectIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("project_id",value);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper projectIdIn(String... values){
        if(values!=null && values.length>0){
            in("project_id",values);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper projectIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("project_id",value);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper projectIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("project_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameEq(String domainName){
        if(domainName!=null){
            eq("domain_name",domainName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameNe(String domainName){
        if(domainName!=null){
            ne("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameGt(String domainName){
        if(domainName!=null){
            gt("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameGe(String domainName){
        if(domainName!=null){
            ge("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameLt(String domainName){
        if(domainName!=null){
            lt("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameLe(String domainName){
        if(domainName!=null){
            le("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param domainNameStart       值1
     * @param domainNameEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper domainNameBetween(String domainNameStart,String domainNameEnd){
        if(domainNameStart!=null && domainNameEnd!=null){
            between("domain_name",domainNameStart,domainNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param domainNameStart       值1
     * @param domainNameEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper domainNameNotBetween(String domainNameStart,String domainNameEnd){
        if(domainNameStart!=null && domainNameEnd!=null){
            notBetween("domain_name",domainNameStart,domainNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameLike(String domainName){
        if(domainName!=null){
            like("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameNotLike(String domainName){
        if(domainName!=null){
            notLike("domain_name",domainName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameLikeLeft(String domainName){
        if(domainName!=null){
            likeLeft("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param domainName       值
     * @return children
     */
    public PcpConfigQueryWrapper domainNameLikeRight(String domainName){
        if(domainName!=null){
            likeRight("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper domainNameIsNull(){
        isNull("domain_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper domainNameIsNotNull(){
        isNotNull("domain_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper domainNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("domain_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper domainNameIn(String... values){
        if(values!=null && values.length>0){
            in("domain_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper domainNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("domain_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper domainNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("domain_name",values);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * 等于 =
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrEq(String iamUsr){
        if(iamUsr!=null){
            eq("iam_usr",iamUsr);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * 不等于 &lt;&gt;
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrNe(String iamUsr){
        if(iamUsr!=null){
            ne("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 大于 &gt;
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrGt(String iamUsr){
        if(iamUsr!=null){
            gt("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 大于等于 &gt;=
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrGe(String iamUsr){
        if(iamUsr!=null){
            ge("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 小于 &lt;
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrLt(String iamUsr){
        if(iamUsr!=null){
            lt("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 小于等于 &lt;=
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrLe(String iamUsr){
        if(iamUsr!=null){
            le("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * BETWEEN 值1 AND 值2
     * @param iamUsrStart       值1
     * @param iamUsrEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrBetween(String iamUsrStart,String iamUsrEnd){
        if(iamUsrStart!=null && iamUsrEnd!=null){
            between("iam_usr",iamUsrStart,iamUsrEnd);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * NOT BETWEEN 值1 AND 值2
     * @param iamUsrStart       值1
     * @param iamUsrEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrNotBetween(String iamUsrStart,String iamUsrEnd){
        if(iamUsrStart!=null && iamUsrEnd!=null){
            notBetween("iam_usr",iamUsrStart,iamUsrEnd);
        }
        return this;
     }


    /**
     * <p>iam用户名</p>
     * LIKE '%值%'
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrLike(String iamUsr){
        if(iamUsr!=null){
            like("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * NOT LIKE '%值%'
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrNotLike(String iamUsr){
        if(iamUsr!=null){
            notLike("iam_usr",iamUsr);
        }
        return this;
     }


    /**
     * <p>iam用户名</p>
     * LIKE '%值'
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrLikeLeft(String iamUsr){
        if(iamUsr!=null){
            likeLeft("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * LIKE '值%'
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrLikeRight(String iamUsr){
        if(iamUsr!=null){
            likeRight("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrIsNull(){
        isNull("iam_usr");
        return this;
    }

    /**
     * <p>iam用户名</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrIsNotNull(){
        isNotNull("iam_usr");
        return this;
    }

    /**
     * <p>iam用户名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("iam_usr",value);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrIn(String... values){
        if(values!=null && values.length>0){
            in("iam_usr",values);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("iam_usr",value);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper iamUsrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("iam_usr",values);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * 等于 =
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdEq(String iamPwd){
        if(iamPwd!=null){
            eq("iam_pwd",iamPwd);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * 不等于 &lt;&gt;
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdNe(String iamPwd){
        if(iamPwd!=null){
            ne("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 大于 &gt;
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdGt(String iamPwd){
        if(iamPwd!=null){
            gt("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 大于等于 &gt;=
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdGe(String iamPwd){
        if(iamPwd!=null){
            ge("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 小于 &lt;
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdLt(String iamPwd){
        if(iamPwd!=null){
            lt("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 小于等于 &lt;=
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdLe(String iamPwd){
        if(iamPwd!=null){
            le("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * BETWEEN 值1 AND 值2
     * @param iamPwdStart       值1
     * @param iamPwdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdBetween(String iamPwdStart,String iamPwdEnd){
        if(iamPwdStart!=null && iamPwdEnd!=null){
            between("iam_pwd",iamPwdStart,iamPwdEnd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * NOT BETWEEN 值1 AND 值2
     * @param iamPwdStart       值1
     * @param iamPwdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdNotBetween(String iamPwdStart,String iamPwdEnd){
        if(iamPwdStart!=null && iamPwdEnd!=null){
            notBetween("iam_pwd",iamPwdStart,iamPwdEnd);
        }
        return this;
     }


    /**
     * <p>iam密码</p>
     * LIKE '%值%'
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdLike(String iamPwd){
        if(iamPwd!=null){
            like("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * NOT LIKE '%值%'
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdNotLike(String iamPwd){
        if(iamPwd!=null){
            notLike("iam_pwd",iamPwd);
        }
        return this;
     }


    /**
     * <p>iam密码</p>
     * LIKE '%值'
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdLikeLeft(String iamPwd){
        if(iamPwd!=null){
            likeLeft("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * LIKE '值%'
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdLikeRight(String iamPwd){
        if(iamPwd!=null){
            likeRight("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdIsNull(){
        isNull("iam_pwd");
        return this;
    }

    /**
     * <p>iam密码</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdIsNotNull(){
        isNotNull("iam_pwd");
        return this;
    }

    /**
     * <p>iam密码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("iam_pwd",value);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdIn(String... values){
        if(values!=null && values.length>0){
            in("iam_pwd",values);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("iam_pwd",value);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper iamPwdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("iam_pwd",values);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * 等于 =
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlEq(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            eq("endpoint_token_url",endpointTokenUrl);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * 不等于 &lt;&gt;
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlNe(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            ne("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 大于 &gt;
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlGt(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            gt("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 大于等于 &gt;=
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlGe(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            ge("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 小于 &lt;
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlLt(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            lt("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 小于等于 &lt;=
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlLe(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            le("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * BETWEEN 值1 AND 值2
     * @param endpointTokenUrlStart       值1
     * @param endpointTokenUrlEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlBetween(String endpointTokenUrlStart,String endpointTokenUrlEnd){
        if(endpointTokenUrlStart!=null && endpointTokenUrlEnd!=null){
            between("endpoint_token_url",endpointTokenUrlStart,endpointTokenUrlEnd);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param endpointTokenUrlStart       值1
     * @param endpointTokenUrlEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlNotBetween(String endpointTokenUrlStart,String endpointTokenUrlEnd){
        if(endpointTokenUrlStart!=null && endpointTokenUrlEnd!=null){
            notBetween("endpoint_token_url",endpointTokenUrlStart,endpointTokenUrlEnd);
        }
        return this;
     }


    /**
     * <p>获取token地址</p>
     * LIKE '%值%'
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlLike(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            like("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * NOT LIKE '%值%'
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlNotLike(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            notLike("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }


    /**
     * <p>获取token地址</p>
     * LIKE '%值'
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlLikeLeft(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            likeLeft("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * LIKE '值%'
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlLikeRight(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            likeRight("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlIsNull(){
        isNull("endpoint_token_url");
        return this;
    }

    /**
     * <p>获取token地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlIsNotNull(){
        isNotNull("endpoint_token_url");
        return this;
    }

    /**
     * <p>获取token地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("endpoint_token_url",value);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlIn(String... values){
        if(values!=null && values.length>0){
            in("endpoint_token_url",values);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("endpoint_token_url",value);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointTokenUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint_token_url",values);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * 等于 =
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlEq(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            eq("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * 不等于 &lt;&gt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlNe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ne("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 大于 &gt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlGt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            gt("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 大于等于 &gt;=
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlGe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ge("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 小于 &lt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlLt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            lt("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 小于等于 &lt;=
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlLe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            le("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * BETWEEN 值1 AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        if(endpointPhonesUrlStart!=null && endpointPhonesUrlEnd!=null){
            between("endpoint_phones_url",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        if(endpointPhonesUrlStart!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpoint_phones_url",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }


    /**
     * <p>api调用地址</p>
     * LIKE '%值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            like("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * NOT LIKE '%值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlNotLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            notLike("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }


    /**
     * <p>api调用地址</p>
     * LIKE '%值'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlLikeLeft(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeLeft("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * LIKE '值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlLikeRight(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeRight("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlIsNull(){
        isNull("endpoint_phones_url");
        return this;
    }

    /**
     * <p>api调用地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlIsNotNull(){
        isNotNull("endpoint_phones_url");
        return this;
    }

    /**
     * <p>api调用地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("endpoint_phones_url",value);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlIn(String... values){
        if(values!=null && values.length>0){
            in("endpoint_phones_url",values);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("endpoint_phones_url",value);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointPhonesUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint_phones_url",values);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * 等于 =
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternEq(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            eq("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * 不等于 &lt;&gt;
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternNe(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            ne("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 大于 &gt;
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternGt(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            gt("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 大于等于 &gt;=
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternGe(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            ge("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 小于 &lt;
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternLt(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            lt("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 小于等于 &lt;=
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternLe(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            le("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * BETWEEN 值1 AND 值2
     * @param endpointUrlPatternStart       值1
     * @param endpointUrlPatternEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternBetween(String endpointUrlPatternStart,String endpointUrlPatternEnd){
        if(endpointUrlPatternStart!=null && endpointUrlPatternEnd!=null){
            between("endpoint_url_pattern",endpointUrlPatternStart,endpointUrlPatternEnd);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * NOT BETWEEN 值1 AND 值2
     * @param endpointUrlPatternStart       值1
     * @param endpointUrlPatternEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternNotBetween(String endpointUrlPatternStart,String endpointUrlPatternEnd){
        if(endpointUrlPatternStart!=null && endpointUrlPatternEnd!=null){
            notBetween("endpoint_url_pattern",endpointUrlPatternStart,endpointUrlPatternEnd);
        }
        return this;
     }


    /**
     * <p>接口url地址模板</p>
     * LIKE '%值%'
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternLike(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            like("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * NOT LIKE '%值%'
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternNotLike(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            notLike("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }


    /**
     * <p>接口url地址模板</p>
     * LIKE '%值'
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternLikeLeft(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            likeLeft("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * LIKE '值%'
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternLikeRight(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            likeRight("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternIsNull(){
        isNull("endpoint_url_pattern");
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternIsNotNull(){
        isNotNull("endpoint_url_pattern");
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("endpoint_url_pattern",value);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternIn(String... values){
        if(values!=null && values.length>0){
            in("endpoint_url_pattern",values);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("endpoint_url_pattern",value);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper endpointUrlPatternNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint_url_pattern",values);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * 等于 =
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdEq(String accessKeyId){
        if(accessKeyId!=null){
            eq("access_key_id",accessKeyId);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * 不等于 &lt;&gt;
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdNe(String accessKeyId){
        if(accessKeyId!=null){
            ne("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 大于 &gt;
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdGt(String accessKeyId){
        if(accessKeyId!=null){
            gt("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 大于等于 &gt;=
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdGe(String accessKeyId){
        if(accessKeyId!=null){
            ge("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 小于 &lt;
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdLt(String accessKeyId){
        if(accessKeyId!=null){
            lt("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 小于等于 &lt;=
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdLe(String accessKeyId){
        if(accessKeyId!=null){
            le("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * BETWEEN 值1 AND 值2
     * @param accessKeyIdStart       值1
     * @param accessKeyIdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdBetween(String accessKeyIdStart,String accessKeyIdEnd){
        if(accessKeyIdStart!=null && accessKeyIdEnd!=null){
            between("access_key_id",accessKeyIdStart,accessKeyIdEnd);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param accessKeyIdStart       值1
     * @param accessKeyIdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdNotBetween(String accessKeyIdStart,String accessKeyIdEnd){
        if(accessKeyIdStart!=null && accessKeyIdEnd!=null){
            notBetween("access_key_id",accessKeyIdStart,accessKeyIdEnd);
        }
        return this;
     }


    /**
     * <p>access_key_id</p>
     * LIKE '%值%'
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdLike(String accessKeyId){
        if(accessKeyId!=null){
            like("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * NOT LIKE '%值%'
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdNotLike(String accessKeyId){
        if(accessKeyId!=null){
            notLike("access_key_id",accessKeyId);
        }
        return this;
     }


    /**
     * <p>access_key_id</p>
     * LIKE '%值'
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdLikeLeft(String accessKeyId){
        if(accessKeyId!=null){
            likeLeft("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * LIKE '值%'
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdLikeRight(String accessKeyId){
        if(accessKeyId!=null){
            likeRight("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdIsNull(){
        isNull("access_key_id");
        return this;
    }

    /**
     * <p>access_key_id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdIsNotNull(){
        isNotNull("access_key_id");
        return this;
    }

    /**
     * <p>access_key_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("access_key_id",value);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdIn(String... values){
        if(values!=null && values.length>0){
            in("access_key_id",values);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("access_key_id",value);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper accessKeyIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("access_key_id",values);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * 等于 =
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyEq(String secretAccessKey){
        if(secretAccessKey!=null){
            eq("secret_access_key",secretAccessKey);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * 不等于 &lt;&gt;
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyNe(String secretAccessKey){
        if(secretAccessKey!=null){
            ne("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 大于 &gt;
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyGt(String secretAccessKey){
        if(secretAccessKey!=null){
            gt("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 大于等于 &gt;=
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyGe(String secretAccessKey){
        if(secretAccessKey!=null){
            ge("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 小于 &lt;
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyLt(String secretAccessKey){
        if(secretAccessKey!=null){
            lt("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 小于等于 &lt;=
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyLe(String secretAccessKey){
        if(secretAccessKey!=null){
            le("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * BETWEEN 值1 AND 值2
     * @param secretAccessKeyStart       值1
     * @param secretAccessKeyEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyBetween(String secretAccessKeyStart,String secretAccessKeyEnd){
        if(secretAccessKeyStart!=null && secretAccessKeyEnd!=null){
            between("secret_access_key",secretAccessKeyStart,secretAccessKeyEnd);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * NOT BETWEEN 值1 AND 值2
     * @param secretAccessKeyStart       值1
     * @param secretAccessKeyEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyNotBetween(String secretAccessKeyStart,String secretAccessKeyEnd){
        if(secretAccessKeyStart!=null && secretAccessKeyEnd!=null){
            notBetween("secret_access_key",secretAccessKeyStart,secretAccessKeyEnd);
        }
        return this;
     }


    /**
     * <p>secret_access_key</p>
     * LIKE '%值%'
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyLike(String secretAccessKey){
        if(secretAccessKey!=null){
            like("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * NOT LIKE '%值%'
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyNotLike(String secretAccessKey){
        if(secretAccessKey!=null){
            notLike("secret_access_key",secretAccessKey);
        }
        return this;
     }


    /**
     * <p>secret_access_key</p>
     * LIKE '%值'
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyLikeLeft(String secretAccessKey){
        if(secretAccessKey!=null){
            likeLeft("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * LIKE '值%'
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyLikeRight(String secretAccessKey){
        if(secretAccessKey!=null){
            likeRight("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyIsNull(){
        isNull("secret_access_key");
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyIsNotNull(){
        isNotNull("secret_access_key");
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("secret_access_key",value);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyIn(String... values){
        if(values!=null && values.length>0){
            in("secret_access_key",values);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("secret_access_key",value);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper secretAccessKeyNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("secret_access_key",values);
        }
        return this;
    }

    /**
     * <p>token</p>
     * 等于 =
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenEq(String token){
        if(token!=null){
            eq("token",token);
        }
        return this;
    }

    /**
     * <p>token</p>
     * 不等于 &lt;&gt;
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenNe(String token){
        if(token!=null){
            ne("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 大于 &gt;
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenGt(String token){
        if(token!=null){
            gt("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 大于等于 &gt;=
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenGe(String token){
        if(token!=null){
            ge("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 小于 &lt;
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenLt(String token){
        if(token!=null){
            lt("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 小于等于 &lt;=
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenLe(String token){
        if(token!=null){
            le("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * BETWEEN 值1 AND 值2
     * @param tokenStart       值1
     * @param tokenEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper tokenBetween(String tokenStart,String tokenEnd){
        if(tokenStart!=null && tokenEnd!=null){
            between("token",tokenStart,tokenEnd);
        }
        return this;
     }

    /**
     * <p>token</p>
     * NOT BETWEEN 值1 AND 值2
     * @param tokenStart       值1
     * @param tokenEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper tokenNotBetween(String tokenStart,String tokenEnd){
        if(tokenStart!=null && tokenEnd!=null){
            notBetween("token",tokenStart,tokenEnd);
        }
        return this;
     }


    /**
     * <p>token</p>
     * LIKE '%值%'
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenLike(String token){
        if(token!=null){
            like("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * NOT LIKE '%值%'
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenNotLike(String token){
        if(token!=null){
            notLike("token",token);
        }
        return this;
     }


    /**
     * <p>token</p>
     * LIKE '%值'
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenLikeLeft(String token){
        if(token!=null){
            likeLeft("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * LIKE '值%'
     * @param token       值
     * @return children
     */
    public PcpConfigQueryWrapper tokenLikeRight(String token){
        if(token!=null){
            likeRight("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper tokenIsNull(){
        isNull("token");
        return this;
    }

    /**
     * <p>token</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper tokenIsNotNull(){
        isNotNull("token");
        return this;
    }

    /**
     * <p>token</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper tokenIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("token",value);
        }
        return this;
    }

    /**
     * <p>token</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper tokenIn(String... values){
        if(values!=null && values.length>0){
            in("token",values);
        }
        return this;
    }

    /**
     * <p>token</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper tokenNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("token",value);
        }
        return this;
    }

    /**
     * <p>token</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper tokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("token",values);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * 等于 =
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateEq(Date expiredDate){
        if(expiredDate!=null){
            eq("expired_date",expiredDate);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * 不等于 &lt;&gt;
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateNe(Date expiredDate){
        if(expiredDate!=null){
            ne("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 大于 &gt;
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateGt(Date expiredDate){
        if(expiredDate!=null){
            gt("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 大于等于 &gt;=
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateGe(Date expiredDate){
        if(expiredDate!=null){
            ge("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 小于 &lt;
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateLt(Date expiredDate){
        if(expiredDate!=null){
            lt("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 小于等于 &lt;=
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateLe(Date expiredDate){
        if(expiredDate!=null){
            le("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * BETWEEN 值1 AND 值2
     * @param expiredDateStart       值1
     * @param expiredDateEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateBetween(Date expiredDateStart,Date expiredDateEnd){
        if(expiredDateStart!=null && expiredDateEnd!=null){
            between("expired_date",expiredDateStart,expiredDateEnd);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param expiredDateStart       值1
     * @param expiredDateEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateNotBetween(Date expiredDateStart,Date expiredDateEnd){
        if(expiredDateStart!=null && expiredDateEnd!=null){
            notBetween("expired_date",expiredDateStart,expiredDateEnd);
        }
        return this;
     }


    /**
     * <p>token 过期时间</p>
     * LIKE '%值%'
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateLike(Date expiredDate){
        if(expiredDate!=null){
            like("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * NOT LIKE '%值%'
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateNotLike(Date expiredDate){
        if(expiredDate!=null){
            notLike("expired_date",expiredDate);
        }
        return this;
     }


    /**
     * <p>token 过期时间</p>
     * LIKE '%值'
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateLikeLeft(Date expiredDate){
        if(expiredDate!=null){
            likeLeft("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * LIKE '值%'
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateLikeRight(Date expiredDate){
        if(expiredDate!=null){
            likeRight("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateIsNull(){
        isNull("expired_date");
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateIsNotNull(){
        isNotNull("expired_date");
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("expired_date",value);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateIn(Date... values){
        if(values!=null && values.length>0){
            in("expired_date",values);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("expired_date",value);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper expiredDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("expired_date",values);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * 等于 =
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameEq(String bucketName){
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * 不等于 &lt;&gt;
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameNe(String bucketName){
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 大于 &gt;
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameGt(String bucketName){
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 大于等于 &gt;=
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameGe(String bucketName){
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 小于 &lt;
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameLt(String bucketName){
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 小于等于 &lt;=
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameLe(String bucketName){
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            between("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>obs存储桶名称</p>
     * LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameLike(String bucketName){
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * NOT LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameNotLike(String bucketName){
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>obs存储桶名称</p>
     * LIKE '%值'
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameLikeLeft(String bucketName){
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * LIKE '值%'
     * @param bucketName       值
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameLikeRight(String bucketName){
        if(bucketName!=null){
            likeRight("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameIn(String... values){
        if(values!=null && values.length>0){
            in("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * 等于 =
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathEq(String objectPath){
        if(objectPath!=null){
            eq("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * 不等于 &lt;&gt;
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathNe(String objectPath){
        if(objectPath!=null){
            ne("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 大于 &gt;
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathGt(String objectPath){
        if(objectPath!=null){
            gt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 大于等于 &gt;=
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathGe(String objectPath){
        if(objectPath!=null){
            ge("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 小于 &lt;
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathLt(String objectPath){
        if(objectPath!=null){
            lt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 小于等于 &lt;=
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathLe(String objectPath){
        if(objectPath!=null){
            le("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * BETWEEN 值1 AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            between("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * NOT BETWEEN 值1 AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>obs存储桶路径</p>
     * LIKE '%值%'
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathLike(String objectPath){
        if(objectPath!=null){
            like("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * NOT LIKE '%值%'
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathNotLike(String objectPath){
        if(objectPath!=null){
            notLike("object_path",objectPath);
        }
        return this;
     }


    /**
     * <p>obs存储桶路径</p>
     * LIKE '%值'
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathLikeLeft(String objectPath){
        if(objectPath!=null){
            likeLeft("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * LIKE '值%'
     * @param objectPath       值
     * @return children
     */
    public PcpConfigQueryWrapper objectPathLikeRight(String objectPath){
        if(objectPath!=null){
            likeRight("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper objectPathIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("object_path",value);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper objectPathIn(String... values){
        if(values!=null && values.length>0){
            in("object_path",values);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper objectPathNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("object_path",value);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper objectPathNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("object_path",values);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public PcpConfigQueryWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public PcpConfigQueryWrapper createTimeEq(Date createTime){
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
    public PcpConfigQueryWrapper createTimeNe(Date createTime){
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
    public PcpConfigQueryWrapper createTimeGt(Date createTime){
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
    public PcpConfigQueryWrapper createTimeGe(Date createTime){
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
    public PcpConfigQueryWrapper createTimeLt(Date createTime){
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
    public PcpConfigQueryWrapper createTimeLe(Date createTime){
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
    public PcpConfigQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpConfigQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpConfigQueryWrapper createTimeLike(Date createTime){
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
    public PcpConfigQueryWrapper createTimeNotLike(Date createTime){
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
    public PcpConfigQueryWrapper createTimeLikeLeft(Date createTime){
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
    public PcpConfigQueryWrapper createTimeLikeRight(Date createTime){
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
    public PcpConfigQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper createTimeIn(Collection<Date> value){
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
    public PcpConfigQueryWrapper createTimeIn(Date... values){
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
    public PcpConfigQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public PcpConfigQueryWrapper createTimeNotIn(Date... values){
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
    public PcpConfigQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public PcpConfigQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public PcpConfigQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public PcpConfigQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public PcpConfigQueryWrapper lastUpdateTimeIn(Date... values){
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
    public PcpConfigQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public PcpConfigQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public PcpConfigQueryWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 不等于 &lt;&gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 大于 &gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 大于等于 &gt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 小于 &lt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 小于等于 &lt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * NOT LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '%值'
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * IS NULL
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpConfigQueryWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


}
