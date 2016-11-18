/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.service.config;

import com.so.dip.service.UsersService;
import com.so.dip.service.UsersServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import st.dog.dip.service.Breeder.BreederService;
import st.dog.dip.service.Breeder.BreederServiceImpl;
import st.dog.dip.service.Contest.ContestService;
import st.dog.dip.service.Contest.ContestServiceImpl;
import st.dog.dip.service.Dog.DogService;
import st.dog.dip.service.Dog.DogServiceImpl;
import st.dog.dip.service.Expert.ExpertService;
import st.dog.dip.service.Expert.ExpertServiceImpl;
import st.dog.dip.service.Owner.OwnerService;
import st.dog.dip.service.Owner.OwnerServiceImpl;
import st.dog.dip.service.Participant.ParticipantService;
import st.dog.dip.service.Participant.ParticipantServiceImpl;
import st.dog.dip.service.Ring.RingService;
import st.dog.dip.service.Ring.RingServiceImpl;

/**
 *
 * @author stan
 */
@Configuration
@ComponentScan({
        "com.so.dip.domain",
        "com.so.dip.domain.config",
        "com.so.dip.service",
        "com.so.dip.service.config",
        "st.dog.dip.domain",
        "st.dog.dip.domain.Breeder",
        "st.dog.dip.domain.Contest",
        "st.dog.dip.domain.Dog",
        "st.dog.dip.domain.Dogshow",
        "st.dog.dip.domain.Expert",
        "st.dog.dip.domain.Owner",
        "st.dog.dip.domain.Participant",
        "st.dog.dip.domain.Ring",
        "st.dog.dip.service",
        "st.dog.dip.service.Breeder",
        "st.dog.dip.service.Contest",
        "st.dog.dip.service.Dog",
        "st.dog.dip.service.Dogshow",
        "st.dog.dip.service.Expert",
        "st.dog.dip.service.Owner",
        "st.dog.dip.service.Participant",
        "st.dog.dip.service.Ring",
        "st.dog.dip.service.config"
    })
public class ServiceConfig {
    
    
    @Bean
    public UsersService getUsersService(){
        return new UsersServiceImpl();
    }
   @Bean
    public DogService getDogService(){
        return new DogServiceImpl();
    }
    @Bean
    public st.dog.dip.service.Dogshow.DogShowService getDogShowService(){
        return new st.dog.dip.service.Dogshow.DogShowServiceImpl();
    }
    
    @Bean
    public BreederService getBreederService(){
        return new BreederServiceImpl();
    }
    @Bean
    public ContestService getContestService(){
        return new ContestServiceImpl();
    }
    @Bean
    public ExpertService getExpertService(){
        return new ExpertServiceImpl();
    }
    @Bean
    public OwnerService getOwnerService(){
        return new OwnerServiceImpl();
    }
    @Bean
    public ParticipantService getParticipantService(){
        return new ParticipantServiceImpl();
    }
    @Bean
    public RingService getRingService(){
        return new RingServiceImpl();
    }
    
}
