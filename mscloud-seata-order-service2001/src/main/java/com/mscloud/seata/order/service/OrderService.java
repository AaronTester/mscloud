package com.mscloud.seata.order.service;

import com.mscloud.seata.order.domain.Order;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/8/2
 */
public interface OrderService {
    void create(Order order);
}
