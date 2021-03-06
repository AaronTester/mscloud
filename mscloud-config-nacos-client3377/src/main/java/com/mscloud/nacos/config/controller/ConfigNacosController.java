package com.mscloud.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/19
 */
@RestController
@RefreshScope
public class ConfigNacosController {

    @Value("${config.info}")
    private String configinfo;

    @GetMapping("/configinfo")
    public String getConfiginfo() {
        return configinfo;
    }
}
