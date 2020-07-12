package com.mscloud.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/12
 */
@Component
public class PaymentClientFallback implements PaymentFeignHytrixService {
    @Override
    public String paymentGet_OK(Long id) {
        return "PaymentClientFallback paymentGet_OK   fallback   ***** ";
    }

    @Override
    public String paymentGet_timeout(Long id) {
        return "PaymentClientFallback paymentGet_timeout   fallback   ***** ";
    }
}
