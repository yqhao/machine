package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 云机id对照表
 * </p>
 * "pcp_device"
 * @author PC001
 */
public class PcpDeviceQueryEntityWrapper extends QueryWrapper<PcpDevice> {

    public static PcpDeviceQueryEntityWrapper wrapper(PcpDevice entity) {
        return new PcpDeviceQueryEntityWrapper(entity);
    }

    private PcpDevice entity;

    public PcpDeviceQueryEntityWrapper(PcpDevice entity) {
         this.entity=entity;
    }


    protected PcpDevice entity() {
        if(entity==null){
            throw new NullPointerException("PcpDevice is null");
        }
        return entity;
    }

    @Override
    public PcpDeviceQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public PcpDeviceQueryEntityWrapper selectColumns(Consumer<PcpDeviceSelect> consumer) {
        PcpDeviceSelect select = new PcpDeviceSelect();
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
    public PcpDeviceQueryEntityWrapper idEq(){
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
    public PcpDeviceQueryEntityWrapper idNe(){
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
    public PcpDeviceQueryEntityWrapper idGt(){
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
    public PcpDeviceQueryEntityWrapper idGe(){
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
    public PcpDeviceQueryEntityWrapper idLt(){
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
    public PcpDeviceQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper idBetween(Long idEnd){
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
    public PcpDeviceQueryEntityWrapper idNotBetween(Long idEnd){
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
    public PcpDeviceQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpDeviceQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public PcpDeviceQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper idLikeRight(){
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
    public PcpDeviceQueryEntityWrapper idEq(Long id){
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
    public PcpDeviceQueryEntityWrapper idNe(Long id){
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
    public PcpDeviceQueryEntityWrapper idGt(Long id){
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
    public PcpDeviceQueryEntityWrapper idGe(Long id){
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
    public PcpDeviceQueryEntityWrapper idLt(Long id){
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
    public PcpDeviceQueryEntityWrapper idLe(Long id){
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
    public PcpDeviceQueryEntityWrapper idLike(Long id){
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
    public PcpDeviceQueryEntityWrapper idNotLike(Long id){
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
    public PcpDeviceQueryEntityWrapper idLikeLeft(Long id){
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
    public PcpDeviceQueryEntityWrapper idLikeRight(Long id){
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
    public PcpDeviceQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper idIn(Collection<Long> value){
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
    public PcpDeviceQueryEntityWrapper idIn(Long... values){
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
    public PcpDeviceQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public PcpDeviceQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdEq(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt; entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND deviceIdEnd
     * @param deviceIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",entity().getDeviceId(),deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",entity().getDeviceId(),deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",entity().getDeviceId());
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值'  entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%'  entity().getDeviceId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


    /**
     * <p>华为项目id</p>
     * 等于 = entity().getProjectId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdEq(){
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
    public PcpDeviceQueryEntityWrapper projectIdNe(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            ne("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于 &gt; entity().getProjectId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdGt(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            gt("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于等于 &gt;= entity().getProjectId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdGe(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            ge("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于 &lt; entity().getProjectId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdLt(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            lt("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于等于 &lt;= entity().getProjectId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdLe(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            le("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * BETWEEN  entity().getProjectId() AND projectIdEnd
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdBetween(String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            between("project_id",entity().getProjectId(),projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT BETWEEN  entity().getProjectId() AND 值2
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdNotBetween(String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            notBetween("project_id",entity().getProjectId(),projectIdEnd);
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
    public PcpDeviceQueryEntityWrapper projectIdBetween(String projectIdStart,String projectIdEnd){
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
    public PcpDeviceQueryEntityWrapper projectIdNotBetween(String projectIdStart,String projectIdEnd){
        String projectId =entity().getProjectId();
        if(projectId!=null && projectIdEnd!=null){
            notBetween("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值%'  entity().getProjectId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdLike(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            like("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT LIKE '%值%'  entity().getProjectId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdNotLike(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            notLike("project_id",entity().getProjectId());
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值'  entity().getProjectId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdLikeLeft(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            likeLeft("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * LIKE '值%'  entity().getProjectId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdLikeRight(){
        String projectId =entity().getProjectId();
        if(projectId!=null){
            likeRight("project_id",entity().getProjectId());
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 等于 =
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdEq(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdNe(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdGt(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdGe(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdLt(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdLe(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdLike(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdNotLike(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdLikeLeft(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdLikeRight(String projectId){
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
    public PcpDeviceQueryEntityWrapper projectIdIsNull(){
        isNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdIsNotNull(){
        isNotNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper projectIdIn(Collection<String> value){
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
    public PcpDeviceQueryEntityWrapper projectIdIn(String... values){
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
    public PcpDeviceQueryEntityWrapper projectIdNotIn(Collection<String> value){
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
    public PcpDeviceQueryEntityWrapper projectIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("project_id",values);
        }
        return this;
    }


    /**
     * <p>华为云机id</p>
     * 等于 = entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdEq(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 不等于 &lt;&gt; entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdNe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ne("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于 &gt; entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdGt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            gt("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于等于 &gt;= entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdGe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ge("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于 &lt; entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            lt("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于等于 &lt;= entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            le("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * BETWEEN  entity().getPhoneId() AND phoneIdEnd
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",entity().getPhoneId(),phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdNotBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",entity().getPhoneId(),phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值%'  entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            like("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT LIKE '%值%'  entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdNotLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            notLike("phone_id",entity().getPhoneId());
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值'  entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLikeLeft(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeLeft("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * LIKE '值%'  entity().getPhoneId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLikeRight(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeRight("phone_id",entity().getPhoneId());
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 等于 =
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdEq(String phoneId){
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 不等于 &lt;&gt;
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdNe(String phoneId){
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于 &gt;
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdGt(String phoneId){
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于等于 &gt;=
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdGe(String phoneId){
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于 &lt;
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLt(String phoneId){
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于等于 &lt;=
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLe(String phoneId){
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLike(String phoneId){
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdNotLike(String phoneId){
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值'
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLikeLeft(String phoneId){
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * LIKE '值%'
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdLikeRight(String phoneId){
        if(phoneId!=null){
            likeRight("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_id",value);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("phone_id",values);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_id",value);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }


    /**
     * <p>mac地址</p>
     * 等于 = entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressEq(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            eq("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 不等于 &lt;&gt; entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressNe(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            ne("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于 &gt; entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressGt(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            gt("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于等于 &gt;= entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressGe(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            ge("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于 &lt; entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLt(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            lt("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于等于 &lt;= entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLe(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            le("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * BETWEEN  entity().getMacAddress() AND macAddressEnd
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressBetween(String macAddressEnd){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null && macAddressEnd!=null){
            between("macAddress",entity().getMacAddress(),macAddressEnd);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT BETWEEN  entity().getMacAddress() AND 值2
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressNotBetween(String macAddressEnd){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null && macAddressEnd!=null){
            notBetween("macAddress",entity().getMacAddress(),macAddressEnd);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * BETWEEN  entity().getMacAddress() AND 值2
     * @param macAddressStart       值1
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressBetween(String macAddressStart,String macAddressEnd){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null && macAddressEnd!=null){
            between("macAddress",macAddressStart,macAddressEnd);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT BETWEEN  entity().getMacAddress() AND 值2
     * @param macAddressStart       值1
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressNotBetween(String macAddressStart,String macAddressEnd){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null && macAddressEnd!=null){
            notBetween("macAddress",macAddressStart,macAddressEnd);
        }
        return this;
     }


    /**
     * <p>mac地址</p>
     * LIKE '%值%'  entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLike(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            like("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT LIKE '%值%'  entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressNotLike(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            notLike("macAddress",entity().getMacAddress());
        }
        return this;
     }


    /**
     * <p>mac地址</p>
     * LIKE '%值'  entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLikeLeft(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            likeLeft("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * LIKE '值%'  entity().getMacAddress()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLikeRight(){
        String macAddress =entity().getMacAddress();
        if(macAddress!=null){
            likeRight("macAddress",entity().getMacAddress());
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 等于 =
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressEq(String macAddress){
        if(macAddress!=null){
            eq("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 不等于 &lt;&gt;
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressNe(String macAddress){
        if(macAddress!=null){
            ne("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于 &gt;
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressGt(String macAddress){
        if(macAddress!=null){
            gt("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于等于 &gt;=
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressGe(String macAddress){
        if(macAddress!=null){
            ge("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于 &lt;
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLt(String macAddress){
        if(macAddress!=null){
            lt("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于等于 &lt;=
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLe(String macAddress){
        if(macAddress!=null){
            le("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * LIKE '%值%'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLike(String macAddress){
        if(macAddress!=null){
            like("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT LIKE '%值%'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressNotLike(String macAddress){
        if(macAddress!=null){
            notLike("macAddress",macAddress);
        }
        return this;
     }


    /**
     * <p>mac地址</p>
     * LIKE '%值'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLikeLeft(String macAddress){
        if(macAddress!=null){
            likeLeft("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * LIKE '值%'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressLikeRight(String macAddress){
        if(macAddress!=null){
            likeRight("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressIsNull(){
        isNull("macAddress");
        return this;
    }

    /**
     * <p>mac地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressIsNotNull(){
        isNotNull("macAddress");
        return this;
    }

    /**
     * <p>mac地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("macAddress",value);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressIn(String... values){
        if(values!=null && values.length>0){
            in("macAddress",values);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("macAddress",value);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper macAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("macAddress",values);
        }
        return this;
    }


    /**
     * <p>调用地址</p>
     * 等于 = entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlEq(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            eq("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 不等于 &lt;&gt; entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlNe(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            ne("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于 &gt; entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlGt(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            gt("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于等于 &gt;= entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlGe(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            ge("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于 &lt; entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLt(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            lt("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于等于 &lt;= entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLe(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            le("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * BETWEEN  entity().getEndpointPhonesUrl() AND endpointPhonesUrlEnd
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlBetween(String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            between("endpointPhonesUrl",entity().getEndpointPhonesUrl(),endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpointPhonesUrl",entity().getEndpointPhonesUrl(),endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            between("endpointPhonesUrl",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT BETWEEN  entity().getEndpointPhonesUrl() AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpointPhonesUrl",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }


    /**
     * <p>调用地址</p>
     * LIKE '%值%'  entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLike(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            like("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT LIKE '%值%'  entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlNotLike(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            notLike("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }


    /**
     * <p>调用地址</p>
     * LIKE '%值'  entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLikeLeft(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            likeLeft("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * LIKE '值%'  entity().getEndpointPhonesUrl()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLikeRight(){
        String endpointPhonesUrl =entity().getEndpointPhonesUrl();
        if(endpointPhonesUrl!=null){
            likeRight("endpointPhonesUrl",entity().getEndpointPhonesUrl());
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 等于 =
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlEq(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            eq("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 不等于 &lt;&gt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlNe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ne("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于 &gt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlGt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            gt("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于等于 &gt;=
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlGe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ge("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于 &lt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            lt("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于等于 &lt;=
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            le("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * LIKE '%值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            like("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT LIKE '%值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlNotLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            notLike("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }


    /**
     * <p>调用地址</p>
     * LIKE '%值'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLikeLeft(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeLeft("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * LIKE '值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlLikeRight(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeRight("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlIsNull(){
        isNull("endpointPhonesUrl");
        return this;
    }

    /**
     * <p>调用地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlIsNotNull(){
        isNotNull("endpointPhonesUrl");
        return this;
    }

    /**
     * <p>调用地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("endpointPhonesUrl",value);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlIn(String... values){
        if(values!=null && values.length>0){
            in("endpointPhonesUrl",values);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("endpointPhonesUrl",value);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper endpointPhonesUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpointPhonesUrl",values);
        }
        return this;
    }


    /**
     * <p>云服务器id</p>
     * 等于 = entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdEq(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            eq("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 不等于 &lt;&gt; entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdNe(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            ne("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于 &gt; entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdGt(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            gt("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于等于 &gt;= entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdGe(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            ge("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于 &lt; entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLt(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            lt("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于等于 &lt;= entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLe(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            le("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * BETWEEN  entity().getServerId() AND serverIdEnd
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdBetween(String serverIdEnd){
        String serverId =entity().getServerId();
        if(serverId!=null && serverIdEnd!=null){
            between("serverId",entity().getServerId(),serverIdEnd);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT BETWEEN  entity().getServerId() AND 值2
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdNotBetween(String serverIdEnd){
        String serverId =entity().getServerId();
        if(serverId!=null && serverIdEnd!=null){
            notBetween("serverId",entity().getServerId(),serverIdEnd);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * BETWEEN  entity().getServerId() AND 值2
     * @param serverIdStart       值1
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdBetween(String serverIdStart,String serverIdEnd){
        String serverId =entity().getServerId();
        if(serverId!=null && serverIdEnd!=null){
            between("serverId",serverIdStart,serverIdEnd);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT BETWEEN  entity().getServerId() AND 值2
     * @param serverIdStart       值1
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdNotBetween(String serverIdStart,String serverIdEnd){
        String serverId =entity().getServerId();
        if(serverId!=null && serverIdEnd!=null){
            notBetween("serverId",serverIdStart,serverIdEnd);
        }
        return this;
     }


    /**
     * <p>云服务器id</p>
     * LIKE '%值%'  entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLike(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            like("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT LIKE '%值%'  entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdNotLike(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            notLike("serverId",entity().getServerId());
        }
        return this;
     }


    /**
     * <p>云服务器id</p>
     * LIKE '%值'  entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLikeLeft(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            likeLeft("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * LIKE '值%'  entity().getServerId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLikeRight(){
        String serverId =entity().getServerId();
        if(serverId!=null){
            likeRight("serverId",entity().getServerId());
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 等于 =
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdEq(String serverId){
        if(serverId!=null){
            eq("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 不等于 &lt;&gt;
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdNe(String serverId){
        if(serverId!=null){
            ne("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于 &gt;
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdGt(String serverId){
        if(serverId!=null){
            gt("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于等于 &gt;=
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdGe(String serverId){
        if(serverId!=null){
            ge("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于 &lt;
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLt(String serverId){
        if(serverId!=null){
            lt("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于等于 &lt;=
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLe(String serverId){
        if(serverId!=null){
            le("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * LIKE '%值%'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLike(String serverId){
        if(serverId!=null){
            like("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT LIKE '%值%'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdNotLike(String serverId){
        if(serverId!=null){
            notLike("serverId",serverId);
        }
        return this;
     }


    /**
     * <p>云服务器id</p>
     * LIKE '%值'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLikeLeft(String serverId){
        if(serverId!=null){
            likeLeft("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * LIKE '值%'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdLikeRight(String serverId){
        if(serverId!=null){
            likeRight("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdIsNull(){
        isNull("serverId");
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdIsNotNull(){
        isNotNull("serverId");
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("serverId",value);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdIn(String... values){
        if(values!=null && values.length>0){
            in("serverId",values);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("serverId",value);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper serverIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("serverId",values);
        }
        return this;
    }


    /**
     * <p>镜像id</p>
     * 等于 = entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdEq(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            eq("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt; entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdNe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ne("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt; entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdGt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            gt("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;= entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdGe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ge("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt; entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            lt("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;= entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            le("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN  entity().getImageId() AND imageIdEnd
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("imageId",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdNotBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("imageId",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("imageId",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("imageId",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            like("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdNotLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            notLike("imageId",entity().getImageId());
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值'  entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLikeLeft(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeLeft("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%'  entity().getImageId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLikeRight(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeRight("imageId",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt;
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt;
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;=
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt;
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;=
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("imageId",imageId);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdLikeRight(String imageId){
        if(imageId!=null){
            likeRight("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdIsNull(){
        isNull("imageId");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdIsNotNull(){
        isNotNull("imageId");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("imageId",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdIn(String... values){
        if(values!=null && values.length>0){
            in("imageId",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("imageId",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imageId",values);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeEq(){
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
    public PcpDeviceQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",entity().getCreateTime(),createTimeEnd);
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
    public PcpDeviceQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpDeviceQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpDeviceQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeEq(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeNe(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeGt(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeGe(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeLt(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeLe(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeLike(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public PcpDeviceQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public PcpDeviceQueryEntityWrapper createTimeIn(Date... values){
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
    public PcpDeviceQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public PcpDeviceQueryEntityWrapper createTimeNotIn(Date... values){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeEq(){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public PcpDeviceQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
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
    public PcpDeviceQueryEntityWrapper versionIdEq(){
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
    public PcpDeviceQueryEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND versionIdEnd
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",entity().getVersionId(),versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",entity().getVersionId(),versionIdEnd);
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
    public PcpDeviceQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public PcpDeviceQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",entity().getVersionId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getVersionId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getVersionId()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdEq(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdNe(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdGt(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdGe(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdLt(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdLe(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdLike(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public PcpDeviceQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public PcpDeviceQueryEntityWrapper versionIdIn(Long... values){
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
    public PcpDeviceQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public PcpDeviceQueryEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 等于 = entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameEq(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            eq("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 不等于 &lt;&gt; entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameNe(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            ne("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于 &gt; entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameGt(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            gt("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于等于 &gt;= entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameGe(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            ge("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于 &lt; entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLt(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            lt("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于等于 &lt;= entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLe(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            le("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * BETWEEN  entity().getPhoneModelName() AND phoneModelNameEnd
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameBetween(String phoneModelNameEnd){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null && phoneModelNameEnd!=null){
            between("phone_model_name",entity().getPhoneModelName(),phoneModelNameEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT BETWEEN  entity().getPhoneModelName() AND 值2
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameNotBetween(String phoneModelNameEnd){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null && phoneModelNameEnd!=null){
            notBetween("phone_model_name",entity().getPhoneModelName(),phoneModelNameEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * BETWEEN  entity().getPhoneModelName() AND 值2
     * @param phoneModelNameStart       值1
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameBetween(String phoneModelNameStart,String phoneModelNameEnd){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null && phoneModelNameEnd!=null){
            between("phone_model_name",phoneModelNameStart,phoneModelNameEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT BETWEEN  entity().getPhoneModelName() AND 值2
     * @param phoneModelNameStart       值1
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameNotBetween(String phoneModelNameStart,String phoneModelNameEnd){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null && phoneModelNameEnd!=null){
            notBetween("phone_model_name",phoneModelNameStart,phoneModelNameEnd);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值%'  entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLike(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            like("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT LIKE '%值%'  entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameNotLike(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            notLike("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值'  entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLikeLeft(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            likeLeft("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '值%'  entity().getPhoneModelName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLikeRight(){
        String phoneModelName =entity().getPhoneModelName();
        if(phoneModelName!=null){
            likeRight("phone_model_name",entity().getPhoneModelName());
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 等于 =
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameEq(String phoneModelName){
        if(phoneModelName!=null){
            eq("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 不等于 &lt;&gt;
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameNe(String phoneModelName){
        if(phoneModelName!=null){
            ne("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于 &gt;
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameGt(String phoneModelName){
        if(phoneModelName!=null){
            gt("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于等于 &gt;=
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameGe(String phoneModelName){
        if(phoneModelName!=null){
            ge("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于 &lt;
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLt(String phoneModelName){
        if(phoneModelName!=null){
            lt("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于等于 &lt;=
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLe(String phoneModelName){
        if(phoneModelName!=null){
            le("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值%'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLike(String phoneModelName){
        if(phoneModelName!=null){
            like("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT LIKE '%值%'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameNotLike(String phoneModelName){
        if(phoneModelName!=null){
            notLike("phone_model_name",phoneModelName);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLikeLeft(String phoneModelName){
        if(phoneModelName!=null){
            likeLeft("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '值%'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameLikeRight(String phoneModelName){
        if(phoneModelName!=null){
            likeRight("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameIsNull(){
        isNull("phone_model_name");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameIsNotNull(){
        isNotNull("phone_model_name");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_model_name",value);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameIn(String... values){
        if(values!=null && values.length>0){
            in("phone_model_name",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_model_name",value);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneModelNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_model_name",values);
        }
        return this;
    }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 等于 = entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameEq(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            eq("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 不等于 &lt;&gt; entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameNe(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            ne("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于 &gt; entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameGt(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            gt("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于等于 &gt;= entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameGe(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            ge("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于 &lt; entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLt(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            lt("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于等于 &lt;= entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLe(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            le("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * BETWEEN  entity().getPhoneName() AND phoneNameEnd
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameBetween(String phoneNameEnd){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null && phoneNameEnd!=null){
            between("phone_name",entity().getPhoneName(),phoneNameEnd);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT BETWEEN  entity().getPhoneName() AND 值2
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameNotBetween(String phoneNameEnd){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null && phoneNameEnd!=null){
            notBetween("phone_name",entity().getPhoneName(),phoneNameEnd);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * BETWEEN  entity().getPhoneName() AND 值2
     * @param phoneNameStart       值1
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameBetween(String phoneNameStart,String phoneNameEnd){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null && phoneNameEnd!=null){
            between("phone_name",phoneNameStart,phoneNameEnd);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT BETWEEN  entity().getPhoneName() AND 值2
     * @param phoneNameStart       值1
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameNotBetween(String phoneNameStart,String phoneNameEnd){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null && phoneNameEnd!=null){
            notBetween("phone_name",phoneNameStart,phoneNameEnd);
        }
        return this;
     }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值%'  entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLike(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            like("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT LIKE '%值%'  entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameNotLike(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            notLike("phone_name",entity().getPhoneName());
        }
        return this;
     }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值'  entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLikeLeft(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            likeLeft("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '值%'  entity().getPhoneName()
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLikeRight(){
        String phoneName =entity().getPhoneName();
        if(phoneName!=null){
            likeRight("phone_name",entity().getPhoneName());
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 等于 =
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameEq(String phoneName){
        if(phoneName!=null){
            eq("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 不等于 &lt;&gt;
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameNe(String phoneName){
        if(phoneName!=null){
            ne("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于 &gt;
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameGt(String phoneName){
        if(phoneName!=null){
            gt("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于等于 &gt;=
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameGe(String phoneName){
        if(phoneName!=null){
            ge("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于 &lt;
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLt(String phoneName){
        if(phoneName!=null){
            lt("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于等于 &lt;=
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLe(String phoneName){
        if(phoneName!=null){
            le("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值%'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLike(String phoneName){
        if(phoneName!=null){
            like("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT LIKE '%值%'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameNotLike(String phoneName){
        if(phoneName!=null){
            notLike("phone_name",phoneName);
        }
        return this;
     }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLikeLeft(String phoneName){
        if(phoneName!=null){
            likeLeft("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '值%'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameLikeRight(String phoneName){
        if(phoneName!=null){
            likeRight("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameIsNull(){
        isNull("phone_name");
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameIsNotNull(){
        isNotNull("phone_name");
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_name",value);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameIn(String... values){
        if(values!=null && values.length>0){
            in("phone_name",values);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_name",value);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryEntityWrapper phoneNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_name",values);
        }
        return this;
    }



}
