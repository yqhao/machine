package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.SysOtaRecord;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 
 * </p>
 * "sys_ota_record"
 * @author PC001
 */
public class SysOtaRecordQueryWrapper extends QueryWrapper<SysOtaRecord> {


    public static SysOtaRecordQueryWrapper wrapper() {
        return new SysOtaRecordQueryWrapper();
    }

    public SysOtaRecordQueryWrapper() {
        super();
    }

    public SysOtaRecordQueryWrapper(SysOtaRecord entity) {
        super(entity);
    }

    public SysOtaRecordQueryWrapper(SysOtaRecord entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public SysOtaRecordQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public SysOtaRecordQueryWrapper selectColumns(Consumer<SysOtaRecordSelect> consumer) {
        SysOtaRecordSelect select = new SysOtaRecordSelect();
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
    public SysOtaRecordQueryWrapper idEq(Long id){
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
    public SysOtaRecordQueryWrapper idNe(Long id){
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
    public SysOtaRecordQueryWrapper idGt(Long id){
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
    public SysOtaRecordQueryWrapper idGe(Long id){
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
    public SysOtaRecordQueryWrapper idLt(Long id){
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
    public SysOtaRecordQueryWrapper idLe(Long id){
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
    public SysOtaRecordQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public SysOtaRecordQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public SysOtaRecordQueryWrapper idLike(Long id){
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
    public SysOtaRecordQueryWrapper idNotLike(Long id){
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
    public SysOtaRecordQueryWrapper idLikeLeft(Long id){
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
    public SysOtaRecordQueryWrapper idLikeRight(Long id){
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
    public SysOtaRecordQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper idIn(Collection<Long> value){
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
    public SysOtaRecordQueryWrapper idIn(Long... values){
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
    public SysOtaRecordQueryWrapper idNotIn(Collection<Long> value){
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
    public SysOtaRecordQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdEq(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            eq("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdNe(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            ne("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdGt(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            gt("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdGe(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            ge("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdLt(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            lt("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdLe(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            le("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkSysOtaIdStart       值1
     * @param fkSysOtaIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdBetween(Long fkSysOtaIdStart,Long fkSysOtaIdEnd){
        if(fkSysOtaIdStart!=null && fkSysOtaIdEnd!=null){
            between("fk_sys_ota_id",fkSysOtaIdStart,fkSysOtaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkSysOtaIdStart       值1
     * @param fkSysOtaIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdNotBetween(Long fkSysOtaIdStart,Long fkSysOtaIdEnd){
        if(fkSysOtaIdStart!=null && fkSysOtaIdEnd!=null){
            notBetween("fk_sys_ota_id",fkSysOtaIdStart,fkSysOtaIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdLike(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            like("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdNotLike(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            notLike("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdLikeLeft(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            likeLeft("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdLikeRight(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            likeRight("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdIsNull(){
        isNull("fk_sys_ota_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdIsNotNull(){
        isNotNull("fk_sys_ota_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_ota_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_ota_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_ota_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_ota_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdEq(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            eq("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdNe(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            ne("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdGt(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            gt("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdGe(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            ge("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdLt(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            lt("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdLe(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            le("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkSysOtaObsIdStart       值1
     * @param fkSysOtaObsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdBetween(Long fkSysOtaObsIdStart,Long fkSysOtaObsIdEnd){
        if(fkSysOtaObsIdStart!=null && fkSysOtaObsIdEnd!=null){
            between("fk_sys_ota_obs_id",fkSysOtaObsIdStart,fkSysOtaObsIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkSysOtaObsIdStart       值1
     * @param fkSysOtaObsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdNotBetween(Long fkSysOtaObsIdStart,Long fkSysOtaObsIdEnd){
        if(fkSysOtaObsIdStart!=null && fkSysOtaObsIdEnd!=null){
            notBetween("fk_sys_ota_obs_id",fkSysOtaObsIdStart,fkSysOtaObsIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdLike(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            like("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdNotLike(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            notLike("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdLikeLeft(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            likeLeft("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdLikeRight(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            likeRight("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdIsNull(){
        isNull("fk_sys_ota_obs_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdIsNotNull(){
        isNotNull("fk_sys_ota_obs_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_ota_obs_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_ota_obs_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_ota_obs_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaObsIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_ota_obs_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        if(fkEmSocDevicesIdStart!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        if(fkEmSocDevicesIdStart!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeRight("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 等于 =
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 不等于 &lt;&gt;
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 大于 &gt;
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 大于等于 &gt;=
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 小于 &lt;
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 小于等于 &lt;=
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper typeBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '%值%'
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT LIKE '%值%'
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '%值'
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '值%'
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryWrapper typeLikeRight(Integer type){
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper typeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("type",value);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper typeIn(Integer... values){
        if(values!=null && values.length>0){
            in("type",values);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper typeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("type",value);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeIn(Date... values){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public SysOtaRecordQueryWrapper lastUpdateTimeNotIn(Date... values){
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
    public SysOtaRecordQueryWrapper versionIdEq(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdNe(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdGt(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdGe(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdLt(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdLe(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public SysOtaRecordQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public SysOtaRecordQueryWrapper versionIdLike(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdNotLike(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdLikeLeft(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdLikeRight(Long versionId){
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
    public SysOtaRecordQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper versionIdIn(Collection<Long> value){
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
    public SysOtaRecordQueryWrapper versionIdIn(Long... values){
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
    public SysOtaRecordQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public SysOtaRecordQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgEq(String executeMsg){
        if(executeMsg!=null){
            eq("execute_msg",executeMsg);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgNe(String executeMsg){
        if(executeMsg!=null){
            ne("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgGt(String executeMsg){
        if(executeMsg!=null){
            gt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgGe(String executeMsg){
        if(executeMsg!=null){
            ge("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgLt(String executeMsg){
        if(executeMsg!=null){
            lt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgLe(String executeMsg){
        if(executeMsg!=null){
            le("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
        if(executeMsgStart!=null && executeMsgEnd!=null){
            between("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
        if(executeMsgStart!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgLike(String executeMsg){
        if(executeMsg!=null){
            like("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgNotLike(String executeMsg){
        if(executeMsg!=null){
            notLike("execute_msg",executeMsg);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgLikeLeft(String executeMsg){
        if(executeMsg!=null){
            likeLeft("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgLikeRight(String executeMsg){
        if(executeMsg!=null){
            likeRight("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("execute_msg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgIn(String... values){
        if(values!=null && values.length>0){
            in("execute_msg",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("execute_msg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 等于 =
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeEq(Date taskStartTime){
        if(taskStartTime!=null){
            eq("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 不等于 &lt;&gt;
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeNe(Date taskStartTime){
        if(taskStartTime!=null){
            ne("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于 &gt;
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeGt(Date taskStartTime){
        if(taskStartTime!=null){
            gt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于等于 &gt;=
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeGe(Date taskStartTime){
        if(taskStartTime!=null){
            ge("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于 &lt;
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeLt(Date taskStartTime){
        if(taskStartTime!=null){
            lt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于等于 &lt;=
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeLe(Date taskStartTime){
        if(taskStartTime!=null){
            le("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        if(taskStartTimeStart!=null && taskStartTimeEnd!=null){
            between("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeNotBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        if(taskStartTimeStart!=null && taskStartTimeEnd!=null){
            notBetween("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值%'
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeLike(Date taskStartTime){
        if(taskStartTime!=null){
            like("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT LIKE '%值%'
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeNotLike(Date taskStartTime){
        if(taskStartTime!=null){
            notLike("task_start_time",taskStartTime);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值'
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeLikeLeft(Date taskStartTime){
        if(taskStartTime!=null){
            likeLeft("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * LIKE '值%'
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeLikeRight(Date taskStartTime){
        if(taskStartTime!=null){
            likeRight("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeIsNull(){
        isNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeIsNotNull(){
        isNotNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper taskStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * 等于 =
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdEq(String jobId){
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * 不等于 &lt;&gt;
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdNe(String jobId){
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 大于 &gt;
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdGt(String jobId){
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 大于等于 &gt;=
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdGe(String jobId){
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 小于 &lt;
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdLt(String jobId){
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 小于等于 &lt;=
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdLe(String jobId){
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            between("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>最后job_id</p>
     * LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdLike(String jobId){
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * NOT LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdNotLike(String jobId){
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>最后job_id</p>
     * LIKE '%值'
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdLikeLeft(String jobId){
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * LIKE '值%'
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdLikeRight(String jobId){
        if(jobId!=null){
            likeRight("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>最后job_id</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>最后job_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdIn(String... values){
        if(values!=null && values.length>0){
            in("job_id",values);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper jobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("job_id",values);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * 等于 =
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdEq(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            eq("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * 不等于 &lt;&gt;
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdNe(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            ne("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 大于 &gt;
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdGt(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            gt("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 大于等于 &gt;=
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdGe(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            ge("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 小于 &lt;
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdLt(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            lt("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 小于等于 &lt;=
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdLe(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            le("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * BETWEEN 值1 AND 值2
     * @param fkSysOtaPreinstalledAppsIdStart       值1
     * @param fkSysOtaPreinstalledAppsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdBetween(Long fkSysOtaPreinstalledAppsIdStart,Long fkSysOtaPreinstalledAppsIdEnd){
        if(fkSysOtaPreinstalledAppsIdStart!=null && fkSysOtaPreinstalledAppsIdEnd!=null){
            between("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsIdStart,fkSysOtaPreinstalledAppsIdEnd);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkSysOtaPreinstalledAppsIdStart       值1
     * @param fkSysOtaPreinstalledAppsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdNotBetween(Long fkSysOtaPreinstalledAppsIdStart,Long fkSysOtaPreinstalledAppsIdEnd){
        if(fkSysOtaPreinstalledAppsIdStart!=null && fkSysOtaPreinstalledAppsIdEnd!=null){
            notBetween("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsIdStart,fkSysOtaPreinstalledAppsIdEnd);
        }
        return this;
     }


    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '%值%'
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdLike(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            like("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT LIKE '%值%'
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdNotLike(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            notLike("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }


    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '%值'
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdLikeLeft(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            likeLeft("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '值%'
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdLikeRight(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            likeRight("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdIsNull(){
        isNull("fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdIsNotNull(){
        isNotNull("fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_ota_preinstalled_apps_id",value);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_ota_preinstalled_apps_id",values);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_ota_preinstalled_apps_id",value);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper fkSysOtaPreinstalledAppsIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_ota_preinstalled_apps_id",values);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * 等于 =
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeEq(Date startTime){
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * 不等于 &lt;&gt;
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeNe(Date startTime){
        if(startTime!=null){
            ne("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 大于 &gt;
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeGt(Date startTime){
        if(startTime!=null){
            gt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 大于等于 &gt;=
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeGe(Date startTime){
        if(startTime!=null){
            ge("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 小于 &lt;
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeLt(Date startTime){
        if(startTime!=null){
            lt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 小于等于 &lt;=
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeLe(Date startTime){
        if(startTime!=null){
            le("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            between("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeNotBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            notBetween("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }


    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeLike(Date startTime){
        if(startTime!=null){
            like("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeNotLike(Date startTime){
        if(startTime!=null){
            notLike("start_time",startTime);
        }
        return this;
     }


    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '%值'
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeLikeLeft(Date startTime){
        if(startTime!=null){
            likeLeft("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '值%'
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeLikeRight(Date startTime){
        if(startTime!=null){
            likeRight("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeIsNull(){
        isNull("start_time");
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeIsNotNull(){
        isNotNull("start_time");
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("start_time",value);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("start_time",values);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("start_time",value);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper startTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("start_time",values);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 等于 =
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateEq(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            eq("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 不等于 &lt;&gt;
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateNe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ne("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于 &gt;
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateGt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            gt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于等于 &gt;=
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateGe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ge("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于 &lt;
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateLt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            lt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于等于 &lt;=
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateLe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            le("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        if(waitOverStartDateStart!=null && waitOverStartDateEnd!=null){
            between("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateNotBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        if(waitOverStartDateStart!=null && waitOverStartDateEnd!=null){
            notBetween("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            like("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT LIKE '%值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateNotLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            notLike("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值'
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateLikeLeft(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeLeft("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateLikeRight(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeRight("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateIsNull(){
        isNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateIsNotNull(){
        isNotNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("wait_over_start_date",value);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateIn(Date... values){
        if(values!=null && values.length>0){
            in("wait_over_start_date",values);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("wait_over_start_date",value);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryWrapper waitOverStartDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("wait_over_start_date",values);
        }
        return this;
    }


}
