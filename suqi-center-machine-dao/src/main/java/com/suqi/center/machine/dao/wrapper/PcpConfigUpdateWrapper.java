package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 华为云配置表
 * </p>
 * "pcp_config"
 * @author PC001
 */
public class PcpConfigUpdateWrapper extends UpdateWrapper<PcpConfig> {

    public static PcpConfigUpdateWrapper wrapper() {
        return new PcpConfigUpdateWrapper();
    }

    public PcpConfigUpdateWrapper() {
        super();
    }

    public PcpConfigUpdateWrapper(PcpConfig entity) {
        super(entity);
    }

    /**
     * 
     */
    public PcpConfigUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 华为项目id
     */
    public PcpConfigUpdateWrapper setProjectId(String projectId) {
         set("project_id",projectId);
        return this;
    }
    /**
     * 
     */
    public PcpConfigUpdateWrapper setDomainName(String domainName) {
         set("domain_name",domainName);
        return this;
    }
    /**
     * iam用户名
     */
    public PcpConfigUpdateWrapper setIamUsr(String iamUsr) {
         set("iam_usr",iamUsr);
        return this;
    }
    /**
     * iam密码
     */
    public PcpConfigUpdateWrapper setIamPwd(String iamPwd) {
         set("iam_pwd",iamPwd);
        return this;
    }
    /**
     * 获取token地址
     */
    public PcpConfigUpdateWrapper setEndpointTokenUrl(String endpointTokenUrl) {
         set("endpoint_token_url",endpointTokenUrl);
        return this;
    }
    /**
     * api调用地址
     */
    public PcpConfigUpdateWrapper setEndpointPhonesUrl(String endpointPhonesUrl) {
         set("endpoint_phones_url",endpointPhonesUrl);
        return this;
    }
    /**
     * 接口url地址模板
     */
    public PcpConfigUpdateWrapper setEndpointUrlPattern(String endpointUrlPattern) {
         set("endpoint_url_pattern",endpointUrlPattern);
        return this;
    }
    /**
     * access_key_id
     */
    public PcpConfigUpdateWrapper setAccessKeyId(String accessKeyId) {
         set("access_key_id",accessKeyId);
        return this;
    }
    /**
     * secret_access_key
     */
    public PcpConfigUpdateWrapper setSecretAccessKey(String secretAccessKey) {
         set("secret_access_key",secretAccessKey);
        return this;
    }
    /**
     * token
     */
    public PcpConfigUpdateWrapper setToken(String token) {
         set("token",token);
        return this;
    }
    /**
     * token 过期时间
     */
    public PcpConfigUpdateWrapper setExpiredDate(Date expiredDate) {
         set("expired_date",expiredDate);
        return this;
    }
    /**
     * obs存储桶名称
     */
    public PcpConfigUpdateWrapper setBucketName(String bucketName) {
         set("bucket_name",bucketName);
        return this;
    }
    /**
     * obs存储桶路径
     */
    public PcpConfigUpdateWrapper setObjectPath(String objectPath) {
         set("object_path",objectPath);
        return this;
    }
    /**
     * 状态（0：关闭，1：启用）
     */
    public PcpConfigUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 创建时间
     */
    public PcpConfigUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public PcpConfigUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public PcpConfigUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * pcp区域表（pcp_area）id
     */
    public PcpConfigUpdateWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public PcpConfigUpdateWrapper idEq(Long id){
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
    public PcpConfigUpdateWrapper idNe(Long id){
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
    public PcpConfigUpdateWrapper idGt(Long id){
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
    public PcpConfigUpdateWrapper idGe(Long id){
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
    public PcpConfigUpdateWrapper idLt(Long id){
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
    public PcpConfigUpdateWrapper idLe(Long id){
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
    public PcpConfigUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpConfigUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public PcpConfigUpdateWrapper idLike(Long id){
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
    public PcpConfigUpdateWrapper idNotLike(Long id){
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
    public PcpConfigUpdateWrapper idLikeLeft(Long id){
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
    public PcpConfigUpdateWrapper idLikeRight(Long id){
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
    public PcpConfigUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper idIn(Collection<Long> value){
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
    public PcpConfigUpdateWrapper idIn(Long... values){
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
    public PcpConfigUpdateWrapper idNotIn(Collection<Long> value){
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
    public PcpConfigUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 等于 = projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdEq(String projectId){
        if(projectId!=null){
            eq("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 不等于 &lt;&gt; projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdNe(String projectId){
        if(projectId!=null){
            ne("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于 &gt; projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdGt(String projectId){
        if(projectId!=null){
            gt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于等于 &gt;= projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdGe(String projectId){
        if(projectId!=null){
            ge("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于 &lt; projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdLt(String projectId){
        if(projectId!=null){
            lt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于等于 &lt;= projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdLe(String projectId){
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
    public PcpConfigUpdateWrapper projectIdBetween(String projectIdStart,String projectIdEnd){
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
    public PcpConfigUpdateWrapper projectIdNotBetween(String projectIdStart,String projectIdEnd){
        if(projectIdStart!=null && projectIdEnd!=null){
            notBetween("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值%' projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdLike(String projectId){
        if(projectId!=null){
            like("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT LIKE '%值%' projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdNotLike(String projectId){
        if(projectId!=null){
            notLike("project_id",projectId);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值' projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdLikeLeft(String projectId){
        if(projectId!=null){
            likeLeft("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * LIKE '值%' projectId
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdLikeRight(String projectId){
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
    public PcpConfigUpdateWrapper projectIdIsNull(){
        isNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdIsNotNull(){
        isNotNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper projectIdIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper projectIdIn(String... values){
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
    public PcpConfigUpdateWrapper projectIdNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper projectIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("project_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameEq(String domainName){
        if(domainName!=null){
            eq("domain_name",domainName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameNe(String domainName){
        if(domainName!=null){
            ne("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameGt(String domainName){
        if(domainName!=null){
            gt("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameGe(String domainName){
        if(domainName!=null){
            ge("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameLt(String domainName){
        if(domainName!=null){
            lt("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameLe(String domainName){
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
    public PcpConfigUpdateWrapper domainNameBetween(String domainNameStart,String domainNameEnd){
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
    public PcpConfigUpdateWrapper domainNameNotBetween(String domainNameStart,String domainNameEnd){
        if(domainNameStart!=null && domainNameEnd!=null){
            notBetween("domain_name",domainNameStart,domainNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameLike(String domainName){
        if(domainName!=null){
            like("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameNotLike(String domainName){
        if(domainName!=null){
            notLike("domain_name",domainName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameLikeLeft(String domainName){
        if(domainName!=null){
            likeLeft("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' domainName
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameLikeRight(String domainName){
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
    public PcpConfigUpdateWrapper domainNameIsNull(){
        isNull("domain_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameIsNotNull(){
        isNotNull("domain_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper domainNameIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper domainNameIn(String... values){
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
    public PcpConfigUpdateWrapper domainNameNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper domainNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("domain_name",values);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * 等于 = iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrEq(String iamUsr){
        if(iamUsr!=null){
            eq("iam_usr",iamUsr);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * 不等于 &lt;&gt; iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrNe(String iamUsr){
        if(iamUsr!=null){
            ne("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 大于 &gt; iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrGt(String iamUsr){
        if(iamUsr!=null){
            gt("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 大于等于 &gt;= iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrGe(String iamUsr){
        if(iamUsr!=null){
            ge("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 小于 &lt; iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrLt(String iamUsr){
        if(iamUsr!=null){
            lt("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 小于等于 &lt;= iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrLe(String iamUsr){
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
    public PcpConfigUpdateWrapper iamUsrBetween(String iamUsrStart,String iamUsrEnd){
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
    public PcpConfigUpdateWrapper iamUsrNotBetween(String iamUsrStart,String iamUsrEnd){
        if(iamUsrStart!=null && iamUsrEnd!=null){
            notBetween("iam_usr",iamUsrStart,iamUsrEnd);
        }
        return this;
     }


    /**
     * <p>iam用户名</p>
     * LIKE '%值%' iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrLike(String iamUsr){
        if(iamUsr!=null){
            like("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * NOT LIKE '%值%' iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrNotLike(String iamUsr){
        if(iamUsr!=null){
            notLike("iam_usr",iamUsr);
        }
        return this;
     }


    /**
     * <p>iam用户名</p>
     * LIKE '%值' iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrLikeLeft(String iamUsr){
        if(iamUsr!=null){
            likeLeft("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * LIKE '值%' iamUsr
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrLikeRight(String iamUsr){
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
    public PcpConfigUpdateWrapper iamUsrIsNull(){
        isNull("iam_usr");
        return this;
    }

    /**
     * <p>iam用户名</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrIsNotNull(){
        isNotNull("iam_usr");
        return this;
    }

    /**
     * <p>iam用户名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper iamUsrIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper iamUsrIn(String... values){
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
    public PcpConfigUpdateWrapper iamUsrNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper iamUsrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("iam_usr",values);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * 等于 = iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdEq(String iamPwd){
        if(iamPwd!=null){
            eq("iam_pwd",iamPwd);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * 不等于 &lt;&gt; iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdNe(String iamPwd){
        if(iamPwd!=null){
            ne("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 大于 &gt; iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdGt(String iamPwd){
        if(iamPwd!=null){
            gt("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 大于等于 &gt;= iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdGe(String iamPwd){
        if(iamPwd!=null){
            ge("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 小于 &lt; iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdLt(String iamPwd){
        if(iamPwd!=null){
            lt("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 小于等于 &lt;= iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdLe(String iamPwd){
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
    public PcpConfigUpdateWrapper iamPwdBetween(String iamPwdStart,String iamPwdEnd){
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
    public PcpConfigUpdateWrapper iamPwdNotBetween(String iamPwdStart,String iamPwdEnd){
        if(iamPwdStart!=null && iamPwdEnd!=null){
            notBetween("iam_pwd",iamPwdStart,iamPwdEnd);
        }
        return this;
     }


    /**
     * <p>iam密码</p>
     * LIKE '%值%' iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdLike(String iamPwd){
        if(iamPwd!=null){
            like("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * NOT LIKE '%值%' iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdNotLike(String iamPwd){
        if(iamPwd!=null){
            notLike("iam_pwd",iamPwd);
        }
        return this;
     }


    /**
     * <p>iam密码</p>
     * LIKE '%值' iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdLikeLeft(String iamPwd){
        if(iamPwd!=null){
            likeLeft("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * LIKE '值%' iamPwd
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdLikeRight(String iamPwd){
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
    public PcpConfigUpdateWrapper iamPwdIsNull(){
        isNull("iam_pwd");
        return this;
    }

    /**
     * <p>iam密码</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdIsNotNull(){
        isNotNull("iam_pwd");
        return this;
    }

    /**
     * <p>iam密码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper iamPwdIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper iamPwdIn(String... values){
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
    public PcpConfigUpdateWrapper iamPwdNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper iamPwdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("iam_pwd",values);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * 等于 = endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlEq(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            eq("endpoint_token_url",endpointTokenUrl);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * 不等于 &lt;&gt; endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlNe(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            ne("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 大于 &gt; endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlGt(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            gt("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 大于等于 &gt;= endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlGe(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            ge("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 小于 &lt; endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlLt(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            lt("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 小于等于 &lt;= endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlLe(String endpointTokenUrl){
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
    public PcpConfigUpdateWrapper endpointTokenUrlBetween(String endpointTokenUrlStart,String endpointTokenUrlEnd){
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
    public PcpConfigUpdateWrapper endpointTokenUrlNotBetween(String endpointTokenUrlStart,String endpointTokenUrlEnd){
        if(endpointTokenUrlStart!=null && endpointTokenUrlEnd!=null){
            notBetween("endpoint_token_url",endpointTokenUrlStart,endpointTokenUrlEnd);
        }
        return this;
     }


    /**
     * <p>获取token地址</p>
     * LIKE '%值%' endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlLike(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            like("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * NOT LIKE '%值%' endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlNotLike(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            notLike("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }


    /**
     * <p>获取token地址</p>
     * LIKE '%值' endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlLikeLeft(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            likeLeft("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * LIKE '值%' endpointTokenUrl
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlLikeRight(String endpointTokenUrl){
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
    public PcpConfigUpdateWrapper endpointTokenUrlIsNull(){
        isNull("endpoint_token_url");
        return this;
    }

    /**
     * <p>获取token地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlIsNotNull(){
        isNotNull("endpoint_token_url");
        return this;
    }

    /**
     * <p>获取token地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper endpointTokenUrlIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper endpointTokenUrlIn(String... values){
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
    public PcpConfigUpdateWrapper endpointTokenUrlNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper endpointTokenUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint_token_url",values);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * 等于 = endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlEq(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            eq("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * 不等于 &lt;&gt; endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlNe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ne("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 大于 &gt; endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlGt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            gt("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 大于等于 &gt;= endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlGe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ge("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 小于 &lt; endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlLt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            lt("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 小于等于 &lt;= endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlLe(String endpointPhonesUrl){
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
    public PcpConfigUpdateWrapper endpointPhonesUrlBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
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
    public PcpConfigUpdateWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        if(endpointPhonesUrlStart!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpoint_phones_url",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }


    /**
     * <p>api调用地址</p>
     * LIKE '%值%' endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            like("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * NOT LIKE '%值%' endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlNotLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            notLike("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }


    /**
     * <p>api调用地址</p>
     * LIKE '%值' endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlLikeLeft(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeLeft("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * LIKE '值%' endpointPhonesUrl
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlLikeRight(String endpointPhonesUrl){
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
    public PcpConfigUpdateWrapper endpointPhonesUrlIsNull(){
        isNull("endpoint_phones_url");
        return this;
    }

    /**
     * <p>api调用地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlIsNotNull(){
        isNotNull("endpoint_phones_url");
        return this;
    }

    /**
     * <p>api调用地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper endpointPhonesUrlIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper endpointPhonesUrlIn(String... values){
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
    public PcpConfigUpdateWrapper endpointPhonesUrlNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper endpointPhonesUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint_phones_url",values);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * 等于 = endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternEq(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            eq("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * 不等于 &lt;&gt; endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternNe(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            ne("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 大于 &gt; endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternGt(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            gt("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 大于等于 &gt;= endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternGe(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            ge("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 小于 &lt; endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternLt(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            lt("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 小于等于 &lt;= endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternLe(String endpointUrlPattern){
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
    public PcpConfigUpdateWrapper endpointUrlPatternBetween(String endpointUrlPatternStart,String endpointUrlPatternEnd){
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
    public PcpConfigUpdateWrapper endpointUrlPatternNotBetween(String endpointUrlPatternStart,String endpointUrlPatternEnd){
        if(endpointUrlPatternStart!=null && endpointUrlPatternEnd!=null){
            notBetween("endpoint_url_pattern",endpointUrlPatternStart,endpointUrlPatternEnd);
        }
        return this;
     }


    /**
     * <p>接口url地址模板</p>
     * LIKE '%值%' endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternLike(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            like("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * NOT LIKE '%值%' endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternNotLike(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            notLike("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }


    /**
     * <p>接口url地址模板</p>
     * LIKE '%值' endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternLikeLeft(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            likeLeft("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * LIKE '值%' endpointUrlPattern
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternLikeRight(String endpointUrlPattern){
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
    public PcpConfigUpdateWrapper endpointUrlPatternIsNull(){
        isNull("endpoint_url_pattern");
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternIsNotNull(){
        isNotNull("endpoint_url_pattern");
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper endpointUrlPatternIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper endpointUrlPatternIn(String... values){
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
    public PcpConfigUpdateWrapper endpointUrlPatternNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper endpointUrlPatternNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint_url_pattern",values);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * 等于 = accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdEq(String accessKeyId){
        if(accessKeyId!=null){
            eq("access_key_id",accessKeyId);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * 不等于 &lt;&gt; accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdNe(String accessKeyId){
        if(accessKeyId!=null){
            ne("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 大于 &gt; accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdGt(String accessKeyId){
        if(accessKeyId!=null){
            gt("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 大于等于 &gt;= accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdGe(String accessKeyId){
        if(accessKeyId!=null){
            ge("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 小于 &lt; accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdLt(String accessKeyId){
        if(accessKeyId!=null){
            lt("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 小于等于 &lt;= accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdLe(String accessKeyId){
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
    public PcpConfigUpdateWrapper accessKeyIdBetween(String accessKeyIdStart,String accessKeyIdEnd){
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
    public PcpConfigUpdateWrapper accessKeyIdNotBetween(String accessKeyIdStart,String accessKeyIdEnd){
        if(accessKeyIdStart!=null && accessKeyIdEnd!=null){
            notBetween("access_key_id",accessKeyIdStart,accessKeyIdEnd);
        }
        return this;
     }


    /**
     * <p>access_key_id</p>
     * LIKE '%值%' accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdLike(String accessKeyId){
        if(accessKeyId!=null){
            like("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * NOT LIKE '%值%' accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdNotLike(String accessKeyId){
        if(accessKeyId!=null){
            notLike("access_key_id",accessKeyId);
        }
        return this;
     }


    /**
     * <p>access_key_id</p>
     * LIKE '%值' accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdLikeLeft(String accessKeyId){
        if(accessKeyId!=null){
            likeLeft("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * LIKE '值%' accessKeyId
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdLikeRight(String accessKeyId){
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
    public PcpConfigUpdateWrapper accessKeyIdIsNull(){
        isNull("access_key_id");
        return this;
    }

    /**
     * <p>access_key_id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdIsNotNull(){
        isNotNull("access_key_id");
        return this;
    }

    /**
     * <p>access_key_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper accessKeyIdIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper accessKeyIdIn(String... values){
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
    public PcpConfigUpdateWrapper accessKeyIdNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper accessKeyIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("access_key_id",values);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * 等于 = secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyEq(String secretAccessKey){
        if(secretAccessKey!=null){
            eq("secret_access_key",secretAccessKey);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * 不等于 &lt;&gt; secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyNe(String secretAccessKey){
        if(secretAccessKey!=null){
            ne("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 大于 &gt; secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyGt(String secretAccessKey){
        if(secretAccessKey!=null){
            gt("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 大于等于 &gt;= secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyGe(String secretAccessKey){
        if(secretAccessKey!=null){
            ge("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 小于 &lt; secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyLt(String secretAccessKey){
        if(secretAccessKey!=null){
            lt("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 小于等于 &lt;= secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyLe(String secretAccessKey){
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
    public PcpConfigUpdateWrapper secretAccessKeyBetween(String secretAccessKeyStart,String secretAccessKeyEnd){
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
    public PcpConfigUpdateWrapper secretAccessKeyNotBetween(String secretAccessKeyStart,String secretAccessKeyEnd){
        if(secretAccessKeyStart!=null && secretAccessKeyEnd!=null){
            notBetween("secret_access_key",secretAccessKeyStart,secretAccessKeyEnd);
        }
        return this;
     }


    /**
     * <p>secret_access_key</p>
     * LIKE '%值%' secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyLike(String secretAccessKey){
        if(secretAccessKey!=null){
            like("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * NOT LIKE '%值%' secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyNotLike(String secretAccessKey){
        if(secretAccessKey!=null){
            notLike("secret_access_key",secretAccessKey);
        }
        return this;
     }


    /**
     * <p>secret_access_key</p>
     * LIKE '%值' secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyLikeLeft(String secretAccessKey){
        if(secretAccessKey!=null){
            likeLeft("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * LIKE '值%' secretAccessKey
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyLikeRight(String secretAccessKey){
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
    public PcpConfigUpdateWrapper secretAccessKeyIsNull(){
        isNull("secret_access_key");
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyIsNotNull(){
        isNotNull("secret_access_key");
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper secretAccessKeyIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper secretAccessKeyIn(String... values){
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
    public PcpConfigUpdateWrapper secretAccessKeyNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper secretAccessKeyNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("secret_access_key",values);
        }
        return this;
    }

    /**
     * <p>token</p>
     * 等于 = token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenEq(String token){
        if(token!=null){
            eq("token",token);
        }
        return this;
    }

    /**
     * <p>token</p>
     * 不等于 &lt;&gt; token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenNe(String token){
        if(token!=null){
            ne("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 大于 &gt; token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenGt(String token){
        if(token!=null){
            gt("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 大于等于 &gt;= token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenGe(String token){
        if(token!=null){
            ge("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 小于 &lt; token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenLt(String token){
        if(token!=null){
            lt("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 小于等于 &lt;= token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenLe(String token){
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
    public PcpConfigUpdateWrapper tokenBetween(String tokenStart,String tokenEnd){
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
    public PcpConfigUpdateWrapper tokenNotBetween(String tokenStart,String tokenEnd){
        if(tokenStart!=null && tokenEnd!=null){
            notBetween("token",tokenStart,tokenEnd);
        }
        return this;
     }


    /**
     * <p>token</p>
     * LIKE '%值%' token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenLike(String token){
        if(token!=null){
            like("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * NOT LIKE '%值%' token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenNotLike(String token){
        if(token!=null){
            notLike("token",token);
        }
        return this;
     }


    /**
     * <p>token</p>
     * LIKE '%值' token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenLikeLeft(String token){
        if(token!=null){
            likeLeft("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * LIKE '值%' token
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateWrapper tokenLikeRight(String token){
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
    public PcpConfigUpdateWrapper tokenIsNull(){
        isNull("token");
        return this;
    }

    /**
     * <p>token</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper tokenIsNotNull(){
        isNotNull("token");
        return this;
    }

    /**
     * <p>token</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper tokenIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper tokenIn(String... values){
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
    public PcpConfigUpdateWrapper tokenNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper tokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("token",values);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * 等于 = expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateEq(Date expiredDate){
        if(expiredDate!=null){
            eq("expired_date",expiredDate);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * 不等于 &lt;&gt; expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateNe(Date expiredDate){
        if(expiredDate!=null){
            ne("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 大于 &gt; expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateGt(Date expiredDate){
        if(expiredDate!=null){
            gt("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 大于等于 &gt;= expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateGe(Date expiredDate){
        if(expiredDate!=null){
            ge("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 小于 &lt; expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateLt(Date expiredDate){
        if(expiredDate!=null){
            lt("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 小于等于 &lt;= expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateLe(Date expiredDate){
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
    public PcpConfigUpdateWrapper expiredDateBetween(Date expiredDateStart,Date expiredDateEnd){
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
    public PcpConfigUpdateWrapper expiredDateNotBetween(Date expiredDateStart,Date expiredDateEnd){
        if(expiredDateStart!=null && expiredDateEnd!=null){
            notBetween("expired_date",expiredDateStart,expiredDateEnd);
        }
        return this;
     }


    /**
     * <p>token 过期时间</p>
     * LIKE '%值%' expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateLike(Date expiredDate){
        if(expiredDate!=null){
            like("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * NOT LIKE '%值%' expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateNotLike(Date expiredDate){
        if(expiredDate!=null){
            notLike("expired_date",expiredDate);
        }
        return this;
     }


    /**
     * <p>token 过期时间</p>
     * LIKE '%值' expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateLikeLeft(Date expiredDate){
        if(expiredDate!=null){
            likeLeft("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * LIKE '值%' expiredDate
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateLikeRight(Date expiredDate){
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
    public PcpConfigUpdateWrapper expiredDateIsNull(){
        isNull("expired_date");
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateIsNotNull(){
        isNotNull("expired_date");
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper expiredDateIn(Collection<Date> value){
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
    public PcpConfigUpdateWrapper expiredDateIn(Date... values){
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
    public PcpConfigUpdateWrapper expiredDateNotIn(Collection<Date> value){
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
    public PcpConfigUpdateWrapper expiredDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("expired_date",values);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * 等于 = bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameEq(String bucketName){
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * 不等于 &lt;&gt; bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameNe(String bucketName){
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 大于 &gt; bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameGt(String bucketName){
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 大于等于 &gt;= bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameGe(String bucketName){
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 小于 &lt; bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameLt(String bucketName){
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 小于等于 &lt;= bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameLe(String bucketName){
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
    public PcpConfigUpdateWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
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
    public PcpConfigUpdateWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>obs存储桶名称</p>
     * LIKE '%值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameLike(String bucketName){
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * NOT LIKE '%值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameNotLike(String bucketName){
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>obs存储桶名称</p>
     * LIKE '%值' bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameLikeLeft(String bucketName){
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * LIKE '值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameLikeRight(String bucketName){
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
    public PcpConfigUpdateWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper bucketNameIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper bucketNameIn(String... values){
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
    public PcpConfigUpdateWrapper bucketNameNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * 等于 = objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathEq(String objectPath){
        if(objectPath!=null){
            eq("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * 不等于 &lt;&gt; objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathNe(String objectPath){
        if(objectPath!=null){
            ne("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 大于 &gt; objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathGt(String objectPath){
        if(objectPath!=null){
            gt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 大于等于 &gt;= objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathGe(String objectPath){
        if(objectPath!=null){
            ge("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 小于 &lt; objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathLt(String objectPath){
        if(objectPath!=null){
            lt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 小于等于 &lt;= objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathLe(String objectPath){
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
    public PcpConfigUpdateWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
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
    public PcpConfigUpdateWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>obs存储桶路径</p>
     * LIKE '%值%' objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathLike(String objectPath){
        if(objectPath!=null){
            like("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * NOT LIKE '%值%' objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathNotLike(String objectPath){
        if(objectPath!=null){
            notLike("object_path",objectPath);
        }
        return this;
     }


    /**
     * <p>obs存储桶路径</p>
     * LIKE '%值' objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathLikeLeft(String objectPath){
        if(objectPath!=null){
            likeLeft("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * LIKE '值%' objectPath
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathLikeRight(String objectPath){
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
    public PcpConfigUpdateWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper objectPathIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper objectPathIn(String... values){
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
    public PcpConfigUpdateWrapper objectPathNotIn(Collection<String> value){
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
    public PcpConfigUpdateWrapper objectPathNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("object_path",values);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusLe(Integer status){
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
    public PcpConfigUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public PcpConfigUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateWrapper statusLikeRight(Integer status){
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
    public PcpConfigUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper statusIn(Collection<Integer> value){
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
    public PcpConfigUpdateWrapper statusIn(Integer... values){
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
    public PcpConfigUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public PcpConfigUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeLe(Date createTime){
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
    public PcpConfigUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpConfigUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeLikeRight(Date createTime){
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
    public PcpConfigUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper createTimeIn(Collection<Date> value){
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
    public PcpConfigUpdateWrapper createTimeIn(Date... values){
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
    public PcpConfigUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public PcpConfigUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public PcpConfigUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public PcpConfigUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public PcpConfigUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public PcpConfigUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public PcpConfigUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public PcpConfigUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdLe(Long versionId){
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
    public PcpConfigUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public PcpConfigUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' versionId
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdLikeRight(Long versionId){
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
    public PcpConfigUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper versionIdIn(Collection<Long> value){
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
    public PcpConfigUpdateWrapper versionIdIn(Long... values){
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
    public PcpConfigUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public PcpConfigUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 等于 = fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 不等于 &lt;&gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 大于 &gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 大于等于 &gt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 小于 &lt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 小于等于 &lt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
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
    public PcpConfigUpdateWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
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
    public PcpConfigUpdateWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * NOT LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '%值' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public PcpConfigUpdateWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public PcpConfigUpdateWrapper fkPcpAreaIdIn(Long... values){
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
    public PcpConfigUpdateWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public PcpConfigUpdateWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


}
