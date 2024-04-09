package com.suqi.center.machine.biz.dto;


import java.io.Serializable;

public class QueryJobResult implements Serializable {


    protected String error_msg;

    protected String execute_msg;

    protected String job_id;

    protected String end_time;

    protected String begin_time;

    protected String error_code;

    protected String request_id;

    protected String phone_id;

    protected Integer status;

    public String getError_msg(){
        return this.error_msg;
    }

    public void setError_msg(String error_msg){
        this.error_msg=error_msg;
    }

    public String getExecute_msg(){
        return this.execute_msg;
    }

    public void setExecute_msg(String execute_msg){
        this.execute_msg=execute_msg;
    }

    public String getJob_id(){
        return this.job_id;
    }

    public void setJob_id(String job_id){
        this.job_id=job_id;
    }

    public String getEnd_time(){
        return this.end_time;
    }

    public void setEnd_time(String end_time){
        this.end_time=end_time;
    }

    public String getBegin_time(){
        return this.begin_time;
    }

    public void setBegin_time(String begin_time){
        this.begin_time=begin_time;
    }

    public String getError_code(){
        return this.error_code;
    }

    public void setError_code(String error_code){
        this.error_code=error_code;
    }

    public String getRequest_id(){
        return this.request_id;
    }

    public void setRequest_id(String request_id){
        this.request_id=request_id;
    }

    public String getPhone_id(){
        return this.phone_id;
    }

    public void setPhone_id(String phone_id){
        this.phone_id=phone_id;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setStatus(Integer status){
        this.status=status;
    }





    public String toString(){
        StringBuilder sb =new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append("{");
        sb.append("\"error_msg\":").append(error_msg!=null?error_msg:null).append(" , ");
        sb.append("\"execute_msg\":").append(execute_msg!=null?execute_msg:null).append(" , ");
        sb.append("\"job_id\":").append("\"").append(job_id!=null?job_id:"").append("\"").append(" , ");
        sb.append("\"end_time\":").append("\"").append(end_time!=null?end_time:"").append("\"").append(" , ");
        sb.append("\"begin_time\":").append("\"").append(begin_time!=null?begin_time:"").append("\"").append(" , ");
        sb.append("\"error_code\":").append(error_code!=null?error_code:null).append(" , ");
        sb.append("\"request_id\":").append("\"").append(request_id!=null?request_id:"").append("\"").append(" , ");
        sb.append("\"phone_id\":").append("\"").append(phone_id!=null?phone_id:"").append("\"").append(" , ");
        sb.append("\"status\":").append(status!=null?status:null).append(" }");
        return sb.toString();
    }

    public boolean ok() {
        return this.status != null && this.status == 2;
    }

    public boolean fail() {
        return this.status != null && this.status == -1;
    }


}