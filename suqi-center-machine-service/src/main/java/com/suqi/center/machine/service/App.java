package com.suqi.center.machine.service;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RefreshScope
@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages ={"com.suqi.center"})
@ComponentScan(basePackages = {
        "com.suqi",
        "com.fast.fsyun.tencent.service"
})
// 该注解需要标记到mapper接口类
@MapperScan({"com.suqi.center.machine.dao.mapper","com.suqi.center.machine.dao.viz.mapper"})
@Slf4j
public class App {


    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(App.class, args);
        Environment env = application.getEnvironment();
        log.info("\n----------------------------------------------------------\n\t" +
                        "应用 '{}' 运行成功! 访问连接:\n\t" +
                        "Swagger文档: \t\thttp://{}:{}{}{}/doc.html\n\t" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"),
                env.getProperty("server.servlet.context-path", ""),
                env.getProperty("spring.mvc.servlet.path", "")
        );
    }

}
