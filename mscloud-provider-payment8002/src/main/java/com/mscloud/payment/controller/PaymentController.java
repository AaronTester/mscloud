package com.mscloud.payment.controller;

import com.mscloud.payment.entities.CommonResult;
import com.mscloud.payment.entities.Payment;
import com.mscloud.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/7
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200, "创建订单成功,serverPort"+serverPort, result);
        }else {
            return new CommonResult(401, "创建订单失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("getPaymentById=========******"+payment);
        if (null != payment) {
            return new CommonResult(200, "查询订单成功,serverPort"+serverPort, payment);
        }else {
            return new CommonResult(401, "查询ID为"+id+"的订单失败", null);
        }
    }
}
