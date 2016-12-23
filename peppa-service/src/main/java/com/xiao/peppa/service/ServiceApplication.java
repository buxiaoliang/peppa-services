package com.xiao.peppa.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by bu on 12/22/2016.
 */
@SpringBootApplication
@ComponentScan("com.xiao.peppa")
public class ServiceApplication {
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
