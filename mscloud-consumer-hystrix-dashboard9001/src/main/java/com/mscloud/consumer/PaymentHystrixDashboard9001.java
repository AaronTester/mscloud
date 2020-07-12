package com.mscloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/12
 */
@SpringBootApplication
@EnableHystrixDashboard
public class PaymentHystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixDashboard9001.class, args);
    }
}
