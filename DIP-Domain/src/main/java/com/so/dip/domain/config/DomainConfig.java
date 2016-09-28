/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.domain.config;

import com.so.dip.domain.DogShowDAO;
import com.so.dip.domain.DogShowDAOImpl;
import com.so.dip.domain.DogsDAO;
import com.so.dip.domain.DogsDAOImpl;
import com.so.dip.domain.UsersDAO;
import com.so.dip.domain.UsersDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author stan
 */

@Configuration
@ComponentScan("com.so.dip.domain")
public class DomainConfig {
    
    @Bean
    public UsersDAO getUsersDao(){
        return new UsersDAOImpl();
    }
    
    @Bean
    public DogsDAO getDogsDAO(){
        return new DogsDAOImpl();
    }
    @Bean
    public DogShowDAO getDogShowDAO(){
        return new DogShowDAOImpl();
    }
    
}
