package com.mscloud.provider.controller;

import com.mscloud.provider.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/12
 */
@RestController
@Slf4j
public class PaymentHystrixController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/hystrix/payment/get/ok/{id}")
    public String paymentGet_OK(@PathVariable("id") Long id) {
        return paymentHystrixService.paymentGet_OK(id);
    }

    @GetMapping("/hystrix/payment/get/to/{id}")
    public String paymentGet_timeout(@PathVariable("id") Long id) {
        return paymentHystrixService.paymentGet_timeOut(id);
    }

    @GetMapping("/hystrix/payment/circuit/{id}")
    public String paymentGet_CircuitBreaker(@PathVariable("id") Long id) {
        return paymentHystrixService.paymentCircuitBreaker(id);
    }
}
