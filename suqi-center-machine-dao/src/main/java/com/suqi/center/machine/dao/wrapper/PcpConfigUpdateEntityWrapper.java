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
public class PcpConfigUpdateEntityWrapper extends UpdateWrapper<PcpConfig> {

    public static PcpConfigUpdateEntityWrapper wrapper(PcpConfig entity) {
        return new PcpConfigUpdateEntityWrapper(entity);
    }

    private PcpConfig entity;

    public PcpConfigUpdateEntityWrapper(PcpConfig entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public PcpConfigUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 华为项目id
     */
    public PcpConfigUpdateEntityWrapper setProjectId(String projectId) {
         set("project_id",projectId);
        return this;
    }
    /**
     * 
     */
    public PcpConfigUpdateEntityWrapper setDomainName(String domainName) {
         set("domain_name",domainName);
        return this;
    }
    /**
     * iam用户名
     */
    public PcpConfigUpdateEntityWrapper setIamUsr(String iamUsr) {
         set("iam_usr",iamUsr);
        return this;
    }
    /**
     * iam密码
     */
    public PcpConfigUpdateEntityWrapper setIamPwd(String iamPwd) {
         set("iam_pwd",iamPwd);
        return this;
    }
    /**
     * 获取token地址
     */
    public PcpConfigUpdateEntityWrapper setEndpointTokenUrl(String endpointTokenUrl) {
         set("endpoint_token_url",endpointTokenUrl);
        return this;
    }
    /**
     * api调用地址
     */
    public PcpConfigUpdateEntityWrapper setEndpointPhonesUrl(String endpointPhonesUrl) {
         set("endpoint_phones_url",endpointPhonesUrl);
        return this;
    }
    /**
     * 接口url地址模板
     */
    public PcpConfigUpdateEntityWrapper setEndpointUrlPattern(String endpointUrlPattern) {
         set("endpoint_url_pattern",endpointUrlPattern);
        return this;
    }
    /**
     * access_key_id
     */
    public PcpConfigUpdateEntityWrapper setAccessKeyId(String accessKeyId) {
         set("access_key_id",accessKeyId);
        return this;
    }
    /**
     * secret_access_key
     */
    public PcpConfigUpdateEntityWrapper setSecretAccessKey(String secretAccessKey) {
         set("secret_access_key",secretAccessKey);
        return this;
    }
    /**
     * token
     */
    public PcpConfigUpdateEntityWrapper setToken(String token) {
         set("token",token);
        return this;
    }
    /**
     * token 过期时间
     */
    public PcpConfigUpdateEntityWrapper setExpiredDate(Date expiredDate) {
         set("expired_date",expiredDate);
        return this;
    }
    /**
     * obs存储桶名称
     */
    public PcpConfigUpdateEntityWrapper setBucketName(String bucketName) {
         set("bucket_name",bucketName);
        return this;
    }
    /**
     * obs存储桶路径
     */
    public PcpConfigUpdateEntityWrapper setObjectPath(String objectPath) {
         set("object_path",objectPath);
        return this;
    }
    /**
     * 状态（0：关闭，1：启用）
     */
    public PcpConfigUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 创建时间
     */
    public PcpConfigUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public PcpConfigUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public PcpConfigUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * pcp区域表（pcp_area）id
     */
    public PcpConfigUpdateEntityWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }

    protected PcpConfig entity() {
        if(entity==null){
            throw new NullPointerException("PcpConfig is null");
        }
        return entity;
    }

