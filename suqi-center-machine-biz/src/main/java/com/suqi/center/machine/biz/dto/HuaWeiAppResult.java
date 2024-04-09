package com.suqi.center.machine.biz.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zxx
 * @create 2020-08-13 15:40
 */
@Data
public class HuaWeiAppResult implements Serializable {


    /**
     * jobs : [{"job_id":"bd905d3751c34000a17ae23728d3d088","phone_id":"3c67a77741ae4c8b909ca8987e6378c0"}]
     * request_id : c05c1d057f34d8be56a4f1302b6dc5fd
     */

    private String request_id;
    private List<JobsBean> jobs;


    @Data
    public static class JobsBean {
        /**
         * job_id : bd905d3751c34000a17ae23728d3d088
         * phone_id : 3c67a77741ae4c8b909ca8987e6378c0
         */

        private String job_id;
        private String phone_id;
    }

    public boolean ok(){
        return jobs!= null && !jobs.isEmpty();
    }

    public String firstJobId(){
        return jobs!= null && !jobs.isEmpty()?jobs.get(0).getJob_id():null;
    }


}