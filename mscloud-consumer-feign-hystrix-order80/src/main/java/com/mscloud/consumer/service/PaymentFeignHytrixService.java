package com.mscloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/12
 */
@Component
@FeignClient(value = "MSCLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentClientFallback.class)
public interface PaymentFeignHytrixService {

    @GetMapping("/hystrix/payment/get/ok/{id}")
    public String paymentGet_OK(@PathVariable("id") Long id);

    @GetMapping("/hystrix/payment/get/to/{id}")
    public String  paymentGet_timeout(@PathVariable("id") Long id);
}
