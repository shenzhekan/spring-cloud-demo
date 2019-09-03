package com.shenzk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestEurekaService {

    @Autowired
    private RestTemplate restTemplate;

    private String eurekaServer = "http://EUREKA-CLIENT";

    @RequestMapping("/testService")
    public void test(){
        String msg = restTemplate.getForObject(eurekaServer+"/test", String.class);
        System.out.println(msg);
    }

}
