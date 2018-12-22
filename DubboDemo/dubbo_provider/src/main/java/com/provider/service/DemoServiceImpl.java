package com.provider.service;

import com.api.service.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "hello "+name;
    }
}
