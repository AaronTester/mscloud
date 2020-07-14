package com.mscloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/14
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigserverMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigserverMain3344.class, args);
    }
}
