package com.mscloud.consumer.controller;

import com.mscloud.payment.entities.CommonResult;
import com.mscloud.payment.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/7
 */
@RestController
@Slf4j
public class OrderController {

    private static final String REQ_URL = "http://MSCLOUD-PAYMENT-SERVICE";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        CommonResult result = restTemplate.getForObject(REQ_URL + "/payment/get/" + id, CommonResult.class);
        log.info("Consumer getPayment======="+result);
        return result;
    }

    @GetMapping("/consumer/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        return restTemplate.postForObject(REQ_URL+"/payment/create", payment, CommonResult.class);
    }
}