    /**
     * 
     */
    public PcpConfigUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 华为项目id
     */
    public PcpConfigUpdateEntityWrapper setProjectId() {
        String projectId =entity().getProjectId();
        if(projectId!=null){
            set("project_id",projectId);
        }
        return this;
    }
    /**
     * 
     */
    public PcpConfigUpdateEntityWrapper setDomainName() {
        String domainName =entity().getDomainName();
        if(domainName!=null){
            set("domain_name",domainName);
        }
        return this;
    }
    /**
     * iam用户名
     */
    public PcpConfigUpdateEntityWrapper setIamUsr() {
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            set("iam_usr",iamUsr);
        }
        return this;
    }
    /**
     * iam密码
     */
    public PcpConfigUpdateEntityWrapper setIamPwd() {
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            set("iam_pwd",iamPwd);
        }
        return this;
    }
    /**
     * 获取token地址
     */
    public PcpConfigUpdateEntityWrapper setEndpointTokenUrl() {
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            set("endpoint_token_url",endpointTokenUrl);
        }
        return this;
    }
    /**
     * api调用地址
     */
    public PcpConfigUpdateEntityWrapper setEndpointPhonesUrl() {
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            set("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
    }
    /**
     * 接口url地址模板
     */
    public PcpConfigUpdateEntityWrapper setEndpointUrlPattern() {
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            set("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
    }
    /**
     * access_key_id
     */
    public PcpConfigUpdateEntityWrapper setAccessKeyId() {
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            set("access_key_id",accessKeyId);
        }
        return this;
    }
    /**
     * secret_access_key
     */
    public PcpConfigUpdateEntityWrapper setSecretAccessKey() {
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            set("secret_access_key",secretAccessKey);
        }
        return this;
    }
    /**
     * token
     */
    public PcpConfigUpdateEntityWrapper setToken() {
        String token =entity().getToken();
        if(token!=null){
            set("token",token);
        }
        return this;
    }
    /**
     * token 过期时间
     */
    public PcpConfigUpdateEntityWrapper setExpiredDate() {
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            set("expired_date",expiredDate);
        }
        return this;
    }
    /**
     * obs存储桶名称
     */
    public PcpConfigUpdateEntityWrapper setBucketName() {
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            set("bucket_name",bucketName);
        }
        return this;
    }
    /**
     * obs存储桶路径
     */
    public PcpConfigUpdateEntityWrapper setObjectPath() {
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            set("object_path",objectPath);
        }
        return this;
    }
    /**
     * 状态（0：关闭，1：启用）
     */
    public PcpConfigUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public PcpConfigUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 最后修改时间
     */
    public PcpConfigUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 
     */
    public PcpConfigUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }
    /**
     * pcp区域表（pcp_area）id
     */
    public PcpConfigUpdateEntityWrapper setFkPcpAreaId() {
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            set("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    public PcpConfigUpdateEntityWrapper Where() {
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper idEq(){
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
    public PcpConfigUpdateEntityWrapper idNe(){
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
    public PcpConfigUpdateEntityWrapper idGt(){
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
    public PcpConfigUpdateEntityWrapper idGe(){
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
    public PcpConfigUpdateEntityWrapper idLt(){
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
    public PcpConfigUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper idBetween(Long idEnd){
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
    public PcpConfigUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public PcpConfigUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpConfigUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public PcpConfigUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper idLikeRight(){
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
    public PcpConfigUpdateEntityWrapper idEq(Long id){
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
    public PcpConfigUpdateEntityWrapper idNe(Long id){
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
    public PcpConfigUpdateEntityWrapper idGt(Long id){
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
    public PcpConfigUpdateEntityWrapper idGe(Long id){
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
    public PcpConfigUpdateEntityWrapper idLt(Long id){
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
    public PcpConfigUpdateEntityWrapper idLe(Long id){
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
    public PcpConfigUpdateEntityWrapper idLike(Long id){
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
    public PcpConfigUpdateEntityWrapper idNotLike(Long id){
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
    public PcpConfigUpdateEntityWrapper idLikeLeft(Long id){
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
    public PcpConfigUpdateEntityWrapper idLikeRight(Long id){
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
    public PcpConfigUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper idIn(Collection<Long> value){
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
    public PcpConfigUpdateEntityWrapper idIn(Long... values){
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
    public PcpConfigUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public PcpConfigUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 等于 = entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdEq(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            eq("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 不等于 &lt;&gt; entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdNe(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            ne("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于 &gt; entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdGt(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            gt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于等于 &gt;= entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdGe(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            ge("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于 &lt; entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdLt(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            lt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于等于 &lt;= entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdLe(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            le("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * BETWEEN  entity().getProjectId() AND 值2
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdBetween(String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            between("project_id",projectId,projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT BETWEEN  entity().getProjectId() AND 值2
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdNotBetween(String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            notBetween("project_id",projectId,projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * BETWEEN  entity().getProjectId() AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdBetween(String projectIdStart,String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            between("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT BETWEEN  entity().getProjectId() AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdNotBetween(String projectIdStart,String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            notBetween("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值%' entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdLike(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            like("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT LIKE '%值%' entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdNotLike(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            notLike("project_id",projectId);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值' entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdLikeLeft(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            likeLeft("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * LIKE '值%' entity().getProjectId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdLikeRight(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            likeRight("project_id",projectId);
        }
        return this;
     }

/**
     * <p>华为项目id</p>
     * 等于 =
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdEq(String projectId){
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
    public PcpConfigUpdateEntityWrapper projectIdNe(String projectId){
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
    public PcpConfigUpdateEntityWrapper projectIdGt(String projectId){
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
    public PcpConfigUpdateEntityWrapper projectIdGe(String projectId){
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
    public PcpConfigUpdateEntityWrapper projectIdLt(String projectId){
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
    public PcpConfigUpdateEntityWrapper projectIdLe(String projectId){
        if(projectId!=null){
            le("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * LIKE '%值%'
     * @param projectId       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdLike(String projectId){
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
    public PcpConfigUpdateEntityWrapper projectIdNotLike(String projectId){
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
    public PcpConfigUpdateEntityWrapper projectIdLikeLeft(String projectId){
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
    public PcpConfigUpdateEntityWrapper projectIdLikeRight(String projectId){
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
    public PcpConfigUpdateEntityWrapper projectIdIsNull(){
        isNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdIsNotNull(){
        isNotNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper projectIdIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper projectIdIn(String... values){
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
    public PcpConfigUpdateEntityWrapper projectIdNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper projectIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("project_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameEq(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            eq("domain_name",domainName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameNe(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            ne("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameGt(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            gt("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameGe(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            ge("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameLt(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            lt("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameLe(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            le("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDomainName() AND 值2
     * @param domainNameEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameBetween(String domainNameEnd){
        String domainName =entity().getDomainName();
        if(domainName!=null && domainNameEnd!=null){
            between("domain_name",domainName,domainNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDomainName() AND 值2
     * @param domainNameEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameNotBetween(String domainNameEnd){
        String domainName =entity().getDomainName();
        if(domainName!=null && domainNameEnd!=null){
            notBetween("domain_name",domainName,domainNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDomainName() AND 值2
     * @param domainNameStart       值1
     * @param domainNameEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameBetween(String domainNameStart,String domainNameEnd){
        String domainName =entity().getDomainName();
        if(domainName!=null && domainNameEnd!=null){
            between("domain_name",domainNameStart,domainNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDomainName() AND 值2
     * @param domainNameStart       值1
     * @param domainNameEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameNotBetween(String domainNameStart,String domainNameEnd){
        String domainName =entity().getDomainName();
        if(domainName!=null && domainNameEnd!=null){
            notBetween("domain_name",domainNameStart,domainNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameLike(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            like("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameNotLike(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            notLike("domain_name",domainName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameLikeLeft(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            likeLeft("domain_name",domainName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDomainName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameLikeRight(){
        String domainName =entity().getDomainName();
        if(domainName!=null){
            likeRight("domain_name",domainName);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameEq(String domainName){
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
    public PcpConfigUpdateEntityWrapper domainNameNe(String domainName){
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
    public PcpConfigUpdateEntityWrapper domainNameGt(String domainName){
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
    public PcpConfigUpdateEntityWrapper domainNameGe(String domainName){
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
    public PcpConfigUpdateEntityWrapper domainNameLt(String domainName){
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
    public PcpConfigUpdateEntityWrapper domainNameLe(String domainName){
        if(domainName!=null){
            le("domain_name",domainName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param domainName       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameLike(String domainName){
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
    public PcpConfigUpdateEntityWrapper domainNameNotLike(String domainName){
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
    public PcpConfigUpdateEntityWrapper domainNameLikeLeft(String domainName){
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
    public PcpConfigUpdateEntityWrapper domainNameLikeRight(String domainName){
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
    public PcpConfigUpdateEntityWrapper domainNameIsNull(){
        isNull("domain_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameIsNotNull(){
        isNotNull("domain_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper domainNameIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper domainNameIn(String... values){
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
    public PcpConfigUpdateEntityWrapper domainNameNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper domainNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("domain_name",values);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * 等于 = entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrEq(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            eq("iam_usr",iamUsr);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * 不等于 &lt;&gt; entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrNe(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            ne("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 大于 &gt; entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrGt(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            gt("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 大于等于 &gt;= entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrGe(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            ge("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 小于 &lt; entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrLt(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            lt("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * 小于等于 &lt;= entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrLe(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            le("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * BETWEEN  entity().getIamUsr() AND 值2
     * @param iamUsrEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrBetween(String iamUsrEnd){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null && iamUsrEnd!=null){
            between("iam_usr",iamUsr,iamUsrEnd);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * NOT BETWEEN  entity().getIamUsr() AND 值2
     * @param iamUsrEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrNotBetween(String iamUsrEnd){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null && iamUsrEnd!=null){
            notBetween("iam_usr",iamUsr,iamUsrEnd);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * BETWEEN  entity().getIamUsr() AND 值2
     * @param iamUsrStart       值1
     * @param iamUsrEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrBetween(String iamUsrStart,String iamUsrEnd){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null && iamUsrEnd!=null){
            between("iam_usr",iamUsrStart,iamUsrEnd);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * NOT BETWEEN  entity().getIamUsr() AND 值2
     * @param iamUsrStart       值1
     * @param iamUsrEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrNotBetween(String iamUsrStart,String iamUsrEnd){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null && iamUsrEnd!=null){
            notBetween("iam_usr",iamUsrStart,iamUsrEnd);
        }
        return this;
     }


    /**
     * <p>iam用户名</p>
     * LIKE '%值%' entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrLike(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            like("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * NOT LIKE '%值%' entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrNotLike(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            notLike("iam_usr",iamUsr);
        }
        return this;
     }


    /**
     * <p>iam用户名</p>
     * LIKE '%值' entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrLikeLeft(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            likeLeft("iam_usr",iamUsr);
        }
        return this;
     }

    /**
     * <p>iam用户名</p>
     * LIKE '值%' entity().getIamUsr()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrLikeRight(){
        String iamUsr =entity().getIamUsr();
        if(iamUsr!=null){
            likeRight("iam_usr",iamUsr);
        }
        return this;
     }

/**
     * <p>iam用户名</p>
     * 等于 =
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrEq(String iamUsr){
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
    public PcpConfigUpdateEntityWrapper iamUsrNe(String iamUsr){
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
    public PcpConfigUpdateEntityWrapper iamUsrGt(String iamUsr){
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
    public PcpConfigUpdateEntityWrapper iamUsrGe(String iamUsr){
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
    public PcpConfigUpdateEntityWrapper iamUsrLt(String iamUsr){
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
    public PcpConfigUpdateEntityWrapper iamUsrLe(String iamUsr){
        if(iamUsr!=null){
            le("iam_usr",iamUsr);
        }
        return this;
    }

    /**
     * <p>iam用户名</p>
     * LIKE '%值%'
     * @param iamUsr       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrLike(String iamUsr){
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
    public PcpConfigUpdateEntityWrapper iamUsrNotLike(String iamUsr){
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
    public PcpConfigUpdateEntityWrapper iamUsrLikeLeft(String iamUsr){
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
    public PcpConfigUpdateEntityWrapper iamUsrLikeRight(String iamUsr){
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
    public PcpConfigUpdateEntityWrapper iamUsrIsNull(){
        isNull("iam_usr");
        return this;
    }

    /**
     * <p>iam用户名</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrIsNotNull(){
        isNotNull("iam_usr");
        return this;
    }

    /**
     * <p>iam用户名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamUsrIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper iamUsrIn(String... values){
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
    public PcpConfigUpdateEntityWrapper iamUsrNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper iamUsrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("iam_usr",values);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * 等于 = entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdEq(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            eq("iam_pwd",iamPwd);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * 不等于 &lt;&gt; entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdNe(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            ne("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 大于 &gt; entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdGt(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            gt("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 大于等于 &gt;= entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdGe(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            ge("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 小于 &lt; entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdLt(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            lt("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * 小于等于 &lt;= entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdLe(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            le("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * BETWEEN  entity().getIamPwd() AND 值2
     * @param iamPwdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdBetween(String iamPwdEnd){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null && iamPwdEnd!=null){
            between("iam_pwd",iamPwd,iamPwdEnd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * NOT BETWEEN  entity().getIamPwd() AND 值2
     * @param iamPwdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdNotBetween(String iamPwdEnd){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null && iamPwdEnd!=null){
            notBetween("iam_pwd",iamPwd,iamPwdEnd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * BETWEEN  entity().getIamPwd() AND 值2
     * @param iamPwdStart       值1
     * @param iamPwdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdBetween(String iamPwdStart,String iamPwdEnd){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null && iamPwdEnd!=null){
            between("iam_pwd",iamPwdStart,iamPwdEnd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * NOT BETWEEN  entity().getIamPwd() AND 值2
     * @param iamPwdStart       值1
     * @param iamPwdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdNotBetween(String iamPwdStart,String iamPwdEnd){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null && iamPwdEnd!=null){
            notBetween("iam_pwd",iamPwdStart,iamPwdEnd);
        }
        return this;
     }


    /**
     * <p>iam密码</p>
     * LIKE '%值%' entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdLike(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            like("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * NOT LIKE '%值%' entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdNotLike(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            notLike("iam_pwd",iamPwd);
        }
        return this;
     }


    /**
     * <p>iam密码</p>
     * LIKE '%值' entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdLikeLeft(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            likeLeft("iam_pwd",iamPwd);
        }
        return this;
     }

    /**
     * <p>iam密码</p>
     * LIKE '值%' entity().getIamPwd()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdLikeRight(){
        String iamPwd =entity().getIamPwd();
        if(iamPwd!=null){
            likeRight("iam_pwd",iamPwd);
        }
        return this;
     }

/**
     * <p>iam密码</p>
     * 等于 =
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdEq(String iamPwd){
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
    public PcpConfigUpdateEntityWrapper iamPwdNe(String iamPwd){
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
    public PcpConfigUpdateEntityWrapper iamPwdGt(String iamPwd){
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
    public PcpConfigUpdateEntityWrapper iamPwdGe(String iamPwd){
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
    public PcpConfigUpdateEntityWrapper iamPwdLt(String iamPwd){
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
    public PcpConfigUpdateEntityWrapper iamPwdLe(String iamPwd){
        if(iamPwd!=null){
            le("iam_pwd",iamPwd);
        }
        return this;
    }

    /**
     * <p>iam密码</p>
     * LIKE '%值%'
     * @param iamPwd       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdLike(String iamPwd){
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
    public PcpConfigUpdateEntityWrapper iamPwdNotLike(String iamPwd){
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
    public PcpConfigUpdateEntityWrapper iamPwdLikeLeft(String iamPwd){
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
    public PcpConfigUpdateEntityWrapper iamPwdLikeRight(String iamPwd){
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
    public PcpConfigUpdateEntityWrapper iamPwdIsNull(){
        isNull("iam_pwd");
        return this;
    }

    /**
     * <p>iam密码</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdIsNotNull(){
        isNotNull("iam_pwd");
        return this;
    }

    /**
     * <p>iam密码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper iamPwdIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper iamPwdIn(String... values){
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
    public PcpConfigUpdateEntityWrapper iamPwdNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper iamPwdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("iam_pwd",values);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * 等于 = entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlEq(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            eq("endpoint_token_url",endpointTokenUrl);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * 不等于 &lt;&gt; entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlNe(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            ne("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 大于 &gt; entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlGt(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            gt("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 大于等于 &gt;= entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlGe(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            ge("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 小于 &lt; entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLt(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            lt("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * 小于等于 &lt;= entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLe(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            le("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * BETWEEN  entity().getEndpointTokenUrl() AND 值2
     * @param endpointTokenUrlEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlBetween(String endpointTokenUrlEnd){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null && endpointTokenUrlEnd!=null){
            between("endpoint_token_url",endpointTokenUrl,endpointTokenUrlEnd);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * NOT BETWEEN  entity().getEndpointTokenUrl() AND 值2
     * @param endpointTokenUrlEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlNotBetween(String endpointTokenUrlEnd){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null && endpointTokenUrlEnd!=null){
            notBetween("endpoint_token_url",endpointTokenUrl,endpointTokenUrlEnd);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * BETWEEN  entity().getEndpointTokenUrl() AND 值2
     * @param endpointTokenUrlStart       值1
     * @param endpointTokenUrlEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlBetween(String endpointTokenUrlStart,String endpointTokenUrlEnd){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null && endpointTokenUrlEnd!=null){
            between("endpoint_token_url",endpointTokenUrlStart,endpointTokenUrlEnd);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * NOT BETWEEN  entity().getEndpointTokenUrl() AND 值2
     * @param endpointTokenUrlStart       值1
     * @param endpointTokenUrlEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlNotBetween(String endpointTokenUrlStart,String endpointTokenUrlEnd){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null && endpointTokenUrlEnd!=null){
            notBetween("endpoint_token_url",endpointTokenUrlStart,endpointTokenUrlEnd);
        }
        return this;
     }


    /**
     * <p>获取token地址</p>
     * LIKE '%值%' entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLike(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            like("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * NOT LIKE '%值%' entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlNotLike(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            notLike("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }


    /**
     * <p>获取token地址</p>
     * LIKE '%值' entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLikeLeft(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            likeLeft("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

    /**
     * <p>获取token地址</p>
     * LIKE '值%' entity().getEndpointTokenUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLikeRight(){
        String endpointTokenUrl =entity().getEndpointTokenUrl();
        if(endpointTokenUrl!=null){
            likeRight("endpoint_token_url",endpointTokenUrl);
        }
        return this;
     }

/**
     * <p>获取token地址</p>
     * 等于 =
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlEq(String endpointTokenUrl){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlNe(String endpointTokenUrl){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlGt(String endpointTokenUrl){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlGe(String endpointTokenUrl){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLt(String endpointTokenUrl){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLe(String endpointTokenUrl){
        if(endpointTokenUrl!=null){
            le("endpoint_token_url",endpointTokenUrl);
        }
        return this;
    }

    /**
     * <p>获取token地址</p>
     * LIKE '%值%'
     * @param endpointTokenUrl       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLike(String endpointTokenUrl){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlNotLike(String endpointTokenUrl){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLikeLeft(String endpointTokenUrl){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlLikeRight(String endpointTokenUrl){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlIsNull(){
        isNull("endpoint_token_url");
        return this;
    }

    /**
     * <p>获取token地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlIsNotNull(){
        isNotNull("endpoint_token_url");
        return this;
    }

    /**
     * <p>获取token地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointTokenUrlIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlIn(String... values){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper endpointTokenUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint_token_url",values);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * 等于 = entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlEq(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            eq("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * 不等于 &lt;&gt; entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlNe(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            ne("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 大于 &gt; entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlGt(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            gt("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 大于等于 &gt;= entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlGe(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            ge("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 小于 &lt; entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLt(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            lt("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * 小于等于 &lt;= entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLe(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            le("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlBetween(String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            between("endpoint_phones_url",endpointPhonesUrl,endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * NOT BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpoint_phones_url",endpointPhonesUrl,endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            between("endpoint_phones_url",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * NOT BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpoint_phones_url",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }


    /**
     * <p>api调用地址</p>
     * LIKE '%值%' entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLike(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            like("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * NOT LIKE '%值%' entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlNotLike(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            notLike("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }


    /**
     * <p>api调用地址</p>
     * LIKE '%值' entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLikeLeft(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            likeLeft("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>api调用地址</p>
     * LIKE '值%' entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLikeRight(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            likeRight("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
     }

/**
     * <p>api调用地址</p>
     * 等于 =
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlEq(String endpointPhonesUrl){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlNe(String endpointPhonesUrl){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlGt(String endpointPhonesUrl){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlGe(String endpointPhonesUrl){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLt(String endpointPhonesUrl){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            le("endpoint_phones_url",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>api调用地址</p>
     * LIKE '%值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLike(String endpointPhonesUrl){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlNotLike(String endpointPhonesUrl){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLikeLeft(String endpointPhonesUrl){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlLikeRight(String endpointPhonesUrl){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlIsNull(){
        isNull("endpoint_phones_url");
        return this;
    }

    /**
     * <p>api调用地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlIsNotNull(){
        isNotNull("endpoint_phones_url");
        return this;
    }

    /**
     * <p>api调用地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlIn(String... values){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper endpointPhonesUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint_phones_url",values);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * 等于 = entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternEq(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            eq("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * 不等于 &lt;&gt; entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternNe(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            ne("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 大于 &gt; entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternGt(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            gt("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 大于等于 &gt;= entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternGe(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            ge("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 小于 &lt; entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLt(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            lt("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * 小于等于 &lt;= entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLe(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            le("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * BETWEEN  entity().getEndpointUrlPattern() AND 值2
     * @param endpointUrlPatternEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternBetween(String endpointUrlPatternEnd){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null && endpointUrlPatternEnd!=null){
            between("endpoint_url_pattern",endpointUrlPattern,endpointUrlPatternEnd);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * NOT BETWEEN  entity().getEndpointUrlPattern() AND 值2
     * @param endpointUrlPatternEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternNotBetween(String endpointUrlPatternEnd){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null && endpointUrlPatternEnd!=null){
            notBetween("endpoint_url_pattern",endpointUrlPattern,endpointUrlPatternEnd);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * BETWEEN  entity().getEndpointUrlPattern() AND 值2
     * @param endpointUrlPatternStart       值1
     * @param endpointUrlPatternEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternBetween(String endpointUrlPatternStart,String endpointUrlPatternEnd){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null && endpointUrlPatternEnd!=null){
            between("endpoint_url_pattern",endpointUrlPatternStart,endpointUrlPatternEnd);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * NOT BETWEEN  entity().getEndpointUrlPattern() AND 值2
     * @param endpointUrlPatternStart       值1
     * @param endpointUrlPatternEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternNotBetween(String endpointUrlPatternStart,String endpointUrlPatternEnd){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null && endpointUrlPatternEnd!=null){
            notBetween("endpoint_url_pattern",endpointUrlPatternStart,endpointUrlPatternEnd);
        }
        return this;
     }


    /**
     * <p>接口url地址模板</p>
     * LIKE '%值%' entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLike(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            like("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * NOT LIKE '%值%' entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternNotLike(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            notLike("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }


    /**
     * <p>接口url地址模板</p>
     * LIKE '%值' entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLikeLeft(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            likeLeft("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

    /**
     * <p>接口url地址模板</p>
     * LIKE '值%' entity().getEndpointUrlPattern()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLikeRight(){
        String endpointUrlPattern =entity().getEndpointUrlPattern();
        if(endpointUrlPattern!=null){
            likeRight("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
     }

/**
     * <p>接口url地址模板</p>
     * 等于 =
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternEq(String endpointUrlPattern){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternNe(String endpointUrlPattern){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternGt(String endpointUrlPattern){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternGe(String endpointUrlPattern){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLt(String endpointUrlPattern){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLe(String endpointUrlPattern){
        if(endpointUrlPattern!=null){
            le("endpoint_url_pattern",endpointUrlPattern);
        }
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * LIKE '%值%'
     * @param endpointUrlPattern       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLike(String endpointUrlPattern){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternNotLike(String endpointUrlPattern){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLikeLeft(String endpointUrlPattern){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternLikeRight(String endpointUrlPattern){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternIsNull(){
        isNull("endpoint_url_pattern");
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternIsNotNull(){
        isNotNull("endpoint_url_pattern");
        return this;
    }

    /**
     * <p>接口url地址模板</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper endpointUrlPatternIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternIn(String... values){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper endpointUrlPatternNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint_url_pattern",values);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * 等于 = entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdEq(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            eq("access_key_id",accessKeyId);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * 不等于 &lt;&gt; entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdNe(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            ne("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 大于 &gt; entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdGt(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            gt("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 大于等于 &gt;= entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdGe(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            ge("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 小于 &lt; entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdLt(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            lt("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * 小于等于 &lt;= entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdLe(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            le("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * BETWEEN  entity().getAccessKeyId() AND 值2
     * @param accessKeyIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdBetween(String accessKeyIdEnd){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null && accessKeyIdEnd!=null){
            between("access_key_id",accessKeyId,accessKeyIdEnd);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * NOT BETWEEN  entity().getAccessKeyId() AND 值2
     * @param accessKeyIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdNotBetween(String accessKeyIdEnd){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null && accessKeyIdEnd!=null){
            notBetween("access_key_id",accessKeyId,accessKeyIdEnd);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * BETWEEN  entity().getAccessKeyId() AND 值2
     * @param accessKeyIdStart       值1
     * @param accessKeyIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdBetween(String accessKeyIdStart,String accessKeyIdEnd){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null && accessKeyIdEnd!=null){
            between("access_key_id",accessKeyIdStart,accessKeyIdEnd);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * NOT BETWEEN  entity().getAccessKeyId() AND 值2
     * @param accessKeyIdStart       值1
     * @param accessKeyIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdNotBetween(String accessKeyIdStart,String accessKeyIdEnd){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null && accessKeyIdEnd!=null){
            notBetween("access_key_id",accessKeyIdStart,accessKeyIdEnd);
        }
        return this;
     }


    /**
     * <p>access_key_id</p>
     * LIKE '%值%' entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdLike(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            like("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * NOT LIKE '%值%' entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdNotLike(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            notLike("access_key_id",accessKeyId);
        }
        return this;
     }


    /**
     * <p>access_key_id</p>
     * LIKE '%值' entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdLikeLeft(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            likeLeft("access_key_id",accessKeyId);
        }
        return this;
     }

    /**
     * <p>access_key_id</p>
     * LIKE '值%' entity().getAccessKeyId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdLikeRight(){
        String accessKeyId =entity().getAccessKeyId();
        if(accessKeyId!=null){
            likeRight("access_key_id",accessKeyId);
        }
        return this;
     }

/**
     * <p>access_key_id</p>
     * 等于 =
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdEq(String accessKeyId){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdNe(String accessKeyId){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdGt(String accessKeyId){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdGe(String accessKeyId){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdLt(String accessKeyId){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdLe(String accessKeyId){
        if(accessKeyId!=null){
            le("access_key_id",accessKeyId);
        }
        return this;
    }

    /**
     * <p>access_key_id</p>
     * LIKE '%值%'
     * @param accessKeyId       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdLike(String accessKeyId){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdNotLike(String accessKeyId){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdLikeLeft(String accessKeyId){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdLikeRight(String accessKeyId){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdIsNull(){
        isNull("access_key_id");
        return this;
    }

    /**
     * <p>access_key_id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdIsNotNull(){
        isNotNull("access_key_id");
        return this;
    }

    /**
     * <p>access_key_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper accessKeyIdIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdIn(String... values){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper accessKeyIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("access_key_id",values);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * 等于 = entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyEq(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            eq("secret_access_key",secretAccessKey);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * 不等于 &lt;&gt; entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyNe(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            ne("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 大于 &gt; entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyGt(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            gt("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 大于等于 &gt;= entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyGe(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            ge("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 小于 &lt; entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyLt(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            lt("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * 小于等于 &lt;= entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyLe(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            le("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * BETWEEN  entity().getSecretAccessKey() AND 值2
     * @param secretAccessKeyEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyBetween(String secretAccessKeyEnd){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null && secretAccessKeyEnd!=null){
            between("secret_access_key",secretAccessKey,secretAccessKeyEnd);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * NOT BETWEEN  entity().getSecretAccessKey() AND 值2
     * @param secretAccessKeyEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyNotBetween(String secretAccessKeyEnd){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null && secretAccessKeyEnd!=null){
            notBetween("secret_access_key",secretAccessKey,secretAccessKeyEnd);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * BETWEEN  entity().getSecretAccessKey() AND 值2
     * @param secretAccessKeyStart       值1
     * @param secretAccessKeyEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyBetween(String secretAccessKeyStart,String secretAccessKeyEnd){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null && secretAccessKeyEnd!=null){
            between("secret_access_key",secretAccessKeyStart,secretAccessKeyEnd);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * NOT BETWEEN  entity().getSecretAccessKey() AND 值2
     * @param secretAccessKeyStart       值1
     * @param secretAccessKeyEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyNotBetween(String secretAccessKeyStart,String secretAccessKeyEnd){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null && secretAccessKeyEnd!=null){
            notBetween("secret_access_key",secretAccessKeyStart,secretAccessKeyEnd);
        }
        return this;
     }


    /**
     * <p>secret_access_key</p>
     * LIKE '%值%' entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyLike(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            like("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * NOT LIKE '%值%' entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyNotLike(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            notLike("secret_access_key",secretAccessKey);
        }
        return this;
     }


    /**
     * <p>secret_access_key</p>
     * LIKE '%值' entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyLikeLeft(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            likeLeft("secret_access_key",secretAccessKey);
        }
        return this;
     }

    /**
     * <p>secret_access_key</p>
     * LIKE '值%' entity().getSecretAccessKey()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyLikeRight(){
        String secretAccessKey =entity().getSecretAccessKey();
        if(secretAccessKey!=null){
            likeRight("secret_access_key",secretAccessKey);
        }
        return this;
     }

/**
     * <p>secret_access_key</p>
     * 等于 =
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyEq(String secretAccessKey){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyNe(String secretAccessKey){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyGt(String secretAccessKey){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyGe(String secretAccessKey){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyLt(String secretAccessKey){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyLe(String secretAccessKey){
        if(secretAccessKey!=null){
            le("secret_access_key",secretAccessKey);
        }
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * LIKE '%值%'
     * @param secretAccessKey       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyLike(String secretAccessKey){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyNotLike(String secretAccessKey){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyLikeLeft(String secretAccessKey){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyLikeRight(String secretAccessKey){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyIsNull(){
        isNull("secret_access_key");
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyIsNotNull(){
        isNotNull("secret_access_key");
        return this;
    }

    /**
     * <p>secret_access_key</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper secretAccessKeyIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyIn(String... values){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper secretAccessKeyNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("secret_access_key",values);
        }
        return this;
    }

    /**
     * <p>token</p>
     * 等于 = entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenEq(){
        String token =entity().getToken();
        if(token!=null){
            eq("token",token);
        }
        return this;
    }

    /**
     * <p>token</p>
     * 不等于 &lt;&gt; entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenNe(){
        String token =entity().getToken();
        if(token!=null){
            ne("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 大于 &gt; entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenGt(){
        String token =entity().getToken();
        if(token!=null){
            gt("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 大于等于 &gt;= entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenGe(){
        String token =entity().getToken();
        if(token!=null){
            ge("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 小于 &lt; entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenLt(){
        String token =entity().getToken();
        if(token!=null){
            lt("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * 小于等于 &lt;= entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenLe(){
        String token =entity().getToken();
        if(token!=null){
            le("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * BETWEEN  entity().getToken() AND 值2
     * @param tokenEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenBetween(String tokenEnd){
        String token =entity().getToken();
        if(token!=null && tokenEnd!=null){
            between("token",token,tokenEnd);
        }
        return this;
     }

    /**
     * <p>token</p>
     * NOT BETWEEN  entity().getToken() AND 值2
     * @param tokenEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenNotBetween(String tokenEnd){
        String token =entity().getToken();
        if(token!=null && tokenEnd!=null){
            notBetween("token",token,tokenEnd);
        }
        return this;
     }

    /**
     * <p>token</p>
     * BETWEEN  entity().getToken() AND 值2
     * @param tokenStart       值1
     * @param tokenEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenBetween(String tokenStart,String tokenEnd){
        String token =entity().getToken();
        if(token!=null && tokenEnd!=null){
            between("token",tokenStart,tokenEnd);
        }
        return this;
     }

    /**
     * <p>token</p>
     * NOT BETWEEN  entity().getToken() AND 值2
     * @param tokenStart       值1
     * @param tokenEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenNotBetween(String tokenStart,String tokenEnd){
        String token =entity().getToken();
        if(token!=null && tokenEnd!=null){
            notBetween("token",tokenStart,tokenEnd);
        }
        return this;
     }


    /**
     * <p>token</p>
     * LIKE '%值%' entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenLike(){
        String token =entity().getToken();
        if(token!=null){
            like("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * NOT LIKE '%值%' entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenNotLike(){
        String token =entity().getToken();
        if(token!=null){
            notLike("token",token);
        }
        return this;
     }


    /**
     * <p>token</p>
     * LIKE '%值' entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenLikeLeft(){
        String token =entity().getToken();
        if(token!=null){
            likeLeft("token",token);
        }
        return this;
     }

    /**
     * <p>token</p>
     * LIKE '值%' entity().getToken()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenLikeRight(){
        String token =entity().getToken();
        if(token!=null){
            likeRight("token",token);
        }
        return this;
     }

/**
     * <p>token</p>
     * 等于 =
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenEq(String token){
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
    public PcpConfigUpdateEntityWrapper tokenNe(String token){
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
    public PcpConfigUpdateEntityWrapper tokenGt(String token){
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
    public PcpConfigUpdateEntityWrapper tokenGe(String token){
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
    public PcpConfigUpdateEntityWrapper tokenLt(String token){
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
    public PcpConfigUpdateEntityWrapper tokenLe(String token){
        if(token!=null){
            le("token",token);
        }
        return this;
    }

    /**
     * <p>token</p>
     * LIKE '%值%'
     * @param token       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenLike(String token){
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
    public PcpConfigUpdateEntityWrapper tokenNotLike(String token){
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
    public PcpConfigUpdateEntityWrapper tokenLikeLeft(String token){
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
    public PcpConfigUpdateEntityWrapper tokenLikeRight(String token){
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
    public PcpConfigUpdateEntityWrapper tokenIsNull(){
        isNull("token");
        return this;
    }

    /**
     * <p>token</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenIsNotNull(){
        isNotNull("token");
        return this;
    }

    /**
     * <p>token</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper tokenIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper tokenIn(String... values){
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
    public PcpConfigUpdateEntityWrapper tokenNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper tokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("token",values);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * 等于 = entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateEq(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            eq("expired_date",expiredDate);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * 不等于 &lt;&gt; entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateNe(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            ne("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 大于 &gt; entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateGt(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            gt("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 大于等于 &gt;= entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateGe(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            ge("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 小于 &lt; entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateLt(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            lt("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * 小于等于 &lt;= entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateLe(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            le("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * BETWEEN  entity().getExpiredDate() AND 值2
     * @param expiredDateEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateBetween(Date expiredDateEnd){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null && expiredDateEnd!=null){
            between("expired_date",expiredDate,expiredDateEnd);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * NOT BETWEEN  entity().getExpiredDate() AND 值2
     * @param expiredDateEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateNotBetween(Date expiredDateEnd){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null && expiredDateEnd!=null){
            notBetween("expired_date",expiredDate,expiredDateEnd);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * BETWEEN  entity().getExpiredDate() AND 值2
     * @param expiredDateStart       值1
     * @param expiredDateEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateBetween(Date expiredDateStart,Date expiredDateEnd){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null && expiredDateEnd!=null){
            between("expired_date",expiredDateStart,expiredDateEnd);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * NOT BETWEEN  entity().getExpiredDate() AND 值2
     * @param expiredDateStart       值1
     * @param expiredDateEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateNotBetween(Date expiredDateStart,Date expiredDateEnd){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null && expiredDateEnd!=null){
            notBetween("expired_date",expiredDateStart,expiredDateEnd);
        }
        return this;
     }


    /**
     * <p>token 过期时间</p>
     * LIKE '%值%' entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateLike(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            like("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * NOT LIKE '%值%' entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateNotLike(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            notLike("expired_date",expiredDate);
        }
        return this;
     }


    /**
     * <p>token 过期时间</p>
     * LIKE '%值' entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateLikeLeft(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            likeLeft("expired_date",expiredDate);
        }
        return this;
     }

    /**
     * <p>token 过期时间</p>
     * LIKE '值%' entity().getExpiredDate()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateLikeRight(){
        Date expiredDate =entity().getExpiredDate();
        if(expiredDate!=null){
            likeRight("expired_date",expiredDate);
        }
        return this;
     }

/**
     * <p>token 过期时间</p>
     * 等于 =
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateEq(Date expiredDate){
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
    public PcpConfigUpdateEntityWrapper expiredDateNe(Date expiredDate){
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
    public PcpConfigUpdateEntityWrapper expiredDateGt(Date expiredDate){
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
    public PcpConfigUpdateEntityWrapper expiredDateGe(Date expiredDate){
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
    public PcpConfigUpdateEntityWrapper expiredDateLt(Date expiredDate){
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
    public PcpConfigUpdateEntityWrapper expiredDateLe(Date expiredDate){
        if(expiredDate!=null){
            le("expired_date",expiredDate);
        }
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * LIKE '%值%'
     * @param expiredDate       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateLike(Date expiredDate){
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
    public PcpConfigUpdateEntityWrapper expiredDateNotLike(Date expiredDate){
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
    public PcpConfigUpdateEntityWrapper expiredDateLikeLeft(Date expiredDate){
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
    public PcpConfigUpdateEntityWrapper expiredDateLikeRight(Date expiredDate){
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
    public PcpConfigUpdateEntityWrapper expiredDateIsNull(){
        isNull("expired_date");
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateIsNotNull(){
        isNotNull("expired_date");
        return this;
    }

    /**
     * <p>token 过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper expiredDateIn(Collection<Date> value){
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
    public PcpConfigUpdateEntityWrapper expiredDateIn(Date... values){
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
    public PcpConfigUpdateEntityWrapper expiredDateNotIn(Collection<Date> value){
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
    public PcpConfigUpdateEntityWrapper expiredDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("expired_date",values);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * 等于 = entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameEq(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * 不等于 &lt;&gt; entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameNe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 大于 &gt; entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameGt(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 大于等于 &gt;= entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameGe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 小于 &lt; entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameLt(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * 小于等于 &lt;= entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameLe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameBetween(String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            between("bucket_name",bucketName,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * NOT BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameNotBetween(String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketName,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            between("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * NOT BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>obs存储桶名称</p>
     * LIKE '%值%' entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * NOT LIKE '%值%' entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameNotLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>obs存储桶名称</p>
     * LIKE '%值' entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameLikeLeft(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>obs存储桶名称</p>
     * LIKE '值%' entity().getBucketName()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameLikeRight(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeRight("bucket_name",bucketName);
        }
        return this;
     }

/**
     * <p>obs存储桶名称</p>
     * 等于 =
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameEq(String bucketName){
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
    public PcpConfigUpdateEntityWrapper bucketNameNe(String bucketName){
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
    public PcpConfigUpdateEntityWrapper bucketNameGt(String bucketName){
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
    public PcpConfigUpdateEntityWrapper bucketNameGe(String bucketName){
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
    public PcpConfigUpdateEntityWrapper bucketNameLt(String bucketName){
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
    public PcpConfigUpdateEntityWrapper bucketNameLe(String bucketName){
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameLike(String bucketName){
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
    public PcpConfigUpdateEntityWrapper bucketNameNotLike(String bucketName){
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
    public PcpConfigUpdateEntityWrapper bucketNameLikeLeft(String bucketName){
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
    public PcpConfigUpdateEntityWrapper bucketNameLikeRight(String bucketName){
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
    public PcpConfigUpdateEntityWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>obs存储桶名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper bucketNameIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper bucketNameIn(String... values){
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
    public PcpConfigUpdateEntityWrapper bucketNameNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * 等于 = entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathEq(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            eq("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * 不等于 &lt;&gt; entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathNe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            ne("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 大于 &gt; entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathGt(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            gt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 大于等于 &gt;= entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathGe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            ge("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 小于 &lt; entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathLt(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            lt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * 小于等于 &lt;= entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathLe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            le("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathBetween(String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            between("object_path",objectPath,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * NOT BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathNotBetween(String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            notBetween("object_path",objectPath,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            between("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * NOT BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>obs存储桶路径</p>
     * LIKE '%值%' entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathLike(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            like("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * NOT LIKE '%值%' entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathNotLike(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            notLike("object_path",objectPath);
        }
        return this;
     }


    /**
     * <p>obs存储桶路径</p>
     * LIKE '%值' entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathLikeLeft(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            likeLeft("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>obs存储桶路径</p>
     * LIKE '值%' entity().getObjectPath()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathLikeRight(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            likeRight("object_path",objectPath);
        }
        return this;
     }

/**
     * <p>obs存储桶路径</p>
     * 等于 =
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathEq(String objectPath){
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
    public PcpConfigUpdateEntityWrapper objectPathNe(String objectPath){
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
    public PcpConfigUpdateEntityWrapper objectPathGt(String objectPath){
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
    public PcpConfigUpdateEntityWrapper objectPathGe(String objectPath){
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
    public PcpConfigUpdateEntityWrapper objectPathLt(String objectPath){
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
    public PcpConfigUpdateEntityWrapper objectPathLe(String objectPath){
        if(objectPath!=null){
            le("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * LIKE '%值%'
     * @param objectPath       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathLike(String objectPath){
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
    public PcpConfigUpdateEntityWrapper objectPathNotLike(String objectPath){
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
    public PcpConfigUpdateEntityWrapper objectPathLikeLeft(String objectPath){
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
    public PcpConfigUpdateEntityWrapper objectPathLikeRight(String objectPath){
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
    public PcpConfigUpdateEntityWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>obs存储桶路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper objectPathIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper objectPathIn(String... values){
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
    public PcpConfigUpdateEntityWrapper objectPathNotIn(Collection<String> value){
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
    public PcpConfigUpdateEntityWrapper objectPathNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("object_path",values);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

/**
     * <p>状态（0：关闭，1：启用）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusEq(Integer status){
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
    public PcpConfigUpdateEntityWrapper statusNe(Integer status){
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
    public PcpConfigUpdateEntityWrapper statusGt(Integer status){
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
    public PcpConfigUpdateEntityWrapper statusGe(Integer status){
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
    public PcpConfigUpdateEntityWrapper statusLt(Integer status){
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
    public PcpConfigUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusLike(Integer status){
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
    public PcpConfigUpdateEntityWrapper statusNotLike(Integer status){
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
    public PcpConfigUpdateEntityWrapper statusLikeLeft(Integer status){
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
    public PcpConfigUpdateEntityWrapper statusLikeRight(Integer status){
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
    public PcpConfigUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（0：关闭，1：启用）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper statusIn(Collection<Integer> value){
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
    public PcpConfigUpdateEntityWrapper statusIn(Integer... values){
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
    public PcpConfigUpdateEntityWrapper statusNotIn(Collection<Integer> value){
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
    public PcpConfigUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper createTimeEq(){
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
    public PcpConfigUpdateEntityWrapper createTimeNe(){
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
    public PcpConfigUpdateEntityWrapper createTimeGt(){
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
    public PcpConfigUpdateEntityWrapper createTimeGe(){
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
    public PcpConfigUpdateEntityWrapper createTimeLt(){
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
    public PcpConfigUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public PcpConfigUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public PcpConfigUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpConfigUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper createTimeLikeRight(){
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
    public PcpConfigUpdateEntityWrapper createTimeEq(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeNe(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeGt(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeGe(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeLt(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeLe(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeLike(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public PcpConfigUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public PcpConfigUpdateEntityWrapper createTimeIn(Date... values){
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
    public PcpConfigUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public PcpConfigUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

/**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public PcpConfigUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdEq(Long versionId){
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
    public PcpConfigUpdateEntityWrapper versionIdNe(Long versionId){
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
    public PcpConfigUpdateEntityWrapper versionIdGt(Long versionId){
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
    public PcpConfigUpdateEntityWrapper versionIdGe(Long versionId){
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
    public PcpConfigUpdateEntityWrapper versionIdLt(Long versionId){
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
    public PcpConfigUpdateEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdLike(Long versionId){
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
    public PcpConfigUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public PcpConfigUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public PcpConfigUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public PcpConfigUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public PcpConfigUpdateEntityWrapper versionIdIn(Long... values){
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
    public PcpConfigUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public PcpConfigUpdateEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 等于 = entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdEq(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 不等于 &lt;&gt; entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdNe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 大于 &gt; entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdGt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 大于等于 &gt;= entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdGe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 小于 &lt; entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * 小于等于 &lt;= entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * NOT LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdNotLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '%值' entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLikeLeft(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '值%' entity().getFkPcpAreaId()
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLikeRight(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

/**
     * <p>pcp区域表（pcp_area）id</p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>pcp区域表（pcp_area）id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdIn(Long... values){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public PcpConfigUpdateEntityWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


}
