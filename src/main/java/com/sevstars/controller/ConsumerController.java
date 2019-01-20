package com.sevstars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sevstars.service.ConsumerService;

/**
 * 消费者
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String getProducer(){

        return consumerService.consumer();
    }
    
    
}
