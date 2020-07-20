package com.mscloud.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerNacosMain83 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerNacosMain83.class, args);
    }
}
