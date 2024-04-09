package com.suqi.center.machine.dao.constants;

import com.suqi.core.shardingsphere.constants.DbBaseConstants;

/**
 * @version 1.0
 * @date 2023/3/2 12:02
 */
public class DBConstants extends DbBaseConstants{

    /**
     * 数据源分组 - fast_cloud 主库
     * 这里的tour是yml中的 spring.datasource.dynamic.datasource.master
     */
    public static final String MASTER = "master";

    /**
     * 数据源分组 - fast_cloud 从库
     * 这里的avalon是yml中的 spring.datasource.dynamic.datasource.slave
     */
    public static final String SLAVE = "slave";

    /**
     * 数据源分组 - fast_clou_pool 主库
     * 这里的tour是yml中的 spring.datasource.dynamic.datasource.master
     */
    public static final String POOL_MASTER = "poolMaster";

    /**
     * 数据源分组 - fast_cloud_pool 从库
     * 这里的avalon是yml中的 spring.datasource.dynamic.datasource.slave
     */
    public static final String POOL_SLAVE = "poolSlave";


    public static final String SHARDING = "sharding";


}
