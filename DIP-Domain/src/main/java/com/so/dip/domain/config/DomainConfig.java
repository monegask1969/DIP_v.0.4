/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.domain.config;

import com.so.dip.domain.UsersDAO;
import com.so.dip.domain.UsersDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import st.dog.dip.domain.Breeder.BreederDAO;
import st.dog.dip.domain.Breeder.BreederDAOImpl;
import st.dog.dip.domain.Contest.ContestDAO;
import st.dog.dip.domain.Contest.ContestDAOImpl;
import st.dog.dip.domain.Dog.DogDAO;
import st.dog.dip.domain.Dog.DogDAOImpl;
import st.dog.dip.domain.Dogshow.DogshowDAO;
import st.dog.dip.domain.Expert.ExpertDAO;
import st.dog.dip.domain.Expert.ExpertDAOImpl;
import st.dog.dip.domain.Owner.OwnerDAO;
import st.dog.dip.domain.Owner.OwnerDAOImpl;
import st.dog.dip.domain.Participant.ParticipantDAO;
import st.dog.dip.domain.Participant.ParticipantDAOImpl;
import st.dog.dip.domain.Ring.RingDAO;
import st.dog.dip.domain.Ring.RingDAOImpl;

/**
 *
 * @author stan
 */

@Configuration
@ComponentScan({"com.so.dip.domain",
        "st.dog.dip.domain",
        "st.dog.dip.domain.Breeder",
        "st.dog.dip.domain.Contest",
        "st.dog.dip.domain.Dog",
        "st.dog.dip.domain.Dogshow",
        "st.dog.dip.domain.Expert",
        "st.dog.dip.domain.Owner",
        "st.dog.dip.domain.Participant",
        "st.dog.dip.domain.Ring",
        "com.so.dip.domain.config"})
public class DomainConfig {
    
@Bean
    public DogDAO getDogDAO(){
        return new DogDAOImpl();
    }
    
    @Bean
    public BreederDAO getBreederDAO(){
        return new BreederDAOImpl();
    }
@Bean
    public DogshowDAO getDogShowDAO(){
        return new st.dog.dip.domain.Dogshow.DogShowDAOImpl();
    }
    
    @Bean
    public ContestDAO getContestDAO(){
        return new ContestDAOImpl();
    }
    
    @Bean
    public ExpertDAO getExpertDAO(){
        return new ExpertDAOImpl();
    }
    
    @Bean
    public OwnerDAO getOwnerDAO(){
        return new OwnerDAOImpl();
    }
    @Bean
    public ParticipantDAO getOParticipantDAO(){
        return new ParticipantDAOImpl();
    }
    
    @Bean
    public RingDAO getRingDAO(){
        return new RingDAOImpl();
    }
    
}
