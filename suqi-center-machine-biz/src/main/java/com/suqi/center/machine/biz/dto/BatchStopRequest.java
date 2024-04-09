package com.suqi.center.machine.biz.dto;

import java.util.List;
import java.io.Serializable;

public class BatchStopRequest implements Serializable {

    protected List<String> phone_ids;

    public List<String> getPhone_ids() {
        return this.phone_ids;
    }

    public void setPhone_ids(List<String> phone_ids) {
        this.phone_ids = phone_ids;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append("{");
        sb.append("\"phone_ids\":").append(phone_ids != null ? phone_ids : null).append(" }");
        return sb.toString();
    }

}