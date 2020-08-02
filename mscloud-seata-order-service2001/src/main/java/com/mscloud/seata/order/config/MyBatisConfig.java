package com.mscloud.seata.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther zzyy
 * @create 2019-12-11 16:57
 */
@Configuration
@MapperScan({"com.mscloud.seata.order.dao"})
public class MyBatisConfig {
}
