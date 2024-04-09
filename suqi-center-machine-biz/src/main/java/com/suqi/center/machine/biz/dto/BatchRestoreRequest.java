package com.suqi.center.machine.biz.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatchRestoreRequest implements Serializable {

    protected List<Restore_info> restore_infos;

    public List<Restore_info> getRestore_infos() {
        return this.restore_infos;
    }

    public void setRestore_infos(List<Restore_info> restore_infos) {
        this.restore_infos = restore_infos;
    }


    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Restore_info implements Serializable {

        protected String phone_id;

        protected String bucket_name;

        protected String object_path;

        public String getPhone_id() {
            return this.phone_id;
        }

        public void setPhone_id(String phone_id) {
            this.phone_id = phone_id;
        }

        public String getBucket_name() {
            return this.bucket_name;
        }

        public void setBucket_name(String bucket_name) {
            this.bucket_name = bucket_name;
        }

        public String getObject_path() {
            return this.object_path;
        }

        public void setObject_path(String object_path) {
            this.object_path = object_path;
        }


        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName()).append("{");
            sb.append("\"phone_id\":").append("\"").append(phone_id != null ? phone_id : "").append("\"").append(" , ");
            sb.append("\"bucket_name\":").append("\"").append(bucket_name != null ? bucket_name : "").append("\"").append(" , ");
            sb.append("\"object_path\":").append("\"").append(object_path != null ? object_path : "").append("\"").append(" }");
            return sb.toString();
        }

    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append("{");
        sb.append("\"restore_infos\":").append(restore_infos != null ? restore_infos : null).append(" }");
        return sb.toString();
    }

}