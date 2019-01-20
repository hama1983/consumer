package com.sevstars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevstars.remote.ProducerRemote;

@Service
public class ConsumerService {

    @Autowired
    private ProducerRemote producerRemote;

    public String consumer(){

        return producerRemote.producer();
    }


}
