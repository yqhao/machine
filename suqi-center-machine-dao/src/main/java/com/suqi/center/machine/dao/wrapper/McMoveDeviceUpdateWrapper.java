package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 
 * </p>
 * "mc_move_device"
 * @author PC001
 */
public class McMoveDeviceUpdateWrapper extends UpdateWrapper<McMoveDevice> {

    public static McMoveDeviceUpdateWrapper wrapper() {
        return new McMoveDeviceUpdateWrapper();
    }

    public McMoveDeviceUpdateWrapper() {
        super();
    }

    public McMoveDeviceUpdateWrapper(McMoveDevice entity) {
        super(entity);
    }

    /**
     * 
     */
    public McMoveDeviceUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 商户id
     */
    public McMoveDeviceUpdateWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 
     */
    public McMoveDeviceUpdateWrapper setUserPhoneId(String userPhoneId) {
         set("user_phone_id",userPhoneId);
        return this;
    }
    /**
     * 旧设备id
     */
    public McMoveDeviceUpdateWrapper setFromDeviceId(String fromDeviceId) {
         set("from_device_id",fromDeviceId);
        return this;
    }
    /**
     * 旧云手机ID
     */
    public McMoveDeviceUpdateWrapper setFromPhoneId(String fromPhoneId) {
         set("from_phone_id",fromPhoneId);
        return this;
    }
    /**
     * 新设备id
     */
    public McMoveDeviceUpdateWrapper setToDeviceId(String toDeviceId) {
         set("to_device_id",toDeviceId);
        return this;
    }
    /**
     * 新设备云手机ID
     */
    public McMoveDeviceUpdateWrapper setToPhoneId(String toPhoneId) {
         set("to_phone_id",toPhoneId);
        return this;
    }
    /**
     * 需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
     */
    public McMoveDeviceUpdateWrapper setIncludeFiles(String includeFiles) {
         set("include_files",includeFiles);
        return this;
    }
    /**
     * 不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。
     */
    public McMoveDeviceUpdateWrapper setExcludeFiles(String excludeFiles) {
         set("exclude_files",excludeFiles);
        return this;
    }
    /**
     * 导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。
     */
    public McMoveDeviceUpdateWrapper setBucketName(String bucketName) {
         set("bucket_name",bucketName);
        return this;
    }
    /**
     * 导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。
     */
    public McMoveDeviceUpdateWrapper setObjectPath(String objectPath) {
         set("object_path",objectPath);
        return this;
    }
    /**
     * 申请换机时间
     */
    public McMoveDeviceUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成
     */
    public McMoveDeviceUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 最后任务id
     */
    public McMoveDeviceUpdateWrapper setJobId(String jobId) {
         set("job_id",jobId);
        return this;
    }
    /**
     * 最后修改时间
     */
    public McMoveDeviceUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public McMoveDeviceUpdateWrapper setSpecCode(String specCode) {
         set("spec_code",specCode);
        return this;
    }
    /**
     * 重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）
     */
    public McMoveDeviceUpdateWrapper setReleaseUse(Boolean releaseUse) {
         set("release_use",releaseUse);
        return this;
    }
    /**
     * 是否迁移数据（false：不迁移，true：迁移）默认不迁移
     */
    public McMoveDeviceUpdateWrapper setDataMigration(Boolean dataMigration) {
         set("data_migration",dataMigration);
        return this;
    }
    /**
     * 
     */
    public McMoveDeviceUpdateWrapper setTaskId(String taskId) {
         set("task_id",taskId);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper idEq(Long id){
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
    public McMoveDeviceUpdateWrapper idNe(Long id){
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
    public McMoveDeviceUpdateWrapper idGt(Long id){
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
    public McMoveDeviceUpdateWrapper idGe(Long id){
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
    public McMoveDeviceUpdateWrapper idLt(Long id){
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
    public McMoveDeviceUpdateWrapper idLe(Long id){
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
    public McMoveDeviceUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public McMoveDeviceUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McMoveDeviceUpdateWrapper idLike(Long id){
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
    public McMoveDeviceUpdateWrapper idNotLike(Long id){
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
    public McMoveDeviceUpdateWrapper idLikeLeft(Long id){
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
    public McMoveDeviceUpdateWrapper idLikeRight(Long id){
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
    public McMoveDeviceUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper idIn(Collection<Long> value){
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
    public McMoveDeviceUpdateWrapper idIn(Long... values){
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
    public McMoveDeviceUpdateWrapper idNotIn(Collection<Long> value){
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
    public McMoveDeviceUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * 等于 = fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * 不等于 &lt;&gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 大于 &gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 大于等于 &gt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 小于 &lt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 小于等于 &lt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * NOT LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * LIKE '值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdLikeRight(Long fkMemberId){
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdEq(String userPhoneId){
        if(userPhoneId!=null){
            eq("user_phone_id",userPhoneId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdNe(String userPhoneId){
        if(userPhoneId!=null){
            ne("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdGt(String userPhoneId){
        if(userPhoneId!=null){
            gt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdGe(String userPhoneId){
        if(userPhoneId!=null){
            ge("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdLt(String userPhoneId){
        if(userPhoneId!=null){
            lt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdLe(String userPhoneId){
        if(userPhoneId!=null){
            le("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdBetween(String userPhoneIdStart,String userPhoneIdEnd){
        if(userPhoneIdStart!=null && userPhoneIdEnd!=null){
            between("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdNotBetween(String userPhoneIdStart,String userPhoneIdEnd){
        if(userPhoneIdStart!=null && userPhoneIdEnd!=null){
            notBetween("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdLike(String userPhoneId){
        if(userPhoneId!=null){
            like("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdNotLike(String userPhoneId){
        if(userPhoneId!=null){
            notLike("user_phone_id",userPhoneId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdLikeLeft(String userPhoneId){
        if(userPhoneId!=null){
            likeLeft("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdLikeRight(String userPhoneId){
        if(userPhoneId!=null){
            likeRight("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdIsNull(){
        isNull("user_phone_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdIsNotNull(){
        isNotNull("user_phone_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("user_phone_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("user_phone_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("user_phone_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper userPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_phone_id",values);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * 等于 = fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdEq(String fromDeviceId){
        if(fromDeviceId!=null){
            eq("from_device_id",fromDeviceId);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * 不等于 &lt;&gt; fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdNe(String fromDeviceId){
        if(fromDeviceId!=null){
            ne("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 大于 &gt; fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdGt(String fromDeviceId){
        if(fromDeviceId!=null){
            gt("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 大于等于 &gt;= fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdGe(String fromDeviceId){
        if(fromDeviceId!=null){
            ge("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 小于 &lt; fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdLt(String fromDeviceId){
        if(fromDeviceId!=null){
            lt("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 小于等于 &lt;= fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdLe(String fromDeviceId){
        if(fromDeviceId!=null){
            le("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * BETWEEN 值1 AND 值2
     * @param fromDeviceIdStart       值1
     * @param fromDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdBetween(String fromDeviceIdStart,String fromDeviceIdEnd){
        if(fromDeviceIdStart!=null && fromDeviceIdEnd!=null){
            between("from_device_id",fromDeviceIdStart,fromDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fromDeviceIdStart       值1
     * @param fromDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdNotBetween(String fromDeviceIdStart,String fromDeviceIdEnd){
        if(fromDeviceIdStart!=null && fromDeviceIdEnd!=null){
            notBetween("from_device_id",fromDeviceIdStart,fromDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>旧设备id</p>
     * LIKE '%值%' fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdLike(String fromDeviceId){
        if(fromDeviceId!=null){
            like("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * NOT LIKE '%值%' fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdNotLike(String fromDeviceId){
        if(fromDeviceId!=null){
            notLike("from_device_id",fromDeviceId);
        }
        return this;
     }


    /**
     * <p>旧设备id</p>
     * LIKE '%值' fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdLikeLeft(String fromDeviceId){
        if(fromDeviceId!=null){
            likeLeft("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * LIKE '值%' fromDeviceId
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdLikeRight(String fromDeviceId){
        if(fromDeviceId!=null){
            likeRight("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdIsNull(){
        isNull("from_device_id");
        return this;
    }

    /**
     * <p>旧设备id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdIsNotNull(){
        isNotNull("from_device_id");
        return this;
    }

    /**
     * <p>旧设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("from_device_id",value);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("from_device_id",values);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("from_device_id",value);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromDeviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("from_device_id",values);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * 等于 = fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdEq(String fromPhoneId){
        if(fromPhoneId!=null){
            eq("from_phone_id",fromPhoneId);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * 不等于 &lt;&gt; fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdNe(String fromPhoneId){
        if(fromPhoneId!=null){
            ne("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 大于 &gt; fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdGt(String fromPhoneId){
        if(fromPhoneId!=null){
            gt("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 大于等于 &gt;= fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdGe(String fromPhoneId){
        if(fromPhoneId!=null){
            ge("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 小于 &lt; fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdLt(String fromPhoneId){
        if(fromPhoneId!=null){
            lt("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 小于等于 &lt;= fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdLe(String fromPhoneId){
        if(fromPhoneId!=null){
            le("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * BETWEEN 值1 AND 值2
     * @param fromPhoneIdStart       值1
     * @param fromPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdBetween(String fromPhoneIdStart,String fromPhoneIdEnd){
        if(fromPhoneIdStart!=null && fromPhoneIdEnd!=null){
            between("from_phone_id",fromPhoneIdStart,fromPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fromPhoneIdStart       值1
     * @param fromPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdNotBetween(String fromPhoneIdStart,String fromPhoneIdEnd){
        if(fromPhoneIdStart!=null && fromPhoneIdEnd!=null){
            notBetween("from_phone_id",fromPhoneIdStart,fromPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p>旧云手机ID</p>
     * LIKE '%值%' fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdLike(String fromPhoneId){
        if(fromPhoneId!=null){
            like("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * NOT LIKE '%值%' fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdNotLike(String fromPhoneId){
        if(fromPhoneId!=null){
            notLike("from_phone_id",fromPhoneId);
        }
        return this;
     }


    /**
     * <p>旧云手机ID</p>
     * LIKE '%值' fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdLikeLeft(String fromPhoneId){
        if(fromPhoneId!=null){
            likeLeft("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * LIKE '值%' fromPhoneId
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdLikeRight(String fromPhoneId){
        if(fromPhoneId!=null){
            likeRight("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdIsNull(){
        isNull("from_phone_id");
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdIsNotNull(){
        isNotNull("from_phone_id");
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("from_phone_id",value);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("from_phone_id",values);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("from_phone_id",value);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper fromPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("from_phone_id",values);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * 等于 = toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdEq(String toDeviceId){
        if(toDeviceId!=null){
            eq("to_device_id",toDeviceId);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * 不等于 &lt;&gt; toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdNe(String toDeviceId){
        if(toDeviceId!=null){
            ne("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 大于 &gt; toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdGt(String toDeviceId){
        if(toDeviceId!=null){
            gt("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 大于等于 &gt;= toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdGe(String toDeviceId){
        if(toDeviceId!=null){
            ge("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 小于 &lt; toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdLt(String toDeviceId){
        if(toDeviceId!=null){
            lt("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 小于等于 &lt;= toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdLe(String toDeviceId){
        if(toDeviceId!=null){
            le("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * BETWEEN 值1 AND 值2
     * @param toDeviceIdStart       值1
     * @param toDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdBetween(String toDeviceIdStart,String toDeviceIdEnd){
        if(toDeviceIdStart!=null && toDeviceIdEnd!=null){
            between("to_device_id",toDeviceIdStart,toDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param toDeviceIdStart       值1
     * @param toDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdNotBetween(String toDeviceIdStart,String toDeviceIdEnd){
        if(toDeviceIdStart!=null && toDeviceIdEnd!=null){
            notBetween("to_device_id",toDeviceIdStart,toDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>新设备id</p>
     * LIKE '%值%' toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdLike(String toDeviceId){
        if(toDeviceId!=null){
            like("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * NOT LIKE '%值%' toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdNotLike(String toDeviceId){
        if(toDeviceId!=null){
            notLike("to_device_id",toDeviceId);
        }
        return this;
     }


    /**
     * <p>新设备id</p>
     * LIKE '%值' toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdLikeLeft(String toDeviceId){
        if(toDeviceId!=null){
            likeLeft("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * LIKE '值%' toDeviceId
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdLikeRight(String toDeviceId){
        if(toDeviceId!=null){
            likeRight("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdIsNull(){
        isNull("to_device_id");
        return this;
    }

    /**
     * <p>新设备id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdIsNotNull(){
        isNotNull("to_device_id");
        return this;
    }

    /**
     * <p>新设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("to_device_id",value);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("to_device_id",values);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("to_device_id",value);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper toDeviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("to_device_id",values);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * 等于 = toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdEq(String toPhoneId){
        if(toPhoneId!=null){
            eq("to_phone_id",toPhoneId);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * 不等于 &lt;&gt; toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdNe(String toPhoneId){
        if(toPhoneId!=null){
            ne("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 大于 &gt; toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdGt(String toPhoneId){
        if(toPhoneId!=null){
            gt("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 大于等于 &gt;= toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdGe(String toPhoneId){
        if(toPhoneId!=null){
            ge("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 小于 &lt; toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdLt(String toPhoneId){
        if(toPhoneId!=null){
            lt("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 小于等于 &lt;= toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdLe(String toPhoneId){
        if(toPhoneId!=null){
            le("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * BETWEEN 值1 AND 值2
     * @param toPhoneIdStart       值1
     * @param toPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdBetween(String toPhoneIdStart,String toPhoneIdEnd){
        if(toPhoneIdStart!=null && toPhoneIdEnd!=null){
            between("to_phone_id",toPhoneIdStart,toPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param toPhoneIdStart       值1
     * @param toPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdNotBetween(String toPhoneIdStart,String toPhoneIdEnd){
        if(toPhoneIdStart!=null && toPhoneIdEnd!=null){
            notBetween("to_phone_id",toPhoneIdStart,toPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p>新设备云手机ID</p>
     * LIKE '%值%' toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdLike(String toPhoneId){
        if(toPhoneId!=null){
            like("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * NOT LIKE '%值%' toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdNotLike(String toPhoneId){
        if(toPhoneId!=null){
            notLike("to_phone_id",toPhoneId);
        }
        return this;
     }


    /**
     * <p>新设备云手机ID</p>
     * LIKE '%值' toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdLikeLeft(String toPhoneId){
        if(toPhoneId!=null){
            likeLeft("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * LIKE '值%' toPhoneId
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdLikeRight(String toPhoneId){
        if(toPhoneId!=null){
            likeRight("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdIsNull(){
        isNull("to_phone_id");
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdIsNotNull(){
        isNotNull("to_phone_id");
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("to_phone_id",value);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("to_phone_id",values);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("to_phone_id",value);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper toPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("to_phone_id",values);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 等于 = includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesEq(String includeFiles){
        if(includeFiles!=null){
            eq("include_files",includeFiles);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 不等于 &lt;&gt; includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesNe(String includeFiles){
        if(includeFiles!=null){
            ne("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于 &gt; includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesGt(String includeFiles){
        if(includeFiles!=null){
            gt("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于等于 &gt;= includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesGe(String includeFiles){
        if(includeFiles!=null){
            ge("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于 &lt; includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesLt(String includeFiles){
        if(includeFiles!=null){
            lt("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于等于 &lt;= includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesLe(String includeFiles){
        if(includeFiles!=null){
            le("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * BETWEEN 值1 AND 值2
     * @param includeFilesStart       值1
     * @param includeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesBetween(String includeFilesStart,String includeFilesEnd){
        if(includeFilesStart!=null && includeFilesEnd!=null){
            between("include_files",includeFilesStart,includeFilesEnd);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param includeFilesStart       值1
     * @param includeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesNotBetween(String includeFilesStart,String includeFilesEnd){
        if(includeFilesStart!=null && includeFilesEnd!=null){
            notBetween("include_files",includeFilesStart,includeFilesEnd);
        }
        return this;
     }


    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值%' includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesLike(String includeFiles){
        if(includeFiles!=null){
            like("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT LIKE '%值%' includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesNotLike(String includeFiles){
        if(includeFiles!=null){
            notLike("include_files",includeFiles);
        }
        return this;
     }


    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值' includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesLikeLeft(String includeFiles){
        if(includeFiles!=null){
            likeLeft("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '值%' includeFiles
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesLikeRight(String includeFiles){
        if(includeFiles!=null){
            likeRight("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesIsNull(){
        isNull("include_files");
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesIsNotNull(){
        isNotNull("include_files");
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("include_files",value);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesIn(String... values){
        if(values!=null && values.length>0){
            in("include_files",values);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("include_files",value);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper includeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("include_files",values);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 等于 = excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesEq(String excludeFiles){
        if(excludeFiles!=null){
            eq("exclude_files",excludeFiles);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 不等于 &lt;&gt; excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesNe(String excludeFiles){
        if(excludeFiles!=null){
            ne("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 大于 &gt; excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesGt(String excludeFiles){
        if(excludeFiles!=null){
            gt("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 大于等于 &gt;= excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesGe(String excludeFiles){
        if(excludeFiles!=null){
            ge("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 小于 &lt; excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesLt(String excludeFiles){
        if(excludeFiles!=null){
            lt("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 小于等于 &lt;= excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesLe(String excludeFiles){
        if(excludeFiles!=null){
            le("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * BETWEEN 值1 AND 值2
     * @param excludeFilesStart       值1
     * @param excludeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesBetween(String excludeFilesStart,String excludeFilesEnd){
        if(excludeFilesStart!=null && excludeFilesEnd!=null){
            between("exclude_files",excludeFilesStart,excludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param excludeFilesStart       值1
     * @param excludeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesNotBetween(String excludeFilesStart,String excludeFilesEnd){
        if(excludeFilesStart!=null && excludeFilesEnd!=null){
            notBetween("exclude_files",excludeFilesStart,excludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '%值%' excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesLike(String excludeFiles){
        if(excludeFiles!=null){
            like("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT LIKE '%值%' excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesNotLike(String excludeFiles){
        if(excludeFiles!=null){
            notLike("exclude_files",excludeFiles);
        }
        return this;
     }


    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '%值' excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesLikeLeft(String excludeFiles){
        if(excludeFiles!=null){
            likeLeft("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '值%' excludeFiles
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesLikeRight(String excludeFiles){
        if(excludeFiles!=null){
            likeRight("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesIsNull(){
        isNull("exclude_files");
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesIsNotNull(){
        isNotNull("exclude_files");
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("exclude_files",value);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesIn(String... values){
        if(values!=null && values.length>0){
            in("exclude_files",values);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("exclude_files",value);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper excludeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("exclude_files",values);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 等于 = bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameEq(String bucketName){
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 不等于 &lt;&gt; bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameNe(String bucketName){
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 大于 &gt; bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameGt(String bucketName){
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 大于等于 &gt;= bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameGe(String bucketName){
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 小于 &lt; bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameLt(String bucketName){
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 小于等于 &lt;= bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameLe(String bucketName){
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            between("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '%值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameLike(String bucketName){
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT LIKE '%值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameNotLike(String bucketName){
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '%值' bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameLikeLeft(String bucketName){
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameLikeRight(String bucketName){
        if(bucketName!=null){
            likeRight("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameIn(String... values){
        if(values!=null && values.length>0){
            in("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 等于 = objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathEq(String objectPath){
        if(objectPath!=null){
            eq("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 不等于 &lt;&gt; objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathNe(String objectPath){
        if(objectPath!=null){
            ne("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于 &gt; objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathGt(String objectPath){
        if(objectPath!=null){
            gt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于等于 &gt;= objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathGe(String objectPath){
        if(objectPath!=null){
            ge("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于 &lt; objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathLt(String objectPath){
        if(objectPath!=null){
            lt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于等于 &lt;= objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathLe(String objectPath){
        if(objectPath!=null){
            le("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * BETWEEN 值1 AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            between("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值%' objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathLike(String objectPath){
        if(objectPath!=null){
            like("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT LIKE '%值%' objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathNotLike(String objectPath){
        if(objectPath!=null){
            notLike("object_path",objectPath);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值' objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathLikeLeft(String objectPath){
        if(objectPath!=null){
            likeLeft("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '值%' objectPath
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathLikeRight(String objectPath){
        if(objectPath!=null){
            likeRight("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("object_path",value);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathIn(String... values){
        if(values!=null && values.length>0){
            in("object_path",values);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("object_path",value);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper objectPathNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("object_path",values);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>申请换机时间</p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>申请换机时间</p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * 等于 = jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdEq(String jobId){
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * 不等于 &lt;&gt; jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdNe(String jobId){
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 大于 &gt; jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdGt(String jobId){
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 大于等于 &gt;= jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdGe(String jobId){
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 小于 &lt; jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdLt(String jobId){
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 小于等于 &lt;= jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdLe(String jobId){
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            between("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>最后任务id</p>
     * LIKE '%值%' jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdLike(String jobId){
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * NOT LIKE '%值%' jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdNotLike(String jobId){
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>最后任务id</p>
     * LIKE '%值' jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdLikeLeft(String jobId){
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * LIKE '值%' jobId
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdLikeRight(String jobId){
        if(jobId!=null){
            likeRight("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>最后任务id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>最后任务id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdIn(String... values){
        if(values!=null && values.length>0){
            in("job_id",values);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper jobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("job_id",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McMoveDeviceUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeEq(String specCode){
        if(specCode!=null){
            eq("spec_code",specCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeNe(String specCode){
        if(specCode!=null){
            ne("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeGt(String specCode){
        if(specCode!=null){
            gt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeGe(String specCode){
        if(specCode!=null){
            ge("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeLt(String specCode){
        if(specCode!=null){
            lt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeLe(String specCode){
        if(specCode!=null){
            le("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeBetween(String specCodeStart,String specCodeEnd){
        if(specCodeStart!=null && specCodeEnd!=null){
            between("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeNotBetween(String specCodeStart,String specCodeEnd){
        if(specCodeStart!=null && specCodeEnd!=null){
            notBetween("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeLike(String specCode){
        if(specCode!=null){
            like("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeNotLike(String specCode){
        if(specCode!=null){
            notLike("spec_code",specCode);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeLikeLeft(String specCode){
        if(specCode!=null){
            likeLeft("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' specCode
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeLikeRight(String specCode){
        if(specCode!=null){
            likeRight("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeIsNull(){
        isNull("spec_code");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeIsNotNull(){
        isNotNull("spec_code");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("spec_code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeIn(String... values){
        if(values!=null && values.length>0){
            in("spec_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("spec_code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper specCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("spec_code",values);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 等于 = releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseEq(Boolean releaseUse){
        if(releaseUse!=null){
            eq("release_use",releaseUse);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 不等于 &lt;&gt; releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseNe(Boolean releaseUse){
        if(releaseUse!=null){
            ne("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 大于 &gt; releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseGt(Boolean releaseUse){
        if(releaseUse!=null){
            gt("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 大于等于 &gt;= releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseGe(Boolean releaseUse){
        if(releaseUse!=null){
            ge("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 小于 &lt; releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseLt(Boolean releaseUse){
        if(releaseUse!=null){
            lt("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 小于等于 &lt;= releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseLe(Boolean releaseUse){
        if(releaseUse!=null){
            le("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * BETWEEN 值1 AND 值2
     * @param releaseUseStart       值1
     * @param releaseUseEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseBetween(Boolean releaseUseStart,Boolean releaseUseEnd){
        if(releaseUseStart!=null && releaseUseEnd!=null){
            between("release_use",releaseUseStart,releaseUseEnd);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param releaseUseStart       值1
     * @param releaseUseEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseNotBetween(Boolean releaseUseStart,Boolean releaseUseEnd){
        if(releaseUseStart!=null && releaseUseEnd!=null){
            notBetween("release_use",releaseUseStart,releaseUseEnd);
        }
        return this;
     }


    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '%值%' releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseLike(Boolean releaseUse){
        if(releaseUse!=null){
            like("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT LIKE '%值%' releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseNotLike(Boolean releaseUse){
        if(releaseUse!=null){
            notLike("release_use",releaseUse);
        }
        return this;
     }


    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '%值' releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseLikeLeft(Boolean releaseUse){
        if(releaseUse!=null){
            likeLeft("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '值%' releaseUse
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseLikeRight(Boolean releaseUse){
        if(releaseUse!=null){
            likeRight("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseIsNull(){
        isNull("release_use");
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseIsNotNull(){
        isNotNull("release_use");
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("release_use",value);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseIn(Boolean... values){
        if(values!=null && values.length>0){
            in("release_use",values);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("release_use",value);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper releaseUseNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("release_use",values);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 等于 = dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationEq(Boolean dataMigration){
        if(dataMigration!=null){
            eq("data_migration",dataMigration);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 不等于 &lt;&gt; dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationNe(Boolean dataMigration){
        if(dataMigration!=null){
            ne("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 大于 &gt; dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationGt(Boolean dataMigration){
        if(dataMigration!=null){
            gt("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 大于等于 &gt;= dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationGe(Boolean dataMigration){
        if(dataMigration!=null){
            ge("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 小于 &lt; dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationLt(Boolean dataMigration){
        if(dataMigration!=null){
            lt("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 小于等于 &lt;= dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationLe(Boolean dataMigration){
        if(dataMigration!=null){
            le("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * BETWEEN 值1 AND 值2
     * @param dataMigrationStart       值1
     * @param dataMigrationEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationBetween(Boolean dataMigrationStart,Boolean dataMigrationEnd){
        if(dataMigrationStart!=null && dataMigrationEnd!=null){
            between("data_migration",dataMigrationStart,dataMigrationEnd);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT BETWEEN 值1 AND 值2
     * @param dataMigrationStart       值1
     * @param dataMigrationEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationNotBetween(Boolean dataMigrationStart,Boolean dataMigrationEnd){
        if(dataMigrationStart!=null && dataMigrationEnd!=null){
            notBetween("data_migration",dataMigrationStart,dataMigrationEnd);
        }
        return this;
     }


    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '%值%' dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationLike(Boolean dataMigration){
        if(dataMigration!=null){
            like("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT LIKE '%值%' dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationNotLike(Boolean dataMigration){
        if(dataMigration!=null){
            notLike("data_migration",dataMigration);
        }
        return this;
     }


    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '%值' dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationLikeLeft(Boolean dataMigration){
        if(dataMigration!=null){
            likeLeft("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '值%' dataMigration
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationLikeRight(Boolean dataMigration){
        if(dataMigration!=null){
            likeRight("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationIsNull(){
        isNull("data_migration");
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationIsNotNull(){
        isNotNull("data_migration");
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("data_migration",value);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationIn(Boolean... values){
        if(values!=null && values.length>0){
            in("data_migration",values);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("data_migration",value);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper dataMigrationNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("data_migration",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdEq(String taskId){
        if(taskId!=null){
            eq("task_id",taskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdNe(String taskId){
        if(taskId!=null){
            ne("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdGt(String taskId){
        if(taskId!=null){
            gt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdGe(String taskId){
        if(taskId!=null){
            ge("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdLt(String taskId){
        if(taskId!=null){
            lt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdLe(String taskId){
        if(taskId!=null){
            le("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdBetween(String taskIdStart,String taskIdEnd){
        if(taskIdStart!=null && taskIdEnd!=null){
            between("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdNotBetween(String taskIdStart,String taskIdEnd){
        if(taskIdStart!=null && taskIdEnd!=null){
            notBetween("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdLike(String taskId){
        if(taskId!=null){
            like("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdNotLike(String taskId){
        if(taskId!=null){
            notLike("task_id",taskId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdLikeLeft(String taskId){
        if(taskId!=null){
            likeLeft("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' taskId
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdLikeRight(String taskId){
        if(taskId!=null){
            likeRight("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdIsNull(){
        isNull("task_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdIsNotNull(){
        isNotNull("task_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("task_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdIn(String... values){
        if(values!=null && values.length>0){
            in("task_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceUpdateWrapper taskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("task_id",values);
        }
        return this;
    }


}
