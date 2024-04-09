package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 华为云配置表
 * </p>
 * "pcp_config"
 * @author PC001
 */
public class PcpConfigSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public PcpConfigSelect columns(){
        set.add("id");
        set.add("project_id");
        set.add("domain_name");
        set.add("iam_usr");
        set.add("iam_pwd");
        set.add("endpoint_token_url");
        set.add("endpoint_phones_url");
        set.add("endpoint_url_pattern");
        set.add("access_key_id");
        set.add("secret_access_key");
        set.add("token");
        set.add("expired_date");
        set.add("bucket_name");
        set.add("object_path");
        set.add("status");
        set.add("create_time");
        set.add("last_update_time");
        set.add("version_id");
        set.add("fk_pcp_area_id");
        return this;
    }

    public PcpConfigSelect id(){
        set.add("id");
        return this;
    }

    public PcpConfigSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public PcpConfigSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public PcpConfigSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public PcpConfigSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public PcpConfigSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public PcpConfigSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public PcpConfigSelect projectId(){
        set.add("project_id");
        return this;
    }

    public PcpConfigSelect excludeProjectId(){
        excludeSet.add("project_id");
        return this;
    }

    public PcpConfigSelect avgProjectId(){
        set.add("avg(project_id) as project_id");
        return this;
    }

    public PcpConfigSelect countProjectId(){
        set.add("count(project_id) as project_id");
        return this;
    }

    public PcpConfigSelect minProjectId(){
        set.add("min(project_id) as project_id");
        return this;
    }

    public PcpConfigSelect maxProjectId(){
        set.add("max(project_id) as project_id");
        return this;
    }

    public PcpConfigSelect sumProjectId(){
        set.add("sum(project_id) as project_id");
        return this;
    }
    public PcpConfigSelect domainName(){
        set.add("domain_name");
        return this;
    }

    public PcpConfigSelect excludeDomainName(){
        excludeSet.add("domain_name");
        return this;
    }

    public PcpConfigSelect avgDomainName(){
        set.add("avg(domain_name) as domain_name");
        return this;
    }

    public PcpConfigSelect countDomainName(){
        set.add("count(domain_name) as domain_name");
        return this;
    }

    public PcpConfigSelect minDomainName(){
        set.add("min(domain_name) as domain_name");
        return this;
    }

    public PcpConfigSelect maxDomainName(){
        set.add("max(domain_name) as domain_name");
        return this;
    }

    public PcpConfigSelect sumDomainName(){
        set.add("sum(domain_name) as domain_name");
        return this;
    }
    public PcpConfigSelect iamUsr(){
        set.add("iam_usr");
        return this;
    }

    public PcpConfigSelect excludeIamUsr(){
        excludeSet.add("iam_usr");
        return this;
    }

    public PcpConfigSelect avgIamUsr(){
        set.add("avg(iam_usr) as iam_usr");
        return this;
    }

    public PcpConfigSelect countIamUsr(){
        set.add("count(iam_usr) as iam_usr");
        return this;
    }

    public PcpConfigSelect minIamUsr(){
        set.add("min(iam_usr) as iam_usr");
        return this;
    }

    public PcpConfigSelect maxIamUsr(){
        set.add("max(iam_usr) as iam_usr");
        return this;
    }

    public PcpConfigSelect sumIamUsr(){
        set.add("sum(iam_usr) as iam_usr");
        return this;
    }
    public PcpConfigSelect iamPwd(){
        set.add("iam_pwd");
        return this;
    }

    public PcpConfigSelect excludeIamPwd(){
        excludeSet.add("iam_pwd");
        return this;
    }

    public PcpConfigSelect avgIamPwd(){
        set.add("avg(iam_pwd) as iam_pwd");
        return this;
    }

    public PcpConfigSelect countIamPwd(){
        set.add("count(iam_pwd) as iam_pwd");
        return this;
    }

    public PcpConfigSelect minIamPwd(){
        set.add("min(iam_pwd) as iam_pwd");
        return this;
    }

    public PcpConfigSelect maxIamPwd(){
        set.add("max(iam_pwd) as iam_pwd");
        return this;
    }

    public PcpConfigSelect sumIamPwd(){
        set.add("sum(iam_pwd) as iam_pwd");
        return this;
    }
    public PcpConfigSelect endpointTokenUrl(){
        set.add("endpoint_token_url");
        return this;
    }

    public PcpConfigSelect excludeEndpointTokenUrl(){
        excludeSet.add("endpoint_token_url");
        return this;
    }

    public PcpConfigSelect avgEndpointTokenUrl(){
        set.add("avg(endpoint_token_url) as endpoint_token_url");
        return this;
    }

    public PcpConfigSelect countEndpointTokenUrl(){
        set.add("count(endpoint_token_url) as endpoint_token_url");
        return this;
    }

    public PcpConfigSelect minEndpointTokenUrl(){
        set.add("min(endpoint_token_url) as endpoint_token_url");
        return this;
    }

    public PcpConfigSelect maxEndpointTokenUrl(){
        set.add("max(endpoint_token_url) as endpoint_token_url");
        return this;
    }

    public PcpConfigSelect sumEndpointTokenUrl(){
        set.add("sum(endpoint_token_url) as endpoint_token_url");
        return this;
    }
    public PcpConfigSelect endpointPhonesUrl(){
        set.add("endpoint_phones_url");
        return this;
    }

    public PcpConfigSelect excludeEndpointPhonesUrl(){
        excludeSet.add("endpoint_phones_url");
        return this;
    }

    public PcpConfigSelect avgEndpointPhonesUrl(){
        set.add("avg(endpoint_phones_url) as endpoint_phones_url");
        return this;
    }

    public PcpConfigSelect countEndpointPhonesUrl(){
        set.add("count(endpoint_phones_url) as endpoint_phones_url");
        return this;
    }

    public PcpConfigSelect minEndpointPhonesUrl(){
        set.add("min(endpoint_phones_url) as endpoint_phones_url");
        return this;
    }

    public PcpConfigSelect maxEndpointPhonesUrl(){
        set.add("max(endpoint_phones_url) as endpoint_phones_url");
        return this;
    }

    public PcpConfigSelect sumEndpointPhonesUrl(){
        set.add("sum(endpoint_phones_url) as endpoint_phones_url");
        return this;
    }
    public PcpConfigSelect endpointUrlPattern(){
        set.add("endpoint_url_pattern");
        return this;
    }

    public PcpConfigSelect excludeEndpointUrlPattern(){
        excludeSet.add("endpoint_url_pattern");
        return this;
    }

    public PcpConfigSelect avgEndpointUrlPattern(){
        set.add("avg(endpoint_url_pattern) as endpoint_url_pattern");
        return this;
    }

    public PcpConfigSelect countEndpointUrlPattern(){
        set.add("count(endpoint_url_pattern) as endpoint_url_pattern");
        return this;
    }

    public PcpConfigSelect minEndpointUrlPattern(){
        set.add("min(endpoint_url_pattern) as endpoint_url_pattern");
        return this;
    }

    public PcpConfigSelect maxEndpointUrlPattern(){
        set.add("max(endpoint_url_pattern) as endpoint_url_pattern");
        return this;
    }

    public PcpConfigSelect sumEndpointUrlPattern(){
        set.add("sum(endpoint_url_pattern) as endpoint_url_pattern");
        return this;
    }
    public PcpConfigSelect accessKeyId(){
        set.add("access_key_id");
        return this;
    }

    public PcpConfigSelect excludeAccessKeyId(){
        excludeSet.add("access_key_id");
        return this;
    }

    public PcpConfigSelect avgAccessKeyId(){
        set.add("avg(access_key_id) as access_key_id");
        return this;
    }

    public PcpConfigSelect countAccessKeyId(){
        set.add("count(access_key_id) as access_key_id");
        return this;
    }

    public PcpConfigSelect minAccessKeyId(){
        set.add("min(access_key_id) as access_key_id");
        return this;
    }

    public PcpConfigSelect maxAccessKeyId(){
        set.add("max(access_key_id) as access_key_id");
        return this;
    }

    public PcpConfigSelect sumAccessKeyId(){
        set.add("sum(access_key_id) as access_key_id");
        return this;
    }
    public PcpConfigSelect secretAccessKey(){
        set.add("secret_access_key");
        return this;
    }

    public PcpConfigSelect excludeSecretAccessKey(){
        excludeSet.add("secret_access_key");
        return this;
    }

    public PcpConfigSelect avgSecretAccessKey(){
        set.add("avg(secret_access_key) as secret_access_key");
        return this;
    }

    public PcpConfigSelect countSecretAccessKey(){
        set.add("count(secret_access_key) as secret_access_key");
        return this;
    }

    public PcpConfigSelect minSecretAccessKey(){
        set.add("min(secret_access_key) as secret_access_key");
        return this;
    }

    public PcpConfigSelect maxSecretAccessKey(){
        set.add("max(secret_access_key) as secret_access_key");
        return this;
    }

    public PcpConfigSelect sumSecretAccessKey(){
        set.add("sum(secret_access_key) as secret_access_key");
        return this;
    }
    public PcpConfigSelect token(){
        set.add("token");
        return this;
    }

    public PcpConfigSelect excludeToken(){
        excludeSet.add("token");
        return this;
    }

    public PcpConfigSelect avgToken(){
        set.add("avg(token) as token");
        return this;
    }

    public PcpConfigSelect countToken(){
        set.add("count(token) as token");
        return this;
    }

    public PcpConfigSelect minToken(){
        set.add("min(token) as token");
        return this;
    }

    public PcpConfigSelect maxToken(){
        set.add("max(token) as token");
        return this;
    }

    public PcpConfigSelect sumToken(){
        set.add("sum(token) as token");
        return this;
    }
    public PcpConfigSelect expiredDate(){
        set.add("expired_date");
        return this;
    }

    public PcpConfigSelect excludeExpiredDate(){
        excludeSet.add("expired_date");
        return this;
    }

    public PcpConfigSelect avgExpiredDate(){
        set.add("avg(expired_date) as expired_date");
        return this;
    }

    public PcpConfigSelect countExpiredDate(){
        set.add("count(expired_date) as expired_date");
        return this;
    }

    public PcpConfigSelect minExpiredDate(){
        set.add("min(expired_date) as expired_date");
        return this;
    }

    public PcpConfigSelect maxExpiredDate(){
        set.add("max(expired_date) as expired_date");
        return this;
    }

    public PcpConfigSelect sumExpiredDate(){
        set.add("sum(expired_date) as expired_date");
        return this;
    }
    public PcpConfigSelect bucketName(){
        set.add("bucket_name");
        return this;
    }

    public PcpConfigSelect excludeBucketName(){
        excludeSet.add("bucket_name");
        return this;
    }

    public PcpConfigSelect avgBucketName(){
        set.add("avg(bucket_name) as bucket_name");
        return this;
    }

    public PcpConfigSelect countBucketName(){
        set.add("count(bucket_name) as bucket_name");
        return this;
    }

    public PcpConfigSelect minBucketName(){
        set.add("min(bucket_name) as bucket_name");
        return this;
    }

    public PcpConfigSelect maxBucketName(){
        set.add("max(bucket_name) as bucket_name");
        return this;
    }

    public PcpConfigSelect sumBucketName(){
        set.add("sum(bucket_name) as bucket_name");
        return this;
    }
    public PcpConfigSelect objectPath(){
        set.add("object_path");
        return this;
    }

    public PcpConfigSelect excludeObjectPath(){
        excludeSet.add("object_path");
        return this;
    }

    public PcpConfigSelect avgObjectPath(){
        set.add("avg(object_path) as object_path");
        return this;
    }

    public PcpConfigSelect countObjectPath(){
        set.add("count(object_path) as object_path");
        return this;
    }

    public PcpConfigSelect minObjectPath(){
        set.add("min(object_path) as object_path");
        return this;
    }

    public PcpConfigSelect maxObjectPath(){
        set.add("max(object_path) as object_path");
        return this;
    }

    public PcpConfigSelect sumObjectPath(){
        set.add("sum(object_path) as object_path");
        return this;
    }
    public PcpConfigSelect status(){
        set.add("status");
        return this;
    }

    public PcpConfigSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public PcpConfigSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public PcpConfigSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public PcpConfigSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public PcpConfigSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public PcpConfigSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public PcpConfigSelect createTime(){
        set.add("create_time");
        return this;
    }

    public PcpConfigSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public PcpConfigSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public PcpConfigSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public PcpConfigSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public PcpConfigSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public PcpConfigSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public PcpConfigSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public PcpConfigSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public PcpConfigSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public PcpConfigSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public PcpConfigSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public PcpConfigSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public PcpConfigSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public PcpConfigSelect versionId(){
        set.add("version_id");
        return this;
    }

    public PcpConfigSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public PcpConfigSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public PcpConfigSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public PcpConfigSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public PcpConfigSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public PcpConfigSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public PcpConfigSelect fkPcpAreaId(){
        set.add("fk_pcp_area_id");
        return this;
    }

    public PcpConfigSelect excludeFkPcpAreaId(){
        excludeSet.add("fk_pcp_area_id");
        return this;
    }

    public PcpConfigSelect avgFkPcpAreaId(){
        set.add("avg(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public PcpConfigSelect countFkPcpAreaId(){
        set.add("count(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public PcpConfigSelect minFkPcpAreaId(){
        set.add("min(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public PcpConfigSelect maxFkPcpAreaId(){
        set.add("max(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public PcpConfigSelect sumFkPcpAreaId(){
        set.add("sum(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    boolean distinct=false;

     public PcpConfigSelect distinct(){
        this.distinct=true;
        return this;
    }

    public PcpConfigSelect includes(Consumer<Set<String>> other){
        if(other!=null){
            other.accept(set);
        }
        return this;
    }

    public String[] select(){
        if(!excludeSet.isEmpty()){
            set.removeAll(excludeSet);
        }
        String[] columns = set.isEmpty() ? new String[]{"*"} : set.toArray(new String[0]);
        set.clear();
        excludeSet.clear();
        set=null;
        excludeSet=null;
        if(distinct){
            columns[0]=" DISTINCT "+columns[0];
        }
        return columns;
    }

    @Override
    public String toString(){
        String[] all=select();
        if(all.length==1){
            return all[0];
        }
        StringBuilder b =new StringBuilder();
        for (String s : all) {
            b.append(s).append(",");
        }
        b.deleteCharAt(b.length()-1);
        return b.toString();
    }
}
