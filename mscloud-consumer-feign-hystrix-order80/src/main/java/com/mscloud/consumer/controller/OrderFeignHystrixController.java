package com.mscloud.consumer.controller;

import com.mscloud.consumer.service.PaymentFeignHytrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
public class OrderFeignHystrixController {

    @Autowired
    private PaymentFeignHytrixService paymentFeignHytrixService;

    @GetMapping("/consumer/payment/get/ok/{id}")
    public String paymentGet_OK(@PathVariable("id") Long id) {
        return paymentFeignHytrixService.paymentGet_OK(id);
    }

    @GetMapping("/consumer/payment/get/to/{id}")
   /* @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
    })*/
   @HystrixCommand
    public String paymentGet_timeout(@PathVariable("id") Long id) {
        return paymentFeignHytrixService.paymentGet_timeout(id);
    }

    public String paymentTimeOutFallbackMethod(@PathVariable("id") Long id) {
        return "我是消费者80,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }
}
