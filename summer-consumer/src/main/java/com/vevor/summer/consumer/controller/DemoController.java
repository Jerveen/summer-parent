package com.vevor.summer.consumer.controller;

import com.vevor.summer.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试Controller
 * @Author: xyw
 * @CreateDt: 2019-10-14
 */
@RestController
public class DemoController {

    @Reference
    private DemoService demoService;

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
