package com.suqi.center.machine.biz.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zxx
 * @create 2020-08-13 11:53
 */
@Data
public class HuaWeiBatchRestartRequest implements Serializable {

    /**
     * phones : [{"phone_id":"a7f3a1c5258347d6b6f1def79e11f2bc","property":"{\"phone_num\":\"13666666666\",\"imsi\":\"460021624617113\",\"iccid\":\"42947a38410b137c\",\"wifi_name\":\"test_wifi\"}"},{"phone_id":"1678567b8bab40f93711234cb80d0764","property":"{\"phone_num\":\"13666666666\",\"imsi\":\"460021624617113\",\"iccid\":\"42947a38410b137c\",\"wifi_name\":\"test_wifi\"}"}]
     * image_id : 1564567b8bab40f34711234cb80d8574
     */

    private String image_id;
    private List<PhonesBean> phones;

    @Data
    public static class PhonesBean {
        /**
         * phone_id : a7f3a1c5258347d6b6f1def79e11f2bc
         * property : {"phone_num":"13666666666","imsi":"460021624617113","iccid":"42947a38410b137c","wifi_name":"test_wifi"}
         */

        private String phone_id;
        private String property;

    }

}