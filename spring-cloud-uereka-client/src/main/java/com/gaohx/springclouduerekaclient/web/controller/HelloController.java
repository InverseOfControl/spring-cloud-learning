package com.gaohx.springclouduerekaclient.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("hello")
    public String index() {
        List<String> services = discoveryClient.getServices();
        for (String string : services) {
            List<ServiceInstance> list = discoveryClient.getInstances(string);
            list.forEach(instance -> System.out.println(instance.getHost() + " " + instance.getServiceId()));
        }
        return "Hello World";
    }

}
