package com.scanasksolve.backendbyspringboot.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class Weather {

    @Value("${api_weather}")
    private String weatherApi;

    @PostConstruct
    void init() {
        System.out.println("==weather init==");
    }

    void requestWeather(){
        
    }
}
