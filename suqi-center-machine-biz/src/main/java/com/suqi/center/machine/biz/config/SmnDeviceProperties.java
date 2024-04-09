package com.suqi.center.machine.biz.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "smn.device.notify")
public class SmnDeviceProperties {

    private String switchActive = "";
    private List<String> deviceList = new ArrayList<>();
}
