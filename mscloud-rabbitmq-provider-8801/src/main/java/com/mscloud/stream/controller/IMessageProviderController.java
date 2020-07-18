package com.mscloud.stream.controller;

import com.mscloud.stream.service.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/17
 */
@RestController
public class IMessageProviderController {
    @Autowired
    private MessageProvider messageProvider;

    @GetMapping("/imsgsend")
    public String messageSend() {
        return messageProvider.send();
    }
}
