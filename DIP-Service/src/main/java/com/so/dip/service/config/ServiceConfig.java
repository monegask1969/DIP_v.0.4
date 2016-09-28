/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.service.config;

import com.so.dip.service.DogShowService;
import com.so.dip.service.DogShowServiceImpl;
import com.so.dip.service.DogsService;
import com.so.dip.service.DogsServiceImpl;
import com.so.dip.service.UsersService;
import com.so.dip.service.UsersServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author stan
 */
@Configuration
@ComponentScan({
        "com.so.dip.domain",
        "com.so.dip.domain.config",
        "com.so.dip.service",
        "com.so.dip.service.config"
    })
public class ServiceConfig {
    
    
    @Bean
    public UsersService getUsersService(){
        return new UsersServiceImpl();
    }
    @Bean
    public DogsService getDogsService(){
        return new DogsServiceImpl();
    }
    @Bean
    public DogShowService getDogShowService(){
        return new DogShowServiceImpl();
    }
    
}
