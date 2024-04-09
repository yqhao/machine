package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 百度账号表
 * </p>
 * "baidu_account"
 * @author PC001
 */
public class BaiduAccountSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public BaiduAccountSelect columns(){
        set.add("id");
        set.add("mobile");
        set.add("account_name");
        set.add("host");
        set.add("bearer_token");
        set.add("token_expire");
        set.add("root_group_code");
        set.add("create_time");
        set.add("last_update_time");
        set.add("refreshToken");
        set.add("refreshToken_expire");
        return this;
    }

    public BaiduAccountSelect id(){
        set.add("id");
        return this;
    }

    public BaiduAccountSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public BaiduAccountSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public BaiduAccountSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public BaiduAccountSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public BaiduAccountSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public BaiduAccountSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public BaiduAccountSelect mobile(){
        set.add("mobile");
        return this;
    }

    public BaiduAccountSelect excludeMobile(){
        excludeSet.add("mobile");
        return this;
    }

    public BaiduAccountSelect avgMobile(){
        set.add("avg(mobile) as mobile");
        return this;
    }

    public BaiduAccountSelect countMobile(){
        set.add("count(mobile) as mobile");
        return this;
    }

    public BaiduAccountSelect minMobile(){
        set.add("min(mobile) as mobile");
        return this;
    }

    public BaiduAccountSelect maxMobile(){
        set.add("max(mobile) as mobile");
        return this;
    }

    public BaiduAccountSelect sumMobile(){
        set.add("sum(mobile) as mobile");
        return this;
    }
    public BaiduAccountSelect accountName(){
        set.add("account_name");
        return this;
    }

    public BaiduAccountSelect excludeAccountName(){
        excludeSet.add("account_name");
        return this;
    }

    public BaiduAccountSelect avgAccountName(){
        set.add("avg(account_name) as account_name");
        return this;
    }

    public BaiduAccountSelect countAccountName(){
        set.add("count(account_name) as account_name");
        return this;
    }

    public BaiduAccountSelect minAccountName(){
        set.add("min(account_name) as account_name");
        return this;
    }

    public BaiduAccountSelect maxAccountName(){
        set.add("max(account_name) as account_name");
        return this;
    }

    public BaiduAccountSelect sumAccountName(){
        set.add("sum(account_name) as account_name");
        return this;
    }
    public BaiduAccountSelect host(){
        set.add("host");
        return this;
    }

    public BaiduAccountSelect excludeHost(){
        excludeSet.add("host");
        return this;
    }

    public BaiduAccountSelect avgHost(){
        set.add("avg(host) as host");
        return this;
    }

    public BaiduAccountSelect countHost(){
        set.add("count(host) as host");
        return this;
    }

    public BaiduAccountSelect minHost(){
        set.add("min(host) as host");
        return this;
    }

    public BaiduAccountSelect maxHost(){
        set.add("max(host) as host");
        return this;
    }

    public BaiduAccountSelect sumHost(){
        set.add("sum(host) as host");
        return this;
    }
    public BaiduAccountSelect bearerToken(){
        set.add("bearer_token");
        return this;
    }

    public BaiduAccountSelect excludeBearerToken(){
        excludeSet.add("bearer_token");
        return this;
    }

    public BaiduAccountSelect avgBearerToken(){
        set.add("avg(bearer_token) as bearer_token");
        return this;
    }

    public BaiduAccountSelect countBearerToken(){
        set.add("count(bearer_token) as bearer_token");
        return this;
    }

    public BaiduAccountSelect minBearerToken(){
        set.add("min(bearer_token) as bearer_token");
        return this;
    }

    public BaiduAccountSelect maxBearerToken(){
        set.add("max(bearer_token) as bearer_token");
        return this;
    }

    public BaiduAccountSelect sumBearerToken(){
        set.add("sum(bearer_token) as bearer_token");
        return this;
    }
    public BaiduAccountSelect tokenExpire(){
        set.add("token_expire");
        return this;
    }

    public BaiduAccountSelect excludeTokenExpire(){
        excludeSet.add("token_expire");
        return this;
    }

    public BaiduAccountSelect avgTokenExpire(){
        set.add("avg(token_expire) as token_expire");
        return this;
    }

    public BaiduAccountSelect countTokenExpire(){
        set.add("count(token_expire) as token_expire");
        return this;
    }

    public BaiduAccountSelect minTokenExpire(){
        set.add("min(token_expire) as token_expire");
        return this;
    }

    public BaiduAccountSelect maxTokenExpire(){
        set.add("max(token_expire) as token_expire");
        return this;
    }

    public BaiduAccountSelect sumTokenExpire(){
        set.add("sum(token_expire) as token_expire");
        return this;
    }
    public BaiduAccountSelect rootGroupCode(){
        set.add("root_group_code");
        return this;
    }

    public BaiduAccountSelect excludeRootGroupCode(){
        excludeSet.add("root_group_code");
        return this;
    }

    public BaiduAccountSelect avgRootGroupCode(){
        set.add("avg(root_group_code) as root_group_code");
        return this;
    }

    public BaiduAccountSelect countRootGroupCode(){
        set.add("count(root_group_code) as root_group_code");
        return this;
    }

    public BaiduAccountSelect minRootGroupCode(){
        set.add("min(root_group_code) as root_group_code");
        return this;
    }

    public BaiduAccountSelect maxRootGroupCode(){
        set.add("max(root_group_code) as root_group_code");
        return this;
    }

    public BaiduAccountSelect sumRootGroupCode(){
        set.add("sum(root_group_code) as root_group_code");
        return this;
    }
    public BaiduAccountSelect createTime(){
        set.add("create_time");
        return this;
    }

    public BaiduAccountSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public BaiduAccountSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public BaiduAccountSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public BaiduAccountSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public BaiduAccountSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public BaiduAccountSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public BaiduAccountSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public BaiduAccountSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public BaiduAccountSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public BaiduAccountSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public BaiduAccountSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public BaiduAccountSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public BaiduAccountSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public BaiduAccountSelect refreshToken(){
        set.add("refreshToken");
        return this;
    }

    public BaiduAccountSelect excludeRefreshToken(){
        excludeSet.add("refreshToken");
        return this;
    }

    public BaiduAccountSelect avgRefreshToken(){
        set.add("avg(refreshToken) as refreshToken");
        return this;
    }

    public BaiduAccountSelect countRefreshToken(){
        set.add("count(refreshToken) as refreshToken");
        return this;
    }

    public BaiduAccountSelect minRefreshToken(){
        set.add("min(refreshToken) as refreshToken");
        return this;
    }

    public BaiduAccountSelect maxRefreshToken(){
        set.add("max(refreshToken) as refreshToken");
        return this;
    }

    public BaiduAccountSelect sumRefreshToken(){
        set.add("sum(refreshToken) as refreshToken");
        return this;
    }
    public BaiduAccountSelect refreshtokenExpire(){
        set.add("refreshToken_expire");
        return this;
    }

    public BaiduAccountSelect excludeRefreshtokenExpire(){
        excludeSet.add("refreshToken_expire");
        return this;
    }

    public BaiduAccountSelect avgRefreshtokenExpire(){
        set.add("avg(refreshToken_expire) as refreshToken_expire");
        return this;
    }

    public BaiduAccountSelect countRefreshtokenExpire(){
        set.add("count(refreshToken_expire) as refreshToken_expire");
        return this;
    }

    public BaiduAccountSelect minRefreshtokenExpire(){
        set.add("min(refreshToken_expire) as refreshToken_expire");
        return this;
    }

    public BaiduAccountSelect maxRefreshtokenExpire(){
        set.add("max(refreshToken_expire) as refreshToken_expire");
        return this;
    }

    public BaiduAccountSelect sumRefreshtokenExpire(){
        set.add("sum(refreshToken_expire) as refreshToken_expire");
        return this;
    }

    boolean distinct=false;

     public BaiduAccountSelect distinct(){
        this.distinct=true;
        return this;
    }

    public BaiduAccountSelect includes(Consumer<Set<String>> other){
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
