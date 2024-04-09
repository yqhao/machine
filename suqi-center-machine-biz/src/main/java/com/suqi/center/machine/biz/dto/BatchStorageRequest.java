package com.suqi.center.machine.biz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatchStorageRequest implements Serializable {

    protected List<Storage_info> storage_infos;

    public List<Storage_info> getStorage_infos() {
        return this.storage_infos;
    }

    public void setStorage_infos(List<Storage_info> storage_infos) {
        this.storage_infos = storage_infos;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder

    public static class Storage_info implements Serializable {

        protected String phone_id;

        protected List<String> include_files;

        protected List<String> exclude_files;

        protected String bucket_name;

        protected String object_path;

        public String getPhone_id() {
            return this.phone_id;
        }

        public void setPhone_id(String phone_id) {
            this.phone_id = phone_id;
        }

        public List<String> getInclude_files() {
            return this.include_files;
        }

        public void setInclude_files(List<String> include_files) {
            this.include_files = include_files;
        }

        public List<String> getExclude_files() {
            return this.exclude_files;
        }

        public void setExclude_files(List<String> exclude_files) {
            this.exclude_files = exclude_files;
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
            sb.append("\"include_files\":").append(include_files != null ? include_files : null).append(" , ");
            sb.append("\"exclude_files\":").append(exclude_files != null ? exclude_files : null).append(" , ");
            sb.append("\"bucket_name\":").append("\"").append(bucket_name != null ? bucket_name : "").append("\"").append(" , ");
            sb.append("\"object_path\":").append("\"").append(object_path != null ? object_path : "").append("\"").append(" }");
            return sb.toString();
        }

    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append("{");
        sb.append("\"storage_infos\":").append(storage_infos != null ? storage_infos : null).append(" }");
        return sb.toString();
    }

}