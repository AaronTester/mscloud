package com.mscloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentProvider9004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentProvider9004.class, args);
    }
}
