package com.vevor.summer.producer.impl;

import com.vevor.summer.service.DemoService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @Description:
 * @Author: xyw
 * @CreateDt: 2019-10-14
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
