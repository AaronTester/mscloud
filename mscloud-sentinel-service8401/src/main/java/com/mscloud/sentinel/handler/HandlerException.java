package com.mscloud.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.mscloud.payment.entities.CommonResult;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/23
 */
public class HandlerException {
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
