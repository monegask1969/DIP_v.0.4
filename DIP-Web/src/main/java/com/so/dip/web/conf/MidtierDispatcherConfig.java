/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.web.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author moneg
 */

    @Configuration
@ComponentScan({
        "com.so.dip.domain",
        "com.so.dip.domain.config",
        "com.so.dip.service",
        "com.so.dip.service.config",
        "com.so.dip.web.config",
        "com.so.dip.web",
        "com.so.dip.rest_v_0"
})
@EnableWebMvc
public class MidtierDispatcherConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/layout/*/**")    //где находятся
            .addResourceLocations("/layout/")
        ;
    }
}
