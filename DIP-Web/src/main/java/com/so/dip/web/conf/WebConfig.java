/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.web.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author stan
 */
@Configuration
@EnableWebMvc
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
        "st.dog.dip.service.config",
        "com.so.dip.domain",
        "com.so.dip.domain.config",
        "com.so.dip.service",
        "com.so.dip.service.config",
        "com.so.dip.web.config",
        "com.so.dip.web",
        "com.so.dip.rest_v_0"
    })
@Import({ AppSecurityConfig.class })
public class WebConfig {
 
@Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    
    @Bean(name = "userDetailsService")
    public UserDetailsService userDetailsService(){
        return new AuthenticationManager();
    }
    @Bean(name = "dogDetailsService")
    public UserDetailsService dogsDetailsService(){
        return new AuthenticationManager();
    }
}
